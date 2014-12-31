<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %><!-- 引入自定义权限标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%><!-- 引入国际化标签 -->
<%    
String path = request.getContextPath();    
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";    
%>
<!DOCTYPE HTML>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>越海物流系统</title>
		<!-- 引入公用的js和样式库 -->
		<jsp:include page="inc.jsp"/>
		<script type="text/javascript" src="<%=basePath %>resources/highcharts/highstock.js"></script>
        <script type="text/javascript" src="<%=basePath %>resources/highcharts/exporting.js"></script>
        <script type="text/javascript" src="<%=basePath %>resources/js/lodop/LodopFuncs.js"></script>
        
        <script type="text/javascript" charset="utf-8">
			$(function(){
				
				var userInfoDetailStr = '<table class="formtable" style="font-weight: bold;">'+
											'<tr><td>上次登录时间：</td><td><span class="label label-warning"><fmt:formatDate value="${currentUser.lastLoginTime}" pattern="yyyy-MM-dd HH:mm:ss"/></span></td></tr>'+
											'<tr><td>上次登录IP：</td><td><span class="label label-warning">${currentUser.lastLoginIpAddress}<span></td></tr>'+
											'<tr><td>登录次数：</td><td><span class="label label-success">${currentUser.loginCount}</span></td></tr>'+
										'</table>';
				//用户登录信息显示
				$('.user').tooltip({
				    content: userInfoDetailStr,
				    showDelay:50
				});
				
				//初始化导航
				$('#layout_west_tree').tree({
					url : ctx +'/do/auth/getPrincipalUserMenu.json',
					smooth: true,       //该属性用以启用当前 easyui-tree 控件对平滑数据格式的支持
					lines : true,
					onLoadSuccess : function(node) {
						$('#layout_west_tree').tree('collapseAll');
					},
					onClick : function(node) {
						var url = node.attributes.url;
						if (url && url!='') {//获取树节点中自定义属性的url属性
							$("#layout_center_panel").panel("setTitle",node.text);
							$('#layout_center_panel').panel('refresh',ctx + url);
						}
					}
				});
				
				//全屏切换
				$("#btnFullScreen").click(function (){
		            if ($.util.supportsFullScreen) {
		                if ($.util.isFullScreen()) {
		                    $.util.cancelFullScreen();
		                } else {
		                    $.util.requestFullScreen();
		                }
		            } else {
		                $.easyui.messager.show("当前浏览器不支持全屏 API，请更换至最新的 Chrome/Firefox/Safari 浏览器或通过 F11 快捷键进行操作。");
		            }
		        });
				
				//用户注销
				$("#logout").click(function (){
					$.messager.confirm('请确认', '安全退出系统？', function(r){
						if (r){
							window.location.href = ctx + '/do/login.htm';
						}
					});
				});
				
				//主页
				$("#home").click(function (){
					//$("#layout_center_panel").panel("setTitle",'主页');
					//$('#layout_center_panel').panel('refresh',url);
					window.location.href = ctx + '/do/index.htm';
				});
				
				checkAuth = function(){
					
				};
			});
			
			//修改用户密码方法  
			function userModifyPsd(){
	      		$('#modifyPsdPanel').show().dialog({
	      			width : 300,
	      			height : 220,
	      			modal : true,
	      			resizable: false,
	      			title : '修改密码',
	      			buttons : [ 
	      				 {
	      					text : '保存',
	      					iconCls : 'icon-ok',
	      					handler : function() {
	      						$('#modifyPsdFrom').form('submit', {
	      							url: ctx + '/do/user/modifyPsd.json',
	      							dataType:'json',
	     						   success: function(r){
	     							   if(r.success){
	     								   $.messager.show({
	     										title:'提示',
	     										timeout:3000,
	     										msg:r.msg
	     									});
	     								  $('#modifyPsdPanel').dialog('close');//密码修改成功后关闭窗口
	     							   }else{
	     								   $.messager.show({
	     										title:'提示',
	     										timeout:3000,
	     										msg:r.msg,
	     										icon:'error'
	     									});
	     							   }
	     						   }
	      						});
	      					}
	      				} , {
	      					text : '取消',
	      					iconCls : 'icon-cancel',
	      					handler : function() {
	      						$('#modifyPsdPanel').dialog('close');
	      					}
	      			}]
	      		});
	      	}; 
	      	
	      	
	      	//数据还原
	      	function doBackUp(){
	      		$.messager.confirm('警告','您确认想要还原数据吗？',function(r){    
	      			 if (r){
	      				 $("#ajaxLoading").show();
	      				 $.ajax({
		      		    	 type:"post",
		           		     url:ctx + '/do/res/dataBcakUp.json',
		           		     dataType:"json",
		           		     success:function(data){
		           		    	$("#ajaxLoading").hide();
		           		        if(data[0].data){
		           		          $.messager.show({
 										title:'提示',
 										timeout:3000,
 										msg:"数据还原成功，请刷新操作！！"
 									});
		           		         }else{
		           		        	$.messager.show({
 										title:'提示',
 										timeout:3000,
 										msg:"数据还原失败，请联系管理员！！"
 									});
		           		         }
		           		         
		           		     }
		      		       });
		      		    }    
	      		});  
	      	}
	      	
	      	//动态时钟显示
	      	function disptime()
	      	{
	      	var time= new Date(); 
	      	var year = time.getFullYear(); //得到当前时间的年份
	      	var month =formatDate(time.getMonth() + 1);
	      	var day1 = formatDate(time.getDate());
	      	var hour=formatDate(time.getHours());
	      	var minute=formatDate(time.getMinutes()); 
	      	var second=formatDate(time.getSeconds()); 
	        var day;
	        switch (time.getDay()){
	         case 0:day="日";
	           break;
	         case 1:day="一";
	           break;
	         case 2:day="二";
	           break;
	         case 3:day="三";
	           break;
	         case 4:day="四";
	           break;
	         case 5:day="五";
	           break;
	         case 6:day="六";
	           break;
	        }
	        
	      	document.getElementById("time").value="星期"+day+"  "+year+"-"+month+"-"+day1+"  "+hour+":"+minute+":"+second+"";
	      	var myTime=setTimeout("disptime()",1000);
	      	}
	      	
	      	function formatDate(val){
	    		var valFormate = val;
	    		if(valFormate<10){
	    			valFormate = "0"+valFormate;
	    		}
	    		return valFormate;
	       } 
		</script>
	</head>
	<body  onload="disptime()">
	    <div id="ajaxLoading" style="width: 100%;height: 100%;top: 0;left: 0;position: absolute;z-index: 9999;background:none repeat scroll 0 0 #CCCCCC;opacity: 0.4;filter:alpha(opacity=50);text-align: center;display: none;">
	        <div style="width: 340px;height: 50px;border: 1px solid #86A5AD;background-color: white;margin: 0px auto;margin-top: 26%;">
	            <div style="width:40px;height:30px;border:0px solid gray;float: left;margin-top: 10px;margin-left: 15px;"><img src="<%=basePath %>resources/images/loading.gif" style="vertical-align: center;"></div>                        
	            <div style="width:250px;height:30px;border:0px solid gray;float: left;margin-top: 10px;line-height: 30px;text-align: center;font-weight: bold;">数据正在还原中,其他操作请稍后进行!!!!</div>
	         </div>
	    </div> 
		<div id="index_layout" class="easyui-layout" data-options="fit:true,border:false">
			<div data-options="region:'north',border:false" class="logo">
				<div id="sessionInfoDiv" style="position: absolute; right: 0px; top: 0px;width: 350px" class="login_name">
					<span class="icon-dortmund-user" style="vertical-align: top;display:inline-block;width:16px;height:16px;"></span>
					<a href="javascript:void(0);" class="user" rel="shareit">
						${currentUser.userCnName}
					</a>
					<span class="label label-info" ><input id="time" readonly="readonly" type="text" size="10" style="width: 200px;background-color:transparent;border-style:none;border: 0"/></span>
				</div>
				<div style="position: absolute; right: 0px; bottom: 0px;">
					<a id="home" href="javascript:void(0);" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-dortmund-home'">主页</a> 
					<a id="btnFullScreen" href="javascript:void(0);" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-dortmund-limited-edition'">全屏切换</a> 
					<a href="javascript:void(0);" class="easyui-menubutton" data-options="menu:'#layout_north_pfMenu',iconCls:'icon-dortmund-delicious'">更换皮肤</a> 
					<a href="javascript:void(0);" class="easyui-menubutton" data-options="menu:'#layout_north_kzmbMenu',iconCls:'icon-dortmund-settings'">控制面板</a> 
					<a id="logout" href="javascript:void(0);" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-dortmund-logout'">注销</a>
				</div>
				<div id="layout_north_pfMenu" style="width:120px; display: none;">
					<div onclick="changeThemeFun('metro-gray');" title="metro-gray" data-options="iconCls:'icon_custom_gray'">metro-gray</div>
					<div onclick="changeThemeFun('metro-blue');" title="metro-blue" data-options="iconCls:'icon_custom_acquiesce'">metro-blue</div>
					<div onclick="changeThemeFun('metro-green');" title="metro-green" data-options="iconCls:'icon_custom_green'">metro-green</div>
					<div onclick="changeThemeFun('metro-orange');" title="metro-orange" data-options="iconCls:'icon_custom_buff'">metro-orange</div>
					<div onclick="changeThemeFun('metro-red');" title="metro-red" data-options="iconCls:'icon_custom_pink'">metro-red</div>
				</div>
				<div id="layout_north_kzmbMenu" style="width: 100px; display: none;">
					<div onclick="userModifyPsd();" data-options="iconCls:'icon-edit'">修改密码</div>
					<div class="menu-sep"></div>	
					<!-- <div onclick="checkAuth();" data-options="iconCls:'icon-dortmund-customers'">查看权限</div> -->
					<div class="menu-sep"></div>
					<div onclick="doBackUp();" data-options="iconCls:'icon-dortmund-customers'" title="还原数据为前一天数据!!">数据还原</div>
				</div>
			</div>
			<div data-options="region:'west',split:true" style="width:160px;overflow:hidden;">
				<div class="easyui-panel" title="导航" data-options="fit:true,border:false,iconCls:'icon-dortmund-world',tools : [{
								iconCls : 'icon-dortmund-communication',
								handler : function() {
									$('#layout_west_tree').tree('reload');
								}
							}, {
								iconCls : 'icon-dortmund-upcoming-work',
								handler : function() {
									var node = $('#layout_west_tree').tree('getSelected');
									if (node) {
										$('#layout_west_tree').tree('expandAll', node.target);
									} else {
										$('#layout_west_tree').tree('expandAll');
									}
								}
							}, {
								iconCls : 'icon-dortmund-sign-up',
								handler : function() {
									var node = $('#layout_west_tree').tree('getSelected');
									if (node) {
										$('#layout_west_tree').tree('collapseAll', node.target);
									} else {
										$('#layout_west_tree').tree('collapseAll');
									}
								}
							}]">
					<ul id="layout_west_tree"></ul>
				</div>
			</div>
			<div data-options="region:'center'"  >
				<div id="layout_center_panel" style="OVERFLOW-Y: auto; OVERFLOW-X:hidden; height: 1000px "  class="easyui-panel" title="主页" data-options="fit:true,border:false,region:'center',href:'index/center.htm'" style="padding:5px;overflow: hidden;"></div>
			</div>
		</div>
		
		<!--密码修改弹出框  -->
		<div id="modifyPsdPanel" style="display:none;">
			<form id="modifyPsdFrom" method="post">
				<table  cellpadding="3" cellspacing="0" style="padding-top:10px;padding-left:5px;">
					<tr>
						<td>原密码：</td>
						<td>
							<input name="oldPassword" type="password" class="easyui-validatebox"  required="true" style="width: 150px;"/>
						</td>
					</tr>
					<tr>
						<td>新密码：</td>
						<td>
							<input id="newPassword" name="newPassword" type="password" class="easyui-validatebox"  required="true" style="width: 150px;"/>
						</td>
					</tr>
					<tr>
						<td>确认新密码：</td>
						<td>
							<input  name="cfPsd" type="password" class="easyui-validatebox"  required="true" style="width: 150px;" validType="eqPwd['#newPassword']"/>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</body>
</html>