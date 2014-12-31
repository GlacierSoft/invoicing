<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>年龄别称：</td>
			<td>
				<input type="hidden" name="ageId" value="${ageData.ageId}" />
				<input name="ageName" class="easyui-validatebox spinner" style="width:268px;height: 16px;" required="true" value="${ageData.ageName}" validType="customReg['^[\u0391-\uFFE5]{2,10}$','<fmt:message key="ParameterAge.ageName.illegal"/>']"/>
			</td>
		</tr>
		<tr>
			<td>开始年龄：</td>
			<td><input name="ageBegin" class="easyui-numberspinner spinner" value="${ageData.ageBegin}" data-options="min:0,max:999,required:true,missingMessage:'请输入开始年龄,只能输入整数'" value="10" style="width: 270px;height:18px;" min="1" max="99"/></td>
		</tr>
		<tr>
			<td>结束年龄：</td>
			<td><input name="ageEnd" class="easyui-numberspinner spinner" value="${ageData.ageEnd}" data-options="min:0,max:999,required:true,missingMessage:'请输入结束年龄,只能输入整数'" value="10" style="width: 270px;height:18px;" min="1" max="99"/></td>
		</tr>
		<tr>
			<td>排序：</td>
			<td><input name="ageNum" class="easyui-numberspinner spinner" value="${ageData.ageNum}" data-options="min:0,max:999,missingMessage:'请输入年龄排序'" value="10" style="width: 270px;height:18px;" min="1" max="99"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><textarea name="remark" style="width:268px;" maxlength="255" class="spinner formta">${ageData.remark}</textarea></td>
		</tr>
	</table>
</form>
