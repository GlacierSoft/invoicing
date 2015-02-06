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
<form id="purchaseReturn_mgr_purchaseReturn_form" method="post">
<table  class="formtable" style="margin-left: 20px;margin-top: 5px;">
<glacierui:toolbar panelEnName="PurchaseReturnList" toolbarId="purchaseReturnDataGrid_toolbar" menuEnName="purchaseReturn"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
<tr>
    <td colspan="8">
      <hr> 
        <div style="margin-left: 520px;" >
            <font size="3" ><b>采购退货单</b></font> 
	      </div> 
 	  <hr> 
     </td>
 </tr>
<tr> 
         <td style="padding-left:10px;">所属仓库：</td>
		<td>
		    <input type="hidden" name="purReturnId" value="${purchaseReturnDate.purReturnId}" id="purReturnId">
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
	        <input id="operators" name="operators" class="easyui-combobox spinner" style="width:168px;" value="${purchaseReturnDate.logCode}" required="true"/>
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
		<input id="paymentState" name="paymentState" class="easyui-combobox spinner" style="width:168px" value="${purchaseReturnDate.paymentState }"  required="true" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,data : fields.payState"/>
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
   <td>
       <input name="alrInvAmo" class="easyui-validatebox spinner" style="width:168px" value="<fmt:formatNumber value='${purchaseReturnDate.alrInvAmo}' pattern="#,#00.00元"/>" required="true"/>
       <input type="hidden" id="totalAmount" name="totalAmount" class=" spinner" style="width:168px;height:20px;border-left-style: none;border-right-style: none;border-top-style: none;"   value="<fmt:formatNumber value='${purchaseReturnDate.totalAmount}' pattern="#,#00.00元"/>" />
   </td>
</tr>
<tr> 
   <td style="padding-left:10px;">备 注：</td>
   <td colspan="7"> <textarea   name="remark" class="easyui-validatebox spinner" style="width:920px;">${purchaseReturnDate.remark}</textarea></td>
</tr> 
<tr>
   <td style="padding-left:10px;">附件：</td>
   <td colspan="7">
      <label style="float: left;margin-top: 10px;">
   	      <a style="margin-right: 5px;" href="javascript:doUpload();" class="easyui-linkbutton" data-options="iconCls:'icon-hamburg-up'">上传</a>
      </label>
      <label id="fileText" style="float: left;height:50px;"></label>
      <label id="fileButton" style="display: none;float: left;">
          <a style="margin-top: 10px;margin-left: 5px;" href="javascript:doFiledelete();" class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" >取消</a>
      </label>
     </td>
</tr>
</table>
	<hr> 
     <div style="text-align: center;">
        <font size="3"><b>货品详情</b></font> 
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
				if(AllImgExt.indexOf(FileExt+"|")!=-1){
					$("<img src='"+ctx+"/"+$.parseJSON(data).path+"'  width='50' height='50'/>").appendTo("#fileText");
				}else{
					$("<a href='"+ctx+"/"+$.parseJSON(data).path+"' style='padding-top:15px;line-height:50px;'>"+$.parseJSON(data).name+"</a>").appendTo("#fileText");
				}
				$("#fileButton").css({"display":"block"});
			},
			error: function (data, status, e)
			{
				$.messager.alert('上传提示','上传失败，请联系管理员！','info');
			}
		}
	)
	return false;
}

