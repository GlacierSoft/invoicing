<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.system_mgr.dep_mgr.dep');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//初始化资源菜单depTreeGrid
	glacier.system_mgr.dep_mgr.dep.depTreeGrid = $('#depTreeGrid').treegrid({
		fit:true,//控件自动depize占满窗口大小
		border:false,//是否存在边框
		fitColumns:true,//自动填充行
		autoRowHeight: false,//禁止设置自动行高以适应内容
		url : ctx + '/do/dep/list.json',//请求的URL
		sortName: 'orderNum',//排序字段名称
		sortOrder: 'desc',//升序还是降序
		idField : 'depId',
		treeField : 'cnName',//定义树节点字段
		parentField : 'parentId',//treegrid父节点
		smooth: true,//该属性用以启用当前 easyui-treegrid 控件对平滑数据格式的支持,默认使用字段pid,可自定义
		enableHeaderClickMenu: false,//启用表头菜单
        enableHeaderContextMenu: true,//启用表头右键菜单
        enableRowContextMenu: false,//启用表行右键菜单
		rowTooltip: false, //表行数据提示
		toolbar : '#depTreeGridToolbar',
		onDblClickRow: function(row){
			$.easyui.showDialog({
				title: "【"+row.cnName+"】详细信息",
				href : ctx + '/do/dep/intoDetail.htm?depId='+row.depId,//从controller请求jsp页面进行渲染
				width : 550,
				height : 260,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		},
		frozenColumns : [ [{//冻结列，当表格宽度压缩展示不全时候，该列不会缩小
			field : 'depId' , title : 'ID' , hidden:true
		},{
			field : 'cnName' , title : '部门名称' , width : 150
		},{
			field : 'enName' , title : '部门编码' , width : 150
		}]],
		columns : [ [{
			field : 'orderNum' , title : '排序' , width : 150 ,sortable:true
		},{
			field : 'remark' , title : '备注' , width : 150
		},{
			field : 'creater' , title : '创建人' , width : 150
		},{
			field : 'createTime' , title : '创建时间' , width : 150
		}]]
	});
	//点击增加按钮触发方法
	glacier.system_mgr.dep_mgr.dep.addDep = function(){
		glacier.basicAddOrEditDialog({
			title : '【下拉项管理】- 增加',
			width : 410,
			height : 300,
			queryUrl : ctx + '/do/dep/intoForm.htm',
			submitUrl : ctx + '/do/dep/add.json',
			successFun : function (){
				glacier.system_mgr.dep_mgr.dep.depTreeGrid.treegrid('reload');
			}
		});
	};
	//点击编辑按钮触发方法
	glacier.system_mgr.dep_mgr.dep.editDep = function(){
		var row = glacier.system_mgr.dep_mgr.dep.depTreeGrid.treegrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '【下拉项管理】- 编辑('+row.cnName+')',
			width : 410,
			height : 300,
			queryUrl : ctx + '/do/dep/intoForm.htm',
			submitUrl : ctx + '/do/dep/edit.json',
			queryParams : {
				depId : row.depId
			},
			successFun : function (){
				glacier.system_mgr.dep_mgr.dep.depTreeGrid.treegrid('reload');
			}
		});
	};
	
	//点击删除按钮触发方法
	glacier.system_mgr.dep_mgr.dep.delDep = function(){
		var row = glacier.system_mgr.dep_mgr.dep.depTreeGrid.treegrid("getSelected");
		$.messager.confirm('请确认', '是否要删除所选部门，删除后不可恢复!', function(r){
			if (r){
				$.ajax({
					   type: "POST",
					   url: ctx + '/do/dep/del.json',
					   data: row,
					   dataType:'json',
					   success: function(r){
						   if(r.success){//操作成功刷新列表
							   $.messager.show({
									title:'提示',
									msg:r.msg,
									icon:'info',
									showType:'fade'
								});
							   glacier.system_mgr.dep_mgr.dep.depTreeGrid.treegrid('reload');
						   }else{
							   $.messager.show({
									title:'提示',
									msg:r.msg,
									icon:'error',
									showType:'fade'
								});
						   }
					   }
				});
			}
		});
	};
	
	//显示为用户分配角色窗口
	glacier.system_mgr.dep_mgr.dep.assignDep = function(){
		var depId = glacier.system_mgr.dep_mgr.dep.depTreeGrid.treegrid("getSelected").depId;
		glacier.system_mgr.dep_mgr.dep.depRoleTreeGrid = $('#depRoleTreeGrid').treegrid({
			url:ctx +'/do/auth/getRolesAndRationalByDepId.json',//请求的URL
			idField : 'roleId',//定义了关键字段来标识一个树节点
			singleSelect:false,//限制单选
			checkOnSelect:true,
			selectOnCheck:false,
			queryParams:{depId:depId},//当请求远程数据时，发送的额外参数
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
		var cnName = glacier.system_mgr.dep_mgr.dep.depTreeGrid.treegrid("getSelected").cnName;
		glacier.system_mgr.dep_mgr.dep.depRoleWin = $('#depRoleWin').dialog({ 
			title:'为【'+cnName+'】部门分配角色',
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
					glacier.system_mgr.dep_mgr.dep.saveRolesAndRational(depId);
				}
			},{
				text:'关闭',
				iconCls:"icon-undo",
				handler:function(){
					glacier.system_mgr.dep_mgr.dep.depRoleWin.dialog('close');
				}
			}]
		});
	};
	
	//保存用户和角色关系
	glacier.system_mgr.dep_mgr.dep.saveRolesAndRational = function(depId){
		var roleIds = [];
		var roleInputs = glacier.system_mgr.dep_mgr.dep.depRoleWin.find("input[name='roleId']:checked");
		for(var i=0;i<roleInputs.length;i++){
			roleIds.push(roleInputs[i].value);
		}
		//发送远程请求保存当前权限设置
		$.ajax({
			   type: "POST",
			   url: ctx + "/do/auth/saveRolesAndRationalByDepId.json",
			   data: {depId:depId,roleIds:roleIds.join(',')},
			   dataType:'json',
			   success: function(r){
				   	glacier.show({msg:r.msg,result:r.success});
				    glacier.system_mgr.dep_mgr.dep.depRoleWin.dialog('close');
			   }
		});
	};
</script>

<div class="easyui-layout" data-options="fit:true">
	<div id="depGridPanel" data-options="region:'center',border:true" >
		<table id="depTreeGrid">
			<glacierui:toolbar panelEnName="DepList" toolbarId="depTreeGridToolbar" menuEnName="dep"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
</div>

<!-- 自定义分配角色窗口 -->
<div id="depRoleWin">
	<table id="depRoleTreeGrid"></table>
</div>