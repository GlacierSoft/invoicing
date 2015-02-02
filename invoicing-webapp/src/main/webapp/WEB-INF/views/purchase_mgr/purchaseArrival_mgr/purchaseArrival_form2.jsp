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
	<td><input id="purchaseArrival_mgr_purchaseArrival_form_purchaseTypeId" name="purchaseTypeId" value='${purchaseDate.purchaseTypeId}' /></td>
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
	<td><input id="purchaseArrival_mgr_purchaseArrival_form_operators" name="operators"  value="${purchaseDate.operators}" /></td>
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
	<td><input id="purchaseArrival_mgr_purchaseArrival_form_paymentTypeId" name="paymentTypeId"  value="${purchaseDate.paymentTypeId}" /></td>
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
	<td>备 注：</td><td><input  name="remark" style="width:168px;height: 18px;" class="spinner" value='${purchaseDate.remark}' /></td>
	<td></td><td></td>
</tr>
<tr>
	<td>付款约定：</td>
	<td colspan="3"><input id="purchaseArrival_mgr_purchaseArrival_form_paymentAgrId" name="paymentAgrId" value="${purchaseDate.paymentAgrId}" /></td>
</tr>
</table>
<div style="margin-top: 25px;">
	<table id="purchase_arrival_form" style="height: 200px;margin-top: 50px;">  
	</table>
	<hr> 
	<div style= "text-align:center ;margin-top: 30px;margin-bottom: 30px">
       <a id="save" href="javascript:goSave();" class="easyui-linkbutton" data-options="iconCls:'icon-ok'">保存</a> 
       <a style="margin-left: 30px" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-undo'">返回</a> 
    </div>
</div>
</form>

