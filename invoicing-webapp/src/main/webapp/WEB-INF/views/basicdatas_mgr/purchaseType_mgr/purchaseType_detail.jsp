<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable" >
		<tr>
			<td>等级名称：</td>
			<td>
				<input type="hidden"  name="purchaseTypeId" value="${purchaseTypeDate.purchaseTypeId}" readonly="readonly" />
				<input style="width:150px;height: 20px;" name="name" value="${purchaseTypeDate.name}" class="easyui-validatebox spinner"  required="true" readonly="readonly"/>
			</td>
			<td>等级状态：</td>
			<td>
			<input id="purchaseType_enabled" name="status"  style="width:150px;" readonly="readonly" value="${purchaseTypeDate.enabled}" class="spinner"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td>
			<input name="creater" readonly="readonly" style="width:150px;" value="${purchaseTypeDate.creater}" class="easyui-validatebox spinner"/>
			</td>
			<td>创建时间：</td>
			<td>
			<input  name="createTime" readonly="readonly" style="width:150px;" value="<fmt:formatDate value="${purchaseTypeDate.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" class="easyui-validatebox spinner"/>
			</td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td>
			<input name="updater" readonly="readonly" style="width:150px;" value="${purchaseTypeDate.updater}" class="easyui-validatebox spinner"/>
			</td>
			<td>更新时间：</td>
			<td>
			<input  name="updateTime" readonly="readonly" style="width:150px;" value="<fmt:formatDate value="${purchaseTypeDate.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" class="easyui-validatebox spinner"/>
			</td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3">
				<textarea  name="remark" readonly="readonly" style="width:300px;" class="spinner formta"></textarea>
			</td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	$('#purchaseType_enabled').val(renderGridValue('${purchaseTypeDate.enabled}',fields.status));
</script>
