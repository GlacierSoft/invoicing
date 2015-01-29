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
 <caption style="height:50px;color: blue;"><font size="4" style="padding-top: 30px;">采购订货合同</font></caption>
	   <tr> 
	        <td style="padding-left:10px;">采购日期：</td>
			<td> 
			<input type="hidden" id="purOrderId" name="purOrderId" value="${purchaseOrderData.purOrderId }">
			    <input name="orderDate"  required="true" class="easyui-datebox" style="width:168px;height:20px"  value="<fmt:formatDate value="${purchaseOrderData.orderDate}" pattern="yyyy-MM-dd"/>" /> 
			</td>
			<td style="padding-left:10px;">采购类型：</td>
			<td><input id="purchaseOrder_mgr_purchaseOrder_form_purchaseTypeId" name="purchaseTypeId" value='${purchaseOrderData.purchaseTypeId}' /></td>
	
	        <td style="padding-left:10px;">合同编号：</td>
			<td>
				<input id="contractCode" name="contractCode"  class="easyui-validatebox spinner"style="width:168px;height:20px" value="${purchaseOrderData.contractCode }"   />
			</td> 
		    <td style="padding-left:10px;">仓库：</td>
		  	<td ><input id="purchaseOrder_mgr_purchaseOrder_form_storage" name="storage" value="${purchaseOrderData.storage}" /></td>
		</tr>   
		<tr>
			<td style="padding-left:10px;">交货期限：</td>
			<td>
			   <input name="deliveryDadlines"  required="true" class="easyui-datebox" style="width:168px;height:20px"  value="<fmt:formatDate value="${purchaseOrderData.deliveryDadlines}" pattern="yyyy-MM-dd"/>" /> 
			<td style="padding-left:10px;">供应商：</td>
			<td >
			    <input id="supplierCode" type="hidden" value="${purchaseOrderData.supplierCode}"  name="supplierCode"/>
			
				<input id="suppliers_mgr_suppliers_form_supplierType" required="true" value="${purchaseOrderData.supplierId}" style="width: 168px;height:20px" name="supplierId"  class="easyui-combogrid"  />
			</td>
			<td style="padding-left:10px;">供应商地址：</td>
			<td><input id="supplierAdd" class="easyui-validatebox spinner"style="width:168px;height:20px" value="${purchaseOrderData.supplierAdd}"  name="supplierAdd"/></td>
			<%-- <td style="padding-left:10px;">联系电话：</td>
			<td><input id="phone" name="phone" class="easyui-validatebox spinner"style="width:168px;height:20px" value="${purchaseOrderData.phone}"   /></td>
 --%>
  <td style="padding-left:10px;">付款约定：</td>
			<td>
			<input id="paymentAgrId" name="paymentAgrId" class="easyui-validatebox spinner"style="width:168px;height:20px" value="${purchaseOrderData.paymentAgrId }"   />
			</td>
		</tr>
		<tr>
			<td style="padding-left:10px;">是否启用：</td>
			<td> 
				<input style="width:168px;height:20px" value="${purchaseOrderData.enabled}" name="enabled" class="easyui-combobox" 
			 data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data :fields.status"/> 
			</td>
			<td style="padding-left:10px;">联系人：</td>
			<td>
			  <input id="suppliers_mgr_suppliers_form_linkman" value="${purchaseOrderData.linkman}" style="width: 168px;height:20px" name="linkman"  class="easyui-combogrid"  />
			</td>
			<td style="padding-left:10px;">手机：</td>
			<td><input id="moi" class="easyui-validatebox spinner"style="width:168px;height:20px" value="${purchaseOrderData.phone}"   /></td>
			<td style="padding-left:10px;">传真：</td>
			<td><input class="easyui-validatebox spinner"style="width:168px;height:20px" name="fax" value="${purchaseOrderData.fax}"  /></td>
  		</tr>  
		<tr> 
			<td style="padding-left:10px;">约定支付方式：</td>
			<td >
			    <input id="purchaseOrder_mgr_purchaseOrder_form_paymentTypeId" name="paymentTypeId"  value="${purchaseOrderData.paymentTypeId}" /> 
			</td> 
			
			 <td style="padding-left:10px;">交货方式：</td>
			<td > 
			   <input id="purchaseOrder_mgr_purchaseOrder_form_deliveryType" name="deliveryType"  value="${purchaseOrderData.deliveryType}" /> 
			 </td>
			<td style="padding-left:10px;">交货地址：</td>
			<td >
			    <input id="deliveryAdd" name="deliveryAdd" class="easyui-validatebox spinner"style="width:168px;;height:20px" value="${purchaseOrderData.deliveryAdd}"  />
			</td>
			 <td style="padding-left:10px;">共享人：</td>
			<td >
			    <input id="sharedPeopleId" name="sharedPeopleId" class="easyui-validatebox spinner"style="width:168px;height:20px" value="${purchaseOrderData.sharedPeopleId}"  />
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
			    <input id="totalAmount" readonly="readonly" name="totalAmount" class=" spinner" style="width:168px;height:20px;border-left-style: none;border-right-style: none;border-top-style: none;"   value="<fmt:formatNumber value='${purchaseOrderData.totalAmount}' pattern="#,#00.00元"/>" />
			</td> 
		</tr> 
		<tr>  
			<td style="padding-left:10px;">经办人：</td>
			<td>
			 	<input id="suppliers_mgr_suppliers_form_operators" value="${purchaseOrderData.operators}" style="width: 168px;height:20px" name="operators"  class="easyui-combogrid"  />
			</td>
			  <td style="padding-left:10px;">经办部门：</td>
			<td><input id="operatorDep" name="operatorDep" class="easyui-validatebox spinner" readonly="readonly" style="width:168px;height:20px;border-left-style: none;border-right-style: none;border-top-style: none;"  value="${purchaseOrderData.operatorDep}"  /></td>
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
	        <a id="saveOk" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-ok'">保存</a> 
	        <a style="margin-left: 30px" id="unbo" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-undo'">关闭</a> 
	      </div> 
	</div>  

  </form> 
