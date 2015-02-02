<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui"
	uri="http://com.glacier.permissions.com.cn/tag/easyui"%>
	
<style type="text/css">
.file-box{ position:relative;width:340px}
.txt{ height:22px; border:1px solid #cdcdcd; width:180px;}
.btn{ background-color:#FFF; border:1px solid #CDCDCD;height:24px; width:70px;}
.file{ position:absolute; top:0; right:80px; height:24px; filter:alpha(opacity:0);opacity: 0;width:260px }
</style>	
	
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

<glacierui:toolbar panelEnName="PurchaseReturnList" toolbarId="purchaseReturnDataGrid_toolbar" menuEnName="purchaseReturn"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->

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
	    <input style="width:168px" id="returnedPurchaseTypeId"  name="returnedPurchaseTypeId" value="${ purchaseReturnDate.returnedPurchaseTypeId}" required="true" class="easyui-combobox" />
	</td>
    <td style="padding-left:10px;">退货期限：</td>
	<td>
		<input class="easyui-validatebox spinner" style="width:168px" value="<fmt:formatDate value='${purchaseReturnDate.returnDeadlines}' pattern="yyyy-MM-dd HH:mm:ss"/>" required="true"/>
	</td>
    <td style="padding-left:10px;">退货原因：</td>
    <td>
       <input class="easyui-validatebox spinner"  id="returnReasonId" name="returnReasonId" style="width:168px" value="${purchaseReturnDate.returnReasonId}" required="true"/>
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
		<input id="logSettlement"  name="logSettlement" style="width:168px" value='${purchaseReturnDate.logSettlement}' required="true" class="easyui-combobox" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,data : fields.logSettlement"/>
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
	<input id="invState" name="invState" style="width:168px" value="${purchaseReturnDate.invState }"  required="true" class="easyui-combobox" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,data : fields.invState"/>
   </td> 
   <td style="padding-left:10px;">未开票金额：</td>
   <td><input id="notInvAmo"  name="notInvAmo" class="easyui-validatebox spinner" style="width:168px" value="<fmt:formatNumber value='${purchaseReturnDate.notInvAmo}' pattern="#,#00.00元"/>" required="true"/></td>
   <td style="padding-left:10px;">已开票金额：</td>
   <td><input name="alrInvAmo" class="easyui-validatebox spinner" style="width:168px" value="<fmt:formatNumber value='${purchaseReturnDate.alrInvAmo}' pattern="#,#00.00元"/>" required="true"/></td>
</tr>
<tr>
    <td style="padding-left:10px;">总金额：</td>
	<td>
	    <input id="totalAmount" readonly="readonly" name="totalAmount" class=" spinner" style="width:168px;height:20px;border-left-style: none;border-right-style: none;border-top-style: none;"   value="<fmt:formatNumber value='${purchaseReturnDate.totalAmount}' pattern="#,#00.00元"/>" />
	</td> 
</tr>
<tr> 
   <td style="padding-left:10px;">备 注：</td>
   <td colspan="7"> <textarea   name="remark" class="easyui-validatebox spinner" style="width:920px;" readonly="readonly" >${purchaseReturnDate.remark}</textarea></td>
</tr> 
<tr>
   <td style="padding-left:10px;">附件：</td>
   <td colspan="7">
   	  <a style="margin-top: 5px" href="javascript:doUpload();" class="easyui-linkbutton" data-options="iconCls:'icon-hamburg-up'">上传</a>
      <label id="fileText"></label>
     </td>
</tr>
</table>
	<hr> 
     <div style="text-align: center;">
        <font size="3" style="margin-top: 30px"><b>货品详情</b></font> 
     </div> 
     <hr>        
     <!-- 所有列表面板和表格 -->  
	<div id="purchaseReturnPanel" data-options="region:'center',border:true">
		<table id="goodsList" style="margin-bottom: 50px">  
		</table>
		<hr> 
		<div style= "text-align:center ;margin-top: 30px;margin-bottom: 30px">
	      <a id="saveOk" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-ok'">保存</a> 
	      <a style="margin-left: 30px" id="unbo" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-undo'">关闭</a> 
	   </div> 
	</div>   
</form> 

<!--附件上传  -->
<div id="FileDialog" data-options="closed:true" class="easyui-dialog">
    <div style="margin-top: 50px;">
	<div class="file-box">
	  <form action="" method="post" enctype="multipart/form-data">
	 	
	 	<input type='text' name='textfield' id='textfield' class='txt' />  
	 	
	 	<input type='button' class='btn' value='浏览...' />
		
	    <input type="file" name="fileToUpload" class="file"  id="fileToUpload"  size="45"   onchange="document.getElementById('textfield').value=this.value" >
		
		<input type="button" name="submit" class="btn" value="上传"  onclick="return ajaxFileUpload();"/> 
		
	  </form>
	</div>
	</div>
</div>


<script>

//附件上传
function doUpload(){
	$('#FileDialog').dialog({    
	    title: '附件上传',    
	    width: 360,    
	    height: 200,    
	    closed: false,    
	    cache: false,    
	    modal: true , 
	    buttons:[
			{
			text:'取消',
			iconCls:'icon-cancel',
			handler:function(){
			   $("#FileDialog").dialog('close'); 	
			 }
		}]
	});  
}

//附件上传
function ajaxFileUpload()
{
   $.ajaxFileUpload
	(
		{
			url:ctx+'/do/purchaseReturn/uploadFile',
			secureuri:false,
			fileElementId:'fileToUpload',
			data:{name:'logan', id:'id'},
			dataType: 'json',
			success: function (data, status)
			{
				$("#fileText").html("");
				var AllImgExt=".jpg|.jpeg|.gif|.bmp|.png|"//全部图片格式类型 
				var FileExt=$.parseJSON(data).name.substr($.parseJSON(data).name.lastIndexOf(".")).toLowerCase();
				$("#FileDialog").dialog('close');
				$.messager.alert('附件提示','上传成功！','info');
				$("<a href='"+ctx+"/"+$.parseJSON(data).path+"'>"+$.parseJSON(data).name+"</a>").appendTo("#fileText");
				if(AllImgExt.indexOf(FileExt+"|")!=-1){
					$("<img src='"+ctx+"/"+$.parseJSON(data).path+"'  width='50' height='50'/>").appendTo("#fileText");
				}
			},
			error: function (data, status, e)
			{
				$.messager.alert('上传提示','上传失败，请联系管理员！','info');
			}
		}
	)
	return false;
}

//明细添加
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
	           {field:'batchInformation',title:'批次信息',width:100},
	           {field:'quantity',title:'退货数量',width:100,editor: { type: 'numberbox', options: { required: true } } },
	           {field:'price',title:'退货单价',width:100,editor: { type: 'numberbox', options: { required: true } } },
	           {field:'money',title:'退货金额',width:100},
	           {field:'cess',title:'税率',width:100,editor: { type: 'numberbox', options: { required: true } } }, 
	           {field:'remark',title:'备注',width:100,editor: { type: 'text' }}
	       ]], 
	toolbar: [{
		 text:'货物添加',
		iconCls: 'icon-standard-pencil-add',
		handler: function(){
    		var row= $dg.datagrid('getSelected');//获取上一次的选中行
        	var index=$dg.datagrid('getRowIndex',row);  
            addRows();
		}
	 },'-',{
		text:'货物删除',
		iconCls: 'icon-standard-pencil-delete',
		handler: function(){
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
   onDblClickRow:function(rowIndex, rowData){
    	showDetail(rowIndex,rowData);
    }
  });
  
//增加行
function addRow(){
	$.easyui.showDialog({
		href : ctx + '/do/purchaseReturn/showGoods.htm',//从controller请求jsp页面进行渲染
		width : 600,
		height : 420,
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
				if($("#goodsListDataGrid").datagrid('getSelections')){
				  var setName=$("#goodsListDataGrid").datagrid('getSelections');
				  var returnName=$("#purchase_return_form").datagrid("getRows");
				  if(returnName.length==0){
                     for(var i=0;i<setName.length;i++){
                    	 $('#purchase_return_form').datagrid('insertRow', {
 							index:0,
 							row:{
 								goodsCode:setName[i].goodsCode,
 								goodsName:setName[i].goodsName,
 								goodsModel:setName[i].specification,
 								goodsUnit:setName[i].unit,
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
                     target.dialog("close");
					}else{
						for(var i=0;i<setName.length;i++){
							  var count=0;
							  for(var j=0;j<returnName.length;j++){
								  if(setName[i].goodsName==returnName[j].goodsName)
								     	    count+=1;
							  }
							if(count==0){
								  $('#purchase_return_form').datagrid('insertRow', {
			 							index:0,
			 							row:{
			 								goodsCode:setName[i].goodsCode,
			 								goodsName:setName[i].goodsName,
			 								goodsModel:setName[i].specification,
			 								goodsUnit:setName[i].unit,
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
			width : 600,
			height : 420,
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
					 var row=$('#goodsListDataGrid').datagrid("getSelected");
				     var returnName=$("#purchase_return_form").datagrid("getRows");
				     var count=0;
				     for(var i=0;i<returnName.length;i++){
				    	 if(row.goodsName==returnName[i].goodsName) count+=1;
				     }
				     if(count==0){
				    	  $('#purchase_return_form').datagrid('updateRow', {
								index:rowIndex,
								row:{
									goodsCode:row.goodsCode,
									goodsName:row.goodsName,
									goodsModel:row.specification,
									goodsUnit:row.unit,
									quantity:0,
									price:0,
									rejection:0,
									money:0,
									cess:row.taxRate,
									prices:0
								}
							});
							$('#purchase_return_form').datagrid('endEdit', rowIndex).datagrid('refreshRow', rowIndex).datagrid('beginEdit', rowIndex); 
				     }
				     target.dialog("close"); 
				}
			}]
		});
	};
	
	  //提交操作
	  function doSave(){
	      alert("哈哈哈哈！！！！我提交了!");	  
	  }
	
     //撤销操作
	 function doClear(){
		 $('#purchase_return_form').datagrid('loadData',{total:0,rows:[]}); 
	 }
	
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
    
     //退货原因
      $("#returnReasonId").combobox({
		 	data:$.parseJSON('${allReturnReasonData}'),
			valueField:'returnReasonId',    
		    textField:'name',
		    panelHeight : 'auto',
		    editable:false 
	  });
     
     //退货方式
      $("#returnedPurchaseTypeId").combobox({
		 	data:$.parseJSON('${allReturnTypeData}'),
			valueField:'returnedPurchaseTypeId',    
		    textField:'name',
		    panelHeight : 'auto',
		    editable:false 
	  });
     
</script>

