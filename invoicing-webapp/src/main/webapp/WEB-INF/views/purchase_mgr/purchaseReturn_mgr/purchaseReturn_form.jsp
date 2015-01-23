<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui"
	uri="http://com.glacier.permissions.com.cn/tag/easyui"%>
<script type="text/javascript">

$.util.namespace('glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturn_form');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)

//定义toolbar的操作，对操作进行控制
glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturn_form.param = {
	toolbarId : 'purchaseReturnDetail_toolbar',
	actions : {
            edit:{flag:'edit',controlType:'single'},
            del:{flag:'del',controlType:'multiple'},
            state:{flag:'state',controlType:'single'}
         }
 };
</script>
<form id="purchaseArrival_mgr_purchaseArrival_form" method="post">
<table  class="formtable" style="margin-left: 20px;margin-top: 20px;">
<tr>
    <td colspan="8">
      <hr> 
      <div style="margin-left: 410px">
         <font size="3" style="margin-top: 30px"><b>采购退货单</b></font> 
	      </div> 
 	  <hr> 
     </td>
 </tr>
<tr> 
         <td style="padding-left:10px;">所属仓库：</td>
		<td>
			<input id="storage" name="storage" class="easyui-combobox spinner" style="width:168px" value="${purchaseReturnDate.storage }"   required="true"/>
		</td> 
		<td style="padding-left:10px;">运费总额：</td>
		<td>
		  <input id="logTotalAmount" name="logTotalAmount" class="easyui-validatebox spinner" style="width:168px" value="<fmt:formatNumber value='${purchaseReturnDate.logTotalAmount }' pattern="#,#00.00元"/>" required="true"/>
		</td>
		<td style="padding-left:10px;">经办部门：</td>
		<td>
		     <input id="operatorDep" name="operatorDep" class="easyui-combobox spinner" style="width:168px;" value="${purchaseReturnDate.operatorDep}" required="true"/>
		</td>
		<td style="padding-left:10px;">经办人员：</td>
	    <td >
	        <input id="logCode" name="logCode" class="easyui-combobox spinner" style="width:168px;" value="${purchaseReturnDate.logCode}" required="true"/>
	    </td>
</tr>   
 <tr>
     <td style="padding-left:10px;">联系人：</td>
	 <td >
	 		<input name="linkman" class="easyui-validatebox spinner" style="width:168px" value="${purchaseReturnDate.linkman}" required="true"/>
	 </td>
     <td style="padding-left:10px;">联系电话：</td>
     <td>
     	<input id="phone" name="phone" class="easyui-validatebox spinner" style="width:168px" value="${purchaseReturnDate.phone}" required="true"/>
     </td>
    <td style="padding-left:10px;">联系传真：</td>
	<td>
	    <input  name="fax" class="easyui-validatebox spinner" style="width:168px" value="${purchaseReturnDate.fax}" required="true"/>
	</td>
      <td style="padding-left:10px;">退货金额：</td>
    <td>
       <input id="refundTotal" name="refundTotal" class="easyui-validatebox spinner" style="width:168px;" value="<fmt:formatNumber value='${purchaseReturnDate.refundTotal}' pattern="#,#00.00元"/>" required="true"/>
   </td> 
  </tr>
<tr>
    <td style="padding-left:10px;">退货方式：</td>
	<td>
	    <input class="easyui-validatebox spinner" style="width:168px" value="${ purchaseReturnDate.returnedPurchaseTypeDisplay}" required="true"/>
	</td>
    <td style="padding-left:10px;">退货期限：</td>
	<td>
		<input class="easyui-validatebox spinner" style="width:168px" value="<fmt:formatDate value='${purchaseReturnDate.returnDeadlines}' pattern="yyyy-MM-dd HH:mm:ss"/>" required="true"/>
	</td>
    <td style="padding-left:10px;">退货原因：</td>
    <td>
       <input class="easyui-validatebox spinner" style="width:168px" value="${purchaseReturnDate.returnReasonDisplay}" required="true"/>
    </td>
    <td style="padding-left:10px;">退货说明：</td>
    <td>
    	<input  id="returnPolicy" name="returnPolicy" class="spinner" style="width:168px" value="${purchaseReturnDate.returnPolicy }" required="true"/>
    </td>
