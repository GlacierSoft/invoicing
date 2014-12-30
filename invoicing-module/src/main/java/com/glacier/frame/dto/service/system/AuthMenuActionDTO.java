/**
 * @Title: AuthMenuActionVO.java 
 * @Package com.glacier.netloan.web.vo.system 
 * @author zhenfei.zhang   
 * @email 289556866@qq.com
 * @date 2014-1-21 上午10:43:00 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-1-21
				修改人：zhenfei.zhang 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：zhenfei.zhang
 * 
 */
package com.glacier.frame.dto.service.system;

/**
 * @ClassName: AuthMenuActionDTO
 * @Description: TODO(权限菜单操作构建DTO)
 * @author zhenfei.zhang
 * @email 289556866@qq.com
 * @date 2014-1-21 上午10:43:00
 */
public class AuthMenuActionDTO {

    private String id;

    private String pid;

    private String menuName;

    private String actions;

    private String iconCls;

    private boolean checked = false;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getActions() {
        return actions;
    }

    public void setActions(String actions) {
        this.actions = actions;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

}
