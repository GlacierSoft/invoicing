<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui"
	uri="http://com.glacier.permissions.com.cn/tag/easyui"%>
<script type="text/javascript">

$.util.namespace('glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturn_detail');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)

//定义toolbar的操作，对操作进行控制
glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturn_detail.param = {
	toolbarId : 'purchaseReturnDetail_toolbar',
	actions : {
            edit:{flag:'edit',controlType:'single'},
            del:{flag:'del',controlType:'multiple'},
            state:{flag:'state',controlType:'single'}
         }
 };
</script>
<form id="purchaseReturn_detail_form" method="post" >
<table class="detailtable">
 <glacierui:toolbar panelEnName="PurchaseReturnList" toolbarId="purchaseReturnDataGrid_toolbar" menuEnName="purchaseReturn"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
					 <tr>
					     <td colspan="8">
					       <hr> 
						      <div style="margin-left: 410px">
						         <font size="3" style="margin-top: 30px"><b>采购退货详情</b></font> 
						      </div> 
	     					 <hr> 
					     </td>
					 </tr>
					<tr> 
				        <td style="padding-left:10px;">退款编号：</td>
						<td>
						     <input id="returnCode" name="returnCode" class="spinner" style="width:168px;" value="${purchaseReturnDate.returnCode}" readonly="readonly"/>
						</td>
				        <td style="padding-left:10px;">所属仓库：</td>
						<td>
							<input id="storage" name="storage" class="spinner" style="width:168px" value="${purchaseReturnDate.storageDisplay }"  readonly="readonly"/>
						</td> 
					    <td style="padding-left:10px;">供应商：</td>
						<td><input id="supplierId" name="supplierId" class="spinner" style="width:168px" value="${purchaseReturnDate.supplierIdDisplay }" readonly="readonly"/></td>
						 <td style="padding-left:10px;">供应地址：</td>
						<td><input id="supplierAdd" name="supplierAdd" class="spinner" style="width:168px" value="${purchaseReturnDate.supplierAdd}" readonly="readonly"/></td>
					  </tr>   
					  <tr>
					    <td style="padding-left:10px;">联系人：</td>
						<td ><input name="linkman" class="spinner" style="width:168px" value="${purchaseReturnDate.linkman}" readonly="readonly"/></td>
				 	    <td style="padding-left:10px;">联系电话：</td>
					    <td><input id="phone" name="phone" class="spinner" style="width:168px" value="${purchaseReturnDate.phone}" readonly="readonly"/></td>
				 	    <td style="padding-left:10px;">经办部门：</td>
						<td ><input  name="fax" class="spinner" style="width:168px" value="${purchaseReturnDate.operatorDepDisplay}" readonly="readonly"/></td>
				        <td style="padding-left:10px;">经办人：</td>
						<td >
						    <input id="logCode" name="logCode" class="spinner" style="width:168px;" value="${purchaseReturnDate.logCodeDisplay}" readonly="readonly"/>
						</td>
				    </tr>
				 	<tr>
					     <td style="padding-left:10px;">退货方式：</td>
						<td><input class="spinner" style="width:168px" value="${ purchaseReturnDate.returnedPurchaseTypeDisplay}" readonly="readonly"/></td>
					    <td style="padding-left:10px;">退货期限：</td>
						<td><input class="spinner" style="width:168px" value="<fmt:formatDate value='${purchaseReturnDate.returnDeadlines}' pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
					     <td style="padding-left:10px;">退货原因：</td>
					     <td><input class="spinner" style="width:168px" value="${purchaseReturnDate.returnReasonDisplay}" readonly="readonly"/></td>
				 	     <td style="padding-left:10px;">退货说明：</td>
					    <td><input  id="returnPolicy" name="returnPolicy" class="spinner" style="width:168px" value="${purchaseReturnDate.returnPolicy }" readonly="readonly"/></td>
					 </tr> 
					 <tr> 
				        <td style="padding-left:10px;">退货金额：</td>
					    <td >
					      <input id="refundTotal" name="refundTotal" class="spinner" style="width:168px;" value="<fmt:formatNumber value='${purchaseReturnDate.refundTotal}' pattern="#,#00.00元"/>" readonly="readonly"/>
					    </td> 
				        <td style="padding-left:10px;">运费总额：</td>
						<td>
							<input id="logTotalAmount" name="logTotalAmount" class="spinner" style="width:168px" value="<fmt:formatNumber value='${purchaseReturnDate.logTotalAmount }' pattern="#,#00.00元"/>" readonly="readonly"/>
						</td>
					     <td style="padding-left:10px;">物流公司：</td>
						<td ><input name="logCompany" class="spinner" style="width:168px"  value='${purchaseReturnDate.logCompany}'  readonly="readonly"/></td>
					    <td style="padding-left:10px;">物流联系人：</td>
						<td><input id="logLinkman" name="logLinkman" class="spinner" style="width:168px" value="${purchaseReturnDate.logLinkman}"  readonly="readonly"/></td>
					 </tr>
					 <tr> 
				        <td style="padding-left:10px;">物流电话：</td>
						<td >
						    <input id="logPhone" name="logPhone" class="spinner" style="width:168px;" value="${purchaseReturnDate.logPhone}" readonly="readonly"/>
						</td>
				        <td style="padding-left:10px;">跟踪状态：</td>
						<td>
							<input id="paymentState" name="paymentState" class="spinner" style="width:168px" value="${purchaseReturnDate.paymentState }"  readonly="readonly"/>
						</td>  
					   <td style="padding-left:10px;">结算方式：</td>
					   <td><input id="logSettlement"  name="logSettlement" class="spinner" style="width:168px" value='${purchaseReturnDate.logSettlement}' readonly="readonly"/></td>
						<td style="padding-left:10px;">未付款金额：</td>
						<td>
							<input id="notPayAmo" name="notPayAmo" class="spinner" style="width:168px" value="<fmt:formatNumber value='${purchaseReturnDate.notPayAmo }' pattern="#,#00.00元"/>" readonly="readonly"/>
						</td>
					 </tr> 
					  <tr> 
				        <td style="padding-left:10px;">已付款金额：</td>
						<td >
						    <input id="alrPayAmo" name="alrPayAmo" class="spinner" style="width:168px;" value="<fmt:formatNumber value='${purchaseReturnDate.alrPayAmo}' pattern="#,#00.00元"/>" readonly="readonly"/>
						</td>
				        <td style="padding-left:10px;">开票状态：</td>
						<td>
							<input id="invState" name="invState" class="spinner" style="width:168px" value="${purchaseReturnDate.invState }"  readonly="readonly"/>
						</td> 
					    <td style="padding-left:10px;">未开票金额：</td>
						<td><input id="notInvAmo"  name="notInvAmo" class="spinner" style="width:168px" value="<fmt:formatNumber value='${purchaseReturnDate.notInvAmo}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					    <td style="padding-left:10px;">已开票金额：</td>
						<td><input name="alrInvAmo" class="spinner" style="width:168px" value="<fmt:formatNumber value='${purchaseReturnDate.alrInvAmo}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					</tr>
					<tr>
					  <td style="padding-left:10px;">创建人：</td>
					 <td><input class="spinner" style="width:168px"   value="${purchaseReturnDate.creater}" readonly="readonly"/></td> 
				      <td style="padding-left:10px;">创建时间：</td>
					 <td><input class="spinner" style="width:168px"    value="<fmt:formatDate value="${purchaseReturnDate.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
				     <td style="padding-left:10px;">更新人：</td>
					 <td><input class="spinner" style="width:168px"   value="${purchaseReturnDate.updater}" readonly="readonly"/></td>
				     <td style="padding-left:10px;">更新时间：</td>
					 <td><input class="spinner" style="width:168px"  value="<fmt:formatDate value="${purchaseReturnDate.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
				    </tr>
				     <tr> 
					 	<td style="padding-left:10px;">备 注：</td>
						<td colspan="7"> <textarea   name="remark" class="spinner" style="width:920px;" readonly="readonly" >${purchaseReturnDate.remark}</textarea></td>
					 </tr> 
					  <tr>
					      <td style="padding-left:10px;">附件：</td>
					      <td colspan="7"> <textarea   name="accessory" class="spinner" style="width:920px;" readonly="readonly" >${purchaseReturnDate.accessory}</textarea></td>
				  	  </tr>   
	              </table> 
	      <hr> 
	      <div style="margin-left: 410px">
	         <font size="3" style="margin-top: 30px"><b>货品详情</b></font> 
	      </div> 
	      <hr>     
  </form> 
 <SCRIPT>
        //跟踪状态
        $("#paymentState").val(renderGridValue('${purchaseReturnDate.paymentState}',fields.payState));
        //结算方式
        $("#logSettlement").val(renderGridValue('${purchaseReturnDate.logSettlement}',fields.logSettlementId));
        //开票状态
  		$("#invState").val(renderGridValue('${purchaseReturnDate.invState}',fields.invState));
  		
        
</script>  