</tr> 
<tr> 
    <td style="padding-left:10px;">供应商：</td>
		<td>
		    <input id="supplierId" name="supplierId" class="easyui-combobox spinner" style="width:168px" value="${purchaseReturnDate.supplierId }" required="true"/>
	</td>
	<td style="padding-left:10px;">供应地址：</td>
	<td>
		<input id="supplierAdd" name="supplierAdd" class="easyui-validatebox spinner" style="width:168px" value="${purchaseReturnDate.supplierAdd}" required="true"/>
	</td>
	<td style="padding-left:10px;">物流公司：</td>
	<td >
		<input name="logCompany" class="easyui-validatebox spinner" style="width:168px"  value='${purchaseReturnDate.logCompany}'  required="true"/>
	</td>
	<td style="padding-left:10px;">物流联系人：</td>
	<td>
		<input id="logLinkman" name="logLinkman" class="easyui-validatebox spinner" style="width:168px" value="${purchaseReturnDate.logLinkman}"  required="true"/>
    </td>
</tr>
<tr> 
    <td style="padding-left:10px;">物流电话：</td>
	<td >
	    <input id="logPhone" name="logPhone" class="easyui-validatebox spinner" style="width:168px;" value="${purchaseReturnDate.logPhone}" required="true"/>
	</td>
    <td style="padding-left:10px;">跟踪状态：</td>
	<td>
		<input id="paymentState" name="paymentState" class="easyui-validatebox spinner" style="width:168px" value="${purchaseReturnDate.paymentState }"  required="true"/>
	</td>  
	<td style="padding-left:10px;">结算方式：</td>
	<td>
		<input id="logSettlement"  name="logSettlement" class="easyui-validatebox spinner" style="width:168px" value='${purchaseReturnDate.logSettlement}' required="true"/>
	</td>
	<td style="padding-left:10px;">未付款金额：</td>
	<td>
		<input id="notPayAmo" name="notPayAmo" class="easyui-validatebox spinner" style="width:168px" value="<fmt:formatNumber value='${purchaseReturnDate.notPayAmo }' pattern="#,#00.00元"/>" required="true"/>
	</td>
</tr> 
 <tr> 
     <td style="padding-left:10px;">已付款金额：</td>
     <td >
        <input id="alrPayAmo" name="alrPayAmo" class="easyui-validatebox spinner" style="width:168px;" value="<fmt:formatNumber value='${purchaseReturnDate.alrPayAmo}' pattern="#,#00.00元"/>" required="true"/>
     </td>
      <td style="padding-left:10px;">开票状态：</td>
   <td>
	<input id="invState" name="invState" class="easyui-validatebox spinner" style="width:168px" value="${purchaseReturnDate.invState }"  required="true"/>
   </td> 
   <td style="padding-left:10px;">未开票金额：</td>
   <td><input id="notInvAmo"  name="notInvAmo" class="easyui-validatebox spinner" style="width:168px" value="<fmt:formatNumber value='${purchaseReturnDate.notInvAmo}' pattern="#,#00.00元"/>" required="true"/></td>
   <td style="padding-left:10px;">已开票金额：</td>
   <td><input name="alrInvAmo" class="easyui-validatebox spinner" style="width:168px" value="<fmt:formatNumber value='${purchaseReturnDate.alrInvAmo}' pattern="#,#00.00元"/>" required="true"/></td>
</tr>
<tr> 
   <td style="padding-left:10px;">备 注：</td>
   <td colspan="7"> <textarea   name="remark" class="easyui-validatebox spinner" style="width:920px;" readonly="readonly" >${purchaseReturnDate.remark}</textarea></td>
