<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable" width="800">
		<tr>
			<td>信誉度类型名称：</td>
			<td colspan="3">
				<input type="hidden" id="memberGrade_mgr_memberGrade_form_creditworthinessTypeId" name="creditworthinessTypeId" value="${creditworthinessTypeDate.creditworthinessTypeId}" />
				<input id="memberGrade_mgr_memberGrade_form_creditworthinessType" style="width:650px;height: 20px;" name="creditworthinessType" value="${creditworthinessTypeDate.creditworthinessType}" class="easyui-validatebox spinner"  required="true" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>改变类型：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_changeType" name="changeType"  style="width:268px;" readonly="readonly" value="${creditworthinessTypeDate.changeType}" class="spinner"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
			<td>改变值：</td>
			<td>
				<input id="memberGrade_mgr_memberGrade_form_changeValue" style="width:268px;height: 20px;" name="changeValue" value="${creditworthinessTypeDate.changeValue}" class="easyui-validatebox spinner"  required="true" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_createrDisplay" name="createrDisplay" readonly="readonly" style="width:268px;" value="${creditworthinessTypeDate.createrDisplay}" class="easyui-validatebox spinner"/>
			</td>
			<td>创建时间：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_createTime" name="createTime" readonly="readonly" style="width:268px;" value="<fmt:formatDate value="${creditworthinessTypeDate.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" class="easyui-validatebox spinner"/>
			</td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_updaterDisplay" name="gradeCashpayment" readonly="readonly" style="width:268px;" value="${creditworthinessTypeDate.updaterDisplay}" class="easyui-validatebox spinner"/>
			</td>
			<td>更新时间：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_updateTime" name="updateTime" readonly="readonly" style="width:268px;" value="<fmt:formatDate value="${creditworthinessTypeDate.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" class="easyui-validatebox spinner"/>
			</td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3">
				<textarea id="memberGrade_mgr_memberGrade_form_remark" name="remark" readonly="readonly" style="width:670px;" class="spinner formta">${creditworthinessTypeDate.remark}</textarea>
			</td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	$('#memberGrade_mgr_memberGrade_form_changeType').val(renderGridValue('${creditworthinessTypeDate.changeType}',fields.changeType));
</script>
