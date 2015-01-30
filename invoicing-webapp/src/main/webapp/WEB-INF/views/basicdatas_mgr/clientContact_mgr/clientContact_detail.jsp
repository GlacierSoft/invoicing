<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<td>联系人名称：</td>
			<td>
				<input type="hidden" name="clientContactId" value="${clientContactDate.clientContactId}" />
				<input name="name"  class="spinner" style="width:168px;" required="true" value="${clientContactDate.name}" readonly="readonly"/>
			</td>
			<td style="padding-left: 15px">联系人类型：</td>
			<td><input name="contactTypeName" class="spinner"style="width:168px;" value="${clientContactDate.contactTypeName}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>所属客户：</td>
			<td><input name="clientName" class="spinner"style="width:168px;" value="${clientContactDate.clientName}" readonly="readonly"/></td>
			<td style="padding-left:15px;">性别：</td>
			<td><input id="sex" name="sex" class="spinner" style="width:170px;" value="${clientContactDate.sex}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>部门：</td>
			<td><input name="department"  class="spinner"style="width:168px;" value="${clientContactDate.department}" readonly="readonly"/></td>
			<td style="padding-left: 15px">职务：</td>
			<td><input name="post"  class="spinner"style="width:168px;" value="${clientContactDate.post}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>负责业务：</td>
			<td><input name="business"  class="spinner"style="width:168px;" value="${clientContactDate.business}" readonly="readonly"/></td>
			<td style="padding-left: 15px">工作电话：</td>
			<td><input name="workPhone"  class="spinner"style="width:168px;" value="${clientContactDate.workPhone}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>移动电话：</td>
			<td><input name="mobilephone"  class="spinner"style="width:168px;" value="${clientContactDate.mobilephone}" readonly="readonly"/></td>
			<td style="padding-left: 15px">传真：</td>
			<td><input name="fox"  class="spinner"style="width:168px;" value="${clientContactDate.fox}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>邮箱：</td>
			<td><input name="email"  class="spinner"style="width:168px;" value="${clientContactDate.email}" readonly="readonly"/></td>
			<td style="padding-left: 15px">状态：</td>
			<td><input id="status" name="status" class="spinner" style="width:170px;" value="${clientContactDate.enabled}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>家庭电话：</td>
			<td><input name="homePhone"  class="spinner"style="width:168px;" value="${clientContactDate.homePhone}" readonly="readonly"/></td>
			<td style="padding-left: 15px">家庭住址：</td>
			<td><input name="adrress"  class="spinner"style="width:168px;" value="${clientContactDate.adrress}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>MSN/QQ：</td>
			<td><input name="communications"  class="spinner"style="width:168px;" value="${clientContactDate.communications}" readonly="readonly"/></td>
			<td style="padding-left: 15px">序号：</td>
			<td><input maxlength="3" name="number" class="spinner"style="width:168px;" value="${clientContactDate.number}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>生日：</td>
			<td><input name="birthday" class="spinner" style="width:168px;" value="<fmt:formatDate value="${clientContactDate.birthday}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly" /></td>
			<td style="padding-left: 15px">爱好：</td>
			<td><input name="hobby"  class="spinner"style="width:168px;" value="${clientContactDate.hobby}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建者：</td>
			<td><input class="spinner" style="width:168px" value="${clientContactDate.creater}" readonly="readonly"/></td>
			<td style="padding-left: 15px">创建时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${clientContactDate.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:168px" value="${clientContactDate.updater}" readonly="readonly"/></td>
			<td style="padding-left: 15px">更新时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${clientContactDate.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><textarea style="width:430px;" class="spinner" readonly="readonly">${clientContactDate.remark}</textarea></td>
		</tr>
	</table>
</form>
<script type="text/javascript"> 
	$('#sex').val(renderGridValue('${clientContactDate.sex}',fields.sex)); 
	$('#status').val(renderGridValue('${clientContactDate.enabled}',fields.status)); 
</script>
