<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="purchase_mgr_purchaseOrder_form" method="post" >
 <table  class="detailtable"> 
 <caption style="height: 80px;color: blue;"><font size="4" style="padding-top: 30px;">订购合同明细</font></caption>
				    <tr> 
				        <td style="padding-left:10px;">订货单号：</td>
						<td>
						     <input id="orderCode" name="orderCode" class="spinner" style="width:168px;" value="${purchaseOrderData.orderCode}" readonly="readonly"/>
						</td>
				        <td style="padding-left:10px;">合同编号：</td>
						<td>
							<input id="contractCode" name="contractCode" class="spinner" style="width:168px" value="${purchaseOrderData.contractCode }"  readonly="readonly"/>
						</td> 
					    <td style="padding-left:10px;">合同状态：</td>
						<td><input id="orderState" name="orderState" class="spinner" style="width:168px" value="${purchaseOrderData.orderState }" readonly="readonly"/></td>
					 </tr>  
					  
					  
					 <tr>
						<td style="padding-left:10px;">采购日期：</td>
						<td><input id="orderDate" name="orderDate" class="spinner" style="width:168px" value="<fmt:formatDate value="${purchaseOrderData.orderDate}" pattern="yyyy-MM-dd"/>"  readonly="readonly"/></td>
					    <td style="padding-left:10px;">仓库：</td>
					    <td><input id="storageName" name="storageName" class="spinner" style="width:168px" value="${purchaseOrderData.storageName}" readonly="readonly"/></td>
				 		<td style="padding-left:10px;">供应商编号：</td>
						<td ><input name="supplierCode" class="spinner" style="width:168px" value="${purchaseOrderData.supplierCode}" readonly="readonly"/></td>
					
				 	</tr>
				 	<tr>
						<td style="padding-left:10px;">供应商：</td>
						<td ><input  name="supplierId" class="spinner" style="width:168px" value="${purchaseOrderData.suppliersName}" readonly="readonly"/></td>
				        <td style="padding-left:10px;">是否启用：</td>
						<td><input name="enabled" class="spinner" id="enabled" style="width:168px" value="${ purchaseOrderData.enabled}" readonly="readonly"/></td>
					
						<td style="padding-left:10px;">联系人：</td>
						<td><input class="spinner" style="width:168px" value="${purchaseOrderData.linkman}" readonly="readonly"/></td>
					</tr> 
					<tr>
						<td style="padding-left:10px;">供应商地址：</td>
						<td><input class="spinner" style="width:168px" value="${purchaseOrderData.supplierAdd}" readonly="readonly"/></td>
				 	    <td style="padding-left:10px;">联系电话：</td>
						<td><input class="spinner" style="width:168px" value="${purchaseOrderData.phone}"  readonly="readonly"/></td>
					    <td style="padding-left:10px;">传真：</td>
					  <td><input class="spinner" style="width:168px" value="${purchaseOrderData.fax}" readonly="readonly"/></td>
					  </tr> 
					 <tr>
					   <td style="padding-left:10px;">经办人：</td>
				      <td><input class="spinner" style="width:168px"   value="${purchaseOrderData.operators}" readonly="readonly"/></td>
				      <td style="padding-left:10px;">审核状态：</td>
					  <td><input  id="purchase_mgr_purchaseOrder_form_auditState" name="auditState" class="spinner" style="width:168px" value="${purchaseOrderData.auditState }" readonly="readonly"/></td>
				      <td style="padding-left:10px;">经办部门：</td>
					  <td><input class="spinner" style="width:168px" value="${purchaseOrderData.operatorDep}" readonly="readonly"/></td>
				    </tr> 
					 <tr>
					    <td style="padding-left:10px;">审核人：</td>
						<td><input name="auditor" class="spinner" style="width:168px" value='${purchaseOrderData.auditor}' readonly="readonly"/></td>
					    <td style="padding-left:10px;">审核时间：</td>
						<td><input name="auditDate" class="spinner" style="width:168px" value="<fmt:formatDate value='${purchaseOrderData.auditDate}'  pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
					</tr>  
				    <tr>
						<td style="padding-left:10px;">审核备注：</td>
						<td  colspan="3"><input name="auditRemark" class="spinner" style="width:425px" value='${purchaseOrderData.auditRemark}' readonly="readonly"/></td>
				        <td style="padding-left:10px;">备 注：</td>
						<td colspan="3"> <textarea   name="remark" class="spinner" style="width:425px;" readonly="readonly" >${purchaseOrderData.remark}</textarea></td>
					</tr>  
	              </table> 
				     <hr> 
				      <div style="margin-left: 410px">
				         <font size="3" style="margin-top: 30px">货品详情</font> 
				      </div>
				      
				      <hr> 
   <table id="purchase_order_detail" style="height: 200px"> 
  </table> 
