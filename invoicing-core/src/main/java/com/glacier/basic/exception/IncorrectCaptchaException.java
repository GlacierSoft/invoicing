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
package com.glacier.basic.exception;

import org.apache.shiro.authc.AuthenticationException;

/**
 * @ClassName: IncorrectCaptchaException 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author xichao.dong	
 * @email 406592176@qq.com
 * @date 2014-8-15 上午11:01:49
 */
@SuppressWarnings("serial")
public class IncorrectCaptchaException extends AuthenticationException{ 
    
    public IncorrectCaptchaException() { 
       super(); 
    } 
    
    public IncorrectCaptchaException(String message, Throwable cause) { 
       super(message, cause); 
    } 
    
    public IncorrectCaptchaException(String message) { 
       super(message); 
    } 
    
    public IncorrectCaptchaException(Throwable cause) { 
       super(cause); 
    } 
  }
