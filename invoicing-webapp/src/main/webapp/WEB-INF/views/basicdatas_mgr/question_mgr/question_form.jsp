<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="question_mgr_question_form" method="POST" modelAttribute="parameterQuestion" style="padding:15px" enctype="multipart/form-data">
	<table class="formtable">
		<tr>
			<td>密保问题描述：</td>
			<td>
				<input type="hidden" name="questionId" value="${questionData.questionId}" />
				<input name="questionDes" class="easyui-validatebox spinner" style="width:268px;height: 16px;" required="true" value="${questionData.questionDes}" validType="customReg['^[\u0391-\uFFE5]{2,10}$']" data-options="missingMessage:'密保描述必须由1-20个中文字符组成'" />
			</td>
		</tr>
		<tr>
			<td>排序：</td>
			<td><input name="questionNum" class="easyui-numberspinner spinner" value="${questionData.questionNum}" data-options="min:0,max:999,missingMessage:'请输入信用级别排序'" style="width: 270px;height:18px;" min="1" max="99"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><textarea name="remark" style="width:268px;" maxlength="255" class="spinner formta">${questionData.remark}</textarea></td>
		</tr>
	</table>
</form>

