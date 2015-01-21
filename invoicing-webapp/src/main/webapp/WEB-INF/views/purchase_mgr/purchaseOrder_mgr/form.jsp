<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
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
 <table  class="formtable" > 
 <glacierui:toolbar panelEnName="PurchaseOrderList"
				toolbarId="purchaseOrderDataGrid_toolbar" menuEnName="purchaseOrder" />
 <caption style="height:50px;color: blue;"><font size="4" style="padding-top: 30px;">新增采购订货合同</font></caption>
				    <tr> 
				        <td style="padding-left:10px;">采购日期：</td>
						<td> 
						    <input name="orderDate"  required="true" class="easyui-datetimebox" style="width:168px;height:20px"  value="<fmt:formatDate value="${purchaseOrderData.orderDate}" pattern="yyyy-MM-dd"/>" /> 
						</td>
						<td style="padding-left:10px;">采购类型：</td>
						<td><input id="purchaseOrder_mgr_purchaseOrder_form_purchaseTypeId" name="purchaseTypeId" value='${purchaseDate.purchaseTypeId}' /></td>
				
				        <td style="padding-left:10px;">合同编号：</td>
						<td>
							<input id="contractCode" name="contractCode"  class="easyui-validatebox spinner"style="width:168px;height:20px" value="${purchaseOrderData.contractCode }"   />
						</td> 
					   <td style="padding-left:10px;">仓库：</td>
					  	<td ><input id="purchaseOrder_mgr_purchaseOrder_form_storage" name="storage" value="${purchaseDate.storageName}" /></td>
				    </tr>   
					  <tr>
					    <td style="padding-left:10px;">交货期限：</td>
						<td>
						   <input name="deliveryDadlines"  required="true" class="easyui-datetimebox" style="width:168px;height:20px"  value="<fmt:formatDate value="${purchaseOrderData.deliveryDadlines}" pattern="yyyy-MM-dd"/>" /> 
					 	<td style="padding-left:10px;">供应商：</td>
						<td >
					 	<input id="suppliers_mgr_suppliers_form_supplierType" value="${purchaseOrderData.suppliersName}" style="width: 168px;height:20px" name="suppliersName"  class="easyui-combogrid"  />
						</td>
						<td style="padding-left:10px;">供应商地址：</td>
						<td><input id="supplierAdd" class="easyui-validatebox spinner"style="width:168px;height:20px" value="${purchaseOrderData.supplierAdd}"  /></td>
				 	    <td style="padding-left:10px;">联系电话：</td>
				 	    <td><input id="phone" class="easyui-validatebox spinner"style="width:168px;height:20px" value="${purchaseOrderData.phone}"   /></td>
				
				    </tr>
				 	<tr>
					    <td style="padding-left:10px;">是否启用：</td>
						<td> 
							<input style="width:168px;height:20px" value="${purchaseOrderData.enabled}" name="invoice" class="easyui-combobox" 
					  	  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data :fields.status"/> 
					    </td>
					    <td style="padding-left:10px;">联系人：</td>
						<td>
						  <input id="suppliers_mgr_suppliers_form_linkman" value="${purchaseOrderData.linkman}" style="width: 168px;height:20px" name="linkman"  class="easyui-combogrid"  />
					    </td>
					    <td style="padding-left:10px;">手机：</td>
						    <td><input id="moi" class="easyui-validatebox spinner"style="width:168px;height:20px" value="${purchaseOrderData.phone}"   /></td>
				       <td style="padding-left:10px;">传真：</td>
					   <td><input class="easyui-validatebox spinner"style="width:168px;height:20px" value="${purchaseOrderData.fax}"  /></td>
					 
				    </tr> 
				
					<tr> 
				        <td style="padding-left:10px;">约定支付方式：</td>
						<td >
						    <input id="purchaseOrder_mgr_purchaseOrder_form_paymentTypeId" name="paymentTypeId"  value="${purchaseOrderData.paymentTypeId}" /> 
						 </td>
				        <td style="padding-left:10px;">付款约定：</td>
		 				<td>
							<input id="paymentAgrId" name="paymentAgrId" class="easyui-validatebox spinner"style="width:168px;height:20px" value="${purchaseOrderData.paymentAgrId }"   />
						</td>
					     <td style="padding-left:10px;">交货方式：</td>
						<td > 
						   <input id="purchaseOrder_mgr_purchaseOrder_form_deliveryType" name="deliveryType"  value="${purchaseOrderData.deliveryType}" /> 
					   </td>
					  <td style="padding-left:10px;">交货地址：</td>
						<td >
						    <input id="deliveryAdd" name="deliveryAdd" class="easyui-validatebox spinner"style="width:168px;;height:20px" value="${purchaseOrderData.deliveryAdd}"  />
						</td>
				     </tr>
					 <tr> 
				          <td style="padding-left:10px;">是否开发票：</td>
						<td>
						<input style="width:168px;height:20px" value="${purchaseOrderData.invoice}" name="invoice" class="easyui-combobox" 
					  	  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.yesOrNo"/> 
						</td>    
						<td style="padding-left:10px;">发票类别：</td>
						<td >
						<input style="width:168px;height:20px" value="${purchaseOrderData.invoiceTypeId}" name="invoiceTypeId" class="easyui-combobox" 
					  	  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.invoiceTypeId"/> 
					    </td>
				          <td style="padding-left:10px;">总金额：</td>
						<td >
						    <input id="totalAmount" name="totalAmount" class=" spinner" style="width:168px;height:20px;border-left-style: none;border-right-style: none;border-top-style: none;"   value="<fmt:formatNumber value='${purchaseOrderData.totalAmount}' pattern="#,#00.00元"/>" />
						</td>
				         <td style="padding-left:10px;">共享人：</td>
						<td >
						    <input id="sharedPeopleId" name="sharedPeopleId" class="easyui-validatebox spinner"style="width:168px;" value="${purchaseOrderData.sharedPeopleId}"  />
						</td> 
					 </tr> 
					  <tr>  
					   <td style="padding-left:10px;">经办人：</td>
				      <td>
				       	<input id="suppliers_mgr_suppliers_form_operators" value="${purchaseOrderData.operators}" style="width: 168px;height:20px" name="operators"  class="easyui-combogrid"  />
					   </td>
				      <td style="padding-left:10px;">经办部门：</td>
					  <td><input id="operatorDep" class="easyui-validatebox spinner" readonly="readonly" style="width:168px;height:20px;border-left-style: none;border-right-style: none;border-top-style: none;"  value="${purchaseOrderData.operatorDep}"  /></td>
				       <td style="padding-left:10px;">附件：</td> 
				       <td style="padding-left:10px;"><input type="button" name="accessory" value="上传"></td>
				     </tr>
				     <tr> 
					 	<td style="padding-left:10px;">备 注：</td>
						<td colspan="7"> <textarea   name="remark" class="easyui-validatebox spinner"style="width:920px;height: 50px"   >${purchaseOrderData.remark}</textarea></td>
					 </tr>  
	              </table> 
			     <hr> 
			      <div style="text-align: center;">
			         <font size="3" style="margin-top: 30px"><b>货品详情</b></font> 
			      </div> 
			      <hr>       

			     <!-- 所有列表面板和表格 -->  
				<div id="purchaseOrderPanel" data-options="region:'center',border:true">
					<table id="goodsList" style="margin-bottom: 50px">  
					</table>
					<hr> 
					<div style= "text-align:center ;margin-top: 30px;margin-bottom: 30px">
				        <a id="save" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-ok'">保存</a> 
				        <a style="margin-left: 30px" id="unbo" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-undo'">放弃</a> 
				      </div> 
				</div>  
  </form> 
