<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
	   <tr>
		    <td>编号:</td>
			<td>
				 <input class="spinner" style="width:168px"  value="${suppliersData.supplierNumber}" readonly="readonly"/>
		    </td>
		    <td style="padding-left: 16px">名称：</td> 
			<td class="forminputtable" ><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="supplierId" value="${suppliersData.supplierId}" />
				<input class="spinner" style="width:168px"  value="${suppliersData.suppliersName}" readonly="readonly"/>
			</td>
		   
		</tr>
	
		<tr>
			 <td>预付款余额:</td>
			<td>
				 <input class="spinner" style="width:168px"  value="${suppliersData.prepaidBalance}" readonly="readonly"/>
		    </td>
			<td style="padding-left: 16px">类型:</td>
			<td>
				 <input class="spinner" style="width:168px"  value="${suppliersData.suppliersTypeName}" readonly="readonly"/>
		    </td>
		</tr> 
		<tr>
		    <td>省份:</td>
			<td>
				 <input class="spinner" style="width:168px"  value="${suppliersData.supplierProvince}" readonly="readonly"/>
		    </td>
		    <td style="padding-left: 16px">城市:</td>
			<td>
				 <input class="spinner" style="width:168px"  value="${suppliersData.city}" readonly="readonly"/>
		    </td>
		</tr>
		<tr>
		    <td>公司电话:</td>
			<td>
				 <input class="spinner" style="width:168px"  value="${suppliersData.companyPhone}" readonly="readonly"/>
		    </td>
		    <td style="padding-left: 16px">公司传真:</td>
			<td>
				 <input class="spinner" style="width:168px"  value="${suppliersData.companyFax}" readonly="readonly"/>
		    </td>
		</tr>
		<tr>
		    <td>公司网站:</td>
			<td>
				 <input class="spinner" style="width:168px"  value="${suppliersData.companyUrls}" readonly="readonly"/>
		    </td>
		    <td style="padding-left: 16px">公司邮箱:</td>
			<td>
				 <input class="spinner" style="width:168px"  value="${suppliersData.companyEmail}" readonly="readonly"/>
		    </td>
		</tr>
		<tr>
		    <td>地址:</td>
			<td>
				 <input class="spinner" style="width:168px"  value="${suppliersData.adress}" readonly="readonly"/>
		    </td>
		    <td style="padding-left: 16px">邮编:</td>
			<td>
				 <input class="spinner" style="width:168px"  value="${suppliersData.postcode}" readonly="readonly"/>
		    </td>
		</tr>
		<tr>
		    <td>供应商级别:</td>
			<td>
				 <input class="spinner" style="width:168px"  value="${suppliersData.suppliersGradeName}" readonly="readonly"/>
		    </td>
		    <td style="padding-left: 16px">供应商来源:</td>
			<td>
				 <input class="spinner" style="width:168px"  value="${suppliersData.suppliersSourceName}" readonly="readonly"/>
		    </td>
		</tr>
		<tr>
		    <td>公司性质:</td>
			<td>
				 <input class="spinner" style="width:168px"  value="${suppliersData.suppliersNatureName}" readonly="readonly"/>
		    </td>
		    <td style="padding-left: 16px">公司行业:</td>
			<td>
				 <input class="spinner" style="width:168px"  value="${suppliersData.suppliersIndustryeName}" readonly="readonly"/>
		    </td>
		</tr><tr>
		    <td>主营业务:</td>
			<td>
				 <input class="spinner" style="width:168px"  value="${suppliersData.mainBusiness}" readonly="readonly"/>
		    </td>
		    <td style="padding-left: 16px">公司规模:</td>
			<td>
				 <input class="spinner" style="width:168px"  value="${suppliersData.suppliersPanySizeName}" readonly="readonly"/>
		    </td>
		</tr>
		<tr>
		    <td>注册资金:</td>
			<td>
				 <input class="spinner" style="width:168px"  value="${suppliersData.registeredCapital}" readonly="readonly"/>
		    </td>
		    <td style="padding-left: 16px">公司法人:</td>
			<td>
				 <input class="spinner" style="width:168px"  value="${suppliersData.companyLegal}" readonly="readonly"/>
		    </td>
		</tr>
		<tr>
		    <td>信用等级:</td>
			<td>
				 <input class="spinner" style="width:168px"  value="${suppliersData.gradeId}" readonly="readonly"/>
		    </td>
		    <td style="padding-left: 16px">开户银行:</td>
			<td>
				 <input class="spinner" style="width:168px"  value="${suppliersData.bank}" readonly="readonly"/>
		    </td>
		</tr>
		<tr>
		    <td>银行账号:</td>
			<td>
				 <input class="spinner" style="width:168px"  value="${suppliersData.bankAccount}" readonly="readonly"/>
		    </td>
		    <td style="padding-left: 16px">税号:</td>
			<td>
				 <input class="spinner" style="width:168px"  value="${suppliersData.taxId}" readonly="readonly"/>
		    </td>
		</tr>
		<tr>
		    <td>建立日期:</td>
			<td>
				 <input class="spinner" style="width:168px"  value="<fmt:formatDate value="${suppliersData.supplierDate}" pattern="yyyy-MM-dd"/>" readonly="readonly"/>
		    </td>
		    <td style="padding-left: 16px">上级供应商:</td>
			<td>
				 <input class="spinner" style="width:168px"  value="${suppliersData.suppliersUpName}" readonly="readonly"/>
		    </td>
		</tr>
		<tr> 
		    <td>状态：</td>
			<td><input id="status" class="spinner" style="width:168px" value="${suppliersData.enabled}" ></td>
			<td style="padding-left: 16px">开业年份:</td>
			<td>
				 <input class="spinner" style="width:168px"  value="${suppliersData.openedYear}" readonly="readonly"/>
		    </td>
		</tr>
		<tr>  
			<td>备注:</td>
			<td colspan="3">
				 <input class="spinner" style="width:426px"  value="${suppliersData.remark}" readonly="readonly"/>
		    </td>
		</tr>
		
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:168px" value="${suppliersData.creater}" readonly="readonly"/></td>
			<td style="padding-left: 16px">创建时间：</td>  
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${suppliersData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:168px" value="${suppliersData.updater}" readonly="readonly"/></td>
			<td style="padding-left: 16px">更新时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${suppliersData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr> 
	</table>
</form>
<script type="text/javascript"> 
	$('#status').val(renderGridValue('${suppliersData.enabled}',fields.status)); 
</script>
