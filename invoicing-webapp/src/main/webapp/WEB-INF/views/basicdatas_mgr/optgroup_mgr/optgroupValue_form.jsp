<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="optgroup_mgr_optgroupValue_form" method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>下拉值代码：</td> 
			<td>
				<input id="optgroup_mgr_optgroupValue_form_optgroupValueId" type="hidden" name="optgroupValueId" value="${optgroupValueData.optgroupValueId}" />
				<input id="optgroup_mgr_optgroupValue_form_optgroupValueCode" name="optgroupValueCode" class="easyui-validatebox spinner" style="width:268px" required="true" value="${optgroupValueData.optgroupValueCode}" validType="customReg['^[a-zA-Z]{2,20}$','<fmt:message key="ParameterOptgroupValue.optgroupValueCode.illegal"/>']"/>
			</td>
		</tr>
		<tr>
			<td>下拉值名称：</td>
			<td>
				<input id="optgroup_mgr_optgroupValue_form_optgroupValueName" name="optgroupValueName" class="easyui-validatebox spinner" style="width:268px" required="true" value="${optgroupValueData.optgroupValueName}" validType="customReg['^[\u0391-\uFFE5A-Z]{1,10}$','<fmt:message key="ParameterOptgroupValue.optgroupValueName.illegal"/>']"/>
			</td>
		</tr>
		<tr>
			<td>所属下拉项：</td>
			<td class="forminputtable">
				<input id="optgroup_mgr_optgroupValue_form_optgroupId" name="optgroupId" value="${optgroupValueData.optgroupId}"/>
			</td>
		</tr>
		<tr>
			<td>下拉值状态：</td>
			<td class="forminputtable">
				<input id="optgroup_mgr_optgroupValue_form_status" name="status" value="${optgroupValueData.status}" class="easyui-combobox" style="height:18px;width:270px" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
		</tr>
		<tr>
			<td>排序：</td>
			<td><input id="optgroup_mgr_optgroupValue_form_optgroupValueNum" name="optgroupValueNum" class="easyui-numberspinner spinner" value="${optgroupValueData.optgroupValueNum}" data-options="min:0,max:999,missingMessage:'请输入下拉值排序'" value="10" style="width: 270px;height:18px;" min="1" max="99"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><textarea id="optgroup_mgr_optgroupValue_form__remark" name="remark" style="width:268px;" maxlength="255" class="spinner formta">${optgroupValueData.remark}</textarea></td>
		</tr>
	</table>
</form>

<script type="text/javascript">
	//初始化所属下拉项
	$("#optgroup_mgr_optgroupValue_form_optgroupId").combotree({
		data : $.parseJSON('${allOptgroupTreeNodeData}'),
		width:270,
		height:18,
	    missingMessage:'请选择所属下拉项',
	    smooth: true,       //该属性用以启用当前 easyui-tree 控件对平滑数据格式的支持
	    lines : true
	});	
</script>