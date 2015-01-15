<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="purchaseArrival_mgr_purchaseArrival_form" method="post" style="padding:15px;width: 570px">
<div title="基本信息" style="padding:15px">
    	<fieldset id="purchaseArrival_mgr_purchaseArrival_form_purchaseArrivalGenfieldset" style="padding:10px;" class="spinner">
			<legend>采购到货基本信息</legend>  
			<table  class="formtable"> 
				    <tr> 
				        <td>到货日期：</td>
						<td>
							<input type="hidden" id="purchaseArrival_mgr_purchaseArrival_form_purArrivalId" name="purArrivalId" value="${purchaseDate.purArrivalId}" />
							<input id="purchaseArrival_mgr_purchaseArrival_form_arrivalDate" name="clientName" class="easyui-datebox" 
							value="<fmt:formatDate value="${purchaseDate.arrivalDate}" pattern="yyyy-MM-dd HH:mm:ss"/>"  required="true" style="width:168px;height: 18px;" />
						</td>
						<td style="padding-left:10px;">采购类型：</td>
						<td><input id="purchaseArrival_mgr_purchaseArrival_form_purchaseTypeId" name="purchaseTypeId" value='${purchaseDate.purchaseTypeId}' /></td>
					</tr> 
					<tr>
					    <td>所属仓库：</td>
						<td ><input id="purchaseArrival_mgr_purchaseArrival_form_storage" name="storage" value="${purchaseDate.storage}" /></td>
					    <td style="padding-left:10px;">供应商：</td>
						<td><input id="purchaseArrival_mgr_purchaseArrival_form_supplierId" name="supplierId" value="${purchaseDate.supplierId}" /></td>
					 </tr>
					 <tr>
					    <td>合同编号：</td>
						<td><input id="purchaseArrival_mgr_purchaseArrival_form_contractCode" name="contractCode" value='${purchaseDate.contractCode}' 
							class="easyui-validatebox spinner" style="width:168px;height: 18px;"/></td>
					    <td style="padding-left:10px;">供应商地址：</td>
						<td><input id="purchaseArrival_mgr_purchaseArrival_form_supplierAdd" name="supplierAdd" value="${purchaseDate.supplierAdd}" 
							class="easyui-validatebox spinner" style="width:168px;height: 18px;"/></td>
					 </tr>
					 <tr>
						<td>联系人：</td>
						<td><input id="purchaseArrival_mgr_purchaseArrival_form_linkman" name="linkman" class="easyui-validatebox spinner" style="width:168px;height: 18px;" value="${purchaseDate.linkman}" /></td>
					    <td style="padding-left:10px;">联系电话：</td>
					    <td><input id="purchaseArrival_mgr_purchaseArrival_form_phone" name="phone" class="easyui-validatebox spinner" style="width:168px;height: 18px;" value="${purchaseDate.phone}" /></td>
				 	</tr>
					 <tr>
						<td>传真：</td>
						<td><input id="purchaseArrival_mgr_purchaseArrival_form_fax" name="fax" class="easyui-validatebox spinner" style="width:168px;height: 18px;" value="${purchaseDate.fax}"  /></td>
						<td style="padding-left:10px;">交货方式：</td>
						<td><input id="purchaseArrival_mgr_purchaseArrival_form_deliveryType" name="deliveryType" value="${purchaseDate.deliveryType}" /></td>
					</tr>
					<tr>
						<td>交货期限：</td>
						<td><input id="purchaseArrival_mgr_purchaseArrival_form_deliveryDead" name="deliveryDead" class="easyui-datebox" value="<fmt:formatDate value="${purchaseDate.deliveryDead}" pattern="yyyy-MM-dd HH:mm:ss"/>" 
						style="width:168px;height: 18px;" /></td>
						<td style="padding-left:10px;">交货地址：</td>
						<td><input id="purchaseArrival_mgr_purchaseArrival_form_deliveryAdd" name="deliveryAdd" class="easyui-validatebox spinner" style="width:168px;height: 18px;" value="${purchaseDate.deliveryAdd}" /></td>
					</tr>
					<tr>
						<td>验收人：</td>
						<td><input id="purchaseArrival_mgr_purchaseArrival_form_acceptor" name="acceptor" value="${purchaseDate.acceptor}" /></td>
				    	<td style="padding-left:10px;">附件：</td>
					  <td><input class="easyui-validatebox spinner" style="width:168px;height: 18px;" name="accessory"  value="${purchaseDate.accessory}" /></td>
				    </tr> 
				    <tr>   
				     <td>经办人：</td>
					 <td><input id="purchaseArrival_mgr_purchaseArrival_form_operators" name="operators"  value="${purchaseDate.operators}" /></td>
				     <td style="padding-left:10px;">经办部门：</td>
					 <td>
					 	<input id="operatorDep" class="easyui-validatebox spinner" style="width:168px;height: 18px;" name="operatorDep"  value="${purchaseDate.operatorDep}" disabled="disabled"/>
					 </td>
				    </tr>
					<tr>
						<td>备 注：</td>
						<td colspan="3"> <textarea   name="remark" class="spinner" style="width:435px;"  >${purchaseDate.remark}</textarea></td>
					</tr>
				</table>
		</fieldset>
    </div>
    <div title="详细信息" style="padding:15px">
    	<fieldset id="purchaseArrival_mgr_purchaseArrival_form_connetGenfieldset" style="padding:10px;" class="spinner">
			<legend>发票/物流</legend>  
			<table  class="formtable">
					 <tr>
				      <td style="padding-left:10px;">是否开票：</td>
					  <td><input style="width:168px" value="${purchaseDate.invoice}" name="invoice" class="easyui-combobox" 
					  	  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.yesOrNo"/></td>
					  <td style="padding-left:10px;">状态：</td>
					  <td><input style="width:168px" value="${purchaseDate.enabled}" name="enabled" class="easyui-combobox" 
					  	  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/></td>
				     </tr>
					 <tr>
					    <td>发票类型：</td>
						<td><input style="width:168px" value="${purchaseDate.invoiceTypeId}" name="invoiceTypeId" class="easyui-combobox" 
					  	  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/></td>
					    <td style="padding-left:10px;">约定支付方式：</td>
						<td><input id="purchaseArrival_mgr_purchaseArrival_form_paymentTypeId" name="paymentTypeId"  value="${purchaseDate.paymentTypeId}" /></td>
					 </tr>
					  <tr>
					    <td>运费结算方式：</td>
						<td><input id="purchaseArrival_mgr_purchaseArrival_form_logSettlementId" style="width:168px" value="${purchaseDate.logSettlementId}" name="logSettlementId" class="easyui-combobox" 
					  	  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/></td>
					    <td style="padding-left:10px;">运单号：</td>
						<td><input name="logCode" class="spinner" style="width:168px;height: 18px;" value="${purchaseDate.logCode}" /></td>
					  </tr>
					   <tr>
					    <td>运费总额：</td>
						<td><input  name="logTotalTmount" class="spinner" style="width:168px;height: 18px;" value='${purchaseDate.logTotalTmount}' /></td>
					    <td style="padding-left:10px;">物流公司：</td>
						<td><input id="purchaseArrival_mgr_purchaseArrival_form_logCompany" name="logCompany"  value="${purchaseDate.logCompany}" /></td>
					 </tr>
					  <tr>
					    <td>物流联系人：</td>
						<td><input  name="logLinkman" style="width:168px;height: 18px;" class="spinner" value='${purchaseDate.logLinkman}' /></td>
					    <td style="padding-left:10px;">物流电话：</td>
						<td><input  name="logPhone" style="width:168px;height: 18px;" class="spinner" value='${purchaseDate.logPhone}' /></td>
					 </tr> 
					 <tr>
					    <td>总金额：</td>
						<td colspan="3"><input  name="totalAmount" class="easyui-validatebox spinner" style="width:168px;height: 18px;" value='${purchaseDate.totalAmount}' /></td>
					 </tr> 
					 <tr>
					    <td>付款约定：</td>
						<td colspan="3"><input id="purchaseArrival_mgr_purchaseArrival_form_paymentAgrId" name="paymentAgrId" value="${purchaseDate.paymentAgrId}" /></td>
					 </tr>
			</table>
		</fieldset>
    </div> 
