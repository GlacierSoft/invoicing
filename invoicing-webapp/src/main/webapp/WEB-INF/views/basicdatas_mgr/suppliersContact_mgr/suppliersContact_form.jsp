<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="suppliersContact_mgr_suppliersContact_form" method="POST" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>联系人名称：</td>
			<td>
				<input type="hidden" name="supplierContactId" value="${suppliersContactDate.supplierContactId}" />
				<input name="name"  class="easyui-validatebox spinner" style="width:168px;height: 18px;" required="true" value="${suppliersContactDate.name}"/>
			</td>
			<td style="padding-left: 15px">联系人类型：</td>
			<td><input id="suppliersContact_mgr_suppliersContact_form_contactTypeId" name="contactTypeId" value="${suppliersContactDate.contactTypeId}" /></td>
		</tr>
		<tr>
			<td>所属供应商：</td>
			<td><input id="suppliersContact_mgr_suppliersContact_form_supplierId" name="supplierId" value="${suppliersContactDate.supplierId}" /></td>
			<td style="padding-left:15px;">性别：</td>
			<td><input name="sex" style="width:170px;height: 18px;" value="${suppliersContactDate.sex}"  class="easyui-combobox" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.sex"/></td>
		</tr>
		<tr>
			<td>部门：</td>
			<td><input name="department"  class="easyui-validatebox spinner"style="width:168px;height: 18px;" value="${suppliersContactDate.department}" /></td>
			<td style="padding-left: 15px">职务：</td>
			<td><input name="post"  class="easyui-validatebox spinner"style="width:168px;height: 18px;" value="${suppliersContactDate.post}" /></td>
		</tr>
		<tr>
			<td>负责业务：</td>
			<td><input name="responsibleBusiness"  class="easyui-validatebox spinner"style="width:168px;height: 18px;" value="${suppliersContactDate.responsibleBusiness}" /></td>
			<td style="padding-left: 15px">工作电话：</td>
			<td><input name="workPhone"  class="easyui-validatebox spinner"style="width:168px;height: 18px;" value="${suppliersContactDate.workPhone}" /></td>
		</tr>
		<tr>
			<td>移动电话：</td>
			<td><input name="mobileTelephone"  class="easyui-validatebox spinner"style="width:168px;height: 18px;" value="${suppliersContactDate.mobileTelephone}" /></td>
			<td style="padding-left: 15px">传真：</td>
			<td><input name="fax"  class="easyui-validatebox spinner"style="width:168px;height: 18px;" value="${suppliersContactDate.fax}" /></td>
		</tr>
		<tr>
			<td>邮箱：</td>
			<td><input name="postcode"  class="easyui-validatebox spinner"style="width:168px;height: 18px;" value="${suppliersContactDate.postcode}" /></td>
			<td style="padding-left: 15px">状态：</td>
			<td><input name="enabled" style="width:170px;height: 18px;" value="${suppliersContactDate.enabled}"  class="easyui-combobox" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/></td>
		</tr>
		<tr>
			<td>家庭电话：</td>
			<td><input name="homePhone"  class="easyui-validatebox spinner"style="width:168px;height: 18px;" value="${suppliersContactDate.homePhone}" /></td>
			<td style="padding-left: 15px">家庭住址：</td>
			<td><input name="homeAdress"  class="easyui-validatebox spinner"style="width:168px;height: 18px;" value="${suppliersContactDate.homeAdress}" /></td>
		</tr>
		<tr>
			<td>MSN：</td>
			<td><input name="msn"  class="easyui-validatebox spinner"style="width:168px;height: 18px;" value="${suppliersContactDate.msn}" /></td>
			<td style="padding-left: 15px">QQ：</td>
			<td><input name="qq"  class="easyui-validatebox spinner"style="width:168px;height: 18px;" value="${suppliersContactDate.qq}" /></td>
		</tr>
		<tr>
			<td>生日：</td>
			<td><input name="birthday"  class="easyui-datetimebox"style="width:168px;height: 18px;" value="${suppliersContactDate.birthday}" /></td>
			<td style="padding-left: 15px">爱好：</td>
			<td><input name="hobby"  class="easyui-validatebox spinner"style="width:168px;height: 18px;" value="${suppliersContactDate.hobby}" /></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><textarea name="remark" style="width:430px;" maxlength="255" class="spinner formta">${suppliersContactDate.remark}</textarea></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
//初始化供应商联系人类型下拉项
$("#suppliersContact_mgr_suppliersContact_form_contactTypeId").combobox({
	data : $.parseJSON('${contactType}'),//controller传来的数据源
	height:18,
	width:170,
    required:true,
    editable : false,
    missingMessage:'请选择供应商联系人类型',
	textField : 'contactTypeName',//这里为名称
	valueField: 'contactTypeId'//这里为Id
});
//初始化联系人的所属供应商拉项
$("#suppliersContact_mgr_suppliersContact_form_supplierId").combobox({
	data : $.parseJSON('${supplier}'),//controller传来的数据源
	height:18,
	width:170,
    required:true,
    editable : false,
    missingMessage:'请选择所属供应商',
	textField : 'suppliersName',//这里为名称
	valueField: 'supplierId'//这里为Id
});
</script>