<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="carrierCarType_mgr_carType_form" method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>类型名称：</td>
			<td>
				<input type="hidden" name="industryId" value="${suppliersIndustryDate.industryId}" />
				<input style="width:268px;height: 20px;" name="industryName" value="${suppliersIndustryDate.industryName}" class="easyui-validatebox spinner"  required="true"/>
			</td>
		</tr>
		<tr>
			<td>类型状态：</td>
			<td>
			<input  name="enabled"  style="width:268px;" value="${suppliersIndustryDate.enabled}" class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
		</tr>
		<tr>
			<td>备注：</td>
			<td>
				<textarea  name="remark" style="width:268px;" class="spinner formta">${suppliersIndustryDate.remark}</textarea>
			</td>
		</tr>
	</table>
</form>