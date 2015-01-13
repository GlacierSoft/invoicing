<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>应付类型名称：</td> 
			<td class="forminputtable" colspan="3"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input class="spinner" style="width:375px" id="financePayableType_detail_financePayableType" value="${financePayableTypeDate.name}"  readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>序号：</td>
			<td><input class="spinner" style="width:150px"  value="${financePayableTypeDate.sequenced}" readonly="readonly"/></td>
			<td>状态：</td>
			<td colspan="3"><input id="enabled" class="spinner" style="width:150px"  value="${financePayableTypeDate.enabled}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建者：</td>
			<td><input class="spinner" style="width:150px" value="${financePayableTypeDate.creater}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:150px" value="<fmt:formatDate value="${financePayableTypeDate.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:150px" value="${financePayableTypeDate.updater}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:150px" value="<fmt:formatDate value="${financePayableTypeDate.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	$('#enabled').val(renderGridValue('${financePayableTypeDate.enabled}',fields.status));
</script>
