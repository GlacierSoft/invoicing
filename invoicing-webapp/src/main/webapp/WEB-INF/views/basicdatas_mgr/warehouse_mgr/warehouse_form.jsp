<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<style>
        #formtable tr td{padding:2px;} 
        
        #waresort_td{
            padding:2px;
        }
</style>

<form id="creditType_mgr_creditType_form" method="POST" modelAttribute="parameterCredit" style="padding:15px" enctype="multipart/form-data">
	<table class="formtable" id="formtable">
		<tr>
			<td style="width:120px;">仓库名称：</td>
			<td>
				<input type="hidden" name="warehouseId" value="${warehouseDate.warehouseId}" />
				<input name="warehouseName"  class="easyui-validatebox spinner" style="width:168px;height: 20px;" required="true" value="${warehouseDate.warehouseName}"/>
			</td>
			 <td style="padding-left: 15px;">仓库序号：</td>
			<td>
			    <input maxlength="3" name="orderNum" class="easyui-numberspinner spinner" style="width:168px;height: 20px;"  value="${warehouseDate.orderNum}" data-options="min:0,max:9999,required:true,missingMessage:'请输入仓库序号'" /> 
			 </td>
		</tr>
		<tr>
		    <td>所属部门：</td>
			<td>
				<input name="departmentId" id="departmentId"  class="easyui-combobox spinner" style="width:168px;height: 20px;" required="true" value="${warehouseDate.departmentId}"/>
			</td>
			<td style="padding-left: 15px;">仓库管理：</td>
			<td><input name="warehouseManager" id="warehouseManager" class="easyui-combobox spinner" style="width:168px;height: 20px;" value="${warehouseDate.warehouseManager}" required="true"/></td>
		   
		</tr>
		<tr>
			<td>负责人员：</td>
			<td><input name="head" class="easyui-validatebox spinner" style="width:168px;height: 20px;" value="${warehouseDate.head}" required="true" /></td>
		    <td style="padding-left: 15px;">联系电话：</td>
			<td><input  name="phone" class="easyui-validatebox spinner" style="width:168px;height: 20px;" value="${warehouseDate.phone}" required="true" validType="customReg['^[1]([3][0-9]{1}|59|58|88|89)[0-9]{8}$','<fmt:message key="User.mobile.illegal"/>']" missingMessage="请输入正确手机号"/ /></td>
		</tr>
		<tr>
			<td>零售库存：</td>
			<td><input name="retailLibraries" id="retailLibraries" class="easyui-combobox spinner" value="${warehouseDate.retailLibraries}" required="true"/></td>
		     <td style="padding-left: 15px;">仓库地址：</td>
			<td><input name="address" class="easyui-validatebox spinner" style="width:168px;height: 20px;" value="${warehouseDate.address}" required="true"/></td>
		</tr>
		<tr style="height: 120px;">
		  <td>仓库分类：</td>
		  <td colspan="3" >
		       <div id="waresort_td" style="width:420px;height:85px;border-top:1px solid #ABADB3;overflow-y:auto;" ></div>
		  </td>
	    </tr>
		<tr>
		  <td>备注信息：</td>
		  <td colspan="3">
		        <textarea style="width:420px;height: 40px;">${warehouseDate.remark}</textarea>
		   </td>
	    </tr>
	</table>
</form>
 <script>

    var str='${warehouseDate.warehouseId}';

     $('#retailLibraries').combobox({
			valueField : 'value',
			width : 168,
			textField : 'label',
			panelHeight : 'auto',
			editable : false,
			data : fields.yesOrNo
		});
     
        if($.parseJSON('${allTypeTreeNodeData}').length>0){
       	     $.each($.parseJSON('${allTypeTreeNodeData}'),function(i,v){
       	    	  if((i+1)%4==0){
           			var listHtml="<label style='padding:6px;'><input type='checkbox' name='warehouseTypeName' value='"+v.warGoodsTypeId+"'/>&nbsp;&nbsp;"+v.name+"</label ><br/><br/>";
           		  }else{
           			var listHtml="<label style='padding:6px;'><input type='checkbox' name='warehouseTypeName' value='"+v.warGoodsTypeId+"'/>&nbsp;&nbsp;"+v.name+"</label >";
           		  }
           		  $(listHtml).appendTo("#waresort_td");
           	 });    	
          }    
       
        $("input[name='warehouseTypeName'][value='2f1bdfd481cf74f29ebad99e599c22d9'],[value='371044b50dabec3ffe93790226e3b644']").attr("checked","checked");
        
        
        //初始化上级部门
		$("#departmentId").combotree({
			data :$.parseJSON('${allDepTreeNodeData}'),
			width:168,
			panelHeight : 'auto',
		    missingMessage:'请选择上级部门',
		    smooth: true,       //该属性用以启用当前 easyui-tree 控件对平滑数据格式的支持
		    lines : true,
		    editable:false,
		    onBeforeSelect:function(node){
		    	if(node.state){
                     $("#departmentId").combotree("unselect");
                 }
		    },
		    onSelect:function(record){
		    	$.ajax({
		    		type: "post", 
		    		url:ctx + "/do/user/dept.json?depId="+record.id,
		    		dataType:"json",
		    		success: function (date){
		    			   console.info(date);
		    			   $("#warehouseManager").combobox({
		    				 	data:$.parseJSON(date),
		    					valueField:'id',    
		    				    textField:'text',
		    				    panelHeight : 'auto',
		    				    editable:false 
		    			   });
		    			   if($.parseJSON(date).length==0){
		    				   $("#warehouseManager").combobox('setValue', '');
						   }else{
							   if(str==null||str=="")
							        $("#warehouseManager").combobox('select', $.parseJSON(date)[0].id);
						   }
		    			}
		    	});
		        
		    }
		});	
		
</script>
