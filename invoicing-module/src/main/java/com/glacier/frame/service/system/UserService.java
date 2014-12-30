/**
 * @Title: UserService.java 
 * @Package com.glacier.frame.service.system 
 * @author songjundong   
 * @email 985776597@qq.com
 * @date 2014-8-18 下午2:51:30 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-8-18
				修改人：songjundong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：songjundong
 * 
 */
package com.glacier.frame.service.system;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.glacier.basic.util.RandomGUID;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.dao.system.LoginLogMapper;
import com.glacier.frame.dao.system.RoleMapper;
import com.glacier.frame.dao.system.UserMapper;
import com.glacier.frame.dao.system.UserRoleMapper;
import com.glacier.frame.dto.query.system.UserQueryDTO;
import com.glacier.frame.entity.common.util.CommonBuiltin;
import com.glacier.frame.entity.system.LoginLogExample;
import com.glacier.frame.entity.system.RoleExample;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.system.UserExample;
import com.glacier.frame.entity.system.UserExample.Criteria;
import com.glacier.frame.entity.system.UserRoleExample;
import com.glacier.frame.util.MethodLog;
import com.glacier.security.util.Digests;
import com.glacier.security.util.Encodes;

/**
 * @ClassName: UserService
 * @Description: TODO(管理员业务实现)
 * @author songjundong
 * @email 985776597@qq.com
 * @date 2014-8-18 下午2:51:30
 */
@Service
@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
public class UserService {

    @Autowired
    private UserMapper userMapper;
    
    @Autowired
	private RoleMapper roleMapper;
    
    @Autowired
    private	LoginLogMapper loginLogMapper;
    
    @Autowired
    private UserRoleMapper userRoleMapper;
     

    /**
     * 加密方式
     */
    public static final String HASH_ALGORITHM = "SHA-1";

    /**
     * 计算次数
     */
    public static final int HASH_INTERATIONS = 1024;

    /**
     * 盐值长度
     */
    public static final int SALT_SIZE = 8;
 
    /**
     * @Title: entryptPassword  
     * @Description: TODO(设定盐值和设定安全的密码，生成随机的salt并经过1024次 sha-1 hash)  
     * @param @param user    设定文件  
     * @return void    返回类型  
     * @throws
     */
    private void entryptPassword(User user) {
        byte[] salt = Digests.generateSalt(SALT_SIZE);
        user.setSalt(Encodes.encodeHex(salt));
        byte[] hashPassword = Digests.sha1(user.getPassword().getBytes(), salt, HASH_INTERATIONS);
        user.setPassword(Encodes.encodeHex(hashPassword));
    }
   
    /** 
     * @Title: FineUser  
     * @Description: TODO(获取当前用户名)  
     * @param @return    设定文件  
     * @return Object    返回类型  
     * @throws
     */ 
    public Object FineUser(){
    	Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
    	return pricipalUser;
    }
    
