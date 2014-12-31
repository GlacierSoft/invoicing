/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50067
Source Host           : localhost:3306
Source Database       : invoicing

Target Server Type    : MYSQL
Target Server Version : 50067
File Encoding         : 65001

Date: 2014-12-31 14:37:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_action`
-- ----------------------------
DROP TABLE IF EXISTS `t_action`;
CREATE TABLE `t_action` (
  `action_id` varchar(32) NOT NULL,
  `menu_id` varchar(32) default NULL,
  `panel_id` varchar(32) default NULL,
  `action_cn_name` varchar(30) NOT NULL,
  `action_en_name` varchar(30) NOT NULL,
  `icon_cls` varchar(30) default NULL,
  `type` enum('Link','Button') default 'Button',
  `disabled` enum('disable','enable') default NULL,
  `method` varchar(100) default NULL,
  `order_num` int(10) unsigned default NULL,
  `remark` varchar(50) default NULL,
  PRIMARY KEY  (`action_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_action
-- ----------------------------
INSERT INTO `t_action` VALUES ('00373dc94a1610aab1a50b060bb17e88', '91ca1b4b197688f21b68a72f69e09a8d', '37011217016636a0723462dbc81bf887', '分配角色', 'assign', 'icon-standard-key-go', 'Button', 'disable', 'glacier.system_mgr.user_mgr.user.roleAssign();', '4', null);
INSERT INTO `t_action` VALUES ('18060139f0e736a796d5ac4bdd78eadc', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.role_mgr.role.editRole();', '2', null);
INSERT INTO `t_action` VALUES ('32740020a8816f83b38564a64eee4278', 'e42b98561176563f930d82c80b041ed8', 'f769a64bb571aa0c7ac269b807af4782', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.system_mgr.loginlog_mgr.loginlog.delLoginlog();', '1', null);
INSERT INTO `t_action` VALUES ('429f54b614db46af58598c8d9a47a36f', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.delPanel();', '3', null);
INSERT INTO `t_action` VALUES ('47825847f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '3456eg4157cf483a790f4eea35ds5675', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.editOptgroupValue();', '2', null);
INSERT INTO `t_action` VALUES ('5825847f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '3456eg4157cf483a790f4eea35ds5675', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.delOptgroupValue();', '3', null);
INSERT INTO `t_action` VALUES ('58660bccb69289b1f0299d9a664931d3', '91ca1b4b197688f21b68a72f69e09a8d', '37011217016636a0723462dbc81bf887', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.system_mgr.user_mgr.user.editUser();', '2', null);
INSERT INTO `t_action` VALUES ('58c66ce489e1ee8588e881a1abe9de56', '93f0fcfa7cdff069d929723062b53211', 'e6784ccad10e3414b99b77b303a338c7', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.variables_mgr.variables.editVariables();', '2', null);
INSERT INTO `t_action` VALUES ('5db796929f23e991708fd0af99b3b4bc', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.role_mgr.role.addRole();', '1', null);
INSERT INTO `t_action` VALUES ('6838d18fa1e582d4dc28404a80445c88', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.res_mgr.res.addMenu();', '1', null);
INSERT INTO `t_action` VALUES ('6c0bc1e009b3742af24d7bdc94adec3c', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.res_mgr.res.addPanel();', '1', null);
INSERT INTO `t_action` VALUES ('6e1027dd7e57195d06dd2fac811f8ebf', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.editMenu();', '2', null);
INSERT INTO `t_action` VALUES ('6ebb0c66afb41e8cf0d890ea46ab54ca', 'ac892df07f9087fb1c89ac968bb5f555', '557cf8b2740e6792f517138703afb407', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.system_mgr.operalog_mgr.operalog.delOperalog();', '1', null);
INSERT INTO `t_action` VALUES ('84fd30c2b03282a32dd9e0d552130442', '91ca1b4b197688f21b68a72f69e09a8d', '37011217016636a0723462dbc81bf887', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.user_mgr.user.addUser();', '1', null);
INSERT INTO `t_action` VALUES ('8530139f0e736a796d5ac4bdd78eadc', 'sdsfeg4157cf483a790f4eea35ds5675', '4546fgrgrh1dfhsjdfh124564sdf2sag', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.addOptgroup();', '1', null);
INSERT INTO `t_action` VALUES ('8537147f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '4546fgrgrh1dfhsjdfh124564sdf2sag', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.delOptgroup();', '3', null);
INSERT INTO `t_action` VALUES ('8537899f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '4546fgrgrh1dfhsjdfh124564sdf2sag', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.editOptgroup();', '2', null);
INSERT INTO `t_action` VALUES ('8eb3b50d119f05c30127c3359e4a5d2a', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.role_mgr.role.delRole();', '3', null);
INSERT INTO `t_action` VALUES ('9320f5b0199abd8d53990eef7cdcd745', '54eb754157cf483a790f4eea35200118', 'eb2a84c4b7bd11632135e4992ade286e', '编辑', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.editAction();', '2', null);
INSERT INTO `t_action` VALUES ('96325847f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '3456eg4157cf483a790f4eea35ds5675', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.addOptgroupValue();', '1', null);
INSERT INTO `t_action` VALUES ('9cdc7b08f06304c42f1e6c408f170fcb', '93f0fcfa7cdff069d929723062b53211', 'e6784ccad10e3414b99b77b303a338c7', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.variables_mgr.variables.addVariables();', '1', null);
INSERT INTO `t_action` VALUES ('b5852fac0798a25a13b87e8532c60440', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.delMenu();', '3', null);
INSERT INTO `t_action` VALUES ('b7e88da8c1dec3668ca66340dabee03f', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '授权', 'auth', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.role_mgr.role.actionAuth();', '4', null);
INSERT INTO `t_action` VALUES ('dad8f671986722837f7eecb2b77c284b', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.editPanel();', '2', null);
INSERT INTO `t_action` VALUES ('e1e5268cff61dc4231932ae1484caf97', '93f0fcfa7cdff069d929723062b53211', 'e6784ccad10e3414b99b77b303a338c7', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.variables_mgr.variables.delVariables();', '3', null);
INSERT INTO `t_action` VALUES ('e550884c5e6c1e94a970cc833aa1c2b9', '54eb754157cf483a790f4eea35200118', 'eb2a84c4b7bd11632135e4992ade286e', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.res_mgr.res.addAction();', '1', null);
INSERT INTO `t_action` VALUES ('f4b5eca05e616d411f1aeef044346664', '54eb754157cf483a790f4eea35200118', 'eb2a84c4b7bd11632135e4992ade286e', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.delAction();', '3', null);

-- ----------------------------
-- Table structure for `t_authority`
-- ----------------------------
DROP TABLE IF EXISTS `t_authority`;
CREATE TABLE `t_authority` (
  `role_id` varchar(32) NOT NULL,
  `menu_id` varchar(32) NOT NULL,
  `actions` varchar(21779) default NULL,
  PRIMARY KEY  (`role_id`,`menu_id`),
  KEY `FK_t_authority2` (`menu_id`),
  CONSTRAINT `FK_auth_menu_menu_id` FOREIGN KEY (`menu_id`) REFERENCES `t_menu` (`menu_id`),
  CONSTRAINT `FK_auth_role_role_id` FOREIGN KEY (`role_id`) REFERENCES `t_role` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_authority
-- ----------------------------
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '16ac1df11de350c61722dc7b98cecca7', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '91ca1b4b197688f21b68a72f69e09a8d', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'ac892df07f9087fb1c89ac968bb5f555', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'e42b98561176563f930d82c80b041ed8', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'e550884c5e6c1e94ee70cc833aa1c2b9', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '14sdf54157cf483a790f4eea35dsf6f6', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '16ac1df11de350c61722dc7b98cecca7', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '54eb754157cf483a790f4eea35200118', 'ActionList_add,ActionList_edit,ActionList_del,PanelList_add,PanelList_edit,PanelList_del,MenuTree_add,MenuTree_edit,MenuTree_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '91ca1b4b197688f21b68a72f69e09a8d', 'UserList_add,UserList_edit,UserList_assign');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '93f0fcfa7cdff069d929723062b53211', 'VariablesList_add,VariablesList_edit,VariablesList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'ac892df07f9087fb1c89ac968bb5f555', 'OperalogList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'e42b98561176563f930d82c80b041ed8', 'LoginlogList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'e550884c5e6c1e94ee70cc833aa1c2b9', 'RoleList_add,RoleList_edit,RoleList_del,RoleList_auth');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'sdsfeg4157cf483a790f4eea35ds5675', 'OptgroupValueList_add,OptgroupValueList_edit,OptgroupValueList_del,OptgroupTree_add,OptgroupTree_edit,OptgroupTree_del');

-- ----------------------------
-- Table structure for `t_loginlog`
-- ----------------------------
DROP TABLE IF EXISTS `t_loginlog`;
CREATE TABLE `t_loginlog` (
  `loginlog_id` varchar(32) NOT NULL,
  `user_id` varchar(32) default NULL,
  `login_user` varchar(32) default NULL,
  `login_time` datetime default NULL,
  `login_ip` varchar(50) default NULL,
  `browser_version` varchar(50) default NULL,
  `screen_size` varchar(50) default NULL,
  PRIMARY KEY  (`loginlog_id`),
  KEY `FK_loginlog_user_loginlog_id` (`user_id`),
  CONSTRAINT `FK_loginlog_user_loginlog_id` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_loginlog
-- ----------------------------
INSERT INTO `t_loginlog` VALUES ('3d0d1c524f1e08e704eb6b650f276d2a', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-08-19 09:58:23', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('66726138f72c517d8c88d905089c5895', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-12-31 14:28:35', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('92be7db5610576b7638908759efe0fbf', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-08-19 10:12:07', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('a0537aa7f4cf607efbe7e19e290cea44', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-07-30 10:23:18', '127.0.0.1[本地]', null, null);

-- ----------------------------
-- Table structure for `t_menu`
-- ----------------------------
DROP TABLE IF EXISTS `t_menu`;
CREATE TABLE `t_menu` (
  `menu_id` varchar(32) NOT NULL,
  `pid` varchar(32) default NULL,
  `menu_en_name` varchar(30) default NULL,
  `menu_cn_name` varchar(30) default NULL,
  `icon_cls` varchar(50) default NULL,
  `url` varchar(100) default NULL,
  `order_num` int(10) unsigned default NULL,
  `remark` varchar(255) default NULL,
  PRIMARY KEY  (`menu_id`),
  KEY `FK_menu2parent1N` (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_menu
-- ----------------------------
INSERT INTO `t_menu` VALUES ('14sdf54157cf483a790f4eea35dsf6f6', null, 'basicdatas', '参数管理', 'icon-standard-application-xp-terminal', '', '2', '');
INSERT INTO `t_menu` VALUES ('16ac1df11de350c61722dc7b98cecca7', null, 'system', '系统设置', 'icon-standard-cog', '', '1', '');
INSERT INTO `t_menu` VALUES ('54eb754157cf483a790f4eea35200118', '16ac1df11de350c61722dc7b98cecca7', 'res', '资源管理', 'icon-cologne-featured', '/do/res/index.htm', '3', '');
INSERT INTO `t_menu` VALUES ('91ca1b4b197688f21b68a72f69e09a8d', '16ac1df11de350c61722dc7b98cecca7', 'user', '管理员设置', 'icon-hamburg-hire-me', '/do/user/index.htm', '1', '');
INSERT INTO `t_menu` VALUES ('93f0fcfa7cdff069d929723062b53211', '14sdf54157cf483a790f4eea35dsf6f6', 'variables', '系统变量', 'icon-standard-layout-content', '/do/variables/index.htm', '2', '');
INSERT INTO `t_menu` VALUES ('ac892df07f9087fb1c89ac968bb5f555', '16ac1df11de350c61722dc7b98cecca7', 'operalog', '操作日志', 'icon-standard-report-key', '/do/operalog/index.htm', '5', '');
INSERT INTO `t_menu` VALUES ('e42b98561176563f930d82c80b041ed8', '16ac1df11de350c61722dc7b98cecca7', 'loginlog', '登录日志', 'icon-standard-report-edit', '/do/loginlog/index.htm', '4', '');
INSERT INTO `t_menu` VALUES ('e550884c5e6c1e94ee70cc833aa1c2b9', '16ac1df11de350c61722dc7b98cecca7', 'role', '角色管理', 'icon-hamburg-customers', '/do/role/index.htm', '2', '');
INSERT INTO `t_menu` VALUES ('sdsfeg4157cf483a790f4eea35ds5675', '14sdf54157cf483a790f4eea35dsf6f6', 'optgroup', '下拉项管理', 'icon-hamburg-sitemap', '/do/optgroup/index.htm', '3', '');

-- ----------------------------
-- Table structure for `t_operalog`
-- ----------------------------
DROP TABLE IF EXISTS `t_operalog`;
CREATE TABLE `t_operalog` (
  `operalog_id` varchar(32) NOT NULL COMMENT '主键',
  `opera_menu` varchar(255) default NULL COMMENT '操作菜单',
  `opera_penal` varchar(255) default NULL COMMENT '操作面板',
  `opera_method` varchar(255) default NULL COMMENT '操作方法',
  `opera_result` varchar(255) default NULL COMMENT '操作结果',
  `opera_desc` varchar(1000) default NULL COMMENT '返回内容',
  `opera_class` varchar(255) default NULL COMMENT '调用类',
  `opera_md` varchar(255) default NULL COMMENT '调用方法',
  `opera_key` varchar(255) default NULL COMMENT '操作KEY',
  `operator` varchar(32) default NULL COMMENT '操作人',
  `opera_time` datetime default NULL COMMENT '操作世间',
  PRIMARY KEY  (`operalog_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_operalog
-- ----------------------------
INSERT INTO `t_operalog` VALUES ('05fe654cae23afceb01ce8b387262823', '资源管理', '菜单树', '删除', '1', '成功删除名称为：[ 密保问题 ]菜单', 'com.glacier.frame.service.system.MenuService', 'delMenu', 'MenuTree_del', '超级管理员', '2014-12-31 14:35:45');
INSERT INTO `t_operalog` VALUES ('0631c9eea49b745c7476763a2392117f', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-12-31 14:31:19');
INSERT INTO `t_operalog` VALUES ('064e11bab8651702c64cc6333ca26b64', '资源管理', '操作列表', '删除', '1', '成功删除了[ 增加,修改,删除 ]操作!', 'com.glacier.frame.service.system.ActionService', 'delActions', 'ActionList_del', '超级管理员', '2014-12-31 14:28:44');
INSERT INTO `t_operalog` VALUES ('0c1687c53db579ae07163a13eaa163cb', '资源管理', '菜单树', '删除', '1', '成功删除名称为：[ 地区管理 ]菜单', 'com.glacier.frame.service.system.MenuService', 'delMenu', 'MenuTree_del', '超级管理员', '2014-12-31 14:36:33');
INSERT INTO `t_operalog` VALUES ('0dff465280ecb0f3b7be2ca4e18d841d', '资源管理', '面板列表', '删除', '1', '成功删除名称为：[ 积分列表 ]面板', 'com.glacier.frame.service.system.PanelService', 'delPanel', 'PanelList_del', '超级管理员', '2014-12-31 14:35:54');
INSERT INTO `t_operalog` VALUES ('11eb2ad1760385781f75e91972211f2e', '资源管理', '面板列表', '删除', '1', '成功删除名称为：[ 广告列表 ]面板', 'com.glacier.frame.service.system.PanelService', 'delPanel', 'PanelList_del', '超级管理员', '2014-12-31 14:29:39');
INSERT INTO `t_operalog` VALUES ('1a17b5675a462057534f6a6ed57a7bf9', '资源管理', '菜单树', '删除', '1', '成功删除名称为：[ 信息通知 ]菜单', 'com.glacier.frame.service.system.MenuService', 'delMenu', 'MenuTree_del', '超级管理员', '2014-12-31 14:32:24');
INSERT INTO `t_operalog` VALUES ('1ca515115cda920b31c538990f6a33c7', '资源管理', '面板列表', '删除', '1', '成功删除名称为：[ 密保列表 ]面板', 'com.glacier.frame.service.system.PanelService', 'delPanel', 'PanelList_del', '超级管理员', '2014-12-31 14:32:14');
INSERT INTO `t_operalog` VALUES ('1f8f267b61c31110ba508aca0e45172a', '资源管理', '菜单树', '删除', '1', '成功删除名称为：[ 公告管理 ]菜单', 'com.glacier.frame.service.system.MenuService', 'delMenu', 'MenuTree_del', '超级管理员', '2014-12-31 14:29:59');
INSERT INTO `t_operalog` VALUES ('24553cb90288f7ac60ed52f102d49f4b', '资源管理', '面板列表', '删除', '1', '成功删除名称为：[ 认证列表 ]面板', 'com.glacier.frame.service.system.PanelService', 'delPanel', 'PanelList_del', '超级管理员', '2014-12-31 14:32:02');
INSERT INTO `t_operalog` VALUES ('262cbd61be407e3f67ee94b516f8c999', '资源管理', '操作列表', '删除', '1', '成功删除了[ 增加,修改,删除 ]操作!', 'com.glacier.frame.service.system.ActionService', 'delActions', 'ActionList_del', '超级管理员', '2014-12-31 14:29:26');
INSERT INTO `t_operalog` VALUES ('2b7e40d761c8bd0363af15c0938d777f', '资源管理', '操作列表', '删除', '1', '成功删除了[ 增加,修改,删除 ]操作!', 'com.glacier.frame.service.system.ActionService', 'delActions', 'ActionList_del', '超级管理员', '2014-12-31 14:29:14');
INSERT INTO `t_operalog` VALUES ('2cbf66eaca4176ba0b3afc83b7cb12cb', '信用类别', '信用类别列表', '增加', '0', '积分类型重复', 'com.glacier.frame.service.basicdatas.ParameterIntegralTypeService', 'addCreditType', 'CreditTypeList_add', '超级管理员', '2014-08-19 10:47:36');
INSERT INTO `t_operalog` VALUES ('2cf4dd7cdfe4e4626d14d7526c803834', '资源管理', '菜单树', '删除', '1', '成功删除名称为：[ 会员信用 ]菜单', 'com.glacier.frame.service.system.MenuService', 'delMenu', 'MenuTree_del', '超级管理员', '2014-12-31 14:36:17');
INSERT INTO `t_operalog` VALUES ('3358cc28958b8b44bf53a279e604dd91', '资源管理', '操作列表', '删除', '1', '成功删除了[ 增加,修改,删除 ]操作!', 'com.glacier.frame.service.system.ActionService', 'delActions', 'ActionList_del', '超级管理员', '2014-12-31 14:29:52');
INSERT INTO `t_operalog` VALUES ('33b38bbce51fa47fcc9226456b4430ad', '资源管理', '面板列表', '删除', '1', '成功删除名称为：[ 地区树 ]面板', 'com.glacier.frame.service.system.PanelService', 'delPanel', 'PanelList_del', '超级管理员', '2014-12-31 14:36:32');
INSERT INTO `t_operalog` VALUES ('378ad535e46a46322088cae9754833e0', '资源管理', '面板列表', '删除', '1', '成功删除名称为：[ 年龄列表 ]面板', 'com.glacier.frame.service.system.PanelService', 'delPanel', 'PanelList_del', '超级管理员', '2014-12-31 14:35:30');
INSERT INTO `t_operalog` VALUES ('387853f7f6febf0171dfdf560b727107', '资源管理', '面板列表', '删除', '1', '成功删除名称为：[ 友情列表 ]面板', 'com.glacier.frame.service.system.PanelService', 'delPanel', 'PanelList_del', '超级管理员', '2014-12-31 14:29:08');
INSERT INTO `t_operalog` VALUES ('45d4a8e3e6c2fac1c00ef8dc74b3eebd', '资源管理', '操作列表', '删除', '1', '成功删除了[ 增加,修改,删除 ]操作!', 'com.glacier.frame.service.system.ActionService', 'delActions', 'ActionList_del', '超级管理员', '2014-12-31 14:29:06');
INSERT INTO `t_operalog` VALUES ('47530e61abd17ff77ab1b885cf45ddc7', '资源管理', '菜单树', '删除', '1', '成功删除名称为：[ 广告管理 ]菜单', 'com.glacier.frame.service.system.MenuService', 'delMenu', 'MenuTree_del', '超级管理员', '2014-12-31 14:29:41');
INSERT INTO `t_operalog` VALUES ('4be28889419a932a0552f90f8010f2a4', '资源管理', '菜单树', '删除', '1', '成功删除名称为：[ 会员认证 ]菜单', 'com.glacier.frame.service.system.MenuService', 'delMenu', 'MenuTree_del', '超级管理员', '2014-12-31 14:32:03');
INSERT INTO `t_operalog` VALUES ('521c9b8178d84dd849a26ae511784d20', '资源管理', '面板列表', '删除', '1', '成功删除名称为：[ 公告列表 ]面板', 'com.glacier.frame.service.system.PanelService', 'delPanel', 'PanelList_del', '超级管理员', '2014-12-31 14:29:56');
INSERT INTO `t_operalog` VALUES ('53754201efcdb23257bf7e85c75b0338', '资源管理', '操作列表', '删除', '1', '成功删除了[ 增加,修改,删除 ]操作!', 'com.glacier.frame.service.system.ActionService', 'delActions', 'ActionList_del', '超级管理员', '2014-12-31 14:36:00');
INSERT INTO `t_operalog` VALUES ('561afae43612de0afc16aaf6bd99fb86', '资源管理', '操作列表', '删除', '1', '成功删除了[ 审核 ]操作!', 'com.glacier.frame.service.system.ActionService', 'delActions', 'ActionList_del', '超级管理员', '2014-12-31 14:31:59');
INSERT INTO `t_operalog` VALUES ('59076d0da0779ef4433dc82d4bc5758f', '资源管理', '菜单树', '删除', '1', '成功删除名称为：[ 招聘信息 ]菜单', 'com.glacier.frame.service.system.MenuService', 'delMenu', 'MenuTree_del', '超级管理员', '2014-12-31 14:28:49');
INSERT INTO `t_operalog` VALUES ('5cd226e46a04a1606a6b3b1fb351095b', '资源管理', '菜单树', '删除', '1', '成功删除名称为：[ 新闻管理 ]菜单', 'com.glacier.frame.service.system.MenuService', 'delMenu', 'MenuTree_del', '超级管理员', '2014-12-31 14:29:29');
INSERT INTO `t_operalog` VALUES ('5f3452051811d3c38b1110449a7ae98b', '资源管理', '操作列表', '删除', '1', '成功删除了[ 增加,修改 ]操作!', 'com.glacier.frame.service.system.ActionService', 'delActions', 'ActionList_del', '超级管理员', '2014-12-31 14:32:33');
INSERT INTO `t_operalog` VALUES ('6011184886c05626fb10400f4df3bfff', '资源管理', '菜单树', '删除', '1', '成功删除名称为：[ 网站管理 ]菜单', 'com.glacier.frame.service.system.MenuService', 'delMenu', 'MenuTree_del', '超级管理员', '2014-12-31 14:30:03');
INSERT INTO `t_operalog` VALUES ('6107bf493a55290dddb2e99aac314e81', '资源管理', '操作列表', '删除', '1', '成功删除了[ 增加,修改,删除 ]操作!', 'com.glacier.frame.service.system.ActionService', 'delActions', 'ActionList_del', '超级管理员', '2014-12-31 14:36:13');
INSERT INTO `t_operalog` VALUES ('626eca78706b5b3d54250d440b344842', '资源管理', '面板列表', '删除', '1', '成功删除名称为：[ 帮助列表 ]面板', 'com.glacier.frame.service.system.PanelService', 'delPanel', 'PanelList_del', '超级管理员', '2014-12-31 14:28:59');
INSERT INTO `t_operalog` VALUES ('6cbafd390659e00583c34e3781dff72d', '资源管理', '操作列表', '删除', '1', '成功删除了[ 增加,修改,删除 ]操作!', 'com.glacier.frame.service.system.ActionService', 'delActions', 'ActionList_del', '超级管理员', '2014-12-31 14:29:44');
INSERT INTO `t_operalog` VALUES ('74a3f7923e0e669e1ba097533441841c', '资源管理', '菜单树', '删除', '1', '成功删除名称为：[ 帮助中心 ]菜单', 'com.glacier.frame.service.system.MenuService', 'delMenu', 'MenuTree_del', '超级管理员', '2014-12-31 14:29:01');
INSERT INTO `t_operalog` VALUES ('7c0dc6abf986abba09f0d58d4be6f28c', '资源管理', '操作列表', '删除', '1', '成功删除了[ 增加,修改,删除 ]操作!', 'com.glacier.frame.service.system.ActionService', 'delActions', 'ActionList_del', '超级管理员', '2014-12-31 14:35:48');
INSERT INTO `t_operalog` VALUES ('7cecb9b4446bfc1c40903f71cc053aa3', '资源管理', '操作列表', '删除', '1', '成功删除了[ 增加,修改,删除 ]操作!', 'com.glacier.frame.service.system.ActionService', 'delActions', 'ActionList_del', '超级管理员', '2014-12-31 14:28:53');
INSERT INTO `t_operalog` VALUES ('7d48639e2488f5aaa37ba9438894aaf0', '资源管理', '面板列表', '删除', '1', '成功删除名称为：[ 客服列表 ]面板', 'com.glacier.frame.service.system.PanelService', 'delPanel', 'PanelList_del', '超级管理员', '2014-12-31 14:29:17');
INSERT INTO `t_operalog` VALUES ('853fb341fd680d2141f1820146a8b444', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-12-31 14:35:11');
INSERT INTO `t_operalog` VALUES ('8694ef4247873c7f07513dff8d651bbd', '资源管理', '菜单树', '删除', '1', '成功删除名称为：[ 客服服务 ]菜单', 'com.glacier.frame.service.system.MenuService', 'delMenu', 'MenuTree_del', '超级管理员', '2014-12-31 14:29:19');
INSERT INTO `t_operalog` VALUES ('87e8b543c5e9813618b2c2a4abe08b4c', '资源管理', '面板列表', '删除', '1', '成功删除名称为：[ 积分类别列表 ]面板', 'com.glacier.frame.service.system.PanelService', 'delPanel', 'PanelList_del', '超级管理员', '2014-12-31 14:36:06');
INSERT INTO `t_operalog` VALUES ('89850e8c0e7ab1b98c8d2f26fcb338ba', '资源管理', '菜单树', '删除', '1', '成功删除名称为：[ 会员信息 ]菜单', 'com.glacier.frame.service.system.MenuService', 'delMenu', 'MenuTree_del', '超级管理员', '2014-12-31 14:32:40');
INSERT INTO `t_operalog` VALUES ('8b83cfa753c6ccdbd7974b468c38911a', '资源管理', '操作列表', '删除', '1', '成功删除了[ 增加,修改,删除 ]操作!', 'com.glacier.frame.service.system.ActionService', 'delActions', 'ActionList_del', '超级管理员', '2014-12-31 14:32:20');
INSERT INTO `t_operalog` VALUES ('933258267ef5188c20b68cb615376414', '资源管理', '操作列表', '删除', '1', '成功删除了[ 增加,修改,删除 ]操作!', 'com.glacier.frame.service.system.ActionService', 'delActions', 'ActionList_del', '超级管理员', '2014-12-31 14:36:20');
INSERT INTO `t_operalog` VALUES ('980cb76768c93642cb11bcc5232aff2d', '资源管理', '面板列表', '删除', '1', '成功删除名称为：[ 新闻列表 ]面板', 'com.glacier.frame.service.system.PanelService', 'delPanel', 'PanelList_del', '超级管理员', '2014-12-31 14:29:32');
INSERT INTO `t_operalog` VALUES ('9bed73c83c4405959a3c08350684b456', '资源管理', '操作列表', '删除', '1', '成功删除了[ 增加,修改,删除 ]操作!', 'com.glacier.frame.service.system.ActionService', 'delActions', 'ActionList_del', '超级管理员', '2014-12-31 14:35:39');
INSERT INTO `t_operalog` VALUES ('9d8bfb11383f676d8c21f6f8e8454a1c', '资源管理', '菜单树', '删除', '1', '成功删除名称为：[ 年龄别称 ]菜单', 'com.glacier.frame.service.system.MenuService', 'delMenu', 'MenuTree_del', '超级管理员', '2014-12-31 14:35:34');
INSERT INTO `t_operalog` VALUES ('a0721f925c5d5a8452ee96754d404198', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-12-31 14:34:58');
INSERT INTO `t_operalog` VALUES ('a327d2026cb26d1335b2962464e1709e', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-12-31 14:34:42');
INSERT INTO `t_operalog` VALUES ('a6facb2761361193ceb06ebc1f5d34e0', '资源管理', '菜单树', '删除', '1', '成功删除名称为：[ 积分类别 ]菜单', 'com.glacier.frame.service.system.MenuService', 'delMenu', 'MenuTree_del', '超级管理员', '2014-12-31 14:36:09');
INSERT INTO `t_operalog` VALUES ('a7d8b444bff8c906d97a8e292f2ec6a9', '资源管理', '面板列表', '删除', '1', '成功删除名称为：[ 导航树 ]面板', 'com.glacier.frame.service.system.PanelService', 'delPanel', 'PanelList_del', '超级管理员', '2014-12-31 14:29:47');
INSERT INTO `t_operalog` VALUES ('a7db3f38c3db73951408715b0b4325c0', '资源管理', '菜单树', '删除', '1', '成功删除名称为：[ 会员积分 ]菜单', 'com.glacier.frame.service.system.MenuService', 'delMenu', 'MenuTree_del', '超级管理员', '2014-12-31 14:35:51');
INSERT INTO `t_operalog` VALUES ('a991c1a498028a313b144bf44013a7a4', '资源管理', '操作列表', '删除', '1', '成功删除了[ 删除 ]操作!', 'com.glacier.frame.service.system.ActionService', 'delActions', 'ActionList_del', '超级管理员', '2014-12-31 14:32:12');
INSERT INTO `t_operalog` VALUES ('aaddbe543f896fe46fb0c03721744a96', '资源管理', '面板列表', '删除', '1', '成功删除名称为：[ 信用类别列表 ]面板', 'com.glacier.frame.service.system.PanelService', 'delPanel', 'PanelList_del', '超级管理员', '2014-12-31 14:36:23');
INSERT INTO `t_operalog` VALUES ('afba6ad0e3fdd6676ea00a8387b7dead', '信用类别', '信用类别列表', '增加', '1', '[啊啊] 积分类型信息已保存', 'com.glacier.frame.service.basicdatas.ParameterIntegralTypeService', 'addCreditType', 'CreditTypeList_add', '超级管理员', '2014-08-19 10:44:16');
INSERT INTO `t_operalog` VALUES ('b0b06ca412c150f9f8747651489e75ea', '资源管理', '面板列表', '删除', '1', '成功删除名称为：[ 信用列表 ]面板', 'com.glacier.frame.service.system.PanelService', 'delPanel', 'PanelList_del', '超级管理员', '2014-12-31 14:36:16');
INSERT INTO `t_operalog` VALUES ('b0b738e87fb34016101ac312f251ac6f', '操作日志', '操作日志列表', '删除', '0', '发生未知错误，操作日志信息删除失败', 'com.glacier.frame.service.system.OperaLogService', 'delOperaLog', 'OperalogList_del', '超级管理员', '2014-12-31 14:27:57');
INSERT INTO `t_operalog` VALUES ('b3a52bf3d07f6e2cb071b224c821b565', '资源管理', '操作列表', '删除', '1', '成功删除了[ 增加,修改,删除 ]操作!', 'com.glacier.frame.service.system.ActionService', 'delActions', 'ActionList_del', '超级管理员', '2014-12-31 14:36:29');
INSERT INTO `t_operalog` VALUES ('b3b8cb97635df979d7059ebf0e31777a', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-12-31 14:35:15');
INSERT INTO `t_operalog` VALUES ('b79a4a8cb0c2a47d1a06692d9073db6d', '资源管理', '菜单树', '删除', '1', '成功删除名称为：[ 信用类别 ]菜单', 'com.glacier.frame.service.system.MenuService', 'delMenu', 'MenuTree_del', '超级管理员', '2014-12-31 14:36:25');
INSERT INTO `t_operalog` VALUES ('bfb471c07d7b1b419c16e97314172e34', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-12-31 14:31:29');
INSERT INTO `t_operalog` VALUES ('c0df6f574c0af6e729d774803a4ad61c', '资源管理', '面板列表', '删除', '1', '成功删除名称为：[ 招聘列表 ]面板', 'com.glacier.frame.service.system.PanelService', 'delPanel', 'PanelList_del', '超级管理员', '2014-12-31 14:28:47');
INSERT INTO `t_operalog` VALUES ('c1fe0f63c1c8d95bb09487165f6183f6', '资源管理', '菜单树', '删除', '1', '成功删除名称为：[ 会员管理 ]菜单', 'com.glacier.frame.service.system.MenuService', 'delMenu', 'MenuTree_del', '超级管理员', '2014-12-31 14:32:44');
INSERT INTO `t_operalog` VALUES ('c44089ea2605d99c930f19596778a9aa', '信用类别', '信用类别列表', '增加', '1', '[logins] 积分类型信息已保存', 'com.glacier.frame.service.basicdatas.ParameterIntegralTypeService', 'addCreditType', 'CreditTypeList_add', '超级管理员', '2014-08-19 10:47:41');
INSERT INTO `t_operalog` VALUES ('c629f3e7c37bef2496d13aff0b39cb5c', '资源管理', '菜单树', '删除', '1', '成功删除名称为：[ 信用记录 ]菜单', 'com.glacier.frame.service.system.MenuService', 'delMenu', 'MenuTree_del', '超级管理员', '2014-12-31 14:32:07');
INSERT INTO `t_operalog` VALUES ('ca3630bec5cabc48f82fa46e25af6e38', '资源管理', '菜单树', '删除', '1', '成功删除名称为：[ 积分记录 ]菜单', 'com.glacier.frame.service.system.MenuService', 'delMenu', 'MenuTree_del', '超级管理员', '2014-12-31 14:32:29');
INSERT INTO `t_operalog` VALUES ('cb19ca71bf439b1e21017b23b57a9945', '角色管理', '角色列表', '增加', '1', '[kk] 角色信息已保存', 'com.glacier.frame.service.system.RoleService', 'addRole', 'RoleList_add', '超级管理员', '2014-08-19 10:00:11');
INSERT INTO `t_operalog` VALUES ('da702b731e94fc2258f7384b3ae24449', '资源管理', '操作列表', '删除', '1', '成功删除了[ 增加,修改,删除 ]操作!', 'com.glacier.frame.service.system.ActionService', 'delActions', 'ActionList_del', '超级管理员', '2014-12-31 14:29:36');
INSERT INTO `t_operalog` VALUES ('e03ef03d8650f06f94bd9aaa417d0054', '资源管理', '操作列表', '删除', '1', '成功删除了[ 增加,修改,删除 ]操作!', 'com.glacier.frame.service.system.ActionService', 'delActions', 'ActionList_del', '超级管理员', '2014-12-31 14:28:08');
INSERT INTO `t_operalog` VALUES ('e177d1748858fbe28f45ee8caf15cdac', '资源管理', '菜单树', '删除', '1', '成功删除名称为：[ 密保管理 ]菜单', 'com.glacier.frame.service.system.MenuService', 'delMenu', 'MenuTree_del', '超级管理员', '2014-12-31 14:32:16');
INSERT INTO `t_operalog` VALUES ('e27338ad66973cce812adc77e20186e1', '资源管理', '面板列表', '删除', '1', '成功删除名称为：[ 会员信息列表 ]面板', 'com.glacier.frame.service.system.PanelService', 'delPanel', 'PanelList_del', '超级管理员', '2014-12-31 14:32:38');
INSERT INTO `t_operalog` VALUES ('e416d1a156d40d82d770fdd9ca540e05', '资源管理', '操作列表', '删除', '1', '成功删除了[ 增加,修改,删除 ]操作!', 'com.glacier.frame.service.system.ActionService', 'delActions', 'ActionList_del', '超级管理员', '2014-12-31 14:35:27');
INSERT INTO `t_operalog` VALUES ('eb94787cb96cb23ec98f897142bf7e97', '登录日志', '登录日志列表', '删除', '1', '成功删除了[ 超级管理员 ]操作', 'com.glacier.frame.service.system.LoginLogService', 'delLoginLog', 'LoginlogList_del', '超级管理员', '2014-08-18 15:22:47');
INSERT INTO `t_operalog` VALUES ('ef33776fca800550c25072cf16c23824', '资源管理', '面板列表', '删除', '1', '成功删除名称为：[ 问题列表 ]面板', 'com.glacier.frame.service.system.PanelService', 'delPanel', 'PanelList_del', '超级管理员', '2014-12-31 14:35:43');
INSERT INTO `t_operalog` VALUES ('f1bfd1d6169d0463b010ea233a642ffd', '资源管理', '菜单树', '删除', '1', '成功删除名称为：[ 友情链接 ]菜单', 'com.glacier.frame.service.system.MenuService', 'delMenu', 'MenuTree_del', '超级管理员', '2014-12-31 14:29:10');
INSERT INTO `t_operalog` VALUES ('f733dc1c8a18d34e67b782451ec91e40', '资源管理', '菜单树', '删除', '1', '成功删除名称为：[ 导航信息 ]菜单', 'com.glacier.frame.service.system.MenuService', 'delMenu', 'MenuTree_del', '超级管理员', '2014-12-31 14:29:49');
INSERT INTO `t_operalog` VALUES ('fc9d774284e285d245b6408cd0cd261d', '资源管理', '面板列表', '删除', '1', '成功删除名称为：[ 信息通知列表 ]面板', 'com.glacier.frame.service.system.PanelService', 'delPanel', 'PanelList_del', '超级管理员', '2014-12-31 14:32:23');
INSERT INTO `t_operalog` VALUES ('fd4c86cf943dc5b7c8d9f11a3879faec', '资源管理', '面板列表', '删除', '0', '发生未知错误，[ 招聘列表 ]面板删除失败', 'com.glacier.frame.service.system.PanelService', 'delPanel', 'PanelList_del', '超级管理员', '2014-12-31 14:28:56');

-- ----------------------------
-- Table structure for `t_panel`
-- ----------------------------
DROP TABLE IF EXISTS `t_panel`;
CREATE TABLE `t_panel` (
  `panel_id` varchar(32) NOT NULL,
  `menu_id` varchar(32) default NULL,
  `panel_cn_name` varchar(50) default NULL,
  `panel_en_name` varchar(50) default NULL,
  `order_num` int(11) default NULL,
  PRIMARY KEY  (`panel_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_panel
-- ----------------------------
INSERT INTO `t_panel` VALUES ('3456eg4157cf483a790f4eea35ds5675', 'sdsfeg4157cf483a790f4eea35ds5675', '下拉列表', 'OptgroupValueList', '1');
INSERT INTO `t_panel` VALUES ('37011217016636a0723462dbc81bf887', '91ca1b4b197688f21b68a72f69e09a8d', '管理员列表', 'UserList', '1');
INSERT INTO `t_panel` VALUES ('3fae5276226498a6cb1b5cf466793cd6', '14sdf54157cf483a790f4eea35dsf6f6', '信用类别', 'creditType', '27');
INSERT INTO `t_panel` VALUES ('4546fgrgrh1dfhsjdfh124564sdf2sag', 'sdsfeg4157cf483a790f4eea35ds5675', '下拉项树', 'OptgroupTree', '2');
INSERT INTO `t_panel` VALUES ('557cf8b2740e6792f517138703afb407', 'ac892df07f9087fb1c89ac968bb5f555', '操作日志列表', 'OperalogList', '1');
INSERT INTO `t_panel` VALUES ('5731697aea23532eb8162f5ba1818c6f', '54eb754157cf483a790f4eea35200118', '菜单树', 'MenuTree', '1');
INSERT INTO `t_panel` VALUES ('60ef5b40e8753bdc2909a2413a379091', '14sdf54157cf483a790f4eea35dsf6f6', 'asdf', 'adf', '1');
INSERT INTO `t_panel` VALUES ('83bbeed02a85549ae84cde8d98bcd8c1', 'e550884c5e6c1e94ee70cc833aa1c2b9', '角色列表', 'RoleList', '1');
INSERT INTO `t_panel` VALUES ('961d2e73b3fa93a9f125fb731e0a9529', '54eb754157cf483a790f4eea35200118', '面板列表', 'PanelList', '2');
INSERT INTO `t_panel` VALUES ('e6784ccad10e3414b99b77b303a338c7', '93f0fcfa7cdff069d929723062b53211', '变量列表', 'VariablesList', '1');
INSERT INTO `t_panel` VALUES ('eb2a84c4b7bd11632135e4992ade286e', '54eb754157cf483a790f4eea35200118', '操作列表', 'ActionList', '3');
INSERT INTO `t_panel` VALUES ('f769a64bb571aa0c7ac269b807af4782', 'e42b98561176563f930d82c80b041ed8', '登录日志列表', 'LoginlogList', '1');

-- ----------------------------
-- Table structure for `t_parameter_optgroup`
-- ----------------------------
DROP TABLE IF EXISTS `t_parameter_optgroup`;
CREATE TABLE `t_parameter_optgroup` (
  `optgroup_id` varchar(32) NOT NULL,
  `optgroup_pid` varchar(32) default NULL,
  `optgroup_code` varchar(50) default NULL,
  `optgroup_name` varchar(50) default NULL,
  `optgroup_icon` varchar(50) default NULL,
  `optgroup_url` varchar(50) default NULL,
  `optgroup_num` int(11) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`optgroup_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='参数设置的基础资料下的下拉项管理设置。';

-- ----------------------------
-- Records of t_parameter_optgroup
-- ----------------------------
INSERT INTO `t_parameter_optgroup` VALUES ('067abb1f4a35c41ddce2c3e1dcb45e65', '70f3280adc4b70b24d945e247909adbc', 'integralType', '积分类型', null, null, '6', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-19 13:44:37', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:06:20');
INSERT INTO `t_parameter_optgroup` VALUES ('0af82d4dabd9cb2b809f01578965e028', '524a5f048b92584ff849a206f3c53076', 'help', '帮助中心', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 10:57:41', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:34:53');
INSERT INTO `t_parameter_optgroup` VALUES ('0b6919d96ff46e91471d9714bd1d205f', '113afb2ecac88fe851ad501c53b7d82b', 'auditState', '审核状态', null, null, '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-02 15:15:43', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:04:04');
INSERT INTO `t_parameter_optgroup` VALUES ('113afb2ecac88fe851ad501c53b7d82b', null, 'common', '公用下拉项', null, null, '7', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:29:29', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 09:40:24');
INSERT INTO `t_parameter_optgroup` VALUES ('163d9c2f8c189e64658e79e4e78aef73', '70f3280adc4b70b24d945e247909adbc', 'ageExpenses', '供款状况', null, null, '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 10:49:08', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:09:11');
INSERT INTO `t_parameter_optgroup` VALUES ('1bf27bce9c73b22e9822fb85380ac347', '113afb2ecac88fe851ad501c53b7d82b', 'status', '状态', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:34:53', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:37:23');
INSERT INTO `t_parameter_optgroup` VALUES ('270360ceaa6ad462229f98b356909829', '70f3280adc4b70b24d945e247909adbc', 'letterstatus', '信件状态', null, null, '9', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-09 14:09:56', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:07:01');
INSERT INTO `t_parameter_optgroup` VALUES ('28ee70d89cd44ab3e8f6a54929a47952', '0af82d4dabd9cb2b809f01578965e028', 'webHelpType', '帮助中心类型', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 10:59:38', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:34:53');
INSERT INTO `t_parameter_optgroup` VALUES ('2rtfdg1rgrh1dfhsjdfh124564sdf21d', null, 'system', '系统设置', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:34:53', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:12:31');
INSERT INTO `t_parameter_optgroup` VALUES ('35a594e3165ef413550cfd413fc33642', '70f3280adc4b70b24d945e247909adbc', 'bankCardAuths', '银行卡认证', null, null, '15', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-08 17:46:57', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:11:02');
INSERT INTO `t_parameter_optgroup` VALUES ('3be6f556f18b7763c74eb3e6fd992785', '70f3280adc4b70b24d945e247909adbc', 'applyType', '申请类型', null, null, '8', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:01:50', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:01:50');
INSERT INTO `t_parameter_optgroup` VALUES ('3de467b04ce8984ae48ba243eb25ffb2', null, 'basicdatas', '参数管理', null, null, '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:15:47', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:12:47');
INSERT INTO `t_parameter_optgroup` VALUES ('4776fe7b0e02b3467b4ea41c7e237223', '70f3280adc4b70b24d945e247909adbc', 'buyCar', '是否购车', null, null, '14', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:39:25', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:10:53');
INSERT INTO `t_parameter_optgroup` VALUES ('50891ccba80188b42cb263699ca7f689', '70f3280adc4b70b24d945e247909adbc', 'lettertype', '信件类型', null, null, '10', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-16 15:06:13', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:08:20');
INSERT INTO `t_parameter_optgroup` VALUES ('524a5f048b92584ff849a206f3c53076', null, 'website', '网站管理', null, null, '6', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 10:56:19', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:13:50');
INSERT INTO `t_parameter_optgroup` VALUES ('676531ee865ec4ed5f3c3ca029596293', '70f3280adc4b70b24d945e247909adbc', 'type', '类型', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:24:04', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 11:08:32');
INSERT INTO `t_parameter_optgroup` VALUES ('70f3280adc4b70b24d945e247909adbc', null, 'memberMgr', '会员管理', null, null, '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:23:11', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:12:56');
INSERT INTO `t_parameter_optgroup` VALUES ('7114c42efa5349f4c8874787fde91633', 'bd88aee43efe41a6ebd10b263fa29ed1', 'formType', '表单类型', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:19:08', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:04:35');
INSERT INTO `t_parameter_optgroup` VALUES ('7224e23dff0a3b71faa0a2739bd03341', '70f3280adc4b70b24d945e247909adbc', 'changeType', '改变类型', null, null, '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 10:57:24', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 11:02:58');
INSERT INTO `t_parameter_optgroup` VALUES ('723e02be061a63f73629257804c75f46', '70f3280adc4b70b24d945e247909adbc', 'auths', '认证状态', null, null, '5', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 13:24:24', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:05:48');
INSERT INTO `t_parameter_optgroup` VALUES ('79be87300c0df2a803dd75221f9ca0b0', '70f3280adc4b70b24d945e247909adbc', 'creditIntegralType', '信用积分类型', null, null, '7', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 10:55:29', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:06:35');
INSERT INTO `t_parameter_optgroup` VALUES ('87e805fcf0c779b8f57fde22d819e2db', '113afb2ecac88fe851ad501c53b7d82b', 'sex', '性别', null, null, '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:11:51', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:52:39');
INSERT INTO `t_parameter_optgroup` VALUES ('aa2fe4d8f0b757d1329ba54745721d23', '70f3280adc4b70b24d945e247909adbc', 'authType', '认证类型', null, null, '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:30:00', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:05:37');
INSERT INTO `t_parameter_optgroup` VALUES ('b5ac6ebbc227b3a2cfe5b75ae48d81ca', '70f3280adc4b70b24d945e247909adbc', 'contactRelation', '联系人关系', null, null, '11', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 11:03:24', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:10:22');
INSERT INTO `t_parameter_optgroup` VALUES ('bd88aee43efe41a6ebd10b263fa29ed1', '3de467b04ce8984ae48ba243eb25ffb2', 'variables', '系统变量', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:18:18', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:04:28');
INSERT INTO `t_parameter_optgroup` VALUES ('f162bad386611ea6705db86adce95fc7', '70f3280adc4b70b24d945e247909adbc', 'maritalStatus', '婚姻状况', null, null, '12', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:47:02', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:10:27');
INSERT INTO `t_parameter_optgroup` VALUES ('f2cbc02d97c7bdefcb7947ef6d1c9839', '70f3280adc4b70b24d945e247909adbc', 'buyEstate', '是否购房', null, null, '13', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:36:41', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:10:34');
INSERT INTO `t_parameter_optgroup` VALUES ('fdf78bcc980b29a21a65131eab1c1b38', '113afb2ecac88fe851ad501c53b7d82b', 'builtin', '内置', null, null, '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:34:53', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:04:12');
INSERT INTO `t_parameter_optgroup` VALUES ('ss34g1rgrh1dfhsjdfh124564sdf21d', '2rtfdg1rgrh1dfhsjdfh124564sdf21d', 'user', '用户设置', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:34:53', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:11:25');

-- ----------------------------
-- Table structure for `t_parameter_optgroup_value`
-- ----------------------------
DROP TABLE IF EXISTS `t_parameter_optgroup_value`;
CREATE TABLE `t_parameter_optgroup_value` (
  `optgroup_value_id` varchar(32) NOT NULL,
  `optgroup_id` varchar(32) default NULL,
  `optgroup_value_code` varchar(50) default NULL,
  `optgroup_value_name` varchar(50) default NULL,
  `status` enum('enable','disable') default NULL,
  `optgroup_value_num` int(11) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`optgroup_value_id`),
  KEY `FK_t_optvalue_t_parameter_optgroup_optgroup_id` (`optgroup_id`),
  CONSTRAINT `FK_t_optvalue_t_parameter_optgroup_optgroup_id` FOREIGN KEY (`optgroup_id`) REFERENCES `t_parameter_optgroup` (`optgroup_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='参数设置的基础资料下的下拉项值设置。';

-- ----------------------------
-- Records of t_parameter_optgroup_value
-- ----------------------------
INSERT INTO `t_parameter_optgroup_value` VALUES ('01e83c3c661abd8809c87f0e576311ae', '79be87300c0df2a803dd75221f9ca0b0', 'realNameAuth', '实名认证信用积分', 'enable', '8', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 17:20:55', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 17:20:55');
INSERT INTO `t_parameter_optgroup_value` VALUES ('02df4e5c07bb38221b41c9c74448fd8f', '87e805fcf0c779b8f57fde22d819e2db', 'secret', '保密', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:55:17', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:55:17');
INSERT INTO `t_parameter_optgroup_value` VALUES ('0615767fa982aecbfaf3481782f0ca9d', '723e02be061a63f73629257804c75f46', 'failure', '不通过', 'enable', '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 13:27:22', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 13:27:22');
INSERT INTO `t_parameter_optgroup_value` VALUES ('0de4cdf1498363b60228266317c050c1', '067abb1f4a35c41ddce2c3e1dcb45e65', 'withdraw', '提现', 'enable', '5', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 17:20:16', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 17:20:16');
INSERT INTO `t_parameter_optgroup_value` VALUES ('0f092de3c9d78e87828887caa70344e4', '79be87300c0df2a803dd75221f9ca0b0', 'CancelCompanyAuth', '取消企业认证审核', 'enable', '16', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:26:07', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:26:07');
INSERT INTO `t_parameter_optgroup_value` VALUES ('13ede9705189fd37fc29f20f9c993da1', '723e02be061a63f73629257804c75f46', 'noapply', '未申请', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 13:25:53', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 13:25:53');
INSERT INTO `t_parameter_optgroup_value` VALUES ('19c24a40147510aa21c7f28e72dd8d05', '79be87300c0df2a803dd75221f9ca0b0', 'emailAuth', '邮箱认证信用积分', 'enable', '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 16:58:57', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 16:58:57');
INSERT INTO `t_parameter_optgroup_value` VALUES ('1a41da9325b5db271741f2245055095b', '28ee70d89cd44ab3e8f6a54929a47952', 'borrow', '借款', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 11:01:18', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('1b6a3d921eccdf2c1852a7a5b7df608a', 'f162bad386611ea6705db86adce95fc7', 'married', '已结婚', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:47:49', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:47:49');
INSERT INTO `t_parameter_optgroup_value` VALUES ('1ed2d672131c69ea00a61b0edd2d5358', 'fdf78bcc980b29a21a65131eab1c1b38', 'builtin', '内置', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:31:13', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:42:00');
INSERT INTO `t_parameter_optgroup_value` VALUES ('233cd9f2502854bc1769282d4690bf3f', '79be87300c0df2a803dd75221f9ca0b0', 'idCardAuth', '身份认证信用积分', 'enable', '9', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 17:21:41', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 17:21:41');
INSERT INTO `t_parameter_optgroup_value` VALUES ('235165418eb735d5dfe7bd76638b3072', '79be87300c0df2a803dd75221f9ca0b0', 'CancelWorkAuth', '取消工作认证审核', 'enable', '11', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:06:09', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:06:09');
INSERT INTO `t_parameter_optgroup_value` VALUES ('239294f5e95b8d95911c4227eb2473e4', 'fdf78bcc980b29a21a65131eab1c1b38', 'custom', '自定义', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:31:32', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:42:04');
INSERT INTO `t_parameter_optgroup_value` VALUES ('25d256039589f8fbf89a4da80b941b36', '79be87300c0df2a803dd75221f9ca0b0', 'creditAuth', '信用认证信用积分', 'enable', '6', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 17:01:28', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 17:01:28');
INSERT INTO `t_parameter_optgroup_value` VALUES ('27e48a33bc0571eae87094a06c108d06', '50891ccba80188b42cb263699ca7f689', 'system', '系统消息', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-16 15:07:24', '8b25651c2d896297530b64e4b80ec503', '2014-06-16 15:07:24');
INSERT INTO `t_parameter_optgroup_value` VALUES ('2c663921507de7b121d37b460d65b5c4', 'fdf78bcc980b29a21a65131eab1c1b38', 'admin', '管理员', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:41:48');
INSERT INTO `t_parameter_optgroup_value` VALUES ('31d06b659676b6fa953d3cb25e680315', '79be87300c0df2a803dd75221f9ca0b0', 'CancelemailAuth', '取消邮箱认证审核', 'enable', '12', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:18:10', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:18:10');
INSERT INTO `t_parameter_optgroup_value` VALUES ('3415704bbd2882779d7c6699c987d1d4', '79be87300c0df2a803dd75221f9ca0b0', 'CancelInfoAuth', '取消信息认证审核', 'enable', '14', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:23:08', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:23:08');
INSERT INTO `t_parameter_optgroup_value` VALUES ('34bffacc5214b5e8656b30aede271ef4', '79be87300c0df2a803dd75221f9ca0b0', 'CancelMobileAuth', '取消手机认证审核', 'enable', '19', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:27:50', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:27:50');
INSERT INTO `t_parameter_optgroup_value` VALUES ('38def58eb2727ac6f7dd1032a5d9e434', '270360ceaa6ad462229f98b356909829', 'unread', '未读', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-09 14:10:34', '8b25651c2d896297530b64e4b80ec503', '2014-04-09 14:10:34');
INSERT INTO `t_parameter_optgroup_value` VALUES ('3f536b628f1d014dd731e7f0bc6a63e7', '3be6f556f18b7763c74eb3e6fd992785', 'phone', '电话', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:02:21', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:02:21');
INSERT INTO `t_parameter_optgroup_value` VALUES ('3sfsaf1231452112121525as5fsdf454', '1bf27bce9c73b22e9822fb85380ac347', 'enable', '启用', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 14:42:47');
INSERT INTO `t_parameter_optgroup_value` VALUES ('40d86ed33a48a1aa128fd2defaaeebea', 'aa2fe4d8f0b757d1329ba54745721d23', 'idCardAuth', '身份证认证', 'enable', '8', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:34:13', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:34:13');
INSERT INTO `t_parameter_optgroup_value` VALUES ('41ad6336a2e35dd9d67ed0ece74ad155', '7114c42efa5349f4c8874787fde91633', 'input', '输入框', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:53:45', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('42b0cbbb83cadb318ca8e134f69909d4', '35a594e3165ef413550cfd413fc33642', 'authstr', '待审核', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-08 17:48:13', '8b25651c2d896297530b64e4b80ec503', '2014-04-08 17:48:13');
INSERT INTO `t_parameter_optgroup_value` VALUES ('4346c17adc9f4b126baa6e593dfb1219', '87e805fcf0c779b8f57fde22d819e2db', 'man', '男', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:54:45', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:54:45');
INSERT INTO `t_parameter_optgroup_value` VALUES ('444bea0a1319a559f8dad6e569737fb0', '067abb1f4a35c41ddce2c3e1dcb45e65', 'invest', '投资', 'enable', '3', '投资获取积分', '8b25651c2d896297530b64e4b80ec503', '2014-06-19 13:47:07', '8b25651c2d896297530b64e4b80ec503', '2014-06-19 13:47:07');
INSERT INTO `t_parameter_optgroup_value` VALUES ('45ed46f38b64e660713c065abcf2be95', '79be87300c0df2a803dd75221f9ca0b0', 'companyAuth', '企业认证信用积分', 'enable', '7', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 17:01:53', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 17:01:53');
INSERT INTO `t_parameter_optgroup_value` VALUES ('48219c94dc94c86116997c48c910500e', '676531ee865ec4ed5f3c3ca029596293', 'vip', 'vip会员', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:32:30', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('4dc1fd5f1ac24e8807f59254139b0912', '79be87300c0df2a803dd75221f9ca0b0', 'infoAuth', '基本信息认证信用积分', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 10:56:43', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 16:56:36');
INSERT INTO `t_parameter_optgroup_value` VALUES ('5122f4929b14499ebd97f7f99552d5c7', '28ee70d89cd44ab3e8f6a54929a47952', 'fund', '基金', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 11:02:27', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('538c0911b50592e0546800ddffd1fc5b', 'f2cbc02d97c7bdefcb7947ef6d1c9839', 'havehouse', '已购房', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:38:21', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:38:21');
INSERT INTO `t_parameter_optgroup_value` VALUES ('56eeec8a7371ddf86b432b42ff999b4f', '79be87300c0df2a803dd75221f9ca0b0', 'CancelIdCardAuth', '取消身份认证审核', 'enable', '17', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:26:39', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:26:39');
INSERT INTO `t_parameter_optgroup_value` VALUES ('5be37ff93bdc78b8457a0584f2713c9f', '4776fe7b0e02b3467b4ea41c7e237223', 'nocar', '未购车', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:54:36', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:54:36');
INSERT INTO `t_parameter_optgroup_value` VALUES ('5dfs2d1f32sd1f2sd1f2sd1f256565sd', '1bf27bce9c73b22e9822fb85380ac347', 'disable', '禁用', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 14:42:50');
INSERT INTO `t_parameter_optgroup_value` VALUES ('6282d9040a2029a89017d1998e4ad476', '3be6f556f18b7763c74eb3e6fd992785', 'internet', '互联网', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:02:37', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:02:37');
INSERT INTO `t_parameter_optgroup_value` VALUES ('6389ad1302b149b26120f9762f2393a9', '79be87300c0df2a803dd75221f9ca0b0', 'mobileAuth', '手机认证信用积分', 'enable', '5', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 16:59:32', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 16:59:32');
INSERT INTO `t_parameter_optgroup_value` VALUES ('66416703e266b5af49036fde2020789e', 'b5ac6ebbc227b3a2cfe5b75ae48d81ca', 'friend', '朋友', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 11:04:15', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 11:04:15');
INSERT INTO `t_parameter_optgroup_value` VALUES ('6769699850e2ea349a9e5e24117da8dc', 'aa2fe4d8f0b757d1329ba54745721d23', 'realNameAuth', '真实姓名认证', 'enable', '7', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:33:41', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:33:41');
INSERT INTO `t_parameter_optgroup_value` VALUES ('6796d7bfab06bd3966cacc94258f98bd', 'f2cbc02d97c7bdefcb7947ef6d1c9839', 'nohouse', '未购房', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:38:39', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:38:39');
INSERT INTO `t_parameter_optgroup_value` VALUES ('6c1746ab0796dc6eab250aac44ea81f6', '35a594e3165ef413550cfd413fc33642', 'failure', '不通过', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-08 17:47:57', '8b25651c2d896297530b64e4b80ec503', '2014-04-08 17:47:57');
INSERT INTO `t_parameter_optgroup_value` VALUES ('6d1af7e5738a6764d5d15357ad6d44cf', 'aa2fe4d8f0b757d1329ba54745721d23', 'emailAuth', '邮箱认证', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:32:13', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:32:13');
INSERT INTO `t_parameter_optgroup_value` VALUES ('6fa46bf6f61a4794f427337fcbffdb1f', '163d9c2f8c189e64658e79e4e78aef73', 'finished', '购买完成', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 10:50:34', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 10:50:34');
INSERT INTO `t_parameter_optgroup_value` VALUES ('739dcd0db0c97cb552b4b21d12fab839', 'aa2fe4d8f0b757d1329ba54745721d23', 'companyAuth', '企业认证', 'enable', '6', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:33:22', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:33:22');
INSERT INTO `t_parameter_optgroup_value` VALUES ('85db75ec028f7cbbb412331e8c035470', '7114c42efa5349f4c8874787fde91633', 'textarea', '文本框', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:54:06', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('88059e49f722a35f308078da1c5713d1', '676531ee865ec4ed5f3c3ca029596293', 'general', '普通会员', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:25:07', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('88b3276bf8a64a68b2bea24bfaa55c8a', 'aa2fe4d8f0b757d1329ba54745721d23', 'infoAuth', '基础资料认证', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:31:06', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:31:06');
INSERT INTO `t_parameter_optgroup_value` VALUES ('88d2f9676c58e8c8503fd8341188d22c', '3be6f556f18b7763c74eb3e6fd992785', 'scene', '现场', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:02:55', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:02:55');
INSERT INTO `t_parameter_optgroup_value` VALUES ('8bd22429b25a09ae88dfca998475c9f0', '270360ceaa6ad462229f98b356909829', 'delete', '删除', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-09 14:11:19', '8b25651c2d896297530b64e4b80ec503', '2014-04-09 14:11:19');
INSERT INTO `t_parameter_optgroup_value` VALUES ('8ec85c8e13abad5110a27d7daeff7861', '7224e23dff0a3b71faa0a2739bd03341', 'reduction', '减少', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 10:58:20', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 10:58:20');
INSERT INTO `t_parameter_optgroup_value` VALUES ('92585169762ebad8a4fc2d28bf7865dd', '35a594e3165ef413550cfd413fc33642', 'changing', '变更中', 'enable', '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-08 17:48:32', '8b25651c2d896297530b64e4b80ec503', '2014-04-08 17:48:32');
INSERT INTO `t_parameter_optgroup_value` VALUES ('929772e69691022e11eec98422cce15f', '79be87300c0df2a803dd75221f9ca0b0', 'CancelCreditAuth', '取消信用认证审核', 'enable', '13', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:20:24', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:20:24');
INSERT INTO `t_parameter_optgroup_value` VALUES ('9800aa3a72ecf3a0a3ba7008e4e5804b', 'aa2fe4d8f0b757d1329ba54745721d23', 'vipAuth', 'VIP认证', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:31:54', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:31:54');
INSERT INTO `t_parameter_optgroup_value` VALUES ('9e1cf045b48daf41b02b2e1cd6b5d271', 'aa2fe4d8f0b757d1329ba54745721d23', 'creditAuth', '信用认证', 'enable', '5', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:32:50', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:32:50');
INSERT INTO `t_parameter_optgroup_value` VALUES ('9f82df6d34e2a30b6d739abc1c173188', 'f162bad386611ea6705db86adce95fc7', 'single', '单身', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:48:15', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:48:15');
INSERT INTO `t_parameter_optgroup_value` VALUES ('a046211d69ac7de678e2e1cbcedf5c7c', '7224e23dff0a3b71faa0a2739bd03341', 'increase', '增加', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 10:57:58', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 10:57:58');
INSERT INTO `t_parameter_optgroup_value` VALUES ('a0ea94aac7c6f682a5de9593bcfcf867', '79be87300c0df2a803dd75221f9ca0b0', 'CancelIdCardAuth', '取消身份认证审核', 'enable', '17', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:26:39', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:26:39');
INSERT INTO `t_parameter_optgroup_value` VALUES ('a125b18d3e4af3551f20934c49b88c39', 'aa2fe4d8f0b757d1329ba54745721d23', 'workAuth', '工作认证', 'enable', '9', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:34:28', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:34:28');
INSERT INTO `t_parameter_optgroup_value` VALUES ('a25bd70a928aa93d7e95cfba53d12a10', '79be87300c0df2a803dd75221f9ca0b0', 'CancelRealNameAuth', '取消实名认证审核', 'enable', '18', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:27:27', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:27:27');
INSERT INTO `t_parameter_optgroup_value` VALUES ('a7a015d101c9c15598874faaab0c3292', '723e02be061a63f73629257804c75f46', 'pass', '通过', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 13:26:58', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 13:26:58');
INSERT INTO `t_parameter_optgroup_value` VALUES ('aa64b3148747c20abb499a752ab16858', '79be87300c0df2a803dd75221f9ca0b0', 'workAuth', '工作认证信用积分', 'enable', '10', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 17:23:02', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 17:23:02');
INSERT INTO `t_parameter_optgroup_value` VALUES ('acd28ca36fec95be41cfdb16861fab45', '79be87300c0df2a803dd75221f9ca0b0', 'CancelVipAuth', '取消VIP认证审核', 'enable', '15', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:25:12', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:25:12');
INSERT INTO `t_parameter_optgroup_value` VALUES ('adf5a85fc6937d07f65484014cc2ce76', '0b6919d96ff46e91471d9714bd1d205f', 'failure', '审核失败', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-02 15:17:11', '8b25651c2d896297530b64e4b80ec503', '2014-05-06 10:52:23');
INSERT INTO `t_parameter_optgroup_value` VALUES ('b3cae9a622e4727d3ce63bea18849fb6', '35a594e3165ef413550cfd413fc33642', 'pass', '通过', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-08 17:47:37', '8b25651c2d896297530b64e4b80ec503', '2014-04-08 17:47:37');
INSERT INTO `t_parameter_optgroup_value` VALUES ('ba125aeae408f4bb9da13fb0ea2ac67e', 'aa2fe4d8f0b757d1329ba54745721d23', 'mobileAuth', '手机认证', 'enable', '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:32:31', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:32:31');
INSERT INTO `t_parameter_optgroup_value` VALUES ('c0c9665a005791fd2f9550d97fe3aeb5', '79be87300c0df2a803dd75221f9ca0b0', 'vipAuth', 'VIP认证信用积分', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 10:55:58', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 16:57:20');
INSERT INTO `t_parameter_optgroup_value` VALUES ('cc1db2e08263755408d0ab7c8a0bdaef', '4776fe7b0e02b3467b4ea41c7e237223', 'havecar', '已购车', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:54:08', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:54:49');
INSERT INTO `t_parameter_optgroup_value` VALUES ('cef639d80ab89a98df7301fc8b084d32', '28ee70d89cd44ab3e8f6a54929a47952', 'invest', '投资', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 11:02:01', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('d19be93476640d86b05a60cc8a16f7af', '270360ceaa6ad462229f98b356909829', 'read', '已读', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-09 14:10:56', '8b25651c2d896297530b64e4b80ec503', '2014-04-09 14:10:56');
INSERT INTO `t_parameter_optgroup_value` VALUES ('dc3c29fcfe59463259909304f8fe28c5', 'b5ac6ebbc227b3a2cfe5b75ae48d81ca', 'business', '商业伙伴', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 11:04:39', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 11:04:39');
INSERT INTO `t_parameter_optgroup_value` VALUES ('deb838911730fd2ae91a3d86740b6ca5', '163d9c2f8c189e64658e79e4e78aef73', 'mortgage', '抵押贷款', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 10:49:45', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 10:49:45');
INSERT INTO `t_parameter_optgroup_value` VALUES ('e45a84327d26ffa159da270f95ef0a91', '067abb1f4a35c41ddce2c3e1dcb45e65', 'recharge', '充值', 'enable', '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 17:19:57', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 17:19:57');
INSERT INTO `t_parameter_optgroup_value` VALUES ('e562da88a8cd568afc60c2c31b83e2f4', '067abb1f4a35c41ddce2c3e1dcb45e65', 'login', '登录', 'enable', '1', '登录获取积分', '8b25651c2d896297530b64e4b80ec503', '2014-06-19 13:45:30', '8b25651c2d896297530b64e4b80ec503', '2014-06-19 13:45:40');
INSERT INTO `t_parameter_optgroup_value` VALUES ('e60a0f1adebf1b828640fbb338316eb8', '0b6919d96ff46e91471d9714bd1d205f', 'authstr', '审核中', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-02 15:16:10', '8b25651c2d896297530b64e4b80ec503', '2014-04-02 15:16:10');
INSERT INTO `t_parameter_optgroup_value` VALUES ('ead9c20f4d1457b1d436e8333aeb9a13', '723e02be061a63f73629257804c75f46', 'authstr', '待审核', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 13:26:32', '8b25651c2d896297530b64e4b80ec503', '2014-04-02 16:29:01');
INSERT INTO `t_parameter_optgroup_value` VALUES ('ecefc7db8ad84949efb3aeaeacbef2de', 'f162bad386611ea6705db86adce95fc7', 'secret', '保密', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:49:21', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:49:21');
INSERT INTO `t_parameter_optgroup_value` VALUES ('f081962b0b8f3b28b727c60b821dbee2', '87e805fcf0c779b8f57fde22d819e2db', 'woman', '女', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:55:01', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:55:01');
INSERT INTO `t_parameter_optgroup_value` VALUES ('f1498ee9de5b4e78fe4654ae3b3175bb', '0b6919d96ff46e91471d9714bd1d205f', 'pass', '审核通过', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-02 15:16:43', '8b25651c2d896297530b64e4b80ec503', '2014-05-06 10:52:17');
INSERT INTO `t_parameter_optgroup_value` VALUES ('f5c6d5d996f84d958bff9d5512457896', '067abb1f4a35c41ddce2c3e1dcb45e65', 'borrow', '借款', 'enable', '2', '借款获取积分', '8b25651c2d896297530b64e4b80ec503', '2014-06-19 13:46:02', '8b25651c2d896297530b64e4b80ec503', '2014-06-19 13:46:02');
INSERT INTO `t_parameter_optgroup_value` VALUES ('fb1fe48c81c8e52c70578b8420f2d1bf', '50891ccba80188b42cb263699ca7f689', 'notSystem', '非系统消息', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-16 15:07:01', '8b25651c2d896297530b64e4b80ec503', '2014-06-16 15:07:01');
INSERT INTO `t_parameter_optgroup_value` VALUES ('fdc17951d080e6b815c1aab0d5c8ed32', 'b5ac6ebbc227b3a2cfe5b75ae48d81ca', 'family', '家人', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 11:03:56', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 11:03:56');

-- ----------------------------
-- Table structure for `t_parameter_system_variables`
-- ----------------------------
DROP TABLE IF EXISTS `t_parameter_system_variables`;
CREATE TABLE `t_parameter_system_variables` (
  `variables_id` varchar(32) NOT NULL COMMENT '系统变量Id',
  `specification` varchar(50) default NULL COMMENT '参数说明',
  `input_tip` varchar(50) default NULL COMMENT '输入提示',
  `parameter_values` varchar(50) default NULL COMMENT '参数值',
  `variable_name` varchar(50) default NULL COMMENT '变量名',
  `form_type` enum('input','textarea') default NULL COMMENT '表单类型',
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`variables_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='参数设置的系统变量';

-- ----------------------------
-- Records of t_parameter_system_variables
-- ----------------------------
INSERT INTO `t_parameter_system_variables` VALUES ('4css921507de7b121d37b460d65b5g', '参数说明', '输入提示', '1.00', '变量名', 'input', '测试数据', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 15:22:26', '8b25651c2d896297530b64e4b80ec503', '2014-08-18 17:36:01');

-- ----------------------------
-- Table structure for `t_role`
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `role_id` varchar(32) NOT NULL,
  `role_en_name` varchar(25) NOT NULL,
  `role_cn_name` varchar(25) default NULL,
  `builtin` varchar(10) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  PRIMARY KEY  (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'TEST', '测试角色', 'custom', '测试角色', '8b25651c2d896297530b64e4b80ec503', '2014-07-08 00:00:00');
INSERT INTO `t_role` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'ADMIN', '超级管理员', 'admin', null, '8b25651c2d896297530b64e4b80ec503', '2014-01-16 02:58:58');

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `user_id` varchar(32) NOT NULL,
  `username` varchar(20) NOT NULL,
  `user_cn_name` varchar(50) default NULL,
  `password` varchar(64) NOT NULL,
  `salt` varchar(50) default NULL,
  `status` enum('disable','enable') NOT NULL,
  `builtin` enum('custom','builtin','admin') NOT NULL,
  `email` varchar(50) default NULL,
  `user_image` varchar(50) default NULL,
  `remark` varchar(255) default NULL,
  `last_login_time` datetime default NULL,
  `last_login_ip_address` varchar(150) default NULL,
  `login_count` int(10) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  PRIMARY KEY  (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('8b25651c2d896297530b64e4b80ec503', 'admin', '超级管理员', '5dc10e7826e648ec6f136974c38f81d0e5e1d0ae', 'e03b1b95ceff4db6', 'enable', 'admin', 'admin@glacier.cn', null, null, '2014-12-31 14:28:35', '127.0.0.1[本地]', '940', '8b25651c2d896297530b64e4b80ec503', '2014-02-27 02:58:02');
INSERT INTO `t_user` VALUES ('d31a15b0c9abe32744dc16203b9547d8', 'administrators', '客户管理员', 'f418eabf12e35e6112d8783ef6751c0da68782b5', 'd5a18894f8d85631', 'enable', 'custom', 'administrators@qq.com', null, '后台管理员', null, null, '0', '8b25651c2d896297530b64e4b80ec503', '2014-07-28 16:30:17');
INSERT INTO `t_user` VALUES ('d6dc13121742a3b331dcb6f93d4f4bce', 'adminTest', '客户管理员', 'd7d62bc0a343ffea509247f1a7c92120e762771d', 'baaa252597ec918e', 'enable', 'custom', 'adminTest@163.com', null, '客户、测试使用账号', '2014-08-04 17:53:34', '127.0.0.1[本地]', '4', '8b25651c2d896297530b64e4b80ec503', '2014-07-14 13:40:42');

-- ----------------------------
-- Table structure for `t_user_role`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_role`;
CREATE TABLE `t_user_role` (
  `user_id` varchar(32) NOT NULL COMMENT '用户id',
  `role_id` varchar(32) NOT NULL COMMENT '角色Id',
  PRIMARY KEY  (`user_id`,`role_id`),
  KEY `FK_t_user_role2` (`role_id`),
  CONSTRAINT `FK_t_user_role_role_id` FOREIGN KEY (`role_id`) REFERENCES `t_role` (`role_id`),
  CONSTRAINT `FK_t_user_role_user_id` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色表';

-- ----------------------------
-- Records of t_user_role
-- ----------------------------
INSERT INTO `t_user_role` VALUES ('8b25651c2d896297530b64e4b80ec503', '56078492e2eed9eb33f32c3af54a8e3f');
INSERT INTO `t_user_role` VALUES ('d31a15b0c9abe32744dc16203b9547d8', '56078492e2eed9eb33f32c3af54a8e3f');
INSERT INTO `t_user_role` VALUES ('d6dc13121742a3b331dcb6f93d4f4bce', '56078492e2eed9eb33f32c3af54a8e3f');
INSERT INTO `t_user_role` VALUES ('8b25651c2d896297530b64e4b80ec503', 'c87dd7161dbf8777c41b8cbfaa985db4');

-- ----------------------------
-- Table structure for `t_user_setting`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_setting`;
CREATE TABLE `t_user_setting` (
  `user_id` varchar(32) NOT NULL,
  `set_key` varchar(50) default NULL,
  `set_name` varchar(50) default NULL,
  `set_value` varchar(255) default NULL,
  `set_description` varchar(255) default NULL,
  PRIMARY KEY  (`user_id`),
  CONSTRAINT `FK_user_user_setting_user_id` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user_setting
-- ----------------------------