//附件取消
function doFiledelete(){
	$("#fileText").html("");
	$("#fileButton").css({"display":"none"});
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
			   {field:'goodsId',title:'货品ID',width:100,hidden:true},  
			   {field:'goodsCode',title:'货品编码',width:100,editor: { type: 'text' }},    
	           {field:'goodsName',title:'货品名称',width:100},
	           {field:'goodsId',title:'货品编号',width:100,hidden:true},    
	           {field:'goodsModel',title:'规格型号',width:100},   
	           {field:'goodsUnit',title:'单位',width:100}, 
	           {field:'batchInformation',title:'批次信息',width:100},
	           {field:'quantity',title:'退货数量',width:100,editor: { type: 'numberbox', options: { required: true } } },
	           {field:'price',title:'退货单价',width:100,editor: { type: 'numberbox', options: { required: true } } },
	           {field:'money',title:'退货金额',width:100,editor: { type: 'numberbox',options:{precision:2}} },
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
   rownumbers : true,//True 就会显示行号的列
   onDblClickRow:function(rowIndex, rowData){
	   stRows=rowIndex; 
    },
   onSelect:function(rowIndex, rowData){
	   var rows = $dg.datagrid('getRows'); 
   		if(rows.length==1){
   		selecRows=0;
   	    } 
   		$dg.datagrid('endEdit',selecRows);
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
  
  
//统计
function  compute(){
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
	  }else{
		  moneyTotal=parseFloat(rows[0]['money']);
	  }
	  $("#totalAmount").attr("value","").attr("value",moneyTotal); 
}

//批量增加
function addRows(){
	storageVal = $('#storage').combobox('getValue');
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
	  				for(var i = 0; i < rowsCheck.length;i++){
	  					$dg.datagrid('insertRow', {
	  						index: i,
	  						row:{
	  							goodsId:rowsCheck[i].goodsId,
	  							goodsCode:rowsCheck[i].goodsCode,
	  							goodsName:rowsCheck[i].goodsName,
	  							goodsModel:rowsCheck[i].specification,
	  							goodsUnit:rowsCheck[i].unit,
	  							price:rowsCheck[i].referenceCost,
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
	  				$dg.datagrid('endEdit', rowsCheck.length-1).datagrid('refreshRow', rowsCheck.length-1); 
	  				selecRows=selecRows+rowsCheck.length; //上一次选中的行=原来选中的行+新添加的行数
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
		$('#storage').focus(); 
		return false;
	}
}
  
  
//获取行号
function getRowIndex(target){
	var tr = $(target).closest('tr.datagrid-row'); 
	return parseInt(tr.attr('datagrid-row-index'));
} 

//事件绑定
function againBinding(rows){       
	$("div[class='dialog-button datagrid-rowediting-panel']").remove();
	//货品编码 
	var goodsCodeTarget = $dg.datagrid('getEditor', {index:rows,field:'goodsCode'}).target;
	//单价
	var priceTarget = $dg.datagrid('getEditor', {index:rows,field:'price'}).target; 
	//数量
	var quantityTarget = $dg.datagrid('getEditor', {index:rows,field:'quantity'}).target; 
	//金额
	var moneyTarget = $dg.datagrid('getEditor', {index:rows,field:'money'}).target; 
	//货品编码
	 $(goodsCodeTarget).bind("click",function(){ 
		  goodsCodeClick(this);
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

//单价编辑框绑定事件
function priceBlur(obj){   
	var rows=$dg.datagrid('getRows'); 
	var indexRows = getRowIndex(obj);  //获取行号 
	var yuanjia = $dg.datagrid('getData').rows[indexRows].primeCost;  
	//-------------------------------取编辑框对象------------------------------
	//单价
	var priceTarget = $dg.datagrid('getEditor', {index:indexRows,field:'price'}).target;
	//数量
	var quantityTarget = $dg.datagrid('getEditor', {index:indexRows,field:'quantity'}).target; 
	var remarkTarget = $dg.datagrid('getEditor', {index:indexRows,field:'remark'}).target; 
    //-----------------------------------自定义变量-----------------------------------
	var price = parseFloat(priceTarget.val()).toFixed(2);
	var quantity = parseInt(quantityTarget.val());//数量   
	var sun=accMul(price,quantity);//总额=单价*数量 
	$dg.datagrid('updateRow',{
		index: indexRows,
		row: {
			money: sun.toFixed(2),
			price:price,
			quantity:quantity, 
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
	//单价
	var priceTarget = $dg.datagrid('getEditor', {index:indexRows,field:'price'}).target;
	//数量
	var quantityTarget = $dg.datagrid('getEditor', {index:indexRows,field:'quantity'}).target; 
	//交货期限
	var remarkTarget = $dg.datagrid('getEditor', {index:indexRows,field:'remark'}).target; 
   //-----------------------------------自定义变量-----------------------------------
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
			price:priceOne,
			quantity:quantity, 
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
	//单价
	var priceTarget = $dg.datagrid('getEditor', {index:indexRows,field:'price'}).target;
	//数量
	var quantityTarget = $dg.datagrid('getEditor', {index:indexRows,field:'quantity'}).target; 
	//金额
	var moneyTarget = $dg.datagrid('getEditor', {index:indexRows,field:'money'}).target; 
	//交货期限
	var remarkTarget = $dg.datagrid('getEditor', {index:indexRows,field:'remark'}).target; 
    //-----------------------------------自定义变量-----------------------------------
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


//货物编码编辑框点击事件
function goodsCodeClick(obj){
  	var indexRows = getRowIndex(obj); 
	goodsDetail(indexRows); 
}

//去到货品目录方法
function goodsDetail(rowIndex){ 
	$.easyui.showDialog({
		href : ctx + '/do/purchaseOrder/goodsDetail.htm',//从controller请求jsp页面进行渲染
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
				$dg.datagrid('updateRow', {
					index:stRows,
						row:{
  							goodsId:setRowData.goodsId,
  							goodsCode:setRowData.goodsCode,
  							goodsName:setRowData.goodsName,
  							goodsModel:setRowData.specification,
  							goodsUnit:setRowData.unit,
  							batchInformation:setRowData.specification,
  							price:setRowData.referenceCost,
  							quantity:0,
  							money:0.00,
  							cess:setRowData.taxRate,
  							remark:setRowData.remark
  						}
				}); 
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
	$("#layout_center_panel").panel("setTitle","采购退货");
	$('#layout_center_panel').panel('refresh',ctx +'/do/purchaseReturn/index.htm');
});
	
//点击保存，获取表格的数据
$("#saveOk").click(function(){  
    var row=$dg.datagrid('getRows');  
	var date= $dg.datagrid('getData').rows; 
	var jsonDate=JSON.stringify(date);   
    var str=JSON.stringify($("#purchaseReturn_mgr_purchaseReturn_form").serializeObject());
    var status=$("#purReturnId").val();//状态判断，如何为空，则是新增退货，否则为修改退货 
    if(row.length<1){
    	$.messager.alert('提示信息','至少选择一件货物！','info'); 
		 return;
    }
    for(var i=0;i<row.length;i++){ 
    	if(row[i]['quantity']==0){ 
    		$.messager.alert('提示信息','请完善货物信息，订购数量不能为0！','info'); 
    		 return;
    	}
    }    
    
    //修改
	if(status!=""){ 
	    	$.post(ctx + '/do/purchaseReturn/edit.json', { data: jsonDate,purchaseReturn:str},
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
  		    	$("#layout_center_panel").panel("setTitle","采购退货");
  		    	$('#layout_center_panel').panel('refresh',ctx +'/do/purchaseReturn/index.htm'); 
  			 });  
	    }else{ 
	    	 //新增
	    	 $.post(ctx + '/do/purchaseReturn/add.json', { data: jsonDate,purchaseReturn:str},
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
   	   		    	$("#layout_center_panel").panel("setTitle","采购退货");
   	   		    	$('#layout_center_panel').panel('refresh',ctx +'/do/purchaseReturn/index.htm'); 
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

