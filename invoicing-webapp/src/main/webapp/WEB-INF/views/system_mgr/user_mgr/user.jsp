<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.system_mgr.user_mgr.user');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.system_mgr.user_mgr.user.param = {
			toolbarId : 'userDataGrid_toolbar',
			actions : {
				assign:{flag:'assign',controlType:'single'},
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	};
	
	
	//初始化角色DataGrid
	glacier.system_mgr.user_mgr.user.userDataGrid = $('#userDataGrid').datagrid({
		fit:true,//控件自动resize占满窗口大小
		iconCls:'icon-save',//图标样式
		border:false,//是否存在边框
		fitColumns:false,//自动填充行
	 	nowrap: true,//禁止单元格中的文字自动换行
		autoRowHeight: false,//禁止设置自动行高以适应内容
		striped: true,//true就是把行条纹化。（即奇偶行使用不同背景色）
		singleSelect:true,//限制单选
		checkOnSelect:false,//选择复选框的时候选择该行
		selectOnCheck:false,//选择的时候复选框打勾
		url: ctx + '/do/user/list.json',
		sortName: 'createTime',//排序字段名称
		sortOrder: 'desc',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'userId',
		columns:[[
			/* {
				field:'userId',
				title:'ID',
				checkbox:true
			}, */{
				field:'username',
				title:'用户名',
				width:120,
				sortable:true
			},{
				field:'userCnName',
				title:'真实名称',
				width:120,
				sortable:true
			},{
				field:'status',
				title:'状态',
				width:70,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如man显示是，woman显示女
					return renderGridValue(value,fields.status);
				}
			},{
				field:'builtin',
				title:'是否内置',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如man显示是，woman显示女
					return renderGridValue(value,fields.builtin);
				}
			},{
				field:'email',
				title:'电子邮箱',
				width:190,
				sortable:true
			},{
				field:'userImage',
				title:'头像路径',
				width:120,
				hidden:true
			},{
				field:'lastLoginTime',
				title:'最后登录时间',
				sortable:true,
				width:160
			},{
				field:'createrDisplay',
				title:'创建者',
				width:120
			},{
				field:'createTime',
				title:'创建时间',
				sortable:true,
				width:160
			},{
				field:'remark',
				title:'备注',
				width:120,
				sortable:true
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pageSize : 10,//注意，pageSize必须在pageList存在
		pageList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#userDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.system_mgr.user_mgr.user.param,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.system_mgr.user_mgr.user.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.system_mgr.user_mgr.user.param,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.system_mgr.user_mgr.user.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.system_mgr.user_mgr.user.param,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.system_mgr.user_mgr.user.param,this).unSelect();
		},
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$(this).datagrid('clearSelections');
			$(this).datagrid('clearChecked');
			var rows=$(this).datagrid("getRows");
			if(rows.length==0){   
				var body = $(this).data().datagrid.dc.body2;
				body.find('table tbody').append('<tr><td width="' + body.width() + '" style="height: 25px; text-align: center;color:red">暂时没有记录</td></tr>');
			}
		},
		onDblClickRow:function(rowIndex, rowData){
			$.easyui.showDialog({
				title: "【"+rowData.userCnName+"】管理员详细信息",
				href : ctx + '/do/user/intoDetail.htm?userId='+rowData.userId,//从controller请求jsp页面进行渲染
				width : 570,
				height : 310,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
	
	//点击增加按钮触发方法
	glacier.system_mgr.user_mgr.user.addUser = function(){
		glacier.basicAddOrEditDialog({
			title : '增加管理员信息',
			width : 400,
			height : 300,
			queryUrl : ctx + '/do/user/intoForm.htm',
			submitUrl : ctx + '/do/user/add.json',
			successFun : function (){
				glacier.system_mgr.user_mgr.user.userDataGrid.datagrid('reload');
			}
		});
	};
	//点击编辑按钮触发方法
	glacier.system_mgr.user_mgr.user.editUser = function(){
		var row = glacier.system_mgr.user_mgr.user.userDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '编辑【'+row.username+'】',
			width : 400,
			height : 300,
			queryUrl : ctx + '/do/user/intoForm.htm',
			submitUrl : ctx + '/do/user/edit.json',
			queryParams : {
				userId : row.userId
			},
			successFun : function (){
				glacier.system_mgr.user_mgr.user.userDataGrid.datagrid('reload');
			}
		});
	};

	//点击删除按钮触发方法
	glacier.system_mgr.user_mgr.user.delUser = function(){
		var rows = glacier.system_mgr.user_mgr.user.userDataGrid.datagrid("getChecked");
		var userIds = [];//删除的id标识
		var usernames = [];//日志记录引用名称
		for(var i=0;i<rows.length;i++){
			userIds.push(rows[i].userId);
			usernames.push(rows[i].username);
		}
		if(userIds.length > 0){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/user/del.json',
						   data: {userIds:userIds.join(','),usernames:usernames.join(',')},
						   dataType:'json',
						   success: function(r){
							   //glacier.show({msg:r.msg,result:r.success});
							   if(r.success){
								   $.messager.show({
										title:'成功提示',
										msg:r.msg,
										width:400,
									    height:120,
										timeout:3000,
										showType:'slide'
									});
							   }else{
								   $.messager.show({//后台验证弹出错误提示信息框
										title:'错误提示',
										width:400,
									    height:120,
									    icon:'error',
										msg: r.msg,
										timeout:4500
									});
							   }
							   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
								   glacier.system_mgr.user_mgr.user.userDataGrid.datagrid('reload');
							   }
						   }
					});
				}
			});
		}
	};
	
	
	//显示为用户分配角色窗口
	glacier.system_mgr.user_mgr.user.roleAssign = function(){
		var userId = glacier.system_mgr.user_mgr.user.userDataGrid.datagrid("getSelected").userId;
		glacier.system_mgr.user_mgr.user.userRoleTreeGrid = $('#userRoleTreeGrid').treegrid({
			url:ctx +'/do/auth/getRolesAndRational.json',//请求的URL
			idField : 'roleId',//定义了关键字段来标识一个树节点
			singleSelect:false,//限制单选
			checkOnSelect:true,
			selectOnCheck:false,
			queryParams:{userId:userId},//当请求远程数据时，发送的额外参数
			fit : true,//控件自动resize占满窗口大小
			fitColumns : true,//自动填充行
			border : false,//是否存在边框
			columns:[[
				{
					field:'roleId',
					title:'ID',
					checkbox:true
				},{
					field:'roleCnName',
					title:'角色名',
					width:120
				},{
					field:'roleEnName',
					title:'角色英文名',
					width:120
				},{
					field:'remark',
					title:'备注',
					width:200
				}
			]] 
		});
		//显示分配角色窗口
		var userName = glacier.system_mgr.user_mgr.user.userDataGrid.datagrid("getSelected").username;
		glacier.system_mgr.user_mgr.user.userRoleWin = $('#userRoleWin').dialog({ 
			title:'为【'+userName+'】用户分配角色',
		    width:650,  
		    height:200,
		    resizable:true,
		    modal:true,
		    minimizable:false,
		    maximizable:true,
		    buttons:[{
				text:'保存',
				iconCls:"icon-save",
				handler:function(){
					glacier.system_mgr.user_mgr.user.saveRolesAndRational(userId);
				}
			},{
				text:'关闭',
				iconCls:"icon-undo",
				handler:function(){
					glacier.system_mgr.user_mgr.user.userRoleWin.dialog('close');
				}
			}]
		});
	};
	
	//保存用户和角色关系
	glacier.system_mgr.user_mgr.user.saveRolesAndRational = function(userId){
		var roleIds = [];
		var roleInputs = glacier.system_mgr.user_mgr.user.userRoleWin.find("input[name='roleId']:checked");
		for(var i=0;i<roleInputs.length;i++){
			roleIds.push(roleInputs[i].value);
		}
		//发送远程请求保存当前权限设置
		$.ajax({
			   type: "POST",
			   url: ctx + "/do/auth/saveRolesAndRational.json",
			   data: {userId:userId,roleIds:roleIds.join(',')},
			   dataType:'json',
			   success: function(r){
				   	glacier.show({msg:r.msg,result:r.success});
				    glacier.system_mgr.user_mgr.user.userRoleWin.dialog('close');
			   }
		});
	};
