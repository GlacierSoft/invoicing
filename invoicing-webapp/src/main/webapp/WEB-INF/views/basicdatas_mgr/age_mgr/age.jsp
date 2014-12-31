<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.basicdatas_mgr.age_mgr.age');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.basicdatas_mgr.age_mgr.age.param = {
			toolbarId : 'ageDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	}; 
	
	//初始化会员年龄别称DataGrid
	glacier.basicdatas_mgr.age_mgr.age.ageDataGrid = $('#ageDataGrid').datagrid({
		fit:true,//控件自动resize占满窗口大小
		iconCls:'icon-save',//图标样式
		border:false,//是否存在边框
		fitColumns:true,//自动填充行
		nowrap: true,//禁止单元格中的文字自动换行
		autoRowHeight: false,//禁止设置自动行高以适应内容
		striped: true,//true就是把行条纹化。（即奇偶行使用不同背景色）
		singleSelect:true,//限制单选
		checkOnSelect:false,//选择复选框的时候选择该行
		selectOnCheck:false,//选择的时候复选框打勾
		url: ctx + '/do/age/list.json',
		sortName: 'createTime',//排序字段名称
		sortOrder: 'desc',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'ageId',
		columns:[[
			{
				field:'ageId',
				title:'ID',
				checkbox:true
			},{
				field:'ageName',
				title:'会员年龄别名',
				width:200,
				sortable:true
			},{
				field:'ageBegin',
				title:'开始年龄',
				width:120,
				sortable:true
			},{
				field:'ageEnd',
				title:'结束年龄',
				width:120,
				sortable:true
			},{
				field:'ageNum',
				title:'排序',
				width:120,
				sortable:true
			},{
				field:'createrDisplay',
				title:'创建人',
				sortable:true,
				width:110
			},{
				field:'createTime',
				title:'创建时间',
				sortable:true,
				width:220
			},{
				field:'updaterDisplay',
				title:'更新人',
				sortable:true,
				width:110
			},{
				field:'updateTime',
				title:'更新时间',
				sortable:true,
				width:220
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
		toolbar:'#ageDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.basicdatas_mgr.age_mgr.age.param,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.basicdatas_mgr.age_mgr.age.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.basicdatas_mgr.age_mgr.age.param,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.basicdatas_mgr.age_mgr.age.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.basicdatas_mgr.age_mgr.age.param,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.basicdatas_mgr.age_mgr.age.param,this).unSelect();
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
				title: "【"+rowData.ageName+"】的年龄别称详细信息",
				href : ctx + '/do/age/intoDetail.htm?ageId='+rowData.ageId,//从controller请求jsp页面进行渲染
				width : 530,
				height : 290,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
	//点击增加按钮触发方法
	glacier.basicdatas_mgr.age_mgr.age.addAge = function(){
		glacier.basicAddOrEditDialog({
			title : '【年龄别称】- 增加',
			width : 380,
			height : 300,
			queryUrl : ctx + '/do/age/intoForm.htm',
			submitUrl : ctx + '/do/age/add.json',
			successFun : function (){
				glacier.basicdatas_mgr.age_mgr.age.ageDataGrid.datagrid('reload');
			}
		});
	};
	//点击编辑按钮触发方法
	glacier.basicdatas_mgr.age_mgr.age.editAge = function(){
		var row = glacier.basicdatas_mgr.age_mgr.age.ageDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '【年龄别称】- 编辑('+row.ageName+')',
			width : 380,
			height : 300,
			queryUrl : ctx + '/do/age/intoForm.htm',
			submitUrl : ctx + '/do/age/edit.json',
			queryParams : {
				ageId : row.ageId
			},
			successFun : function (){
				glacier.basicdatas_mgr.age_mgr.age.ageDataGrid.datagrid('reload');
			}
		});
	};
	//点击删除按钮触发方法
	glacier.basicdatas_mgr.age_mgr.age.delAge = function(){
		var rows = glacier.basicdatas_mgr.age_mgr.age.ageDataGrid.datagrid("getChecked");
		var ageIds = [];//删除的id标识
		var ageNames = [];//会员年龄别称
		for(var i=0;i<rows.length;i++){
			ageIds.push(rows[i].ageId);
			ageNames.push(rows[i].ageName);
		}
		if(ageIds.length > 0){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/age/del.json',
						   data: {ageIds:ageIds.join(','),ageNames:ageNames.join(',')},
						   dataType:'json',
						   success: function(r){
							   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
								   $.messager.show({
										title:'提示',
										timeout:3000,
										msg:r.msg
									});
								   glacier.basicdatas_mgr.age_mgr.age.ageDataGrid.datagrid('reload');
							   }else{
									$.messager.show({//后台验证弹出错误提示信息框
										title:'错误提示',
										width:380,
										height:120,
										msg: '<span style="color:red">'+r.msg+'<span>',
										timeout:4500
									});
								}
						   }
					});
				}
			});
		}
	};
	//会员年龄别称资料模糊查询
	glacier.basicdatas_mgr.age_mgr.age.quickquery = function(value,name){
		var obj = $.parseJSON('{"'+name+'":"'+value+'"}');//将值和对象封装成obj作为参数传递给后台
		glacier.basicdatas_mgr.age_mgr.age.ageDataGrid.datagrid('load',obj);
	};
	
</script>

<!-- 所有会员年龄别称列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="ageGridPanel" data-options="region:'center',border:true" >
		<table id="ageDataGrid">
			<glacierui:toolbar panelEnName="AgeList" toolbarId="ageDataGrid_toolbar" menuEnName="age"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
</div>