<script type="text/javascript">
var storageVal="";//保存仓库ID
var stRows="";//保存行数
var divs = "";//保存goodsDetail中的dialog节点
var setRowData="";//保存选中的值
var $dg = $('#purchase_arrival_form');
var isYesOrNo = true;
$(function(){
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
	url: ctx + '/do/purchaseArrivalDetail/list.json?purArrivalId=${purchaseDate.purArrivalId }',
	sortName : 'goodsCode',//排序字段名称
	sortOrder : 'DESC',//升序还是降序
	remoteSort : true,//开启远程排序，默认为false
	idField : 'purOrderDetId', 
    columns:[[
        {field:'goodsCode',title:'货品编码',width:100,editor: { type: 'text',required: true }},    
        {field:'goodsName',title:'货品名称',width:100},
       	{field:'goodsId',title:'货品编号',width:100,hidden:true},
        {field:'placeOfOrigin',title:'产地',width:100,hidden:true},
        {field:'goodsModel',title:'规格型号',width:100},   
        {field:'goodsUnit',title:'单位',width:100}, 
        {field:'batchInformation',title:'批次信息',width:100,editor: { type: 'text' }},
        {field:'arrival',title:'到货数量',width:100,editor: { type: 'numberbox', options: { 
        	required: true,
        	onChange:function(rec){
        		var indexRows = getRowIndex(this);
        		//到货数量
        		arrivalChange(indexRows,rec);
        	}	
        } } },
        {field:'delivery',title:'收货数量',width:100,editor: { type: 'numberbox', options: { 
        	required: true, 
        	onChange:function(rec){
        		var indexRows = getRowIndex(this);
        		//到货数量
        		deliveryChange(indexRows,rec);
        	}
        } } },
        {field:'rejection',title:'拒收数量',width:100,editor: { type: 'numberbox', options: { 
        	required: true,
        	onChange:function(rec){
        		var indexRows = getRowIndex(this);
        		//拒收数量
        		rejectionChange(indexRows,rec);
        	}
        } } },
        {field:'originalCost',title:'原价',width:100}, 
        {field:'depositRate',title:'折扣率',width:100,editor: { type: 'numberbox', options: { 
        	required: true,
        	precision: 2,
        	onChange:function(rec){
        		var indexRows = getRowIndex(this);
        		//折扣率数量
        		depositRateChange(indexRows,rec);
        	}
        } } }, 
        {field:'price',title:'单价',width:100,editor: { type: 'numberbox', options: { 
        	required: true,
        	precision: 2,
        	onChange:function(rec){
        		var indexRows = getRowIndex(this);
        		//折扣率
        		priceChange(indexRows,rec);
        	}
        } } }, 
        {field:'goodsMoney',title:'总金额',width:100,editor: { type: 'numberbox', options: { 
        	required: true,
        	precision: 2,
        	onChange:function(rec){
        		var indexRows = getRowIndex(this);
        		//总金额
        		goodsMoneyChange(indexRows,rec);
        	}
        } } },
        {field:'cess',title:'税率',width:100,hidden:true,editor: { type: 'numberbox', options: { required: true,precision: 2 } } }, 
        {field:'deadline',title:'交货期限',width:100,editor: { type: 'datebox', options: { } } },
        {field:'remark',title:'备注',width:100,editor: { type: 'text' } }
    ]],
    onLoadSuccess:function(data){
    	console.log(data.rows.length);
    	$(this).datagrid("beginEdit",1);
    	$("div[class='dialog-button datagrid-rowediting-panel']").remove();
    	/* for(var i=0;i<data.rows.length;i++){
    		//这里循环第二次就为空了
    		console.log($dg);
    		$("div[class='dialog-button datagrid-rowediting-panel']").remove();
			$dg.datagrid("beginEdit",i);
    		alert(i);
		} */
    },
    toolbar: [{
	   text: '添加商品', iconCls: 'icon-standard-pencil-add', handler: function () {
		   /* var rows = $('#purchase_arrival_form').datagrid("getRows");
		   for(var i=0;i<rows.length;i++){
	    		//这里循环第二次就为空了，这里也一样
			   $('#purchase_arrival_form').datagrid("beginEdit",i);
		  } */
		   test();
	   }
    },{
       text: '删除商品', iconCls: 'icon-standard-pencil-delete', handler: function () {  
	      $.messager.confirm('提示','确认删除数据?',function(r){
       		if (r){
       			var rows = $('#purchase_arrival_form').datagrid("getSelected"); 
                var	row = $('#purchase_arrival_form').datagrid('getRowIndex', rows);
                $('#purchase_arrival_form').datagrid('deleteRow',row); 
                compute();
       		}
	      });  
       }
     },{
   	      text: '批量添加商品', iconCls: 'icon-standard-pencil-add', handler: function () { 
   	    	batchRows();
   	      }
     }]
});
});

function test(){
	$dg.datagrid("beginEdit",1);
	$("div[class='dialog-button datagrid-rowediting-panel']").remove();
}

//到货数量的绑定调用方法
function arrivalChange(indexRows,rec){
	var deliveryTarget = $dg.datagrid('getEditor', {index:indexRows,field:'delivery'}).target;
	var rejectionTarget = $dg.datagrid('getEditor', {index:indexRows,field:'rejection'}).target;
	var goodsMoneyTarget = $dg.datagrid('getEditor', {index:indexRows,field:'goodsMoney'}).target;
	var priceTarget = $dg.datagrid('getEditor', {index:indexRows,field:'price'}).target;
	if(rec>0){
		$(deliveryTarget).numberbox('setValue', rec);
		$(rejectionTarget).numberbox('setValue', 0);
		var price = $(priceTarget).numberbox('getValue');
		var delivery = $(deliveryTarget).numberbox('getValue');
		$(goodsMoneyTarget).numberbox('setValue', delivery*price);//赋值(总金额=到货数量*单价)
		compute();//调用统计
	}
}

