<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>
<script type="text/javascript">

$.util.namespace('glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)

//定义toolbar的操作，对操作进行控制
/* glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.param = {
	toolbarId : 'purchaseDateGrid_toolbar',
	actions : {
            edit:{flag:'edit',controlType:'single'},
            del:{flag:'del',controlType:'multiple'},
            state:{flag:'state',controlType:'single'}
         }
 }; */

 function titleAsh(){
	 if('${purchaseDate.affirmArrival}'=="no"){
		$('#purchaseArrival_btn_PurchaseArrivalList_cancelAffirm').linkbutton('disable');//置灰取消收货确认按钮
	}
	if('${purchaseDate.affirmArrival}'=="yes"){
		$('#purchaseArrival_btn_PurchaseArrivalList_affirm').linkbutton('disable');//置灰收货确认按钮
	}
	if('${purchaseDate.enabled}'=="disable"){
		$('#purchaseArrival_btn_PurchaseArrivalList_disable').linkbutton('disable');//置灰禁用按钮
	}
	if('${purchaseDate.enabled}'=="enable"){
		$('#purchaseArrival_btn_PurchaseArrivalList_enable').linkbutton('disable');//置灰启用按钮
	}
	if('${purchaseDate.auditState}'=="pass"||'${purchaseDate.auditState}'=="failure"){
		$('#purchaseArrival_btn_PurchaseArrivalList_audit').linkbutton('disable');//置灰审核按钮
	}
	if('${purchaseDate.auditState}'=="authstr"){
		$('#purchaseArrival_btn_PurchaseArrivalList_cancelAudit').linkbutton('disable');//置灰取消审核按钮
	}
	if('${purchaseDate.payState}'=="allPay"||'${purchaseDate.payState}'=="portionPay"){
		$('#purchaseArrival_btn_PurchaseArrivalList_pay').linkbutton('disable');//置灰付款按钮
	}
 }

 
//点击编辑按钮触发方法
glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.editPurchaseArrival = function(){
	$("#layout_center_panel").panel("setTitle","修改采购到货").panel('refresh',ctx + '/do/purchaseArrival/intoForm.htm?purchaseId=${purchaseDate.purArrivalId}');
};

//点击收货确认触发方法
glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.affirmPurchaseArrival = function(){
	glacier.basicAddOrEditDialog({
		title : '【采购到货】 - 收货确认',
		width : 660,
		height : 270,
		queryUrl : ctx + '/do/purchaseArrival/affirmPurchaseArrival.htm',
		submitUrl : ctx + '/do/purchaseArrivalAffirm/addAffirm.json',
		queryParams : {
			purchaseId : '${purchaseDate.purArrivalId}'
		},
		successFun : function (){
			$("#layout_center_panel").panel("setTitle","采购到货详细信息").panel('refresh',ctx + '/do/purchaseArrival/intoDetail.htm?purchaseId=${purchaseDate.purArrivalId}');
		}
	});
};

//取消收货确认
glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.cancelAffirmPurchaseArrival = function(){
	$.messager.confirm('请确认', '是否要取消采购到货单号为${purchaseDate.arrivalCode}的收货确认吗？', function(r){
		if (r){
			$.ajax({
				   type: "POST",
				   url: ctx + '/do/purchaseArrivalAffirm/delAffirm.json?purArrivalId=${purchaseDate.purArrivalId}',
				   dataType:'json',
				   success: function(r){
					   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
						   $.messager.show({
								title:'提示',
								timeout:3000,
								msg:r.msg,
								width:480,
								height:120
							});
						   $("#layout_center_panel").panel("setTitle","采购到货详细信息").panel('refresh',ctx + '/do/purchaseArrival/intoDetail.htm?purchaseId=${purchaseDate.purArrivalId}');
					   }else{
							$.messager.show({//后台验证弹出错误提示信息框
								title:'错误提示',
								width:480,
								height:220,
								msg: '<span style="color:red">'+r.msg+'<span>',
								timeout:4500
							});
						}
				   }
			});
		}
	});
}
 
