<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="purchaseReturn_mgr_purchaseReturn_form" method="post" style="padding:15px;width: 555px">
<div title="基本信息" style="padding:15px">
    	<fieldset id="user_mgr_user_form_userGenfieldset" style="padding:10px;" class="spinner">
			<legend>采购退货基本信息</legend>  
			<table  class="detailtable"> 
				    <tr> 
				        <td>退货编号：</td>
						<td >
						    <input type="hidden" id="purReturnId" name="purReturnId" value="${purchaseReturnDate.purReturnId }" /> 
						    <input id="returnCode" name="returnCode" class="spinner" style="width:168px;" value="${purchaseReturnDate.returnCode}" readonly="readonly"/>
						</td>
				        <td style="padding-left:10px;">采购类型：</td>
						<td>
							<input id="purchaseType" name="purchaseType" class="spinner" style="width:168px" value="${purchaseReturnDate.purchaseType }"  readonly="readonly"/>
						</td>
					</tr> 
					<tr> 
					    <td>所属仓库：</td>
						<td><input id="storage" name="storage" class="spinner" style="width:168px" value="${purchaseReturnDate.storage }" readonly="readonly"/></td>
					    <td style="padding-left:10px;">供应商：</td>
						<td><input id="supplierId" name="supplierId" class="spinner" style="width:168px" value="${purchaseReturnDate.supplierId}" readonly="readonly"/></td>
					 </tr>
					 <tr>
						<td> 供应商地址：</td>
						<td><input id="supplierAdd" name="supplierAdd" class="spinner" style="width:168px" value="${purchaseReturnDate.supplierAdd }" readonly="readonly"/></td>
					    <td style="padding-left:10px;">联系电话：</td>
					    <td><input id="phone" name="phone" class="spinner" style="width:168px" value="${purchaseReturnDate.phone}" readonly="readonly"/></td>
				 	</tr>
				 	<tr>
						<td>联系人：</td>
						<td ><input name="linkman" class="spinner" style="width:168px" value="${purchaseReturnDate.linkman}" readonly="readonly"/></td>
						<td style="padding-left:10px;">传真：</td>
						<td ><input  name="fax" class="spinner" style="width:168px" value="${purchaseReturnDate.fax}" readonly="readonly"/></td>
				   </tr> 
				   <tr>
						<td>退货日期：</td>
						<td><input class="spinner" style="width:168px" value="${purchaseReturnDate.returnDate}"  readonly="readonly"/></td>
						<td style="padding-left:10px;">退货方式：</td>
						<td><input class="spinner" style="width:168px" value="${purchaseReturnDate.returnedPurchaseTypeId}" readonly="readonly"/></td>
					</tr>
					<tr>
						<td>退货期限：</td>
						<td><input class="spinner" style="width:168px" value="${purchaseReturnDate.returnDeadlines}"  readonly="readonly"/></td>
						<td style="padding-left:10px;">退货日期：</td>
						<td><input class="spinner" style="width:168px" value="${purchaseReturnDate.refundDeadlines}" readonly="readonly"/></td>
					</tr>
					<tr>
					<td style="padding-left:10px;">退货原因：</td>
						<td><input class="spinner" style="width:168px" value="${purchaseReturnDate.returnReasonId}" readonly="readonly"/></td>
						<td>退货说明：</td>
						<td><input class="spinner" style="width:168px" value="${purchaseReturnDate.returnPolicy}"  readonly="readonly"/></td>
					</tr>
					<tr>
						<td>支付方式：</td>
						<td><input class="spinner" style="width:168px" value="${purchaseReturnDate.paymentTypeId}"  readonly="readonly"/></td>
						<td style="padding-left:10px;">运费结算：</td>
						<td><input class="spinner" style="width:168px" value="${purchaseReturnDate.logSettlement}" readonly="readonly"/></td>
					</tr>
					<tr>
						<td>运单号：</td>
						<td><input class="spinner" style="width:168px" value="${purchaseReturnDate.logCode}"  readonly="readonly"/></td>
						<td style="padding-left:10px;">运费总额：</td>
						<td><input class="spinner" style="width:168px" value="${purchaseReturnDate.logTotalAmount}" readonly="readonly"/></td>
					</tr>
					<tr>
						<td>物流公司：</td>
						<td><input class="spinner" style="width:168px" value="${purchaseReturnDate.logCode}"  readonly="readonly"/></td>
						<td style="padding-left:10px;">物流联系人：</td>
						<td><input class="spinner" style="width:168px" value="${purchaseReturnDate.logLinkman}" readonly="readonly"/></td>
					</tr>
					<tr>
						<td>跟踪状态：</td>
						<td><input class="spinner" style="width:168px" value="${purchaseReturnDate.paymentState}"  readonly="readonly"/></td>
						<td style="padding-left:10px;">未付款金额：</td>
						<td><input class="spinner" style="width:168px" value="${purchaseReturnDate.paymentState}" readonly="readonly"/></td>
					</tr>
					<tr>
						<td>已付款金额：</td>
						<td><input class="spinner" style="width:168px" value="${purchaseReturnDate.alrPayAmo}"  readonly="readonly"/></td>
						<td style="padding-left:10px;">开票状态：</td>
						<td><input class="spinner" style="width:168px" value="${purchaseReturnDate.invState}" readonly="readonly"/></td>
					</tr>
					<tr>
						<td>未开票金额：</td>
						<td><input class="spinner" style="width:168px" value="${purchaseReturnDate.notInvAmo}"  readonly="readonly"/></td>
						<td style="padding-left:10px;">已开票总额：</td>
						<td><input class="spinner" style="width:168px" value="${purchaseReturnDate.alrInvAmo}" readonly="readonly"/></td>
					</tr>
					<tr>
						<td>退货总金额：</td>
						<td><input class="spinner" style="width:168px" value="${purchaseReturnDate.refundTotal}"  readonly="readonly"/></td>
						<td style="padding-left:10px;">审核状态：</td>
						<td><input class="spinner" style="width:168px" value="${purchaseReturnDate.auditState}" readonly="readonly"/></td>
					</tr>
					<tr>
				      <td>审核人：</td>
					  <td><input class="spinner" style="width:168px"   value="${purchaseReturnDate.creater}" readonly="readonly"/></td>
				      <td style="padding-left:10px;">审核时间：</td>
					  <td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${purchaseReturnDate.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
				    </tr>
				    <tr>
				      <td>审核人：</td>
					  <td><input class="spinner" style="width:168px"   value="${purchaseReturnDate.creater}" readonly="readonly"/></td>
				      <td style="padding-left:10px;">审核时间：</td>
					  <td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${purchaseReturnDate.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
				    </tr>
				    <tr>
				      <td>审核人：</td>
					  <td><input class="spinner" style="width:168px"   value="${purchaseReturnDate.creater}" readonly="readonly"/></td>
				      <td style="padding-left:10px;">审核时间：</td>
					  <td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${purchaseReturnDate.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
				    </tr>
				    <tr>   
				     <td>更新人：</td>
					 <td><input class="spinner" style="width:168px"   value="${purchaseReturnDate.updater}" readonly="readonly"/></td>
				     <td style="padding-left:10px;">更新时间：</td>
					 <td><input class="spinner" style="width:168px"  value="<fmt:formatDate value="${purchaseReturnDate.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
				    </tr>
					<tr>
						<td>备 注：</td>
						<td colspan="3"> <textarea   name="remark" class="spinner" style="width:435px;" readonly="readonly" >${purchaseReturnDate.remark}</textarea></td>
					</tr>
				</table>
		</fieldset>
    </div>
    <div title="详细信息" style="padding:15px">
    	<fieldset id="user_mgr_user_form_connetGenfieldset" style="padding:10px;" class="spinner">
			<legend>货物详细信息</legend>  
			<table  class="detailtable">
					  <tr> 
				        <td style="padding-left:10px;">货物编号：</td>
						<td >
						    <input id="goodsCode" name="goodsCode" class="spinner" style="width:168px;" value="${purchaseReturnDate.goodsCode}" readonly="readonly"/>
						</td>
				        <td style="padding-left:10px;">货品名称：</td>
						<td>
							<input id="goodsName" name="goodsName" class="spinner" style="width:168px" value="${purchaseReturnDate.goodsName }"  readonly="readonly"/>
						</td>
					</tr> 
					 <tr>
					    <td style="padding-left:10px;">货物税率：</td>
						<td ><input name="taxRate" class="spinner" style="width:168px" value="<fmt:formatNumber value='${purchaseReturnDate.taxRate}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					    <td style="padding-left:10px;">参考成本价：</td>
						<td><input id="referenceCost" name="referenceCost" class="spinner" style="width:168px" value="<fmt:formatNumber value='${purchaseReturnDate.referenceCost}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					 </tr>
					  <tr>
					    <td style="padding-left:10px;">参考零售价：</td>
						<td><input  name="referenceRetailPrice" class="spinner" style="width:168px" value="<fmt:formatNumber value='${purchaseReturnDate.referenceRetailPrice}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					    <td style="padding-left:10px;">参考销售价：</td>
						<td><input name="referenceSalesPrice" class="spinner" style="width:168px" value="<fmt:formatNumber value='${purchaseReturnDate.referenceSalesPrice}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					</tr>
					   <tr>
					    <td style="padding-left:10px;">销售价格一：</td>
						<td><input name="salesPrice1" class="spinner" style="width:168px" value="<fmt:formatNumber value='${purchaseReturnDate.salesPrice1}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					    <td style="padding-left:10px;">销售价格二：</td>
						<td><input name="salesPrice2" class="spinner" style="width:168px" value="<fmt:formatNumber value='${purchaseReturnDate.salesPrice2}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					 </tr>
					 <tr>
					 <td style="padding-left:10px;">销售价格三：</td>
						<td><input name="salesPrice3" class="spinner" style="width:168px" value="<fmt:formatNumber value='${purchaseReturnDate.salesPrice3}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					    <td style="padding-left:10px;">销售价格四：</td>
						<td><input name="salesPrice4" class="spinner" style="width:168px" value="<fmt:formatNumber value='${purchaseReturnDate.salesPrice4}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					 </tr>
					 <tr>
					    <td style="padding-left:10px;">销售价格五：</td>
						<td><input name="salesPrice5" class="spinner" style="width:168px" value="<fmt:formatNumber value='${purchaseReturnDate.salesPrice5}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					    <td style="padding-left:10px;">销售价格六：</td>
						<td><input name="salesPrice6" class="spinner" style="width:168px" value="<fmt:formatNumber value='${purchaseReturnDate.salesPrice6}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					 </tr>
					 <tr>
					    <td style="padding-left:10px;">销售价格七：</td>
						<td><input name="salesPrice7" class="spinner" style="width:168px" value="<fmt:formatNumber value='${purchaseReturnDate.salesPrice7}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					    <td style="padding-left:10px;">销售价格八：</td>
						<td><input name="salesPrice8" class="spinner" style="width:168px" value="<fmt:formatNumber value='${purchaseReturnDate.salesPrice8}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					 </tr>
					 <tr>
					 <td style="padding-left:10px;">销售价格九：</td>
						<td><input name="salesPrice9" class="spinner" style="width:168px" value="<fmt:formatNumber value='${purchaseReturnDate.salesPrice9}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					    <td style="padding-left:10px;">销售价格十：</td>
						<td><input name="salesPrice10" class="spinner" style="width:168px" value="<fmt:formatNumber value='${purchaseReturnDate.salesPrice10}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					 </tr>
			</table>
		</fieldset>
    </div>
    <div title="其他信息" style="padding:15px">
    	<fieldset id="user_mgr_user_form_connetGenfieldsetOther" style="padding:10px;" class="spinner">
			<legend>货物其他信息</legend>  
			<table  class="detailtable">
					  <tr> 
				        <td style="padding-left:10px;">货物编号：</td>
						<td >
						    <input id="goodsCode" name="goodsCode" class="spinner" style="width:168px;" value="${purchaseReturnDate.goodsCode}" readonly="readonly"/>
						</td>
				        <td style="padding-left:10px;">货品名称：</td>
						<td>
							<input id="goodsName" name="memberName" class="spinner" style="width:168px" value="${purchaseReturnDate.goodsName }"  readonly="readonly"/>
						</td>
					</tr> 
					<tr>
						<td style="padding-left:10px;">换算比例：</td>
						<td ><input name="packageConRates" class="spinner" style="width:168px" value="${purchaseReturnDate.packageConRates}" readonly="readonly"/></td>
						<td style="padding-left:10px;">计价方式：</td>
						<td ><input  name="pricing" class="spinner" style="width:168px" value="${purchaseReturnDate.pricing}" readonly="readonly"/></td>
				   </tr>
				   <tr>
						<td style="padding-left:10px;">批次管理：</td>
						<td ><input name="batchManagement" class="spinner" style="width:168px" value="${purchaseReturnDate.batchManagement=='yes'?'是':'否'}" readonly="readonly"/></td>
						<td style="padding-left:10px;">有效期管理：</td>
						<td ><input  name="validManagement" class="spinner" style="width:168px" value="${purchaseReturnDate.validManagement=='yes'?'是':'否'}" readonly="readonly"/></td>
				    </tr> 
					<tr>
					    <td style="padding-left:10px;">生产日期：</td>
						<td><input name="warrantyStart" class="spinner" style="width:168px" value="<fmt:formatDate value="${purchaseReturnDate.warrantyStart}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
					    <td style="padding-left:10px;">终止日期：</td>
						<td><input name="warrantyEnd" class="spinner" style="width:168px" value="<fmt:formatDate value='${purchaseReturnDate.warrantyEnd}'  pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
					 </tr>
					 <tr>
					    <td style="padding-left:10px;">负责部门：</td>
						<td><input name="department" class="spinner" style="width:168px" value="${purchaseReturnDate.depDisplay}" readonly="readonly"/></td>
						<td style="padding-left:10px;">负责人：</td>
						<td><input name="attn" class="spinner" style="width:168px" value="${purchaseReturnDate.warehouseManagerDisplay }" readonly="readonly"/></td>
					 </tr>
					 <tr>
					    <td style="padding-left:10px;">是否启用：</td>
						<td><input name="enabled" class="spinner" id="enabled" style="width:168px" value="${ purchaseReturnDate.enabled}" readonly="readonly"/></td>
					    <td style="padding-left:10px;">审核状态：</td>
						<td><input  id="member_mgr_member_form_status" name="auditState" class="spinner" style="width:168px" value="${purchaseReturnDate.auditState }" readonly="readonly"/></td>
					 </tr>
					 <tr>
					    <td style="padding-left:10px;">审核人：</td>
						<td><input name="auditor" class="spinner" style="width:168px" value='${purchaseReturnDate.auditor}' readonly="readonly"/></td>
					    <td style="padding-left:10px;">审核时间：</td>
						<td><input name="auditTime" class="spinner" style="width:168px" value="<fmt:formatDate value='${purchaseReturnDate.auditTime}'  pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
					 </tr>
					 <tr>
					 <tr>
						<td style="padding-left:10px;">备 注：</td>
						<td colspan="3"> <textarea   name="remark" class="spinner" style="width:435px;" readonly="readonly" >${purchaseReturnDate.auditRemark}</textarea></td>
					</tr>
			</table>
		</fieldset>
    </div>  
</form>

<script type="text/javascript">
	$('#purchaseReturn_mgr_purchaseReturn_form').tabs({
		border:true,
		onSelect:function(){
			$("div").remove(".validatebox-tip");//解决关闭窗体偶尔出现验证条bug
		}
	}); 
	
	$('#member_mgr_member_form_status').val(renderGridValue('${purchaseReturnDate.auditState}',fields.auditState));
	$('#enabled').val(renderGridValue('${purchaseReturnDate.enabled}',fields.status));
	
</script>