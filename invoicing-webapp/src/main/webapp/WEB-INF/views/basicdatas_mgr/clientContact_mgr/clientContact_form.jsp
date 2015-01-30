<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="clientContact_mgr_clientContact_form" method="POST" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>联系人名称：</td>
			<td>
				<input type="hidden" name="clientContactId" value="${clientContactDate.clientContactId}" />
				<input name="name"  class="easyui-validatebox spinner" style="width:168px;height: 18px;" required="true" value="${clientContactDate.name}"/>
			</td>
			<td style="padding-left: 15px">联系人类型：</td>
			<td><input id="clientContact_mgr_clientContact_form_contactTypeId" name="contactTypeId" value="${clientContactDate.contactTypeId}" /></td>
		</tr>
		<tr>
			<td>所属客户：</td>
			<td><input id="clientContact_mgr_clientContact_form_clientId" name="clientId" value="${clientContactDate.clientId}" /></td>
			<td style="padding-left:15px;">性别：</td>
			<td><input name="sex" style="width:170px;height: 18px;" value="${clientContactDate.sex}"  class="easyui-combobox" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.sex"/></td>
		</tr>
		<tr>
			<td>部门：</td>
			<td><input name="department"  class="easyui-validatebox spinner"style="width:168px;height: 18px;" value="${clientContactDate.department}" /></td>
			<td style="padding-left: 15px">职务：</td>
			<td><input name="post"  class="easyui-validatebox spinner"style="width:168px;height: 18px;" value="${clientContactDate.post}" /></td>
		</tr>
		<tr>
			<td>负责业务：</td>
			<td><input name="business"  class="easyui-validatebox spinner"style="width:168px;height: 18px;" value="${clientContactDate.business}" /></td>
			<td style="padding-left: 15px">工作电话：</td>
			<td><input name="workPhone"  class="easyui-validatebox spinner"style="width:168px;height: 18px;" value="${clientContactDate.workPhone}" /></td>
		</tr>
		<tr>
			<td>移动电话：</td>
			<td><input name="mobilephone"  class="easyui-validatebox spinner"style="width:168px;height: 18px;" value="${clientContactDate.mobilephone}" /></td>
			<td style="padding-left: 15px">传真：</td>
			<td><input name="fox"  class="easyui-validatebox spinner"style="width:168px;height: 18px;" value="${clientContactDate.fox}" /></td>
		</tr>
		<tr>
			<td>邮箱：</td>
			<td><input name="email"  class="easyui-validatebox spinner"style="width:168px;height: 18px;" value="${clientContactDate.email}" /></td>
			<td style="padding-left: 15px">状态：</td>
			<td><input name="enabled" style="width:170px;height: 18px;" value="${clientContactDate.enabled}"  class="easyui-combobox" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/></td>
		</tr>
		<tr>
			<td>家庭电话：</td>
			<td><input name="homePhone"  class="easyui-validatebox spinner"style="width:168px;height: 18px;" value="${clientContactDate.homePhone}" /></td>
			<td style="padding-left: 15px">家庭住址：</td>
			<td><input name="adrress"  class="easyui-validatebox spinner"style="width:168px;height: 18px;" value="${clientContactDate.adrress}" /></td>
		</tr>
		<tr>
			<td>MSN/QQ：</td>
			<td><input name="communications"  class="easyui-validatebox spinner"style="width:168px;height: 18px;" value="${clientContactDate.communications}" /></td>
			<td style="padding-left: 15px">序号：</td>
			<td><input maxlength="3" name="number" class="easyui-numberspinner spinner" value="${clientContactDate.number}" data-options="min:0,max:999,required:true,missingMessage:'只能输入整数'" style="width:170px;height: 18px;"/></td>
		</tr>
		<tr>
			<td>生日：</td>
			<td><input name="birthday"  class="easyui-datetimebox"style="width:168px;height: 18px;" value="${clientContactDate.birthday}" /></td>
			<td style="padding-left: 15px">爱好：</td>
			<td><input name="hobby"  class="easyui-validatebox spinner"style="width:168px;height: 18px;" value="${clientContactDate.hobby}" /></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><textarea name="remark" style="width:430px;" maxlength="255" class="spinner formta">${clientContactDate.remark}</textarea></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
//初始化客户联系人类型下拉项
$("#clientContact_mgr_clientContact_form_contactTypeId").combobox({
	data : $.parseJSON('${contactType}'),//controller传来的数据源
	height:18,
	width:170,
    required:true,
    editable : false,
    missingMessage:'请选择客户联系人类型',
	textField : 'contactTypeName',//这里为名称
	valueField: 'contactTypeId'//这里为Id
});
//初始化联系人的所属客户拉项
$("#clientContact_mgr_clientContact_form_clientId").combobox({
	data : $.parseJSON('${client}'),//controller传来的数据源
	height:18,
	width:170,
    required:true,
    editable : false,
    missingMessage:'请选择所属客户',
	textField : 'clientName',//这里为名称
	valueField: 'clientId'//这里为Id
});
</script>