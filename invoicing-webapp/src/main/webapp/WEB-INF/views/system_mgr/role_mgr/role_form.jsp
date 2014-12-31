<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%><!-- 引入国际化标签 -->

<form method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>角色名称：</td>
			<td>
				<input type="hidden" name="roleId" value="${roleData.roleId}" />
				<input name="roleCnName" class="easyui-validatebox spinner" style="width:268px" value="${roleData.roleCnName}" required="true" validType="customReg['^[\u0391-\uFFE5]{2,10}','<fmt:message key="Role.roleCnName.illegal"/>']"/>
			</td>
		</tr>
		<tr>
			<td>英文名称：</td>
			<td><input name="roleEnName" class="easyui-validatebox spinner" style="width:268px" value="${roleData.roleEnName}" required="true" validType="customReg['^[A-Z_]{4,16}$','<fmt:message key="Role.roleEnName.illegal"/>']"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><textarea name="remark" style="width:268px;" maxlength="255" class="spinner formta">${roleData.remark}</textarea></td>
		</tr>
	</table>
</form>

