<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="purchaseArrival_mgr_purchaseArrival_form" method="post">
<table  class="formtable" style="margin-left: 20px;margin-top: 20px;">
 <caption style="height:50px;color: blue;"><font size="4" style="padding-top: 30px;">新增采购到货信息</font></caption>
 <tr> 
    <td>到货日期：</td>
	<td><input type="hidden" id="purchaseArrival_mgr_purchaseArrival_form_purArrivalId" name="purArrivalId" value="${purchaseDate.purArrivalId}" />
	<input id="purchaseArrival_mgr_purchaseArrival_form_arrivalDate" name="arrivalDate" class="easyui-datebox" 
	value="<fmt:formatDate value="${purchaseDate.arrivalDate}" pattern="yyyy-MM-dd HH:mm:ss"/>"  required="true" style="width:168px;height: 18px;" /></td>
	<td style="padding-left:10px;">采购类型：</td>
	<td><input id="purchaseArrival_mgr_purchaseArrival_form_purchaseTypeId" name="purchaseTypeId" value='${purchaseDate.purchaseTypeDisplay}' /></td>
	<td>所属仓库：</td>
	<td ><input id="purchaseArrival_mgr_purchaseArrival_form_storage" name="storage" value="${purchaseDate.storageDisplay}" /></td>
	<td style="padding-left:10px;">供应商：</td>
	<td><input id="purchaseArrival_mgr_purchaseArrival_form_supplierId" name="supplierId" value="${purchaseDate.supplierDisplay}" /></td>
</tr>
<tr>
	<td>合同编号：</td>
	<td><input id="purchaseArrival_mgr_purchaseArrival_form_contractCode" name="contractCode" value='${purchaseDate.contractCode}' 
		class="easyui-validatebox spinner" style="width:168px;height: 18px;"/></td>
    <td style="padding-left:10px;">供应商地址：</td>
	<td><input id="purchaseArrival_mgr_purchaseArrival_form_supplierAdd" name="supplierAdd" value="${purchaseDate.supplierAdd}" 
		class="easyui-validatebox spinner" style="width:168px;height: 18px;"/></td>
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
	<td>经办人：</td>
	<td><input id="purchaseArrival_mgr_purchaseArrival_form_operators" name="operators"  value="${purchaseDate.operatorsDisplay}" /></td>
    <td style="padding-left:10px;">经办部门：</td>
	<td><input id="operatorDep" class="easyui-validatebox spinner" style="width:168px;height: 18px;" name="operatorDep"  value="${purchaseDate.operatorDep}" disabled="disabled"/></td>
</tr>
<tr>
	<td style="padding-left:10px;">是否开票：</td>
	<td><input style="width:168px" value="${purchaseDate.invoice}" name="invoice" class="easyui-combobox" 
	  	data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.yesOrNo"/></td>
	<td style="padding-left:10px;">状态：</td>
	<td><input style="width:168px" value="${purchaseDate.enabled}" name="enabled" class="easyui-combobox" 
	  	data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/></td>
	<td>发票类型：</td>
	<td><input style="width:168px" value="${purchaseDate.invoiceTypeId}" name="invoiceTypeId" class="easyui-combobox" 
	 	  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.invoiceTypeId"/></td>
	   <td style="padding-left:10px;">约定支付方式：</td>
	<td><input id="purchaseArrival_mgr_purchaseArrival_form_paymentTypeId" name="paymentTypeId"  value="${purchaseDate.paymentTypeDisplay}" /></td>
</tr>
<tr>
	<td>运费结算方式：</td>
	<td><input id="purchaseArrival_mgr_purchaseArrival_form_logSettlementId" style="width:168px" value="${purchaseDate.logSettlementId}" name="logSettlementId" class="easyui-combobox" 
  	  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.logSettlementId"/></td>
    <td style="padding-left:10px;">运单号：</td>
	<td><input name="logCode" class="spinner" style="width:168px;height: 18px;" value="${purchaseDate.logCode}" /></td>
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
	<td>总金额：</td>
	<td><input  name="totalAmount" class="easyui-validatebox spinner" style="width:168px;height: 18px;" value='${purchaseDate.totalAmount}' /></td>
	<td>备 注：</td>
	<td> <textarea   name="remark" class="spinner" style="width:168px;"  >${purchaseDate.remark}</textarea></td>
</tr>
<tr>
	<td>付款约定：</td>
	<td colspan="3"><input id="purchaseArrival_mgr_purchaseArrival_form_paymentAgrId" name="paymentAgrId" value="${purchaseDate.paymentAgrId}" /></td>
</tr>
</table>
<a id="btn" href="#" class="easyui-linkbutton" onclick="addRow();" data-options="iconCls:'icon-search'">增加一行</a>
<a id="btn" href="#" class="easyui-linkbutton" onclick="cheshi();" data-options="iconCls:'icon-search'">测试</a>
	<table id="purchase_arrival_form" style="height: 200px;margin-top: 50px;">  
	</table>
</form>
<script type="text/javascript">

var storageVal="";//保存仓库ID
var stRows="";//保存行数
var divs = "";//保存goodsDetail中的dialog节点
var setRowData="";//保存选中的值

