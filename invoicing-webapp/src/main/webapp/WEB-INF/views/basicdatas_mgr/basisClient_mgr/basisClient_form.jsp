<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="basisClient_mgr_basisClient_form" method="post" style="padding:15px;width: 570px">
<div title="基本信息" style="padding:15px">
    	<fieldset id="basisClient_mgr_basisClient_form_basisClientGenfieldset" style="padding:10px;" class="spinner">
			<legend>客户档案基本信息</legend>  
			<table  class="formtable"> 
				    <tr> 
				        <td>客户档案名称：</td>
						<td>
							<input type="hidden" id="basisClient_mgr_basisClient_form_clientId" name="clientId" value="${clientDate.clientId}" />
							<input id="basisClient_mgr_basisClient_form_clientName" name="clientName" class="easyui-validatebox spinner" required="true" style="width:168px;height: 18px;" value="${clientDate.clientName}"  />
						</td>
						<td style="padding-left:10px;">客户类型：</td>
						<td ><input id="basisClient_mgr_basisClient_form_clientTypeId" name="clientTypeId" value="${clientDate.clientTypeId}" /></td>
					</tr> 
					<tr>
					    <td>客户级别：</td>
						<td><input id="basisClient_mgr_basisClient_form_clientGrade" name="clientGrade" value='${clientDate.clientGrade}' /></td>
					    <td style="padding-left:10px;">客户来源：</td>
						<td><input id="basisClient_mgr_basisClient_form_clientSource" name="clientSource" value="${clientDate.clientSource}" /></td>
					 </tr>
					 <tr>
					    <td>公司规模：</td>
						<td><input id="basisClient_mgr_basisClient_form_companyScale" name="companyScale" value='${clientDate.companyScale}' /></td>
					    <td style="padding-left:10px;">公司性质：</td>
						<td><input id="basisClient_mgr_basisClient_form_companyNatureId" name="companyNatureId" value="${clientDate.companyNatureId}" /></td>
					 </tr>
					 <tr>
						<td>省：</td>
						<td><input id="basisClient_mgr_basisClient_form_province" name="province" class="easyui-validatebox spinner" style="width:168px;height: 18px;" value="${clientDate.province}" /></td>
					    <td style="padding-left:10px;">市：</td>
					    <td><input id="basisClient_mgr_basisClient_form_city" name="city" class="easyui-validatebox spinner" style="width:168px;height: 18px;" value="${clientDate.city}" /></td>
				 	</tr>
					 <tr>
						<td>详细地址：</td>
						<td><input name="adress" class="easyui-validatebox spinner" style="width:168px;height: 18px;" value="${clientDate.adress}"  /></td>
						<td style="padding-left:10px;">是否控制信用：</td>
						<td><input name="controlCredit" style="width:168px;height: 18px;" value="${clientDate.controlCredit}" class="easyui-combobox" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.yesOrNo"/></td>
					</tr>
					<tr>
						<td>公司法人：</td>
						<td><input name="corporate" class="easyui-validatebox spinner" style="width:168px;height: 18px;" value="${clientDate.corporate}"  /></td>
						<td style="padding-left:10px;">税号：</td>
						<td><input name="tariff" class="easyui-validatebox spinner" style="width:168px;height: 18px;" value="${clientDate.tariff}" /></td>
					</tr>
					<tr>
						<td>所属上级客户：</td>
						<td ><input id="basisClient_mgr_basisClient_form_superiorClientId" name="superiorClientId" value="${clientDate.superiorClientId}" /></td>
						<td style="padding-left:10px;">主营业务：</td>
						<td ><input  name="mainBusiness" class="easyui-validatebox spinner" style="width:168px;height: 18px;" value="${clientDate.mainBusiness}" /></td>
				   </tr> 
					<tr>
				      <td>附件：</td>
					  <td><input class="easyui-validatebox spinner" style="width:168px;height: 18px;" name="accessory"  value="${clientDate.accessory}" /></td>
				      <td style="padding-left:10px;">状态：</td>
					  <td><input style="width:168px" value="${clientDate.enabled}" name="enabled" class="easyui-combobox" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/></td>
				    </tr>
				    <tr>   
				     <td>销售代表：</td>
					 <td><input id="basisClient_mgr_basisClient_form_staffId" name="staffId"  value="${clientDate.staffId}" /></td>
				     <td style="padding-left:10px;">销售部门：</td>
					 <td>
					 	<input id="marketingDepartment" class="easyui-validatebox spinner" style="width:168px;height: 18px;" name="marketingDepartment"  value="${clientDate.marketingDepartment}" disabled="disabled"/>
					 </td>
				    </tr>
					<tr>
						<td>备 注：</td>
						<td colspan="3"> <textarea   name="remark" class="spinner" style="width:435px;"  >${clientDate.remark}</textarea></td>
					</tr>
				</table>
		</fieldset>
    </div>
    <div title="详细信息" style="padding:15px">
    	<fieldset id="basisClient_mgr_basisClient_form_connetGenfieldset" style="padding:10px;" class="spinner">
			<legend>详细信息</legend>  
			<table  class="formtable">
					 <tr>
					    <td>公司电话：</td>
						<td><input id="basisClient_mgr_basisClient_form_companyPhone" name="companyPhone" class="easyui-validatebox spinner" style="width:168px;height: 18px;" value='${clientDate.companyPhone}' validType="customReg['^\\d+(\\.\\d+)?$','<fmt:message key="public.thisNum.illegal"/>']"/></td>
					    <td style="padding-left:10px;">公司传真：</td>
						<td><input name="companyFax" class="spinner" style="width:168px;height: 18px;" value="${clientDate.companyFax}" /></td>
					 </tr>
					  <tr>
					    <td>公司网站：</td>
						<td><input  name="companyWebsite" class="spinner" style="width:168px;height: 18px;" value='${clientDate.companyWebsite}' /></td>
					    <td style="padding-left:10px;">公司邮箱：</td>
						<td><input name="companyEmail" class="spinner" style="width:168px;height: 18px;" value="${clientDate.companyEmail}" /></td>
					  </tr>
					   <tr>
					    <td>邮编：</td>
						<td><input  name="zipCode" class="spinner" style="width:168px" value='${clientDate.zipCode}' /></td>
					    <td style="padding-left:10px;">联系周期(周)：</td>
						<td><input name="contactCycle" class="easyui-validatebox spinner" style="width:168px;height: 18px;" value="${clientDate.contactCycle}" validType="customReg['^\\d+(\\.\\d+)?$','<fmt:message key="public.thisNum.illegal"/>']" missingMessage="请输入整数天数"/></td>
					 </tr>
					  <tr>
					    <td>价格政策：</td>
						<td><input  name="pricePolicy" style="width:168px;height: 18px;" value='${clientDate.pricePolicy}' class="easyui-combobox" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.province"/></td>
					    <td style="padding-left:10px;">开业年份：</td>
						<td><input name="clientCreate" class="easyui-datebox" style="width:168px;height: 18px;" value="<fmt:formatDate value="${clientDate.clientCreate}" pattern="yyyy-MM-dd HH:mm:ss"/>" /></td>
					 </tr> 
					 <tr>
					    <td>注册资金：</td>
						<td><input  name="registeredCapital" class="easyui-validatebox spinner" style="width:168px;height: 18px;" value='${clientDate.registeredCapital}' validType="customReg['^\\d+(\\.\\d+)?$','<fmt:message key="public.thisNum.illegal"/>']" missingMessage="请输入金额"/></td>
					    <td style="padding-left:10px;">建立关系：</td>
						<td><input name="clientCreate" class="easyui-datebox" style="width:168px;height: 18px;" value="<fmt:formatDate value="${clientDate.clientCreate}" pattern="yyyy-MM-dd HH:mm:ss"/>" /></td>
					 </tr> 
					 <tr>
					    <td>开户银行：</td>
						<td><input  name="bank" class="easyui-validatebox spinner" required="true" style="width:168px;height: 18px;" value='${clientDate.bank}' /></td>
					    <td style="padding-left:10px;">银行账户：</td>
						<td><input name="bankAccount" class="easyui-validatebox spinner" required="true" style="width:168px;height: 18px;" value="${clientDate.bankAccount}" /></td>
					 </tr>
			</table>
		</fieldset>
    </div> 
