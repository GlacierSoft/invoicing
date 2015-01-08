<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable" >
		<tr>
			<td>行业名称：</td>
			<td>
				<input type="hidden"  name="industryId" value="${suppliersIndustryDate.industryId}" readonly="readonly" />
				<input style="width:150px;height: 20px;" name="industryName" value="${suppliersIndustryDate.industryName}" class="easyui-validatebox spinner"  required="true" readonly="readonly"/>
			</td>
			<td>行业状态：</td>
			<td>
			<input id="suppliersIndustry_enabled" name="status"  style="width:150px;" readonly="readonly" value="${suppliersIndustryDate.enabled}" class="spinner"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td>
			<input name="creater" readonly="readonly" style="width:150px;" value="${suppliersIndustryDate.creater}" class="easyui-validatebox spinner"/>
			</td>
			<td>创建时间：</td>
			<td>
			<input  name="createTime" readonly="readonly" style="width:150px;" value="<fmt:formatDate value="${suppliersIndustryDate.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" class="easyui-validatebox spinner"/>
			</td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td>
			<input name="updater" readonly="readonly" style="width:150px;" value="${suppliersIndustryDate.updater}" class="easyui-validatebox spinner"/>
			</td>
			<td>更新时间：</td>
			<td>
			<input  name="updateTime" readonly="readonly" style="width:150px;" value="<fmt:formatDate value="${suppliersIndustryDate.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" class="easyui-validatebox spinner"/>
			</td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3">
				<textarea  name="remark" readonly="readonly" style="width:300px;" class="spinner formta">${suppliersIndustryDate.remark}</textarea>
			</td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	$('#suppliersIndustry_enabled').val(renderGridValue('${suppliersIndustryDate.enabled}',fields.status));
</script>
