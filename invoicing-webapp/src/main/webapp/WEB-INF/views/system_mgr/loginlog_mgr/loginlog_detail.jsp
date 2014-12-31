<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>用户ID：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="loginlogId" value="${loginlogData.loginlogId}" />
				<input class="spinner" style="width:168px"  value="${loginlogData.userId}" readonly="readonly"/>
			</td>
			<td>登录人：</td>
			<td><input class="spinner" style="width:168px" value="${loginlogData.loginUser}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>登录IP：</td>
			<td><input class="spinner" style="width:168px"  value="${loginlogData.loginIp}" readonly="readonly"/></td>
			<td>浏览器版本：</td>
			<td><input class="spinner" style="width:168px"  value="${loginlogData.browserVersion}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>屏幕分辨率：</td>
			<td><input value="${loginlogData.screenSize}" class="spinner" style="width:168px"  readonly="readonly"/></td>
			<td>登录时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${loginlogData.loginTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
	</table>
</form>

