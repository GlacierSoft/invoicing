/**
 * @author xichao.dong   
 * @email 406592176@qq.com
 * @date 2014-8-15 上午8:50:38 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) : 2014-8-15 上午8:50:38  xichao.dong 
 * @Review (审核人) ：xichao.dong 
 *//*
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

import com.glacier.frame.dao.carrier.CarrierMemberMapper;
import com.glacier.frame.dao.carrier.CarrierMemberTokenMapper;
import com.glacier.frame.dao.carrierlogin.CarrierloginAuthorityMapper;
import com.glacier.frame.dao.carrierlogin.CarrierloginLoginlogMapper;
import com.glacier.frame.dao.carrierlogin.CarrierloginRoleMapper;
import com.glacier.frame.entity.carrier.CarrierMember;
import com.glacier.frame.entity.carrier.CarrierMemberToken;
import com.glacier.frame.entity.carrier.CarrierMemberTokenExample;
import com.glacier.frame.entity.carrierlogin.CarrierloginAuthority;
import com.glacier.frame.service.carrier.CarrierMemberService;
import com.glacier.security.util.Encodes;

*//**
 * @ClassName: CustomPermissionsRealm
 * @Description: TODO(管理员进行自定义执行认证和授权的类)
 * @author xichao.dong  
 * @email 406592176@qq.com
 * @date 2014-8-15 上午11:19:33
 *//*
public class CarrierPermissionsRealm extends AuthorizingRealm {

    @Autowired
    private CarrierloginRoleMapper carrierloginRoleMapper;

    @Autowired
    private CarrierloginAuthorityMapper carrierloginAuthorityMapper;
    
    @Autowired
    private CarrierloginLoginlogMapper carrierloginLoginlogMapper;
    
    @Autowired
    private CarrierMemberMapper carrierMemberMapper;
    
    @Autowired
    private CarrierMemberTokenMapper carrierMemberTokenMapper;

    public CarrierPermissionsRealm() {
        setName("CarrierPermissionsRealm");
    }

    
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
     
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        CarrierMember principalCarrierloginUser = (CarrierMember) pricipalSubject.getPrincipal();// 获取通过认证用户
        List<CarrierloginAuthority> carrierloginAuthorityList = carrierloginAuthorityMapper.selectByCarrierloginUserId(principalCarrierloginUser.getCarrierMemberId());// 获取用户的权限集合(用户和用户组的角色权限)
        if (null != carrierloginAuthorityList && carrierloginAuthorityList.size() > 0) {
            SimpleAuthorizationInfo authInfo = new SimpleAuthorizationInfo();// 创建返回权限对象
            for (CarrierloginAuthority carrierloginAuthority : carrierloginAuthorityList) {
                if (null != carrierloginAuthority && StringUtils.isNotBlank(carrierloginAuthority.getActions())) {
                    String[] actionString = carrierloginAuthority.getActions().split(",");
                    for (String action : actionString) {
                        // shiro权限字符串为：“当前资源英文名称:操作名英文名称”
                        // 对action进行分割，避免权限范围对其造成的影响 
                        String[] authStr = action.split(":");
                        authInfo.addStringPermission(carrierloginAuthority.getMenuEnName() + ":" + authStr[0]);// 设置权限操作(设置Permission)
                    }
                }
            }
            return authInfo;
        }
        return null;
    }

    
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
     
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
        CaptchaUsernamePasswordToken token = (CaptchaUsernamePasswordToken) authcToken;
        String  carrierMemberName = token.getUsername();
        if (null != carrierMemberName && !"".equals(carrierMemberName)) {
            CarrierMemberTokenExample carrierMemberTokenExample = new CarrierMemberTokenExample();
            carrierMemberTokenExample.createCriteria().andMemberNameEqualTo(carrierMemberName);
            CarrierMemberToken principalCarrierMemberToken = carrierMemberTokenMapper.selectByExample(carrierMemberTokenExample).get(0);
            if (null != principalCarrierMemberToken) {
                // 用户状态为启用或隐藏让其通过认证
                byte[] salt = Encodes.decodeHex(principalCarrierMemberToken.getSalt());
                CarrierMember carrierMember = carrierMemberMapper.selectByPrimaryKey(principalCarrierMemberToken.getCarrierMemberId());
                AuthenticationInfo info = new SimpleAuthenticationInfo(carrierMember, principalCarrierMemberToken.getPassword(), ByteSource.Util.bytes(salt), getName());// 将用户的所有信息作为认证对象返回
                clearCache(info.getPrincipals());// 认证成功后清除之前的缓存
                updatePrincipalCarrierMemberInfo(token, carrierMember);// 更新用户登录信息
                return info;
            } else {
                throw new DisabledAccountException();
            }
        }
        return null;
    }
    
    *//**
     * @param token
     * @param principalCarrierloginUser
     * @Title: updatePrincipalCarrierloginUserInfo
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
     *//*
    private void updatePrincipalCarrierMemberInfo(CaptchaUsernamePasswordToken token, CarrierMember principalCarrierMember) {
            CarrierMember lastPrincipalCarrierMember = new CarrierMember();
            lastPrincipalCarrierMember.setCarrierMemberId(principalCarrierMember.getCarrierMemberId());
            lastPrincipalCarrierMember.setLastLoginIpAddress(token.getHost());// 设定最后登录时间
            lastPrincipalCarrierMember.setLastLoginTime(new Date());
            lastPrincipalCarrierMember.setLoginCount(principalCarrierMember.getLoginCount() + 1);
            carrierMemberMapper.updateByPrimaryKeySelective(lastPrincipalCarrierMember);//更新用户信息
//            CarrierloginLoginlog carrierloginLoginlog = new CarrierloginLoginlog();
//            carrierloginLoginlog.setLoginlogId(RandomGUID.getRandomGUID());
//            carrierloginLoginlog.setLoginIp(token.getHost());
//            carrierloginLoginlog.setLoginTime(new Date());
//            carrierloginLoginlog.setLoginUser(principalCarrierMember.getMemberName());
//            carrierloginLoginlog.setUserId(principalCarrierMember.getCarrierMemberId());
    }

    *//**
     * 更新用户授权信息缓存.
     *//*
    public void clearCachedAuthorizationInfo(String principal) {
        SimplePrincipalCollection principals = new SimplePrincipalCollection(principal, getName());
        clearCachedAuthorizationInfo(principals);
    }

    *//**
     * 清除所有用户授权信息缓存.
     *//*
    public void clearAllCachedAuthorizationInfo() {
        Cache<Object, AuthorizationInfo> cache = getAuthorizationCache();
        if (cache != null) {
            for (Object key : cache.keys()) {
                cache.remove(key);
            }
        }
    }

    *//**
     * 设定Password校验的Hash算法与迭代次数.
     *//*
    @PostConstruct
    public void initCredentialsMatcher() {
        HashedCredentialsMatcher matcher = new HashedCredentialsMatcher(CarrierMemberService.HASH_ALGORITHM);
        matcher.setHashIterations(CarrierMemberService.HASH_INTERATIONS);
        setCredentialsMatcher(matcher);
    }
}*/