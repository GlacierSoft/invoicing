<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="goodsList_mgr_goodsList_form" method="post" style="padding:15px;width: 555px">
<div title="基本信息" style="padding:15px">
    	<fieldset id="goodsList_mgr_goodsList_form_goodsListfieldset" style="padding:10px;" class="spinner">
			<legend>货物基本信息</legend>  
			<table  class="formtable"> 
				    <tr> 
				        <td>货物名称：</td>
						<td >
						    <input type="hidden" id="goodsId" name="goodsId" value="${goodsListDate.goodsId }" /> 
						    <input id="goodsName" name="goodsName" class="easyui-validatebox spinner" required="true" style="width:168px;height: 18px;" value="${goodsListDate.goodsName}"  />
						</td>
				        <td style="padding-left:10px;">货品类型：</td>
						<td><input id="goodsTypeId" name="goodsTypeId" class="easyui-combobox spinner" style="width:168px" value="${goodsListDate.goodsTypeId }" required="true"/></td>
					</tr> 
					<tr> 
					    <td> 仓库类型：</td>
						<td><input id="goodsSortId" name="goodsSortId" class="easyui-combobox spinner" style="width:168px" value="${goodsListDate.goodsSortId }" required="true"/></td>
					    <td style="padding-left:10px;">所属仓库：</td>
						<td><input id="warehouseTypeId" name="warehouseTypeId" class="easyui-combobox spinner" style="width:168px" value="${goodsListDate.warehouseTypeId}" required="true"/></td>
					 </tr>
					 <tr>
						<td>货物品牌：</td>
					    <td><input id="brands" name="brands" class="easyui-validatebox spinner" style="width:168px" value="${goodsListDate.brands}" required="true"/></td>
						<td style="padding-left:10px;">规格型号：</td>
					    <td><input id="specification" name="specification" class="easyui-validatebox spinner" style="width:168px" value="${goodsListDate.specification}" required="true"/></td>
				 	</tr>
				 	<tr>
						<td>货物产地：</td>
						<td ><input name="origin" class="easyui-validatebox spinner" style="width:168px" value="${goodsListDate.origin}" required="true"/></td>
						<td style="padding-left:10px;">生产厂家：</td>
						<td ><input  name="manufacturers" class="easyui-validatebox spinner" style="width:168px" value="${goodsListDate.manufacturers}" required="true"/></td>
				   </tr> 
				   <tr>
						<td>货物单位：</td>
						<td><input class="easyui-validatebox spinner"  name="unit" style="width:168px" value="${goodsListDate.unit}"  required="true"/></td>
						<td style="padding-left:10px;">包装单位：</td>
						<td><input class="easyui-validatebox spinner" name="bulkUnit"  style="width:168px" value="${goodsListDate.bulkUnit}" required="true"/></td>
					</tr>
					<tr>
						<td>备 注：</td>
						<td colspan="3"> <textarea   name="remark" class="easyui-validatebox spinner" style="width:435px;" >${goodsListDate.remark}</textarea></td>
					</tr>
				</table>
		</fieldset>
    </div>
    <div title="详细信息" style="padding:15px">
    	<fieldset id="goodsList_mgr_goodsList_form_goodsListfieldsetCheck" style="padding:10px;" class="spinner">
			<legend>货物详细信息</legend>  
			<table  class="formtable">
					 <tr>
					    <td style="padding-left:10px;">货物税率：</td>
						<td ><input name="taxRate" class="easyui-validatebox spinner" style="width:168px" value="<fmt:formatNumber value='${goodsListDate.taxRate}' pattern="#,#00.00"/>" required="true" validType="customReg['^\\d+(\\.\\d+)?$','<fmt:message key="public.thisNum.illegal"/>']" missingMessage="请输入货物税率"/></td>
					    <td style="padding-left:10px;">参考成本价：</td>
						<td><input id="referenceCost" name="referenceCost" class="easyui-validatebox spinner" style="width:168px" value="<fmt:formatNumber value='${goodsListDate.referenceCost}' pattern="#,#00.00"/>" required="true" validType="customReg['^\\d+(\\.\\d+)?$','<fmt:message key="public.thisNum.illegal"/>']" missingMessage="请输入货物税率"/></td>
					 </tr>
					  <tr>
					    <td style="padding-left:10px;">参考零售价：</td>
						<td><input  name="referenceRetailPrice" class="easyui-validatebox spinner" style="width:168px" value="<fmt:formatNumber value='${goodsListDate.referenceRetailPrice}' pattern="#,#00.00"/>" required="true" validType="customReg['^\\d+(\\.\\d+)?$','<fmt:message key="public.thisNum.illegal"/>']" missingMessage="请输入参考零售价"/></td>
					    <td style="padding-left:10px;">参考销售价：</td>
						<td><input name="referenceSalesPrice" class="easyui-validatebox spinner" style="width:168px" value="<fmt:formatNumber value='${goodsListDate.referenceSalesPrice}' pattern="#,#00.00"/>" required="true" validType="customReg['^\\d+(\\.\\d+)?$','<fmt:message key="public.thisNum.illegal"/>']" missingMessage="请输入参考销售价"/></td>
					</tr>
					   <tr>
					    <td style="padding-left:10px;">销售价格一：</td>
						<td><input name="salesPrice1" class="easyui-validatebox spinner" style="width:168px" value="<fmt:formatNumber value='${goodsListDate.salesPrice1}' pattern="#,#00.00"/>" required="true" validType="customReg['^\\d+(\\.\\d+)?$','<fmt:message key="public.thisNum.illegal"/>']" missingMessage="请输入销售价格一"/></td>
					    <td style="padding-left:10px;">销售价格二：</td>
						<td><input name="salesPrice2" class="easyui-validatebox spinner" style="width:168px" value="<fmt:formatNumber value='${goodsListDate.salesPrice2}' pattern="#,#00.00"/>" required="true" validType="customReg['^\\d+(\\.\\d+)?$','<fmt:message key="public.thisNum.illegal"/>']" missingMessage="请输入销售价格二"/></td>
					 </tr>
					 <tr>
					 <td style="padding-left:10px;">销售价格三：</td>
						<td><input name="salesPrice3" class="easyui-validatebox spinner" style="width:168px" value="<fmt:formatNumber value='${goodsListDate.salesPrice3}' pattern="#,#00.00"/>" required="true" validType="customReg['^\\d+(\\.\\d+)?$','<fmt:message key="public.thisNum.illegal"/>']" missingMessage="请输入销售价格三"/></td>
					    <td style="padding-left:10px;">销售价格四：</td>
						<td><input name="salesPrice4" class="easyui-validatebox spinner" style="width:168px" value="<fmt:formatNumber value='${goodsListDate.salesPrice4}' pattern="#,#00.00"/>" required="true" validType="customReg['^\\d+(\\.\\d+)?$','<fmt:message key="public.thisNum.illegal"/>']" missingMessage="请输入销售价格四"/></td>
					 </tr>
					 <tr>
					    <td style="padding-left:10px;">销售价格五：</td>
						<td><input name="salesPrice5" class="easyui-validatebox spinner" style="width:168px" value="<fmt:formatNumber value='${goodsListDate.salesPrice5}' pattern="#,#00.00"/>" required="true" validType="customReg['^\\d+(\\.\\d+)?$','<fmt:message key="public.thisNum.illegal"/>']" missingMessage="请输入销售价格五"/></td>
					    <td style="padding-left:10px;">销售价格六：</td>
						<td><input name="salesPrice6" class="easyui-validatebox spinner" style="width:168px" value="<fmt:formatNumber value='${goodsListDate.salesPrice6}' pattern="#,#00.00"/>" required="true" validType="customReg['^\\d+(\\.\\d+)?$','<fmt:message key="public.thisNum.illegal"/>']" missingMessage="请输入销售价格六"/></td>
					 </tr>
					 <tr>
					    <td style="padding-left:10px;">销售价格七：</td>
						<td><input name="salesPrice7" class="easyui-validatebox spinner" style="width:168px" value="<fmt:formatNumber value='${goodsListDate.salesPrice7}' pattern="#,#00.00"/>" required="true" validType="customReg['^\\d+(\\.\\d+)?$','<fmt:message key="public.thisNum.illegal"/>']" missingMessage="请输入销售价格七"/></td>
					    <td style="padding-left:10px;">销售价格八：</td>
						<td><input name="salesPrice8" class="easyui-validatebox spinner" style="width:168px" value="<fmt:formatNumber value='${goodsListDate.salesPrice8}' pattern="#,#00.00"/>" required="true" validType="customReg['^\\d+(\\.\\d+)?$','<fmt:message key="public.thisNum.illegal"/>']" missingMessage="请输入销售价格八"/></td>
					 </tr>
					 <tr>
					 <td style="padding-left:10px;">销售价格九：</td>
						<td><input name="salesPrice9" class="easyui-validatebox spinner" style="width:168px" value="<fmt:formatNumber value='${goodsListDate.salesPrice9}' pattern="#,#00.00"/>" required="true" validType="customReg['^\\d+(\\.\\d+)?$','<fmt:message key="public.thisNum.illegal"/>']" missingMessage="请输入销售价格九"/></td>
					    <td style="padding-left:10px;">销售价格十：</td>
						<td><input name="salesPrice10" class="easyui-validatebox spinner" style="width:168px" value="<fmt:formatNumber value='${goodsListDate.salesPrice10}' pattern="#,#00.00"/>" required="true" validType="customReg['^\\d+(\\.\\d+)?$','<fmt:message key="public.thisNum.illegal"/>']" missingMessage="请输入销售价格十"/></td>
					 </tr>
			</table>
		</fieldset>
    </div>
    <div title="其他信息" style="padding:15px">
    	<fieldset id="goodsList_mgr_goodsList_form_goodsListfieldsetOther" style="padding:10px;" class="spinner">
			<legend>货物其他信息</legend>  
			<table  class="formtable">
					<tr>
						<td style="padding-left:10px;">换算比例：</td>
						<td ><input name="packageConRates" class="easyui-validatebox spinner" style="width:168px" value="${goodsListDate.packageConRates}" required="true" validType="customReg['^\\d+(\\.\\d+)?$','<fmt:message key="public.thisNum.illegal"/>']" missingMessage="请输入换算比例"/></td>
						<td style="padding-left:10px;">计价方式：</td>
						<td ><input  name="pricing" class="easyui-validatebox spinner" style="width:168px" value="${goodsListDate.pricing}"  required="true"/></td>
				   </tr>
				   <tr>
					  <td style="padding-left:10px;">负责部门：</td>
						<td><input name="department"  id="department" class="easyui-comboboxspinner spinner" style="width:168px" value="${goodsListDate.department}" required="true"/></td>
					 <td style="padding-left:10px;">负责人：</td>
						<td><input name="attn" id="attn" class="easyui-combobox spinner" style="width:168px" value="${goodsListDate.attn }" required="true"/></td>
					 </tr>
					 <tr>
						<td style="padding-left:10px;">批次管理：</td>
						<td ><input id="batchManagement" name="batchManagement" style="width: 168px;" value="${goodsListDate.batchManagement }" /></td>
						<td style="padding-left:10px;">有效期管理：</td>
						<td ><input id="validManagement" name="validManagement" style="width: 168px;" value="${goodsListDate.validManagement }" /></td>
				    </tr> 
					 <tr>
					    <td style="padding-left:10px;">生产日期：</td>
						<td><input name="warrantyStart" id="warrantyStart" class="easyui-datetimebox" style="width:168px" value="<fmt:formatDate value="${goodsListDate.warrantyStart}" pattern="yyyy-MM-dd HH:mm:ss"/>" required="true"/></td>
					    <td style="padding-left:10px;">终止日期：</td>
						<td><input name="warrantyEnd" id="warrantyEnd" class="easyui-datetimebox" style="width:168px" value="<fmt:formatDate value='${goodsListDate.warrantyEnd}'  pattern="yyyy-MM-dd HH:mm:ss"/>" required="true"/></td>
					 </tr>
			</table>
		</fieldset>
    </div>  
