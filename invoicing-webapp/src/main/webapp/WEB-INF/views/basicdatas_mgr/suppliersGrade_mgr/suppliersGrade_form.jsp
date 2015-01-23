<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="creditType_mgr_creditType_form" method="POST" modelAttribute="parameterCredit" style="padding:15px" enctype="multipart/form-data">
	<table class="formtable">
		<tr>
			<td>供应商级别：</td>
			<td>
				<input type="hidden" name="gradeId" value="${suppliersGradeDate.gradeId}" />
				<input name="gradeName"  class="easyui-validatebox spinner" style="width:168px;height: 18px;" required="true" value="${suppliersGradeDate.gradeName}"/>
			</td>
		</tr>
		<tr>
			<td>排序：</td>
			<td><input maxlength="3" name="gradeCode" class="easyui-numberspinner spinner" style="width:168px" value="${suppliersGradeDate.gradeCode}" data-options="min:0,max:999,required:true,missingMessage:'只能输入整数'" style="width:170px;height: 18px;"/></td>
		</tr>
		<tr>
			<td>状态：</td>
			<td><input id="deliverType_from_deliverType" name="enabled" style="width:170px;height: 18px;" value="${suppliersGradeDate.enabled}"  class="easyui-combobox" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/></td>
		</tr>
	</table>
</form>