</form>

<script type="text/javascript">
	$('#basisClient_mgr_basisClient_form').tabs({
		border:true,
		onSelect:function(){
			$("div").remove(".validatebox-tip");//解决关闭窗体偶尔出现验证条bug
		}
	}); 
	//初始化客户类型下拉项
	$("#basisClient_mgr_basisClient_form_clientTypeId").combobox({
		data : $.parseJSON('${clientTypeDate}'),//controller传来的数据源
		height:18,
		width:170,
	    required:true,
	    editable : false,
	    missingMessage:'请选客户类型',
		textField : 'clientTypeName',//这里为名称
		valueField: 'clientTypeid'//这里为Id
	});
	
	//初始化客户级别下拉项
	$("#basisClient_mgr_basisClient_form_clientGrade").combobox({
		data : $.parseJSON('${clientLevelDate}'),//controller传来的数据源
		height:18,
		width:170,
	    required:true,
	    editable : false,
	    missingMessage:'请选客户级别',
		textField : 'clientLevelName',//这里为名称
		valueField: 'clientLevelId'//这里为Id
	});
	
	//初始化客户来源下拉项
	$("#basisClient_mgr_basisClient_form_clientSource").combobox({
		data : $.parseJSON('${clientSourceDate}'),//controller传来的数据源
		height:18,
		width:170,
	    required:true,
	    editable : false,
	    missingMessage:'请选客户来源',
		textField : 'clientSourceName',//这里为名称
		valueField: 'clientSourceId'//这里为Id
	});
	
	//初始化公司规模下拉项
	$("#basisClient_mgr_basisClient_form_companyScale").combobox({
		data : $.parseJSON('${companySizeDate}'),//controller传来的数据源
		height:18,
		width:170,
	    required:true,
	    editable : false,
	    missingMessage:'请选公司规模',
		textField : 'companySizeName',//这里为名称
		valueField: 'companySizeId'//这里为Id
	});
	
	//初始化公司性质下拉项
	$("#basisClient_mgr_basisClient_form_companyNatureId").combobox({
		data : $.parseJSON('${natureDate}'),//controller传来的数据源
		height:18,
		width:170,
	    required:true,
	    editable : false,
	    missingMessage:'请选公司性质',
		textField : 'natureName',//这里为名称
		valueField: 'natureId'//这里为Id
	});
	
	//初始化客户档案上级下拉项
	$("#basisClient_mgr_basisClient_form_superiorClientId").combobox({
		data : $.parseJSON('${clientCountDate}'),//controller传来的数据源
		height:18,
		width:170,
	    //required:true,
	    editable : false,
	    missingMessage:'请选客户档案上级',
		textField : 'clientName',//这里为名称
		valueField: 'clientId'//这里为IduserDate
	});
	
	//初始化员工下拉项
	$("#basisClient_mgr_basisClient_form_staffId").combobox({
		data : $.parseJSON('${userDate}'),//controller传来的数据源
		height:18,
		width:170,
	    required:true,
	    editable : false,
	    missingMessage:'请选员工',
		textField : 'userCnName',//这里为名称
		valueField: 'userId',//这里为Id
		onSelect:function(rowData){//在用户选择一行的时候触发
			$("#marketingDepartment").val(rowData.depDisplay);
		}
	});
</script>