//收货数量
function deliveryChange(indexRows,rec){
	var arrivalTarget = $dg.datagrid('getEditor', {index:indexRows,field:'arrival'}).target;
	var deliveryTarget = $dg.datagrid('getEditor', {index:indexRows,field:'delivery'}).target;
	var rejectionTarget = $dg.datagrid('getEditor', {index:indexRows,field:'rejection'}).target;
	var goodsMoneyTarget = $dg.datagrid('getEditor', {index:indexRows,field:'goodsMoney'}).target;
	var priceTarget = $dg.datagrid('getEditor', {index:indexRows,field:'price'}).target;
	if(rec>0){
		var price = $(priceTarget).numberbox('getValue');
		var arrival = $(arrivalTarget).numberbox('getValue');
		$(goodsMoneyTarget).numberbox('setValue', rec*price);//赋值(总金额=到货数量*单价)
		$(rejectionTarget).numberbox('setValue', arrival-rec);//赋值(拒收数量=到货数量-收货数量)
		compute();//调用统计
	}
}

//拒收数量
function rejectionChange(indexRows,rec){
	var arrivalTarget = $dg.datagrid('getEditor', {index:indexRows,field:'arrival'}).target;
	var deliveryTarget = $dg.datagrid('getEditor', {index:indexRows,field:'delivery'}).target;
	var rejectionTarget = $dg.datagrid('getEditor', {index:indexRows,field:'rejection'}).target;
	var goodsMoneyTarget = $dg.datagrid('getEditor', {index:indexRows,field:'goodsMoney'}).target;
	var priceTarget = $dg.datagrid('getEditor', {index:indexRows,field:'price'}).target;
	if(rec>0){
		var price = $(priceTarget).numberbox('getValue');
		var arrival = $(arrivalTarget).numberbox('getValue');
		$(deliveryTarget).numberbox('setValue', arrival-rec);//赋值(收货数量=到货数量-拒收数量)
		var delivery = $(deliveryTarget).numberbox('getValue');
		$(goodsMoneyTarget).numberbox('setValue', delivery*price);//赋值(总金额=到货数量*单价)
		compute();//调用统计
	}
}

//折扣率
function depositRateChange(indexRows,rec){
	var deliveryTarget = $dg.datagrid('getEditor', {index:indexRows,field:'delivery'}).target;
	var goodsMoneyTarget = $dg.datagrid('getEditor', {index:indexRows,field:'goodsMoney'}).target;
	var priceTarget = $dg.datagrid('getEditor', {index:indexRows,field:'price'}).target;
	var rows = $('#purchase_arrival_form').datagrid('getData').rows[indexRows];
	var originalCost = rows.originalCost;
	if(rec>0){
		var price = $(priceTarget).numberbox('getValue');//取出单价
		$(priceTarget).numberbox('setValue', originalCost*rec);//赋值(单价=原价*折扣率)
		var delivery = $(deliveryTarget).numberbox('getValue');
		$(goodsMoneyTarget).numberbox('setValue', delivery*(originalCost*rec));//赋值(总金额=到货数量*单价(原价*折扣率))
		compute();//调用统计
	}
}

//单价
function priceChange(indexRows,rec){
	var deliveryTarget = $dg.datagrid('getEditor', {index:indexRows,field:'delivery'}).target;
	var goodsMoneyTarget = $dg.datagrid('getEditor', {index:indexRows,field:'goodsMoney'}).target;
	var depositRateTarget = $dg.datagrid('getEditor', {index:indexRows,field:'depositRate'}).target;
	var priceTarget = $dg.datagrid('getEditor', {index:indexRows,field:'price'}).target;
	//取原价
	var rows = $('#purchase_arrival_form').datagrid('getData').rows[indexRows];
	var originalCost = rows.originalCost;
	if(deliveryTarget.val()>0){
		depositRate = rec/originalCost;
		$(depositRateTarget).numberbox('setValue', depositRate);//赋值(折扣率=单价/原价)
		var delivery = $(deliveryTarget).numberbox('getValue');
		$(goodsMoneyTarget).numberbox('setValue', delivery*rec);//赋值(总金额=到货数量*单价)
		compute();//调用统计
	}
}

