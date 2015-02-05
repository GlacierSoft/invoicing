<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="purchaseArrival_mgr_purchaseArrival_form" method="post">
<table  class="formtable" style="margin-left: 20px;margin-top: 20px;">
 <caption style="height:50px;color: blue;"><font size="4" style="padding-top: 30px;">到货</font></caption>
 <tr> 
    <td>到货日期：</td>
	<td>
	<input id="purchaseArrival_mgr_purchaseArrival_form_arrivalDate" name="arrivalDate" class="easyui-datebox" 
	<%-- value="<fmt:formatDate value="${purchaseDate.arrivalDate}" pattern="yyyy-MM-dd HH:mm:ss"/>"  --%> required="true" style="width:168px;height: 18px;" /></td>
	<td style="padding-left:10px;">采购类型：</td>
	<td><input id="purchaseArrival_mgr_purchaseArrival_form_purchaseTypeId" name="purchaseTypeId" value='${purchaseDate.purchaseTypeId}' /></td>
	<td style="padding-left:10px;">所属仓库：</td>
	<td ><input id="purchaseArrival_mgr_purchaseArrival_form_storage" name="storage" value="${purchaseDate.storage}" /></td>
    <td style="padding-left:10px;">合同编号：</td>
	<td><input id="purchaseArrival_mgr_purchaseArrival_form_contractCode" name="contractCode" value='${purchaseDate.contractCode}' 
		class="easyui-validatebox spinner" style="width:168px;height: 18px;"/></td>
  
</tr>
<tr>
	<td>供应商：</td>
	<td><input id="purchaseArrival_mgr_purchaseArrival_form_supplierId" name="supplierId" value="${purchaseDate.supplierId}" /></td>
    <td style="padding-left:10px;">供应商地址：</td>
	<td><input id="purchaseArrival_mgr_purchaseArrival_form_supplierAdd" name="supplierAdd" value="${purchaseDate.supplierAdd}" 
		class="easyui-validatebox spinner" style="width:168px;height: 18px;"/></td>
	<td style="padding-left:10px;">联系人：</td>
	<td><input id="purchaseArrival_mgr_purchaseArrival_form_linkman" name="linkman" class="easyui-validatebox spinner" style="width:168px;height: 18px;" value="${purchaseDate.linkman}" /></td>
    <td style="padding-left:10px;">联系电话：</td>
    <td><input id="purchaseArrival_mgr_purchaseArrival_form_phone" name="phone" class="easyui-validatebox spinner" style="width:168px;height: 18px;" value="${purchaseDate.phone}" /></td>
</tr>
<tr>
	<td>传真：</td>
	<td><input id="purchaseArrival_mgr_purchaseArrival_form_fax" name="fax" class="easyui-validatebox spinner" style="width:168px;height: 18px;" value="${purchaseDate.fax}"  /></td>
	<td style="padding-left:10px;">交货方式：</td>
	<td><input id="purchaseArrival_mgr_purchaseArrival_form_deliveryType" name="deliveryType" value="${purchaseDate.deliveryType}" /></td>
	<td style="padding-left:10px;">交货期限：</td>
	<td><input id="purchaseArrival_mgr_purchaseArrival_form_deliveryDead" name="deliveryDead" class="easyui-datebox" value="<fmt:formatDate value="${purchaseDate.deliveryDadlines}" pattern="yyyy-MM-dd"/>" 
	style="width:168px;height: 18px;" /></td>
	<td style="padding-left:10px;">交货地址：</td>
	<td><input id="purchaseArrival_mgr_purchaseArrival_form_deliveryAdd" name="deliveryAdd" class="easyui-validatebox spinner" style="width:168px;height: 18px;" value="${purchaseDate.deliveryAdd}" /></td>
</tr>
<tr>
	<td>验收人：</td>
	<td><input id="purchaseArrival_mgr_purchaseArrival_form_acceptor" name="acceptor"  /></td>
   	<td style="padding-left:10px;">附件：</td>
  	<td><input class="easyui-validatebox spinner" style="width:168px;height: 18px;" name="accessory"  value="${purchaseDate.accessory}" /></td>
	<td style="padding-left:10px;">经办人：</td>
	<td><input id="purchaseArrival_mgr_purchaseArrival_form_operators" name="operators"  value="${purchaseDate.operators}" /></td>
    <td style="padding-left:10px;">经办部门：</td>
	<td><input id="operatorDep" class="easyui-validatebox spinner" style="width:168px;height: 18px;" name="operatorDep"  value="${purchaseDate.operatorDep}" disabled="disabled"/></td>