<script type="text/javascript">  
//自定义combogrid
/* $.extend($.fn.datagrid.defaults.editors, {
	 
	    combogrid: {
	 
	        init: function(container, options){
	 
	            var input = $('<input type="text" class="datagrid-editable-input">').appendTo(container);
	 
	            input.combogrid(options);
	 
	            return input;
	 
	        },
	 
	        destroy: function(target){
	 
	            $(target).combogrid('destroy');
	 
	        },
	 
	        getValue: function(target){
	 
	            return $(target).combogrid('getValue');
	 
	        },
	 
	        setValue: function(target, value){
	 
	            $(target).combogrid('setValue', value);
	 
	        },
	 
	        resize: function(target, width){
	 
	            $(target).combogrid('resize',width);
	 
	        } 
	    }
	 
	});  */
//------------------分割线-------------------------- 
var $dg = $("#goodsList");

var storageVal="";//保存仓库ID
var stRows="";//保存行数
var divs = "";//保存goodsDetail中的dialog节点
var setRowData="";//保存选中的值

$dg.datagrid({  
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
        {field:'goodsId',title:'货品id',width:100,hidden:true},  
        {field:'goodsCode',title:'货品编码',width:100},    
        {field:'goodsName',title:'名称',width:100},    
       {field:'goodsModel',title:'规格型号',width:100},   
       {field:'brand',title:'品牌',width:100},  
       {field:'placeOfOrigin',title:'产地',width:100}, 
       {field:'primeCost',title:'成本价',width:100},   
       {field:'discount',title:'折扣率',width:100, editor: { type: 'numberbox' }}, 
       {field:'price',title:'单价',width:100,editor: { type: 'numberbox'} },   
       {field:'quantity',title:'数量',width:100,editor: { type: 'numberbox'} }, 
       {field:'money',title:'金额',width:100},   
       {field:'cess',title:'税率',width:100,editor: { type: 'numberbox'  }}, 
       {field:'deadline',title:'交货期限',width:100,editor: { type: 'datebox'  }},
       {field:'remark',title:'备注',width:100} 
    ]], 
    toolbar: [{
        text: '添加商品', iconCls: 'icon-standard-pencil-add', handler: function () { 
      	  //insert(); 
        	addRow();
        }
      },{
          text: '删除商品', iconCls: 'icon-standard-pencil-delete', handler: function () {  
          	$.messager.confirm('提示','确认删除数据?',function(r){
          		if (r){
          			var rows = $dg.datagrid("getSelected"); 
                    var	row=$dg.datagrid('getRowIndex', rows);
            		$dg.datagrid('deleteRow',row); 
          		
          		}
          	});  
      		
          }
        }],  
    rownumbers : true,//True 就会显示行号的列
    onDblClickRow:function(rowIndex, rowData){
    	stRows=rowIndex; 
    },
    onSelect:function(rowIndex, rowData){
    	stRows=rowIndex;  
    }
});
//增加行
function addRow(){
	storageVal = $('#purchaseOrder_mgr_purchaseOrder_form_storage').combobox('getValue');
    if(storageVal!=''){//判断 
		var row = $dg.datagrid('getSelected');
		var rowData=$dg.datagrid('getData');
		if(row){
			var index = $dg.datagrid('getRowIndex', row);
		} else {
			index = 0;
		}
		var rowsCount = $dg.datagrid("getRows"); 
		$dg.datagrid('insertRow', {
			index: index,
			row:{
				//填写对应的字段
				codes:rowsCount.length+1
			}
		});
		$dg.datagrid('selectRow',index);
		$dg.datagrid('beginEdit',index);
		goodsDetail(row,rowData);
	}else{
		$.messager.alert('提示信息','请先选择仓库！','info'); 
		$('#purchaseOrder_mgr_purchaseOrder_form_storage').focus(); 
		return false;
	}
}
 