//总金额
function goodsMoneyChange(indexRows,rec){
	var deliveryTarget = $dg.datagrid('getEditor', {index:indexRows,field:'delivery'}).target;
	var depositRateTarget = $dg.datagrid('getEditor', {index:indexRows,field:'depositRate'}).target;
	var goodsMoneyTarget = $dg.datagrid('getEditor', {index:indexRows,field:'goodsMoney'}).target;
	var priceTarget = $dg.datagrid('getEditor', {index:indexRows,field:'price'}).target;
	if(rec>0){
		var delivery = $(deliveryTarget).numberbox('getValue');
		$(priceTarget).numberbox('setValue', rec/delivery);//赋值(单价=总金/收货数量)
	}
}

//绑定事件
function againBinding(indexRows){
	var goodsCodesTarget = $('#purchase_arrival_form').datagrid('getEditor', {index:indexRows,field:'goodsCode'}).target;
	$(goodsCodesTarget).bind("click",function(){goodsCodeClick(this);});
}

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
		$('#purchase_arrival_form').datagrid('insertRow', {
			index: index,
			row:{
				goodsCode:"",goodsName:"",
				goodsModel:"",goodsUnit:"",
				arrival:0,delivery:0,rejection:0,goodsMoney:0,
				cess:setRowData.taxRate,depositRate:1,
				originalCost:0,price:0,
				goodsId:"",placeOfOrigin:"",
				remark:"",deadline:"",batchInformation:""
			}
		});
		$('#purchase_arrival_form').datagrid('selectRow',index);
		$('#purchase_arrival_form').datagrid('beginEdit',index);
		againBinding(index);
		compute();//调用统计
	}else{
		$.messager.alert('提示信息','请先选择仓库！','info'); 
		$('#purchaseArrival_mgr_purchaseArrival_form_storage').focus(); 
		return false;
	}
}

//批量增加
function batchRows(){
	storageVal = $('#purchaseArrival_mgr_purchaseArrival_form_storage').combobox('getValue');
	if(storageVal!=''){//判断
		$.easyui.showDialog({
			title: "批量增加货物目录",
			href : ctx + '/do/purchaseArrival/batchGoodsDetail.htm',//从controller请求jsp页面进行渲染
			width : 730,
			height : 400,
			resizable: false,
			enableApplyButton : false,
			enableSaveButton : false,
			enableCloseButton : false,
			buttons : [{
	  			text : '确认',
	  			iconCls : 'icon-ok',
	  			handler : function(dia) {
	  				var rowsCheck = $('#goodsListDataGrid').datagrid('getChecked');
	  				if(rowsCheck != ""){
	  					var index = 0;
	  					for(var i = 0; i < rowsCheck.length;i++){
		  					$('#purchase_arrival_form').datagrid('insertRow', {
		  						index: 0,
		  						row:{
		  							goodsCode:rowsCheck[i].goodsCode,goodsName:rowsCheck[i].goodsName,
		  							goodsModel:rowsCheck[i].specification,goodsUnit:rowsCheck[i].unit,
		  							arrival:0,delivery:0,rejection:0,goodsMoney:0,
		  							cess:rowsCheck[i].taxRate,depositRate:1,
		  							originalCost:rowsCheck[i].referenceCost,price:rowsCheck[i].referenceCost,
		  							goodsId:rowsCheck[i].goodsId,placeOfOrigin:rowsCheck[i].origin,
		  							remark:"",deadline:"",batchInformation:""
		  						}
		  					});
		  					$("#purchase_arrival_form").datagrid("beginEdit",0);
		  					againBinding(0);
		  				}
	  				}else{
	  					$.messager.alert('提示信息','请选择所需货物！','info');
	  					return false;
	  				}
	  				compute();//调用统计
	  				dia.dialog("close");
	  			}
	  		},{
	  			text : '取消',
	  			iconCls : 'icon-undo',
	  			handler : function(dia) {
	  				dia.dialog("close"); 
	  			}
	  		}]
		});
	}else{
		alert("仓库不能为空");
		return false;
	}
}