</tr>
<tr>
	<td>是否开票：</td>
	<td><input style="width:168px" value="${purchaseDate.invoice}" name="invoice" class="easyui-combobox" 
	  	data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.yesOrNo"/></td>
	<td style="padding-left:10px;">状态：</td>
	<td><input style="width:168px" value="${purchaseDate.enabled}" name="enabled" class="easyui-combobox" 
	  	data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/></td>
	<td style="padding-left:10px;">发票类型：</td>
	<td><input style="width:168px" value="${purchaseDate.invoiceTypeId}" name="invoiceTypeId" class="easyui-combobox" 
	 	  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.invoiceTypeId"/></td>
	   <td style="padding-left:10px;">约定支付方式：</td>
	<td><input id="purchaseArrival_mgr_purchaseArrival_form_paymentTypeId" name="paymentTypeId"  value="${purchaseDate.paymentTypeId}" /></td>
</tr>
<tr>
	<td>运费结算方式：</td>
	<td><input id="purchaseArrival_mgr_purchaseArrival_form_logSettlementId" style="width:168px"  name="logSettlementId" class="easyui-combobox" 
  	  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.logSettlementId"/></td>
    <td style="padding-left:10px;">运单号：</td>
	<td><input name="logCode" class="spinner" style="width:168px;height: 18px;"   /></td>
	<td style="padding-left:10px;">运费总额：</td>
	<td><input  name="logTotalTmount" class="spinner" style="width:168px;height: 18px;"  /></td>
    <td style="padding-left:10px;">物流公司：</td>
	<td><input id="purchaseArrival_mgr_purchaseArrival_form_logCompany" name="logCompany"   /></td>
</tr>
<tr>
	<td>物流联系人：</td>
	<td><input  name="logLinkman" style="width:168px;height: 18px;" class="spinner" /></td>
    <td style="padding-left:10px;">物流电话：</td>
	<td><input  name="logPhone" style="width:168px;height: 18px;" class="spinner"  /></td>
	<td style="padding-left:10px;"> 备 注：</td>
	<td><input  name="remark" style="width:168px;height: 18px;" class="spinner" value='${purchaseDate.remark}' /></td>
	<td style="padding-left:10px;">总金额：</td>
	<td><input  name="totalAmount" class="spinner" style="width:168px;height: 18px;" value='${purchaseDate.totalAmount}' disabled="disabled" /></td>
</tr>
<tr>
	<td>付款约定：</td>
	<td colspan="3"><input id="purchaseArrival_mgr_purchaseArrival_form_paymentAgrId" name="paymentAgrId" value="${purchaseDate.paymentAgrId}" /></td>
</tr>
</table>
<div style="margin-top: 25px;">
	<table id="goodsList" style="height:auto;margin-top: 50px;">  
	</table>
	<hr> 
	<div style= "text-align:center ;margin-top: 30px;margin-bottom: 30px">
          <a id="saveOk" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-ok'">保存</a> 
	        <a style="margin-left: 30px" id="unbo" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-undo'">返回</a> 
	   
    </div>
</div>
</form>

