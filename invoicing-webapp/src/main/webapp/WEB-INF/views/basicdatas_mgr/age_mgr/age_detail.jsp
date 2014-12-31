<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>年龄别称：</td> 
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="roleId" value="${ageData.ageId}" />
				<input class="spinner" style="width:168px"  value="${ageData.ageName}" readonly="readonly"/>
			</td>
			<td>排序：</td>
			<td><input class="spinner" style="width:168px" value="${ageData.ageNum}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>开始年龄：</td>
			<td><input class="spinner" style="width:168px" value="${ageData.ageBegin}" readonly="readonly"/></td>
			<td>结束年龄：</td>
			<td><input class="spinner" style="width:168px" value="${ageData.ageEnd}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:168px" value="${ageData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${ageData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:168px" value="${ageData.updaterDisplay}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${ageData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><textarea class="spinner" style="width:416px" readonly="readonly">${ageData.remark}</textarea></td>
		</tr>
	</table>
</form>

