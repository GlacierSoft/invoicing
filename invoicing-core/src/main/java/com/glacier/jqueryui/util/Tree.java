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

import java.util.Map;

/**
 * @ClassName: Tree 
 * @Description: TODO(构建EasyUI树的对象模型) 
 * @author xichao.dong	
 * @email 406592176@qq.com
 * @date 2014-8-15 上午11:19:10
 */
public class Tree {

    /**
     * id
     */
    private String id;

    /**
     * 父id
     */
    private String pid;

    /**
     * 显示的内容
     */
    private String text;

    /**
     * 样式
     */
    private String iconCls;

    /**
     * 打开或关闭:"open" or "closed" 默认是打开状态，如果修改为closed,节点的children会发送远程请求
     */
    private String state;

    /**
     * 如果需要添加checkbox需要此选项
     */
    private boolean checked;

    /**
     * combobox选项为true可以默认勾选
     */
    private boolean selected;

    /**
     * 自定义属性以map存放在此字段
     */
    private Map<String, String> attributes;

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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

}
