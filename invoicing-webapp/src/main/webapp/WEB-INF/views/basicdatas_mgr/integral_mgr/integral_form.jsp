<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>积分级别名称：</td>
			<td>
				<input type="hidden" name="integralId" value="${integralData.integralId}" />
				<input name="integralName" class="easyui-validatebox spinner" style="width:268px" required="true" value="${integralData.integralName}" validType="customReg['^[\u0391-\uFFE5]{2,10}$','<fmt:message key="ParameterIntegral.integralName.illegal"/>']"/>
			</td>
		</tr>
		<tr>
			<td>开始积分：</td>
			<td><input name="integralBegin" class="easyui-numberspinner spinner" value="${integralData.integralBegin}" data-options="min:0,max:9999,required:true,missingMessage:'请输入积分级别开始积分,只能输入整数'" style="width: 270px;height:18px;"/></td>
		</tr>
		<tr>
			<td>结束积分：</td>
			<td><input name="integralEnd" class="easyui-numberspinner spinner" value="${integralData.integralEnd}" data-options="min:0,max:9999,required:true,missingMessage:'请输入积分级别开始积分,只能输入整数'" style="width: 270px;height:18px;"/></td>
		</tr>
		<tr>
			<td>排序：</td>
			<td><input name="integralNum" class="easyui-numberspinner spinner" value="${integralData.integralNum}" data-options="min:0,max:99,missingMessage:'请输入信用级别排序'" style="width: 270px;height:18px;" min="1" max="99"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><textarea name="remark" style="width:268px;" maxlength="255" class="spinner formta">${integralData.remark}</textarea></td>
		</tr>
	</table>
</form>