<script type="text/javascript">
var id="${purchaseDate.purOrderId}";
var $dg = $("#goodsList"); 
var storageVal="";//保存仓库ID 
var stRows="";//保存行数
var divs = "";//保存goodsDetail中的dialog节点
var setRowData="";//保存选中的值
var selecRows=0;
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
	url: ctx + '/do/purchaseOrder/orderDetail.json?orderId=${purchaseDate.purOrderId }', 
	sortName : 'goodsCode',//排序字段名称
	sortOrder : 'DESC',//升序还是降序
	remoteSort : true,//开启远程排序，默认为false
	idField : 'goodsId', 
    columns:[[  
        {field:'goodsCode',title:'货品编码',width:100,editor: { type: 'text',required: true }},    
        {field:'goodsName',title:'货品名称',width:100},
       	{field:'goodsId',title:'货品编号',width:100,hidden:true},
        {field:'placeOfOrigin',title:'产地',width:100,hidden:true},
        {field:'goodsModel',title:'规格型号',width:100},  
        {field:'batchInformation',title:'批次信息',width:100,editor: { type: 'text' }},
        {field:'quantity',title:'订购数量',width:100},
        {field:'arrival',title:'到货数量',width:100,editor: { type: 'numberbox',options:{min:0,max:9999}} },
        {field:'delivery',title:'收货数量',width:100,editor: { type: 'numberbox',options:{min:0,max:9999}} },
        {field:'rejection',title:'拒收数量',width:100},
        {field:'primeCost',title:'原价',width:100}, 
        {field:'discount',title:'折扣率',width:100,editor: { type: 'numberbox'} }, 
        {field:'price',title:'单价',width:100,editor: { type: 'numberbox' } }, 
        {field:'money',title:'总金额',width:100},
        {field:'cess',title:'税率',width:100,hidden:true,editor: { type: 'numberbox', options: {precision: 2 } } }, 
        {field:'deadline',title:'交货期限',width:100,editor: { type: 'datebox', options: { } } },
        {field:'remark',title:'备注',width:100,editor: { type: 'text' } }
    ]], 
    toolbar: [
              {
               text: '添加商品', iconCls: 'icon-standard-pencil-add', handler: function () { 
             		var row= $dg.datagrid('getSelected');//获取上一次的选中行
                 	var index=$dg.datagrid('getRowIndex',row);  
                     addRows();
               }
             },{
               text: '删除商品', iconCls: 'icon-standard-pencil-delete', handler: function () {  
             	  var rows=$dg.datagrid('getRows');//获取总行数，统计行不能删除 
             	  var selectRows = $dg.datagrid("getSelected");//获取选中行
             	  var row=$dg.datagrid('getRowIndex', selectRows);//获取选中行下标
             	  if(selectRows==null){ 
             		  $.messager.alert('提示','未选择删除商品！','info'); 
                       return;
             	  }  
             	  var computeRow = $dg.datagrid('getData').rows[row];//获取最后一行数据
             	  if(computeRow.goodsCode == "<b>统计：</b>"){//如果是统计行，就不让删除
             		  $.messager.alert('提示','统计行不能删除！','info'); 
                       return;
       		  } 
               	$.messager.confirm('提示','确认删除数据?',function(r){
               		if (r){ 
               			var rows = $dg.datagrid("getSelected"); 
               			var sum=$("#totalAmount").attr("value");
               		 	$("#totalAmount").attr("value","").attr("value",(sum-rows.money).toFixed(2));
                         var	row=$dg.datagrid('getRowIndex', rows);
                 		$dg.datagrid('deleteRow',row); 
                 		compute();//删除后调用统计
                 		var rows = $dg.datagrid('getRows'); //删除后重新获取所有行
     					if(rows.length==2){ //如果正好是两行，就把统计行也删除
     						$dg.datagrid('deleteRow',1);//删除统计行 
     					 } 
               		}
               	});   
               }
             }],  
          
         rownumbers : true,//True 就会显示行号的列
         onDblClickRow:function(rowIndex, rowData){
         	stRows=rowIndex; 
         },
         onLoadSuccess:function(data){
        	 compute();
         }, 
         onSelect:function(rowIndex, rowData){     
         	var rows = $dg.datagrid('getRows'); 
         	if(rows.length==1){
         		selecRows=0;
         	} 
         	$dg.datagrid('endEdit',selecRows);//.datagrid('refreshRow', selecRows); //关闭上一次选中的行  
           	var computeRow = $dg.datagrid('getData').rows[rowIndex];//获取某一行数据 
     		if(computeRow.goodsCode != "<b>统计：</b>"){//如果不是统计行， 开启当前行可编辑
     			$dg.datagrid('beginEdit',rowIndex); 
       	    	againBinding(rowIndex); 
       	    	stRows=rowIndex;  
     		  }  
     		selecRows=rowIndex;  
             //移除那两个按钮
         	$("div[class='dialog-button datagrid-rowediting-panel']").remove(); 
         } 
     }); 
