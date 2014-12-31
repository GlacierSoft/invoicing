<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="carrierCarType_mgr_carType_form" method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>类型名称：</td>
			<td>
				<input type="hidden" id="carrierCarType_mgr_carType_form_cartypeId" name="creditworthinessTypeId" value="${creditworthinessTypeDate.creditworthinessTypeId}" />
				<input id="carrierCarType_mgr_carType_form_cartypeName" style="width:268px;height: 20px;" name="creditworthinessType" value="${creditworthinessTypeDate.creditworthinessType}" class="easyui-validatebox spinner"  required="true"/>
			</td>
		</tr>
		<tr>
			<td>改变类型：</td>
			<td>
			<input id="carrierCarType_mgr_carType_form_status" name="changeType"  style="width:268px;" value="${creditworthinessTypeDate.changeType}" class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.changeType"/>
			</td>
		</tr>
		<tr>
			<td>改变值：</td>
			<td>
				<input id="carrierCarType_mgr_carType_form_cartypeName" style="width:268px;height: 20px;" name="changeValue" value="${creditworthinessTypeDate.changeValue}" class="easyui-validatebox spinner"  required="true"/>
			</td>
		</tr>
		<tr>
			<td>备注：</td>
			<td>
				<textarea id="carrierCarType_mgr_carType_form_remark" name="remark" style="width:268px;" class="spinner formta">${creditworthinessTypeDate.remark}</textarea>
			</td>
		</tr>
	</table>
</form>