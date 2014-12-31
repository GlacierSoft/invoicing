<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>会员信用等级名称：</td> 
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="creditId" value="${creditData.creditId}" />
				<input class="spinner" style="width:150px"  value="${creditData.creditName}" readonly="readonly"/>
			</td>
			<td>排序：</td>
			<td><input class="spinner" style="width:150px" value="${creditData.creditNum}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>会员开始积分：</td>
			<td><input class="spinner" style="width:150px"  value="${creditData.creditBeginIntegral}" readonly="readonly"/></td>
			<td>会员结束积分：</td>
			<td colspan="3"><input class="spinner" style="width:150px"  value="${creditData.creditEndIntegral}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>信用等级图标：</td>
			<td>
			<div id="creditPhotoDiv" style="border: 1px #DDDDDD;">
				<img id="creditPhotoDivImg"  src="${creditData.creditPhoto}" style="width: 34px;height: 24px ;" />
			</div>
			</td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td>创建者：</td>
			<td><input class="spinner" style="width:150px" value="${creditData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:150px" value="<fmt:formatDate value="${creditData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:150px" value="${creditData.updaterDisplay}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:150px" value="<fmt:formatDate value="${creditData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><textarea class="spinner" style="width:405px" readonly="readonly">${creditData.remark}</textarea></td>
		</tr>
	</table>
</form>

