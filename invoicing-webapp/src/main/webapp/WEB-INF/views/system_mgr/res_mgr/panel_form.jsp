<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div class="easyui-layout" data-options="fit:true,border:false">
	<div data-options="region:'center',border:false"  style="overflow: hidden;">
		<form id="res_mgr_panel_form" method="post" style="padding:15px">
			<table class="formtable">
				<tr>
					<td>所在菜单：</td>
					<td>
						<input id="res_mgr_panel_form_panelId" name="panelId" type="hidden"/><!-- 隐藏面板ID字段，编辑自动赋值 -->
						<select id="res_mgr_panel_form_menuId" name="menuId"></select>
					</td>
				</tr>
				<tr>
					<td>面板名称：</td>
					<td>
						<input id="res_mgr_panel_form_panelCnName" type="text" name="panelCnName" class="easyui-validatebox spinner"  style="width:170px;height:18px;" data-options="required:true"  />
					</td>
				</tr>
				<tr>
					<td>英文名称：</td>
					<td>
						<input id="res_mgr_panel_form_panelEnName" type="text" name="panelEnName" class="easyui-validatebox spinner"  style="width:170px;height:18px;" data-options="required:true"  />
					</td>
				</tr>
				<tr>
					<td>排序：</td>
					<td><input id="res_mgr_panel_form_orderNum" type="text" name="orderNum" class="easyui-numberspinner spinner" data-options="min:0,max:999,editable:true,required:true,missingMessage:'请选择操作排序'" value="1" style="width: 172px;height:18px;" min="1" max="99"/></td>
				</tr>
			</table>
		</form>
	</div>
</div>




<script type="text/javascript">

	//初始化所在菜单
	$("#res_mgr_panel_form_menuId").combotree({
		data : $.parseJSON('${allMenuTreeNodeData}'),
		width:172,
		height:18,
	    smooth: true,       //该属性用以启用当前 easyui-tree 控件对平滑数据格式的支持
	    lines : true,
	    required : true,
	    editable : false,
	    prompt: "请选择面板所在菜单"
	});
	
	
</script>