<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="basisClient_mgr_basisClient_form" method="post" style="padding:15px;width: 570px">
<div title="基本信息" style="padding:15px">
    	<fieldset id="basisClient_mgr_basisClient_form_basisClientGenfieldset" style="padding:10px;" class="spinner">
			<legend>客户档案基本信息</legend>  
			<table  class="detailtable"> 
				    <tr> 
				        <td>客户档案名称：</td>
						<td>
							<input type="hidden" id="basisClient_mgr_basisClient_form_clientId" name="clientId" value="${clientDate.clientId}" />
							<input id="basisClient_mgr_basisClient_form_clientName" name="clientName" class="spinner" required="true" style="width:168px;height: 18px;" value="${clientDate.clientName}"  readonly="readonly"/>
						</td>
						<td style="padding-left:10px;">客户类型：</td>
						<td ><input id="basisClient_mgr_basisClient_form_clientTypeId" name="clientTypeId" class="spinner" required="true" style="width:168px;height: 18px;" value="${clientDate.clientTypeId}" readonly="readonly"/></td>
					</tr> 
					<tr>
					    <td>客户级别：</td>
						<td><input id="basisClient_mgr_basisClient_form_clientGrade" name="clientGrade" class="spinner" required="true" style="width:168px;height: 18px;" value='${clientDate.clientGrade}' readonly="readonly"/></td>
					    <td style="padding-left:10px;">客户来源：</td>
						<td><input id="basisClient_mgr_basisClient_form_clientSource" name="clientSource" class="spinner" required="true" style="width:168px;height: 18px;" value="${clientDate.clientSource}" readonly="readonly"/></td>
					 </tr>
					 <tr>
						<td>省：</td>
						<td><input id="basisClient_mgr_basisClient_form_province" name="province" class="spinner" required="true" style="width:168px;height: 18px;" value="${clientDate.province}" readonly="readonly"/></td>
					    <td style="padding-left:10px;">市：</td>
					    <td><input id="basisClient_mgr_basisClient_form_city" name="city" class="spinner" required="true" style="width:168px;height: 18px;" value="${clientDate.city}" readonly="readonly"/></td>
				 	</tr>
					 <tr>
						<td>详细地址：</td>
						<td><input name="adress" class="spinner" required="true" style="width:168px;height: 18px;" value="${clientDate.adress}" readonly="readonly"/></td>
						<td style="padding-left:10px;">是否控制信用：</td>
						<td><input name="controlCredit" id="basisClient_mgr_basisClient_form_controlCredit" class="spinner" required="true" style="width:168px;height: 18px;" value="${clientDate.controlCredit}" readonly="readonly"/></td>
					</tr>
					<tr>
						<td>公司法人：</td>
						<td><input name="corporate" class="spinner" required="true" style="width:168px;height: 18px;" value="${clientDate.corporate}" readonly="readonly"/></td>
						<td style="padding-left:10px;">税号：</td>
						<td><input name="tariff" class="spinner" required="true" style="width:168px;height: 18px;" value="${clientDate.tariff}" readonly="readonly"/></td>
					</tr>
					<tr>
						<td>所属上级客户：</td>
						<td ><input name="superiorClientId" class="spinner" required="true" style="width:168px;height: 18px;" value="${clientDate.superiorClientId}" readonly="readonly"/></td>
						<td style="padding-left:10px;">主营业务：</td>
						<td ><input  name="mainBusiness" class="spinner" required="true" style="width:168px;height: 18px;" value="${clientDate.mainBusiness}" readonly="readonly"/></td>
				   </tr> 
					<tr>
				      <td>附件：</td>
					  <td><input class="spinner" style="width:168px;height: 18px;" name="accessory"  value="${clientDate.accessory}" readonly="readonly"/></td>
				      <td style="padding-left:10px;">状态：</td>
					  <td><input style="width:168px" id="enabled" value="${clientDate.enabled}" name="enabled" readonly="readonly"/></td>
				    </tr>
				    <tr>   
				     <td>销售代表：</td>
					 <td><input class="spinner" required="true" style="width:168px;height: 18px;" name="staffId"  value="${clientDate.staffId}" readonly="readonly"/></td>
				     <td style="padding-left:10px;">销售部门：</td>
					 <td><input class="spinner" required="true" style="width:168px;height: 18px;" name="marketingDepartment"  value="${clientDate.marketingDepartment}" readonly="readonly"/></td>
				    </tr>
					<tr>
						<td>备 注：</td>
						<td colspan="3"> <textarea   name="remark" class="spinner" style="width:435px;" readonly="readonly">${clientDate.remark}</textarea></td>
					</tr>
				</table>
		</fieldset>
    </div>
    <div title="详细信息" style="padding:15px">
    	<fieldset id="basisClient_mgr_basisClient_form_connetGenfieldset" style="padding:10px;" class="spinner">
			<legend>详细信息</legend>  
			<table class="detailtable">
					 <tr>
					    <td>公司电话：</td>
						<td><input id="basisClient_mgr_basisClient_form_companyPhone" name="companyPhone" class="spinner" style="width:168px;height: 18px;" value='${clientDate.companyPhone}' readonly="readonly"/></td>
					    <td style="padding-left:10px;">公司传真：</td>
						<td><input name="companyFax" class="spinner" style="width:168px;height: 18px;" value="${clientDate.companyFax}" readonly="readonly"/></td>
					 </tr>
					  <tr>
					    <td>公司网站：</td>
						<td><input  name="companyWebsite" class="spinner" style="width:168px;height: 18px;" value='${clientDate.companyWebsite}' readonly="readonly"/></td>
					    <td style="padding-left:10px;">公司邮箱：</td>
						<td><input name="companyEmail" class="spinner" style="width:168px;height: 18px;" value="${clientDate.companyEmail}" readonly="readonly"/></td>
					  </tr>
					   <tr>
					    <td>邮编：</td>
						<td><input  name="zipCode" class="spinner" style="width:168px" value='${clientDate.zipCode}' readonly="readonly"/></td>
					    <td style="padding-left:10px;">联系周期(周)：</td>
						<td><input name="contactCycle" class="spinner" style="width:168px;height: 18px;" value="${clientDate.contactCycle}" readonly="readonly"/></td>
					 </tr>
					  <tr>
					    <td>价格政策：</td>
						<td><input  name="pricePolicy" id="basisClient_mgr_basisClient_form_pricePolicy" class="spinner" required="true" style="width:168px;height: 18px;" value='${clientDate.pricePolicy}' readonly="readonly"/></td>
					    <td style="padding-left:10px;">开业年份：</td>
						<td><input name="openedYear" class="spinner" style="width:168px;height: 18px;" value="<fmt:formatDate value="${clientDate.openedYear}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
					 </tr> 
					 <tr>
					    <td>注册资金：</td>
						<td><input  name="registeredCapital" class="spinner" style="width:168px;height: 18px;" value='<fmt:formatNumber value='${clientDate.registeredCapital}' pattern="#,#00.00元"/>' readonly="readonly"/></td>
					    <td style="padding-left:10px;">建立关系：</td>
						<td><input name="clientCreate" class="spinner" style="width:168px;height: 18px;" value="<fmt:formatDate value="${clientDate.clientCreate}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
					 </tr> 
					 <tr>
					    <td>开户银行：</td>
						<td><input  name="bank" class="spinner" required="true" style="width:168px;height: 18px;" value='${clientDate.bank}' readonly="readonly"/></td>
					    <td style="padding-left:10px;">银行账户：</td>
						<td><input name="bankAccount" class="spinner" required="true" style="width:168px;height: 18px;" value="${clientDate.bankAccount}" readonly="readonly"/></td>
					 </tr>
					 <tr>
						<td>创建者：</td>
						<td><input class="spinner" style="width:150px" value="${clientDate.creater}" readonly="readonly"/></td>
						<td>创建时间：</td>
						<td><input class="spinner" style="width:150px" value="<fmt:formatDate value="${clientDate.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
					</tr>
					<tr>
						<td>更新人：</td>
						<td><input class="spinner" style="width:150px" value="${clientDate.updater}" readonly="readonly"/></td>
						<td>更新时间：</td>
						<td><input class="spinner" style="width:150px" value="<fmt:formatDate value="${clientDate.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
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
	$('#basisClient_mgr_basisClient_form_controlCredit').val(renderGridValue('${clientDate.controlCredit}',fields.yesOrNo));
	$('#enabled').val(renderGridValue('${clientDate.enabled}',fields.status));
	$('#basisClient_mgr_basisClient_form_pricePolicy').val(renderGridValue('${clientDate.pricePolicy}',fields.province));
</script>
