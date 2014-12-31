<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>下拉项：</td> 
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="areaId" value="${optgroupData.optgroupId}" />
				<input class="spinner" style="width:168px"  value="${optgroupData.optgroupName}" readonly="readonly"/>
			</td>
			<td>下拉代码：</td>
			<td colspan="3"><input class="spinner" style="width:168px"  value="${optgroupData.optgroupCode}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>排序号：</td>
			<td><input class="spinner" style="width:168px" value="${optgroupData.optgroupNum}" readonly="readonly"/></td>
			<td>所属父级：</td>
			<td><input class="spinner" style="width:168px" value="${optgroupData.optgroupPname}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:168px" value="${optgroupData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${optgroupData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:168px" value="${optgroupData.updaterDisplay}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${optgroupData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><textarea class="spinner" style="width:416px" readonly="readonly">${optgroupData.remark}</textarea></td>
		</tr>
	</table>
</form>