//去到货品目录方法
function goodsDetail(rowIndex,rowData){
	$.easyui.showDialog({
		href : ctx + '/do/purchaseOrder/goodsIndex.htm',//从controller请求jsp页面进行渲染
		width : 730,
		height : 400,
		resizable: false,
		enableSaveButton : false,
		enableCloseButton :false,
		enableApplyButton : false,
		title : "货品目录",
		buttons : [ 
		{
			text : '保存',
			iconCls : 'icon-ok',
			handler : function(dia) { 
				if(setRowData==''){
					$.messager.alert('提示信息','请先选择商品信息！','info'); 
					return false;
				}
				var ed = $dg.datagrid('updateRow', {
					index:stRows,
					row:{
						goodsId:setRowData.goodsId,
						goodsCode:setRowData.goodsCode,
						goodsName:setRowData.goodsName,
						goodsModel:setRowData.specification,
						brand:setRowData.brands,
						placeOfOrigin:setRowData.origin,
						primeCost:setRowData.referenceCost,
						discount:1.00,
						price:setRowData.referenceRetailPrice,
						quantity:0,
						money:0.00,
						cess:setRowData.taxRate,
						remark:setRowData.remark
					}
				});
				dia.dialog("close"); 
				$dg.datagrid('endEdit', stRows).datagrid('refreshRow', stRows).datagrid('beginEdit', stRows);
			}
		}, {
			text : '取消',
			iconCls : 'icon-undo',
			handler : function(dia) {
				var rows = $dg.datagrid("getSelected"); 
                var	row=$dg.datagrid('getRowIndex', rows); 
        		$dg.datagrid('deleteRow',row);  
				dia.dialog("close"); 
			}
		}]
	});
};
   
 
  //添加行
