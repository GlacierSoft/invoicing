$.util.namespace('glacier');

/**
 * 增加数组判断是否包含某元素功能
 * 
 * @param true/false
 */
Array.prototype.contains = function(obj) { 
	var i = this.length;
	while (i--) { 
		if (this[i] == obj) { 
			return true; 
		} 
	} 
	return false; 
} 

/**
 * 渲染字段信息
 */
function renderGridValue(value,fields){
	for(var i =0;i<fields.length;i++){
		if(value == fields[i].value){
			return fields[i].label;
		}
	}
}

/**
 * 金额格式化格式
 */
function formatNum(strNum) {
	if(strNum){
		if (strNum.length <= 3) {
			return strNum;
		}
		if (!/^(\+|-)?(\d+)(\.\d+)?$/.test(strNum)) {
			return strNum;
		}
		var a = RegExp.$1, b = RegExp.$2, c = RegExp.$3;
		var re = new RegExp();
		re.compile("(\\d)(\\d{3})(,|$)");
		while (re.test(b)) {
			b = b.replace(re, "$1,$2$3");
		}
		return a + "" + b + "" + c;
	}
	return strNum;
};

/**
 * 更换主题方法，在系统中link引入easyui的主题，必须加上id为easyuiThemeName
 * @param themeName 主题的名称，和theme中文件夹名称对应
 */
function changeThemeFun(themeName) {
	//定义了一个link的id为easyuiTheme，支持主题更换
	var $easyuiTheme = $('#easyuiTheme');
	var url = $easyuiTheme.attr('href');
	var href = url.substring(0, url.indexOf('jquery-easyui-theme')) + 'jquery-easyui-theme/' + themeName + '/easyui.css';
	//动态更换引用主题
	$easyuiTheme.attr('href', href);
	//遍历页面所有的iframe，子页面的主题也进行动态更换
	var $iframe = $('iframe');
	if ($iframe.length > 0) {
		for ( var i = 0; i < $iframe.length; i++) {
			var ifr = $iframe[i];
			try {
				$(ifr).contents().find('#easyuiTheme').attr('href', href);
			} catch (e) {
				try {
					ifr.contentWindow.document.getElementById('easyuiTheme').href = href;
				} catch (e) {
				}
			}
		}
	}
	$.cookie('easyuiThemeName', themeName, {
		expires : 7
	});

};

/**
 * 扩展propertygrid，增加getGroups方法
 * 返回一组combobox的groups的数组
 */
$.extend($.fn.propertygrid.methods, {
	    getGroups: function (jq) {
	    	var groups = [];
	    	var returnStr = '[';
	    	var opt= $(jq).propertygrid('options');
	    	var rows = $(jq).propertygrid("getRows");
	    	$.each(rows, function(i, n){
	    		var group = n[opt.groupField];
	    		if(!groups.contains(group)){
	    			groups.push(group);
	    			var groupName = group.split(":")[0];
	    			returnStr += '{"id":"'+group+'","text":"'+groupName+'"},';
	    		}
	    	});
	    	returnStr = returnStr.substr(0, returnStr.length-1) + ']';
	    	return $.parseJSON(returnStr);
	    }
});

function action_controller(param,datagird){
	return {
			select : function(){
				$.each(param.actions, function(){
					if('single' === this.controlType){
						$('#'+param.toolbarId+'').find("a[id$='"+this.flag+"']").linkbutton('enable');
					}
				});
			},
			unSelect : function(){
				$.each(param.actions, function(){
					if('single' === this.controlType){
						$('#'+param.toolbarId+'').find("a[id$='"+this.flag+"']").linkbutton('disable');
					}
				});
			},
			check : function(){
				var rows = $(datagird).datagrid("getChecked");
				if(rows.length > 0){
					$.each(param.actions, function(){
						if('multiple' === this.controlType){
							$('#'+param.toolbarId+'').find("a[id$='"+this.flag+"']").linkbutton('enable');
						}
					});
					
				}
			},
			unCheck : function(){
				var rows = $(datagird).datagrid("getChecked");
				if(rows.length > 0){
					$.each(param.actions, function(){
						if('multiple' === this.controlType){
							$('#'+param.toolbarId+'').find("a[id$='"+this.flag+"']").linkbutton('enable');
						}
					});
				}else{
					$.each(param.actions, function(){
						if('multiple' === this.controlType){
							$('#'+param.toolbarId+'').find("a[id$='"+this.flag+"']").linkbutton('disable');
						}
					});
				}
			}
	};
};

