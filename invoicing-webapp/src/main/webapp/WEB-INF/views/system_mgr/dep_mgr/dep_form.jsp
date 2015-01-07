<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="dep_mgr_dep_form" method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>部门名称：</td>
			<td>
				<input id="dep_mgr_dep_form_depId" type="hidden" name="depId" value="${DepData.depId}" />
				<input id="dep_mgr_dep_form_cnName" name="cnName" class="easyui-validatebox spinner" style="width:268px" required="true" value="${DepData.cnName}"/>
			</td>
		</tr>
		<tr>
			<td>部门编码：</td>
			<td>
				<input id="dep_mgr_dep_form_enName" name="enName" class="easyui-validatebox spinner" style="width:268px" required="true" value="${DepData.enName}"/>
			</td>
		</tr>
		<tr>
			<td>上级部门：</td>
			<td class="forminputtable">
				<input id="dep_mgr_dep_form_parentId" name="parentId" value="${DepData.parentId}"/>
			</td>
		</tr>
		<tr>
			<td>排序：</td>
			<td><input id="dep_mgr_dep_form_orderNum" name="orderNum" class="easyui-numberspinner spinner" value="${DepData.orderNum}" data-options="min:0,max:999,missingMessage:'请输入下拉项排序'" value="10" style="width: 270px;height:18px;" min="1" max="99"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><textarea id="dep_mgr_dep_form__remark" name="remark" style="width:268px;" maxlength="255" class="spinner formta">${DepData.remark}</textarea></td>
		</tr>
	</table>
</form>

<script type="text/javascript">
	//初始化上级部门
	$("#dep_mgr_dep_form_parentId").combotree({
		data : $.parseJSON('${allDepTreeNodeData}'),
		width:270,
		height:18,
	    missingMessage:'请选择上级部门',
	    smooth: true,       //该属性用以启用当前 easyui-tree 控件对平滑数据格式的支持
	    lines : true
	});	
</script>