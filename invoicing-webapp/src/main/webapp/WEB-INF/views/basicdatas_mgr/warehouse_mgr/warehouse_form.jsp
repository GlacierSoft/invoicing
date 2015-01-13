<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="creditType_mgr_creditType_form" method="POST" modelAttribute="parameterCredit" style="padding:15px" enctype="multipart/form-data">
	<table class="formtable" >
		<tr>
			<td>仓库名称：</td>
			<td>
				<input type="hidden" name="warehouseId" value="${warehouseDate.warehouseId}" />
				<input name="warehouseName"  class="easyui-validatebox spinner" style="width:168px;height: 20px;" required="true" value="${warehouseDate.warehouseName}"/>
			</td>
			<td style="padding-left: 15px;">所属部门：</td>
			<td>
				<input name="warehouseName" id="warehouseName"  class="easyui-validatebox spinner" style="width:168px;height: 20px;" required="true" value="${warehouseDate.warehouseName}"/>
			</td>
		</tr>
		<tr>
			<td>仓库管理：</td>
			<td><input name="warehouseManager" class="easyui-validatebox spinner" style="width:168px;height: 20px;" value="${warehouseDate.warehouseManager}" required="true"/></td>
		    <td style="padding-left: 15px;">仓库序号：</td>
			<td><input  name="orderNum" class="easyui-numberspinner spinner" style="width:168px;height: 20px;" value="${warehouseDate.orderNum}" required="true"/></td>
		</tr>
		<tr>
			<td>负责人员：</td>
			<td><input name="head" class="easyui-validatebox spinner" style="width:168px;height: 20px;" value="${warehouseDate.head}" required="true" /></td>
		    <td style="padding-left: 15px;">联系电话：</td>
			<td><input  name="phone" class="easyui-validatebox spinner" style="width:168px;height: 20px;" value="${warehouseDate.phone}" required="true"/></td>
		</tr>
		<tr>
			<td>零售库存：</td>
			<td><input name="retailLibraries" id="retailLibraries" class="easyui-combobox spinner" value="${warehouseDate.retailLibraries}" required="true"/></td>
		     <td style="padding-left: 15px;">仓库地址：</td>
			<td><input name="address" class="easyui-validatebox spinner" style="width:168px;height: 20px;" value="${warehouseDate.address}" required="true"/></td>
		</tr>
		<tr>
			<td>仓库分类：</td>
			<td colspan="3"><input name="warehouseManager" class="easyui-validatebox spinner" style="width:420px;height: 20px;" value="${warehouseDate.warehouseManager}" /></td>
		</tr>
		<tr>
		  <td>备注信息：</td>
		  <td colspan="3"><textarea style="width:420px;height: 40px;">${warehouseDate.remark}</textarea></td>
	    </tr>
	</table>
</form>
<script>
		$('#retailLibraries').combobox({
			valueField : 'value',
			//height:18,
			width : 168,
			textField : 'label',
			panelHeight : 'auto',
			editable : false,
			//required:true,
			data : fields.yesOrNo
		});
</script>
