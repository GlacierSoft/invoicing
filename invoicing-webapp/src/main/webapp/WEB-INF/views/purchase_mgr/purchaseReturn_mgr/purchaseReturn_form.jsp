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

<SCRIPT>
       
</script>  