<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<form id="clientType_mgr_clientType_form" method="POST" modelAttribute="parameterCredit" style="padding:15px" enctype="multipart/form-data">
	<table class="formtable">
		<tr>
			<td>订单编号：</td>
			<td> ${purchaseOrderData.orderCode}</td>  
			</tr>
		<tr>
			<td>审核状态：</td>
			<td>
			<input type="hidden" name="purOrderId" value="${purchaseOrderData.purOrderId}" />
			<input id="clientType_from_clientType" name="auditState" style="width:300px;height: 18px;" value="${purchaseOrderData.auditState}"  class="easyui-combobox" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.auditState"/>
			 </td> 
		</tr> 
		<tr>
		  <td>审核备注：</td>
		  <td>
		      <textarea   name="auditRemark" class="easyui-validatebox spinner" style="width:300px;height: 70px"   >${purchaseOrderData.auditRemark}</textarea>
		   </td>
	 	</tr>
	</table>
</form>