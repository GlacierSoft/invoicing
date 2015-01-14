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
				<input name="suppliersName" class="easyui-validatebox spinner" style="width:168px;height: 16px;"   required="true" value="${suppliersData.suppliersName}" />
			</td> 
		</tr>
		<tr>
		    <td>预付款余额:</td>
			<td>
				 <input class="easyui-validatebox spinner" name="prepaidBalance"
			 	validType="customReg['^[0-9]','预付款余额只能输入整数以及保留小数位']"  style="width:168px"  value="${suppliersData.prepaidBalance}"/>
		    </td>
		    <td style="padding-left: 16px">供应商类型：</td>
			<td> 
			   <input id="suppliers_mgr_suppliers_form_typeId" name="typeId" value="${suppliersData.suppliersTypeName}">  
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
		    <td>供应商级别：</td>
			<td>
				<input id="suppliers_mgr_suppliers_form_supplierLevel" name="supplierLevel"  value="${suppliersData.suppliersGradeName}"/>
		     </td>
		    <td style="padding-left: 16px">供应商来源：</td>
			<td>
				 <input id="suppliers_mgr_suppliers_form_sourceId" name="sourceId" value="${suppliersData.suppliersSourceName}">  
		     </td>
		
		</tr>
		<tr>
		    <td>公司性质：</td>
			<td>
				  <input id="suppliers_mgr_suppliers_form_natureId" name="natureId" value="${suppliersData.suppliersNatureName}"> 
			 </td>
		    <td style="padding-left: 16px">行业：</td>
			<td> 
			     <input id="suppliers_mgr_suppliers_form_industryId" name="industryId" value="${suppliersData.suppliersIndustryeName}"> 
           </td> 
		</tr>
		<tr>
		    <td>状态：</td> 
		    <td>
			   <input id="enabled" name="enabled"  style="width:168px;" value="${suppliersData.enabled}" class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
		     <td style="padding-left: 16px">公司规模：</td>
			<td>
				 <input  id="suppliers_mgr_suppliers_form_sizeId" name="sizeId" value="${suppliersData.suppliersPanySizeName}"> 
         
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
				<select class="easyui-combobox" name="gradeId"  style="width:168px;" value="${suppliersData.gradeId}">   
					    <option value="高">高</option>    
					    <option value="中">中</option>    
					    <option value="低">低</option>    
				 </select> 
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
			   <input name="supplierDate"  class="easyui-datetimebox" style="width: 168px;" value="${suppliersData.supplierDate}" /> 
		    </td>
		    <td style="padding-left: 16px">上级供应商：</td>
			<td>
				<input id="suppliers_mgr_suppliers_form_supplierType" value="${suppliersData.suppliersUpName}" style="width: 168px;" name="supplierType"  class="easyui-combogrid"  />
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
<script type="text/javascript">

//初始化供应商类型下拉项
$("#suppliers_mgr_suppliers_form_typeId").combobox({
	data : $.parseJSON('${suppliersType}'),//controller传来的数据源
	height:18,
	width:168,
    required:true,
    editable : false,
    missingMessage:'请选择供应商类型',
	textField : 'typeName',//这里为名称
	valueField: 'typeId'//这里为Id
});

//初始化供应商来源下拉项
$("#suppliers_mgr_suppliers_form_sourceId").combobox({
	data : $.parseJSON('${suppliersSource}'),//controller传来的数据源
	height:18,
	width:168,
    required:true,
    editable : false,
    missingMessage:'请选择供应商来源',
	textField : 'sourceName',//这里为名称
	valueField: 'sourceId'//这里为Id
});

//初始化公司性质下拉项
$("#suppliers_mgr_suppliers_form_natureId").combobox({
	data : $.parseJSON('${comNature}'),//controller传来的数据源
	height:18,
	width:168,
    required:true,
    editable : false,
    missingMessage:'请选择公司性质',
	textField : 'natureName',//这里为名称
	valueField: 'natureId'//这里为Id
});

//初始化行业下拉项
$("#suppliers_mgr_suppliers_form_industryId").combobox({
	data : $.parseJSON('${comIndustry}'),//controller传来的数据源
	height:18,
	width:168,
    required:true,
    editable : false,
    missingMessage:'请选择行业',
	textField : 'industryName',//这里为名称
	valueField: 'industryId'//这里为Id
});

//初始化公司规模下拉项
$("#suppliers_mgr_suppliers_form_sizeId").combobox({
	data : $.parseJSON('${companySize}'),//controller传来的数据源
	height:18,
	width:168,
    required:true,
    editable : false,
    missingMessage:'请选择公司规模',
	textField : 'companySizeName',//这里为名称
	valueField: 'companySizeId'//这里为Id
});

//初始化供应商级别下拉项
$("#suppliers_mgr_suppliers_form_supplierLevel").combobox({
	data : $.parseJSON('${suppliersGrade}'),//controller传来的数据源
	height:18,
	width:168,
    required:true,
    editable : false,
    missingMessage:'请选择供应商级别',
	textField : 'gradeName',//这里为名称
	valueField: 'gradeId'//这里为Id
});

//用于combogrid的上级供应商信息绑定
 $('#suppliers_mgr_suppliers_form_supplierType').combogrid({
	panelWidth:570,
	fit:true,//控件自动resize占满窗口大小
	//iconCls:'icon-save',//图标样式
	border:false,//是否存在边框
	fitColumns:true,//自动填充行
	nowrap: true,//禁止单元格中的文字自动换行
	autoRowHeight: false,//禁止设置自动行高以适应内容
	striped: true,//true就是把行条纹化。（即奇偶行使用不同背景色）
	singleSelect:true,//限制单选
	checkOnSelect:false,//选择复选框的时候选择该行
	selectOnCheck:false,//选择的时候复选框打勾
    idField:'supplierId',    
    textField:'suppliersName',    
    url: ctx + '/do/suppliers/list.json',
    sortName: 'createTime',//排序字段名称
	sortOrder: 'desc',//升序还是降序
	remoteSort: true,//开启远程排序，默认为false
    columns : [ [ 
     			{
    				field:'supplierId',
    				title:'ID',
    				checkbox:true
    			},{
    				field:'supplierNumber',
    				title:'编号',
    				width:120,
    				sortable:true
    			},{
    				field:'suppliersName',
    				title:'名称',
    				width:120,
    				sortable:true
    			},{
    				field:'suppliersTypeName',
    				title:'供应商类型',
    				width:200,
    				sortable:true
    			},{
    				field:'companyPhone',
    				title:'联系电话',
    				width:200,
    				sortable:true
    			},{
    				field:'adress',
    				title:'地址',
    				width:200,
    				sortable:true
    			}
		 ] ],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pageSize : 10,//注意，pageSize必须在pageList存在
		pageList : [2,10,50,100],//从session中获取
		rownumbers : true,//True 就会显示行号的列
	loadMsg : '数据加载中....',  
}); 
</script>