</script>

<!-- 所有操作日志列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="userGridPanel" data-options="region:'center',border:true" >
		<table id="userDataGrid">
			<glacierui:toolbar panelEnName="UserList" toolbarId="userDataGrid_toolbar" menuEnName="user"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
	<div data-options="region:'north',split:true" style="height:40px;padding-left:10px;">
		<form id="userSearchForm">
			<table>
				<tr>
					<td>用户名：</td>
					<td><input name="username" style="width: 60px;" class="spinner"/></td>
					<td>真实姓名：</td>
					<td><input name="userCnName" style="width: 60px;" class="spinner"/></td>
					<td>电子邮箱：</td>
					<td>
						<input name="email" style="width:60px;height:18px;" class="spinner" />
					</td>
					<td>用户类型：</td>
					<td>
						<input name="builtin" style="width:60px;height:18px;" class="easyui-combobox" data-options="panelHeight:'auto',editable:false,valueField:'value',textField : 'label',data :fields.builtin" />
					</td>
					<td>用户状态：</td>
					<td>
						<input name="status" style="width:60px;height:18px;" class="easyui-combobox" data-options="panelHeight:'auto',editable:false,valueField:'value',textField : 'label',data :fields.status" />
					</td>
					<td>录入时间：</td>
					<td>
						<input name="createStartTime" class="easyui-datetimebox" style="width: 100px;" />
						-
						<input name="createEndTime" class="easyui-datetimebox" style="width: 100px;" />
					</td>
					<td>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-in',plain:true" onclick="glacier.system_mgr.user_mgr.user.userDataGrid.datagrid('load',glacier.serializeObject($('#userSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-out',plain:true" onclick="$('#userSearchForm input').val('');glacier.system_mgr.user_mgr.user.userDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>

<!-- 自定义分配角色窗口 -->
<div id="userRoleWin">
	<table id="userRoleTreeGrid"></table>
</div>