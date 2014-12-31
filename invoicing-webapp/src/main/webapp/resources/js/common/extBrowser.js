/**
 * @author 孙宇
 * 
 * 浏览器相关信息
 */
var browser = {
	appCodeName : navigator.appCodeName,// 浏览器代码名称
	appName : navigator.appName,// 浏览器的名称
	appVersion : navigator.appVersion,// 浏览器的平台和版本信息
	cookieEnabled : navigator.cookieEnabled,// 浏览器中是否启用cookie的布尔值
	platform : navigator.platform,// 运行浏览器的操作系统平台
	userAgent : navigator.userAgent, // 由客户机发送服务器的 user-agent 头部的值
	isIe : false,
	ieVersion : '',
	isChrome : false,
	isFirefox : false
};
if (browser.userAgent.indexOf('MSIE') > -1) {
	// IE浏览器
	browser.isIe = true;
	if (browser.userAgent.indexOf('MSIE 10') > -1) {
		// IE10
		browser.ieVersion = 10;
	} else if (browser.userAgent.indexOf('MSIE 9') > -1) {
		// IE9
		browser.ieVersion = 9;
	} else if (browser.userAgent.indexOf('MSIE 8') > -1) {
		// IE8
		browser.ieVersion = 8;
	} else if (browser.userAgent.indexOf('MSIE 7') > -1) {
		// IE7
		browser.ieVersion = 7;
	} else if (browser.userAgent.indexOf('MSIE 6') > -1) {
		// IE6
		browser.ieVersion = 6;
	} else {

	}
} else if (browser.userAgent.indexOf('Chrome') > -1) {
	// 谷歌浏览器
	browser.isChrome = true;
} else if (browser.userAgent.indexOf('Firefox') > -1) {
	// 火狐浏览器
	browser.isFirefox = true;
} else {
	// 其他浏览器
}