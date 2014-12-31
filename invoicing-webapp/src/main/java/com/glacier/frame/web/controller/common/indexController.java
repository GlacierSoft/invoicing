/**
 * @Title: CommonController.java 
 * @Package com.glacier.frame.web.controller 
 * @author zhenfei.zhang   
 * @email 289556866@qq.com
 * @date 2014-1-16 上午10:50:38 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-1-16
				修改人：zhenfei.zhang 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：zhenfei.zhang
 * 
 */
package com.glacier.frame.web.controller.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName: CommonController
 * @Description: TODO(公用控制器)
 * @author zhenfei.zhang
 * @email 289556866@qq.com
 * @date 2014-1-16 上午10:50:38
 */
@Controller
@RequestMapping(value="/index")
public class indexController {
    
    
    @RequestMapping(value = "/center", method = RequestMethod.GET)
    public Object intoIndex() {
        
        ModelAndView mav = new ModelAndView("layout/center");
        return mav;
    }
}