</form>
<script type="text/javascript"> 

$('#purchase_order_detail').datagrid({     
	fit : false,//控件自动resize占满窗口大小
	iconCls : 'icon-save',//图标样式
	border : false,//是否存在边框
	fitColumns : true,//自动填充行
	nowrap : true,//禁止单元格中的文字自动换行
	autoRowHeight : false,//禁止设置自动行高以适应内容
	striped : true,//true就是把行条纹化。（即奇偶行使用不同背景色）
	singleSelect : true,//限制单选
	checkOnSelect : false,//选择复选框的时候选择该行
	selectOnCheck : false,//选择的时候复选框打勾 
    url: ctx + '/do/purchaseOrder/orderDetail.json?orderId='+${purchaseOrderData.purOrderId },   
	sortName : 'goodsCode',//排序字段名称
	sortOrder : 'DESC',//升序还是降序
	remoteSort : true,//开启远程排序，默认为false
	idField : 'purOrderDetId', 
    columns:[[    
        {field :'purOrderDetId', title : 'ID', checkbox : true}, 
        {field:'goodsCode',title:'货品编码',width:100},    
        {field:'goodsName',title:'名称',width:100},    
        {field:'goodsModel',title:'规格型号',width:100},  
        {field:'price',title:'单价',width:100},  
        {field:'quantity',title:'数量',width:100},  
        {field:'money',title:'金额',width:100}  
    ]],
	pagination : true,//True 就会在 datagrid 的底部显示分页栏
	pcarrierCarTypeSize : 10,//注意，pcarrierCarTypeSize必须在pcarrierCarTypeList存在
	pcarrierCarTypeList : [ 2, 10, 50, 100 ],//从session中获取
	rownumbers : true,//True 就会显示行号的列
	onDblClickRow : function(rowIndex, rowData){
        $.easyui.showDialog({
				title : '商品【' + rowData.goodsName + '】详细信息',
				href : ctx+ '/do/purchaseOrderDetail/intoDetail.htm?purOrderDetId='+ rowData.purOrderDetId,//从controller请求jsp页面进行渲染
				width : 560,
				height : 390,
				resizable : false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
});  
 
$('#purchase_mgr_purchaseOrder_form_auditState').val(renderGridValue('${purchaseOrderData.auditState}',fields.auditState)); 
$('#payState').val(renderGridValue('${purchaseOrderData.payState}',fields.payState));
$('#arrState').val(renderGridValue('${purchaseOrderData.arrState}',fields.arrState));
$('#invState').val(renderGridValue('${purchaseOrderData.invState}',fields.invState));
$('#invoiceTypeId').val(renderGridValue('${purchaseOrderData.invoiceTypeId}',fields.invoiceTypeId));
$('#invoice').val(renderGridValue('${purchaseOrderData.invoice}',fields.yesOrNo));
$('#orderState').val(renderGridValue('${purchaseOrderData.orderState}',fields.orderState));
$('#enabled').val(renderGridValue('${purchaseOrderData.enabled}',fields.status));
</script>  