<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<form id="parContactType_mgr_parContactType_form" method="POST" modelAttribute="parameterCredit" style="padding:15px" enctype="multipart/form-data">
	<table class="formtable">
		<tr>
			<td>名称：</td>
			<td>
				<input type="hidden" name="warGoodsTypeId" value="${warGoodsTypeDate.warGoodsTypeId}" />
				<input name="name"  class="easyui-validatebox spinner" style="width:268px;height: 16px;" required="true" value="${warGoodsTypeDate.name}"/>
			</td>
		</tr>
		<tr>
			<td>序号：</td>
			<td><input maxlength="3" name="orderNum" class="easyui-numberspinner spinner" style="width: 270px;height:18px;" value="${warGoodsTypeDate.orderNum}" data-options="min:0,max:9999,required:true,missingMessage:'请输入序号,只能输入整数'" /></td>
		</tr>
		<tr>
			<td>状态：</td>
			<td><input id="deliverType_from_deliverType" name="enabled" style="width:268px" value="${warGoodsTypeDate.enabled}"  class="easyui-combobox" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/></td>
		</tr>
	</table>
</form>