    /**
     * @Title: modifyPsd 
     * @Description: TODO(修改用户密码方法) 
     * @param  @param oldPassword
     * @param  @param newPassword
     * @param  @return
     * @throws 
     * 备注<p>已检查测试:Green<p>
     */
    @Transactional(readOnly = false)
    public Object modifyPsd(String oldPassword, String newPassword) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        User principalUser = (User) SecurityUtils.getSubject().getPrincipal();// 获取通过认证用户
        principalUser = userMapper.selectByPrimaryKey(principalUser.getUserId());// 获取通过认证用户最新信息，防止更新出错
        byte[] salt = Encodes.decodeHex(principalUser.getSalt());// 对盐值进行解密
        byte[] hashPassword = Digests.sha1(oldPassword.getBytes(), salt, HASH_INTERATIONS);// 对通过输入的密码进行重新加密
        if (Encodes.encodeHex(hashPassword).equals(principalUser.getPassword())) {// 比较用户输入的密码和原密码是否一致
            User modifyUser = new User();
            modifyUser.setUserId(principalUser.getUserId());
            modifyUser.setPassword(newPassword);
            this.entryptPassword(modifyUser);
            int count = userMapper.updateByPrimaryKeySelective(modifyUser);
            if (count == 1) {
                returnResult.setMsg("用户密码已修改");
                returnResult.setSuccess(true);
            } else {
                returnResult.setMsg("发生未知错误，用户密码修改失败");
            }

        } else {
            returnResult.setMsg("原用户密码错误，请重新修改");
        }
        return returnResult;
    }

    /**
     * @Title: getUser
     * @Description: TODO(通过主键userId查询管理员)
     * @param @param userId
     * @param @return设定文件
     * @return Object 返回类型
     * @throws
     */
    public Object getUser(String userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    /**
     * @Title: listAsGrid
     * @Description: TODO(分页浏览管理员列表)
     * @param @param pager
     * @param @return设定文件
     * @return Object 返回类型
     * @throws
     */
    public Object listAsGrid(UserQueryDTO userQueryDTO, JqPager pager) {
        JqGridReturn returnResulte = new JqGridReturn();
        UserExample userExample = new UserExample();

        Criteria queryCriteria = userExample.createCriteria();
        userQueryDTO.setQueryCondition(queryCriteria);
        
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
            userExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
            userExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getOrder()) && StringUtils.isNotBlank(pager.getSort())) {// 设置排序信息
            userExample.setOrderByClause(pager.getOrderBy("temp_user_"));
        }
        List<User> users = userMapper.selectByExample(userExample);
        int total = userMapper.countByExample(userExample);
        returnResulte.setRows(users);
        returnResulte.setTotal(total);
        return returnResulte;
    }

    /**
     * @Title: addUser
     * @Description: TODO(增加管理员)
     * @param @param user
     * @param @return
     * @throws Exception 
     * @throws 备注
     * <p>
     * 已检查测试:Green
     * <p>
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "UserList_add")
    public Object addUser(User user) throws Exception {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        UserExample userExample = new UserExample();
        int count = 0;
        // 防止管理员名称重复
        userExample.createCriteria().andUsernameEqualTo(user.getUsername());
        count = userMapper.countByExample(userExample);// 查找相同管理员名称数量
        if (count > 0) {
            returnResult.setMsg("管理员名称重复");
            return returnResult;
        }
        // 初始化管理员信息
        user.setUserId(RandomGUID.getRandomGUID());
        user.setPassword(user.getUsername());
        this.entryptPassword(user);// 设置加密后的密码以及盐值
        user.setBuiltin(CommonBuiltin.custom);// 新增管理员类型为自定义
        //构建时间字符串
        Calendar cal = Calendar.getInstance();  
        int year = cal.get(Calendar.YEAR);//获取年份  
        int month=cal.get(Calendar.MONTH)+1;//获取月份   
        int day=cal.get(Calendar.DATE);//获取日   
        //int hour=cal.get(Calendar.HOUR);//小时  
        @SuppressWarnings("deprecation")
		int hour=new Date().getHours();
        System.out.println(hour);
        int minute=cal.get(Calendar.MINUTE);//分              
        int second=cal.get(Calendar.SECOND);//秒 
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strDate=year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second;
        Date dates=sdf.parse(strDate);
        user.setCreateTime(dates);
        //------------------------------------------------
        user.setCreater(pricipalUser.getUserId());
        user.setLoginCount(0);
        count = userMapper.insert(user);
        if (count == 1) {
            returnResult.setMsg("[" + user.getUsername() + "]" + "管理员信息已保存");
            returnResult.setSuccess(true);
        } else {
            returnResult.setMsg("发生未知错误，管理员信息保存失败");
        }
        return returnResult;
    }

    /**
     * @Title: editUser
     * @Description: TODO(修改管理员信息)
     * @param @param user
     * @param @return设定文件
     * @return Object 返回类型
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "UserList_edit")
    public Object editUser(User user) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        UserExample userExample = new UserExample();
        // 防止管理员名称重复
        userExample.createCriteria().andUsernameEqualTo(user.getUsername()).andUserIdNotEqualTo(user.getUserId());
        int count = 0;
        User originalUser = userMapper.selectByPrimaryKey(user.getUserId());// 获取原用户相关信息
        // 管理员类型用户只有所属创建者才能进行修改
        if (originalUser.getBuiltin() == CommonBuiltin.admin) {
            if (!pricipalUser.getUserId().equals(originalUser.getCreater())) {
                returnResult.setMsg("管理员类型用户只有所属创建者才能对其进行修改");
                return returnResult;
            }
        }
        count = userMapper.countByExample(userExample);// 查找相同管理员名称数量
        if (count > 0) {
            returnResult.setMsg("管理员名称重复");
            return returnResult;
        }
        count = userMapper.updateByPrimaryKeySelective(user);
        if (count == 1) {
            returnResult.setMsg("[" + user.getUsername() + "]" + "管理员信息已修改");
            returnResult.setSuccess(true);
        } else {
            returnResult.setMsg("发生未知错误，管理员信息修改失败");
        }
        return returnResult;
    }

    /**
     * @Title: delUser
     * @Description: TODO(删除管理员信息)
     * @param @param userId
     * @param @return设定文件
     * @return Object 返回类型
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "UserList_del")
	public Object delUser(List<String> userIds, List<String> usernames) {
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		// 定义删除成功数据行数量
		int rightNumber = 0;
		// 定义返回结果
		String result_one = "";
		//名称记录
		String result_name="";
		// 定义是否显示提示
		boolean isFlag = true;
		//数据行长度判断
		if (userIds.size() > 0) {
			//匹配删除信息
			for (int i = 0; i < userIds.size(); i++) {
                // 相关联表t_role
				RoleExample roleExample = new RoleExample();
				roleExample.createCriteria().andCreaterEqualTo(userIds.get(i));
				int role_number = roleMapper.countByExample(roleExample);
                // 相关联表 t_loginLog
				LoginLogExample loginLogExample = new LoginLogExample();
				loginLogExample.createCriteria().andUserIdEqualTo(userIds.get(i));
				int loginLog_number = loginLogMapper.countByExample(loginLogExample);
                // 相关联表t_user_role
				UserRoleExample userRoleExample = new UserRoleExample();
				userRoleExample.createCriteria().andUserIdEqualTo(userIds.get(i));
				int userRole_number = userRoleMapper.countByExample(userRoleExample);
                // 判断是否关联
				if (role_number <= 0 && loginLog_number <= 0 && userRole_number <= 0) {
						UserExample userExample = new UserExample();
						userExample.createCriteria().andUserIdEqualTo(userIds.get(i));
						int number = userMapper.deleteByExample(userExample);
	                    rightNumber += number;// 删除成功数据行数量记录
	                    result_name+=usernames.get(i)+" ";// 删除成功数据名称记录
                } else {
                	if(isFlag){
						if( userRole_number>0){
							result_one=" 数据行<font style='color:red;font-weight: bold;'>【"+ usernames.get(i)+ "】</font>与" + "【分配角色管理】存在<font style='color:red;font-weight: bold;'>【"+ userRole_number+ "】</font>条依赖关系," + "须删除【分配角色管理】中<font style='color:red;font-weight: bold;'>【"+ userRole_number + "】</font>条依赖数据    ";
						}else{
							if(role_number>0){
								result_one=" 数据行<font style='color:red;font-weight: bold;'>【"+ usernames.get(i)+ "】</font>与【角色管理】存在<font style='color:red;font-weight: bold;'>【"+ role_number+ "</font>条依赖关系," +"须删除【角色管理】中<font style='color:red;font-weight: bold;'>"+ role_number + "】</font>条依赖数据 ";
							}else{
								if(loginLog_number>0){
									result_one=" 数据行<font style='color:red;font-weight: bold;'>【"+ usernames.get(i)+ "】</font>与【登录日志管理】存在<font style='color:red;font-weight: bold;'>【"+ loginLog_number+ "】</font>条依赖关系," +"须删除【登录日志管理】中<font style='color:red;font-weight: bold;'>【"+ loginLog_number + "】</font>条依赖数据    ";
								}
							}
						 }
						isFlag=false;
				   }
               }
			}
		// 删除成功数量大于0即为操作成功,且提示关联信息
		if(rightNumber>0){
			returnResult.setMsg("成功删除<font style='color:red;font-weight: bold;'>【"+result_name.trim() + "】</font>"+ rightNumber+"条数据" +result_one);
			returnResult.setSuccess(true);
		}else{
			returnResult.setMsg(result_one.trim());
			returnResult.setSuccess(false);
		 }
	   }
       return returnResult;
	}
    
    
    /*       测试代码
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("zhangsan");
        user.setPassword("zhangsan");
        UserService userService = new UserService();
        userService.entryptPassword(user);
        System.out.println(user);
    }*/
}