//点击禁用按钮触发方法
glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.disablePurchaseArrival = function(){
	var purchaseArrivalIds = ['${purchaseDate.purArrivalId}'];//要存储禁用的id标识
	if(purchaseArrivalIds.length > 0){
		$.messager.confirm('请确认', '是否要禁用${purchaseDate.arrivalCode}的采购到货信息', function(r){
			if (r){
				$.ajax({
					   type: "POST",
					   url: ctx + '/do/purchaseArrival/batchDisableArrival.json',
					   data: {purchaseArrivalIds:purchaseArrivalIds.join(',')},
					   dataType:'json',
					   success: function(r){
						   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
							   $.messager.show({
									title:'提示',
									timeout:3000,
									msg:r.msg
								});
							   $("#layout_center_panel").panel("setTitle","采购到货详细信息").panel('refresh',ctx + '/do/purchaseArrival/intoDetail.htm?purchaseId=${purchaseDate.purArrivalId}');
						   }else{
								$.messager.show({//后台验证弹出错误提示信息框
									title:'错误提示',
									width:380,
									height:120,
									msg: '<span style="color:red">'+r.msg+'<span>',
									timeout:4500
								});
							}
					   }
				});
			}
		});
	}
};

//点击启用按钮触发方法
glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.enablePurchaseArrival = function(){
	var purchaseArrivalIds = ['${purchaseDate.purArrivalId}'];//存储要启用的id标识
	if(purchaseArrivalIds.length > 0){
		$.messager.confirm('请确认', '是否要启用${purchaseDate.arrivalCode}的采购到货信息', function(r){
			if (r){
				$.ajax({
					   type: "POST",
					   url: ctx + '/do/purchaseArrival/batchEnableArrival.json',
					   data: {purchaseArrivalIds:purchaseArrivalIds.join(',')},
					   dataType:'json',
					   success: function(r){
						   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
							   $.messager.show({
									title:'提示',
									timeout:3000,
									msg:r.msg
								});
							   $("#layout_center_panel").panel("setTitle","采购到货详细信息").panel('refresh',ctx + '/do/purchaseArrival/intoDetail.htm?purchaseId=${purchaseDate.purArrivalId}');
						   }else{
								$.messager.show({//后台验证弹出错误提示信息框
									title:'错误提示',
									width:380,
									height:120,
									msg: '<span style="color:red">'+r.msg+'<span>',
									timeout:4500
								});
							}
					   }
				});
			}
		});
	}
};

//点击审核按钮触发方法
glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.auditPurchaseArrival = function(){
	var purchaseArrivalIds = ['${purchaseDate.purArrivalId}'];//存储需要审核的id标识 
	glacier.basicAddOrEditDialog({
		title : '【采购到货】 - 审核',
		width : 410,
		height : 250,
		queryUrl : ctx + '/do/purchaseArrival/auditForm.htm?purchaseId=${purchaseDate.purArrivalId}',
		submitUrl : ctx + '/do/purchaseArrival/batchAudit.json?arrivalIds='+purchaseArrivalIds.join(','),
		successFun : function (){
			$("#layout_center_panel").panel("setTitle","采购到货详细信息").panel('refresh',ctx + '/do/purchaseArrival/intoDetail.htm?purchaseId=${purchaseDate.purArrivalId}');
		}
	});
};

//点击取消审核按钮触发方法
glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.cancelAuditPurchaseArrival = function(){
	var purchaseArrivalIds = ['${purchaseDate.purArrivalId}'];//存储取消审核的id标识
	if(purchaseArrivalIds.length > 0){
		$.messager.confirm('请确认', '是否要重置${purchaseDate.arrivalCode}的审核信息', function(r){
			if (r){
				$.ajax({
					   type: "POST",
					   url: ctx + '/do/purchaseArrival/batchCancelAudit.json',
					   data: {purchaseArrivalIds:purchaseArrivalIds.join(',')},
					   dataType:'json',
					   success: function(r){
						   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
							   $.messager.show({
									title:'提示',
									timeout:3000,
									msg:r.msg
								});
							   $("#layout_center_panel").panel("setTitle","采购到货详细信息").panel('refresh',ctx + '/do/purchaseArrival/intoDetail.htm?purchaseId=${purchaseDate.purArrivalId}');
						   }else{
								$.messager.show({//后台验证弹出错误提示信息框
									title:'错误提示',
									width:380,
									height:120,
									msg: '<span style="color:red">'+r.msg+'<span>',
									timeout:4500
								});
							}
					   }
				});
			}
		});
	}
};
 //$("#detailtable td").attr("align","right");
 $(":input").attr("readonly","readonly"); 
