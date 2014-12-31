<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="optgroup_mgr_optgroup_form" method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>下拉项名称：</td>
			<td>
				<input id="optgroup_mgr_optgroup_form_optgroupId" type="hidden" name="optgroupId" value="${optgroupData.optgroupId}" />
				<input id="optgroup_mgr_optgroup_form_optgroupName" name="optgroupName" class="easyui-validatebox spinner" style="width:268px" required="true" value="${optgroupData.optgroupName}" validType="customReg['^[\u0391-\uFFE5]{2,10}$','<fmt:message key="ParameterOptgroup.optgroupName.illegal"/>']"/>
			</td>
		</tr>
		<tr>
			<td>下拉项代码：</td>
			<td>
				<input id="optgroup_mgr_optgroup_form_optgroupCode" name="optgroupCode" class="easyui-validatebox spinner" style="width:268px" required="true" value="${optgroupData.optgroupCode}" validType="customReg['^[a-zA-Z]{2,20}$','<fmt:message key="ParameterOptgroup.optgroupCode.illegal"/>']"/>
			</td>
		</tr>
		<tr>
			<td>父级下拉项：</td>
			<td class="forminputtable">
				<input id="optgroup_mgr_optgroup_form_optgroupPid" name="optgroupPid" value="${optgroupData.optgroupPid}"/>
			</td>
		</tr>
		<tr>
			<td>排序：</td>
			<td><input id="optgroup_mgr_optgroup_form_optgroupNum" name="optgroupNum" class="easyui-numberspinner spinner" value="${optgroupData.optgroupNum}" data-options="min:0,max:999,missingMessage:'请输入下拉项排序'" value="10" style="width: 270px;height:18px;" min="1" max="99"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><textarea id="optgroup_mgr_optgroup_form__remark" name="remark" style="width:268px;" maxlength="255" class="spinner formta">${optgroupData.remark}</textarea></td>
		</tr>
	</table>
</form>

<script type="text/javascript">
	//初始化上级下拉项
	$("#optgroup_mgr_optgroup_form_optgroupPid").combotree({
		data : $.parseJSON('${allOptgroupTreeNodeData}'),
		width:270,
		height:18,
	    missingMessage:'请选择上级下拉项',
	    smooth: true,       //该属性用以启用当前 easyui-tree 控件对平滑数据格式的支持
	    lines : true
	});	
</script>