function insert(){
	storageVal = $('#purchaseOrder_mgr_purchaseOrder_form_storage').combobox('getValue');
	 if(storageVal==''){
		 alert("请选择仓库");
	     return false;
	 }
    var row = $dg.datagrid('getSelected'); 
	if (row){
		var index = $dg.datagrid('getRowIndex', row);
	} else {
		index = 0;
	}   
	$dg.datagrid( 'insertRow', {
		index: index,
		row: { 
		}

	});
  	$dg.datagrid('selectRow',index);
	$dg.datagrid('beginEdit',index);  
}

 //删除行
function deleterow(target){
	$.messager.confirm('提示','确认删除数据?',function(r){
		if (r){
			$dg.datagrid('deleteRow', getRowIndex(target));
		}
	});
}

//获取行号
function getRowIndex(target){
	var tr = $(target).closest('tr.datagrid-row'); 
	return parseInt(tr.attr('datagrid-row-index'));
}

//放弃添加订购合同，返回订购合同显示页面
$("#unbo").click(function(){ 
	$("#layout_center_panel").panel("setTitle","采购订货合同");
	$('#layout_center_panel').panel('refresh',ctx +'/do/purchaseOrder/index.htm');
});

//点击保存，获取表格的数据
$("#save").click(function(){
	var date= $dg.datagrid('getData');
	//alert(date.Rows[1].Cells[3].value);
	
	var rows=$dg.datagrid('getRows'); 
	for ( var i = 0; i < rows.length; i++) { 
		$dg.datagrid('endEdit', i).datagrid('refreshRow', i).datagrid('beginEdit', i); 
		alert("折扣率："+rows[i].discount);
		//goodsId.push(rows[i].goodsId);  
	 } 
	
	//var da= $dg.datagrid('getEndit', {index:i,field:"discount"}).traget;
	//alert("da:"+date.Item.Cells[0].Controls[0].Text);
	var goodsId = [];//商品id标识 
	var discount=[];//折扣率
	var price=[];//单价
	var quantity=[];//数量
	var money=[];//金额
	var cess=[];//税率
	var deadline=[];//交货期限
	 /* for ( var i = 0; i < rows.length; i++) { 
		goodsId.push(rows[i].goodsId);  
	 }
	//序列化form表单
	 $.ajax({  
              type: "post",  
              url: ctx + '/do/purchaseOrder/add.json',  
              data:{  
            	purchaseOrder:$("#purchase_mgr_purchaseOrder_form").serialize(),  
            	goodsId : goodsId.join(',') 
              },
              success: function (result) {  
                   alert(result.msg); 
              }  
          });   */
	//alert(rows[0].goodsName);
});
 

