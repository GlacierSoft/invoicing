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
 <table  class="formtable"> 
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
							<input id="contractCode" name="contractCode" class="easyui-validatebox spinner"style="width:168px;height:20px" value="${purchaseOrderData.contractCode }"   />
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
					  <td><input id="operatorDep" class="easyui-validatebox spinner" style="width:168px;height:20px;border-left-style: none;border-right-style: none;border-top-style: none;"  value="${purchaseOrderData.operatorDep}"  /></td>
				       <td style="padding-left:10px;">附件：</td> 
				       <td style="padding-left:10px;"><input type="button" name="accessory" value="上传"></td>
				     </tr>
				     <tr> 
					 	<td style="padding-left:10px;">备 注：</td>
						<td colspan="7"> <textarea   name="remark" class="easyui-validatebox spinner"style="width:920px;height: 50px"   >${purchaseOrderData.remark}</textarea></td>
					 </tr>  
	              </table> 
	     <hr> 
	      <div style="margin-left: 410px">
	         <font size="3" style="margin-top: 30px"><b>货品详情</b></font> 
	      </div> 
	      <hr>      
	      

     <!-- 所有列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true" > 
<!-- 	<div id="tb">
<a href="#" onclick="add()" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">添加行</a> 
<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-help',plain:true">批量添加</a>
</div> -->
	<div id="purchaseOrderPanel" data-options="region:'center',border:true">
		<table id="goodsList" >  
		</table>
	</div>
</div> 
  </form> 
<script type="text/javascript"> 
/* $('#goodsList').datagrid({
	toolbar: '#tb'
}); */ 
var editRow = undefined;
 
 //货品详情添加行
