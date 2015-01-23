<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:5px">
	<table class="detailtable"  style="margin-top: 10px;margin-left: 15px;">
		<tr>
			<td style="width:80px;">仓库名称：</td> 
			<td>
				<input class="spinner" style="width:168px;height: 18px;" value="${warehouseDate.warehouseName}"  readonly="readonly"/>
			</td>
			<td style="width:80px;">仓库编号：</td>
			<td><input class="spinner" style="width:168px;height: 18px;"  value="${warehouseDate.warehouseCode}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>仓库地址：</td>
			<td><input class="spinner" style="width:168px;height: 18px;" value="${warehouseDate.address}" readonly="readonly"/></td>
			<td>仓库分类：</td>
			<td><input class="spinner" style="width:168px;height: 18px;" value="${warehouseDate.address}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>所属部门：</td>
			<td><input class="spinner" style="width:168px;height: 18px;"  value="${warehouseDate.depDisplay}" readonly="readonly"/></td>
			<td>仓库管理：</td>
			<td><input class="spinner" style="width:168px;height: 18px;"  value="${warehouseDate.warehouseManagerDisplay}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>负责人员：</td>
			<td><input class="spinner" style="width:168px;height: 18px;" value="${warehouseDate.head}" readonly="readonly"/></td>
			<td>联系电话：</td>
			<td ><input class="spinner" style="width:168px;height: 18px;"  value="${warehouseDate.phone}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:168px;height: 18px;" value="${warehouseDate.creater}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:168px;height: 18px;" value="<fmt:formatDate value="${warehouseDate.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:168px;height: 18px;" value="${warehouseDate.updater}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:168px;height: 18px;" value="<fmt:formatDate value="${warehouseDate.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>  
			<td>备注:</td>
			<td colspan="3">
				 <input class="spinner" style="width:426px"  value="${warehouseDate.remark}" readonly="readonly"/>
		    </td>
		</tr>
		<tr style="height: 120px;">
		  <td>仓库分类：</td>
		  <td colspan="3" id="GoodsWareSort_td">
		     
		  </td>
	    </tr>
	</table>
</form>
<script type="text/javascript">
	
	//仓库状态信息绑定
	$('#enabled').val(renderGridValue('${suppliersGradeDate.enabled}',fields.status));
	
	//仓库货品类型信息绑定
	if($.parseJSON('${warehouseTypeDate}').length>0){
       	     $.each($.parseJSON('${warehouseTypeDate}'),function(i,v){
       	    	  if((i+1)%4==0){
           			var listHtml="<label style='padding:6px;'><input type='checkbox' checked disabled='disabled' name='warehouseTypeName' value='"+v.warGoodsTypeId+"'/>&nbsp;&nbsp;"+v.name+"</label ><br/><br/>";
           		  }else{
           			var listHtml="<label style='padding:6px;'><input type='checkbox' checked disabled='disabled' name='warehouseTypeName' value='"+v.warGoodsTypeId+"'/>&nbsp;&nbsp;"+v.name+"</label >";
           		  }
           		  $(listHtml).appendTo("#GoodsWareSort_td");
           	 });    	
          }    
	
	
</script>
