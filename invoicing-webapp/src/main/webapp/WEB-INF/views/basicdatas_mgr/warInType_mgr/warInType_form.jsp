<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<form id="warInType_mgr_warInType_form" method="POST" modelAttribute="parameterCredit" style="padding:15px" enctype="multipart/form-data">
	<table class="formtable">
		<tr>
			<td>入库类型名称：</td>
			<td>
				<input type="hidden" name="inTypeId" value="${warInTypeDate.inTypeId}" />
				<input name="inTypeName"  class="easyui-validatebox spinner" style="width:268px;height: 16px;" required="true" value="${warInTypeDate.inTypeName}"/>
			</td>
		</tr>
		<tr>
			<td>序号：</td>
			<td><input maxlength="3" name="orderNum" class="easyui-numberspinner spinner" value="${warInTypeDate.orderNum}" data-options="min:0,max:9999,required:true,missingMessage:'请输入写信用积分,只能输入整数'" style="width: 270px;height:18px;"/></td>
		</tr>
		<tr>
			<td>状态：</td>
			<td><input id="warInType_from_enabled" name="enabled" style="width:268px" value="${warInTypeDate.enabled}"  class="easyui-combobox" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/></td>
		</tr>
	</table>
</form>