<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div class="easyui-layout" data-options="fit:true,border:false">
	<div data-options="region:'center',border:false"  style="overflow: hidden;">
		<form id="res_mgr_action_form" method="post" style="padding:15px">
			<table class="formtable">
				<tr>
					<td>所在菜单：</td>
					<td class="forminputtable">
						<input id="res_mgr_action_form_actionId" name="actionId" type="hidden"/>
						<select id="res_mgr_action_form_menuId" name="menuId"></select>
					</td>
					<td>所在面板：</td>
					<td>
						<select id="res_mgr_action_form_panelId" name="panelId"></select>
					</td>
				</tr>
				<tr>
					<td>操作名称：</td>
					<td>
						<input id="res_mgr_action_form_actionCnName" type="text" name="actionCnName" class="easyui-validatebox spinner"  style="width:170px;height:18px;" data-options="required:true"  />
					</td>
					<td>英文名称：</td>
					<td>
						<input id="res_mgr_action_form_actionEnName" type="text" name="actionEnName" class="easyui-validatebox spinner"  style="width:170px;height:18px;" data-options="required:true"  />
					</td>
				</tr>
				<tr>
					<td>操作样式：</td>
					<td><select id="res_mgr_action_form_iconCls"  name="iconCls" class="easyui-comboicons" data-options="width:172,height:18,autoShowPanel: true, multiple: false, size: '16'"></select></td>
					<td>排序：</td>
					<td><input id="res_mgr_action_form_orderNum" type="text" name="orderNum" class="easyui-numberspinner spinner" data-options="min:0,max:999,editable:true,required:true,missingMessage:'请选择操作排序'" value="1" style="width: 172px;height:18px;" min="1" max="99"/></td>
				</tr>
				<tr>
					<td>操作类型：</td>
					<td>
						<select id="res_mgr_action_form_type"  name="type" class="easyui-combobox"  style="width:170px;height:18px;" data-options="required:true">
							<option value="Button">按钮</option>
							<option value="Link">超链接</option>  
						</select>
					</td>
					<td>默认状态：</td>
					<td>
						<select id="cc" class="easyui-combobox" name="disabled" style="width:172px;height:18px;">    
							<option value="enable">显示</option>  
							<option value="disable">置灰</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>默认操作：</td>
					<td>
						<select id="res_mgr_action_form_defaultAction"  name="defaultAction" class="easyui-combobox"  style="width:170px;height:18px;" data-options="required:true">
							<option value="NonDefault">否</option>
							<option value="Default">是</option>  
						</select>
					</td>
					<td>权限范围：</td>
					<td>
						<select id="res_mgr_action_form_authRange"  name="authRange" class="easyui-combobox"  style="width:170px;height:18px;" data-options="required:true">
							<option value="Open">开启</option>  
							<option value="Close">关闭</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>调用方法：</td>
					<td colspan="3">
						<input id="res_mgr_action_form_method" type="text" class="spinner" name="method" style="width:420px;height:18px;" maxlength="100" />
					</td>
				</tr>
				<tr>
					<td>备注：</td>
					<td colspan="3">
						<textarea id="res_mgr_action_form_remark" name="remark" maxlength="255" class="spinner formta" style="width:420px;"></textarea>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>


<script type="text/javascript">

	//初始化所在菜单
	$("#res_mgr_action_form_menuId").combotree({
		data : $.parseJSON('${allMenuTreeNodeData}'),
		width:172,
		height:18,
	    smooth: true,       //该属性用以启用当前 easyui-tree 控件对平滑数据格式的支持
	    lines : true,
	    required : true,
	    editable : false,
	    prompt: "请选择面板所在菜单",
	    missingMessage:'请选择面板所在菜单',
	    onChange : function(newValue, oldValue){//当combobox的值发生改变，重新调整对应面板combobox
	    	$("#res_mgr_action_form_panelId").combobox('enable').combobox('clear').combobox('reload',ctx + '/do/res/panel/getPanelsByMenuId.json?menuId='+newValue);
	    }
	});
	
	//初始化所在菜单
	$("#res_mgr_action_form_panelId").combobox({
		url: ctx + '/do/res/panel/getPanelsByMenuId.json',
		width:172,
		height:18,
		valueField:'label',
		textField:'value',
		disabled:true,
		required : true,
		editable : false,
		prompt: "请选择操作所在面板",
		missingMessage:'请选择操作所在面板',
	});
	
	
</script>