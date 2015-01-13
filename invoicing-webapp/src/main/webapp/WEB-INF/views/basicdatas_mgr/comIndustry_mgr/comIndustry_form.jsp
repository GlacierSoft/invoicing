<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="industryType_mgr_industryType_form" method="POST" modelAttribute="parameterCredit" style="padding:15px" enctype="multipart/form-data">
	<table class="formtable">
		<tr>
			<td>行业类型名称：</td>
			<td>
				<input type="hidden" name="industryId" value="${parComIndustryDate.industryId}" />
				<input name="industryName"  class="easyui-validatebox spinner" style="width:268px" required="true" value="${parComIndustryDate.industryName}"/>
			</td>
		</tr>
		<tr>
			<td>排序：</td>
			<td><input maxlength="3" name="industyCode" class="easyui-numberspinner spinner" style="width:268px" value="${parComIndustryDate.industyCode}" data-options="min:0,max:9999,required:true,missingMessage:'请输入写信用积分,只能输入整数'" style="width: 270px;height:18px;"/></td>
		</tr>
		<tr>
			<td>状态：</td>
			<td><input id="deliverType_from_deliverType" name="enabled" style="width:268px" value="${parComIndustryDate.enabled}"  class="easyui-combobox" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/></td>
		</tr>
	</table>
</form>