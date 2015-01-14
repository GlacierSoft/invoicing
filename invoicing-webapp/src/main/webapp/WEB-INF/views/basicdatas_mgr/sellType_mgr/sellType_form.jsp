<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<form id="sellType_mgr_sellType_form" method="POST" modelAttribute="parameterCredit" style="padding:15px" enctype="multipart/form-data">
	<table class="formtable">
		<tr>
			<td>销售类型：</td>
			<td>
				<input type="hidden" name="sellTypeId" value="${sellTypeDate.sellTypeId}" />
				<input name="sellTypeName"  class="easyui-validatebox spinner" style="width:268px;height: 16px;" required="true" value="${sellTypeDate.sellTypeName}"/>
			</td>
		</tr>
		<tr>
			<td>序号：</td>
			<td><input maxlength="3" name="sequenced" class="easyui-numberspinner spinner" value="${sellTypeDate.sequenced}" data-options="min:0,max:9999,required:true,missingMessage:'请输入序号,只能输入整数'" style="width: 270px;height:18px;"/></td>
		</tr>
		<tr>
			<td>状态：</td>
			<td><input id="sellType_from_sellType" name="enabled" style="width:268px" value="${sellTypeDate.enabled}"  class="easyui-combobox" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/></td>
		</tr>
	</table>
</form>