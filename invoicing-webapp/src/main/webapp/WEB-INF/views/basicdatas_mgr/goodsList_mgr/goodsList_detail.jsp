<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="member_mgr_member_form" method="post" style="padding:15px;width: 555px">
<div title="基本信息" style="padding:15px">
    	<fieldset id="user_mgr_user_form_userGenfieldset" style="padding:10px;" class="spinner">
			<legend>会员基本信息</legend>  
			<table  class="detailtable"> 
				    <tr> 
				        <td>会员名称：</td>
						<td>
							<input type="hidden" id="member_mgr_member_form_memberId" name="memberId" value="${shipperMemberData.memberId}" />
							<input id="member_mgr_member_form_memberName" name="memberName" class="spinner" style="width:168px" value="${shipperMemberData.memberName}"  readonly="readonly"/>
						</td>
						<td style="padding-left:10px;">注册时间：</td>
						<td ><input id="member_mgr_member_form_registrationTime" name="registrationTime" class="spinner" style="width:168px;" value="<fmt:formatDate value="${shipperMemberData.registrationTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
					</tr> 
					<tr>
					    <td>会员类型：</td>
						<td><input id="member_mgr_member_form_memberType" name="memberType" class="spinner" style="width:168px" value='${shipperMemberData.memberType}' readonly="readonly"/></td>
					    <td style="padding-left:10px;">会员状态：</td>
						<td><input id="member_mgr_member_form_status" name="status" class="spinner" style="width:168px" value="${shipperMemberData.status}" readonly="readonly"/></td>
					 </tr>
					 <tr>
						<td>会员积分：</td>
						<td><input id="member_mgr_member_form_integral" name="integral" class="spinner" style="width:168px" value="<fmt:formatNumber value='${shipperMemberData.integral}' pattern="#,#00.00"/>" readonly="readonly"/></td>
					    <td style="padding-left:10px;">账户余额：</td>
					    <td><input id="member_mgr_member_form_accountBalance" name="accountBalance" class="spinner" style="width:168px" value="<fmt:formatNumber value='${shipperMemberData.accountBalance}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
				 	</tr>
					 <tr>
						<td>上次登录ip：</td>
						<td><input class="spinner" style="width:168px" value="${shipperMemberData.lastLoginIpAddress}"  readonly="readonly"/></td>
						<td style="padding-left:10px;">上次登录时间：</td>
						<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${shipperMemberData.lastLoginTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
					</tr>
					<tr>
						<td>登录次数：</td>
						<td ><input name="loginCount" class="spinner" style="width:168px" value="${shipperMemberData.loginCount}" readonly="readonly"/></td>
						<td style="padding-left:10px;">地 址：</td>
						<td ><input  name="liveAddress" class="spinner" style="width:168px" value="${shipperMemberData.liveAddress}" readonly="readonly"/></td>
				   </tr> 
					<tr>
				      <td>创建人：</td>
					  <td><input class="spinner" style="width:168px"   value="${shipperMemberData.createrDisplay}" readonly="readonly"/></td>
				      <td style="padding-left:10px;">录入时间：</td>
					  <td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${shipperMemberData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
				    </tr>
				    <tr>   
				     <td>更新人：</td>
					 <td><input class="spinner" style="width:168px"   value="${shipperMemberData.updaterDisplay}" readonly="readonly"/></td>
				     <td style="padding-left:10px;">更新时间：</td>
					 <td><input class="spinner" style="width:168px"  value="<fmt:formatDate value="${shipperMemberData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
				    </tr>
					<tr>
						<td>备 注：</td>
						<td colspan="3"> <textarea   name="remark" class="spinner" style="width:435px;" readonly="readonly" >${shipperMemberData.remark}</textarea></td>
					</tr>
				</table>
		</fieldset>
    </div>
    <div title="详细信息" style="padding:15px">
    	<fieldset id="user_mgr_user_form_connetGenfieldset" style="padding:10px;" class="spinner">
			<legend>个人信息</legend>  
			<table  class="detailtable">
					 <tr>
					    <td>性 别：</td>
						<td><input id="member_mgr_member_form_sex" name="sex" class="spinner" style="width:168px" value='${individualityMemberData.sex}' readonly="readonly"/></td>
					    <td style="padding-left:10px;">年 龄：</td>
						<td><input name="memberAge" class="spinner" style="width:168px" value="${individualityMemberData.memberAge}" readonly="readonly"/></td>
					 </tr>
					  <tr>
					    <td>Q Q：</td>
						<td><input  name="memberQq" class="spinner" style="width:168px" value='${individualityMemberData.memberQq}' readonly="readonly"/></td>
					    <td style="padding-left:10px;">邮 箱：</td>
						<td><input name="email" class="spinner" style="width:168px" value="${shipperMemberData.email}" readonly="readonly"/></td>
					
					  </tr>
					   <tr>
					    <td>真实姓名：</td>
						<td><input  name="memberRealName" class="spinner" style="width:168px" value='${individualityMemberData.memberRealName}' readonly="readonly"/></td>
					    <td style="padding-left:10px;">身份证：</td>
						<td><input name="cardId" class="spinner" style="width:168px" value="${individualityMemberData.cardId}" readonly="readonly"/></td>
					 </tr>
					  <tr>
					    <td>住宅电话：</td>
						<td><input  name="homePhone" class="spinner" style="width:168px" value='${individualityMemberData.homePhone}' readonly="readonly"/></td>
					    <td style="padding-left:10px;">手机号：</td>
						<td><input name="mobileNumber" class="spinner" style="width:168px" value="${individualityMemberData.mobileNumber}" readonly="readonly"/></td>
					 </tr> 
					 <tr>
						<td>详细地址：</td>
						<td colspan="3"> <textarea   name="detailedAddress" class="spinner" style="width:435px;" readonly="readonly" >${individualityMemberData.detailedAddress}</textarea></td>
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
	$('#member_mgr_member_form_status').val(renderGridValue('${shipperMemberData.status}',fields.status));
	$('#member_mgr_member_form_memberType').val(renderGridValue('${shipperMemberData.memberType}',fields.memberType));
	$('#member_mgr_member_form_sex').val(renderGridValue('${individualityMemberData.sex}',fields.sex));
</script>
