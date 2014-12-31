  <%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>用户名：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="userId" value="${UserData.userId}" />
				<input class="spinner" style="width:168px"  value="${UserData.username}" readonly="readonly"/>
			</td>
			<td>真实名称：</td>
			<td><input class="spinner" style="width:168px" value="${UserData.userCnName}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>状态：</td>
			<td><input id="user_mgr_user_form_status" class="spinner" style="width:168px"  readonly="readonly"/></td>
			<td>是否内置：</td>
			<td><input id="user_mgr_user_form_builtin" class="spinner" style="width:168px"  readonly="readonly"/></td>
		</tr>
		<tr>
			<td>电子邮箱：</td>
			<td><input value="${UserData.email}" class="spinner" style="width:168px"  readonly="readonly"/></td>
			<td>最后登录IP：</td>
			<td><input value="${UserData.lastLoginIpAddress}" class="spinner" style="width:168px"  readonly="readonly"/></td>
		</tr>
		<tr>
			<td>登录次数：</td>
			<td><input value="${UserData.loginCount}" class="spinner" style="width:168px"  readonly="readonly"/></td>
			<td>最后登录时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${UserData.lastLoginTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建者：</td>
			<td><input class="spinner" style="width:168px" value="${UserData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${UserData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><textarea class="spinner" style="width:440px" readonly="readonly">${UserData.remark}</textarea></td>
		</tr>
	</table>
</form>


<script type="text/javascript">
	$('#user_mgr_user_form_status').val(renderGridValue('${UserData.status}',fields.status));
	$('#user_mgr_user_form_builtin').val(renderGridValue('${UserData.builtin}',fields.builtin));
</script>
