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
<form id="purchaseReturn_detail_form" method="post" >
<table class="detailtable">
 <glacierui:toolbar panelEnName="PurchaseReturnList" toolbarId="purchaseReturnDataGrid_toolbar" menuEnName="purchaseReturn"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		 <tr>
		     <td colspan="8">
		       <hr> 
			      <div style="margin-left: 410px">
			         <font size="3" style="margin-top: 30px"><b>【采购退货】编辑</b></font> 
			      </div> 
   				<hr> 
		     </td>
		 </tr>
		<tr> 
	        <td style="padding-left:10px;">仓库：</td>
			<td>
			     <input id="warehouseTypeId" name="warehouseTypeId" class="easyui-combobox spinner" style="width:168px" value="${goodsListDate.warehouseTypeId}" required="true"/>
			</td>
	      </tr>   
	</table> 
</form> 
 
<hr> 
  <div style="margin-left: 410px">
     <font size="3" style="margin-top: 30px"><b>【采购退货】操作</b></font> 
  </div> 
<hr> 

<hr>
  <input type="button" value="增行" onclick="doCheck();">   	 
<hr>

<!--自定义货物档案信息选择框-->
<div id="chooseGoods" class="easyui-dialog" closed="true" >
    <div id="contentDiv"></div>
</div>


<script>

   

    //仓库信息绑定
	$("#warehouseTypeId").combobox({
		data : $.parseJSON('${allWareHouseDate}'),//controller传来的数据源
		height:18,
		panelHeight : 'auto',
	    required:true,
	    editable : false,
	    missingMessage:'请选择仓库',
		textField : 'warehouseName',
		valueField: 'warehouseId',
		onSelect:function(node){
			$.ajax({
			    type:"post",
			    url:ctx + "/do//goodsList/listPartGoods.json?warehouseTypeId="+node.warehouseId,
	    		dataType:"json",
	    		success:function(date){
	    			$("#contentDiv").empty();
	    		    if($.parseJSON(date).length>0){
	    		    	$("<lable>有数据</lable>").appendTo("#contentDiv");
	    		    }else{
	    		    	$("<lable>该仓库暂时未存放商品，请稍后来试</lable>").appendTo("#contentDiv");
	    		    }
	    		}
			});
		}
	 }); 
 
     //增行操作
     function doCheck(){
    	 if($("#warehouseTypeId").combobox('getValue')){
    		 $('#chooseGoods').dialog({    
     		    title: '【货物档案】筛选',    
     		    width: 400,    
     		    height: 200,    
     		    closed: false,    
     		    cache: false,    
     		    modal: true,
     		    buttons:[{
     				text:'保存',
     				iconCls:'icon-save',
     				handler:function(){
     					alert("保存测试!!!");
     				}
     			},{
     				text:'关闭',
     				iconCls:'icon-cancel',
     				handler:function(){
     					$("#chooseGoods").dialog('close');
     				}
     			}]
     		});  
    	 }else{
    		 $.messager.alert('警告','请先选择仓库信息!','info');
		}
     }
</script>  