</script>
<style type="text/css">
	#detailtable {
		margin-top: 20px;
		margin-left: 20px;
	}
	#detailtable input{
		width: 168px;
		height: 18px;
	}
</style>
<form id="purchase_mgr_purchaseArrival_form" method="post" >
<glacierui:toolbar panelEnName="PurchaseArrivalList" toolbarId="purchaseArrivalDataGrid_toolbar" menuEnName="purchaseArrival"/>
 <table class="detailtable" id="detailtable"> 
 <caption style="height:50px;color: blue;"><font size="4">采购到货</font></caption>
    <tr> 
        <td>到货单号：</td>
		<td><input id="arrivalCode" name="arrivalCode" class="spinner" value="${purchaseDate.arrivalCode}"/></td>
        <td>合同编号：</td>
		<td><input id="contractCode" name="contractCode" class="spinner" value="${purchaseDate.contractCode }" /></td> 
		<td>到货日期：</td>
		<td><input id="arrivalDate" name="arrivalDate" class="spinner" value="<fmt:formatDate value="${purchaseDate.arrivalDate}" pattern="yyyy-MM-dd"/>" /></td>
    	<td>所属仓库：</td>
	    <td><input id="storage" name="storage" class="spinner" value="${purchaseDate.storageDisplay}"/></td>
    </tr>   
	<tr>
 	    <td>采购类型：</td>
		<td ><input  name="purchaseTypeId" class="spinner" value="${purchaseDate.purchaseTypeDisplay}"/></td>
 	    <td>供应商：</td>
		<td ><input  name="supplierId" class="spinner" value="${purchaseDate.supplierDisplay}"/></td>
    	<td>联系人：</td>
		<td><input class="spinner"  value="${purchaseDate.linkman}"/></td>
	 	<td>供应商地址：</td>
		<td><input class="spinner"  value="${purchaseDate.supplierAdd}"/></td>
    </tr>
 	<tr>
	    <td>联系电话：</td>
 	    <td><input class="spinner"  value="${purchaseDate.phone}" /></td>
 	    <td>供应商传真：</td>
	    <td><input class="spinner"  value="${purchaseDate.fax}"/></td>
	 	<td>交货方式：</td>
		<td ><input name="deliveryType" class="spinner"   value='${purchaseDate.deliveryTypeDisplay}' /></td>
	 	<td>交货期限：</td>
		<td><input id="deliveryDead" name="deliveryDead" class="spinner"  value="<fmt:formatDate value="${purchaseDate.deliveryDead}" pattern="yyyy-MM-dd"/>" /></td>
	 </tr> 
	 <tr>
	 	<td>交货地址：</td>
		<td ><input id="deliveryAdd" name="deliveryAdd" class="spinner"  value="${purchaseDate.deliveryAdd}"/></td>
	 	<td>验收人：</td>
 	    <td><input class="spinner"  value="${purchaseDate.acceptor}" /></td>
		<td>是否开发票：</td>
		<td><input id="invoice" name="invoice" class="spinner"  value="${purchaseDate.invoice }" /></td>    
		<td>发票类别：</td>
		<td><input id="invoiceTypeId" name="invoiceTypeId" class="spinner"  value="${purchaseDate.invoiceTypeId}"/></td>
	 </tr>
	 <tr> 
        <td>约定支付方式：</td>
		<td><input id="paymentTypeId" name="paymentTypeId" class="spinner"  value="${purchaseDate.paymentTypeDisplay}"/></td>
        <td>运费结算方式：</td>
		<td><input id="purchaseArrival_mgr_purchaseArrival_detail_logSettlementId" value="${purchaseDate.logSettlementId}" name="logSettlementId" class="spinner"/></td>
	    <td>运单号：</td>
		<td><input name="logCode" class="spinner" value="${purchaseDate.logCode}" /></td>
	 	<td>运费总额：</td>
		<td><input name="logTotalTmount" class="spinner" value='${purchaseDate.logTotalTmount}' /></td>
	 </tr>
	 <tr>
		<td>运费确认日期：</td>
		<td><input name="logTotalTmount" class="spinner" value='<fmt:formatDate value="${purchaseDate.confirmorTime}" pattern="yyyy-MM-dd HH:mm:ss"/>' /></td>
		<td>运费确认人：</td>
		<td><input name="logTotalTmount" class="spinner" value='${purchaseDate.confirmor}' /></td>
		<td>运费确认部门：</td>
		<td><input name="logTotalTmount" class="spinner" value='${purchaseDate.confirmorDepartment}' /></td>
	 	<td>物流公司：</td>
		<td><input id="purchaseArrival_mgr_purchaseArrival_detail_logCompany" name="logCompany"  value="${purchaseDate.logCompanyDisplay}" class="spinner"/></td>
	 </tr>
	 <tr>
	 	<td>物流联系人：</td>
		<td><input  name="logLinkman" class="spinner" value='${purchaseDate.logLinkman}' /></td>
	    <td>物流电话：</td>
		<td><input  name="logPhone" class="spinner" value='${purchaseDate.logPhone}' /></td>
        <td>总金额：</td>
		<td><input id="totalAmount" name="totalAmount" class="spinner"    value="<fmt:formatNumber value='${purchaseDate.totalAmount}' pattern="#,#00.00元"/>"readonly="readonly"/></td>
        <td>付款约定：</td>
        <td><input id="paymentAgrId" name="paymentAgrId" class="spinner"  value="${purchaseDate.paymentAgrId }" /></td>
	</tr>
	<tr>
        <td>应付减免金额：</td>
		<td><input name="derateMoney" class="spinner"  value="<fmt:formatNumber value='${purchaseDate.derateMoney}' pattern="#,#00.00元"/>"/></td>
		<td>已付款金额：</td>
		<td><input name="alrPayAmo" class="spinner"  value="<fmt:formatNumber value='${purchaseDate.alrPayAmo}' pattern="#,#00.00元"/>"/></td>
		<td>未付款金额：</td>
		<td><input name="notPayAmo" class="spinner"  value="<fmt:formatNumber value='${purchaseDate.notPayAmo}' pattern="#,#00.00元"/>"/></td>
	    <td>已开票金额：</td>
		<td><input name="alrInvAmo" class="spinner"  value="<fmt:formatNumber value='${purchaseDate.alrInvAmo}' pattern="#,#00.00元"/>"/></td>
	</tr>
	<tr>
		<td>未开票金额：</td>
		<td><input name="notInvAmo" class="spinner"  value="<fmt:formatNumber value='${purchaseDate.notInvAmo}' pattern="#,#00.00元"/>"/></td>
		<td>已退货金额：</td>
		<td><input name="alrReturnAmo" class="spinner"  value="<fmt:formatNumber value='${purchaseDate.alrReturnAmo}' pattern="#,#00.00元"/>"/></td>
		<td>未退货金额：</td>
		<td><input name="notReturnAmo" class="spinner"  value="<fmt:formatNumber value='${purchaseDate.notReturnAmo}' pattern="#,#00.00元"/>"/></td>
	    <td>货品跟踪状态：</td>
		<td><input id="tailAfterStatus"  name="tailAfterStatus" class="spinner"   value="${purchaseDate.tailAfterStatus}" /></td>
	</tr>
	<tr> 
	    <td>货款跟踪状态：</td>
		<td><input id="payState"  name="payState" class="spinner"   value="${purchaseDate.payState}" /></td>
		<td>开票状态：</td>
		<td><input id="invState" name="invState" class="spinner"  value="${purchaseDate.invState }" /></td> 
	  	<td>经办人：</td>
      	<td><input class="spinner"    value="${purchaseDate.operatorsDisplay}"/></td>
      	<td>经办部门：</td>
	  	<td><input class="spinner"  value="${purchaseDate.operatorDep}"/></td>
    </tr>
    <tr>
        <td>是否启用：</td>
	    <td><input name="enabled" class="spinner" id="enabled"  value="${ purchaseDate.enabled}"/></td>
        <td>审核状态：</td>
	    <td><input  id="purchase_mgr_purchaseArrival_form_auditState" name="auditState" class="spinner"  value="${purchaseDate.auditState }"/></td>
        <td>审核人：</td>
		<td><input name="auditor" class="spinner"  value='${purchaseDate.auditor}'/></td>
	    <td>审核时间：</td>
		<td><input name="auditDate" class="spinner"  value="<fmt:formatDate value='${purchaseDate.auditDate}'  pattern="yyyy-MM-dd HH:mm:ss"/>"/></td>
    </tr> 
	<tr>
	    <td>审核备注：</td>
		<td><input name="auditRemark" class="spinner" value='${purchaseDate.auditRemark}'/></td>
    	<td>更新人：</td>
		<td><input class="spinner" value="${purchaseDate.updater}"/></td>
	    <td>更新时间：</td>
		<td><input class="spinner" value="<fmt:formatDate value="${purchaseDate.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" /></td>
		<td></td><td></td>
    </tr>
    <tr> 
	 	<td>备 注：</td>
		<td colspan="7"> <textarea   name="remark" class="spinner" style="width:920px;" >${purchaseDate.remark}</textarea></td>
	 </tr> 
	 <tr>
	      <td>附件：</td>
	      <td colspan="7"> <textarea   name="accessory" class="spinner" style="width:920px;" >${purchaseDate.accessory}</textarea></td>
  	 </tr>
</table> 
<hr> 
 <div style="text-align: center;">
    <font size="3" style="margin-top: 30px;margin-left: -120px;"><b>货品详情</b></font> 
 </div> 
<hr>     
<!-- 所有列表面板和表格 -->
<div> 
	<div data-options="region:'north',split:true"
		style="height: 40px; padding-left: 10px;">
		<form id="purchaseArrivalSearchForm">
			<table>
				<tr>
					<td>货品名称：</td>
					<td><input name="storage" style="width: 80px;"class="spinner" /></td> 
					<td>到期时间：</td>
					<td><input name="createStartTime" class="easyui-datetimebox"
						style="width: 100px;" /> - <input name="createEndTime"
						class="easyui-datetimebox" style="width: 100px;" /></td>
					<td><a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-in',plain:true"
						onclick="glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.purchaseArrivalDetailDataGrid.datagrid('load',glacier.serializeObject($('#purchaseArrivalSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-out',plain:true"
						onclick="$('#purchaseArrivalSearchForm input').val('');glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.purchaseArrivalDetailDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
	<div id="purchaseArrivalPanel" data-options="region:'center',barrival:true">
		<table id="purchase_arrival_detail" style="height: 300px;margin-top: 50px;">  
		</table>
	</div>
</div>
</form> 
<script type="text/javascript">
glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.purchaseArrivalDetailDataGrid = $('#purchase_arrival_detail').datagrid({  
	fit : false,//控件自动resize占满窗口大小
	iconCls : 'icon-save',//图标样式
	barrival : true,//是否存在边框 
	fitColumns : false,//自动填充行
	nowrap : true,//禁止单元格中的文字自动换行
	autoRowHeight : false,//禁止设置自动行高以适应内容
	striped : true,//true就是把行条纹化。（即奇偶行使用不同背景色）
	singleSelect : true,//限制单选
	checkOnSelect : false,//选择复选框的时候选择该行
	selectOnCheck : false,//选择的时候复选框打勾 
    url: ctx + '/do/purchaseArrivalDetail/list.json?purArrivalId=${purchaseDate.purArrivalId }',   
	sortName : 'goodsCode',//排序字段名称
	sortOrder : 'DESC',//升序还是降序
	remoteSort : true,//开启远程排序，默认为false
	idField : 'purArrivalDetId', 
    columns:[[    
        {field :'purArrivalDetId', title : 'ID', checkbox : true}, 
        {field:'goodsCode',title:'货品编码',width:100},    
        {field:'goodsName',title:'名称',width:100},    
        {field:'goodsModel',title:'规格型号',width:100},   
        {field:'brand',title:'品牌',width:100},  
        {field:'placeOfOrigin',title:'产地',width:100}, 
        {field:'price',title:'批次信息',width:100},
        {field:'arrival',title:'到货数量',width:100},
        {field:'delivery',title:'收货数量',width:100},
        {field:'rejection',title:'拒收数量',width:100},
        {field:'originalCost',title:'原价',width:100}, 
        {field:'depositRate',title:'折扣率',width:100}, 
        {field:'price',title:'单价',width:100}, 
        {field:'goodsMoney',title:'金额',width:100},
        {field:'cess',title:'税率',width:100}, 
        {field:'deadline',title:'交货期限',width:100},
        {field:'putstorage',title:'已入库数量',width:100},
        {field:'takestorage',title:'未入库数量',width:100},
        {field:'alrInvNum',title:'已开票数量',width:100},
        {field:'notInvNum',title:'未开票数量',width:100},
        {field:'remark',title:'备注',width:100}
    ]],
	pagination : true,//True 就会在 datagrid 的底部显示分页栏
	pcarrierCarTypeSize : 10,//注意，pcarrierCarTypeSize必须在pcarrierCarTypeList存在
	pcarrierCarTypeList : [ 2, 10, 50, 100 ],//从session中获取
	rownumbers : true,//True 就会显示行号的列
	onLoadSuccess:function(data){
    	compute();//调用统计
    	titleAsh();//调用置灰按钮
    }
	/* onDblClickRow : function(rowIndex, rowData){
        $.easyui.showDialog({
				title : '商品【' + rowData.goodsName + '】详细信息',
				href : ctx+ '/do/purchaseOrderDetail/intoDetail.htm?purOrderDetId='+ rowData.purArrivalId,//从controller请求jsp页面进行渲染
				width : 560,
				height : 390,
				resizable : false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		} */
});

//底部统计
function compute(){//计算函数
	//获取数据行
    var rows = $('#purchase_arrival_detail').datagrid('getRows');
    var goodsMoneyTotal = 0,arrivalTotal = 0,deliveryTotal = 0,rejectionTotal = 0;//计算goodsMoneyTotal的总和以及统计arrivalTotal的总和，deliveryTotal总和
    if(rows.length >= 2){
	    //新增一行显示统计信息
    	for (var i = 0; i < rows.length; i++) {
    		goodsMoneyTotal += parseFloat(rows[i]['goodsMoney']);
	        deliveryTotal += parseInt(rows[i]['delivery']);
	        rejectionTotal += parseInt(rows[i]['rejection']);
	    	arrivalTotal += parseInt(rows[i]['arrival']);
	    }
    	$('#purchase_arrival_detail').datagrid('appendRow', { 
	    	goodsCode: '<b>统计：</b>', arrival: arrivalTotal,
	    	delivery: parseInt(deliveryTotal),goodsMoney: goodsMoneyTotal,
	    	rejection: rejectionTotal
	       }
	    );
    }
}

$('#purchase_mgr_purchaseArrival_form_auditState').val(renderGridValue('${purchaseDate.auditState}',fields.auditState));
$('#tailAfterStatus').val(renderGridValue('${purchaseDate.tailAfterStatus}',fields.tailAfterStatus));
$('#payState').val(renderGridValue('${purchaseDate.payState}',fields.payState));
$('#invState').val(renderGridValue('${purchaseDate.invState}',fields.invState));
$('#purchaseArrival_mgr_purchaseArrival_detail_logSettlementId').val(renderGridValue('${purchaseDate.logSettlementId}',fields.logSettlementId));
$('#invoiceTypeId').val(renderGridValue('${purchaseDate.invoiceTypeId}',fields.invoiceTypeId));
$('#invoice').val(renderGridValue('${purchaseDate.invoice}',fields.yesOrNo));
$('#enabled').val(renderGridValue('${purchaseDate.enabled}',fields.status));
</script>