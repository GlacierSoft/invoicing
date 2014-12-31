var CreatedOKLodop7766=null;

function getLodop(oOBJECT,oEMBED){
	
	//获取当前网址，如： http://localhost:8083/uimcardprj/share/meun.jsp
	var curWwwPath=window.document.location.href;
	//获取主机地址之后的目录，如： uimcardprj/share/meun.jsp
	var pathName=window.document.location.pathname;
	var pos=curWwwPath.indexOf(pathName);
	//获取主机地址，如： http://localhost:8083
	var localhostPaht=curWwwPath.substring(0,pos);
	//获取带"/"的项目名，如：/uimcardprj
	var projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1)+"/";
	//项目跟路径
	var baseName=localhostPaht+projectName;
	
/**************************
  本函数根据浏览器类型决定采用哪个页面元素作为Lodop对象：
  IE系列、IE内核系列的浏览器采用oOBJECT，
  其它浏览器(Firefox系列、Chrome系列、Opera系列、Safari系列等)采用oEMBED,
  如果页面没有相关对象元素，则新建一个或使用上次那个,避免重复生成。
  64位浏览器指向64位的安装程序install_lodop64.exe。
**************************/
        var strHtmInstall="<br><font color='#FF00FF'>打印控件未安装!点击这里<a href='"+baseName+"resources/js/lodop/install_lodop32.exe' target='_self'>执行安装</a>,安装后请刷新页面或重新进入。</font>";
        var strHtmUpdate="<br><font color='#FF00FF'>打印控件需要升级!点击这里<a href='"+baseName+"resources/js/lodop/install_lodop32.exe' target='_self'>执行升级</a>,升级后请重新进入。</font>";
        var strHtm64_Install="<br><font color='#FF00FF'>打印控件未安装!点击这里<a href='"+baseName+"resources/js/lodop/install_lodop64.exe' target='_self'>执行安装</a>,安装后请刷新页面或重新进入。</font>";
        var strHtm64_Update="<br><font color='#FF00FF'>打印控件需要升级!点击这里<a href='"+baseName+"resources/js/lodop/install_lodop64.exe' target='_self'>执行升级</a>,升级后请重新进入。</font>";
        var strHtmFireFox="<br><br><font color='#FF00FF'>（注意：如曾安装过Lodop旧版附件npActiveXPLugin,请在【工具】->【附加组件】->【扩展】中先卸它）</font>";
        var strHtmChrome="<br><br><font color='#FF00FF'>(如果此前正常，仅因浏览器升级或重安装而出问题，需重新执行以上安装）</font>";
        var LODOP;		
	try{	
	     //=====判断浏览器类型:===============
	     var isIE	 = (navigator.userAgent.indexOf('MSIE')>=0) || (navigator.userAgent.indexOf('Trident')>=0);
	     var is64IE  = isIE && (navigator.userAgent.indexOf('x64')>=0);
	     //=====如果页面有Lodop就直接使用，没有则新建:==========
	     if (oOBJECT!=undefined || oEMBED!=undefined) { 
               	 if (isIE) 
	             LODOP=oOBJECT; 
	         else 
	             LODOP=oEMBED;
	     } else { 
		 if (CreatedOKLodop7766==null){
          	     LODOP=document.createElement("object"); 
		     LODOP.setAttribute("width",0); 
                     LODOP.setAttribute("height",0); 
		     LODOP.setAttribute("style","position:absolute;left:0px;top:-100px;width:0px;height:0px;");  		     
                     if (isIE) LODOP.setAttribute("classid","clsid:2105C259-1E0C-4534-8141-A753534CB4CA"); 
		     else LODOP.setAttribute("type","application/x-print-lodop");
		     document.documentElement.appendChild(LODOP); 
	             CreatedOKLodop7766=LODOP;		     
 	         } else 
                     LODOP=CreatedOKLodop7766;
	     };
	     //=====判断Lodop插件是否安装过，没有安装或版本过低就提示下载安装:==========
	     if ((LODOP==null)||(typeof(LODOP.VERSION)=="undefined")) {
	             if (navigator.userAgent.indexOf('Chrome')>=0)
	                 //document.documentElement.innerHTML=strHtmChrome+document.documentElement.innerHTML;
	            	 $.messager.alert("操作提示",strHtmChrome,"warning");
	             if (navigator.userAgent.indexOf('Firefox')>=0)
	                 //document.documentElement.innerHTML=strHtmFireFox+document.documentElement.innerHTML;
	            	 $.messager.alert("操作提示",strHtmFireFox,"warning");
	             if (is64IE) 
	            	 //document.write(strHtm64_Install);
	            	 $.messager.alert("操作提示",strHtm64_Install,"warning");
	             else if (isIE)  
	            	 //document.write(strHtmInstall);
	            	 $.messager.alert("操作提示",strHtmInstall,"warning");
	             else{
	                 //document.documentElement.innerHTML=strHtmInstall+document.documentElement.innerHTML;
	            	 $('#investDailogTest').dialog('close');
	            	 $("#contractRecordPrintDailogTest").dialog({
		  				  title:"安全提示",
		  				  width: 540,    
		  				  height: 180,
		  				  modal: true,
		  			      closed: false
		  			});
	             }
	             return LODOP;
	     } else 
	     if (LODOP.VERSION<"6.1.9.2") {
	             if (is64IE) 
	            	 //document.write(strHtm64_Update); 
	            	 $.messager.alert("操作提示",strHtm64_Update,"warning");
	             else if (isIE) 
	            	 //document.write(strHtmUpdate);
	            	 $.messager.alert("操作提示",strHtm64_Update,"warning");
	             else
	               //document.documentElement.innerHTML=strHtmUpdate+document.documentElement.innerHTML;
	            	$.messager.alert("操作提示",strHtm64_Update,"warning");
	    	     return LODOP;
	     };
	     //=====如下空白位置适合调用统一功能(如注册码、语言选择等):====	     


	     //============================================================	     
	     return LODOP; 
	} catch(err) {
	     if (is64IE)	
            document.documentElement.innerHTML="Error:"+strHtm64_Install+document.documentElement.innerHTML;else
            document.documentElement.innerHTML="Error:"+strHtmInstall+document.documentElement.innerHTML;
	     return LODOP; 
	};
}
