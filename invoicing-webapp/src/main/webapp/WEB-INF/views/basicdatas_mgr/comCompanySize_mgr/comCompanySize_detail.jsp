<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>名称：</td> 
			<td class="forminputtable" colspan="3"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="companySizeId" value="${companySizeData.companySizeId}" />
				<input class="spinner" style="width:410px"  value="${companySizeData.companySizeName}" readonly="readonly"/>
			</td>
		</tr> 
		<tr>
			<td>序号：</td>
			<td><input class="spinner" style="width:168px" value="${companySizeData.sequenced}" readonly="readonly"/></td>
		 	<td>状态：</td>
			<td><input id="status" class="spinner" style="width:168px" value="${companySizeData.enabled}" ></td>
	    </tr> 
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:168px" value="${companySizeData.creater}" readonly="readonly"/></td>
			<td>创建时间：</td>  
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${companySizeData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:168px" value="${companySizeData.updater}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${companySizeData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr> 
	</table>
</form>
<script type="text/javascript"> 
	$('#status').val(renderGridValue('${companySizeData.enabled}',fields.status)); 
</script>