//-------------------------------分割线-------以完善------------
 
//初始化采购类型下拉项
$("#purchaseOrder_mgr_purchaseOrder_form_purchaseTypeId").combobox({
	data : $.parseJSON('${purchaseTypeDate}'),//controller传来的数据源
	height:20,
	width:168,
    required:true,
    editable : false,
    missingMessage:'请选择采购类型',
	textField : 'name',//这里为名称
	valueField: 'purchaseTypeId'//这里为IduserDate
});

//初始化约定支付方式
$("#purchaseOrder_mgr_purchaseOrder_form_paymentTypeId").combobox({
	data : $.parseJSON('${paymentTypeDate}'),//controller传来的数据源
	height:20,
	width:168,
    required:true,
    editable : false,
    missingMessage:'请选择约定支付方式',
	textField : 'paymentTypeName',//这里为名称
	valueField: 'paymentTypeId'//这里为IduserDate
});

//初始化仓库下拉项
$("#purchaseOrder_mgr_purchaseOrder_form_storage").combobox({
	data : $.parseJSON('${warehouseDate}'),//controller传来的数据源
	height:20,
	width:168,
    required:true,
    editable : false,
    missingMessage:'请选择仓库',
	textField : 'warehouseName',//这里为名称
	valueField: 'warehouseId'//这里为IduserDate
});

//初始化交货方式下拉项
$("#purchaseOrder_mgr_purchaseOrder_form_deliveryType").combobox({
	data : $.parseJSON('${deliverTypeDate}'),//controller传来的数据源
	height:20,
	width:168,
    required:true,
    editable : false,
    missingMessage:'请选择交货方式',
	textField : 'deliverTypeName',//这里为名称
	valueField: 'deliverTypeId'//这里为IduserDate
});

//用于combogrid的供应商信息绑定
$('#suppliers_mgr_suppliers_form_supplierType').combogrid({
	panelWidth:570,
	fit:true,//控件自动resize占满窗口大小
	//iconCls:'icon-save',//图标样式
	border:true,//是否存在边框
	fitColumns:true,//自动填充行
	nowrap: true,//禁止单元格中的文字自动换行
	autoRowHeight: false,//禁止设置自动行高以适应内容
	striped: true,//true就是把行条纹化。（即奇偶行使用不同背景色）
	singleSelect:true,//限制单选
	checkOnSelect:false,//选择复选框的时候选择该行
	selectOnCheck:false,//选择的时候复选框打勾
    idField:'supplierId',    
    textField:'suppliersName',    
    url: ctx + '/do/suppliers/list.json?enabled=enable',
    sortName: 'createTime',//排序字段名称
	sortOrder: 'desc',//升序还是降序
	remoteSort: true,//开启远程排序，默认为false
    columns : [ [{
  				field:'supplierNumber',
  				title:'编号',
  				width:120,
  				sortable:true
  			},{
  				field:'suppliersName',
  				title:'名称',
  				width:120,
  				sortable:true
  			},{
  				field:'suppliersTypeName',
  				title:'供应商类型',
  				width:200,
  				sortable:true
  			},{
  				field:'companyPhone',
  				title:'联系电话',
  				width:200,
  				sortable:true
  			},{
  				field:'adress',
  				title:'地址',
  				width:200,
  				sortable:true
  			}
		 ] ],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pageSize : 10,//注意，pageSize必须在pageList存在
		pageList : [2,10,50,100],//从session中获取
		rownumbers : true,//True 就会显示行号的列
		onClickRow : function(rows) {  
			$("#supplierAdd").attr("value",$(this).datagrid("getSelected").adress); 
			$("#phone").attr("value",$(this).datagrid("getSelected").companyPhone);
			
		},
	loadMsg : '数据加载中....',  
});  



