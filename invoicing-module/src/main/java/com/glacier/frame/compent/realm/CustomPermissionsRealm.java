/**
 * @author xichao.dong   
 * @email 406592176@qq.com
 * @date 2014-8-15 上午8:50:38 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) : 2014-8-15 上午8:50:38  xichao.dong 
 * @Review (审核人) ：xichao.dong 
 */
package com.glacier.frame.compent.realm;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;


import com.glacier.basic.util.RandomGUID;
import com.glacier.frame.dao.system.AuthorityMapper;
import com.glacier.frame.dao.system.LoginLogMapper;
import com.glacier.frame.dao.system.RoleMapper;
import com.glacier.frame.dao.system.UserMapper;
import com.glacier.frame.entity.system.Authority;
import com.glacier.frame.entity.system.LoginLog;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.system.UserExample;
import com.glacier.frame.service.system.UserService;
import com.glacier.security.util.Encodes;

/**
 * 
 * @ClassName: CustomPermissionsRealm
 * @Description: TODO(管理员进行自定义执行认证和授权的类)
 * @author xichao.dong  
 * @email 406592176@qq.com
 * @date 2014-8-15 上午11:19:33
 */
public class CustomPermissionsRealm extends AuthorizingRealm {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private AuthorityMapper authorityMapper;
    
    @Autowired
    private LoginLogMapper loginLogMapper;

    public CustomPermissionsRealm() {
        setName("CustomPermissionsRealm");
    }

    /*
     * (non-Javadoc) <p>Title: doGetAuthorizationInfo</p> <p>Description: 授权</p>
     * <p>当缓存中没有用户的授权信息的时候会从该方法中加载，缓存到文件中</p>
     * 
     * @param principals
     * 
     * @return
     * 
     * @see
     * org.apache.shiro.realm.AuthorizingRealm#doGetAuthorizationInfo(org.apache
     * .shiro.subject.PrincipalCollection)
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User principalUser = (User) pricipalSubject.getPrincipal();// 获取通过认证用户
        List<Authority> authorityList = authorityMapper.selectByUserId(principalUser.getUserId());// 获取用户的权限集合(用户和用户组的角色权限)
        if (null != authorityList && authorityList.size() > 0) {
            SimpleAuthorizationInfo authInfo = new SimpleAuthorizationInfo();// 创建返回权限对象
            for (Authority authority : authorityList) {
                if (null != authority && StringUtils.isNotBlank(authority.getActions())) {
                    String[] actionString = authority.getActions().split(",");
                    for (String action : actionString) {
                        // shiro权限字符串为：“当前资源英文名称:操作名英文名称”
                        // 对action进行分割，避免权限范围对其造成的影响 
                        String[] authStr = action.split(":");
                        authInfo.addStringPermission(authority.getMenuEnName() + ":" + authStr[0]);// 设置权限操作(设置Permission)
                    }
                }
            }
            return authInfo;
        }
        return null;
    }

    /*
     * (non-Javadoc) <p>Title: doGetAuthenticationInfo</p> <p>Description:
     * 认证回调函数,登录时调用.</p>
     * 
     * @param authtoken
     * 
     * @return
     * 
     * @throws AuthenticationException
     * 
     * @see
     * org.apache.shiro.realm.AuthenticatingRealm#doGetAuthenticationInfo(org
     * .apache.shiro.authc.AuthenticationToken)
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
        CaptchaUsernamePasswordToken token = (CaptchaUsernamePasswordToken) authcToken;
        String username = token.getUsername();
        if (null != username && !"".equals(username)) {
            UserExample userExample = new UserExample();
            userExample.createCriteria().andUsernameEqualTo(username);
            User principalUser = userMapper.selectByExample(userExample).get(0);
            if (null != principalUser) {
                // 用户状态为启用或隐藏让其通过认证
                byte[] salt = Encodes.decodeHex(principalUser.getSalt());
                AuthenticationInfo info = new SimpleAuthenticationInfo(principalUser, principalUser.getPassword(), ByteSource.Util.bytes(salt), getName());// 将用户的所有信息作为认证对象返回
                clearCache(info.getPrincipals());// 认证成功后清除之前的缓存
                updatePrincipalUserInfo(token, principalUser);// 更新用户登录信息
                return info;
            } else {
                throw new DisabledAccountException();
            }
        }
        return null;
    }

    /**
     * @param token
     * @param principalUser
     * @Title: updatePrincipalUserInfo
     * @Description: TODO(更新用户登录信息)
     * @param
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws 备注
     *             <p>
     *             已检查测试:Green
     *             <p>
     */
    private void updatePrincipalUserInfo(CaptchaUsernamePasswordToken token, User principalUser) {
            User lastPrincipalUser = new User();
            lastPrincipalUser.setUserId(principalUser.getUserId());
            lastPrincipalUser.setLastLoginIpAddress(token.getHost());// 设定最后登录时间
            lastPrincipalUser.setLastLoginTime(new Date());
            lastPrincipalUser.setLoginCount(principalUser.getLoginCount() + 1);
            userMapper.updateByPrimaryKeySelective(lastPrincipalUser);//更新用户信息
            LoginLog loginLog = new LoginLog();
            loginLog.setLoginlogId(RandomGUID.getRandomGUID());
            loginLog.setLoginIp(token.getHost());
            loginLog.setLoginTime(new Date());
            loginLog.setLoginUser(principalUser.getUserCnName());
            loginLog.setUserId(principalUser.getUserId());
            loginLogMapper.insert(loginLog);//插入登录日志
    }

    /**
     * 更新用户授权信息缓存.
     */
    public void clearCachedAuthorizationInfo(String principal) {
        SimplePrincipalCollection principals = new SimplePrincipalCollection(principal, getName());
        clearCachedAuthorizationInfo(principals);
    }

    /**
     * 清除所有用户授权信息缓存.
     */
    public void clearAllCachedAuthorizationInfo() {
        Cache<Object, AuthorizationInfo> cache = getAuthorizationCache();
        if (cache != null) {
            for (Object key : cache.keys()) {
                cache.remove(key);
            }
        }
    }

    /**
     * 设定Password校验的Hash算法与迭代次数.
     */
    @PostConstruct
    public void initCredentialsMatcher() {
        HashedCredentialsMatcher matcher = new HashedCredentialsMatcher(UserService.HASH_ALGORITHM);
        matcher.setHashIterations(UserService.HASH_INTERATIONS);
        setCredentialsMatcher(matcher);
    }
}