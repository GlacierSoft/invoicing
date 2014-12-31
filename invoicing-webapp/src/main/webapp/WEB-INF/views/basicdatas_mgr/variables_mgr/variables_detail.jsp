<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>变量名：</td> 
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="roleId" value="${variablesData.variablesId}" />
				<input class="spinner" style="width:168px"  value="${variablesData.variableName}" readonly="readonly"/>
			</td>
			<td>参数值：</td>
			<td><input class="spinner" style="width:168px" value="${variablesData.parameterValues}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>输入提示：</td>
			<td><input class="spinner" style="width:168px" value="${variablesData.inputTip}" readonly="readonly"/></td>
			<td>表单类型：</td>
			<td><input class="spinner" style="width:168px" value="${variablesData.formType}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>参数说明：</td>
			<td colspan="3"><input class="spinner" style="width:416px" value="${variablesData.specification}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:168px" value="${variablesData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${variablesData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:168px" value="${variablesData.updaterDisplay}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${variablesData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><textarea class="spinner" style="width:416px" readonly="readonly">${variablesData.remark}</textarea></td>
		</tr>
	</table>
</form>

