<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>退货原因：</td> 
			<td class="forminputtable" colspan="3">
				<input class="spinner" style="width:375px" value="${returnReasonDate.name}"  readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>退货序号：</td>
			<td><input class="spinner" style="width:150px"  value="${returnReasonDate.sequenced}" readonly="readonly"/></td>
			<td>是否启用：</td>
			<td colspan="3"><input id="enabled" class="spinner" style="width:150px"  value="${returnReasonDate.enabled}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建者：</td>
			<td><input class="spinner" style="width:150px" value="${returnReasonDate.creater}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:150px" value="<fmt:formatDate value="${returnReasonDate.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:150px" value="${returnReasonDate.updater}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:150px" value="<fmt:formatDate value="${returnReasonDate.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	$('#enabled').val(renderGridValue('${returnReasonDate.enabled}',fields.status));
</script>
