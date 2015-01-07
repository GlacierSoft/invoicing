  <%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>部门名称：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="depId" value="${DepData.depId}" />
				<input class="spinner" style="width:168px"  value="${DepData.cnName}" readonly="readonly"/>
			</td>
			<td>部门编码：</td>
			<td><input class="spinner" style="width:168px" value="${DepData.enName}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建者：</td>
			<td><input class="spinner" style="width:168px" value="${DepData.creater}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${DepData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><textarea class="spinner" style="width:440px" readonly="readonly">${DepData.remark}</textarea></td>
		</tr>
	</table>
</form>