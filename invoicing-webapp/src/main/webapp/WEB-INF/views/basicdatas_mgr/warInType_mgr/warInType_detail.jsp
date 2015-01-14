<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>入库类型名称：</td> 
			<td class="forminputtable" colspan="3"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input class="spinner" style="width:375px" id="warInType_detail_warInType" name="warInTypeName" value="${warInTypeDate.inTypeName}"  readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>序号：</td>
			<td><input class="spinner" style="width:150px"  value="${warInTypeDate.orderNum}" readonly="readonly"/></td>
			<td>状态：</td>
			<td colspan="3"><input id="enabled" class="spinner" style="width:150px"  value="${warInTypeDate.enabled}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建者：</td>
			<td><input class="spinner" style="width:150px" value="${warInTypeDate.creater}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:150px" value="<fmt:formatDate value="${warInTypeDate.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:150px" value="${warInTypeDate.updater}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:150px" value="<fmt:formatDate value="${warInTypeDate.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	$('#enabled').val(renderGridValue('${warInTypeDate.enabled}',fields.status));
</script>
