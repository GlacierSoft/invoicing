<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%><!-- 引入国际化标签 -->

<form id="user_mgr_user_change" method="POST" style="padding:15px" >
	<table class="formtable">
		<tr>
			<td>用户名称：</td>
			<td>
				<input type="hidden" name="userId" value="${UserData.userId}" />
				<input name="username" class="easyui-validatebox spinner" style="width:268px" value="${UserData.userCnName}" readonly="readonly"/>
			</td>
		</tr>
		
		<tr>
			<td>初始密码：</td>
			<td><input name="Pass_Before"  id="Pass_Before"   class="easyui-validatebox spinner" type="password" style="width:268px" required="true"/></td>
		</tr>
		<tr id="tr_Pass_Before" style="display: none">
			<td></td>
			<td><span id="Pass_Before_Span"></span></td>
		</tr>
		<tr>
			<td>修改密码：</td>
			<td><input name="Pass_Center"  id="Pass_Center" class="easyui-validatebox spinner" type="password" style="width:268px"  required="true"  /></td>
		</tr>
		<tr  id="tr_Pass_Center" style="display: none">
			<td></td>
			<td><span id="Pass_Center_Span"></span></td>
		</tr>
		<tr>
			<td>确认密码：</td>
			<td><input name="Pass_After" id="Pass_After" class="easyui-validatebox spinner" type="password" style="width:268px"  required="true"/></td>
		</tr>
		  <tr  id="tr_Pass_After" style="display: none">
			<td></td>
			<td><span id="Pass_After_Span"></span></td>
		</tr>
	</table>
</form>
<script>

    var Pass_Before_one=false;
    var Pass_Center_one=false;
    var Pass_After_one=false; 

    $(":input[name=Pass_Before]").blur(function(){
    		var pass=$(":input[name=Pass_Before]").val().trim();
    		if(pass!= '${UserData.password}'){
    			$("#tr_Pass_Before").css({"display":''});  
    			$("#Pass_Before_Span").text("初始密码填写错误!!").css({"color":"red","font-family":"微软雅黑","font-size":"12px"});
    			window.setTimeout( function(){ $("#Pass_Before").focus();}, 0);
    		}else{
    			$("#tr_Pass_Before").css({"display":'none'});
    			Pass_Before_one=true;
    		}
    });
    
    
   
    
    $(":input[name=Pass_After]").blur(function(){
             if(!$(":input[name=Pass_Before]").val().trim()){
            	$("#tr_Pass_Before").css({"display":''});  
     			$("#Pass_Before_Span").text("初始密码填写错误!!").css({"color":"red","font-family":"微软雅黑","font-size":"12px"});
     			window.setTimeout( function(){ $("#Pass_Before").focus();}, 0);
             }else{
            	 $("#tr_Pass_Before").css({"display":'none'});
            	 if(!$(":input[name=Pass_Center]").val().trim()){
      			       $("#tr_Pass_Center").css({"display":''});  
         			   $("#Pass_Center_Span").text("填写密码不能为空!!").css({"color":"red","font-family":"微软雅黑","font-size":"12px"});
         			   window.setTimeout( function(){ $("#Pass_Center").focus();}, 0);
      			}else{
      				$("#tr_Pass_Center").css({"display":'none'});
      				var str=/[a-zA-Z0-9]{6,16}/;
      				if(str.test($(":input[name=Pass_Center]").val().trim())){
      				  alert("我已进入格式匹配!!!");  
      				window.setTimeout( function(){ $("#Pass_Center").blur();}, 0);
      				   if(!Pass_After){
                     	  $("#tr_Pass_After").css({"display":''});
                     	  $("#Pass_After_Span").text("确认密码填写不能为空!!").css({"color":"red","font-family":"微软雅黑","font-size":"12px"});
           			      //window.setTimeout( function(){ $("#Pass_After").focus();}, 0);
           			     }else{
           			    	$("#tr_Pass_After").css({"display":'none'});
           			    	if($(":input[name=Pass_Center]").val().trim()!=$("input[name=Pass_After]").val()){
           			    	  $("#tr_Pass_After").css({"display":''});
                        	  $("#Pass_After_Span").text("确认密码填写不一致!!").css({"color":"red","font-family":"微软雅黑","font-size":"12px"});
              			      //window.setTimeout( function(){ $("#Pass_After").focus();}, 0);
           			    	}else{
           			    		$("#tr_Pass_After").css({"display":'none'});
           			    		Pass_After_one=true;
           			    	}
           			    }   
      				}else{
      					$("#tr_Pass_Center").css({"display":''});
                   	    $("#Pass_Center_Span").text("确认密码填写格式错误,6-16位字符!!").css({"color":"red","font-family":"微软雅黑","font-size":"12px"});
      				}
      			  }
             }
    })
    
</script>