</form>

<script type="text/javascript">
	$('#goodsList_mgr_goodsList_form').tabs({
		border:true,
		onSelect:function(){
			$("div").remove(".validatebox-tip");//解决关闭窗体偶尔出现验证条bug
		}
	}); 
	
	//初始化填充数据
	
	var warehouseTypeId='${goodsListDate.warehouseTypeId}';
	
	var goodsSortId='${goodsListDate.goodsSortId}';
	
	if('${goodsListDate.goodsTypeId }'!=null){
		$.ajax({
			type:"post",
			url:ctx + "/do/warehouse/listWarehouse.json?warehouseTypeId="+goodsSortId,
			dataType:"json",
			success:function(date){
				if(date!=null&&date!=""){
	    		 if($.parseJSON(date).length>0){
		    		  $("#warehouseTypeId").combobox({
	    				 	data:$.parseJSON(date),
	    					valueField:'warehouseId',    
	    				    textField:'warehouseName',
	    				    panelHeight : 'auto',
	    				    editable:false 
	    			   });
		    		  if($.parseJSON(date).length==0){
	    				   $("#warehouseTypeId").combobox('setValue', '');
					   }else{
						   $("#warehouseTypeId").combobox('select', warehouseTypeId);
					   }
				  }
	    	  }
	 		}
		});
	        	
	}
	
	//货品类型一级
	$("#goodsTypeId").combobox({
		data : $.parseJSON('${allTypeTreeNodeData}'),//controller传来的数据源
		height:18,
		panelHeight : 'auto',
	    required:true,
	    editable : false,
	    missingMessage:'请选择货品类型',
		textField : 'name',
		valueField: 'warGoodsTypeId',
		onSelect:function(record){
			$("#goodsSortId").combobox('setValue',record.warGoodsTypeId);
			$.ajax({
				type:"post",
				url:ctx + "/do/warehouse/listWarehouse.json?warehouseTypeId="+record.warGoodsTypeId,
				dataType:"json",
				success:function(date){
					if(date!=null&&date!=""){
		    		  console.info(date);
			    	  if($.parseJSON(date).length>0){
			    		  $("#warehouseTypeId").combobox({
		    				 	data:$.parseJSON(date),
		    					valueField:'warehouseId',    
		    				    textField:'warehouseName',
		    				    panelHeight : 'auto',
		    				    editable:false 
		    			   });
			    		  if($.parseJSON(date).length==0){
		    				   $("#warehouseTypeId").combobox('setValue', '');
						   }else{
							   $("#warehouseTypeId").combobox('select', $.parseJSON(date)[0].warehouseId);
						   }
					  }
		    	  }
		 		}
			});
		}
     });
	
	//仓库类型信息二级
	$("#goodsSortId").combobox({
		data : $.parseJSON('${allTypeTreeNodeData}'),//controller传来的数据源
		height:18,
		panelHeight : 'auto',
	    required:true,
	    editable : false,
	    missingMessage:'请选择仓库类型',
		textField : 'name',
		valueField: 'warGoodsTypeId',
		onSelect:function(record){
			$("#goodsTypeId").combobox('setValue',record.warGoodsTypeId);
			//仓库类型信息三级关联
			$.ajax({
				type:"post",
				url:ctx + "/do/warehouse/listWarehouse.json?warehouseTypeId="+record.warGoodsTypeId,
				dataType:"json",
				success:function(date){
				      if($.parseJSON(date).length>0){
			    		  $("#warehouseTypeId").combobox({
		    				 	data:$.parseJSON(date),
		    					valueField:'warehouseId',    
		    				    textField:'warehouseName',
		    				    panelHeight : 'auto',
		    				    editable:false 
		    			   });
			    		   $("#warehouseTypeId").combobox('select', $.parseJSON(date)[0].warehouseId);
					   }else{
						    $("#warehouseTypeId").combobox('setValue', '');
					   }
		    	}
			});
		}
	});
	
	$('#member_mgr_member_form_status').val(renderGridValue('${goodsListDate.auditState}',fields.auditState));
	
	//下拉项的值
	$('#batchManagement').combobox({
		valueField : 'value',
		width : 168,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		required:true,
		data : fields.yesOrNo
	});
	
	//下拉项的值
	$('#validManagement').combobox({
		valueField : 'value',
		width : 168,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		required:true,
		data : fields.yesOrNo,
	});
	
	//标识
	var str='${goodsListDate.goodsId }';
	
	//初始化上级部门
	$("#department").combotree({
		data :$.parseJSON('${allDepTreeNodeData}'),
		width:168,
		panelHeight : 'auto',
	    missingMessage:'请选择上级部门',
	    smooth: true,       //该属性用以启用当前 easyui-tree 控件对平滑数据格式的支持
	    lines : true,
	    editable:false,
	    onBeforeSelect:function(node){
	    	if(node.state){
                 $("#department").combotree("unselect");
             }
	    },
	    onSelect:function(record){
	    	$.ajax({
	    		type: "post", 
	    		url:ctx + "/do/user/dept.json?depId="+record.id,
	    		dataType:"json",
	    		success: function (date){
	    			   $("#attn").combobox({
	    				 	data:$.parseJSON(date),
	    					valueField:'id',    
	    				    textField:'text',
	    				    panelHeight : 'auto',
	    				    editable:false 
	    			   });
	    			   if($.parseJSON(date).length==0){
	    				   $("#attn").combobox('setValue', '');
					   }else{
						   if(str==null||str=="")
						        $("#attn").combobox('select', $.parseJSON(date)[0].id);
					   }
	    			}
	    	});
	        
	    }
	});	
	
</script>
