<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>仓库名称：</td> 
			<td>
				<input class="spinner" style="width:150px" value="${warehouseDate.warehouseName}"  readonly="readonly"/>
			</td>
			<td>仓库编号：</td>
			<td><input class="spinner" style="width:150px"  value="${warehouseDate.warehouseCode}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>仓库地址：</td>
			<td><input class="spinner" style="width:150px" value="${warehouseDate.address}" readonly="readonly"/></td>
			<td>仓库分类：</td>
			<td><input class="spinner" style="width:150px" value="${warehouseDate.address}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>仓库管理：</td>
			<td><input class="spinner" style="width:150px"  value="${warehouseDate.warehouseManager}" readonly="readonly"/></td>
			<td>联系电话：</td>
			<td ><input class="spinner" style="width:150px"  value="${warehouseDate.phone}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:150px" value="${warehouseDate.creater}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:150px" value="<fmt:formatDate value="${warehouseDate.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:150px" value="${warehouseDate.updater}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:150px" value="<fmt:formatDate value="${warehouseDate.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3">
			     <input class="spinner" style="width:320px" value="${warehouseDate.remark}" readonly="readonly"/>
		   </td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	$('#enabled').val(renderGridValue('${suppliersGradeDate.enabled}',fields.status));
</script>