//批量增加
function addRows(){
	storageVal = $('#purchaseArrival_mgr_purchaseArrival_form_storage').combobox('getValue');
	if(storageVal!=''){//判断
		$.easyui.showDialog({
			title: "增加货物目录",
			href : ctx + '/do/purchaseOrder/goodsDetailArr.htm',//从controller请求jsp页面进行渲染
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
	  				var rowsCheck =  $("#goodsListDataGrid").datagrid('getChecked'); 
	  				var data = $dg.datagrid('getData');//获取整个表格数据  
	  				var rows = $dg.datagrid('getRows');//获取整个表格数据  
	  				var indexSun=0; 
	  				for(var i = 0; i < rowsCheck.length;i++){
	  					//设置状态 
	  					var te=false; 
  						for(var r = 0; r<rows.length;r++){ 
	  						if(data.rows[r].goodsId==rowsCheck[i].goodsId){ 
	  							 te=true; 
	  							 break;  //存在相同的，跳出当前循环
	  						}  
	  					} 
	  					//如果是false,就添加一行数据
	  					if(te){
	  						$.messager.alert('提示信息','已存在的商品无需再次添加！','info'); 
	  						return;
	  					}else{ 
	  						indexSun=indexSun+1;
	  						$dg.datagrid('insertRow', {
		  						index: i,
		  						row:{
		  							goodsId:rowsCheck[i].goodsId,
		  							goodsCode:rowsCheck[i].goodsCode,
		  							goodsName:rowsCheck[i].goodsName,
		  							goodsModel:rowsCheck[i].goodsModel,
		  							brand:rowsCheck[i].brands, 
		  							primeCost:rowsCheck[i].primeCost,
		  							discount:rowsCheck[i].discount, 
		  							price:rowsCheck[i].price, 
		  							arrival:rowsCheck[i].quantity,
		  							delivery:rowsCheck[i].quantity,
		  							rejection:0,
		  							quantity:rowsCheck[i].quantity,
		  							money:rowsCheck[i].money,
		  							cess:rowsCheck[i].cess,
		  							remark:rowsCheck[i].remark
		  						}
		  					});
		  					$dg.datagrid('beginEdit', i);
		  					$dg.datagrid('endEdit', i).datagrid('refreshRow', i).datagrid('beginEdit', i); 
		  					againBinding(i);//批量增加绑定的事件
	  					}
	  					
	  			 }
	  				$dg.datagrid('endEdit', indexSun-1).datagrid('refreshRow', indexSun-1); 
	  				selecRows=selecRows+indexSun; //上一次选中的行=原来选中的行+新添加的行数
	  				dia.dialog("close");
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
	}else{
		$.messager.alert('提示信息','请先选择仓库！','info'); 
		$('#purchaseOrder_mgr_purchaseOrder_form_storage').focus(); 
		return false;
	}
} 
 
//底部统计
function compute(){//计算函数 
	//获取数据行
var rows = $dg.datagrid('getRows'); 
var moneyTotal = 0,
    quantityTotal = 0,
    arrivalTotal = 0,
    deliveryTotal = 0,
    rejectionTotal = 0;//计算moneyTotal的总和以及统计arrivalTotal的总和，deliveryTotal总和
	if(rows.length >= 2){
	    //新增一行显示统计信息
	    var computeRow = $dg.datagrid('getData').rows[rows.length-1];//获取某一行数据
	    var row=$dg.datagrid('getSelected');//获取当前选中的行 
	    if(computeRow.goodsCode == "<b>统计：</b>"){//修改 
	    	for (var i = 0; i < rows.length-1; i++) { 
		    	if(row==i){ //如果是选中行，则获取编辑器的值
		    		//到货数量
	    			var arrivalTotal = $dg.datagrid('getEditor', {index:i,field:'arrival'}).target;
	    			//收货数量
	    			var deliveryTotal = $dg.datagrid('getEditor', {index:i,field:'delivery'}).target; 
		    		//金额
	    			var moneyTarget = $dg.datagrid('getEditor', {index:i,field:'money'}).target; 
			    	moneyTotal += parseFloat(moneyTarget.val()); 
			    	//到货数量，不能大于订购数量
			    	if(parseInt(arrivalTotal.val())>rows[i]['quantity']){
			    		arrivalTotal+=rows[i]['quantity'];
			    	}else{
			    		arrivalTotal+=parseInt(arrivalTotal.val());
			    	} 
			    	
			    	//收货数量，不能大于到货数量
			    	if(parseInt(deliveryTotal.val())>parseInt(arrivalTotal.val())){
			    		deliveryTotal+=parseInt(arrivalTotal.val());
			    	}else{
			    		deliveryTotal+=parseInt(deliveryTotal.val());
			    	} 
			    	
			    	var quantityTarget = $dg.datagrid('getEditor', {index:i,field:'quantity'}).target;
			    	if(parseInt(quantityTarget.val())>9999){
			    		quantityTotal+=9999;
			    	}else{
			    		quantityTotal += parseInt(quantityTarget.val());
			    	}  
			    	rejectionTotal += rows[i]['rejection'];
	    		}else{//否则直接获取列值相加
	    			moneyTotal +=parseFloat(rows[i]['money']);
	    			quantityTotal += rows[i]['quantity'];
	    			arrivalTotal += rows[i]['arrival'];
	    			deliveryTotal += rows[i]['delivery'];
	    			rejectionTotal += rows[i]['rejection'];
	    		} 
		    	
		    }
	    	$dg.datagrid('updateRow', {
	    		index:rows.length-1,
	    		row:{  
				     money: moneyTotal,
				     quantity: quantityTotal,
				     arrival:arrivalTotal,
				     delivery:deliveryTotal,
				     rejection:rejectionTotal
				     }
	    	});
	    	$dg.datagrid('refreshRow', rows.length-1);
	    }else{//增加 
	    	for (var i = 0; i < rows.length; i++) {
	    		if(row==i){ //如果是选中行，则获取编辑器的值
	    			//到货数量
	    			var arrivalTotal = $dg.datagrid('getEditor', {index:i,field:'arrival'}).target;
	    			//收货数量
	    			var deliveryTotal = $dg.datagrid('getEditor', {index:i,field:'delivery'}).target; 
		    		//金额
	    			var moneyTarget = $dg.datagrid('getEditor', {index:i,field:'money'}).target; 
			    	moneyTotal += parseFloat(moneyTarget.val());
			    	  
			    	//到货数量，不能大于订购数量
			    	if(parseInt(arrivalTotal.val())>rows[i]['quantity']){
			    		arrivalTotal+=rows[i]['quantity'];
			    	}else{
			    		arrivalTotal+=parseInt(arrivalTotal.val());
			    	} 
			    	
			    	//收货数量，不能大于到货数量
			    	if(parseInt(deliveryTotal.val())>parseInt(arrivalTotal.val())){
			    		deliveryTotal+=parseInt(arrivalTotal.val());
			    	}else{
			    		deliveryTotal+=parseInt(deliveryTotal.val());
			    	} 
			    	
			    	var quantityTarget = $dg.datagrid('getEditor', {index:i,field:'quantity'}).target;
			    	if(parseInt(quantityTarget.val())>9999){
			    		quantityTotal+=9999;
			    	}else{
			    		quantityTotal += parseInt(quantityTarget.val());
			    	}
			    	rejectionTotal += rows[i]['rejection'];
	    		}else{//否则直接获取列值相加
	    			moneyTotal +=parseFloat(rows[i]['money']);
	    			quantityTotal += rows[i]['quantity'];
	    			arrivalTotal += rows[i]['arrival'];
	    			deliveryTotal += rows[i]['delivery'];
	    			rejectionTotal += rows[i]['rejection'];
	    		} 
		    }
	    	$dg.datagrid('appendRow', { 
		    	goodsCode: '<b>统计：</b>', 
		    	 money: moneyTotal,
			     quantity: quantityTotal,
			     arrival:arrivalTotal,
			     delivery:deliveryTotal,
			     rejection:rejectionTotal
		       }
		    );
	    }
}else{
	 moneyTotal=parseFloat(rows[0]['money']);
}
//$("#totalAmount").attr("value","").attr("value",moneyTotal); 
}

//获取行号
function getRowIndex(target){
	var tr = $(target).closest('tr.datagrid-row'); 
	return parseInt(tr.attr('datagrid-row-index'));
} 

//折扣率编辑框绑定事件
function discountBlur(obj){   
	var rows=$dg.datagrid('getRows'); 
	var indexRows = getRowIndex(obj);  //获取行号 
	var yuanjia = $dg.datagrid('getData').rows[indexRows].primeCost;  
	//-------------------------------取编辑框对象------------------------------
	//折扣率
	var discountTarget = $dg.datagrid('getEditor', {index:indexRows,field:'discount'}).target; 
	//交货期限
	var deadlineTarget = $dg.datagrid('getEditor', {index:indexRows,field:'deadline'}).target; 
	//备注
	var remarkTarget = $dg.datagrid('getEditor', {index:indexRows,field:'remark'}).target; 
	
	//批次信息
	var batchInformationTarget = $dg.datagrid('getEditor', {index:indexRows,field:'batchInformation'}).target; 
	//到货数量
	var arrivalTarget = $dg.datagrid('getEditor', {index:indexRows,field:'arrival'}).target; 
	//收货数量
	var deliveryTarget = $dg.datagrid('getEditor', {index:indexRows,field:'delivery'}).target;  
	var batchInformation=batchInformationTarget.val();//批次信息
	var arrival = parseInt(arrivalTarget.val());//到货数量
	var delivery = parseInt(deliveryTarget.val());//收货数量  
	var rejection = arrival-delivery;//拒收数量=到货数量-收货数量
    //-----------------------------------自定义变量----------------------------------- 
	var discount = parseFloat(discountTarget.val()).toFixed(2);//折扣率 
	var price =accMul(yuanjia,discount);//单价=原价*折扣率  
	var sun=accMul(price,delivery);//总额=单价*数量  
	 $dg.datagrid('updateRow',{
		index: indexRows,
		row: {
			money: sun.toFixed(2),
			discount:discount,
			price:price, 
			deadline:deadlineTarget.datebox('getValue'),
			remark:remarkTarget.val(),
			batchInformation:batchInformation,
			arrival:arrival,
			delivery:delivery,
			rejection:rejection
		}
	});   
	$("#goodsList").datagrid('endEdit', indexRows); 
	$("#goodsList").datagrid('refreshRow', indexRows);
	$("#goodsList").datagrid('beginEdit', indexRows); 
	//当前行再次绑定事件 
	 againBinding(indexRows); 
	 compute();//调用统计
}
   
//单价编辑框绑定事件
function priceBlur(obj){   
	var rows=$dg.datagrid('getRows'); 
	var indexRows = getRowIndex(obj);  //获取行号 
	var yuanjia = $dg.datagrid('getData').rows[indexRows].primeCost;  
	//-------------------------------取编辑框对象------------------------------
	//折扣率
	var discountTarget = $dg.datagrid('getEditor', {index:indexRows,field:'discount'}).target;
	//单价
	var priceTarget = $dg.datagrid('getEditor', {index:indexRows,field:'price'}).target; 
	//交货期限
	var deadlineTarget = $dg.datagrid('getEditor', {index:indexRows,field:'deadline'}).target; 
	var remarkTarget = $dg.datagrid('getEditor', {index:indexRows,field:'remark'}).target; 
	//批次信息
	var batchInformationTarget = $dg.datagrid('getEditor', {index:indexRows,field:'batchInformation'}).target; 
	//到货数量
	var arrivalTarget = $dg.datagrid('getEditor', {index:indexRows,field:'arrival'}).target; 
	//收货数量
	var deliveryTarget = $dg.datagrid('getEditor', {index:indexRows,field:'delivery'}).target;  
	
	var batchInformation=batchInformationTarget.val();//批次信息
	var arrival = parseInt(arrivalTarget.val());//到货数量
	var delivery = parseInt(deliveryTarget.val());//收货数量  
	var rejection = arrival-delivery;//拒收数量=到货数量-收货数量
	
   //-----------------------------------自定义变量-----------------------------------
	var discount = parseFloat(discountTarget.val()).toFixed(2);//折扣率
	var price = parseFloat(priceTarget.val()).toFixed(2); 
	//var price =accMul(priceOne,yuanjia);//单价=原价*折扣率 
	var sun=accMul(price,delivery);//总额=单价*数量 
	discount=price/yuanjia;//折扣率=单价/原价 
	 $dg.datagrid('updateRow',{
		index: indexRows,
		row: {
			money: sun.toFixed(2),
			discount:discount,
			price:price, 
			deadline:deadlineTarget.datebox('getValue'),
			remark:remarkTarget.val(), 
			batchInformation:batchInformation,
			arrival:arrival,
			delivery:delivery,
			rejection:rejection
		}
	});   
	$("#goodsList").datagrid('endEdit', indexRows); 
	$("#goodsList").datagrid('refreshRow', indexRows);
	$("#goodsList").datagrid('beginEdit', indexRows); 
	//当前行再次绑定事件 
	 againBinding(indexRows); 
	 compute();//调用统计
} 

//到货数量编辑框绑定事件--------------
function arrivalBlur(obj){   
	var rows=$dg.datagrid('getRows');  
	var indexRows = getRowIndex(obj);  //获取行号   
	var quantity = $dg.datagrid('getData').rows[indexRows].quantity;  //订购数量
	//-------------------------------取编辑框对象------------------------------
	//折扣率
	var discountTarget = $dg.datagrid('getEditor', {index:indexRows,field:'discount'}).target;
	//单价
	var priceTarget = $dg.datagrid('getEditor', {index:indexRows,field:'price'}).target;
	//到货数量
	var arrivalTarget = $dg.datagrid('getEditor', {index:indexRows,field:'arrival'}).target; 
	//交货期限
	var deadlineTarget = $dg.datagrid('getEditor', {index:indexRows,field:'deadline'}).target; 
	var remarkTarget = $dg.datagrid('getEditor', {index:indexRows,field:'remark'}).target; 
	//批次信息
	var batchInformationTarget = $dg.datagrid('getEditor', {index:indexRows,field:'batchInformation'}).target;    
	
	var batchInformation=batchInformationTarget.val();//批次信息 
	var arrival = parseInt(arrivalTarget.val());//到货数量 
	//如果到货数量大于订购数量，默认到货数量为订购数量
	if(arrival>quantity){
		arrival=quantity;
	}  
   //-----------------------------------自定义变量-----------------------------------
	var discount = parseFloat(discountTarget.val()).toFixed(2);//折扣率
	var priceOne = parseFloat(priceTarget.val()).toFixed(2);
    
	var sun=accMul(priceOne,arrival);//总额=单价*数量 
	 $dg.datagrid('updateRow',{
		index: indexRows,
		row: {
			money: sun.toFixed(2),
			discount:discount,
			price:priceOne, 
			deadline:deadlineTarget.datebox('getValue'),
			remark:remarkTarget.val(),
			batchInformation:batchInformation,
			arrival:arrival,
			delivery:arrival,
			rejection:0,
		}
	});   
	$("#goodsList").datagrid('endEdit', indexRows); 
	$("#goodsList").datagrid('refreshRow', indexRows);
	$("#goodsList").datagrid('beginEdit', indexRows); 
	//当前行再次绑定事件  
	 againBinding(indexRows); 
	 compute();//调用统计
} 


//收货数量编辑框绑定事件--------------
function deliveryBlur(obj){   
	var rows=$dg.datagrid('getRows');  
	var indexRows = getRowIndex(obj);  //获取行号   
	var quantity = $dg.datagrid('getData').rows[indexRows].quantity;  //订购数量
	//-------------------------------取编辑框对象------------------------------
	//折扣率
	var discountTarget = $dg.datagrid('getEditor', {index:indexRows,field:'discount'}).target;
	//单价
	var priceTarget = $dg.datagrid('getEditor', {index:indexRows,field:'price'}).target;
	//到货数量
	var arrivalTarget = $dg.datagrid('getEditor', {index:indexRows,field:'arrival'}).target; 
	//交货期限
	var deadlineTarget = $dg.datagrid('getEditor', {index:indexRows,field:'deadline'}).target; 
	var remarkTarget = $dg.datagrid('getEditor', {index:indexRows,field:'remark'}).target; 
	//批次信息
	var batchInformationTarget = $dg.datagrid('getEditor', {index:indexRows,field:'batchInformation'}).target;  
	//收货数量
	var deliveryTarget = $dg.datagrid('getEditor', {index:indexRows,field:'delivery'}).target;  
	
	var batchInformation=batchInformationTarget.val();//批次信息 
	var arrival = parseInt(arrivalTarget.val());//到货数量 
	var delivery = parseInt(deliveryTarget.val());//收货数量  
	//如果收货货数量大于到货数量，默认收货数量等于到货数量
	if(delivery>arrival){
		delivery=arrival;
	}  
	var rejection = arrival-delivery;//拒收数量=到货数量-收货数量
 //-----------------------------------自定义变量-----------------------------------
	var discount = parseFloat(discountTarget.val()).toFixed(2);//折扣率
	var priceOne = parseFloat(priceTarget.val()).toFixed(2);
  
	var sun=accMul(priceOne,delivery);//总额=单价*数量 
	 $dg.datagrid('updateRow',{
		index: indexRows,
		row: {
			money: sun.toFixed(2),
			discount:discount,
			price:priceOne, 
			deadline:deadlineTarget.datebox('getValue'),
			remark:remarkTarget.val(),
			batchInformation:batchInformation,
			arrival:arrival,
			delivery:delivery,
			rejection:rejection
		}
	});   
	$("#goodsList").datagrid('endEdit', indexRows); 
	$("#goodsList").datagrid('refreshRow', indexRows);
	$("#goodsList").datagrid('beginEdit', indexRows); 
	//当前行再次绑定事件 
	 againBinding(indexRows); 
	 compute();//调用统计
}  
//货物编码编辑框点击事件
function goodsCodeClick(obj){
  	var indexRows = getRowIndex(obj); 
	goodsDetail(indexRows); 
}
//去到货品目录方法
function goodsDetail(rowIndex){ 
	$.easyui.showDialog({
		href : ctx + '/do/purchaseOrder/goodsArr.htm',//从controller请求jsp页面进行渲染
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
				var data = $dg.datagrid('getData');//获取整个表格数据  
  				var rows = $dg.datagrid('getRows');//获取整个表格数据   
  			    //设置状态 
				var te=false; 
				for(var r = 0; r<rows.length;r++){ 
					if(data.rows[r].goodsId==setRowData.goodsId&&setRowData.goodsId!=data.rows[rowIndex].goodsId){ 
						 te=true; 
						 break;  //存在相同的，跳出当前循环
					}  
				} 
				//如果是false,就添加一行数据
				if(te){
					$.messager.alert('提示信息','已存在的商品无需再次添加！','info'); 
					return;
				}else{ 
				//确认后赋值
				$dg.datagrid('updateRow', {
					index:stRows,
						row:{
  							goodsId:setRowData.goodsId,
  							goodsCode:setRowData.goodsCode,
  							goodsName:setRowData.goodsName,
  							goodsModel:setRowData.goodsModel,
  							brand:setRowData.brands, 
  							primeCost:setRowData.primeCost,
  							discount:setRowData.discount,
  							price:setRowData.price,
  							arrival:setRowData.quantity,
  							delivery:setRowData.quantity,
  							rejection:0,
  							quantity:setRowData.quantity,
  							money:setRowData.money,
  							cess:setRowData.cess,
  							remark:setRowData.remark
  						}
				}); 
		      }
				dia.dialog("close");  
				 $dg.datagrid('endEdit', stRows).datagrid('refreshRow', stRows).datagrid('beginEdit', stRows); 
				//移除那两个按钮
		    	$("div[class='dialog-button datagrid-rowediting-panel']").remove(); 
				againBinding(stRows);
				compute();//调用统计			
			}
		}, {
			text : '取消',
  			iconCls : 'icon-undo',
  			handler : function(dia) {
  				dia.dialog("close"); 
  			}
		}]
	});
};
 