</tr> 
<tr>
   <td style="padding-left:10px;">附件：</td>
   <td colspan="7"> <textarea   name="accessory" class="easyui-validatebox spinner" style="width:920px;" readonly="readonly" >${purchaseReturnDate.accessory}</textarea></td>
</tr>
</table>
<br/>
<!--采购退货明细  -->
<table id="purchase_return_form" style="height: 200px;margin-top: 10px;">  
</table>
</form>

<script>

var setWarehouse="";//保存仓库ID
var setRowData="";//保存选中的值

$('#purchase_return_form').datagrid({  
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
	toolbar: [{
		 text:'货物添加',
		iconCls: 'icon-standard-pencil-add',
		handler: function(){addRow();}
	 },'-',{
		text:'货物删除',
		iconCls: 'icon-standard-pencil-delete',
		handler: function(){
			$.messager.confirm('提示','确认删除数据?',function(r){
        		if (r){
        			var row= $('#purchase_return_form').datagrid("getSelected"); 
        			if(row){
                    	$('#purchase_return_form').datagrid('deleteRow',row);
                    }else{
                    	$('#purchase_return_form').datagrid('deleteRow',0);
                    }
        		}
        	});  
		}
	}],
   columns:[[    
        {field:'goodsCode',title:'货品编码',width:100},    
        {field:'goodsName',title:'货品名称',width:100},
        {field:'goodsId',title:'货品编号',width:100,hidden:true},    
        {field:'goodsModel',title:'规格型号',width:100},   
        {field:'goodsUnit',title:'单位',width:100}, 
        {field:'batchInformation',title:'批次信息',width:100},
        {field:'quantity',title:'退货数量',width:100,editor: { type: 'numberbox', options: { required: true } } },
        {field:'price',title:'退货单价',width:100,editor: { type: 'numberbox', options: { required: true } } },
        {field:'money',title:'退货金额',width:100},
        {field:'cess',title:'税率',width:100,editor: { type: 'numberbox', options: { required: true } } }, 
        {field:'remark',title:'备注',width:100,editor: { type: 'text' }}
    ]], 
    onDblClickRow:function(rowIndex, rowData){
    	showDetail(rowIndex,rowData);
    }
  });
  
