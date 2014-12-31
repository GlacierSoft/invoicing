<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>变量名：</td>
			<td>
				<input type="hidden" name="variablesId" value="${variablesData.variablesId}" />
				<input name="variableName" class="easyui-validatebox spinner" style="width:268px" required="true" value="${variablesData.variableName}" validType="customReg['^[\u0391-\uFFE5]{1,20}$','<fmt:message key="ParameterSystemVariables.variableName.illegal"/>']"/>
			</td>
		</tr>
		<tr>
			<td>参数值：</td>
			<td><input name="parameterValues" class="easyui-numberspinner spinner" style="width:268px;height: 18px;" required="true" value="${variablesData.parameterValues}" data-options="min:0,max:9999,precision:2,missingMessage:'请输入参数值,只能输入整数及保留小数'"/></td>
		</tr>
		<tr>
			<td>参数说明：</td>
			<td><input name="specification" class="easyui-validatebox spinner" style="width:268px" required="true" value="${variablesData.specification}"/></td>
		</tr>
		<tr>
			<td>输入提示：</td>
			<td><input name="inputTip" class="easyui-validatebox spinner" style="width:268px" required="true" value="${variablesData.inputTip}"/></td>
		</tr>
		<tr>
			<td>表单类型：</td>
			<td><input id="variables_mgr_variables_form_formType" name="formType" value="${variablesData.formType}"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><textarea name="remark" style="width:268px;" maxlength="255" class="spinner formta">${variablesData.remark}</textarea></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	// 初始化公告状态下拉框
	$('#variables_mgr_variables_form_formType').combobox({  
		valueField : 'value',
		height:18,
		width:270,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		required:true,
		data : fields.formType
	});
</script>