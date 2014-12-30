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
package com.glacier.jqueryui.util;

/**
 * @ClassName: JqReturnJson 
 * @Description: TODO(JqueryUI 结果返回对象) 
 * @author xichao.dong	
 * @email 406592176@qq.com
 * @date 2014-8-15 上午11:18:58
 */
public class JqReturnJson {

    private boolean success = false;// 是否成功

    private String msg = "";// 提示信息

    private Object obj = null;// 其他信息

    public JqReturnJson() {
    }

    /**
     * 默认success为false
     */
    public JqReturnJson(String msg) {
        this.msg = msg;
    }

    public JqReturnJson(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public JqReturnJson(boolean success, String msg, Object obj) {
        this.success = success;
        this.msg = msg;
        this.obj = obj;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

}