//根据编辑框返回行数
function getRowIndex(target){
	var tr = $(target).closest('tr.datagrid-row');
	return parseInt(tr.attr('datagrid-row-index'));
}

function goSave(){
	if($('#purchaseArrival_mgr_purchaseArrival_form').form("validate")){//验证判断
		//先取出所有行的条数
		var delOldRows = $("#purchase_arrival_form").datagrid("getRows");
		//进行删除最后一行统计
		if(delOldRows.length >= 3){
			$("#purchase_arrival_form").datagrid("deleteRow",delOldRows.length-1);
		}
		var rowsCount = $("#purchase_arrival_form").datagrid("getRows");
		for(var i=0;i<rowsCount.length;i++){//全部关闭
			$('#purchase_arrival_form').datagrid('endEdit', i);
		}
	}
	//取出datagrid中所有值
	var rowsAll = $('#purchase_arrival_form').datagrid('getData').rows;
	var str=JSON.stringify($("#purchaseArrival_mgr_purchaseArrival_form").serializeObject());
	//转化为json
	var json = JSON.stringify(rowsAll);
	if("${purchaseDate.purArrivalId}"!=""){
		$.post(ctx + '/do/purchaseArrival/edit.json', { rows: json,purchaseArrival:str},
		   function(data){
			$.messager.show({
	    		title:'提示信息',
	    		msg:'采购到货修改成功!',
	    		showType:'show',
	    		style:{
	    			right:'',
	    			top:document.body.scrollTop+document.documentElement.scrollTop,
	    			bottom:''
	    		}
	    	});
			$("#layout_center_panel").panel("setTitle","采购到货详情信息").panel('refresh',ctx + '/do/purchaseArrival/intoDetail.htm?purchaseId=${purchaseDate.purArrivalId}');
		 });
	}else{
		//新增
	   	 $.post(ctx + '/do/purchaseArrival/add.json', { rows: json,purchaseArrival:str},
		   function(data){
			$.messager.show({
	    		title:'提示信息',
	    		msg:'采购到货增加成功!',
	    		showType:'show',
	    		style:{
	    			right:'',
	    			top:document.body.scrollTop+document.documentElement.scrollTop,
	    			bottom:''
	    		}
	    	});
			$("#layout_center_panel").panel("setTitle","采购到货").panel('refresh',ctx + '/do/purchaseArrival/index.htm');
		 });
	}
	
}

