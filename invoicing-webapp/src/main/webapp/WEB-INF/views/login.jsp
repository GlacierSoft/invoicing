<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="org.apache.shiro.web.filter.authc.FormAuthenticationFilter"%>
<%@ page import="org.apache.shiro.authc.LockedAccountException"%>
<%@ page import="com.glacier.basic.exception.IncorrectCaptchaException"%>

<!DOCTYPE html>
<html lang="en">
	<head>
		<title>越海物流管理系统</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<!-- 引入网站标识icon -->
		<link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/images/favicon/favicon.ico"></link>
		<link rel="icon" href="${pageContext.request.contextPath}/resources/images/favicon/favicon.ico"></link>
		<!-- Bootstrap -->
		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/js/bootstrap-3.0.3-dist/dist/css/bootstrap.min.css"></link>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/js/bootstrap-switch/bootstrap-switch.min.css"></link>
		<!--[if lt IE 9]>
			<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/ie8.css"></link>
		<![endif]-->
		<style type="text/css">
			body, h1, h2, h3, h4, h5, h6{
			   font-family: 'Microsoft YaHei','SimSun','verdana','tahoma',serif;
			}
			#login_kaptcha_span{
				cursor: pointer;
			}
		</style>
	</head>
	<body>
		<div id="danger_alert" style="width:100%;position: absolute;top:0px;z-index:5000;display: none;">
	      <div class="alert alert-danger fade in">
	        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
	        <h4 style="text-align:center;"></h4>
	      </div>
	    </div>
		<div id="normal_container" class="container">
			<div class="row">
				<div class="col-md-6 hidden-sm hidden-xs">
					<img src="${pageContext.request.contextPath}/resources/images/login.jpg" class="img-responsive" alt="Glacier Soft" />
				</div>
				<div class="col-md-6 col-xs-12">
					<div class="col-lg-12 visible-lg" style="height:120px;">
					</div>
					<div class="page-header">
						<h1>YHGlobal Management System <br><small>&nbsp;&nbsp;越 海 物 流 管 理 系 统</small></h1>
					</div>
					<div class="row">
						<div class="col-md-10 col-xs-12">
							<form id="loginForm" class="form-horizontal" role="form" action="${pageContext.request.contextPath}/do/login.htm" method="post" onsubmit="return validaForm();">
								<div id="userrname_form_group" class="form-group">
									<label for="username" class="control-label col-xs-3 hidden-sm hidden-xs">用户名</label>
									<div class="col-md-9 col-xs-12">
										<input type="text" id="username" name="username" class="form-control input-lg"  placeholder="请输入用户名"  />
									</div>
								</div>
								<div id="password_form_group" class="form-group">
									<label for="password" class="control-label col-xs-3 hidden-sm hidden-xs">密码</label>
									<div class="col-md-9 col-xs-12">
										<input type="password" id="password" name="password" class="form-control input-lg"  placeholder="密码" />
									</div>
								</div>
								
								<div id="captcha_form_group" class="form-group">
									 
									<div class="col-md-6 col-md-offset-3 col-xs-9">
										<div class="input-group">
											<span id="login_kaptcha_span" class="input-group-addon">
												<div style="width:110px;height:32px;">
													<img class="img-responsive" id="login_kaptcha" src="${pageContext.request.contextPath}/resources/images/kaptcha.jpg" />
												</div>
											</span>
											<input type="text" id="captcha" name="captcha" maxlength="4" class="form-control input-lg">
										</div>
									</div>
									
									<label for="submit" class="control-label col-xs-3 hidden-sm hidden-xs"></label>
									<div class="col-md-3 col-xs-12" style="float: right">
										<button id="login_submit" class="btn btn-primary btn-lg btn-block">登录</button>
									</div>
								</div>
								<!--  屏蔽rememberMe功能，防止获取用户登录信息出错
								<div class="form-group">
									<label for="rememberMe" class="control-label col-xs-3 hidden-sm hidden-xs">记住我</label>
										<div class="col-md-9 col-xs-12">
										<input id="rememberMe" name="rememberMe" type="checkbox" data-on="primary" data-off="danger"  data-on-label="开启" data-off-label="关闭"/>
									</div>
								</div>
								-->
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
		
		<div id="abnormal" style="display:none;" class="holder">
			<div class="holder_wapper">
				<div class="holder_header">
					<a>尊敬的用户：您现在使用的IE版本过低!</a>
				</div>
				<div class="holder_ul">
					<p>如果继续用该浏览器访问，可能会发生以下情况：</p>
					<ul>
						<li>当前脚本出现运行错误，是否纠正错误</li>
						<li>页面显示错误，反人类设计榜首</li>
						<li>Microsoft Internet Explorer 遇到问题需要关闭...</li>
						<li>Microsoft Internet Explorer 无法响应【卡屏】</li>
						<li>......</li>
					</ul>
					<p>90% 的使用者向我们表明：IE9版本以下的浏览器属于反人类体验浏览器，推荐使用：</p>
				</div>	
				<div class="holder_ul">
					<ul>
						<li>谷歌浏览器：<a href="https://www.google.com/intl/zh-CN/chrome/browser/" target="_blank">下载</a></li>
						<li>360急速浏览器：<a href="http://chrome.360.cn/" target="_blank">下载</a></li>
						<li>搜狗浏览器：<a href="http://ie.sogou.com/" target="_blank">下载</a></li>
						<li>百度浏览器：<a href="http://liulanqi.baidu.com/" target="_blank">下载</a></li>
						<li>火狐浏览器：<a href="http://www.firefox.com.cn/" target="_blank">下载</a></li>
					</ul>
				</div>
				<div class="holder_help">
					<p><a id="link_to" href="javascript:void(0);">我已了解，仍然使用本浏览器访问</a></p>
				</div>
			</div>	
		</div>
		
		<!-- 获取项目根path -->
		<script src="${pageContext.request.contextPath}/resources/js/jquery-extensions-master/jquery/jquery-1.10.2.js" type="text/javascript"></script> 
		<script src="${pageContext.request.contextPath}/resources/js/bootstrap-switch/bootstrap-switch.min.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath}/resources/js/bootstrap-3.0.3-dist/dist/js/alert.js" type="text/javascript"></script>
		 
	    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
	    <!--[if lt IE 9]>
	    	<script type="text/javascript">
	    		$(function() {
		    		$("#abnormal").show();
		    		$('#link_to').click(function() {  
						$("#normal_container").show();
		    			$("#abnormal").hide();     
				    });
			    });
	    	</script>
	    	<script src="http://cdn.bootcss.com/html5shiv/3.7.0/html5shiv.min.js"></script>
	    	<script src="http://cdn.bootcss.com/respond.js/1.3.0/respond.min.js"></script>
	    <![endif]-->
		<script type="text/javascript">
			$(function() {
				$(".alert").alert();
				$('#rememberMe').bootstrapSwitch();//开关风格checkbox
				
				$('#login_kaptcha').click(function() {  
					$('#captcha').val('');
		        	$(this).hide().attr('src','${pageContext.request.contextPath}/resources/images/kaptcha.jpg?' + Math.floor(Math.random() * 100)).fadeIn();     
			    });
				
				$('#captcha').val('').keyup(function() {
				    var target = this;
				    if (target.value.length === 4) {
				        if(validaForm()){
				        	$("#loginForm").submit();
				        }
				    }
				});
				
				//表单验证
				validaForm = function(){
					var $username = $('#username');
					if($username.val() === ''){
						$('#userrname_form_group').addClass("has-error");
						$username.focus();
						return false;
					}
					var $password = $('#password');
					if($password.val() === ''){
						$('#password_form_group').addClass("has-error");
						$password.focus();
						return false;
					}
					
					var $captcha = $('#captcha');
					if($captcha.val().length < 4){
						$('#captcha_form_group').addClass("has-error");
						$captcha.focus();
						return false;
					}
					
					$('#login_submit').attr('disabled', 'disabled').html('登录中...');
					return true;
				};
				
				//$("#loginForm").submit();//自动登录，方便测试，后期删除
			});
		</script>
		<%
			String error = (String) request.getAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
			if(error != null){
		%>
			<script type="text/javascript">
				$('#danger_alert').fadeIn();
				<% 
				 	if(error.contains("DisabledAccountException")){
		 	    %>
				 	  	$('#danger_alert h4').html('用户已被屏蔽，请登录其他用户！');
				 	  	$('#username_form_group').addClass("has-error");
				 	  	$('#username').focus();
				 	   <%
					}else if(error.contains("IncorrectCaptchaException")){
					    %>
				 	  	$('#danger_alert h4').html('验证码错误，请重新输入！');
				 	  	$('#captcha_form_group').addClass("has-error");
				 	  	$('#captcha').focus();
				 	   <%
					}else{
					    %>
					    $('#danger_alert h4').html('用户名或密码错误，请重新输入！');
					    $('#password_form_group').addClass("has-error");
					    $('#password').focus();
				 	   <%
					}
						%>
				setTimeout(function(){//延迟3秒隐藏
					$('#danger_alert').fadeOut();
				},3000)
			</script>
		<%
			}
		%>
	</body>
</html>