//增加行
function addRow(){
	$.easyui.showDialog({
		href : ctx + '/do/purchaseReturn/showGoods.htm',//从controller请求jsp页面进行渲染
		width : 530,
		height : 300,
		resizable: false,
		title : "货品目录",
		enableSaveButton : false,
		enableApplyButton : false,
		enableCloseButton:false,
		buttons : [ 
		 {
			text : '取消',
			iconCls : 'icon-save',
			handler : function(target) {
				target.dialog("close");
			}
		},{
			text : '确认',
			iconCls : 'icon-save',
			handler : function(target) {
				if($("#goodsListDataGrid").datagrid('getSelected')){
				  var numbers=$("#purchase_return_form").datagrid("getRows").length;
				  var setName=$("#goodsListDataGrid").datagrid('getSelected').goodsName;
				  if(numbers==0){
					  $('#purchase_return_form').datagrid('insertRow', {
							index:0,
							row:{
								goodsCode:$("#goodsListDataGrid").datagrid('getSelected').goodsCode,
								goodsName:$("#goodsListDataGrid").datagrid('getSelected').goodsName,
								goodsModel:$("#goodsListDataGrid").datagrid('getSelected').specification,
								goodsUnit:$("#goodsListDataGrid").datagrid('getSelected').unit,
								quantity:0,
								price:0,
								rejection:0,
								money:0,
								cess:$("#goodsListDataGrid").datagrid('getSelected').taxRate,
								prices:0
							}
						});
					    target.dialog("close");
					    $('#purchase_return_form').datagrid('endEdit', 0).datagrid('refreshRow', 0).datagrid('beginEdit', 0);
				    }else{
					  for(var i=0;i<numbers;i++){
						  if(setName!=$('#purchase_return_form').datagrid('selectRow',i).goodsName){
							  $('#purchase_return_form').datagrid('insertRow', {
									index:0,
									row:{
										goodsCode:$("#goodsListDataGrid").datagrid('getSelected').goodsCode,
										goodsName:$("#goodsListDataGrid").datagrid('getSelected').goodsName,
										goodsModel:$("#goodsListDataGrid").datagrid('getSelected').specification,
										goodsUnit:$("#goodsListDataGrid").datagrid('getSelected').unit,
										quantity:0,
										price:0,
										rejection:0,
										money:0,
										cess:$("#goodsListDataGrid").datagrid('getSelected').taxRate,
										prices:0
									}
								});
							  $('#purchase_return_form').datagrid('endEdit', 0).datagrid('refreshRow', 0).datagrid('beginEdit', 0);
							}
						 }
					       target.dialog("close");
				  }
				}else{
				  target.dialog("close");
			  }
			  
			}
		}]
	});
 }
	//去到货品目录方法
	function showDetail(rowIndex,rowData){
		$.easyui.showDialog({
			href : ctx + '/do/purchaseReturn/showGoods.htm',//从controller请求jsp页面进行渲染
			width : 530,
			height : 300,
			resizable: false,
			title : "货品目录",
			enableSaveButton : false,
			enableApplyButton : false,
			enableCloseButton:false,
			buttons : [ 
			 {
				text : '取消',
				iconCls : 'icon-save',
				handler : function(dia) {
					dia.dialog("close");
				}
			},{
				text : '确认',
				iconCls : 'icon-save',
				handler : function(target) {
					var ed = $('#purchase_return_form').datagrid('updateRow', {
						index:rowIndex,
						row:{
							goodsCode:setRowData.goodsCode,
							goodsName:setRowData.goodsName,
							goodsModel:setRowData.specification,
							goodsUnit:setRowData.unit,
							quantity:0,
							price:0,
							rejection:0,
							money:0,
							cess:setRowData.taxRate,
							prices:0
						}
					});
					target.dialog("close"); 
					$('#purchase_return_form').datagrid('endEdit', rowIndex).datagrid('refreshRow', rowIndex).datagrid('beginEdit', rowIndex);
				}
			}]
		});
	};
  
     //仓库列表
     $("#storage").combobox({
		 	data:$.parseJSON('${allWareHouseDate}'),
			valueField:'warehouseId',    
		    textField:'warehouseName',
		    panelHeight : 'auto',
		    editable:false 
	   });
     
     //经办部门
     $("#operatorDep").combotree({
			data :$.parseJSON('${allDepTreeNodeData}'),
			width:168,
			panelHeight : 'auto',
		    missingMessage:'请选择上级部门',
		    smooth: true,       //该属性用以启用当前 easyui-tree 控件对平滑数据格式的支持
		    lines : true,
		    editable:false,
		    onBeforeSelect:function(node){
		    	if(node.state){
                     $("#operatorDep").combotree("unselect");
                 }
		    },
		    onSelect:function(record){
		    	$.ajax({
		    		type: "post", 
		    		url:ctx + "/do/user/dept.json?depId="+record.id,
		    		dataType:"json",
		    		success: function (date){
		    			   console.info(date);
		    			   $("#logCode").combobox({
		    				 	data:$.parseJSON(date),
		    					valueField:'id',    
		    				    textField:'text',
		    				    panelHeight : 'auto',
		    				    editable:false 
		    			   });
		    			   if($.parseJSON(date).length>0){
				    		   $("#logCode").combobox('select', $.parseJSON(date)[0].id);
						   }else{
							   $("#logCode").combobox('setValue', '');
						   }
		    			}
		    	});
		        
		    }
		});	
     
     //供应商信息
     $("#supplierId").combobox({
		 	data:$.parseJSON('${allSuppliesTreeNodeData}'),
			valueField:'supplierId',    
		    textField:'suppliersName',
		    panelHeight : 'auto',
		    editable:false 
	  });
</script>

