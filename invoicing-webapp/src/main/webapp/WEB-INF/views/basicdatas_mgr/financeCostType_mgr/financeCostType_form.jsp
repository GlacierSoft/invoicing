<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<form id="financeCostType_mgr_financeCostType_form" method="POST" modelAttribute="parameterCredit" style="padding:15px" enctype="multipart/form-data">
	<table class="formtable">
		<tr>
			<td>费用类型名称：</td>
			<td>
				<input type="hidden" name="costTypeId" value="${financeCostTypeDate.costTypeId}" />
				<input name="name"  class="easyui-validatebox spinner" style="width:268px;height: 16px;" required="true" value="${financeCostTypeDate.name}"/>
			</td>
		</tr>
		<tr>
			<td>序号：</td>
			<td><input maxlength="3" name="sequenced" class="easyui-numberspinner spinner" value="${financeCostTypeDate.sequenced}" data-options="min:0,max:9999,required:true,missingMessage:'请输入序号,只能输入整数'" style="width: 270px;height:18px;"/></td>
		</tr>
		<tr>
			<td>状态：</td>
			<td><input id="financeCostType_from_financeCostType" name="enabled" style="width:268px" value="${financeCostTypeDate.enabled}"  class="easyui-combobox" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/></td>
		</tr>
	</table>
</form>