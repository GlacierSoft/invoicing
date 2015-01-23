<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<form id="sellReturnReason_mgr_sellReturnReason_form" method="POST" modelAttribute="parameterCredit" style="padding:15px" enctype="multipart/form-data">
	<table class="formtable">
		<tr>
			<td>销售退货原因：</td>
			<td>
				<input type="hidden" name="returnReasonId" value="${sellReturnReasonDate.returnReasonId}" />
				<input name="returnReasonName"  class="easyui-validatebox spinner" style="width:168px;height: 18px;" required="true" value="${sellReturnReasonDate.returnReasonName}"/>
			</td>
		</tr>
		<tr>
			<td>序号：</td>
			<td><input maxlength="3" name="sequenced" class="easyui-numberspinner spinner" value="${sellReturnReasonDate.sequenced}" data-options="min:0,max:999,required:true,missingMessage:'请输入序号,只能输入整数'" style="width:170px;height: 18px;"/></td>
		</tr>
		<tr>
			<td>状态：</td>
			<td><input id="sellReturnReason_from_sellReturnReason" name="enabled" style="width:168px;height: 18px;" value="${sellReturnReasonDate.enabled}"  class="easyui-combobox" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/></td>
		</tr>
	</table>
</form>