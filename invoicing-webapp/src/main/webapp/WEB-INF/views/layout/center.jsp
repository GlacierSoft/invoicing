<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>
<%    
String path = request.getContextPath();    
// 获得本项目的地址(例如: http://localhost:8080/MyApp/)赋值给basePath变量    
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";    
// 将 "项目路径basePath" 放入pageContext中，待以后用EL表达式读出。    
pageContext.setAttribute("basePath",basePath);    
%> 

<script type="text/javascript">

//panel切换
function  doClick(str,url){
    $("#layout_center_panel").panel("setTitle",str);
	$('#layout_center_panel').panel('refresh',ctx +url);
}
	
</script>
<div style="margin:10px 10px 40px 20px;">
	<div id="newsDataGridPanel" class="easyui-panel" title="提醒管理"    
	        style="width:1000%;height:300px;background:#fafafa; "> 
</div>
