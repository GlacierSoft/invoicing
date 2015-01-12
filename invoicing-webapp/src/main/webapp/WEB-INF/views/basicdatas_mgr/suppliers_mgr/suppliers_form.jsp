<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="formtable">
		<tr> 
		   <td>编号:</td>
			<td>
				 <input class="easyui-validatebox spinner" name="supplierNumber" readonly="readonly" style="width:168px"  value="${suppliersData.supplierNumber}"/>
		    </td> 
			<td style="padding-left: 16px">供应商名称：</td>
			<td>
				<input type="hidden" name="supplierId" value="${suppliersData.supplierId}" />
				<input name="suppliersName" class="easyui-validatebox spinner" style="width:168px;height: 16px;" required="true" value="${suppliersData.suppliersName}" />
			</td> 
		</tr>
		<tr>
		    <td>预付款余额:</td>
			<td>
				 <input class="easyui-validatebox spinner" name="prepaidBalance" style="width:168px"  value="${suppliersData.prepaidBalance}"/>
		    </td>
		    <td style="padding-left: 16px">供应商类型：</td>
			<td>
				<select id="cc" class="easyui-combobox" name="supplierType" style="width:168px;">   
				    <option value="1">物流公司</option>    
				</select>  
		     </td>
		</tr> 
		
		<tr>
		    <td>公司电话:</td>
			<td>
				 <input class="easyui-validatebox spinner" name="companyPhone" style="width:168px"  value="${suppliersData.companyPhone}"/>
		    </td>
		    <td style="padding-left: 16px">公司传真:</td>
			<td>
				 <input class="easyui-validatebox spinner" name="companyFax" style="width:168px"  value="${suppliersData.companyFax}"/>
		    </td> 
		</tr> 
		<tr>
		    <td>公司网站：</td>
			<td>
				 <input class="easyui-validatebox spinner" name="companyUrls" style="width:168px"  value="${suppliersData.companyUrls}"/>
		    </td>
		    <td style="padding-left: 16px">公司邮箱：</td>
			<td>
				 <input class="easyui-validatebox spinner" name="companyEmail" style="width:168px"  value="${suppliersData.companyEmail}"/>
		    </td>
		
		</tr>
		<tr>
		    <td>省份:</td>
			<td>
				 <input class="easyui-validatebox spinner" name="supplierProvince" style="width:168px"  value="${suppliersData.supplierProvince}"/>
		    </td>
		    <td style="padding-left: 16px">城市：</td>
			<td>
				 <input class="easyui-validatebox spinner" name="city" style="width:168px"  value="${suppliersData.city}"/>
		    </td> 
		</tr> 
		<tr>
		    <td>地址：</td>
			<td>
				 <input class="easyui-validatebox spinner" name="adress" style="width:168px"  value="${suppliersData.adress}"/>
		    </td>
		    <td style="padding-left: 16px">邮编：</td>
			<td>
				 <input class="easyui-validatebox spinner" name="postcode" style="width:168px"  value="${suppliersData.postcode}"/>
		    </td>
		
		</tr>
		<tr>
		    <td>供应商等级：</td>
			<td>
					 <input class="easyui-validatebox spinner" name="gradeId" style="width:168px"  value="${suppliersData.gradeId}"/>
		 
		      <!-- 	<input id="gradeId" name="gradeId"  style="width:180px;height: 20px;"  required="true" class="easyui-combogrid"  />
		 -->   </td>
		    <td style="padding-left: 16px">供应商来源：</td>
			<td>
			<select id="sourceId" class="easyui-combobox" name="sourceId" style="width:168px;">   
				    <option value="1">媒体宣传</option>    
			 </select>  
			<%-- 	 <input class="easyui-validatebox spinner" name="sourceId" style="width:168px"  value="${suppliersData.sourceId}"/> --%>
		    </td>
		
		</tr>
		<tr>
		    <td>公司性质：</td>
			<td>
				 <select id="natureId" class="easyui-combobox" name="natureId" style="width:168px;">   
					    <option value="1">民营企业</option>    
				 </select> 
				 <%-- 	 <input class="easyui-validatebox spinner" name="natureId" style="width:168px"  value="${suppliersData.natureId}"/> --%>
			</td>
		    <td style="padding-left: 16px">公司行业：</td>
			<td>
				<%-- 	 <input class="easyui-validatebox spinner" name="industryId" style="width:168px"  value="${suppliersData.industryId}"/>--%> 
			    <select id="industryId" class="easyui-combobox" name="industryId" style="width:168px;">   
					    <option value="1">食品</option>    
				 </select>  
           </td> 
		</tr>
		<tr>
		    <td>状态：</td> 
		    <td>
			<input id="enabled" name="enabled"  style="width:168px;" value="${suppliersData.enabled}" class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
		     <td style="padding-left: 16px">公司规模：</td>
			<td>
				 <select id="sizeId" class="easyui-combobox" name="sizeId" style="width:168px;">   
					    <option value="1">1-50人</option>    
				 </select> 
		    	<%-- 	 <input class="easyui-validatebox spinner" name="sizeId" style="width:168px"  value="${suppliersData.sizeId}"/> --%>
		    </td> 
		</tr>
		<tr>
		    <td>注册资金：</td>
			<td>
				 <input class="easyui-validatebox spinner" name="registeredCapital" style="width:168px"  value="${suppliersData.registeredCapital}"/>
		    </td>
		    <td style="padding-left: 16px">公司法人：</td>
			<td>
				 <input class="easyui-validatebox spinner" name="companyLegal" style="width:168px"  value="${suppliersData.companyLegal}"/>
		    </td>
		
		</tr>
		<tr>
		    <td>信用等级：</td>
			<td>
			<select class="easyui-combobox"  style="width:168px;">   
				    <option value="1">高</option>    
			 </select> 
				<%--  <input class="easyui-validatebox spinner" name="gradeId" style="width:168px"  value="${suppliersData.gradeId}"/> --%>
		    </td>
		    <td style="padding-left: 16px">开户银行：</td>
			<td>
				 <input class="easyui-validatebox spinner" name="bank" style="width:168px"  value="${suppliersData.bank}"/>
		    </td>
		
		</tr>
		<tr>
		    <td>银行账号：</td>
			<td>
				 <input class="easyui-validatebox spinner" name="bankAccount" style="width:168px"  value="${suppliersData.bankAccount}"/>
		    </td>
		    <td style="padding-left: 16px">税号：</td>
			<td>
				 <input class="easyui-validatebox spinner" name="taxId" style="width:168px"  value="${suppliersData.taxId}"/>
		    </td>
		
		</tr>
		<tr>
		    <td>建立日期：</td>
			<td>
			<input name="supplierDate"  class="easyui-datetimebox"
						style="width: 168px;" value="${suppliersData.supplierDate}" /> 
			<%-- 	 <input class="easyui-validatebox spinner" name="" style="width:168px"  value="${suppliersData.supplierDate}"/>
		  --%>   </td>
		    <td style="padding-left: 16px">上级供应商：</td>
			<td>
				 <input class="easyui-validatebox spinner" name="supplierType" style="width:168px"  value="${suppliersData.supplierType}"/>
		    </td> 
		</tr>
		<tr>
		   
			<td>主营业务：</td>
			<td colspan="3">
		 		 <input class="easyui-validatebox spinner" name="mainBusiness" style="width:430px"  value="${suppliersData.mainBusiness}"/>
		   </td>
			</tr>
			<tr> 
		    <td>备注:</td>
			<td colspan="3">
			<textarea rows="2" cols="66" name="remark" style="margin-top: 20px">${suppliersData.remark}</textarea>
		<%-- 		 <input class="easyui-validatebox spinner" name="remark" style="width:430px"  value="${suppliersData.remark}"/> --%>
		    </td> 
		</tr>  
	</table>
</form>  