//用于combogrid的经办人信息绑定
$('#suppliers_mgr_suppliers_form_operators').combogrid({
	panelWidth:570,
	fit:true,//控件自动resize占满窗口大小
	//iconCls:'icon-save',//图标样式
	border:true,//是否存在边框
	fitColumns:true,//自动填充行
	nowrap: true,//禁止单元格中的文字自动换行
	autoRowHeight: false,//禁止设置自动行高以适应内容
	striped: true,//true就是把行条纹化。（即奇偶行使用不同背景色）
	singleSelect:true,//限制单选
	checkOnSelect:false,//选择复选框的时候选择该行
	selectOnCheck:false,//选择的时候复选框打勾
    idField:'userId',    
    textField:'userCnName',    
    url: ctx + '/do/user/list.json?status=enable',
    sortName: 'createTime',//排序字段名称
	sortOrder: 'desc',//升序还是降序
	remoteSort: true,//开启远程排序，默认为false
    columns : [ [
       {
			field:'username',
			title:'用户名',
			width:120,
			sortable:true
		},{
			field:'userCnName',
			title:'真实名称',
			width:120,
			sortable:true
		},{
			field:'depDisplay',
			title:'所属部门',
			width:120,
			sortable:true
		},
		 ] ],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pageSize : 10,//注意，pageSize必须在pageList存在
		pageList : [2,10,50,100],//从session中获取
		rownumbers : true,//True 就会显示行号的列
		onClickRow : function(rows) {   
			$("#operatorDep").attr("value",$(this).datagrid("getSelected").depDisplay);
		},
	loadMsg : '数据加载中....',  
});  



//用于combogrid的联系人信息绑定
$('#suppliers_mgr_suppliers_form_linkman').combogrid({
	panelWidth:570,
	fit:true,//控件自动resize占满窗口大小
	//iconCls:'icon-save',//图标样式
	border:false,//是否存在边框
	fitColumns:true,//自动填充行
	nowrap: true,//禁止单元格中的文字自动换行
	autoRowHeight: false,//禁止设置自动行高以适应内容
	striped: true,//true就是把行条纹化。（即奇偶行使用不同背景色）
	singleSelect:true,//限制单选
	checkOnSelect:false,//选择复选框的时候选择该行
	selectOnCheck:false,//选择的时候复选框打勾
    idField:'contactPersonId',    
    textField:'suppliersName',    
    url: ctx + '/do/suppliers/list.json',
    sortName: 'createTime',//排序字段名称
	sortOrder: 'desc',//升序还是降序
	remoteSort: true,//开启远程排序，默认为false
    columns : [ [  
            {
				field:'name',
				title:'姓名',
				width:120,
				sortable:true
			},{
				field:'sex',
				title:'性别',
				width:120,
				sortable:true
			},{
				field:'workPhone',
				title:'工作电话',
				width:200,
				sortable:true
			},{
				field:'companyPhone',
				title:'联系电话',
				width:200,
				sortable:true
			},{
				field:'homeAdress',
				title:'家庭住址',
				width:200,
				sortable:true
			}
		 ] ],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pageSize : 10,//注意，pageSize必须在pageList存在
		pageList : [2,10,50,100],//从session中获取
		rownumbers : true,//True 就会显示行号的列
		onClickRow : function(rows) {  
			$("#supplierAdd").attr("value",$(this).datagrid("getSelected").adress); 
			$("#phone").attr("value",$(this).datagrid("getSelected").companyPhone);
			
		},
	loadMsg : '数据加载中....',  
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