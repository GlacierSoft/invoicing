<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="carrierCarType_mgr_carType_form" method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>采购名称：</td>
			<td>
				<input type="hidden" name="purchaseTypeId" value="${purchaseTypeDate.purchaseTypeId}" />
				<input style="width:268px;height: 20px;" name="name" value="${purchaseTypeDate.name}" class="easyui-validatebox spinner"  required="true"/>
			</td>
		</tr>
		<tr>
			<td>采购状态：</td>
			<td>
			<input  name="enabled"  style="width:268px;" value="${purchaseTypeDate.enabled}" class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
		</tr>
		<tr>
			<td>备注：</td>
			<td>
				<textarea  style="width:268px;" class="spinner formta"></textarea>
			</td>
		</tr>
	</table>
</form>