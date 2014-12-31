<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="org.slf4j.Logger,org.slf4j.LoggerFactory" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<%response.setStatus(200);%>

<%
	Throwable ex = null;
	if (exception != null)
		ex = exception;
	if (request.getAttribute("javax.servlet.error.exception") != null)
		ex = (Throwable) request.getAttribute("javax.servlet.error.exception");

	//记录日志
	Logger logger = LoggerFactory.getLogger("500.jsp");
	logger.error(ex.getMessage(), ex);
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>500 - 系统内部错误</title>
</head>
<SCRIPT>window.wpo={start:new Date*1,pid:109,page:'qing'}</SCRIPT>
<link href="${ctx}/resources/css/404.css" type=text/css rel=stylesheet><!--<![endif]-->
<STYLE type=text/css>.mod-notfound {
	BORDER-RIGHT: #e1e1e1 1px solid; BORDER-TOP: #e1e1e1 1px solid; MARGIN-TOP: 10px; BACKGROUND: #fff; BORDER-LEFT: #e1e1e1 1px solid; BORDER-BOTTOM: #e1e1e1 1px solid; HEIGHT: 585px; TEXT-ALIGN: center; border-radius: 10px
}
</STYLE>
<body>
	<%-- <h2>500 - 系统发生内部错误.</h2>
	<p><a href="<c:url value="/"/>">返回首页</a></p> --%>
	<SECTION class=mod-page-body>
<div class="mod-page-main wordwrap clearfix">
	<div class=x-page-container>
		<div class="mod-notfound grid-98">
			<IMG class=img-notfound height=320 src="${ctx}/resources/images/error/500.jpg" width=620>
			<P style="FONT-SIZE: 24px; LINE-HEIGHT: 70px">啊~哦~ 发生500错误，您要查看的页面发生错误！</P>
			<P style="MARGIN-BOTTOM: 30px">请稍后再点击该页面，或者点击<A href="<c:url value="/do/index.htm"/>">冰川系统首页</A></P>
			<P style="FONT-SIZE: 14px; LINE-HEIGHT: 20px">
				您若遇到不能解决的问题，请联系冰川软件客服，我们竭尽全力为您们排忧解难^_^
			</P>
		</div>
	</div>
</div>
</SECTION>
<FOOTER class="mod-footer mod-cs-footer">
	<div class="clearfix hidden-box"></div>
	<div class=footer-box>
		<div class=copy-box>©2014&nbsp;BingChuan</div>
	</div>
</FOOTER>
</body>
</html>
