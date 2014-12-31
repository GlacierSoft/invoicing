<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%><!-- 引入国际化标签 -->

<form id="user_mgr_user_form" method="POST" style="padding:15px" >
	<table class="formtable">
		<tr>
			<td>用户名称：</td>
			<td>
				<input type="hidden" name="userId" value="${userData.userId}" />
				<input name="username" class="easyui-validatebox spinner" style="width:268px" value="${userData.username}" required="true" validType="customReg['^[a-zA-Z][a-zA-Z0-9_]{4,15}','<fmt:message key="User.username.illegal"/>']"/>
			</td>
		</tr>
		<tr>
			<td>真实姓名：</td>
			<td><input name="userCnName" class="easyui-validatebox spinner" style="width:268px" value="${userData.userCnName}" required="true" invalidMessage="用户真实姓名由字符组成，例如：张三" validType="customReg['^[\u0391-\uFFE5]{2,10}','<fmt:message key="User.username.illegal"/>']"/></td>
		</tr>
		<tr>
			<td>用户状态：</td>
			<td><input id="user_mgr_user_form_status" name="status"  class="easyui-combobox" style="height:18px;width:270px" value="${userData.status}" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/></td>
		</tr>
		<tr>
			<td>电子邮箱：</td>
			<td><input name="email" class="easyui-validatebox spinner" style="width:268px" value="${userData.email}" required="true" validType="email"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><textarea name="remark" style="width:268px;" maxlength="255" class="spinner formta">${userData.remark}</textarea></td>
		</tr>
	</table>
</form>