</form>

<script type="text/javascript">
	$('#purchaseArrival_mgr_purchaseArrival_form').tabs({
		border:true,
		onSelect:function(){
			$("div").remove(".validatebox-tip");//解决关闭窗体偶尔出现验证条bug
		}
	}); 
	
	//初始化采购类型下拉项
	$("#purchaseArrival_mgr_purchaseArrival_form_purchaseTypeId").combobox({
		data : $.parseJSON('${purchaseTypeDate}'),//controller传来的数据源
		height:18,
		width:170,
	    required:true,
	    editable : false,
	    missingMessage:'请选采购类型',
		textField : 'name',//这里为名称
		valueField: 'purchaseTypeId'//这里为IduserDate
	});
	 
	//初始化供应商下拉项
	$("#purchaseArrival_mgr_purchaseArrival_form_supplierId").combobox({
		data : $.parseJSON('${suppliersDate}'),//controller传来的数据源
		height:18,
		width:170,
	    required:true,
	    editable : false,
	    missingMessage:'请选供应商',
		textField : 'name',//这里为名称
		valueField: 'purchaseTypeId'//这里为IduserDate
	});
	
	//初始化交货方式下拉项
	$("#purchaseArrival_mgr_purchaseArrival_form_deliveryType").combobox({
		data : $.parseJSON('${deliverTypeDate}'),//controller传来的数据源
		height:18,
		width:170,
	    required:true,
	    editable : false,
	    missingMessage:'请选交货方式',
		textField : 'deliverTypeName',//这里为名称
		valueField: 'deliverTypeId'//这里为IduserDate
	});
	 
	//初始化员工下拉项
	$("#purchaseArrival_mgr_purchaseArrival_form_operators").combobox({
		data : $.parseJSON('${userDate}'),//controller传来的数据源
		height:18,
		width:170,
	    required:true,
	    editable : false,
	    missingMessage:'请选员工',
		textField : 'userCnName',//这里为名称
		valueField: 'userId',//这里为Id
		onSelect:function(rowData){//在用户选择一行的时候触发
			$("#operatorDep").val(rowData.depDisplay);
		}
	});
	
	//初始化验证人下拉项
	$("#purchaseArrival_mgr_purchaseArrival_form_acceptor").combobox({
		data : $.parseJSON('${userDate}'),//controller传来的数据源
		height:18,
		width:170,
	    required:true,
	    editable : false,
	    missingMessage:'请选员工',
		textField : 'userCnName',//这里为名称
		valueField: 'userId',//这里为Id
	});
</script>
