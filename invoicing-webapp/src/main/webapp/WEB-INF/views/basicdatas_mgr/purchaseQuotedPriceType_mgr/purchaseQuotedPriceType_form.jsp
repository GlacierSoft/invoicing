<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>名称：</td>
			<td>
				<input type="hidden" name="quotedPriceTypeId" value="${quotedPriceTypeData.quotedPriceTypeId}" />
				<input name="name" class="easyui-validatebox spinner" style="width:268px;height: 16px;" required="true" value="${quotedPriceTypeData.name}" />
			</td>
		</tr>
		<tr>
			<td>序号：</td>
			<td><input name="sequenced" class="easyui-numberspinner spinner" value="${quotedPriceTypeData.sequenced}" data-options="min:0,max:999,missingMessage:'请输入序号'" value="10" style="width: 270px;height:18px;" min="1" max="99"/></td>
		</tr> 
		<tr>
			<td>状态：</td> 
		    <td>
			<input id="enabled" name="enabled"  style="width:268px;" value="${quotedPriceTypeData.enabled}" class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
		</tr>
		
	</table>
</form>
