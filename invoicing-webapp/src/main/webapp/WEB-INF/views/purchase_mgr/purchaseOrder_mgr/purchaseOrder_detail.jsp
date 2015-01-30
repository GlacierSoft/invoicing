<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui"
	uri="http://com.glacier.permissions.com.cn/tag/easyui"%>
<script type="text/javascript">

$.util.namespace('glacier.purchase_mgr.purchaseOrderDetail_mgr.purchaseOrderDetail');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)

//定义toolbar的操作，对操作进行控制
glacier.purchase_mgr.purchaseOrder_mgr.purchaseOrder.param = {
	toolbarId : 'purchaseOrderDataGrid_toolbar',
	actions : {
            edit:{flag:'edit',controlType:'single'},
            del:{flag:'del',controlType:'multiple'},
            state:{flag:'state',controlType:'single'}
         }
 };
</script>
<form id="purchase_mgr_purchaseOrder_form" method="post" >
 <table  class="detailtable"> 
				 <!-- 头部标题 -->
				 <glacierui:toolbar panelEnName="PurchaseOrderList"
								toolbarId="purchaseOrderDataGrid_toolbar" menuEnName="purchaseOrder" />
				 <caption style="height:50px;color: blue;">
				  <!--  -->
				  <c:if test="${ purchaseOrderData.enabled == 'disable'}">   
					  <div style="float: left;margin-left:5px;color: red;margin-top: 10px;width: 40px;height: 18px;font-size: 5;border: solid;border-width: 2px;font-family: 微软雅黑">已禁用 </div> 
					</c:if>   
				    <c:if test="${ purchaseOrderData.auditState == 'pass'}">   
					  <div style="float: left;margin-left:5px;color: red;margin-top: 10px;width: 40px;height: 18px;font-size: 5;border: solid;border-width: 2px;font-family: 微软雅黑">已审核 </div> 
					</c:if>  
				  
				 <font size="4" style="margin-top: 30px;">订购订货合同</font>
				 
				 </caption>
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
						<td style="padding-left:10px;">采购日期：</td>
						<td><input id="orderDate" name="orderDate" class="spinner" style="width:168px" value="<fmt:formatDate value="${purchaseOrderData.orderDate}" pattern="yyyy-MM-dd"/>"  readonly="readonly"/></td>
				    </tr>   
					  <tr>
					    <td style="padding-left:10px;">交货期限：</td>
						<td><input id="deliveryDadlines" name="deliveryDadlines" class="spinner" style="width:168px" value="<fmt:formatDate value="${purchaseOrderData.deliveryDadlines}" pattern="yyyy-MM-dd"/>"  readonly="readonly"/></td>
					    <td style="padding-left:10px;">仓库：</td>
					    <td><input id="storageName" name="storageName" class="spinner" style="width:168px" value="${purchaseOrderData.storageName}" readonly="readonly"/></td>
				 	    <td style="padding-left:10px;">是否启用：</td>
						<td><input name="enabled" class="spinner" id="enabled" style="width:168px" value="${ purchaseOrderData.enabled}" readonly="readonly"/></td>
					   <td style="padding-left:10px;">供应商编号：</td>
						<td ><input name="supplierCode" class="spinner" style="width:168px" value="${purchaseOrderData.supplierCode}" readonly="readonly"/></td>
				    </tr>
				 	<tr>
				 	   <td style="padding-left:10px;">供应商：</td>
					   <td ><input  name="suppliersName" class="spinner" style="width:168px" value="${purchaseOrderData.suppliersName}" readonly="readonly"/></td>
				       <td style="padding-left:10px;">供应商地址：</td>
					   <td><input class="spinner" style="width:168px" value="${purchaseOrderData.supplierAdd}" readonly="readonly"/></td>
				 	   <td style="padding-left:10px;">联系人：</td>
					   <td><input class="spinner" style="width:168px" value="${purchaseOrderData.linkman}" readonly="readonly"/></td>
					   <td style="padding-left:10px;">联系电话：</td>
				 	   <td><input class="spinner" style="width:168px" value="${purchaseOrderData.phone}"  readonly="readonly"/></td>
					 </tr> 
					<tr>
					   <td style="padding-left:10px;">传真：</td>
					   <td><input class="spinner" style="width:168px" value="${purchaseOrderData.fax}" readonly="readonly"/></td>
					   <td style="padding-left:10px;">经办人：</td>
				      <td><input class="spinner" style="width:168px"   value="${purchaseOrderData.operatorName}" readonly="readonly"/></td>
				      <td style="padding-left:10px;">经办部门：</td>
					  <td><input class="spinner" style="width:168px" value="${purchaseOrderData.operatorDep}" readonly="readonly"/></td>
				      <td style="padding-left:10px;">审核状态：</td>
					  <td><input  id="purchase_mgr_purchaseOrder_form_auditState" name="auditState" class="spinner" style="width:168px" value="${purchaseOrderData.auditState }" readonly="readonly"/></td>
				    </tr> 
					<tr>
					    <td style="padding-left:10px;">审核人：</td>
						<td><input name="auditor" class="spinner" style="width:168px" value='${purchaseOrderData.auditor}' readonly="readonly"/></td>
					    <td style="padding-left:10px;">审核时间：</td>
						<td><input name="auditDate" class="spinner" style="width:168px" value="<fmt:formatDate value='${purchaseOrderData.auditDate}'  pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
					    <td style="padding-left:10px;">审核备注：</td>
						<td colspan="3"><input name="auditRemark" class="spinner" style="width:425px" value='${purchaseOrderData.auditRemark}' readonly="readonly"/></td>
				      </tr>   
					<tr> 
				        <td style="padding-left:10px;">约定支付方式：</td>
						<td >
						    <input id="paymentTypeId" name="paymentTypeId" class="spinner" style="width:168px;" value="${purchaseOrderData.paymentTypeName}" readonly="readonly"/>
						</td>
				        <td style="padding-left:10px;">付款约定：</td>
						<td>
							<input id="paymentAgrId" name="paymentAgrId" class="spinner" style="width:168px" value="${purchaseOrderData.paymentAgrId }"  readonly="readonly"/>
						</td>
					     <td style="padding-left:10px;">交货方式：</td>
						<td ><input name="deliveryType" class="spinner" style="width:168px"  value='${purchaseOrderData.deliveryTypeName}'  readonly="readonly"/></td>
					    <td style="padding-left:10px;">交货期限：</td>
						<td><input id="deliveryDadlines" name="deliveryDadlines" class="spinner" style="width:168px" value="<fmt:formatDate value="${purchaseOrderData.deliveryDadlines}" pattern="yyyy-MM-dd"/>"  readonly="readonly"/></td>
					 </tr>
					 <tr> 
				        <td style="padding-left:10px;">交货地址：</td>
						<td >
						    <input id="deliveryAdd" name="deliveryAdd" class="spinner" style="width:168px;" value="${purchaseOrderData.deliveryAdd}" readonly="readonly"/>
						</td>
				        <td style="padding-left:10px;">是否开发票：</td>
						<td>
							<input id="invoice" name="invoice" class="spinner" style="width:168px" value="${purchaseOrderData.invoice }"  readonly="readonly"/>
						</td>    <td style="padding-left:10px;">发票类别：</td>
						<td >
						    <input id="invoiceTypeId" name="invoiceTypeId" class="spinner" style="width:168px;" value="${purchaseOrderData.invoiceTypeId}" readonly="readonly"/>
						</td>
				        <td style="padding-left:10px;">开票状态：</td>
						<td>
							<input id="invState" name="invState" class="spinner" style="width:168px" value="${purchaseOrderData.invState }"  readonly="readonly"/>
						</td>
					 </tr> 
					  <tr> 
				        <td style="padding-left:10px;">总金额：</td>
						<td >
						    <input id="totalAmount" name="totalAmount" class="spinner" style="width:168px;"   value="<fmt:formatNumber value='${purchaseOrderData.totalAmount}' pattern="#,#00.00元"/>"readonly="readonly"/>
						</td>
				        <td style="padding-left:10px;">到货状态：</td>
						<td>
							<input id="arrState" name="arrState" class="spinner" style="width:168px" value="${purchaseOrderData.arrState }"  readonly="readonly"/>
						</td> 
					    <td style="padding-left:10px;">付款状态：</td>
						<td><input id="payState"  name="payState" class="spinner" style="width:168px"  value="${purchaseOrderData.payState}"  readonly="readonly"/></td>
					    <td style="padding-left:10px;">未到货金额：</td>
						<td><input name="notArrAmo" class="spinner" style="width:168px" value="<fmt:formatNumber value='${purchaseOrderData.notArrAmo}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					</tr>
					
					<tr>
					    <td style="padding-left:10px;">已到货金额：</td>
						<td><input name="alrArrAmo" class="spinner" style="width:168px" value="<fmt:formatNumber value='${purchaseOrderData.alrArrAmo}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					    <td style="padding-left:10px;">未付款金额：</td>
						<td><input name="notPayAmo" class="spinner" style="width:168px" value="<fmt:formatNumber value='${purchaseOrderData.notPayAmo}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					    <td style="padding-left:10px;">已付款金额：</td>
						<td><input name="alrPayAmo" class="spinner" style="width:168px" value="<fmt:formatNumber value='${purchaseOrderData.alrPayAmo}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					    <td style="padding-left:10px;">未开票金额：</td>
						<td><input name="notInvAmo" class="spinner" style="width:168px" value="<fmt:formatNumber value='${purchaseOrderData.notInvAmo}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					 </tr>
					 <tr>
					    <td style="padding-left:10px;">已开票金额：</td>
						<td><input name="alrInvAmo" class="spinner" style="width:168px" value="<fmt:formatNumber value='${purchaseOrderData.alrInvAmo}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					     <td style="padding-left:10px;">共享人：</td>
						<td >
						    <input id="sharedPeopleId" name="sharedPeopleId" class="spinner" style="width:168px;" value="${purchaseOrderData.sharedPeopleId}" readonly="readonly"/>
						</td> 
				     <td style="padding-left:10px;">更新人：</td>
					 <td><input class="spinner" style="width:168px"   value="${purchaseOrderData.updater}" readonly="readonly"/></td>
				     <td style="padding-left:10px;">更新时间：</td>
					 <td><input class="spinner" style="width:168px"  value="<fmt:formatDate value="${purchaseOrderData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
				    </tr>
				     <tr> 
					 	<td style="padding-left:10px;">备 注：</td>
						<td colspan="7"> <textarea   name="remark" class="spinner" style="width:920px;" readonly="readonly" >${purchaseOrderData.remark}</textarea></td>
					 </tr> 
					  <tr>
					      <td style="padding-left:10px;">附件：</td>
					      <td colspan="7"> <textarea   name="accessory" class="spinner" style="width:920px;" readonly="readonly" >${purchaseOrderData.accessory}</textarea></td>
				  	  </tr>   
	              </table> 
	     <hr> 
	      <div style="margin-left: 410px">
	         <font size="3" style="margin-top: 30px"><b>货品详情</b></font> 
	      </div> 
	      <hr>     
  </form> 
	      <!-- 所有列表面板和表格 -->  
	<div data-options="region:'north',split:true"
		style="height: 40px; padding-left: 10px;">
		<form id="purchaseOrderDetailSearchForm">
		 <input type="hidden" name="orderId" value="${purchaseOrderData.purOrderId }">
			<table>
				<tr>
					<td>货品名称：</td>
					<td><input name="goodsName" style="width: 80px;"class="spinner" /></td> 
					<td>交货期限：</td>
					<td><input name="deadline" class="easyui-datebox"
						style="width: 100px;" /> - <input name="deadlineEndTime"
						class="easyui-datebox" style="width: 100px;" /></td>
					<td><a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-in',plain:true"
						onclick="glacier.purchase_mgr.purchaseOrderDetail_mgr.purchaseOrderDetail.purchaseOrderDetailDataGrid.datagrid('load',glacier.serializeObject($('#purchaseOrderDetailSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-out',plain:true"
						onclick="$('#purchaseOrderDetailSearchForm input').val('');glacier.purchase_mgr.purchaseOrderDetail_mgr.purchaseOrderDetail.purchaseOrderDetailDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
	<div id="purchaseOrderPanel" style="height: auto;margin-bottom: 50px" data-options="region:'center',border:true">
		<table id="purchase_order_detail" style="height: auto">  
		</table> 
</div>  

<script type="text/javascript">  
$dg=$('#purchase_order_detail');
glacier.purchase_mgr.purchaseOrderDetail_mgr.purchaseOrderDetail.purchaseOrderDetailDataGrid = $('#purchase_order_detail').datagrid({  
	fit : false,//控件自动resize占满窗口大小
	iconCls : 'icon-save',//图标样式
	border : true,//是否存在边框 
	fitColumns : true,//自动填充行
	nowrap : true,//禁止单元格中的文字自动换行
	autoRowHeight : false,//禁止设置自动行高以适应内容
	striped : true,//true就是把行条纹化。（即奇偶行使用不同背景色）
	singleSelect : true,//限制单选
	checkOnSelect : false,//选择复选框的时候选择该行
	selectOnCheck : false,//选择的时候复选框打勾 
    url: ctx + '/do/purchaseOrder/orderDetail.json?orderId=${purchaseOrderData.purOrderId }',   
	sortName : 'goodsCode',//排序字段名称
	sortOrder : 'DESC',//升序还是降序
	remoteSort : true,//开启远程排序，默认为false
	idField : 'purOrderDetId', 
    columns:[[    
        {field :'purOrderDetId', title : 'ID', hidden:true}, 
        {field:'goodsCode',title:'货品编码',width:100},    
        {field:'goodsName',title:'名称',width:100},    
        {field:'goodsModel',title:'规格型号',width:100},   
        {field:'brand',title:'品牌',width:100},  
        {field:'placeOfOrigin',title:'产地',width:100}, 
        {field:'primeCost',title:'原价',width:100}, 
        {field:'discount',title:'折扣率',width:100}, 
        {field:'cess',title:'税率',width:100}, 
        {field:'deadline',title:'交货期限',width:100},
        {field:'price',title:'单价',width:100},  
        {field:'quantity',title:'数量',width:100},  
        {field:'money',title:'金额',width:100},
        {field:'alrArrNum',title:'已到货数量',width:100},
        {field:'notArrNum',title:'未到货数量',width:100},
        {field:'alrTerNum',title:'已终止数量',width:100},
        {field:'alrTerMoney',title:'已终止金额',width:100},
        {field:'remark',title:'备注',width:100}
    ]], 
	rownumbers : true,//True 就会显示行号的列
	onLoadSuccess:function(){ 
		compute(); //添加统计行
	},
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

//底部统计
function compute(){//计算函数 
	//获取数据行
  var rows = $dg.datagrid('getRows'); 
  var moneyTotal = 0,
	  quantityTotal = 0,
	  alrArrNumTotal=0,
	  notArrNumTotal=0,
	  alrTerNumTotal=0,
	  alrTerMoneyTotal=0;//计算总和
  if(rows.length >1){
	    //新增一行显示统计信息
	    var computeRow = $dg.datagrid('getData').rows[rows.length-1];//获取某一行数据
	    var row=$dg.datagrid('getSelected');//获取当前选中的行 
	    for (var i = 0; i < rows.length; i++) { 
   			moneyTotal += parseFloat(rows[i]['money']);
   			quantityTotal += parseInt(rows[i]['quantity']);
   			alrArrNumTotal += parseInt(rows[i]['alrArrNum']);
   			notArrNumTotal +=parseInt(rows[i]['notArrNum']);
   			alrTerNumTotal += parseInt(rows[i]['alrTerNum']);
   			alrTerMoneyTotal +=parseFloat(rows[i]['alrTerMoney']);  
	    }
    	$dg.datagrid('appendRow', { 
	    	goodsCode: '<b>统计：</b>', 
	    	money: moneyTotal,
	    	quantity: quantityTotal,
	    	alrArrNum: alrArrNumTotal,
	    	notArrNum: notArrNumTotal,
	    	alrTerNum: alrTerNumTotal,
	    	alrTerMoney: alrTerMoneyTotal 
	       }
	    );
  }  
}
  
$('#purchase_mgr_purchaseOrder_form_auditState').val(renderGridValue('${purchaseOrderData.auditState}',fields.auditState)); 
$('#payState').val(renderGridValue('${purchaseOrderData.payState}',fields.payState));
$('#arrState').val(renderGridValue('${purchaseOrderData.arrState}',fields.arrState));
$('#invState').val(renderGridValue('${purchaseOrderData.invState}',fields.invState));
$('#invoiceTypeId').val(renderGridValue('${purchaseOrderData.invoiceTypeId}',fields.invoiceTypeId));
$('#invoice').val(renderGridValue('${purchaseOrderData.invoice}',fields.yesOrNo));
$('#orderState').val(renderGridValue('${purchaseOrderData.orderState}',fields.orderState));
$('#enabled').val(renderGridValue('${purchaseOrderData.enabled}',fields.status));
</script> 