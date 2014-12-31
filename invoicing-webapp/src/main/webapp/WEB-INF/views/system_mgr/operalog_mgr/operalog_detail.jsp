<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>   

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>操作菜单：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="loginlogId" value="${operaLogData.operalogId}" />
				<input class="spinner" style="width:168px"  value="${operaLogData.operaMenu}" readonly="readonly"/>
			</td>
			<td>操作面板：</td>
			<td><input class="spinner" style="width:168px" value="${operaLogData.operaPenal}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>操作方法：</td>
			<td><input class="spinner" style="width:168px"  value="${operaLogData.operaMethod}" readonly="readonly"/></td>
			<td>操作结果：</td>
			<td><input class="spinner" style="width:168px"  value="${operaLogData.operaResult}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>返回内容：</td>
			<td><input id="returnResult" value="${operaLogData.operaDesc}"  class="spinner" style="width:168px"  readonly="readonly"/></td>
			<td>调用类：</td>
			<td><input value="${operaLogData.operaClass}" class="spinner" style="width:168px"  readonly="readonly"/></td>
		</tr>
		<tr>
			<td>调用方法：</td>
			<td><input value="${operaLogData.operaMd}" class="spinner" style="width:168px"  readonly="readonly"/></td>
			<td>操作面板：</td>
			<td><input value="${operaLogData.operaPenal}" class="spinner" style="width:168px"  readonly="readonly"/></td>
		</tr>
		<tr>
			<td>操作人：</td>
			<td><input value="${operaLogData.operator}" class="spinner" style="width:168px"  readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${operaLogData.operaTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
	</table>
</form>
<script> 
        $(function(){
        	  var str="${operaLogData.operaDesc}";
        	  var reg=new RegExp("<font style='color:red;font-weight: bold;'>","g");//创建正则RegExp对象
        	  var reg_two=new RegExp("</font>","g");//创建正则RegExp对象
        	  var newstr=str.replace(reg,"").replace(reg_two,""); //执行样式替换
        	  $("#returnResult").val(newstr);
        });
</script>

