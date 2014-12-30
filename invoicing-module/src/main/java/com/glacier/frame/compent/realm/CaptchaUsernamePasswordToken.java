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

import org.apache.shiro.authc.UsernamePasswordToken;

/**
 * @ClassName: CaptchaUsernamePasswordToken 
 * @Description: TODO(验证用户名和密码是否正确) 
 * @author xichao.dong	
 * @email 406592176@qq.com
 * @date 2014-8-15 上午11:22:07
 */
public class CaptchaUsernamePasswordToken extends UsernamePasswordToken {
    
    private static final long serialVersionUID = 15466454134453L;

    private String captcha;

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public CaptchaUsernamePasswordToken() {
        super();
    }

    public CaptchaUsernamePasswordToken(String username, char[] password, boolean rememberMe, String host, String captcha) {
        super(username, password, rememberMe, host);
        this.captcha = captcha;
    }
}