<script type="text/javascript">   
//------------------分割线-------------------------- 
var $dg = $("#goodsList");

var storageVal="";//保存仓库ID
var stRows="";//保存行数
var divs = "";//保存goodsDetail中的dialog节点
var setRowData="";//保存选中的值
var selecRows=0;
$dg.datagrid({  
	fit : false,//控件自动resize占满窗口大小
	iconCls : 'icon-save',//图标样式
	border : false,//是否存在边框
	fitColumns : true,//自动填充行
	nowrap : true,//禁止单元格中的文字自动换行
	autoRowHeight : false,//禁止设置自动行高以适应内容
	striped : true,//true就是把行条纹化。（即奇偶行使用不同背景色）
	url: ctx + '/do/purchaseOrder/orderDetail.json?orderId=${purchaseOrderData.purOrderId }',   
	singleSelect : true,//限制单选
	checkOnSelect : false,//选择复选框的时候选择该行
	selectOnCheck : false,//选择的时候复选框打勾
	sortName : 'goodsCode',//排序字段名称
	sortOrder : 'DESC',//升序还是降序
	remoteSort : true,//开启远程排序，默认为false 
	idField : 'purOrderDetId', 
    columns:[[    
       {field :'purOrderDetId', title : 'ID', hidden:true}, 
        {field:'goodsId',title:'货品id',width:100,hidden:true},  
        {field:'goodsCode',title:'货品编码',width:100},    
        {field:'goodsName',title:'名称',width:100},    
       {field:'goodsModel',title:'规格型号',width:100},   
       {field:'brand',title:'品牌',width:100},  
       {field:'placeOfOrigin',title:'产地',width:100}, 
       {field:'primeCost',title:'原价',width:100},   
       {field:'discount',title:'折扣率',width:100, editor: { type: 'numberbox',options:{precision:2}}}, 
       {field:'price',title:'单价',width:100,editor: { type: 'numberbox',options:{precision:2}} },   
       {field:'quantity',title:'数量',width:100,editor: { type: 'numberbox',options:{required:true,min:0,max:9999}} }, 
       {field:'money',title:'金额',width:100,editor: { type: 'numberbox',options:{precision:2}} },    
       {field:'deadline',title:'交货期限',width:100,editor: { type: 'datebox'  }},
       {field:'remark',title:'备注',width:100,editor: { type: 'text'  }} 
    ]], 
    toolbar: [
         {
          text: '添加商品', iconCls: 'icon-standard-pencil-add', handler: function () { 
        		var row= $dg.datagrid('getSelected');//获取上一次的选中行
            	var index=$dg.datagrid('getRowIndex',row); 
        	  selecRows=index;
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
    onSelect:function(rowIndex, rowData){   
    	
    	var row= $dg.datagrid('getSelected');//获取上一次的选中行
    	var index=$dg.datagrid('getRowIndex',row);  
    	//$dg.datagrid('endEdit', index);//.datagrid('refreshRow', index);//关闭上一次的 
    	var computeRow = $dg.datagrid('getData').rows[rowIndex];//获取某一行数据
		if(computeRow.goodsCode != "<b>统计：</b>"){//如果不是统计行， 开启当前行可编辑
			$dg.datagrid('beginEdit',rowIndex);
  	    	againBinding(rowIndex);
  	    	stRows=rowIndex; 
		  }   
        //移除那两个按钮
    	$("div[class='dialog-button datagrid-rowediting-panel']").remove(); 
    } 
});

//底部统计
function compute(){//计算函数 
	//获取数据行
  var rows = $dg.datagrid('getRows'); 
  var moneyTotal = 0,quantityTotal = 0;//计算moneyTotal的总和以及统计arrivalTotal的总和，deliveryTotal总和
  if(rows.length >= 2){
	    //新增一行显示统计信息
	    var computeRow = $dg.datagrid('getData').rows[rows.length-1];//获取某一行数据
	    var row=$dg.datagrid('getSelected');//获取当前选中的行 
	    if(computeRow.goodsCode == "<b>统计：</b>"){//修改 
	    	for (var i = 0; i < rows.length-1; i++) { 
		    	if(row==i){ //如果是选中行，则获取编辑器的值
	    			var moneyTarget = $dg.datagrid('getEditor', {index:i,field:'money'}).target;
			    	moneyTotal += parseFloat(moneyTarget.val());
			    	var quantityTarget = $dg.datagrid('getEditor', {index:i,field:'quantity'}).target;
			    	if(parseInt(quantityTarget.val())>9999){
			    		quantityTotal+=9999;
			    	}else{
			    		quantityTotal += parseInt(quantityTarget.val());
			    	}  
	    		}else{//否则直接获取列值相加
	    			moneyTotal +=parseFloat(rows[i]['money']);
	    			quantityTotal += rows[i]['quantity'];
	    		} 
		    	
		    }
	    	$dg.datagrid('updateRow', {
	    		index:rows.length-1,
	    		row:{  
				     money: moneyTotal,
				     quantity: quantityTotal
				     }
	    	});
	    	$dg.datagrid('refreshRow', rows.length-1);
	    }else{//增加 
	    	for (var i = 0; i < rows.length; i++) {
	    		if(row==i){ //如果是选中行，则获取编辑器的值
	    			var moneyTarget = $dg.datagrid('getEditor', {index:i,field:'money'}).target;
			    	moneyTotal += parseFloat(moneyTarget.val());
			    	var quantityTarget = $dg.datagrid('getEditor', {index:i,field:'quantity'}).target;
			     	if(parseInt(quantityTarget.val())>9999){
			    		quantityTotal+=9999;
			    	}else{
			    		quantityTotal += parseInt(quantityTarget.val());
			    	}  
	    		}else{//否则直接获取列值相加
	    			moneyTotal += parseFloat(rows[i]['money']);
	    			quantityTotal += rows[i]['quantity'];
	    		} 
		    }
	    	$dg.datagrid('appendRow', { 
		    	goodsCode: '<b>统计：</b>', 
		    	money: moneyTotal,
		    	quantity: quantityTotal
		       }
		    );
	    }
  }
  $("#totalAmount").attr("value","").attr("value",moneyTotal.toFixed(2));
}
  
  
//批量增加
function addRows(){
	storageVal = $('#purchaseOrder_mgr_purchaseOrder_form_storage').combobox('getValue');
	if(storageVal!=''){//判断
		$.easyui.showDialog({
			title: "增加货物目录",
			href : ctx + '/do/purchaseOrder/goodsIndex.htm',//从controller请求jsp页面进行渲染
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
	  				var rowsCheck =  $('#goodsListDataGrid').datagrid('getChecked');
	  				console.log(rowsCheck[0]);
	  				for(var i = 0; i < rowsCheck.length;i++){
	  					$dg.datagrid('insertRow', {
	  						index: i,
	  						row:{
	  							goodsId:rowsCheck[i].goodsId,
	  							goodsCode:rowsCheck[i].goodsCode,
	  							goodsName:rowsCheck[i].goodsName,
	  							goodsModel:rowsCheck[i].specification,
	  							brand:rowsCheck[i].brands,
	  							placeOfOrigin:rowsCheck[i].origin,
	  							primeCost:rowsCheck[i].referenceCost,
	  							discount:1.00,
	  							price:rowsCheck[i].referenceRetailPrice,
	  							quantity:0,
	  							money:0.00,
	  							cess:rowsCheck[i].taxRate,
	  							remark:rowsCheck[i].remark
	  						}
	  					});
	  					$dg.datagrid('beginEdit', i);
	  					$dg.datagrid('endEdit', i).datagrid('refreshRow', i).datagrid('beginEdit', i);
	  					
	  					againBinding(i);//批量增加绑定的事件
	  				}
	  				$dg.datagrid('endEdit', rowsCheck.length-1); 
	  				//selecRows+=selecRows+rowsCheck.length;
	  				dia.dialog("close");
	  				compute();//调用统计
	  				//compute();//调用统计
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
	//单价
	var priceTarget = $dg.datagrid('getEditor', {index:indexRows,field:'price'}).target;
	//数量
	var quantityTarget = $dg.datagrid('getEditor', {index:indexRows,field:'quantity'}).target; 
	//交货期限
	var deadlineTarget = $dg.datagrid('getEditor', {index:indexRows,field:'deadline'}).target; 
	var remarkTarget = $dg.datagrid('getEditor', {index:indexRows,field:'remark'}).target; 
   //-----------------------------------自定义变量-----------------------------------
	var discount = parseFloat(discountTarget.val()).toFixed(2);//折扣率
	var priceOne = parseFloat(priceTarget.val()).toFixed(2);
	var quantity = parseInt(quantityTarget.val());//数量  
	var price =accMul(yuanjia,discount);//单价=原价*折扣率  
	var sun=accMul(price,quantity);//总额=单价*数量 
	 $dg.datagrid('updateRow',{
		index: indexRows,
		row: {
			money: sun.toFixed(2),
			discount:discount,
			price:price,
			quantity:quantity, 
			deadline:deadlineTarget.datebox('getValue'),
			remark:remarkTarget.val()
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
	//数量
	var quantityTarget = $dg.datagrid('getEditor', {index:indexRows,field:'quantity'}).target; 
	//交货期限
	var deadlineTarget = $dg.datagrid('getEditor', {index:indexRows,field:'deadline'}).target; 
	var remarkTarget = $dg.datagrid('getEditor', {index:indexRows,field:'remark'}).target; 
   //-----------------------------------自定义变量-----------------------------------
	var discount = parseFloat(discountTarget.val()).toFixed(2);//折扣率
	var price = parseFloat(priceTarget.val()).toFixed(2);
	var quantity = parseInt(quantityTarget.val());//数量   
	//var price =accMul(priceOne,yuanjia);//单价=原价*折扣率 
	var sun=accMul(price,quantity);//总额=单价*数量 
	discount=price/yuanjia;//折扣率=单价/原价 
	 $dg.datagrid('updateRow',{
		index: indexRows,
		row: {
			money: sun.toFixed(2),
			discount:discount,
			price:price,
			quantity:quantity, 
			deadline:deadlineTarget.datebox('getValue'),
			remark:remarkTarget.val()
		}
	});   
	$("#goodsList").datagrid('endEdit', indexRows); 
	$("#goodsList").datagrid('refreshRow', indexRows);
	$("#goodsList").datagrid('beginEdit', indexRows); 
	//当前行再次绑定事件 
	 againBinding(indexRows); 
	 compute();//调用统计
}
    

//数量编辑框绑定事件
function quantityBlur(obj){   
	var rows=$dg.datagrid('getRows');  
	var indexRows = getRowIndex(obj);  //获取行号  
	//-------------------------------取编辑框对象------------------------------
	//折扣率
	var discountTarget = $dg.datagrid('getEditor', {index:indexRows,field:'discount'}).target;
	//单价
	var priceTarget = $dg.datagrid('getEditor', {index:indexRows,field:'price'}).target;
	//数量
	var quantityTarget = $dg.datagrid('getEditor', {index:indexRows,field:'quantity'}).target; 
	//交货期限
	var deadlineTarget = $dg.datagrid('getEditor', {index:indexRows,field:'deadline'}).target; 
	var remarkTarget = $dg.datagrid('getEditor', {index:indexRows,field:'remark'}).target; 
   //-----------------------------------自定义变量-----------------------------------
	var discount = parseFloat(discountTarget.val()).toFixed(2);//折扣率
	var priceOne = parseFloat(priceTarget.val()).toFixed(2);
	var quantity = parseInt(quantityTarget.val());//数量    
	if(quantityTarget.val()>9999){
		quantity=9999;
	}
	var sun=accMul(priceOne,quantity);//总额=单价*数量 
	 $dg.datagrid('updateRow',{
		index: indexRows,
		row: {
			money: sun.toFixed(2),
			discount:discount,
			price:priceOne,
			quantity:quantity, 
			deadline:deadlineTarget.datebox('getValue'),
			remark:remarkTarget.val()
		}
	});   
	$("#goodsList").datagrid('endEdit', indexRows); 
	$("#goodsList").datagrid('refreshRow', indexRows);
	$("#goodsList").datagrid('beginEdit', indexRows); 
	//当前行再次绑定事件 
	 againBinding(indexRows); 
	 compute();//调用统计
}
   

//金额编辑框绑定事件
function moneyBlur(obj){   
	var rows=$dg.datagrid('getRows'); 
	var indexRows = getRowIndex(obj);  //获取行号 
	var yuanjia = $dg.datagrid('getData').rows[indexRows].primeCost;  
	//-------------------------------取编辑框对象------------------------------
	//折扣率
	var discountTarget = $dg.datagrid('getEditor', {index:indexRows,field:'discount'}).target;
	//单价
	var priceTarget = $dg.datagrid('getEditor', {index:indexRows,field:'price'}).target;
	//数量
	var quantityTarget = $dg.datagrid('getEditor', {index:indexRows,field:'quantity'}).target; 
	//金额
	var moneyTarget = $dg.datagrid('getEditor', {index:indexRows,field:'money'}).target; 
	//交货期限
	var deadlineTarget = $dg.datagrid('getEditor', {index:indexRows,field:'deadline'}).target; 
	var remarkTarget = $dg.datagrid('getEditor', {index:indexRows,field:'remark'}).target; 
    //-----------------------------------自定义变量-----------------------------------
	var discount = parseFloat(discountTarget.val()).toFixed(2);//折扣率
	var price = parseFloat(priceTarget.val()).toFixed(2);
	var quantity = parseInt(quantityTarget.val());//数量  
	var money=parseFloat(moneyTarget.val()).toFixed(2); //金额 
	if(quantity<=0){
		
	}else{
		//单价
		price=money/quantity;
		//折扣率
		discount=price/yuanjia;
	} 
	 $dg.datagrid('updateRow',{
		index: indexRows,
		row: {
			money: money,
			discount:discount,
			price:price,
			quantity:quantity, 
			deadline:deadlineTarget.datebox('getValue'),
			remark:remarkTarget.val()
		}
	});   
	$("#goodsList").datagrid('endEdit', indexRows); 
	$("#goodsList").datagrid('refreshRow', indexRows);
	$("#goodsList").datagrid('beginEdit', indexRows); 
	//当前行再次绑定事件 
	 againBinding(indexRows); 
	 compute();//调用统计
}  
function againBinding(rows){      
	//单价
	var priceTarget = $dg.datagrid('getEditor', {index:rows,field:'price'}).target; 
	//折扣率
	var discountTarget = $dg.datagrid('getEditor', {index:rows,field:'discount'}).target; 
	//数量
	var quantityTarget = $dg.datagrid('getEditor', {index:rows,field:'quantity'}).target; 
	//金额
	var moneyTarget = $dg.datagrid('getEditor', {index:rows,field:'money'}).target; 
	//绑定事件---折扣率
	$(discountTarget).bind("change",function(){ 
		discountBlur(this);
	}); 
	//单价
	  $(priceTarget).bind("change",function(){ 
		  priceBlur(this);
	});
	//数量
	$(quantityTarget).bind("change",function(){ 
		quantityBlur(this);
	});  
	//金额
	$(moneyTarget).bind("change",function(){ 
		moneyBlur(this);
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
    
//放弃添加订购合同，返回订购合同显示页面
$("#unbo").click(function(){ 
	$("#layout_center_panel").panel("setTitle","采购订货合同");
	$('#layout_center_panel').panel('refresh',ctx +'/do/purchaseOrder/index.htm');
});

//点击保存，获取表格的数据
$("#saveOk").click(function(){  
    var row=$dg.datagrid('getRows');  
	var date= $dg.datagrid('getData').rows; 
	var jsonDate=JSON.stringify(date);   
    var str=JSON.stringify($("#purchase_mgr_purchaseOrder_form").serializeObject());
    var status=$("#purOrderId").attr("value");//状态判断，如何为空，则是新增合同，否则为修改合同 
    for(var i=0;i<row.length;i++){ 
    	if(row[i]['quantity']==0){ 
    		$.messager.alert('提示信息','请完善货物信息，订购数量不能为0！','info'); 
    		 return;
    	}
    }   
    
    //修改
    if(status!=""){ 
    	 $.post(ctx + '/do/purchaseOrder/edit.json', { data: jsonDate,purchaseOrder:str},
  			   function(data){
  				$.messager.show({
  		    		title:'提示信息',
  		    		msg:'货物修改成功!',
  		    		showType:'show',
  		    		style:{
  		    			right:'',
  		    			top:document.body.scrollTop+document.documentElement.scrollTop,
  		    			bottom:''
  		    		}
  		    	});
  		    	$("#layout_center_panel").panel("setTitle","采购订货合同");
  		    	$('#layout_center_panel').panel('refresh',ctx +'/do/purchaseOrder/index.htm'); 
  			 });  
    }else{ 
    	 //新增
     	 $.post(ctx + '/do/purchaseOrder/add.json', { data: jsonDate,purchaseOrder:str},
   			   function(data){
   				$.messager.show({
   		    		title:'提示信息',
   		    		msg:'货物订购成功!',
   		    		showType:'show',
   		    		style:{
   		    			right:'',
   		    			top:document.body.scrollTop+document.documentElement.scrollTop,
   		    			bottom:''
   		    		}
   		    	});
   		    	$("#layout_center_panel").panel("setTitle","采购订货合同");
   		    	$('#layout_center_panel').panel('refresh',ctx +'/do/purchaseOrder/index.htm'); 
   			 });  
        } 
   
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
  
//-------------------------------分割线-------------------
 
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
			$("#supplierCode").attr("value",$(this).datagrid("getSelected").supplierNumber); 
			
			//$("#phone").attr("value",$(this).datagrid("getSelected").companyPhone);
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