//事件绑定
function againBinding(rows){       
	$("div[class='dialog-button datagrid-rowediting-panel']").remove(); 
	//货品编码 
	var goodsCodeTarget = $dg.datagrid('getEditor', {index:rows,field:'goodsCode'}).target; 
	//单价
	var priceTarget = $dg.datagrid('getEditor', {index:rows,field:'price'}).target; 
	//折扣率
	var discountTarget = $dg.datagrid('getEditor', {index:rows,field:'discount'}).target; 
	//收货数量
	var deliveryTarget = $dg.datagrid('getEditor', {index:rows,field:'delivery'}).target; 
	//到货数量
	var arrivalTarget = $dg.datagrid('getEditor', {index:rows,field:'arrival'}).target; 
	 
	//绑定事件---折扣率
	$(discountTarget).bind("change",function(){ 
		discountBlur(this);
	});  
	//到货数量
	$(arrivalTarget).bind("change",function(){ 
		arrivalBlur(this);
	});  
	//货品编码
	  $(goodsCodeTarget).bind("click",function(){ 
		  goodsCodeClick(this);
	});
	//单价
	  $(priceTarget).bind("change",function(){ 
		  priceBlur(this);
	});
	//收货数量
	$(deliveryTarget).bind("change",function(){ 
		deliveryBlur(this);
	});   
}
 
