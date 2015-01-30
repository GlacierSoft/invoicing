<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>联系人名称：</td>
			<td>
				<input type="hidden" name="supplierContactId" value="${suppliersContactDate.supplierContactId}" />
				<input name="name"  class="spinner" style="width:168px;" required="true" value="${suppliersContactDate.name}" readonly="readonly"/>
			</td>
			<td style="padding-left: 15px">联系人类型：</td>
			<td><input name="contactTypeName"  class="spinner"style="width:168px;" value="${suppliersContactDate.contactTypeName}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>所属供应商：</td>
			<td><input name="supplierName"  class="spinner"style="width:168px;" value="${suppliersContactDate.supplierName}" readonly="readonly"/></td>
			<td style="padding-left: 15px">性别：</td>
			<td><input id="sex" name="sex" class="spinner" style="width:168px;" value="${suppliersContactDate.sex}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>部门：</td>
			<td><input name="department"  class="spinner"style="width:168px;" value="${suppliersContactDate.department}" readonly="readonly"/></td>
			<td style="padding-left: 15px">职务：</td>
			<td><input name="post"  class="spinner"style="width:168px;" value="${suppliersContactDate.post}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>负责业务：</td>
			<td><input name="responsibleBusiness"  class="spinner"style="width:168px;" value="${suppliersContactDate.responsibleBusiness}" readonly="readonly"/></td>
			<td style="padding-left: 15px">工作电话：</td>
			<td><input name="workPhone"  class="spinner"style="width:168px;" value="${suppliersContactDate.workPhone}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>移动电话：</td>
			<td><input name="mobileTelephone"  class="spinner"style="width:168px;" value="${suppliersContactDate.mobileTelephone}" readonly="readonly"/></td>
			<td style="padding-left: 15px">传真：</td>
			<td><input name="fax"  class="spinner"style="width:168px;" value="${suppliersContactDate.fax}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>邮箱：</td>
			<td><input name="postcode"  class="spinner"style="width:168px;" value="${suppliersContactDate.postcode}" readonly="readonly"/></td>
			<td style="padding-left: 15px">状态：</td>
			<td><input id="enabled" name="enabled" class="spinner" style="width:168px;" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>家庭电话：</td>
			<td><input name="homePhone"  class="spinner"style="width:168px;" value="${suppliersContactDate.homePhone}" readonly="readonly"/></td>
			<td style="padding-left: 15px">家庭住址：</td>
			<td><input name="homeAdress"  class="spinner"style="width:168px;" value="${suppliersContactDate.homeAdress}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>MSN：</td>
			<td><input name="msn"  class="spinner"style="width:168px;" value="${suppliersContactDate.msn}" readonly="readonly"/></td>
			<td style="padding-left: 15px">QQ：</td>
			<td><input name="qq"  class="spinner"style="width:168px;" value="${suppliersContactDate.qq}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>生日：</td>
			<td><input name="birthday"  class="spinner"style="width:168px;" value="<fmt:formatDate value="${suppliersContactDate.birthday}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
			<td style="padding-left: 15px">爱好：</td>
			<td><input name="hobby"  class="spinner"style="width:168px;" value="${suppliersContactDate.hobby}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建者：</td>
			<td><input class="spinner" style="width:168px" value="${suppliersContactDate.creater}" readonly="readonly"/></td>
			<td style="padding-left: 15px">创建时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${suppliersContactDate.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:168px" value="${suppliersContactDate.updater}" readonly="readonly"/></td>
			<td style="padding-left: 15px">更新时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${suppliersContactDate.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><textarea style="width:430px;" class="spinner" readonly="readonly">${suppliersContactDate.remark}</textarea></td>
		</tr>
	</table>
</form>
<script type="text/javascript"> 
	$('#sex').val(renderGridValue('${suppliersContactDate.sex}',fields.sex)); 
	$('#enabled').val(renderGridValue('${suppliersContactDate.enabled}',fields.status)); 
</script>
