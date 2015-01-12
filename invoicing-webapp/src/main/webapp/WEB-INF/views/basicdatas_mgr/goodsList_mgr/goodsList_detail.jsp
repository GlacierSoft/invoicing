<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="member_mgr_member_form" method="post" style="padding:15px;width: 555px">
<div title="基本信息" style="padding:15px">
    	<fieldset id="user_mgr_user_form_userGenfieldset" style="padding:10px;" class="spinner">
			<legend>货物基本信息</legend>  
			<table  class="detailtable"> 
				    <tr> 
				        <td>货物编号：</td>
						<td >
						    <input type="hidden" id="goodsId" name="goodsId" value="${goodsListDate.goodsId }" /> 
						    <input id="goodsCode" name="goodsCode" class="spinner" style="width:168px;" value="${goodsListDate.goodsCode}" readonly="readonly"/>
						</td>
				        <td style="padding-left:10px;">货品名称：</td>
						<td>
							<input id="goodsName" name="goodsName" class="spinner" style="width:168px" value="${goodsListDate.goodsName }"  readonly="readonly"/>
						</td>
					</tr> 
					<tr> 
					    <td>货品类型：</td>
						<td><input id="goodsTypeId" name="goodsTypeId" class="spinner" style="width:168px" value="${goodsListDate.goodsTypeId }" readonly="readonly"/></td>
					    <td style="padding-left:10px;">所属仓库：</td>
						<td><input id="warehouseTypeId" name="warehouseTypeId" class="spinner" style="width:168px" value="${goodsListDate.warehouseTypeId}" readonly="readonly"/></td>
					 </tr>
					 <tr>
						<td> 仓库类型：</td>
						<td><input id="goodsSortId" name="goodsSortId" class="spinner" style="width:168px" value="${goodsListDate.goodsSortId }" readonly="readonly"/></td>
					    <td style="padding-left:10px;">规格型号：</td>
					    <td><input id="specification" name="specification" class="spinner" style="width:168px" value="${goodsListDate.specification}" readonly="readonly"/></td>
				 	</tr>
				 	<tr>
						<td>货物产地：</td>
						<td ><input name="origin" class="spinner" style="width:168px" value="${goodsListDate.origin}" readonly="readonly"/></td>
						<td style="padding-left:10px;">生产厂家：</td>
						<td ><input  name="manufacturers" class="spinner" style="width:168px" value="${goodsListDate.manufacturers}" readonly="readonly"/></td>
				   </tr> 
				   <tr>
						<td>货物单位：</td>
						<td><input class="spinner" style="width:168px" value="${goodsListDate.unit}"  readonly="readonly"/></td>
						<td style="padding-left:10px;">包装单位：</td>
						<td><input class="spinner" style="width:168px" value="${goodsListDate.bulkUnit}" readonly="readonly"/></td>
					</tr>
					<tr>
				      <td>创建人：</td>
					  <td><input class="spinner" style="width:168px"   value="${goodsListDate.creater}" readonly="readonly"/></td>
				      <td style="padding-left:10px;">录入时间：</td>
					  <td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${goodsListDate.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
				    </tr>
				    <tr>   
				     <td>更新人：</td>
					 <td><input class="spinner" style="width:168px"   value="${goodsListDate.updater}" readonly="readonly"/></td>
				     <td style="padding-left:10px;">更新时间：</td>
					 <td><input class="spinner" style="width:168px"  value="<fmt:formatDate value="${goodsListDate.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
				    </tr>
					<tr>
						<td>备 注：</td>
						<td colspan="3"> <textarea   name="remark" class="spinner" style="width:435px;" readonly="readonly" >${goodsListDate.remark}</textarea></td>
					</tr>
				</table>
		</fieldset>
    </div>
    <div title="详细信息" style="padding:15px">
    	<fieldset id="user_mgr_user_form_connetGenfieldset" style="padding:10px;" class="spinner">
			<legend>货物详细信息</legend>  
			<table  class="detailtable">
					  <tr> 
				        <td style="padding-left:10px;">货物编号：</td>
						<td >
						    <input id="goodsCode" name="goodsCode" class="spinner" style="width:168px;" value="${goodsListDate.goodsCode}" readonly="readonly"/>
						</td>
				        <td style="padding-left:10px;">货品名称：</td>
						<td>
							<input id="goodsName" name="goodsName" class="spinner" style="width:168px" value="${goodsListDate.goodsName }"  readonly="readonly"/>
						</td>
					</tr> 
					 <tr>
					    <td style="padding-left:10px;">货物税率：</td>
						<td ><input name="taxRate" class="spinner" style="width:168px" value="<fmt:formatNumber value='${goodsListDate.taxRate}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					    <td style="padding-left:10px;">参考成本价：</td>
						<td><input id="referenceCost" name="referenceCost" class="spinner" style="width:168px" value="<fmt:formatNumber value='${goodsListDate.referenceCost}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					 </tr>
					  <tr>
					    <td style="padding-left:10px;">参考零售价：</td>
						<td><input  name="referenceRetailPrice" class="spinner" style="width:168px" value="<fmt:formatNumber value='${goodsListDate.referenceRetailPrice}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					    <td style="padding-left:10px;">参考销售价：</td>
						<td><input name="referenceSalesPrice" class="spinner" style="width:168px" value="<fmt:formatNumber value='${goodsListDate.referenceSalesPrice}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					</tr>
					   <tr>
					    <td style="padding-left:10px;">销售价格一：</td>
						<td><input name="salesPrice1" class="spinner" style="width:168px" value="<fmt:formatNumber value='${goodsListDate.salesPrice1}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					    <td style="padding-left:10px;">销售价格二：</td>
						<td><input name="salesPrice2" class="spinner" style="width:168px" value="<fmt:formatNumber value='${goodsListDate.salesPrice2}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					 </tr>
					 <tr>
					 <td style="padding-left:10px;">销售价格三：</td>
						<td><input name="salesPrice3" class="spinner" style="width:168px" value="<fmt:formatNumber value='${goodsListDate.salesPrice3}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					    <td style="padding-left:10px;">销售价格四：</td>
						<td><input name="salesPrice4" class="spinner" style="width:168px" value="<fmt:formatNumber value='${goodsListDate.salesPrice4}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					 </tr>
					 <tr>
					    <td style="padding-left:10px;">销售价格五：</td>
						<td><input name="salesPrice5" class="spinner" style="width:168px" value="<fmt:formatNumber value='${goodsListDate.salesPrice5}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					    <td style="padding-left:10px;">销售价格六：</td>
						<td><input name="salesPrice6" class="spinner" style="width:168px" value="<fmt:formatNumber value='${goodsListDate.salesPrice6}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					 </tr>
					 <tr>
					    <td style="padding-left:10px;">销售价格七：</td>
						<td><input name="salesPrice7" class="spinner" style="width:168px" value="<fmt:formatNumber value='${goodsListDate.salesPrice7}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					    <td style="padding-left:10px;">销售价格八：</td>
						<td><input name="salesPrice8" class="spinner" style="width:168px" value="<fmt:formatNumber value='${goodsListDate.salesPrice8}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					 </tr>
					 <tr>
					 <td style="padding-left:10px;">销售价格九：</td>
						<td><input name="salesPrice9" class="spinner" style="width:168px" value="<fmt:formatNumber value='${goodsListDate.salesPrice9}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					    <td style="padding-left:10px;">销售价格十：</td>
						<td><input name="salesPrice10" class="spinner" style="width:168px" value="<fmt:formatNumber value='${goodsListDate.salesPrice10}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					 </tr>
			</table>
		</fieldset>
    </div>
    <div title="其他信息" style="padding:15px">
    	<fieldset id="user_mgr_user_form_connetGenfieldsetOther" style="padding:10px;" class="spinner">
			<legend>货物其他信息</legend>  
			<table  class="detailtable">
					  <tr> 
				        <td style="padding-left:10px;">货物编号：</td>
						<td >
						    <input id="goodsCode" name="goodsCode" class="spinner" style="width:168px;" value="${goodsListDate.goodsCode}" readonly="readonly"/>
						</td>
				        <td style="padding-left:10px;">货品名称：</td>
						<td>
							<input id="goodsName" name="memberName" class="spinner" style="width:168px" value="${goodsListDate.goodsName }"  readonly="readonly"/>
						</td>
					</tr> 
					<tr>
						<td style="padding-left:10px;">换算比例：</td>
						<td ><input name="packageConRates" class="spinner" style="width:168px" value="${goodsListDate.packageConRates}" readonly="readonly"/></td>
						<td style="padding-left:10px;">计价方式：</td>
						<td ><input  name="pricing" class="spinner" style="width:168px" value="${goodsListDate.pricing}" readonly="readonly"/></td>
				   </tr>
				   <tr>
						<td style="padding-left:10px;">批次管理：</td>
						<td ><input name="batchManagement" class="spinner" style="width:168px" value="${goodsListDate.batchManagement=='yes'?'是':'否'}" readonly="readonly"/></td>
						<td style="padding-left:10px;">有效期管理：</td>
						<td ><input  name="validManagement" class="spinner" style="width:168px" value="${goodsListDate.validManagement=='yes'?'是':'否'}" readonly="readonly"/></td>
				    </tr> 
					<tr>
					    <td style="padding-left:10px;">生产日期：</td>
						<td><input name="warrantyStart" class="spinner" style="width:168px" value="<fmt:formatDate value="${goodsListDate.warrantyStart}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
					    <td style="padding-left:10px;">终止日期：</td>
						<td><input name="warrantyEnd" class="spinner" style="width:168px" value="<fmt:formatDate value='${goodsListDate.warrantyEnd}'  pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
					 </tr>
					 <tr>
					 <td style="padding-left:10px;">负责人：</td>
						<td><input name="attn" class="spinner" style="width:168px" value="${goodsListDate.attn }" readonly="readonly"/></td>
					    <td style="padding-left:10px;">负责部门：</td>
						<td><input name="department" class="spinner" style="width:168px" value="${goodsListDate.department}" readonly="readonly"/></td>
					 </tr>
					 <tr>
					    <td style="padding-left:10px;">是否启用：</td>
						<td><input name="enabled" class="spinner" id="enabled" style="width:168px" value="${ goodsListDate.enabled}" readonly="readonly"/></td>
					    <td style="padding-left:10px;">审核状态：</td>
						<td><input  id="member_mgr_member_form_status" name="auditState" class="spinner" style="width:168px" value="${goodsListDate.auditState }" readonly="readonly"/></td>
					 </tr>
					 <tr>
					    <td style="padding-left:10px;">审核人：</td>
						<td><input name="auditor" class="spinner" style="width:168px" value='${goodsListDate.auditor}' readonly="readonly"/></td>
					    <td style="padding-left:10px;">审核时间：</td>
						<td><input name="auditTime" class="spinner" style="width:168px" value="<fmt:formatDate value='${goodsListDate.auditTime}'  pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
					 </tr>
					 <tr>
					 <tr>
						<td style="padding-left:10px;">备 注：</td>
						<td colspan="3"> <textarea   name="remark" class="spinner" style="width:435px;" readonly="readonly" >${goodsListDate.auditRemark}</textarea></td>
					</tr>
			</table>
		</fieldset>
    </div>  
</form>

<script type="text/javascript">
	$('#member_mgr_member_form').tabs({
		border:true,
		onSelect:function(){
			$("div").remove(".validatebox-tip");//解决关闭窗体偶尔出现验证条bug
		}
	}); 
	
	$('#member_mgr_member_form_status').val(renderGridValue('${goodsListDate.auditState}',fields.auditState));
	$('#enabled').val(renderGridValue('${goodsListDate.enabled}',fields.status));
	
</script>
