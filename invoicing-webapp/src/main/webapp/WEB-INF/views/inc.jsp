<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入jstl解析标签 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 获取项目根path -->
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<!-- 引入网站标识icon -->
<link rel="shortcut icon" href="${ctx}/resources/images/favicon/favicon.ico"></link>
<link rel="icon" href="${ctx }/resources/images/favicon/favicon.ico"></link>

<!-- 引入easyui样式以及扩展样式 -->
<link id="easyuiTheme" rel="stylesheet" type="text/css" href="${ctx}/resources/js/jquery-extensions-master/jquery-easyui-theme/<c:out value="${cookie.easyuiThemeName.value}" default="metro-blue"/>/easyui.css"  />
<link href="${ctx}/resources/js/jquery-extensions-master/jquery-easyui-theme/icon.css" rel="stylesheet" type="text/css" />
<link href="${ctx}/resources/js/jquery-extensions-master/icons/icon-all.css" rel="stylesheet" type="text/css" />
<link href="${ctx}/resources/js/jquery-extensions-master/jeasyui-extensions/jquery-easyui-portal/portal.css" rel="stylesheet" type="text/css" />
<!-- 引入自定义样式 -->
<link href="${ctx}/resources/css/main.css" rel="stylesheet" type="text/css" />
<!-- kindeditor上传按钮样式 -->
<link rel="stylesheet" href="${ctx}/resources/js/kindeditor/themes/default/default.css"></link>
<!-- 增加地区选择器样式 -->
<link href="${ctx}/resources/area/css/cityLayout.css" type="text/css" rel="stylesheet">
<link href="${ctx}/resources/area/css/area.css" type="text/css" rel="stylesheet">


<!-- 引入easyui-->
<script src="${ctx}/resources/js/jquery-extensions-master/jquery/jquery-1.10.2.js" type="text/javascript"></script>
<script src="${ctx}/resources/js/jquery-extensions-master/jquery-easyui-1.3.4/jquery.easyui.min.js" type="text/javascript"></script>
<script src="${ctx}/resources/js/jquery-extensions-master/jquery-easyui-1.3.4/locale/easyui-lang-zh_CN.js" type="text/javascript"></script>
<!-- 引入easyui扩展-->
<script src="${ctx}/resources/js/jquery-extensions-master/jquery.jdirk.js" type="text/javascript"></script>
<script src="${ctx}/resources/js/jquery-extensions-master/jeasyui-extensions/jeasyui.extensions.js" type="text/javascript"></script>
<script src="${ctx}/resources/js/jquery-extensions-master/jeasyui-extensions/jeasyui.extensions.linkbutton.js" type="text/javascript"></script>
<script src="${ctx}/resources/js/jquery-extensions-master/jeasyui-extensions/jeasyui.extensions.validatebox.js" type="text/javascript"></script>
<script src="${ctx}/resources/js/jquery-extensions-master/jeasyui-extensions/jeasyui.extensions.combo.js" type="text/javascript"></script>
<script src="${ctx}/resources/js/jquery-extensions-master/jeasyui-extensions/jeasyui.extensions.combobox.js" type="text/javascript"></script>
<script src="${ctx}/resources/js/jquery-extensions-master/jeasyui-extensions/jeasyui.extensions.form.js" type="text/javascript"></script>
<script src="${ctx}/resources/js/jquery-extensions-master/jeasyui-extensions/jeasyui.extensions.menu.js" type="text/javascript"></script>
<script src="${ctx}/resources/js/jquery-extensions-master/jeasyui-extensions/jeasyui.extensions.panel.js" type="text/javascript"></script>
<script src="${ctx}/resources/js/jquery-extensions-master/jeasyui-extensions/jeasyui.extensions.window.js" type="text/javascript"></script>
<script src="${ctx}/resources/js/jquery-extensions-master/jeasyui-extensions/jeasyui.extensions.dialog.js" type="text/javascript"></script>
<script src="${ctx}/resources/js/jquery-extensions-master/jeasyui-extensions/jeasyui.extensions.tree.js" type="text/javascript"></script>
<script src="${ctx}/resources/js/jquery-extensions-master/jeasyui-extensions/jeasyui.extensions.datagrid.js" type="text/javascript"></script>
<script src="${ctx}/resources/js/jquery-extensions-master/jeasyui-extensions/jeasyui.extensions.treegrid.js" type="text/javascript"></script>
<script src="${ctx}/resources/js/jquery-extensions-master/jeasyui-extensions/jeasyui.extensions.combogrid.js" type="text/javascript"></script>
<script src="${ctx}/resources/js/jquery-extensions-master/jeasyui-extensions/jeasyui.extensions.combotree.js" type="text/javascript"></script>
<script src="${ctx}/resources/js/jquery-extensions-master/jeasyui-extensions/jeasyui.extensions.tabs.js" type="text/javascript"></script>
<!--<script src="${ctx}/resources/js/jquery-extensions-master/jeasyui-extensions/jeasyui.extensions.theme.js" type="text/javascript"></script>-->
<script src="${ctx}/resources/js/jquery-extensions-master/icons/jeasyui.icons.all.js" type="text/javascript"></script>
<script src="${ctx}/resources/js/jquery-extensions-master/jeasyui-extensions/jeasyui.extensions.icons.js" type="text/javascript"></script>
<script src="${ctx}/resources/js/jquery-extensions-master/jeasyui-extensions/jquery-easyui-toolbar/jquery.toolbar.js" type="text/javascript"></script>
<script src="${ctx}/resources/js/jquery-extensions-master/jeasyui-extensions/jquery-easyui-comboicons/jquery.comboicons.js" type="text/javascript"></script>
<script src="${ctx}/resources/js/jquery-extensions-master/jeasyui-extensions/jeasyui.extensions.gridselector.js" type="text/javascript"></script>
<script src="${ctx}/resources/js/jquery-extensions-master/jeasyui-extensions/jquery-easyui-comboselector/jquery.comboselector.js" type="text/javascript"></script>
<script src="${ctx}/resources/js/jquery-extensions-master/jeasyui-extensions/jquery-easyui-portal/jquery.portal.js" type="text/javascript"></script>

<!-- 引入自定义js-->
<script src="${ctx}/resources/js/common/glacier.util.js" type="text/javascript"></script>

<!-- 加入富文本编辑器kindeditor-->
<script src="${ctx}/resources/js/kindeditor/kindeditor.js" type="text/javascript" charset="utf-8"></script>
<script src="${ctx}/resources/js/kindeditor/lang/zh_CN.js" type="text/javascript" charset="utf-8"></script>
<!-- 加入富文本编辑器kindeditor声明-->
<script type="text/javascript" charset="utf-8">
	   var ctx = '${ctx}';//项目访问路径
	   var fields = eval('(${fields})');//加载系统字段
       KindEditor.ready(function(K) {
       });
</script>