/**
 * @requires jQuery,EasyUI
 * 
 * 扩展validatebox，添加验证两次密码功能
 */
$.extend($.fn.validatebox.defaults.rules, {
	eqPwd : {
		validator : function(value, param) {
			return value == $(param[0]).val();
		},
		message : '密码不一致！'
	},
	customReg : {
		validator : function(value, param) {
			var customRegExp = new RegExp(param[0]);
			if (customRegExp.test(value)) {  
            	return true;
            }else{
            	$.fn.validatebox.defaults.rules.customReg.message = param[1];
            	return false;  
            }
		},
		message : ''
	}
});

/**
 * 将form表单元素的值序列化成对象
 * 
 * @example sy.serializeObject($('#formId'))
 * 
 * @author 孙宇
 * 
 * @requires jQuery
 * 
 * @returns object
 */
glacier.serializeObject = function(form) {
	var o = {};
	$.each(form.serializeArray(), function(index) {
		if (this['value'] != undefined && this['value'].length > 0) {// 如果表单项的值非空，才进行序列化操作
			if (o[this['name']]) {
				o[this['name']] = o[this['name']] + "," + this['value'];
			} else {
				o[this['name']] = this['value'];
			}
		}
	});
	return o;
};

/**
 * 封装show方法
 * glacier.show({msg:r.msg,result:r.success});
 */
glacier.show = function(option){
	$.messager.show({//后台验证弹出错误提示信息框
		title : option.result ? '操作成功' :'操作失败',
		icon : option.result ? 'info' :'error',
		width : 400,
		height : 150,
		showType : 'fade',
		position: 'bottomRight',
		msg: option.result ? option.msg : '<span style="color:red">'+ option.msg + '<span>'
	});
}

/**
 * 新增/编辑弹出窗口
 */
glacier.basicAddOrEditDialog = function(option){
	if(option.queryParams){//拼装访问链接
		option.queryUrl += '?';
		$.each(option.queryParams, function(key,value){
			option.queryUrl += key + '=' + value + '&';
		});
		option.queryUrl = option.queryUrl.substring(0,option.queryUrl.length - 1);
	}
	$('<div/>').dialog({
		href : option.queryUrl,
		width : option.width ? option.width : 500,
		height : option.height ? option.height : 300,
		modal : true,
		resizable: true,
		title : option.title,
		buttons : [
           {
			text : '保存',
			iconCls : 'icon-save',
			handler : function() {
					var $dialog = $(this).closest('.window-body');//定义d变量获取该dialog的窗体
					$dialog.find('form').form('submit', {
						url: option.submitUrl,
						success: function(r){
							glacier.show({msg:r.msg,result:r.success});
							if(r.success){
								if(typeof(eval(option.successFun))=="function"){
									option.successFun();
								}
								$dialog.dialog('destroy');//关闭窗体
							}else{
								if(typeof(eval(option.falseFun))=="function"){
									option.falseFun();
								}
							}
						}
					});
				}
           }, {
				text : '取消',
				iconCls : 'icon-cancel',
				handler : function() {
					var $dialog = $(this).closest('.window-body');//定义d变量获取该dialog的窗体
					$dialog.dialog('destroy');
				}
           }
		],
		onClose : function() {//提高浏览器性能，点击关闭窗口时候注销
			$(this).dialog('destroy');
		}
	});
};