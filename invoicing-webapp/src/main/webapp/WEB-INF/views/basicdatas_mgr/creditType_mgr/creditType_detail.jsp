<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>信用类型名称：</td> 
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="creditTypeId" value="${creditTypeData.creditTypeId}" />
				<input class="spinner" style="width:150px" id="creditType_detail_creditType"  readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>信用类型积分：</td>
			<td><input class="spinner" style="width:150px"  value="${creditTypeData.changeValue}" readonly="readonly"/></td>
			<td>改变类型：</td>
			<td colspan="3"><input id="changeType" class="spinner" style="width:150px"  value="${creditTypeData.changeType}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建者：</td>
			<td><input class="spinner" style="width:150px" value="${creditTypeData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:150px" value="<fmt:formatDate value="${creditTypeData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:150px" value="${creditTypeData.updaterDisplay}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:150px" value="<fmt:formatDate value="${creditTypeData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><textarea class="spinner" style="width:385px" readonly="readonly">${creditTypeData.remark}</textarea></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	$('#creditType_detail_creditType').val(renderGridValue('${creditTypeData.creditType}',fields.creditIntegralType));
	$('#changeType').val(renderGridValue('${creditTypeData.changeType}',fields.changeType));
</script>