//乘法函数，用来得到精确的乘法结果 
//说明：javascript的乘法结果会有误差，在两个浮点数相乘的时候会比较明显。这个函数返回较为精确的乘法结果。 
//调用：accMul(arg1,arg2) 
//返回值：arg1乘以arg2的精确结果 
function accMul(arg1,arg2) 
{ 
	var m=0,s1=arg1.toString(),s2=arg2.toString(); 
	try{m+=s1.split(".")[1].length}catch(e){} 
	try{m+=s2.split(".")[1].length}catch(e){} 
	return Number(s1.replace(".",""))*Number(s2.replace(".",""))/Math.pow(10,m) 
} 


//放弃到货操作，返回订购合同详情显示页面
$("#unbo").click(function(){  
	$("#layout_center_panel").panel("setTitle","订购订货合同详情"); 
	$("#layout_center_panel").panel("refresh",ctx +"/do/purchaseOrder/intoDetail.htm?purOrderId="+id);
});

//点击保存，获取表格的数据
$("#saveOk").click(function(){  
  var row=$dg.datagrid('getRows');  
  var date= $dg.datagrid('getData').rows; 
  var jsonDate=JSON.stringify(date);   
  var str=JSON.stringify($("#purchaseArrival_mgr_purchaseArrival_form").serializeObject()); 
  if(row.length<1){
  	$.messager.alert('提示信息','至少选择一件货物！','info'); 
	return;
  }
  
  for(var i=0;i<row.length;i++){ 
  	if(row[i]['arrival']==0){ 
  		$.messager.alert('提示信息','请完善货物信息，到货数量不能为0！','info'); 
  		 return;
  	}
  }     
	//到货保存
	 $.post(ctx + '/do/purchaseOrder/addArr.json', { data: jsonDate,purchaseArr:str},
	   function(data){
	  	$.messager.show({
	   		title:'提示信息',
	   		msg:'货物到货操作成功!',
	   		showType:'show',
	   		style:{
	   			right:'',
	   			top:document.body.scrollTop+document.documentElement.scrollTop,
	   			bottom:''
	   		}
	   	});
	   	$("#layout_center_panel").panel("setTitle","采购到货");
	   	$('#layout_center_panel').panel('refresh',ctx +'/do/purchaseArrival/index.htm');   
	 });   
 
}); 

//将序列化的form值，转化为json格式
$.fn.serializeObject = function (){
  var order = {};
  var formInfo = this.serializeArray(); 
  $.each(formInfo, function(key,value) { 
  	if (order[value.name] !== undefined) {
          if (!order[value.name].push) {
          	order[value.name] = [order[value.name]];
          }
          order[value.name].push(value.value);
      } else {
      	order[value.name] = value.value;
      } 
  });
  return order;
};
//-----------------------分割线-----------------------
 
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