$('#goodsList').datagrid({  
	fit : false,//控件自动resize占满窗口大小
	iconCls : 'icon-save',//图标样式
	border : true,//是否存在边框 
	fitColumns : true,//自动填充行
	nowrap : true,//禁止单元格中的文字自动换行
	autoRowHeight : false,//禁止设置自动行高以适应内容
	striped : true,//true就是把行条纹化。（即奇偶行使用不同背景色）
	singleSelect : true,//限制单选
	checkOnSelect : false,//选择复选框的时候选择该行
	selectOnCheck : true,//选择的时候复选框打勾 
    //url: ctx + '/do/purchaseOrder/orderDetail.json',   
	sortName : 'goodsCode',//排序字段名称
	sortOrder : 'DESC',//升序还是降序
	remoteSort : true,//开启远程排序，默认为false
	idField : 'purOrderDetId', 
    columns:[[    
      {field :'purOrderDetId', title : 'ID', checkbox : true}, 
      {field:'goodsCode',title:'货品编码',width:200, 
    	  editor:{
				type:'combogrid', 
				width:200,
				options:{
					panelWidth:570,  
					border:true,//是否存在边框
					fitColumns:true,//自动填充行
					nowrap: true,//禁止单元格中的文字自动换行
					autoRowHeight: false,//禁止设置自动行高以适应内容
					striped: true,//true就是把行条纹化。（即奇偶行使用不同背景色）
					singleSelect:true,//限制单选
					selectOnCheck:false,//选择的时候复选框打勾
				    idField:'goodsId',    
				    textField:'goodsName',     
					url : ctx + '/do/goodsList/list.json',
					sortName : 'createTime',//排序字段名称
					sortOrder : 'DESC',//升序还是降序 
					columns : [ [ {
						field : 'goodsId',
						title : 'ID',
						checkbox : true
					}, {
						field : 'goodsCode',
						title : '货物编码',
						width : 120,
						sortable : true
					},{
						field : 'goodsName',
						title : '货物名称',
						sortable : true,
						width : 120
					},{
						field : 'enabled',
						title : '状态',
						width : 120,
						sortable : true,
						formatter : function(value, row, index) {
							return renderGridValue(value, fields.status);
						}
					},{
						field : 'creater',
						title : '创建人',
						sortable : true,
						width : 120
					},{
						field : 'createTime',
						title : '创建时间',
						sortable : true,
						width : 200
					},{
						field : 'updater',
						title : '更新人',
						sortable : true,
						width : 120
					}, {
						field : 'updateTime',
						title : '更新时间',
						sortable : true,
						width : 200
					},{
						field : 'remark',
						title : '备注',
						sortable : true
					} ] ],
						pagination : true,//True 就会在 datagrid 的底部显示分页栏
						pageSize : 10,//注意，pageSize必须在pageList存在
						pageList : [2,10,50,100],//从session中获取
						rownumbers : true,//True 就会显示行号的列
						onClickRow : function(rows) {  
							$('#goodsList').datagrid('reloadFooter',[
							                              	{name: 'goodsName', salary: "ss"} 
							                              ]);

						alert($(this).datagrid('getColumnOption','goodsName'));
						var	row =getRowIndex(this); 
						   $('#goodsList').datagrid('getEditor', { index: 2, field: 'goodsName' }).target.val("----");
							/* var  = $('#').datagrid("getChecked");
							var tr = $(target).closest('tr.datagrid-row'); 
							$("#supplierAdd").attr("value",$(this).datagrid("getSelected").adress); 
							$("#phone").attr("value",$(this).datagrid("getSelected").companyPhone); */
							
						},
					loadMsg : '数据加载中....',  
				}
			} 
      
      },   
      {field:'goodsName',title:'名称',width:100},    
      {field:'goodsModel',title:'规格型号',width:100},   
      {field:'brand',title:'品牌',width:100},  
      {field:'placeOfOrigin',title:'产地',width:100}, 
      {field:'primeCost',title:'原价',width:100},   
      {field:'discount',title:'折扣率',width:100,editor: { type: 'numberbox', options: { required: true } } },
      {field:'cess',title:'税率',width:100}, 
      {field:'deadline',title:'交货期限',width:100},
      {field:'price',title:'单价',width:100,editor: { type: 'numberbox', options: { required: true } } },    
      {field:'quantity',title:'数量',width:100,editor: { type: 'numberbox', options: { required: true } } }, 
      {field:'money',title:'金额',width:100},  
      {field:'deadline',title:'交货期限',width:100,editor: { type: 'datebox', options: { required: true } } },
      {field:'remark',title:'备注',width:100},
      {field:'s',title:'操作',width:100,
    	  formatter:function(value,row,index){
    		  
    		var e = '<a href="javascript:void(0)" onclick="editrow(this)">修改</a> ';
			var d = '<a href="javascript:void(0)" onclick="deleterow(this)">删除</a>';
			return e+d; 
			} 
    /*   editor: { type: 'text', options: { required: true } }  */}, 
      ]],
      toolbar: [{
      text: '添加行', iconCls: 'icon-add', handler: function () { 
    	  insert(); 
      }
    },{
        text: '删除', iconCls: 'icon-add', handler: function () { 
        	var rows = $('#goodsList').datagrid("getChecked"); 
        	alert("选中的长度"+rows.length);
        	var row;
        	$.messager.confirm('提示','确认删除数据?',function(r){
        		if (r){
        			for(var i=0;i<rows.length;i++){
            		    row=$('#goodsList').datagrid('getRowIndex', rows[i]);
            			$('#goodsList').datagrid('deleteRow',row);
            			alert("这是第"+row+"行");
            		} 
        		
        		}
        	});
    		
        }
      }], 
	pagination : true,//True 就会在 datagrid 的底部显示分页栏
	pcarrierCarTypeSize : 10,//注意，pcarrierCarTypeSize必须在pcarrierCarTypeList存在
	pcarrierCarTypeList : [ 2, 10, 50, 100 ],//从session中获取
	rownumbers : true,//True 就会显示行号的列
	 onBeforeEdit:function(index,row){  
	        row.editing = true;  
	        $('#goodsList').datagrid('refreshRow', index);  
	    },  
	    onAfterEdit:function(index,row){  
	        row.editing = false;  
	        $('#goodsList').datagrid('refreshRow', index);  
	    },  
	    onCancelEdit:function(index,row){  
	        row.editing = false;  
	        $('#goodsList').datagrid('refreshRow', index);  
	    } ,
        onAfterEdit: function (rowIndex, rowData, changes) {
            editRow = undefined;
        },
        onDblClickRow:function (rowIndex, rowData) {
            if (editRow != undefined) {
                $("#goodsList").datagrid('endEdit', editRow);
            }
 
            if (editRow == undefined) {
                $("#goodsList").datagrid('beginEdit', rowIndex);
                editRow = rowIndex;
            }
        },
        onClickRow:function(rowIndex,rowData){
        	
            if (editRow != undefined) {
                $("#goodsList").datagrid('endEdit', editRow);
 
            }
            
        } 
});   
 
/*  
 function getGoods(){
	 var tr = $(target).closest('tr.datagrid-row'); 
	 $('#goodsList').datagrid('beginEdit', rowIndex);
     //$.each(rowData, function(k, v) { alert(k+":"+v); });
     $("input.datagrid-editable-input").eq(0).focus(function() { alert('hello'+rowIndex); });
 } */
 
  //添加行
function insert(){
	var row = $('#goodsList').datagrid('getSelected');
	if (row){
		var index = $('#goodsList').datagrid('getRowIndex', row);
	} else {
		index = 0;
	}
	$('#goodsList').datagrid('insertRow', {
		index: index,
		row:{
			 
		}
	});
	$('#goodsList').datagrid('selectRow',index);
	$('#goodsList').datagrid('beginEdit',index);
}

 //删除行
function deleterow(target){
	$.messager.confirm('提示','确认删除数据?',function(r){
		if (r){
			$('#goodsList').datagrid('deleteRow', getRowIndex(target));
		}
	});
}

//获取行号
function getRowIndex(target){
	var tr = $(target).closest('tr.datagrid-row'); 
	return parseInt(tr.attr('datagrid-row-index'));
}

 
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