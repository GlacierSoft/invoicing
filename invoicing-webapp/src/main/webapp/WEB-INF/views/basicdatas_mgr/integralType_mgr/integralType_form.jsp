<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<form id="creditType_mgr_creditType_form" method="POST" modelAttribute="parameterCredit" style="padding:15px" enctype="multipart/form-data">
	<table class="formtable">
		<tr>
			<td>积分类型名称：</td>
			<td>
				<input type="hidden" name="integralTypeId" value="${creditTypeData.integralTypeId}" />
				<c:if test="${creditTypeData.integralTypeId!=null}">
					<input type="hidden" name="integralType" value="${creditTypeData.integralType}" validType="customReg['^[a-zA-Z][a-zA-Z0-9_]{4,15}','<fmt:message key="ParameterIntegralType.integralType.illegal"/>']">
					 <input   name="integralType"   class="easyui-validatebox spinner " style="width:268px" required="true" value="${creditTypeData.integralType}" data-options="validType:'code'"/>
				</c:if>
				<c:if test="${creditTypeData.integralTypeId==null}">
					 	<input name="integralType"  class="easyui-validatebox spinner" style="width:268px" required="true" value="${creditTypeData.integralType}" data-options="validType:'code'" validType="customReg['^[a-zA-Z][a-zA-Z0-9_]{4,15}','<fmt:message key="ParameterIntegralType.integralType.illegal"/>']"/>
			 	</c:if>
			</td>
		</tr>
		<tr>
			<td>积分：</td>
			<td><input maxlength="3" name="changeValue" class="easyui-numberspinner spinner" value="${creditTypeData.changeValue}" data-options="min:0,max:9999,required:true,missingMessage:'请输入写信用积分,只能输入整数'" style="width: 270px;height:18px;"/></td>
		</tr>
		<tr>
			<td>改变类型：</td>
			<td><input disabled="disabled" id="changeType" name="changeType" value="${creditTypeData.changeType}" /></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><textarea name="remark" style="width:268px;" maxlength="255" class="spinner formta">${creditTypeData.remark}</textarea></td>
		</tr>
	</table>
</form>

<script type="text/javascript">
/* 	var webNavStatus = '${websiteNavData.webNavStatus}';
	if(webNavStatus == "enabled"){
		$('#nav_mgr_nav_form_webNavStatus').val("启用");
	}else{
		$('#nav_mgr_nav_form_webNavStatus').val("禁用");
	}   */
	//初始化下拉框
	$('#changeType').combobox({  
		valueField : 'value',
		height:18,
		width:270,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		required:true,
		data : fields.changeType
	});
	$('#creditType_detail_creditType').val(renderGridValue('${creditTypeData.integralType}',fields.integralType));
	$('#changeType').val(renderGridValue('${creditTypeData.changeType}',fields.changeType));
</script>