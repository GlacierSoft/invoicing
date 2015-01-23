<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<form id="creditType_mgr_creditType_form" method="POST" modelAttribute="parameterCredit" style="padding:15px" enctype="multipart/form-data">
	<table class="formtable">
		<tr>
			<td>退货方式名称：</td>
			<td>
				<input type="hidden" name="returnedPurchaseTypeId" value="${purchaseReturnedTypeData.returnedPurchaseTypeId}" />
				<input name="name"  class="easyui-validatebox spinner" style="width:168px;height: 18px;" required="true" value="${purchaseReturnedTypeData.name}"/>
			</td>
		</tr>
		<tr>
			<td>排序：</td>
			<td><input maxlength="3" name="sequenced" class="easyui-numberspinner spinner" value="${purchaseReturnedTypeData.sequenced}" data-options="min:0,max:999,required:true,missingMessage:'只能输入整数'" style="width:170px;height: 18px;"/></td>
		</tr>
		<tr>
			<td>状态：</td>
			<td><input id="deliverType_from_deliverType" name="enabled" style="width:170px;height: 18px;" value="${purchaseReturnedTypeData.enabled}"  class="easyui-combobox" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/></td>
		</tr>
	</table>
</form>