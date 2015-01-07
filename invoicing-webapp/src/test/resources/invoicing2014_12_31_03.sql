/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50067
Source Host           : localhost:3306
Source Database       : invoicing

Target Server Type    : MYSQL
Target Server Version : 50067
File Encoding         : 65001

Date: 2015-01-06 17:03:42
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
INSERT INTO `t_action` VALUES ('4d05ce95cb561b35788bc8d2911d8419', '0d5f941c0e815519b859afa0992eda0b', 'bbf240fc8c53886e327ff15976026945', '分配角色', 'assign', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.system_mgr.dep_mgr.dep.assignDep();', '4', '');
INSERT INTO `t_action` VALUES ('5652a940a901f412456efc1ecf13b634', '0d5f941c0e815519b859afa0992eda0b', 'bbf240fc8c53886e327ff15976026945', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.system_mgr.dep_mgr.dep.delDep();', '3', '');
INSERT INTO `t_action` VALUES ('5825847f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '3456eg4157cf483a790f4eea35ds5675', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.delOptgroupValue();', '3', null);
INSERT INTO `t_action` VALUES ('58660bccb69289b1f0299d9a664931d3', '91ca1b4b197688f21b68a72f69e09a8d', '37011217016636a0723462dbc81bf887', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.system_mgr.user_mgr.user.editUser();', '2', null);
INSERT INTO `t_action` VALUES ('58c66ce489e1ee8588e881a1abe9de56', '93f0fcfa7cdff069d929723062b53211', 'e6784ccad10e3414b99b77b303a338c7', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.variables_mgr.variables.editVariables();', '2', null);
INSERT INTO `t_action` VALUES ('5db796929f23e991708fd0af99b3b4bc', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.role_mgr.role.addRole();', '1', null);
INSERT INTO `t_action` VALUES ('6838d18fa1e582d4dc28404a80445c88', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.res_mgr.res.addMenu();', '1', null);
INSERT INTO `t_action` VALUES ('6c0bc1e009b3742af24d7bdc94adec3c', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.res_mgr.res.addPanel();', '1', null);
INSERT INTO `t_action` VALUES ('6e1027dd7e57195d06dd2fac811f8ebf', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.editMenu();', '2', null);
INSERT INTO `t_action` VALUES ('6ebb0c66afb41e8cf0d890ea46ab54ca', 'ac892df07f9087fb1c89ac968bb5f555', '557cf8b2740e6792f517138703afb407', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.system_mgr.operalog_mgr.operalog.delOperalog();', '1', null);
INSERT INTO `t_action` VALUES ('75c176566b9105b26c44f0b97050dcbf', '0d5f941c0e815519b859afa0992eda0b', 'bbf240fc8c53886e327ff15976026945', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.dep_mgr.dep.addDep();', '1', '');
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
INSERT INTO `t_action` VALUES ('f4065bd55bb4d1a51db0cc775f854c6e', '0d5f941c0e815519b859afa0992eda0b', 'bbf240fc8c53886e327ff15976026945', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.system_mgr.dep_mgr.dep.editDep();', '2', '');
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
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '0d5f941c0e815519b859afa0992eda0b', 'DepList_add,DepList_edit,DepList_del,DepList_assign');
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
-- Table structure for `t_dep`
-- ----------------------------
DROP TABLE IF EXISTS `t_dep`;
CREATE TABLE `t_dep` (
  `dep_id` varchar(32) NOT NULL,
  `cn_name` varchar(32) default NULL,
  `en_name` varchar(32) default NULL,
  `parent_id` varchar(32) default NULL COMMENT '上级部门',
  `order_num` int(4) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  PRIMARY KEY  (`dep_id`),
  KEY `FK_DEP_DEP` USING BTREE (`parent_id`),
  CONSTRAINT `FK_DEP_DEP` FOREIGN KEY (`parent_id`) REFERENCES `t_dep` (`dep_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_dep
-- ----------------------------
INSERT INTO `t_dep` VALUES ('asdfsdf', '开发部1', 'develop1', 'sd64fs65d4f56sd4fsd5f', '2', '2', '65', '2015-01-05 17:06:57');
INSERT INTO `t_dep` VALUES ('sd64fs65d4f56sd4fsd5f', '开发总部', 'develop', null, '1', '1', '2', '2015-01-05 16:50:55');

-- ----------------------------
-- Table structure for `t_dep_role`
-- ----------------------------
DROP TABLE IF EXISTS `t_dep_role`;
CREATE TABLE `t_dep_role` (
  `dep_id` varchar(32) NOT NULL default '',
  `role_id` varchar(32) NOT NULL default '',
  PRIMARY KEY  (`dep_id`,`role_id`),
  KEY `FK_DEP_ROLE` USING BTREE (`dep_id`),
  KEY `FK_ROLE_DEP` USING BTREE (`role_id`),
  CONSTRAINT `FK_DEP_ROLE` FOREIGN KEY (`dep_id`) REFERENCES `t_dep` (`dep_id`),
  CONSTRAINT `FK_ROLE_DEP` FOREIGN KEY (`role_id`) REFERENCES `t_role` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_dep_role
-- ----------------------------

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
INSERT INTO `t_loginlog` VALUES ('01bd56495acefb3e048402f829c7093b', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-01-06 13:25:59', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('0514f6c14a6e8f431defd2e570f7368b', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-12-31 14:46:34', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('13f4ee137c047df43c11dd81dd8cfda6', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-01-06 14:51:18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('178258fae16f5a548360e71b4b89c07d', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-01-06 14:54:48', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('2b2e686784675b3ad1a9828b7dfd979a', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-01-06 15:14:24', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('38e9fcbc1c7eda38ec1978c9285608df', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-01-06 14:46:26', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('407366205bf182d6e6be75db84ceec9a', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-01-06 14:48:32', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('51b5fa4e6334ea4f3d8c30cc173a4bfa', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-01-05 16:11:43', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('6349444d0fb09f0d3e8c7ecd0a2084f1', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-01-06 14:31:59', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('763d2a91bc4d407cc32758cf118492c6', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-01-06 14:43:34', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('a3db1d83b866957ec50c2ee09c2b3c82', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-01-06 16:11:59', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('ac326ed309ae52bf0c46e751308bc45a', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-01-06 09:23:14', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('c3b29d407ceadd12562c68bbd3f996a0', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-01-05 13:57:20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('d6c0e886a2cc940bff41d85efc6850ed', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-01-06 15:25:02', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('e5ac1dbef6e20a4fd00ed145c4fa98b7', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-01-06 14:45:32', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('ea52baa44284c7f526ba7ae467938716', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-01-06 14:30:47', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('edf84fa316f888425e056eb596406434', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-01-06 16:11:26', '127.0.0.1[本地]', null, null);

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
INSERT INTO `t_menu` VALUES ('0d5f941c0e815519b859afa0992eda0b', '16ac1df11de350c61722dc7b98cecca7', 'dep', '部门管理', 'icon-standard-folder-user', '/do/dep/index.htm', '2', '');
INSERT INTO `t_menu` VALUES ('14sdf54157cf483a790f4eea35dsf6f6', null, 'basicdatas', '参数管理', 'icon-standard-application-xp-terminal', '', '2', '');
INSERT INTO `t_menu` VALUES ('16ac1df11de350c61722dc7b98cecca7', null, 'system', '系统设置', 'icon-standard-cog', '', '1', '');
INSERT INTO `t_menu` VALUES ('54eb754157cf483a790f4eea35200118', '16ac1df11de350c61722dc7b98cecca7', 'res', '资源管理', 'icon-cologne-featured', '/do/res/index.htm', '4', '');
INSERT INTO `t_menu` VALUES ('91ca1b4b197688f21b68a72f69e09a8d', '16ac1df11de350c61722dc7b98cecca7', 'user', '管理员设置', 'icon-hamburg-hire-me', '/do/user/index.htm', '1', '');
INSERT INTO `t_menu` VALUES ('93f0fcfa7cdff069d929723062b53211', '14sdf54157cf483a790f4eea35dsf6f6', 'variables', '系统变量', 'icon-standard-layout-content', '/do/variables/index.htm', '2', '');
INSERT INTO `t_menu` VALUES ('ac892df07f9087fb1c89ac968bb5f555', '16ac1df11de350c61722dc7b98cecca7', 'operalog', '操作日志', 'icon-standard-report-key', '/do/operalog/index.htm', '5', '');
INSERT INTO `t_menu` VALUES ('e42b98561176563f930d82c80b041ed8', '16ac1df11de350c61722dc7b98cecca7', 'loginlog', '登录日志', 'icon-standard-report-edit', '/do/loginlog/index.htm', '6', '');
INSERT INTO `t_menu` VALUES ('e550884c5e6c1e94ee70cc833aa1c2b9', '16ac1df11de350c61722dc7b98cecca7', 'role', '角色管理', 'icon-hamburg-customers', '/do/role/index.htm', '3', '');
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
INSERT INTO `t_operalog` VALUES ('0251430b38ece6169ed3959f755fdb87', '资源管理', '操作列表', '编辑', '1', '[分配角色] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-05 14:03:02');
INSERT INTO `t_operalog` VALUES ('08270adf52c2c69b617aecca2b83c2f9', '部门管理', '部门列表', '修改', '1', '[3]部门信息已修改', 'com.glacier.frame.service.system.DepService', 'editDep', 'DepList_edit', '超级管理员', '2015-01-06 15:15:00');
INSERT INTO `t_operalog` VALUES ('10016914818704b3217fe233c6837525', '部门管理', '部门列表', '修改', '0', '禁止选择该部门本身以及子部门作为上级部门', 'com.glacier.frame.service.system.DepService', 'editDep', 'DepList_edit', '超级管理员', '2015-01-06 15:14:43');
INSERT INTO `t_operalog` VALUES ('1abda2946111d3ba62d71fa390cb1cad', '部门管理', '部门列表', '修改', '0', '禁止选择该部门本身以及子部门作为上级部门', 'com.glacier.frame.service.system.DepService', 'editDep', 'DepList_edit', '超级管理员', '2015-01-06 15:14:44');
INSERT INTO `t_operalog` VALUES ('1db5b3a6a9c2bf2331460e6d2571c843', '下拉项管理', '下拉项树', '修改', '0', '禁止选择该下拉项本身以及子下拉项作为上级下拉项', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2015-01-06 14:57:02');
INSERT INTO `t_operalog` VALUES ('2a06411f8cf3bba31428d5f96bb5b180', '部门管理', '部门列表', '修改', '0', '禁止选择该部门本身以及子部门作为上级部门', 'com.glacier.frame.service.system.DepService', 'editDep', 'DepList_edit', '超级管理员', '2015-01-06 15:14:43');
INSERT INTO `t_operalog` VALUES ('367ff79b4af54c2b99140481cda33c83', '部门管理', '部门列表', '增加', '1', '[sdfsdf]管理员信息已保存', 'com.glacier.frame.service.system.DepService', 'addDep', 'DepList_add', '超级管理员', '2015-01-06 14:51:30');
INSERT INTO `t_operalog` VALUES ('39a86e3db8559d9b0e3b402b7c50d29d', '部门管理', '部门列表', '增加', '1', '[3]管理员信息已保存', 'com.glacier.frame.service.system.DepService', 'addDep', 'DepList_add', '超级管理员', '2015-01-06 15:14:53');
INSERT INTO `t_operalog` VALUES ('46b1a6e3f7006e5082c5ee7d5d932ffe', '下拉项管理', '下拉项树', '修改', '0', '禁止选择该下拉项本身以及子下拉项作为上级下拉项', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2015-01-06 14:57:04');
INSERT INTO `t_operalog` VALUES ('4f1a1a5cb513c421fde26e209a5ba770', '部门管理', '部门列表', '增加', '1', '[sdfsd]管理员信息已保存', 'com.glacier.frame.service.system.DepService', 'addDep', 'DepList_add', '超级管理员', '2015-01-06 14:51:41');
INSERT INTO `t_operalog` VALUES ('51724f6c3a3eb5a7004cc25b0155e23e', '部门管理', '部门列表', '修改', '0', '禁止选择该部门本身以及子部门作为上级部门', 'com.glacier.frame.service.system.DepService', 'editDep', 'DepList_edit', '超级管理员', '2015-01-06 15:14:43');
INSERT INTO `t_operalog` VALUES ('6578593860033f60b4d9afc6899b5357', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-05 14:00:47');
INSERT INTO `t_operalog` VALUES ('68595e1c2eaea8e4d931a163b7f40391', '部门管理', '部门列表', '修改', '1', '[开发总部]部门信息已修改', 'com.glacier.frame.service.system.DepService', 'editDep', 'DepList_edit', '超级管理员', '2015-01-06 14:56:17');
INSERT INTO `t_operalog` VALUES ('721ff2c87e1163a411306fde45e012fe', '部门管理', '部门列表', '修改', '1', '[开发总部]部门信息已修改', 'com.glacier.frame.service.system.DepService', 'editDep', 'DepList_edit', '超级管理员', '2015-01-06 14:55:17');
INSERT INTO `t_operalog` VALUES ('74a193976c915075d7e796083b55dec2', '资源管理', '菜单树', '修改', '1', '[角色管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-01-05 13:58:56');
INSERT INTO `t_operalog` VALUES ('7afc282718057f033c9af4293ed7556a', '部门管理', '部门列表', '增加', '1', '[dfdsf]管理员信息已保存', 'com.glacier.frame.service.system.DepService', 'addDep', 'DepList_add', '超级管理员', '2015-01-06 14:43:47');
INSERT INTO `t_operalog` VALUES ('7be26378d46a601776a580b1268a8a85', '部门管理', '部门列表', '修改', '0', '禁止选择该部门本身以及子部门作为上级部门', 'com.glacier.frame.service.system.DepService', 'editDep', 'DepList_edit', '超级管理员', '2015-01-06 15:14:42');
INSERT INTO `t_operalog` VALUES ('84687eb4259d2398f9fd72abbbc3fa72', '部门管理', '部门列表', '修改', '0', '禁止选择该部门本身以及子部门作为上级部门', 'com.glacier.frame.service.system.DepService', 'editDep', 'DepList_edit', '超级管理员', '2015-01-06 15:14:44');
INSERT INTO `t_operalog` VALUES ('8c66371c57798de6864f778c9be59c6d', '部门管理', '部门列表', '修改', '0', '禁止选择该部门本身以及子部门作为上级部门', 'com.glacier.frame.service.system.DepService', 'editDep', 'DepList_edit', '超级管理员', '2015-01-06 15:14:42');
INSERT INTO `t_operalog` VALUES ('91890012aceb197e353149876d69b3ed', '部门管理', '部门列表', '修改', '0', '禁止选择该部门本身以及子部门作为上级部门', 'com.glacier.frame.service.system.DepService', 'editDep', 'DepList_edit', '超级管理员', '2015-01-06 15:14:42');
INSERT INTO `t_operalog` VALUES ('9645519bbbc2bd6c39236dece82c8804', '部门管理', '部门列表', '修改', '1', '[33]部门信息已修改', 'com.glacier.frame.service.system.DepService', 'editDep', 'DepList_edit', '超级管理员', '2015-01-06 14:55:01');
INSERT INTO `t_operalog` VALUES ('97b2d0b7194ad2499e975711f3ee75c5', '部门管理', '部门列表', '修改', '1', '[开发总部]部门信息已修改', 'com.glacier.frame.service.system.DepService', 'editDep', 'DepList_edit', '超级管理员', '2015-01-06 14:56:27');
INSERT INTO `t_operalog` VALUES ('9f376f3042b462673568575163f95803', '资源管理', '面板列表', '增加', '1', '[部门列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2015-01-05 13:59:42');
INSERT INTO `t_operalog` VALUES ('a326aab14958e6137e36cdafd893d857', '部门管理', '部门列表', '修改', '0', '禁止选择该部门本身以及子部门作为上级部门', 'com.glacier.frame.service.system.DepService', 'editDep', 'DepList_edit', '超级管理员', '2015-01-06 15:14:43');
INSERT INTO `t_operalog` VALUES ('a3565971d9b825cec6e1428c56923cf5', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-05 14:01:36');
INSERT INTO `t_operalog` VALUES ('a5bbe2d5f258542244e14bd6c5975f61', '资源管理', '操作列表', '增加', '1', '[分配角色] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-05 14:02:43');
INSERT INTO `t_operalog` VALUES ('a5f8687067510c800b066a8889885b62', '资源管理', '菜单树', '增加', '1', '[部门管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-01-05 13:58:51');
INSERT INTO `t_operalog` VALUES ('a775e17b5c5a006354b60ddda5264f5b', '资源管理', '菜单树', '修改', '1', '[登录日志] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-01-05 13:59:13');
INSERT INTO `t_operalog` VALUES ('a8fee91b9ea8742fb8abf8adbc6aac2b', '部门管理', '部门列表', '修改', '0', '禁止选择该部门本身以及子部门作为上级部门', 'com.glacier.frame.service.system.DepService', 'editDep', 'DepList_edit', '超级管理员', '2015-01-06 15:14:42');
INSERT INTO `t_operalog` VALUES ('adc5e852d1d9b63b2a5f9600b8d06f7b', '部门管理', '部门列表', '修改', '1', '[开发总部]部门信息已修改', 'com.glacier.frame.service.system.DepService', 'editDep', 'DepList_edit', '超级管理员', '2015-01-06 15:14:33');
INSERT INTO `t_operalog` VALUES ('ae2060538bd7e680b53c93062a54a2a1', '部门管理', '部门列表', '修改', '0', '禁止选择该部门本身以及子部门作为上级部门', 'com.glacier.frame.service.system.DepService', 'editDep', 'DepList_edit', '超级管理员', '2015-01-06 15:14:41');
INSERT INTO `t_operalog` VALUES ('b7f879e6145cf797076d6e777e91e41e', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2015-01-05 14:34:57');
INSERT INTO `t_operalog` VALUES ('c2044b9547616a5283edb0e6c99ff41e', '资源管理', '菜单树', '修改', '1', '[资源管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-01-05 13:59:04');
INSERT INTO `t_operalog` VALUES ('d90390e05ca89fca8c3957a242072577', '下拉项管理', '下拉项树', '增加', '1', '[大幅度] 下拉项信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2015-01-06 14:48:53');
INSERT INTO `t_operalog` VALUES ('ed3de2dd5e317343b29f7964a16bb93f', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-05 14:02:02');
INSERT INTO `t_operalog` VALUES ('fc5ad0bd098ee3f05d5da41e5030559e', '部门管理', '部门列表', '修改', '0', '禁止选择该部门本身以及子部门作为上级部门', 'com.glacier.frame.service.system.DepService', 'editDep', 'DepList_edit', '超级管理员', '2015-01-06 15:14:43');

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
INSERT INTO `t_panel` VALUES ('bbf240fc8c53886e327ff15976026945', '0d5f941c0e815519b859afa0992eda0b', '部门列表', 'DepList', '1');
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
INSERT INTO `t_parameter_optgroup` VALUES ('0b6919d96ff46e91471d9714bd1d205f', '113afb2ecac88fe851ad501c53b7d82b', 'auditState', '审核状态', null, null, '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-02 15:15:43', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:04:04');
INSERT INTO `t_parameter_optgroup` VALUES ('113afb2ecac88fe851ad501c53b7d82b', null, 'common', '公用下拉项', null, null, '7', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:29:29', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 09:40:24');
INSERT INTO `t_parameter_optgroup` VALUES ('12bba62fdc3bf021c0de78e6ffdabf3f', null, 'dsd', '大幅度', null, null, '3', '3', '8b25651c2d896297530b64e4b80ec503', '2015-01-06 14:48:53', '8b25651c2d896297530b64e4b80ec503', '2015-01-06 14:48:53');
INSERT INTO `t_parameter_optgroup` VALUES ('1bf27bce9c73b22e9822fb85380ac347', '113afb2ecac88fe851ad501c53b7d82b', 'status', '状态', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:34:53', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:37:23');
INSERT INTO `t_parameter_optgroup` VALUES ('2rtfdg1rgrh1dfhsjdfh124564sdf21d', null, 'system', '系统设置', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:34:53', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:12:31');
INSERT INTO `t_parameter_optgroup` VALUES ('3de467b04ce8984ae48ba243eb25ffb2', null, 'basicdatas', '参数管理', null, null, '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:15:47', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:12:47');
INSERT INTO `t_parameter_optgroup` VALUES ('7114c42efa5349f4c8874787fde91633', 'bd88aee43efe41a6ebd10b263fa29ed1', 'formType', '表单类型', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:19:08', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:04:35');
INSERT INTO `t_parameter_optgroup` VALUES ('87e805fcf0c779b8f57fde22d819e2db', '113afb2ecac88fe851ad501c53b7d82b', 'sex', '性别', null, null, '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:11:51', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:52:39');
INSERT INTO `t_parameter_optgroup` VALUES ('bd88aee43efe41a6ebd10b263fa29ed1', '3de467b04ce8984ae48ba243eb25ffb2', 'variables', '系统变量', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:18:18', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:04:28');
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
INSERT INTO `t_parameter_optgroup_value` VALUES ('02df4e5c07bb38221b41c9c74448fd8f', '87e805fcf0c779b8f57fde22d819e2db', 'secret', '保密', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:55:17', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:55:17');
INSERT INTO `t_parameter_optgroup_value` VALUES ('1ed2d672131c69ea00a61b0edd2d5358', 'fdf78bcc980b29a21a65131eab1c1b38', 'builtin', '内置', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:31:13', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:42:00');
INSERT INTO `t_parameter_optgroup_value` VALUES ('239294f5e95b8d95911c4227eb2473e4', 'fdf78bcc980b29a21a65131eab1c1b38', 'custom', '自定义', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:31:32', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:42:04');
INSERT INTO `t_parameter_optgroup_value` VALUES ('2c663921507de7b121d37b460d65b5c4', 'fdf78bcc980b29a21a65131eab1c1b38', 'admin', '管理员', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:41:48');
INSERT INTO `t_parameter_optgroup_value` VALUES ('3sfsaf1231452112121525as5fsdf454', '1bf27bce9c73b22e9822fb85380ac347', 'enable', '启用', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 14:42:47');
INSERT INTO `t_parameter_optgroup_value` VALUES ('41ad6336a2e35dd9d67ed0ece74ad155', '7114c42efa5349f4c8874787fde91633', 'input', '输入框', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:53:45', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('4346c17adc9f4b126baa6e593dfb1219', '87e805fcf0c779b8f57fde22d819e2db', 'man', '男', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:54:45', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:54:45');
INSERT INTO `t_parameter_optgroup_value` VALUES ('5dfs2d1f32sd1f2sd1f2sd1f256565sd', '1bf27bce9c73b22e9822fb85380ac347', 'disable', '禁用', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 14:42:50');
INSERT INTO `t_parameter_optgroup_value` VALUES ('85db75ec028f7cbbb412331e8c035470', '7114c42efa5349f4c8874787fde91633', 'textarea', '文本框', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:54:06', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('adf5a85fc6937d07f65484014cc2ce76', '0b6919d96ff46e91471d9714bd1d205f', 'failure', '审核失败', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-02 15:17:11', '8b25651c2d896297530b64e4b80ec503', '2014-05-06 10:52:23');
INSERT INTO `t_parameter_optgroup_value` VALUES ('e60a0f1adebf1b828640fbb338316eb8', '0b6919d96ff46e91471d9714bd1d205f', 'authstr', '审核中', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-02 15:16:10', '8b25651c2d896297530b64e4b80ec503', '2014-04-02 15:16:10');
INSERT INTO `t_parameter_optgroup_value` VALUES ('f081962b0b8f3b28b727c60b821dbee2', '87e805fcf0c779b8f57fde22d819e2db', 'woman', '女', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:55:01', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:55:01');
INSERT INTO `t_parameter_optgroup_value` VALUES ('f1498ee9de5b4e78fe4654ae3b3175bb', '0b6919d96ff46e91471d9714bd1d205f', 'pass', '审核通过', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-02 15:16:43', '8b25651c2d896297530b64e4b80ec503', '2014-05-06 10:52:17');

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
INSERT INTO `t_user` VALUES ('8b25651c2d896297530b64e4b80ec503', 'admin', '超级管理员', '5dc10e7826e648ec6f136974c38f81d0e5e1d0ae', 'e03b1b95ceff4db6', 'enable', 'admin', 'admin@glacier.cn', null, null, '2015-01-06 16:11:59', '127.0.0.1[本地]', '957', '8b25651c2d896297530b64e4b80ec503', '2014-02-27 02:58:02');
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