$('#purchase_arrival_form').datagrid({  
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
	sortName : 'goodsCode',//排序字段名称
	sortOrder : 'DESC',//升序还是降序
	remoteSort : true,//开启远程排序，默认为false
	idField : 'purOrderDetId', 
    columns:[[    
        {field:'goodsCode',title:'货品编码',width:100},    
        {field:'goodsName',title:'货品名称',width:100},
        {field:'goodsId',title:'货品编号',width:100,hidden:true},    
        {field:'goodsModel',title:'规格型号',width:100},   
        {field:'goodsUnit',title:'单位',width:100}, 
        {field:'price',title:'批次信息',width:100},
        {field:'arrival',title:'到货数量',width:100,editor: { type: 'numberbox', options: { required: true } } },
        {field:'delivery',title:'收货数量',width:100,editor: { type: 'numberbox', options: { required: true } } },
        {field:'rejection',title:'拒收数量',width:100},
        {field:'originalCost',title:'原价',width:100}, 
        {field:'depositRate',title:'折扣率',width:100,editor: { type: 'numberbox', options: { required: true } } }, 
        {field:'prices',title:'单价',width:100,editor: { type: 'numberbox', options: { required: true } } }, 
        {field:'money',title:'金额',width:100,editor: { type: 'numberbox', options: { required: true } } },
        {field:'cess',title:'税率',width:100,editor: { type: 'numberbox', options: { required: true } } }, 
        {field:'deadline',title:'交货期限',width:100,editor: { type: 'datebox', options: { required: true } } },
        {field:'remark',title:'备注',width:100,editor: { type: 'text' }}
    ]], 
    onSelect:function(rowIndex, rowData){
    	stRows=rowIndex;
    	goodsDetail(rowIndex,rowData);
    }
});
//增加行
function addRow(){
	storageVal = $('#purchaseArrival_mgr_purchaseArrival_form_storage').combobox('getValue');
	if(storageVal!=''){//判断
		var row = $('#purchase_arrival_form').datagrid('getSelected');
		if(row){
			var index = $('#purchase_arrival_form').datagrid('getRowIndex', row);
		} else {
			index = 0;
		}
		var rowsCount = $("#purchase_arrival_form").datagrid("getRows"); 
		$('#purchase_arrival_form').datagrid('insertRow', {
			index: index,
			row:{
				//填写对应的字段
				codes:rowsCount.length+1
			}
		});
		$('#purchase_arrival_form').datagrid('selectRow',index);
		$('#purchase_arrival_form').datagrid('beginEdit',index);
	}else{
		alert("仓库不能为空");
		return false;
	}
}

function cheshi(){
	console.log($('#purchase_arrival_form').datagrid('getData'));
	console.log($("#purchaseArrival_mgr_purchaseArrival_form").serialize());
	/* $('#ff').form('submit', {    
	    url:...,    
	    onSubmit: function(){    
	    },    
	    success:function(data){    
	        alert(data)    
	    }    
	}); */
}
//去到货品目录方法
function goodsDetail(rowIndex,rowData){
	$.easyui.showDialog({
		href : ctx + '/do/purchaseArrival/goodsDetail.htm',//从controller请求jsp页面进行渲染
		width : 530,
		height : 300,
		resizable: false,
		enableSaveButton : false,
		enableApplyButton : false,
		title : "货品目录",
		buttons : [ 
		 {
			text : '取消',
			iconCls : 'icon-save',
			handler : function(dia) {
				//判断是否有值
				if(!rowData.goodsName){
					$("#purchase_arrival_form").datagrid("deleteRow",rowIndex);
					dia.dialog("close"); 
				}else{
					dia.dialog("close");
				}
			}
		},{
			text : '确认',
			iconCls : 'icon-save',
			handler : function(dia) {
				var ed = $('#purchase_arrival_form').datagrid('updateRow', {
					index:stRows,
					row:{
						goodsCode:setRowData.goodsCode,
						goodsName:setRowData.goodsName,
						goodsModel:setRowData.specification,
						goodsUnit:setRowData.unit,
						arrival:0,
						delivery:0,
						rejection:0,
						money:0,
						cess:setRowData.taxRate,
						depositRate:0,
						originalCost:0,
						prices:0
					}
				});
				dia.dialog("close"); 
				$('#purchase_arrival_form').datagrid('endEdit', stRows).datagrid('refreshRow', stRows).datagrid('beginEdit', stRows);
			}
		}]
	});
};

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

//初始化所属仓库下拉项
$("#purchaseArrival_mgr_purchaseArrival_form_storage").combobox({
	data : $.parseJSON('${warehouseDate}'),//controller传来的数据源
	height:18,
	width:170,
    required:true,
    editable : false,
    missingMessage:'请选所属仓库',
	textField : 'warehouseName',//这里为名称
	valueField: 'warehouseId'//这里为IduserDate
});
 
//初始化供应商下拉项
$("#purchaseArrival_mgr_purchaseArrival_form_supplierId").combobox({
	data : $.parseJSON('${suppliersDate}'),//controller传来的数据源
	height:18,
	width:170,
    required:true,
    editable : false,
    missingMessage:'请选供应商',
	textField : 'suppliersName',//这里为名称
	valueField: 'supplierId'//这里为IduserDate
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

//初始化约定支付下拉项
$("#purchaseArrival_mgr_purchaseArrival_form_paymentTypeId").combobox({
	data : $.parseJSON('${paymentTypeDate}'),//controller传来的数据源
	height:18,
	width:170,
    required:true,
    editable : false,
    missingMessage:'请选约定支付',
	textField : 'paymentTypeName',//这里为名称
	valueField: 'paymentTypeId'//这里为IduserDate
});

//初始化物流公司下拉项
$("#purchaseArrival_mgr_purchaseArrival_form_logCompany").combobox({
	data : $.parseJSON('${suppliersLogisticsDate}'),//controller传来的数据源
	height:18,
	width:170,
    required:true,
    editable : false,
    missingMessage:'请选物流公司',
	textField : 'suppliersName',//这里为名称
	valueField: 'supplierId'//这里为IduserDate
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
	valueField: 'userCnName',//这里为Id
});
</script>
