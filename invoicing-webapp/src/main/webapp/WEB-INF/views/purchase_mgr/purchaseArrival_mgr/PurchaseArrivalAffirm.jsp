<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui"
	uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<!-- 所有列表面板和表格 -->
<form id="purchaseArrival_mgr_affirmPurchaseArrival_form" method="post" style="padding:15px">
<table class="formtable" width=600>
	<tr>
		<td>采购到货到货单：</td>
		<td colspan="3">
		<input type="hidden" id="purchaseArrival_mgr_affirmPurchaseArrival_form_purArrivalId" name="purArrivalId" value="${purchaseDate.purArrivalId}" />
		<input id="purchaseArrival_mgr_affirmPurchaseArrival_form_arrivalCode" name="arrivalCode" value="${purchaseDate.arrivalCode}" class="spinner" style="width:198px;height: 18px;" disabled="disabled"/></td>
	</tr>
	<tr>
		<td>货物签收日期：</td>
		<td><input id="purchaseArrival_mgr_affirmPurchaseArrival_form_signDate" name="signDate" class="easyui-datebox" style="width:168px;height: 18px;" /></td>
		<td>货物签收人：</td>
		<td><input id="purchaseArrival_mgr_affirmPurchaseArrival_form_signPerson" name="signPerson"/></td>
	</tr>
	<tr>
		<td>备注</td>
		<td colspan="3">
			<textarea id="purchaseArrival_mgr_affirmPurchaseArrival_form_remark" name="remark" class="easyui-validatebox spinner" style="width:320px;height: 50px" ></textarea>
		</td>
	</tr>
	<tr>
		<td>收货确认日期：</td>
		<td colspan="3"><input id="purchaseArrival_mgr_affirmPurchaseArrival_form_affirmDate" name="affirmDate" class="easyui-datebox" style="width:168px;height: 18px;" /></td>
	</tr>
	<tr>
		<td>收货确认人：</td>
		<td><input id="purchaseArrival_mgr_affirmPurchaseArrival_form_affirmPerson" name="affirmPerson"/></td>
		<td>收货确认部门：</td>
		<td><input id="purchaseArrival_mgr_affirmPurchaseArrival_form_affirmDep" name="affirmDep" class="easyui-validatebox spinner" style="width:168px;height: 18px;" disabled="disabled"/></td>
	</tr>
</table>
</form>
<script type="text/javascript">
//初始化员工下拉项
$("#purchaseArrival_mgr_affirmPurchaseArrival_form_affirmPerson").combobox({
	data : $.parseJSON('${userDate}'),//controller传来的数据源
	height:18,
	width:170,
    required:true,
    editable : false,
    missingMessage:'请选员工',
	textField : 'userCnName',//这里为名称
	valueField: 'userId',//这里为Id
	onSelect:function(rowData){//在用户选择一行的时候触发
		$("#purchaseArrival_mgr_affirmPurchaseArrival_form_affirmDep").val(rowData.depDisplay);
	}
});

//初始化验证人下拉项
$("#purchaseArrival_mgr_affirmPurchaseArrival_form_signPerson").combobox({
	data : $.parseJSON('${userDate}'),//controller传来的数据源
	height:18,
	width:170,
    required:true,
    editable : false,
    missingMessage:'请选员工',
	textField : 'userCnName',//这里为名称
	valueField: 'userCnName',//这里为Id
});
</script>