//底部统计
function compute(){//计算函数
	//获取数据行
    var rows = $('#purchase_arrival_form').datagrid('getRows');
    var goodsMoneyTotal = 0,arrivalTotal = 0,deliveryTotal = 0,rejectionTotal = 0;//计算goodsMoneyTotal的总和以及统计arrivalTotal的总和，deliveryTotal总和
    if(rows.length >= 2){
	    //新增一行显示统计信息
	    var computeRow = $('#purchase_arrival_form').datagrid('getData').rows[rows.length-1];//获取某一行数据
	    if(computeRow.goodsCode == "<b>统计：</b>"){//修改
	    	for (var i = 0; i < rows.length-1; i++) {
	    		var rejectionTarget = $("#purchase_arrival_form").datagrid('getEditor', {index:i,field:'rejection'}).target;
	    		var deliveryTarget = $("#purchase_arrival_form").datagrid('getEditor', {index:i,field:'delivery'}).target;
	    		var goodsMoneyTarget = $('#purchase_arrival_form').datagrid('getEditor', {index:i,field:'goodsMoney'}).target;
	    		var arrivalTarget = $('#purchase_arrival_form').datagrid('getEditor', {index:i,field:'arrival'}).target;
	    		goodsMoneyTotal += parseFloat(goodsMoneyTarget.val());
		        deliveryTotal += parseInt(deliveryTarget.val());
		        rejectionTotal += parseInt(rejectionTarget.val());
		    	arrivalTotal += parseInt(arrivalTarget.val());
		    }
	    	$('#purchase_arrival_form').datagrid('updateRow', {
	    		index:rows.length-1,
	    		row:{ 
				     arrival: arrivalTotal,
				     delivery: parseInt(deliveryTotal),goodsMoney: goodsMoneyTotal,
				     rejection: rejectionTotal
				     }
	    	});
	    	$('#purchase_arrival_form').datagrid('refreshRow', rows.length-1);
	    }else{//增加
	    	for (var i = 0; i < rows.length; i++) {
	    		var rejectionTarget = $("#purchase_arrival_form").datagrid('getEditor', {index:i,field:'rejection'}).target;
	    		var deliveryTarget = $("#purchase_arrival_form").datagrid('getEditor', {index:i,field:'delivery'}).target;
	    		var goodsMoneyTarget = $('#purchase_arrival_form').datagrid('getEditor', {index:i,field:'goodsMoney'}).target;
	    		var arrivalTarget = $('#purchase_arrival_form').datagrid('getEditor', {index:i,field:'arrival'}).target;
	    		goodsMoneyTotal += parseFloat(goodsMoneyTarget.val());
		        deliveryTotal += parseInt(deliveryTarget.val());
		        rejectionTotal += parseInt(rejectionTarget.val());
		    	arrivalTotal += parseInt(arrivalTarget.val());
		    }
	    	$('#purchase_arrival_form').datagrid('appendRow', { 
		    	goodsCode: '<b>统计：</b>', arrival: arrivalTotal,
		    	delivery: parseInt(deliveryTotal),goodsMoney: goodsMoneyTotal,
		    	rejection: rejectionTotal
		       }
		    );
	    }
    }
}

//去到货品目录方法
function goodsDetail(rowIndex){
	$.easyui.showDialog({
		href : ctx + '/do/purchaseArrival/goodsDetail.htm',//从controller请求jsp页面进行渲染
		width : 730,
		height : 400,
		resizable: false,
		enableSaveButton : false,
		enableApplyButton : false,
		enableCloseButton : false,
		title : "货品目录",
		buttons : [ 
		 {
			text : '确认',
			iconCls : 'icon-ok',
			handler : function(dia) {
				//确认后赋值
				$('#purchase_arrival_form').datagrid('updateRow', {
					index:stRows,
					row:{
						goodsCode:setRowData.goodsCode,goodsName:setRowData.goodsName,
						goodsModel:setRowData.specification,goodsUnit:setRowData.unit,
						arrival:0,delivery:0,rejection:0,goodsMoney:0,
						cess:setRowData.taxRate,depositRate:1,
						originalCost:setRowData.referenceCost,price:setRowData.referenceCost,
						goodsId:setRowData.goodsId,placeOfOrigin:setRowData.origin,
						remark:"",deadline:"",batchInformation:""
					}
				});
				dia.dialog("close"); 
				$('#purchase_arrival_form').datagrid('endEdit', stRows).datagrid('refreshRow', stRows).datagrid('beginEdit', stRows);
				againBinding(stRows);
				compute();//调用统计			
			}
		},{
			text : '取消',
			iconCls : 'icon-undo',
			handler : function(dia) {
				dia.dialog("close"); 
			}
		}]
	});
};


//货物编码编辑框点击事件
function goodsCodeClick(obj){
	var indexRows = getRowIndex(obj);
	//先取出所有行的条数
	var countRows = $("#purchase_arrival_form").datagrid("getRows");
	if(countRows.length >= 2 && countRows.length-1 == indexRows){
		return false;
	}else{
		stRows=indexRows;
    	goodsDetail(indexRows);
	}
}

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
