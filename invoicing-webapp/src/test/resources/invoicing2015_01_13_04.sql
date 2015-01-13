/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50067
Source Host           : localhost:3306
Source Database       : invoicing

Target Server Type    : MYSQL
Target Server Version : 50067
File Encoding         : 65001

Date: 2015-01-13 10:57:40
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
INSERT INTO `t_action` VALUES ('00c00486af94f98319867dd391199e3b', 'c81a4c0156789361600940be2ebdab2c', '628e3c73409f37c6d28bdd97ed61b5fc', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.clientLevel_mgr.clientLevel.editClientLevel();', '2', '');
INSERT INTO `t_action` VALUES ('0292b24bf2613a3e26c01b7486bc0344', '1b41e29c8712c9f36bc3a520a8e5363b', '95eaa68d7a4109e845d63ef82cdb0d3f', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.financeCostType_mgr.financeCostType.addFinanceCostType();', '1', '');
INSERT INTO `t_action` VALUES ('052f8f3a3dee3781a1f3a60bee4cfbfc', '8a2f2500fa46e49dd7ff11b688b6c740', 'ad67aaf12a02906ad088a73410fd097e', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.companySize_mgr.companySize.editCompanySize();', '2', '');
INSERT INTO `t_action` VALUES ('08fcfc5ac69513b18eb1c67b3d108a37', '810ba3686840457556cb55bc87d8010b', '365eeace84821f6e45d59cefd702827d', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.sellType_mgr.sellType.delSellType();', '3', '');
INSERT INTO `t_action` VALUES ('099bbd95bea8b3e311ed8075f30cdbda', '8a2f2500fa46e49dd7ff11b688b6c740', 'ad67aaf12a02906ad088a73410fd097e', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.companySize_mgr.companySize.addCompanySize();', '1', '');
INSERT INTO `t_action` VALUES ('0bd2298fc6339f8b5ddc191ff7a79cbd', '8c54260cf2f6704a1739503465d9e9cf', '58fc5a925e18a411e10bf5b2084ee609', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.financeReceivableType_mgr.financeReceivableType.addFinanceReceivableType();', '1', '');
INSERT INTO `t_action` VALUES ('0ef27657d1028fe40098277e557db695', '4f2b136adfaf68b741d58df8e4adc4ff', '977a07ecaf616fcd4ba6e47b19896a42', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.financePayableType_mgr.financePayableType.editFinancePayableType();', '2', '');
INSERT INTO `t_action` VALUES ('0fdce7c7faac53572cdb71d659fec353', '8c54260cf2f6704a1739503465d9e9cf', '58fc5a925e18a411e10bf5b2084ee609', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.financeReceivableType_mgr.financeReceivableType.delFinanceReceivableType();', '3', '');
INSERT INTO `t_action` VALUES ('11155cdaf84232cf47b1b68f9e755f75', '8c54260cf2f6704a1739503465d9e9cf', '58fc5a925e18a411e10bf5b2084ee609', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.financeReceivableType_mgr.financeReceivableType.editFinanceReceivableType();', '2', '');
INSERT INTO `t_action` VALUES ('18060139f0e736a796d5ac4bdd78eadc', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.role_mgr.role.editRole();', '2', null);
INSERT INTO `t_action` VALUES ('1f030c5d4303316d090fc0567ec10ea2', '16669401121c47c062cac4d11a21522e', '4df3645386cbf2317d35ecf218939b71', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.warOutType_mgr.warOutType.delWarOutType();', '3', '');
INSERT INTO `t_action` VALUES ('216c6d43f085ba920e11bd60a8e06886', 'a4d88b8b3c70b93d69d0bf24ffb09377', '6cfa450f398c5384de09368f8b7094ab', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.suppliers_mgr.suppliers.editSuppliers();', '2', '');
INSERT INTO `t_action` VALUES ('21c425f0255738c5e278304dd6264476', '4f2b136adfaf68b741d58df8e4adc4ff', '977a07ecaf616fcd4ba6e47b19896a42', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.financePayableType_mgr.financePayableType.delFinancePayableType();', '3', '');
INSERT INTO `t_action` VALUES ('22b38655d16fa1042893e49b1cdfc611', '82533b28131409450ad7a00229fd7333', '82385e2a3e64ac4cf4633ccb4c38c480', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.comContactType_mgr.comContactType.addComContactType();', '1', '');
INSERT INTO `t_action` VALUES ('2421bd42880819c8be703d7c4f49894b', '2261cc3a4a23b23bd6317021981fbd1e', '6dbbdf0a9349268ead711fc84f3da291', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.suppliersType_mgr.suppliersType.delSuppliersType();', '3', '');
INSERT INTO `t_action` VALUES ('252406da7cfa367b741142c71a9c89e2', '810ba3686840457556cb55bc87d8010b', '365eeace84821f6e45d59cefd702827d', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.sellType_mgr.sellType.addSellType();', '1', '');
INSERT INTO `t_action` VALUES ('264435a21bf6a59d2d4e2065244cf858', 'e8a2f672e16b2dcaf720a8b0586e99fd', '4e23476d801ed12824a42aca3f813617', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.warInType_mgr.warInType.delWarInType();', '3', '');
INSERT INTO `t_action` VALUES ('289adb04b61fb737bd7da153c0750f16', '295ffaf17338b3621d532bfe8ee6c779', 'af5f8e8847920dc7fd6347e3a4e9c467', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.comNature_mgr.comNature.editComNature();', '2', '');
INSERT INTO `t_action` VALUES ('293b275e09230acf37f0aa98031c83c0', '90998bf3c3173da5e8319d70cec8a7ab', 'f664c6028d8cab504f2771fa78d56312', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.sellReturnReason_mgr.sellReturnReason.delSellReturnReason();', '3', '');
INSERT INTO `t_action` VALUES ('2c69d455096c537bf3df243febdb5a93', '2261cc3a4a23b23bd6317021981fbd1e', '6dbbdf0a9349268ead711fc84f3da291', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.suppliersType_mgr.suppliersType.editSuppliersType();', '2', '');
INSERT INTO `t_action` VALUES ('301ae7590f12623a1ff3aa43c77a6a26', 'd29229a817d81ed224df8c53d2f48f3d', '4284f4950bf67217bf1816260419ebbb', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.quotedPriceType_mgr.quotedPriceType.editQuotedPriceType();', '2', '');
INSERT INTO `t_action` VALUES ('32740020a8816f83b38564a64eee4278', 'e42b98561176563f930d82c80b041ed8', 'f769a64bb571aa0c7ac269b807af4782', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.system_mgr.loginlog_mgr.loginlog.delLoginlog();', '1', null);
INSERT INTO `t_action` VALUES ('36e847cc5b5744525c0b3b2985d196b9', 'c9845e00a5b709d5659d4011119daa67', 'c2a06009f4a31f5c63c6631a869ad813', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.suppliersGrade_mgr.suppliersGrade.delSuppliersGrade();', '3', '');
INSERT INTO `t_action` VALUES ('377f401ba2cfbd0ccfdbf0739f0fff48', 'a35ca1bb25e1f11898c78eb03332554b', '5252a18b51e04ddf499aac66a8245367', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.warOccupationType_mgr.warOccupationType.addWarOccupationType();', '1', '');
INSERT INTO `t_action` VALUES ('380b3c09490efab8df31bf0d3ffa746f', '2261cc3a4a23b23bd6317021981fbd1e', '6dbbdf0a9349268ead711fc84f3da291', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.suppliersType_mgr.suppliersType.addSuppliersType();', '1', '');
INSERT INTO `t_action` VALUES ('3ac74098128017095a49fa85b61703d8', 'dc2dcb1b303c05b27e9c01dc23dcc5f7', '21f3486dd1b51463c4979dc80ef4009b', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.purchaseType_mgr.purchaseType.editPurchaseType();', '2', '');
INSERT INTO `t_action` VALUES ('4260fbed3c951dde2e25a56ac6d7693c', '0eac3f9c7b4e4cdd5e42c56a16c85147', 'ad6926567cb16be8966308eb36583a57', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.comDeliverType_mgr.comDeliverType.addComDeliverType();', '1', '');
INSERT INTO `t_action` VALUES ('429f54b614db46af58598c8d9a47a36f', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.delPanel();', '3', null);
INSERT INTO `t_action` VALUES ('467e2099ef79c51a5ef12e93603cce5c', '00451bcfd707a2b5c3b80704f992dc21', '6659f9987cbbdf0721f8935b4a3d5a36', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.purchaseReturnedType_mgr.purchaseReturnedType.editPurchaseReturnedType();', '2', '');
INSERT INTO `t_action` VALUES ('47825847f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '3456eg4157cf483a790f4eea35ds5675', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.editOptgroupValue();', '2', null);
INSERT INTO `t_action` VALUES ('486ee8a95df71f04f384129d7471ff6d', 'ccec6c46d43b0e7c40ce5c1ffc0cb3e5', '0d7ed154eebe739d81a20da996d68e6b', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.purchaseReturnReason_mgr.purchaseReturnReason.addPurchaseReturnReason();', '1', '');
INSERT INTO `t_action` VALUES ('4a4acbb584f3c5601bbd1b9ed7a6062f', '0eac3f9c7b4e4cdd5e42c56a16c85147', 'ad6926567cb16be8966308eb36583a57', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.comDeliverType_mgr.comDeliverType.editComDeliverType();', '2', '');
INSERT INTO `t_action` VALUES ('4a876056b394778d17d8e1f548b7c840', 'aa165bf67dadbeedeb780b3e92dcdcdb', 'eb65d0304dc38ac4db140a1c10fdc7d3', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.sellReturnType_mgr.sellReturnType.editSellReturnType();', '2', '');
INSERT INTO `t_action` VALUES ('4b72b8dcc33ff635ea8bfa9c2ed38263', 'bfe6aa265cb92e35e9920f98a61df508', 'afb1cf326e78fe292af33b76aeef02cd', '添加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.goodsList_mgr.goodsList.addGoodsList();', '1', '');
INSERT INTO `t_action` VALUES ('4d05ce95cb561b35788bc8d2911d8419', '0d5f941c0e815519b859afa0992eda0b', 'bbf240fc8c53886e327ff15976026945', '分配角色', 'assign', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.system_mgr.dep_mgr.dep.assignDep();', '4', '');
INSERT INTO `t_action` VALUES ('527cb8cba3673d10375a88bb75adeeab', '16635dfa4b5e1dda4fd5d804f430eeec', '7794769fe25fd3fb2f2534fb8ec9e668', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.clientSource_mgr.clientSource.editClientSource();', '2', '');
INSERT INTO `t_action` VALUES ('5300c78332708702525328aec0963016', 'e8a2f672e16b2dcaf720a8b0586e99fd', '4e23476d801ed12824a42aca3f813617', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.warInType_mgr.warInType.editWarInType();', '2', '');
INSERT INTO `t_action` VALUES ('54c90c0fa9cd518840bc9dbb649fb806', '295ffaf17338b3621d532bfe8ee6c779', 'af5f8e8847920dc7fd6347e3a4e9c467', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.comNature_mgr.comNature.delComNature();', '3', '');
INSERT INTO `t_action` VALUES ('5652a940a901f412456efc1ecf13b634', '0d5f941c0e815519b859afa0992eda0b', 'bbf240fc8c53886e327ff15976026945', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.system_mgr.dep_mgr.dep.delDep();', '3', '');
INSERT INTO `t_action` VALUES ('57c33059be2f294cb6df1ed6f8ba8e25', 'e8a2f672e16b2dcaf720a8b0586e99fd', '4e23476d801ed12824a42aca3f813617', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.warInType_mgr.warInType.addWarInType();', '1', '');
INSERT INTO `t_action` VALUES ('5825847f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '3456eg4157cf483a790f4eea35ds5675', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.delOptgroupValue();', '3', null);
INSERT INTO `t_action` VALUES ('58660bccb69289b1f0299d9a664931d3', '91ca1b4b197688f21b68a72f69e09a8d', '37011217016636a0723462dbc81bf887', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.system_mgr.user_mgr.user.editUser();', '2', null);
INSERT INTO `t_action` VALUES ('58c66ce489e1ee8588e881a1abe9de56', '93f0fcfa7cdff069d929723062b53211', 'e6784ccad10e3414b99b77b303a338c7', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.variables_mgr.variables.editVariables();', '2', null);
INSERT INTO `t_action` VALUES ('58e1ae547ab73090f5a5497ac6a2c76d', '295ffaf17338b3621d532bfe8ee6c779', 'af5f8e8847920dc7fd6347e3a4e9c467', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.comNature_mgr.comNature.addComNature();', '1', '');
INSERT INTO `t_action` VALUES ('5976836e651b45350e017f69fbf3bd4e', 'ea92abb340a62dfd3ecc9b5e4d78c041', '42741ce0beb570a8e14a6bee5b2e9cab', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.warDeployType_mgr.warDeployType.addWarDeployType();', '1', '');
INSERT INTO `t_action` VALUES ('59ec881007a26cc63adfda4a22e3561f', 'a35ca1bb25e1f11898c78eb03332554b', '5252a18b51e04ddf499aac66a8245367', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.warOccupationType_mgr.warOccupationType.delWarOccupationType();', '3', '');
INSERT INTO `t_action` VALUES ('5db796929f23e991708fd0af99b3b4bc', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.role_mgr.role.addRole();', '1', null);
INSERT INTO `t_action` VALUES ('6712c8b2f0852d51eb9972422d372ff3', '82533b28131409450ad7a00229fd7333', '82385e2a3e64ac4cf4633ccb4c38c480', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.comContactType_mgr.comContactType.editComContactType();', '2', '');
INSERT INTO `t_action` VALUES ('6838d18fa1e582d4dc28404a80445c88', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.res_mgr.res.addMenu();', '1', null);
INSERT INTO `t_action` VALUES ('697b473a81d445cdef36da072c0427ba', 'c9845e00a5b709d5659d4011119daa67', 'c2a06009f4a31f5c63c6631a869ad813', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.suppliersGrade_mgr.suppliersGrade.addSuppliersGrade();', '1', '');
INSERT INTO `t_action` VALUES ('6b73fd176d2e32f1dee38a760e7bdb61', 'd29229a817d81ed224df8c53d2f48f3d', '4284f4950bf67217bf1816260419ebbb', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.quotedPriceType_mgr.quotedPriceType.delQuotedPriceType();', '3', '');
INSERT INTO `t_action` VALUES ('6c0bc1e009b3742af24d7bdc94adec3c', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.res_mgr.res.addPanel();', '1', null);
INSERT INTO `t_action` VALUES ('6d8af71a871f3bf13016153d51ab9dc7', '16635dfa4b5e1dda4fd5d804f430eeec', '7794769fe25fd3fb2f2534fb8ec9e668', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.clientSource_mgr.clientSource.delClientSource();', '3', '');
INSERT INTO `t_action` VALUES ('6db054225117794f9997d7b9d5c5c826', '1b41e29c8712c9f36bc3a520a8e5363b', '95eaa68d7a4109e845d63ef82cdb0d3f', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.financeCostType_mgr.financeCostType.editFinanceCostType();', '2', '');
INSERT INTO `t_action` VALUES ('6e1027dd7e57195d06dd2fac811f8ebf', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.editMenu();', '2', null);
INSERT INTO `t_action` VALUES ('6ebb0c66afb41e8cf0d890ea46ab54ca', 'ac892df07f9087fb1c89ac968bb5f555', '557cf8b2740e6792f517138703afb407', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.system_mgr.operalog_mgr.operalog.delOperalog();', '1', null);
INSERT INTO `t_action` VALUES ('6f27ff5d0ea6db9718deb396dcd54cb0', 'bc38d000dee30299a20f254c0aec0aaf', '511268ad8f3a8e0717381748f5f3ae8d', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.suppliersSource_mgr.suppliersSource.delSuppliersSource();', '3', '');
INSERT INTO `t_action` VALUES ('75c176566b9105b26c44f0b97050dcbf', '0d5f941c0e815519b859afa0992eda0b', 'bbf240fc8c53886e327ff15976026945', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.dep_mgr.dep.addDep();', '1', '');
INSERT INTO `t_action` VALUES ('75ef694872b72e65e08bb60c54941e21', 'ccec6c46d43b0e7c40ce5c1ffc0cb3e5', '0d7ed154eebe739d81a20da996d68e6b', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.purchaseReturnReason_mgr.purchaseReturnReason.delPurchaseReturnReason();', '3', '');
INSERT INTO `t_action` VALUES ('7a7a5d8f8127137351818b5f05a5e721', '4f2b136adfaf68b741d58df8e4adc4ff', '977a07ecaf616fcd4ba6e47b19896a42', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.financePayableType_mgr.financePayableType.addFinancePayableType();', '1', '');
INSERT INTO `t_action` VALUES ('7a9370d9f05cee1792cb30ece363d031', 'bfe6aa265cb92e35e9920f98a61df508', 'afb1cf326e78fe292af33b76aeef02cd', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.goodsList_mgr.goodsList.delGoodsList();', '3', '');
INSERT INTO `t_action` VALUES ('7c3c0638f3699c4cead64be05a4eff4b', '79d4fbfb8f73e4e21ee67e1d6ad9ff5e', 'efe32f25f6d4eab27c74e3dbcf326b47', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.basisClient_mgr.basisClient.addBasisClient();', '1', '');
INSERT INTO `t_action` VALUES ('7cd6206e5d6cf22c466105eef922fadd', '8fc3b6de8076d1e8c3a6514bd29c4c4b', 'c7796dffd9d50588655cfc9d6a297efc', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.comPaymentType_mgr.comPaymentType.editComPaymentType();', '2', '');
INSERT INTO `t_action` VALUES ('84fd30c2b03282a32dd9e0d552130442', '91ca1b4b197688f21b68a72f69e09a8d', '37011217016636a0723462dbc81bf887', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.user_mgr.user.addUser();', '1', null);
INSERT INTO `t_action` VALUES ('8530139f0e736a796d5ac4bdd78eadc', 'sdsfeg4157cf483a790f4eea35ds5675', '4546fgrgrh1dfhsjdfh124564sdf2sag', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.addOptgroup();', '1', null);
INSERT INTO `t_action` VALUES ('8537147f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '4546fgrgrh1dfhsjdfh124564sdf2sag', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.delOptgroup();', '3', null);
INSERT INTO `t_action` VALUES ('8537899f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '4546fgrgrh1dfhsjdfh124564sdf2sag', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.editOptgroup();', '2', null);
INSERT INTO `t_action` VALUES ('872b9916549e55209ca59cb4e1fb5ae9', '801ecf764a95da45ccbd194800c0eeeb', 'bbab3b6621262de4ca87aee3025b8966', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.warehouse_mgr.warehouse.editWarehouse();', '2', '');
INSERT INTO `t_action` VALUES ('884d40589528f855619ab40b43e99922', '801ecf764a95da45ccbd194800c0eeeb', 'bbab3b6621262de4ca87aee3025b8966', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.warehouse_mgr.warehouse.delWarehouse();', '3', '');
INSERT INTO `t_action` VALUES ('897843ed4d61f9ba7d09434e6943590f', '79d4fbfb8f73e4e21ee67e1d6ad9ff5e', 'efe32f25f6d4eab27c74e3dbcf326b47', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.basisClient_mgr.basisClient.editBasisClient();', '2', '');
INSERT INTO `t_action` VALUES ('8c8d20ba6b12fbdb94f4244b28ea69cd', '66761e0ea9850fd6cdfc59f282de2ebb', '9e374c52fd0ee843ee81b70c8a1b13d2', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.clientType_mgr.clientType.editClientType();', '2', '');
INSERT INTO `t_action` VALUES ('8cb6abf3445367c52e0e85e878c83e46', 'a35ca1bb25e1f11898c78eb03332554b', '5252a18b51e04ddf499aac66a8245367', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.warOccupationType_mgr.warOccupationType.editWarOccupationType();', '2', '');
INSERT INTO `t_action` VALUES ('8eb3b50d119f05c30127c3359e4a5d2a', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.role_mgr.role.delRole();', '3', null);
INSERT INTO `t_action` VALUES ('9163777154ed8cc571d1a4ca5ac5d8b1', 'bc38d000dee30299a20f254c0aec0aaf', '511268ad8f3a8e0717381748f5f3ae8d', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.suppliersSource_mgr.suppliersSource.addSuppliersSource();', '1', '');
INSERT INTO `t_action` VALUES ('916e71e34065c3420f97915b67ed12f9', '00451bcfd707a2b5c3b80704f992dc21', '6659f9987cbbdf0721f8935b4a3d5a36', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.purchaseReturnedType_mgr.purchaseReturnedType.addPurchaseReturnedType();', '1', '');
INSERT INTO `t_action` VALUES ('917539b81296b191513c8c5942a5e306', 'c81a4c0156789361600940be2ebdab2c', '628e3c73409f37c6d28bdd97ed61b5fc', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.clientLevel_mgr.clientLevel.addClientLevel();', '1', '');
INSERT INTO `t_action` VALUES ('9320f5b0199abd8d53990eef7cdcd745', '54eb754157cf483a790f4eea35200118', 'eb2a84c4b7bd11632135e4992ade286e', '编辑', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.editAction();', '2', null);
INSERT INTO `t_action` VALUES ('939cfbe44bddcff99deed80e7a472997', 'ebd8d76ac65eea1c8d65ac5c14da27b0', 'cef00aa1a7ab2338e5bb4e85e311af6f', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.comIndustry_mgr.comIndustry.delComIndustry();', '3', '');
INSERT INTO `t_action` VALUES ('96325847f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '3456eg4157cf483a790f4eea35ds5675', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.addOptgroupValue();', '1', null);
INSERT INTO `t_action` VALUES ('9a4afcb595389b7bbf59b08e0f983b0d', '8fc3b6de8076d1e8c3a6514bd29c4c4b', 'c7796dffd9d50588655cfc9d6a297efc', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.comPaymentType_mgr.comPaymentType.delComPaymentType();', '3', '');
INSERT INTO `t_action` VALUES ('9b3d4e690948a1290f7ccea6327868e0', 'ebd8d76ac65eea1c8d65ac5c14da27b0', 'cef00aa1a7ab2338e5bb4e85e311af6f', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.comIndustry_mgr.comIndustry.addComIndustry();', '1', '');
INSERT INTO `t_action` VALUES ('9cdc7b08f06304c42f1e6c408f170fcb', '93f0fcfa7cdff069d929723062b53211', 'e6784ccad10e3414b99b77b303a338c7', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.variables_mgr.variables.addVariables();', '1', null);
INSERT INTO `t_action` VALUES ('9dfcdfc6becbf920be628c30a8906d80', 'dc2dcb1b303c05b27e9c01dc23dcc5f7', '21f3486dd1b51463c4979dc80ef4009b', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.purchaseType_mgr.purchaseType.delPurchaseType();', '3', '');
INSERT INTO `t_action` VALUES ('9ffc444223f48cb8f88a00c5855a6c99', 'ccec6c46d43b0e7c40ce5c1ffc0cb3e5', '0d7ed154eebe739d81a20da996d68e6b', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.purchaseReturnReason_mgr.purchaseReturnReason.editPurchaseReturnReason();', '2', '');
INSERT INTO `t_action` VALUES ('a124a6716dfb677b0654ce2bb4d36546', '8a2f2500fa46e49dd7ff11b688b6c740', 'ad67aaf12a02906ad088a73410fd097e', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.companySize_mgr.companySize.delCompanySize();', '3', '');
INSERT INTO `t_action` VALUES ('a18a84d6a769941ab82dc049814948a0', '16669401121c47c062cac4d11a21522e', '4df3645386cbf2317d35ecf218939b71', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.warOutType_mgr.warOutType.addWarOutType();', '1', '');
INSERT INTO `t_action` VALUES ('a55d3061c3d01adc8e1b0358c49fc4e7', 'd29229a817d81ed224df8c53d2f48f3d', '4284f4950bf67217bf1816260419ebbb', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.quotedPriceType_mgr.quotedPriceType.addQuotedPriceType();', '1', '');
INSERT INTO `t_action` VALUES ('a68af5a4e9e91134bf97ded78208b1c5', '66761e0ea9850fd6cdfc59f282de2ebb', '9e374c52fd0ee843ee81b70c8a1b13d2', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.clientType_mgr.clientType.delClientType();', '3', '');
INSERT INTO `t_action` VALUES ('ab0f035104ae27e2fa0a5bd28ebe409e', '16635dfa4b5e1dda4fd5d804f430eeec', '7794769fe25fd3fb2f2534fb8ec9e668', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.clientSource_mgr.clientSource.addClientSource();', '1', '');
INSERT INTO `t_action` VALUES ('ae8377f4dee2f49d7ff54d8d7fcc0df6', '0eac3f9c7b4e4cdd5e42c56a16c85147', 'ad6926567cb16be8966308eb36583a57', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.comDeliverType_mgr.comDeliverType.delComDeliverType();', '3', '');
INSERT INTO `t_action` VALUES ('b5852fac0798a25a13b87e8532c60440', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.delMenu();', '3', null);
INSERT INTO `t_action` VALUES ('b666b551b8528b1562626fa1b4691e22', '82533b28131409450ad7a00229fd7333', '82385e2a3e64ac4cf4633ccb4c38c480', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.comContactType_mgr.comContactType.delComContactType();', '3', '');
INSERT INTO `t_action` VALUES ('b6a27dc1819230f61617bb0d9c25dd2f', 'dc2dcb1b303c05b27e9c01dc23dcc5f7', '21f3486dd1b51463c4979dc80ef4009b', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.purchaseType_mgr.purchaseType.addPurchaseType();', '1', '');
INSERT INTO `t_action` VALUES ('b7e88da8c1dec3668ca66340dabee03f', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '授权', 'auth', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.role_mgr.role.actionAuth();', '4', null);
INSERT INTO `t_action` VALUES ('b858df774a3292b2e64c92aac5332681', '1b41e29c8712c9f36bc3a520a8e5363b', '95eaa68d7a4109e845d63ef82cdb0d3f', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.financeCostType_mgr.financeCostType.delFinanceCostType();', '3', '');
INSERT INTO `t_action` VALUES ('b86dd096846f200ee7b305eb2562cdc2', 'a4d88b8b3c70b93d69d0bf24ffb09377', '6cfa450f398c5384de09368f8b7094ab', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.suppliers_mgr.suppliers.delSuppliers();', '3', '');
INSERT INTO `t_action` VALUES ('c28dc169ad75cb06b737caa36a4ffd30', '8fc3b6de8076d1e8c3a6514bd29c4c4b', 'c7796dffd9d50588655cfc9d6a297efc', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.comPaymentType_mgr.comPaymentType.addComPaymentType();', '1', '');
INSERT INTO `t_action` VALUES ('c443543fd454dd4ef6df28772c36eb39', '00451bcfd707a2b5c3b80704f992dc21', '6659f9987cbbdf0721f8935b4a3d5a36', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.purchaseReturnedType_mgr.purchaseReturnedType.delPurchaseReturnedType();', '3', '');
INSERT INTO `t_action` VALUES ('c5388f61718417c695d71deabb1fb7f1', '79d4fbfb8f73e4e21ee67e1d6ad9ff5e', 'efe32f25f6d4eab27c74e3dbcf326b47', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.basisClient_mgr.basisClient.delBasisClient();', '3', '');
INSERT INTO `t_action` VALUES ('c971a7760c5b98501c9e5e7a5598fc15', 'bfe6aa265cb92e35e9920f98a61df508', 'afb1cf326e78fe292af33b76aeef02cd', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.goodsList_mgr.goodsList.editGoodsList();', '2', '');
INSERT INTO `t_action` VALUES ('cab1e5fd5d1bdd3257344d94083b6e0e', '90998bf3c3173da5e8319d70cec8a7ab', 'f664c6028d8cab504f2771fa78d56312', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.sellReturnReason_mgr.sellReturnReason.addSellReturnReason();', '1', '');
INSERT INTO `t_action` VALUES ('ccc389b6852eb8f9d17057d433276b09', '66761e0ea9850fd6cdfc59f282de2ebb', '9e374c52fd0ee843ee81b70c8a1b13d2', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.clientType_mgr.clientType.addClientType();', '1', '');
INSERT INTO `t_action` VALUES ('d8121384c9b7ffa3e04bde9222f16b72', '90998bf3c3173da5e8319d70cec8a7ab', 'f664c6028d8cab504f2771fa78d56312', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.sellReturnReason_mgr.sellReturnReason.editSellReturnReason();', '2', '');
INSERT INTO `t_action` VALUES ('d94d6c0df8ca7322bdbe99279c140243', 'bc38d000dee30299a20f254c0aec0aaf', '511268ad8f3a8e0717381748f5f3ae8d', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.suppliersSource_mgr.suppliersSource.editSuppliersSource();', '2', '');
INSERT INTO `t_action` VALUES ('dad8f671986722837f7eecb2b77c284b', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.editPanel();', '2', null);
INSERT INTO `t_action` VALUES ('dc856e5fdff4bd17953da32ff0a1ec83', 'ea92abb340a62dfd3ecc9b5e4d78c041', '42741ce0beb570a8e14a6bee5b2e9cab', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.warDeployType_mgr.warDeployType.editWarDeployType();', '2', '');
INSERT INTO `t_action` VALUES ('e1e5268cff61dc4231932ae1484caf97', '93f0fcfa7cdff069d929723062b53211', 'e6784ccad10e3414b99b77b303a338c7', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.variables_mgr.variables.delVariables();', '3', null);
INSERT INTO `t_action` VALUES ('e31bfd5e94c064bfc89c881f5f214e75', 'c81a4c0156789361600940be2ebdab2c', '628e3c73409f37c6d28bdd97ed61b5fc', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.clientLevel_mgr.clientLevel.delClientLevel();', '3', '');
INSERT INTO `t_action` VALUES ('e42491080e3eb105c4fa1becb609860a', '801ecf764a95da45ccbd194800c0eeeb', 'bbab3b6621262de4ca87aee3025b8966', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.warehouse_mgr.warehouse.addWarehouse();', '1', '');
INSERT INTO `t_action` VALUES ('e550884c5e6c1e94a970cc833aa1c2b9', '54eb754157cf483a790f4eea35200118', 'eb2a84c4b7bd11632135e4992ade286e', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.res_mgr.res.addAction();', '1', null);
INSERT INTO `t_action` VALUES ('e7a71593371bc3ff47f95b340453d13b', 'a4d88b8b3c70b93d69d0bf24ffb09377', '6cfa450f398c5384de09368f8b7094ab', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.suppliers_mgr.suppliers.addSuppliers();', '1', '');
INSERT INTO `t_action` VALUES ('e9c13caa85a6d333581bfd26a8d108d7', 'ea92abb340a62dfd3ecc9b5e4d78c041', '42741ce0beb570a8e14a6bee5b2e9cab', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.warDeployType_mgr.warDeployType.delWarDeployType();', '3', '');
INSERT INTO `t_action` VALUES ('ee6f881272d3da97f893e48a6da97994', 'aa165bf67dadbeedeb780b3e92dcdcdb', 'eb65d0304dc38ac4db140a1c10fdc7d3', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.sellReturnType_mgr.sellReturnType.delSellReturnType();', '3', '');
INSERT INTO `t_action` VALUES ('f175302ba155cb3c5206619004b5d86b', '810ba3686840457556cb55bc87d8010b', '365eeace84821f6e45d59cefd702827d', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.sellType_mgr.sellType.editSellType();', '2', '');
INSERT INTO `t_action` VALUES ('f314d065f68f2d4be08e5b3a62507815', 'ebd8d76ac65eea1c8d65ac5c14da27b0', 'cef00aa1a7ab2338e5bb4e85e311af6f', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.comIndustry_mgr.comIndustry.editComIndustry();', '2', '');
INSERT INTO `t_action` VALUES ('f4065bd55bb4d1a51db0cc775f854c6e', '0d5f941c0e815519b859afa0992eda0b', 'bbf240fc8c53886e327ff15976026945', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.system_mgr.dep_mgr.dep.editDep();', '2', '');
INSERT INTO `t_action` VALUES ('f4b5eca05e616d411f1aeef044346664', '54eb754157cf483a790f4eea35200118', 'eb2a84c4b7bd11632135e4992ade286e', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.delAction();', '3', null);
INSERT INTO `t_action` VALUES ('f77defad2ded207dd6b9ad004d78f3af', 'c9845e00a5b709d5659d4011119daa67', 'c2a06009f4a31f5c63c6631a869ad813', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.suppliersGrade_mgr.suppliersGrade.editSuppliersGrade();', '2', '');
INSERT INTO `t_action` VALUES ('f79ce922e6b0ce23c604bc303c62ab89', '16669401121c47c062cac4d11a21522e', '4df3645386cbf2317d35ecf218939b71', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.warOutType_mgr.warOutType.editWarOutType();', '2', '');
INSERT INTO `t_action` VALUES ('fc4a79d7d0831e00ec3157c560ce2784', 'aa165bf67dadbeedeb780b3e92dcdcdb', 'eb65d0304dc38ac4db140a1c10fdc7d3', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.sellReturnType_mgr.sellReturnType.addSellReturnType();', '1', '');

-- ----------------------------
-- Table structure for `t_assembly`
-- ----------------------------
DROP TABLE IF EXISTS `t_assembly`;
CREATE TABLE `t_assembly` (
  `assembly_id` varchar(32) NOT NULL,
  `assembly_code` varchar(32) default NULL,
  `warehouse_id` varchar(32) default NULL,
  `assembly_date` datetime default NULL,
  `batch` int(11) default NULL,
  `sum_indirect_costs` decimal(16,4) default NULL,
  `department` varchar(32) default NULL,
  `auditor_id` varchar(32) default NULL,
  `audit_date` datetime default NULL,
  `audit_state` enum('authstr','failure','pass') default NULL,
  `audit_remark` varchar(255) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`assembly_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_assembly
-- ----------------------------

-- ----------------------------
-- Table structure for `t_assembly_detail`
-- ----------------------------
DROP TABLE IF EXISTS `t_assembly_detail`;
CREATE TABLE `t_assembly_detail` (
  `assembly_detail_id` varchar(32) NOT NULL,
  `assembly_id` varchar(32) default NULL,
  `goods_id` varchar(32) default NULL,
  `goods_code` varchar(225) default NULL,
  `goods_name` varchar(255) default NULL,
  `goods_batch` varchar(255) default NULL,
  `goods_style` varchar(255) default NULL,
  `goods_unit` varchar(32) default NULL,
  `warehouse_id` varchar(32) default NULL,
  `prime_cost` decimal(16,4) default NULL,
  `order_number` int(11) default NULL,
  `assembly_total` decimal(16,4) default NULL,
  `remark` varchar(225) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`assembly_detail_id`),
  KEY `FK_Assembly_AssemblyDetail_AssemblyId` (`assembly_id`),
  CONSTRAINT `t_assembly_detail_ibfk_1` FOREIGN KEY (`assembly_id`) REFERENCES `t_assembly` (`assembly_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_assembly_detail
-- ----------------------------

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
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '00451bcfd707a2b5c3b80704f992dc21', 'PurchaseReturnedType_add,PurchaseReturnedType_edit,PurchaseReturnedType_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '07d7e1fd5f95ab20e7cb3090cd8ac7ba', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '0d5f941c0e815519b859afa0992eda0b', 'DepList_add,DepList_edit,DepList_del,DepList_assign');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '0eac3f9c7b4e4cdd5e42c56a16c85147', 'ComDeliveryTypeList_add,ComDeliveryTypeList_edit,ComDeliveryTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '14sdf54157cf483a790f4eea35dsf6f6', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '16635dfa4b5e1dda4fd5d804f430eeec', 'ClientSourceList_add,ClientSourceList_edit,ClientSourceList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '16669401121c47c062cac4d11a21522e', 'WarOutTypeList_add,WarOutTypeList_edit,WarOutTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '16ac1df11de350c61722dc7b98cecca7', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '1b41e29c8712c9f36bc3a520a8e5363b', 'FinanceCostTypeList_add,FinanceCostTypeList_edit,FinanceCostTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '2261cc3a4a23b23bd6317021981fbd1e', 'SuppliersTypeList_add,SuppliersTypeList_edit,SuppliersTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '23e47757685c7b53d87b114e0add3966', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '295ffaf17338b3621d532bfe8ee6c779', 'ComNatureList_add,ComNatureList_edit,ComNatureList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '2afb5ed7e423adf169914f7031af78db', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '3c56b44e8b5257490094b048877422b3', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '42294ceb4cbc4d64cff0cb5eaafb2d2e', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '4f2b136adfaf68b741d58df8e4adc4ff', 'FinancePayableTypeList_add,FinancePayableTypeList_edit,FinancePayableTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '54eb754157cf483a790f4eea35200118', 'ActionList_add,ActionList_edit,ActionList_del,PanelList_add,PanelList_edit,PanelList_del,MenuTree_add,MenuTree_edit,MenuTree_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '66761e0ea9850fd6cdfc59f282de2ebb', 'ClientTypeList_add,ClientTypeList_edit,ClientTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '66874136f65e1eb718d4299784f7c7d3', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '79d4fbfb8f73e4e21ee67e1d6ad9ff5e', 'ClientList_add,ClientList_edit,ClientList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '801ecf764a95da45ccbd194800c0eeeb', 'WarehouseList_add,WarehouseList_edit,WarehouseList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '810ba3686840457556cb55bc87d8010b', 'SellTypeList_add,SellTypeList_edit,SellTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '82533b28131409450ad7a00229fd7333', 'ComContactTypeList_add,ComContactTypeList_edit,ComContactTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '8a2f2500fa46e49dd7ff11b688b6c740', 'ComCompanySizeList_add,ComCompanySizeList_edit,ComCompanySizeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '8c54260cf2f6704a1739503465d9e9cf', 'FinanceReceivableTypeList_add,FinanceReceivableTypeList_edit,FinanceReceivableTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '8fc3b6de8076d1e8c3a6514bd29c4c4b', 'ComPaymentTypeList_add,ComPaymentTypeList_edit,ComPaymentTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '90998bf3c3173da5e8319d70cec8a7ab', 'SellReturnReasonList_add,SellReturnReasonList_edit,SellReturnReasonList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '91ca1b4b197688f21b68a72f69e09a8d', 'UserList_add,UserList_edit,UserList_assign');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '93f0fcfa7cdff069d929723062b53211', 'VariablesList_add,VariablesList_edit,VariablesList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'a35ca1bb25e1f11898c78eb03332554b', 'WarOccupationTypeList_add,WarOccupationTypeList_edit,WarOccupationTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'a4d88b8b3c70b93d69d0bf24ffb09377', 'SuppliersList_add,SuppliersList_edit,SuppliersList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'aa165bf67dadbeedeb780b3e92dcdcdb', 'SellReturnTypeList_add,SellReturnTypeList_edit,SellReturnTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'ac892df07f9087fb1c89ac968bb5f555', 'OperalogList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'bc38d000dee30299a20f254c0aec0aaf', 'SuppliersSourceList_add,SuppliersSourceList_edit,SuppliersSourceList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'bfe6aa265cb92e35e9920f98a61df508', 'GoodsList_add,GoodsList_edit,GoodsList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'c81a4c0156789361600940be2ebdab2c', 'ClientLevelList_add,ClientLevelList_edit,ClientLevelList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'c9845e00a5b709d5659d4011119daa67', 'SuppliersGradeList_add,SuppliersGradeList_edit,SuppliersGradeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'ccec6c46d43b0e7c40ce5c1ffc0cb3e5', 'PurchaseReturnReasonList_add,PurchaseReturnReasonList_edit,PurchaseReturnReasonList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'd29229a817d81ed224df8c53d2f48f3d', 'PurchaseQuotedPriceTypeList_add,PurchaseQuotedPriceTypeList_edit,PurchaseQuotedPriceTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'd46b0600ead708c4f5827b7082f2490a', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'dc2dcb1b303c05b27e9c01dc23dcc5f7', 'PurchaseTypeList_add,PurchaseTypeList_edit,PurchaseTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'e42b98561176563f930d82c80b041ed8', 'LoginlogList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'e550884c5e6c1e94ee70cc833aa1c2b9', 'RoleList_add,RoleList_edit,RoleList_del,RoleList_auth');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'e8a2f672e16b2dcaf720a8b0586e99fd', 'WarInTypeList_add,WarInTypeList_edit,WarInTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'ea92abb340a62dfd3ecc9b5e4d78c041', 'WarDeployTypeList_add,WarDeployTypeList_edit,WarDeployTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'ebd8d76ac65eea1c8d65ac5c14da27b0', 'ComIndustryList_add,ComIndustryList_edit,ComIndustryList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'fd696e8607c36c917f546787976f4fa8', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'sdsfeg4157cf483a790f4eea35ds5675', 'OptgroupValueList_add,OptgroupValueList_edit,OptgroupValueList_del,OptgroupTree_add,OptgroupTree_edit,OptgroupTree_del');

-- ----------------------------
-- Table structure for `t_basis_client`
-- ----------------------------
DROP TABLE IF EXISTS `t_basis_client`;
CREATE TABLE `t_basis_client` (
  `client_id` varchar(32) NOT NULL,
  `client_code` varchar(50) default NULL,
  `client_type_id` varchar(32) default NULL,
  `client_name` varchar(32) default NULL COMMENT '客户名称',
  `client_grade` varchar(32) default NULL COMMENT '客户级别',
  `client_source` varchar(32) default NULL COMMENT '客户来源',
  `province_manager` varchar(32) default NULL COMMENT '省级经理',
  `service_manager` varchar(32) default NULL COMMENT '业务经理',
  `company_scale` varchar(32) default NULL COMMENT '公司规模',
  `marketing_department` varchar(32) default NULL COMMENT '销售部门',
  `company_phone` varchar(32) default NULL,
  `company_fax` varchar(32) default NULL,
  `company_website` varchar(32) default NULL,
  `company_email` varchar(32) default NULL,
  `province` varchar(32) default NULL,
  `city` varchar(32) default NULL,
  `adress` varchar(255) default NULL,
  `zip_code` varchar(32) default NULL,
  `price_policy` enum('policy1','policy2','policy3','policy4','policy5','policy6','policy7','policy8','policy9','policy10') default NULL,
  `contact_cycle` int(4) default NULL,
  `company_nature_id` varchar(32) default NULL,
  `main_business` varchar(32) default NULL,
  `opened_year` datetime default NULL,
  `registered_capital` decimal(16,4) default NULL,
  `corporate` varchar(32) default NULL,
  `credit_level_id` varchar(32) default NULL,
  `client_integral` varchar(32) default NULL,
  `bank` varchar(32) default NULL,
  `bank_account` varchar(20) default NULL,
  `tariff` varchar(32) default NULL,
  `control_credit` enum('yes','no') default NULL,
  `limit_credit` decimal(16,4) default NULL,
  `present_credit` decimal(16,4) default NULL,
  `present_debt` decimal(16,4) default NULL,
  `advances_received` decimal(16,4) default NULL,
  `setup_person` varchar(32) default NULL,
  `setup_time` datetime default NULL,
  `client_create` datetime default NULL,
  `superior_client_id` varchar(32) default NULL,
  `accessory` varchar(255) default NULL,
  `staff_id` varchar(32) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `remark` varchar(255) default NULL,
  `audit_state` enum('authstr','pass','failure') default NULL,
  `auditor` varchar(32) default NULL,
  `audit_date` datetime default NULL,
  `audit_remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`client_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_basis_client
-- ----------------------------

-- ----------------------------
-- Table structure for `t_basis_client_contact`
-- ----------------------------
DROP TABLE IF EXISTS `t_basis_client_contact`;
CREATE TABLE `t_basis_client_contact` (
  `client_contact_id` varchar(32) NOT NULL,
  `client_id` varchar(32) default NULL,
  `contact_type_id` varchar(32) default NULL,
  `name` varchar(32) default NULL,
  `sex` enum('man','woman') default NULL,
  `department` varchar(32) default NULL,
  `post` varchar(32) default NULL,
  `business` varchar(100) default NULL,
  `work_phone` varchar(32) default NULL,
  `mobilephone` varchar(32) default NULL,
  `fox` varchar(32) default NULL,
  `email` varchar(32) default NULL,
  `home_phone` varchar(32) default NULL,
  `adrress` varchar(100) default NULL,
  `communications` varchar(32) default NULL,
  `birthday` datetime default NULL,
  `hobby` varchar(50) default NULL,
  `number` varchar(32) default NULL,
  `remark` varchar(255) default NULL,
  PRIMARY KEY  (`client_contact_id`),
  KEY `FK_T_BASIS__T_BASIS_C_T_BASIS_` (`client_id`),
  CONSTRAINT `t_basis_client_contact_ibfk_1` FOREIGN KEY (`client_id`) REFERENCES `t_basis_client` (`client_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_basis_client_contact
-- ----------------------------

-- ----------------------------
-- Table structure for `t_basis_client_contact_record`
-- ----------------------------
DROP TABLE IF EXISTS `t_basis_client_contact_record`;
CREATE TABLE `t_basis_client_contact_record` (
  `contact_record_id` varchar(32) NOT NULL,
  `next_cont_date` datetime default NULL,
  `contact_thime` varchar(50) default NULL,
  `contact_content` varchar(255) default NULL,
  `contact_date` datetime default NULL,
  `accessory` varchar(255) default NULL,
  `staff_id` varchar(32) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`contact_record_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_basis_client_contact_record
-- ----------------------------

-- ----------------------------
-- Table structure for `t_contact_person`
-- ----------------------------
DROP TABLE IF EXISTS `t_contact_person`;
CREATE TABLE `t_contact_person` (
  `contact_person_id` varchar(32) NOT NULL,
  `contact_type_id` varchar(32) default NULL,
  `supplier_id` varchar(32) default NULL,
  `name` varchar(32) default NULL,
  `sex` enum('boy','girl') default NULL,
  `department` varchar(32) default NULL,
  `post` varchar(32) default NULL,
  `responsible_business` varchar(32) default NULL,
  `work_phone` varchar(32) default NULL,
  `mobile_telephone` varchar(32) default NULL,
  `fax` varchar(32) default NULL,
  `postcode` varchar(32) default NULL,
  `home_phone` varchar(100) default NULL,
  `home_adress` varchar(255) default NULL,
  `msn` varchar(32) default NULL,
  `qq` varchar(32) default NULL,
  `birthday` datetime default NULL,
  `hobby` varchar(32) default NULL,
  `remark` varchar(255) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `creater` varchar(32) default NULL COMMENT 'ö�٣�(����1/����0)',
  `create_time` datetime default NULL COMMENT '¼��ʱ��',
  `updater` varchar(32) default NULL COMMENT '����޸���',
  `update_time` datetime default NULL COMMENT '����޸�ʱ��',
  PRIMARY KEY  (`contact_person_id`),
  KEY `FK_ContactPerson_ContactType_ContactTypeId` (`contact_type_id`),
  KEY `FK_ContactPerson_Suppliers_ContactPersonId` (`supplier_id`),
  CONSTRAINT `t_contact_person_ibfk_1` FOREIGN KEY (`supplier_id`) REFERENCES `t_suppliers` (`supplier_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_contact_person
-- ----------------------------

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
INSERT INTO `t_dep` VALUES ('1ff32f3ab5bd95584a429130956fecea', '管理部', 'system', null, '1', '', 'admin', '2015-01-06 17:10:21');
INSERT INTO `t_dep` VALUES ('2fae527622659411b5cf466793cd6', '开发总部', 'develop', null, '2', '1', '2', '2015-01-05 16:50:55');
INSERT INTO `t_dep` VALUES ('5484ccad10e3414b99b77b303as62', '开发部1', 'develop1', '2fae527622659411b5cf466793cd6', '2', '2', '65', '2015-01-05 17:06:57');

-- ----------------------------
-- Table structure for `t_deplayt_detail`
-- ----------------------------
DROP TABLE IF EXISTS `t_deplayt_detail`;
CREATE TABLE `t_deplayt_detail` (
  `deploy_detai_id` varchar(32) NOT NULL,
  `deploy_id` varchar(32) default NULL,
  `goods_id` varchar(32) default NULL,
  `goods_code` varchar(225) default NULL,
  `goods_name` varchar(255) default NULL,
  `goods_batch` varchar(255) default NULL,
  `goods_style` varchar(255) default NULL,
  `goods_unit` varchar(32) default NULL,
  `allot_number` int(4) default NULL,
  `come_number` int(4) default NULL,
  `out_normal` int(4) default NULL,
  `last_time` datetime default NULL,
  `nature` varchar(32) default NULL,
  `remark` varchar(225) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`deploy_detai_id`),
  KEY `FK_Deploy_DeplaytDetail_DeployId` (`deploy_id`),
  CONSTRAINT `t_deplayt_detail_ibfk_1` FOREIGN KEY (`deploy_id`) REFERENCES `t_deploy` (`deploy_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_deplayt_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `t_deploy`
-- ----------------------------
DROP TABLE IF EXISTS `t_deploy`;
CREATE TABLE `t_deploy` (
  `deploy_id` varchar(32) NOT NULL,
  `deploy_code` varchar(32) default NULL,
  `warehouse_in_id` varchar(32) default NULL,
  `warehouse_out_id` varchar(32) default NULL,
  `attn` varchar(32) default NULL,
  `attachment_url` varchar(500) default NULL,
  `latest_date` datetime default NULL,
  `auditor_id` varchar(32) default NULL,
  `audit_date` datetime default NULL,
  `audit_state` enum('authstr','failure','pass') default NULL,
  `audit_remark` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  `department` varchar(32) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`deploy_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_deploy
-- ----------------------------

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
INSERT INTO `t_dep_role` VALUES ('1ff32f3ab5bd95584a429130956fecea', '56078492e2eed9eb33f32c3af54a8e3f');
INSERT INTO `t_dep_role` VALUES ('5484ccad10e3414b99b77b303as62', '56078492e2eed9eb33f32c3af54a8e3f');

-- ----------------------------
-- Table structure for `t_different_deploy`
-- ----------------------------
DROP TABLE IF EXISTS `t_different_deploy`;
CREATE TABLE `t_different_deploy` (
  `different_deploy_id` varchar(32) NOT NULL,
  `different_deploy_code` varchar(32) default NULL,
  `warehouse_in_id` varchar(32) default NULL,
  `warehouse_out_id` varchar(32) default NULL,
  `different_deploy_date` datetime default NULL,
  `deploy_type_id` varchar(32) default NULL,
  `same_total` decimal(16,4) default NULL,
  `department_id` varchar(32) default NULL,
  `arrival_time` datetime default NULL,
  `remark` varchar(255) default NULL,
  `attn` varchar(32) default NULL,
  `department` varchar(32) default NULL,
  `delivery_id` varchar(32) default NULL,
  `total_freight` decimal(16,4) default NULL,
  `freight_share` enum('yes','no') default NULL,
  `logistics` varchar(32) default NULL,
  `logistics_contact` varchar(32) default NULL,
  `logistics_phone` varchar(100) default NULL,
  `auditor_id` varchar(32) default NULL,
  `audit_date` datetime default NULL,
  `audit_state` enum('authstr','failure','pass') default NULL,
  `enabled` enum('enable','disable') default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  `audit_remark` varchar(255) default NULL,
  PRIMARY KEY  (`different_deploy_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_different_deploy
-- ----------------------------

-- ----------------------------
-- Table structure for `t_different_detail`
-- ----------------------------
DROP TABLE IF EXISTS `t_different_detail`;
CREATE TABLE `t_different_detail` (
  `different_detai_id` varchar(32) NOT NULL,
  `different_deploy_id` varchar(32) default NULL,
  `goods_id` varchar(32) default NULL,
  `goods_code` varchar(225) default NULL,
  `goods_name` varchar(255) default NULL,
  `goods_batch` varchar(255) default NULL,
  `goods_style` varchar(255) default NULL,
  `goods_unit` varchar(32) default NULL,
  `allot_number` int(11) default NULL,
  `allot_price` decimal(16,4) default NULL,
  `total_money` decimal(16,4) default NULL,
  `remark` varchar(225) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`different_detai_id`),
  KEY `FK_DifferentDeploy_DifferentDetail_DifferentDeployId` (`different_deploy_id`),
  CONSTRAINT `t_different_detail_ibfk_1` FOREIGN KEY (`different_deploy_id`) REFERENCES `t_different_deploy` (`different_deploy_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_different_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `t_finance_advance`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_advance`;
CREATE TABLE `t_finance_advance` (
  `finance_adv_id` varchar(32) NOT NULL,
  `payable_id` varchar(32) default NULL,
  `payment_id` varchar(32) default NULL,
  `advance_code` varchar(50) default NULL,
  `supplier_id` varchar(32) default NULL,
  `supplier_code` varchar(32) default NULL,
  `payment_type_id` varchar(32) default NULL,
  `account` varchar(32) default NULL,
  `advance_amount` decimal(16,4) default NULL,
  `advance_date` datetime default NULL,
  `auditor` varchar(32) default NULL,
  `audit_state` enum('authstr','pass','failure') default NULL,
  `audit_date` datetime default NULL,
  `audit_remark` varchar(255) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `operators` varchar(32) default NULL,
  `operator_dep` varchar(32) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`finance_adv_id`),
  KEY `FK_T_FINANC_FINANCE_P_T_FINANC1` (`payable_id`),
  CONSTRAINT `t_finance_advance_ibfk_1` FOREIGN KEY (`payable_id`) REFERENCES `t_finance_payable` (`payable_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_finance_advance
-- ----------------------------

-- ----------------------------
-- Table structure for `t_finance_advance_rec`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_advance_rec`;
CREATE TABLE `t_finance_advance_rec` (
  `advance_rec_id` varchar(32) NOT NULL,
  `advance_rec_code` varchar(50) default NULL,
  `receipt_id` varchar(32) default NULL,
  `send_id` varchar(32) default NULL,
  `advance_rec_date` datetime default NULL,
  `client_id` varchar(32) default NULL,
  `payment_type_id` varchar(32) default NULL,
  `account` varchar(32) default NULL,
  `advance_rec_amount` decimal(16,4) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `remark` varchar(255) default NULL,
  `audit_state` enum('authstr','pass','failure') default NULL,
  `auditor` varchar(32) default NULL,
  `audit_date` datetime default NULL,
  `audit_remark` varchar(100) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`advance_rec_id`),
  KEY `FK_T_FINANC_T_FINANCE_T_FINANC1` (`receipt_id`),
  KEY `FK_T_FINANC_T_SELL_SE_T_SELL_S1` (`send_id`),
  CONSTRAINT `t_finance_advance_rec_ibfk_1` FOREIGN KEY (`send_id`) REFERENCES `t_sell_send` (`send_id`),
  CONSTRAINT `t_finance_advance_rec_ibfk_2` FOREIGN KEY (`receipt_id`) REFERENCES `t_finance_receipt` (`receipt_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_finance_advance_rec
-- ----------------------------

-- ----------------------------
-- Table structure for `t_finance_payable`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_payable`;
CREATE TABLE `t_finance_payable` (
  `payable_id` varchar(32) NOT NULL,
  `payable_code` varchar(50) default NULL,
  `pur_order_id` varchar(32) default NULL,
  `pur_arrival_id` varchar(32) default NULL,
  `pur_return_id` varchar(32) default NULL,
  `payabel_date` datetime default NULL,
  `payable_type_id` varchar(32) default NULL,
  `invoice` enum('yes','no') default NULL,
  `invoice_type` enum('specialvat','generalvat','generaltax','ordinarytax','receipt') default NULL,
  `invoice_start` varchar(50) default NULL,
  `payment_type_id` varchar(100) default NULL,
  `payment_terms` datetime default NULL,
  `amount_rec` decimal(16,4) default NULL,
  `amount_paid` decimal(16,4) default NULL,
  `amount_reduce` decimal(16,4) default NULL,
  `alr_pay_amo` decimal(16,4) default NULL,
  `not_pay_amo` decimal(16,4) default NULL,
  `alr_inv_amo` decimal(16,4) default NULL,
  `not_inv_amo` decimal(16,4) default NULL,
  `collection_status` enum('nonePay','portionPay','allPay') default NULL,
  `invoice_status` enum('noneInv','portionInv','allInv') default NULL,
  `accessory` varchar(255) default NULL,
  `audit_state` enum('authstr','pass','failure') default NULL,
  `auditor` varchar(32) default NULL,
  `audit_date` datetime default NULL,
  `audit_remark` varchar(255) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `operators` varchar(32) default NULL,
  `operator_dep` varchar(32) default NULL,
  `supplier_id` varchar(32) default NULL,
  `linkman` varchar(32) default NULL,
  `telephone` varchar(32) default NULL,
  `bank_of_deposit` varchar(32) default NULL,
  `account_number` int(19) default NULL,
  `summary` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`payable_id`),
  KEY `FK_T_FINANC_PAYABLE_T_T_PAR_PA2` (`payable_type_id`),
  CONSTRAINT `t_finance_payable_ibfk_1` FOREIGN KEY (`payable_type_id`) REFERENCES `t_par_finance_payable_type` (`payable_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_finance_payable
-- ----------------------------

-- ----------------------------
-- Table structure for `t_finance_payable_detail`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_payable_detail`;
CREATE TABLE `t_finance_payable_detail` (
  `payable_detail_id` varchar(32) NOT NULL,
  `payable_id` varchar(32) default NULL,
  `good_id` varchar(32) default NULL,
  `goods_code` varchar(50) default NULL,
  `goods_name` varchar(50) default NULL,
  `goods_model` varchar(32) default NULL,
  `goods_unit` varchar(32) default NULL,
  `quantity` int(4) default NULL,
  `price` decimal(16,4) default NULL,
  `money` decimal(16,4) default NULL,
  `cess` decimal(16,4) default NULL,
  `open_invoices_number` int(4) default NULL,
  `open_invoices_money` decimal(16,4) default NULL,
  `not_open_number` int(4) default NULL,
  `not_open_money` decimal(16,4) default NULL,
  `remark` varchar(255) default NULL,
  PRIMARY KEY  (`payable_detail_id`),
  KEY `FK_T_FINANC_FINANCE_P_T_FINANC3` (`payable_id`),
  CONSTRAINT `t_finance_payable_detail_ibfk_1` FOREIGN KEY (`payable_id`) REFERENCES `t_finance_payable` (`payable_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_finance_payable_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `t_finance_payment`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_payment`;
CREATE TABLE `t_finance_payment` (
  `finance_pay_id` varchar(32) NOT NULL,
  `payment_code` varchar(50) default NULL,
  `payment_date` datetime default NULL,
  `supplier_id` varchar(32) default NULL,
  `linkman` varchar(32) default NULL,
  `phone` varchar(32) default NULL,
  `payment_type_id` varchar(32) default NULL,
  `account` varchar(32) default NULL,
  `advance_amount` decimal(16,4) default NULL,
  `set_amount` decimal(16,4) default NULL,
  `payment_amount` decimal(16,4) default NULL,
  `credit_amount` decimal(16,4) default NULL,
  `backwash_state` enum('backwash0','backwash1') default NULL,
  `not_back_amo` decimal(16,4) default NULL,
  `alr_back_amo` decimal(16,4) default NULL,
  `audit_state` enum('authstr','pass','failure') default NULL,
  `auditor` varchar(32) default NULL,
  `audit_date` datetime default NULL,
  `audit_remark` varchar(255) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `operators` varchar(32) default NULL,
  `operator_dep` varchar(32) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`finance_pay_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_finance_payment
-- ----------------------------

-- ----------------------------
-- Table structure for `t_finance_payment_detail`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_payment_detail`;
CREATE TABLE `t_finance_payment_detail` (
  `fin_pay_det_id` varchar(32) NOT NULL,
  `finance_pay_id` varchar(32) default NULL,
  `payable_id` varchar(32) default NULL,
  `set_amount` decimal(16,4) default NULL,
  `due_date` datetime default NULL,
  `credit_period` datetime default NULL,
  `pur_req_id` varchar(32) default NULL,
  `pur_arrival_id` varchar(32) default NULL,
  `pur_return_id` varchar(32) default NULL,
  `amount_payable` decimal(16,4) default NULL,
  `summary` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  PRIMARY KEY  (`fin_pay_det_id`),
  KEY `FK_T_FINANC_FINANCE_P_T_FINANC4` (`finance_pay_id`),
  CONSTRAINT `t_finance_payment_detail_ibfk_1` FOREIGN KEY (`finance_pay_id`) REFERENCES `t_finance_payment` (`finance_pay_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_finance_payment_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `t_finance_receipt`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_receipt`;
CREATE TABLE `t_finance_receipt` (
  `receipt_id` varchar(32) NOT NULL,
  `receipt_code` varchar(50) default NULL,
  `receipt_date` datetime default NULL,
  `client_id` varchar(32) default NULL,
  `client_contact_id` varchar(32) default NULL,
  `phone` varchar(11) default NULL,
  `receipt_type_id` varchar(32) default NULL,
  `account` varchar(32) default NULL,
  `set_amount` decimal(16,4) default NULL,
  `paid_in_amount` decimal(16,4) default NULL,
  `credit_amount` decimal(16,4) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `remark` varchar(255) default NULL,
  `audit_state` enum('authstr','pass','failure') default NULL,
  `auditor` varchar(32) default NULL,
  `audit_date` datetime default NULL,
  `audit_remark` varchar(100) default NULL,
  `handle_department` varchar(32) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`receipt_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_finance_receipt
-- ----------------------------

-- ----------------------------
-- Table structure for `t_finance_receipt_detail`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_receipt_detail`;
CREATE TABLE `t_finance_receipt_detail` (
  `receipt_detail_id` varchar(32) NOT NULL,
  `receipt_id` varchar(32) default NULL,
  `receivables_id` varchar(32) default NULL,
  `set_amount` decimal(16,4) default NULL,
  `receivable_date` datetime default NULL,
  `deadline_date` datetime default NULL,
  `summary` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  PRIMARY KEY  (`receipt_detail_id`),
  KEY `FK_T_FINANC_T_FINANCE_T_FINANC2` (`receipt_id`),
  CONSTRAINT `t_finance_receipt_detail_ibfk_1` FOREIGN KEY (`receipt_id`) REFERENCES `t_finance_receipt` (`receipt_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_finance_receipt_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `t_finance_receivables`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_receivables`;
CREATE TABLE `t_finance_receivables` (
  `receivables_id` varchar(32) NOT NULL,
  `receivables_code` varchar(50) default NULL,
  `send_id` varchar(32) default NULL,
  `order_goods_code` varchar(50) default NULL,
  `delivery_goods_code` varchar(50) default NULL,
  `receivables_date` datetime default NULL,
  `receivables_type_id` varchar(32) default NULL,
  `client_id` varchar(32) default NULL,
  `client_contact_id` varchar(32) default NULL,
  `phone` varchar(15) default NULL,
  `invoice_account` varchar(32) default NULL,
  `invoice_number` varchar(20) default NULL,
  `invoice` enum('yes','no') default NULL,
  `invoice_type` enum('specialvat','generalvat','generaltax','ordinarytax','receipt') default NULL,
  `invoice_start` varchar(50) default NULL,
  `payment_type_id` varchar(32) default NULL,
  `payment_deadlines` datetime default NULL,
  `amount_receivable` decimal(16,4) default NULL,
  `amount_paid` decimal(16,4) default NULL,
  `amount_reduce` decimal(16,4) default NULL,
  `has_receivables` decimal(16,4) default NULL,
  `outstanding_amount` decimal(16,4) default NULL,
  `has_invoice_amount` decimal(16,4) default NULL,
  `not_invoice_amount` decimal(16,4) default NULL,
  `receipt_state` enum('noneReceipt','portionReceipt','allReceipt') default NULL,
  `inv_state` enum('noneInv','portionInv','allInv') default NULL,
  `accessory` varchar(255) default NULL,
  `staff_id` varchar(32) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `audit_state` enum('authstr','pass','failure') default NULL,
  `auditor` varchar(32) default NULL,
  `audit_date` datetime default NULL,
  `audit_remark` varchar(100) default NULL,
  `summary` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`receivables_id`),
  KEY `FK_T_FINANC_T_SELL_SE_T_SELL_S2` (`send_id`),
  CONSTRAINT `t_finance_receivables_ibfk_1` FOREIGN KEY (`send_id`) REFERENCES `t_sell_send` (`send_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_finance_receivables
-- ----------------------------

-- ----------------------------
-- Table structure for `t_finance_receivables_detail`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_receivables_detail`;
CREATE TABLE `t_finance_receivables_detail` (
  `receivables_detail_id` varchar(32) NOT NULL,
  `receivables_id` varchar(32) default NULL,
  `goods_id` varchar(32) default NULL,
  `quantity` int(4) default NULL,
  `price` decimal(16,4) default NULL,
  `goods_cess` decimal(16,4) default NULL,
  `money` decimal(16,4) default NULL,
  `not_receipt_num` int(4) default NULL,
  `alr_receipt_num` int(4) default NULL,
  `not_inv_num` int(4) default NULL,
  `alr_inv_num` int(4) default NULL,
  `remark` varchar(255) default NULL,
  PRIMARY KEY  (`receivables_detail_id`),
  KEY `FK_T_FINANC_T_FINANCE_T_FINANC3` (`receivables_id`),
  CONSTRAINT `t_finance_receivables_detail_ibfk_1` FOREIGN KEY (`receivables_id`) REFERENCES `t_finance_receivables` (`receivables_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_finance_receivables_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `t_goods_list`
-- ----------------------------
DROP TABLE IF EXISTS `t_goods_list`;
CREATE TABLE `t_goods_list` (
  `goods_id` varchar(32) NOT NULL,
  `goods_code` varchar(32) default NULL,
  `goods_name` varchar(255) default NULL,
  `goods_type_id` varchar(32) default NULL,
  `goods_sort_id` varchar(32) default NULL,
  `warehouse_type_id` varchar(32) default NULL,
  `original_code` varchar(32) default NULL,
  `specification` varchar(255) default NULL,
  `unit` varchar(32) default NULL,
  `bulk_unit` varchar(32) default NULL,
  `package_con_rates` decimal(16,4) default NULL,
  `pricing` varchar(32) default NULL,
  `tax_rate` decimal(16,4) default NULL,
  `batch_management` enum('yes','no') default NULL,
  `valid_management` enum('yes','no') default NULL,
  `reference_cost` decimal(16,4) default NULL,
  `reference_sales_price` decimal(16,4) default NULL,
  `reference_retail_price` decimal(16,4) default NULL,
  `sales_price1` decimal(16,4) default NULL,
  `sales_price2` decimal(16,4) default NULL,
  `sales_price3` decimal(16,4) default NULL,
  `sales_price4` decimal(16,4) default NULL,
  `sales_price5` decimal(16,4) default NULL,
  `sales_price6` decimal(16,4) default NULL,
  `sales_price7` decimal(16,4) default NULL,
  `sales_price8` decimal(16,4) default NULL,
  `sales_price9` decimal(16,4) default NULL,
  `sales_price10` decimal(16,4) default NULL,
  `image` varchar(255) default NULL,
  `origin` varchar(255) default NULL,
  `manufacturers` varchar(255) default NULL,
  `brands` varchar(255) default NULL,
  `warranty_start` datetime default NULL,
  `warranty_end` datetime default NULL,
  `attn` varchar(255) default NULL,
  `department` varchar(255) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `auditor` varchar(32) default NULL,
  `audit_time` datetime default NULL,
  `audit_state` enum('authstr','failure','pass') default NULL,
  `audit_remark` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`goods_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_goods_list
-- ----------------------------
INSERT INTO `t_goods_list` VALUES ('1', 'GD_001', '仙贝', '食物类', '食物，零食', '食物库', 'GD_001', 'GD_SP_001', '张三', '包', '0.0010', '比列计算', '0.0100', 'yes', 'yes', '5.0000', '10.0000', '12.0000', '5.0000', '6.0000', '7.0000', '8.0000', '9.0000', '10.0000', '11.0000', '12.0000', '13.0000', '14.0000', 'image', '珠海', '旺旺', '旺旺小馒头', '2015-01-09 16:50:45', '2015-01-10 16:50:49', '张三', '销售部', 'enable', '超级管理员', '2015-01-09 16:51:41', 'pass', '超级管理员', '通过', '超级管理员', '2015-01-09 16:53:38', '超级管理员', '2015-01-09 16:53:47');

-- ----------------------------
-- Table structure for `t_inventory_type`
-- ----------------------------
DROP TABLE IF EXISTS `t_inventory_type`;
CREATE TABLE `t_inventory_type` (
  `in_inventory_id` varchar(32) NOT NULL COMMENT '�������ID',
  `order_num` int(4) default NULL,
  `inventory_type_name` varchar(255) default NULL COMMENT '��ƷID',
  `enabled` enum('disable','enable') default NULL COMMENT '�Ƿ����� ö�٣�(����1/����0)',
  `creater` varchar(32) default NULL COMMENT 'ö�٣�(����1/����0)',
  `create_time` datetime default NULL COMMENT '¼��ʱ��',
  `updater` varchar(32) default NULL COMMENT '����޸���',
  `update_time` datetime default NULL COMMENT '����޸�ʱ��',
  PRIMARY KEY  (`in_inventory_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_inventory_type
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
INSERT INTO `t_loginlog` VALUES ('19a5ed8c986320a053c2e4e807d410ad', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-01-12 17:32:58', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('3427b48a74724c323e87a834d83f7fb5', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-01-12 15:53:31', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('484d018c21313d43dd3d9cfe7b38f18b', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-01-12 16:25:35', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('4b24a6e2d13682dccace623e74b4d793', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-01-13 10:45:49', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('55ad8cd5307861347fad4581116ad88c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-01-13 08:59:28', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('72db057a5cb4492d5b82bd3234d4e985', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-01-12 15:34:21', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('75e93fbe0b97246eb1dfb835a3d9927c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-01-12 13:49:57', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('77679c229172438f59d3af32f90bffd6', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-01-12 17:50:08', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('7e91d2039815d40516438dfc2f124591', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-01-12 15:48:47', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('834365097de548ac0ca500e73fc51367', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-01-13 08:31:57', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('9aa5e4f60179a9c3bc6af5428ef01e04', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-01-12 16:14:49', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('a6902775f93c130339906228b26a19dc', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-01-12 16:02:45', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('b27a3521e51ed78e1e9aa6fed6bd3c47', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-01-12 17:10:40', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('b3cdbd3ec5286bef320c4d994712ba89', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-01-12 15:45:18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('b7bfbd012824599be731f43afef9e8fb', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-01-13 09:28:20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('d5a24ae46513f3abd669399766dfbd19', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-01-13 10:56:34', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('e08c59a4b71ba913c14ba1ece714bb67', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-01-12 15:40:50', '127.0.0.1[本地]', null, null);

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
INSERT INTO `t_menu` VALUES ('00451bcfd707a2b5c3b80704f992dc21', '07d7e1fd5f95ab20e7cb3090cd8ac7ba', 'purchaseReturnedType', '退货方式', 'icon-standard-car', '/do/purchaseReturnedType/index.htm', '2', '');
INSERT INTO `t_menu` VALUES ('07d7e1fd5f95ab20e7cb3090cd8ac7ba', '42294ceb4cbc4d64cff0cb5eaafb2d2e', 'purchaseManage', '采购管理', 'icon-cologne-process', '', '2', '');
INSERT INTO `t_menu` VALUES ('0d5f941c0e815519b859afa0992eda0b', '16ac1df11de350c61722dc7b98cecca7', 'dep', '部门管理', 'icon-standard-folder-user', '/do/dep/index.htm', '2', '');
INSERT INTO `t_menu` VALUES ('0eac3f9c7b4e4cdd5e42c56a16c85147', 'fd696e8607c36c917f546787976f4fa8', 'comDeliveryType', '交货方式', 'icon-standard-application-tile-horizontal', '/do/comDeliveryType/index.htm', '3', '');
INSERT INTO `t_menu` VALUES ('14sdf54157cf483a790f4eea35dsf6f6', null, 'basicdatas', '参数管理', 'icon-standard-application-xp-terminal', '', '2', '');
INSERT INTO `t_menu` VALUES ('16635dfa4b5e1dda4fd5d804f430eeec', 'd46b0600ead708c4f5827b7082f2490a', 'clientSource', '客户来源', 'icon-standard-group', '/do/clientSource/index.htm', '3', '');
INSERT INTO `t_menu` VALUES ('16669401121c47c062cac4d11a21522e', '66874136f65e1eb718d4299784f7c7d3', 'warOutType', '出库业务类型', 'icon-standard-brick', '/do/warOutType/index.htm', '2', '');
INSERT INTO `t_menu` VALUES ('16ac1df11de350c61722dc7b98cecca7', null, 'system', '系统设置', 'icon-standard-cog', '', '1', '');
INSERT INTO `t_menu` VALUES ('1b41e29c8712c9f36bc3a520a8e5363b', '3c56b44e8b5257490094b048877422b3', 'financeCostType', '费用类型', 'icon-standard-coins', '/do/financeCostType/index.htm', '3', '');
INSERT INTO `t_menu` VALUES ('2261cc3a4a23b23bd6317021981fbd1e', '2afb5ed7e423adf169914f7031af78db', 'suppliersType', '供应商类型', 'icon-standard-user', '/do/suppliersType/index.htm', '1', '');
INSERT INTO `t_menu` VALUES ('23e47757685c7b53d87b114e0add3966', '42294ceb4cbc4d64cff0cb5eaafb2d2e', 'sellManage', '销售管理', 'icon-cologne-future-projects', '', '3', '');
INSERT INTO `t_menu` VALUES ('295ffaf17338b3621d532bfe8ee6c779', 'fd696e8607c36c917f546787976f4fa8', 'comNature', '公司性质', 'icon-cologne-bank', '/do/comNature/index.htm', '5', '');
INSERT INTO `t_menu` VALUES ('2afb5ed7e423adf169914f7031af78db', '42294ceb4cbc4d64cff0cb5eaafb2d2e', 'suppliersManage', '供应商管理', 'icon-standard-user', '', '6', '');
INSERT INTO `t_menu` VALUES ('3c56b44e8b5257490094b048877422b3', '42294ceb4cbc4d64cff0cb5eaafb2d2e', 'financeManage', '财务管理', 'icon-standard-coins', '', '5', '');
INSERT INTO `t_menu` VALUES ('42294ceb4cbc4d64cff0cb5eaafb2d2e', '14sdf54157cf483a790f4eea35dsf6f6', 'dropDown ', '下拉项维护', 'icon-standard-add', '', '1', '');
INSERT INTO `t_menu` VALUES ('4f2b136adfaf68b741d58df8e4adc4ff', '3c56b44e8b5257490094b048877422b3', 'financePayableType', '应付类型', 'icon-standard-coins', '/do/financePayableType/index.htm', '1', '');
INSERT INTO `t_menu` VALUES ('54eb754157cf483a790f4eea35200118', '16ac1df11de350c61722dc7b98cecca7', 'res', '资源管理', 'icon-cologne-featured', '/do/res/index.htm', '4', '');
INSERT INTO `t_menu` VALUES ('66761e0ea9850fd6cdfc59f282de2ebb', 'd46b0600ead708c4f5827b7082f2490a', 'clientType', '客户类型', 'icon-standard-group', '/do/clientType/index.htm', '1', '');
INSERT INTO `t_menu` VALUES ('66874136f65e1eb718d4299784f7c7d3', '42294ceb4cbc4d64cff0cb5eaafb2d2e', 'warehouseManage', '库存管理', 'icon-standard-brick', '', '4', '');
INSERT INTO `t_menu` VALUES ('79d4fbfb8f73e4e21ee67e1d6ad9ff5e', '14sdf54157cf483a790f4eea35dsf6f6', 'client', '客户档案', 'icon-standard-book-open', '/do/client/index.htm', '2', '');
INSERT INTO `t_menu` VALUES ('801ecf764a95da45ccbd194800c0eeeb', '14sdf54157cf483a790f4eea35dsf6f6', 'warehouse', '仓库管理', 'icon-standard-brick', '/do/warehouse/index.htm', '5', '');
INSERT INTO `t_menu` VALUES ('810ba3686840457556cb55bc87d8010b', '23e47757685c7b53d87b114e0add3966', 'sellType', '销售类型', 'icon-standard-page-gear', '/do/sellType/index.htm', '1', '');
INSERT INTO `t_menu` VALUES ('82533b28131409450ad7a00229fd7333', 'fd696e8607c36c917f546787976f4fa8', 'comContactType', '联系人类型', 'icon-standard-vcard', '/do/comContactType/index.htm', '7', '');
INSERT INTO `t_menu` VALUES ('8a2f2500fa46e49dd7ff11b688b6c740', 'fd696e8607c36c917f546787976f4fa8', 'comCompanySize', '公司规模', 'icon-hamburg-customers', '/do/comCompanySize/index.htm', '2', '');
INSERT INTO `t_menu` VALUES ('8c54260cf2f6704a1739503465d9e9cf', '3c56b44e8b5257490094b048877422b3', 'financeReceivableType', '应收类型', 'icon-standard-coins', '/do/financeReceivableType/index.htm', '2', '');
INSERT INTO `t_menu` VALUES ('8fc3b6de8076d1e8c3a6514bd29c4c4b', 'fd696e8607c36c917f546787976f4fa8', 'comPaymentType', '支付方式', 'icon-standard-arrow-switch', '/do/comPaymentType/index.htm', '4', '');
INSERT INTO `t_menu` VALUES ('90998bf3c3173da5e8319d70cec8a7ab', '23e47757685c7b53d87b114e0add3966', 'sellReturnReason', '销售退货原因', 'icon-cologne-publish', '/do/sellReturnReason/index.htm', '3', '');
INSERT INTO `t_menu` VALUES ('91ca1b4b197688f21b68a72f69e09a8d', '16ac1df11de350c61722dc7b98cecca7', 'user', '管理员设置', 'icon-hamburg-hire-me', '/do/user/index.htm', '1', '');
INSERT INTO `t_menu` VALUES ('93f0fcfa7cdff069d929723062b53211', '14sdf54157cf483a790f4eea35dsf6f6', 'variables', '系统变量', 'icon-standard-layout-content', '/do/variables/index.htm', '12', '');
INSERT INTO `t_menu` VALUES ('a35ca1bb25e1f11898c78eb03332554b', '66874136f65e1eb718d4299784f7c7d3', 'warOccupationType', '锁定类型', 'icon-standard-brick', '/do/warOccupationType/index.htm', '4', '');
INSERT INTO `t_menu` VALUES ('a4d88b8b3c70b93d69d0bf24ffb09377', '14sdf54157cf483a790f4eea35dsf6f6', 'suppliers', '供应商档案', 'icon-cologne-customers', '/do/suppliers/index.htm', '3', '');
INSERT INTO `t_menu` VALUES ('aa165bf67dadbeedeb780b3e92dcdcdb', '23e47757685c7b53d87b114e0add3966', 'sellReturnType', '销售退货方式', 'icon-standard-script', '/do/sellReturnType/index.htm', '2', '');
INSERT INTO `t_menu` VALUES ('ac892df07f9087fb1c89ac968bb5f555', '16ac1df11de350c61722dc7b98cecca7', 'operalog', '操作日志', 'icon-standard-report-key', '/do/operalog/index.htm', '5', '');
INSERT INTO `t_menu` VALUES ('bc38d000dee30299a20f254c0aec0aaf', '2afb5ed7e423adf169914f7031af78db', 'suppliersSource', '供应商来源', 'icon-standard-user', '/do/suppliersSource/index.htm', '3', '');
INSERT INTO `t_menu` VALUES ('bfe6aa265cb92e35e9920f98a61df508', '14sdf54157cf483a790f4eea35dsf6f6', 'goodsList', '货品档案信息', 'icon-standard-server-database', '/do/goodsList/index.htm', '4', '');
INSERT INTO `t_menu` VALUES ('c81a4c0156789361600940be2ebdab2c', 'd46b0600ead708c4f5827b7082f2490a', 'ClientLevel', '客户级别', 'icon-standard-group', '/do/clientLevel/index.htm', '2', '');
INSERT INTO `t_menu` VALUES ('c9845e00a5b709d5659d4011119daa67', '2afb5ed7e423adf169914f7031af78db', 'suppliersGrade', '供应商级别', 'icon-standard-user', '/do/suppliersGrade/index.htm', '2', '');
INSERT INTO `t_menu` VALUES ('ccec6c46d43b0e7c40ce5c1ffc0cb3e5', '07d7e1fd5f95ab20e7cb3090cd8ac7ba', 'purchaseReturnReason', '退货原因', 'icon-cologne-order', '/do/purchaseReturnReason/index.htm', '3', '');
INSERT INTO `t_menu` VALUES ('d29229a817d81ed224df8c53d2f48f3d', '07d7e1fd5f95ab20e7cb3090cd8ac7ba', 'purchaseQuotedPriceType', '报价类型', 'icon-cologne-invoice', '/do/purchaseQuotedPriceType/index.htm', '5', '');
INSERT INTO `t_menu` VALUES ('d46b0600ead708c4f5827b7082f2490a', '42294ceb4cbc4d64cff0cb5eaafb2d2e', 'clientManage', '客户管理', 'icon-standard-group', '', '7', '');
INSERT INTO `t_menu` VALUES ('dc2dcb1b303c05b27e9c01dc23dcc5f7', '07d7e1fd5f95ab20e7cb3090cd8ac7ba', 'purchaseType', '采购类型', 'icon-hamburg-sitemap', '/do/purchaseType/index.htm', '1', '');
INSERT INTO `t_menu` VALUES ('e42b98561176563f930d82c80b041ed8', '16ac1df11de350c61722dc7b98cecca7', 'loginlog', '登录日志', 'icon-standard-report-edit', '/do/loginlog/index.htm', '6', '');
INSERT INTO `t_menu` VALUES ('e550884c5e6c1e94ee70cc833aa1c2b9', '16ac1df11de350c61722dc7b98cecca7', 'role', '角色管理', 'icon-hamburg-customers', '/do/role/index.htm', '3', '');
INSERT INTO `t_menu` VALUES ('e8a2f672e16b2dcaf720a8b0586e99fd', '66874136f65e1eb718d4299784f7c7d3', 'warInType', '入库业务类型', 'icon-standard-brick', '/do/warInType/index.htm', '1', '');
INSERT INTO `t_menu` VALUES ('ea92abb340a62dfd3ecc9b5e4d78c041', '66874136f65e1eb718d4299784f7c7d3', 'warDeployType', '调拨类型', 'icon-standard-brick', '/do/warDeployType/index.htm', '3', '');
INSERT INTO `t_menu` VALUES ('ebd8d76ac65eea1c8d65ac5c14da27b0', 'fd696e8607c36c917f546787976f4fa8', 'comIndustry', '行业管理', 'icon-hamburg-config', '/do/comIndustry/index.htm', '1', '');
INSERT INTO `t_menu` VALUES ('fd696e8607c36c917f546787976f4fa8', '42294ceb4cbc4d64cff0cb5eaafb2d2e', 'publicDropDown', '公用下拉项', 'icon-standard-add', '', '1', '');
INSERT INTO `t_menu` VALUES ('sdsfeg4157cf483a790f4eea35ds5675', '14sdf54157cf483a790f4eea35dsf6f6', 'optgroup', '下拉项管理', 'icon-hamburg-sitemap', '/do/optgroup/index.htm', '11', '');

-- ----------------------------
-- Table structure for `t_occupation`
-- ----------------------------
DROP TABLE IF EXISTS `t_occupation`;
CREATE TABLE `t_occupation` (
  `occupation_id` varchar(32) NOT NULL COMMENT '���ID',
  `occupation_code` varchar(32) default NULL COMMENT '��ⵥ��',
  `warehouse_id` varchar(32) default NULL COMMENT '�ֿ�ID',
  `occupation_date` datetime default NULL COMMENT '�������',
  `total_money` decimal(16,4) default NULL,
  `line_people` varchar(32) default NULL,
  `occupation_type_id` varchar(32) default NULL COMMENT '�������ID',
  `attn` varchar(32) default NULL COMMENT '������',
  `department` varchar(32) default NULL COMMENT '���첿��',
  `enabled` enum('disable','enable') default NULL COMMENT 'ö�٣�(����1/����0)',
  `reviewer` varchar(32) default NULL COMMENT '�����',
  `approval_date` datetime default NULL COMMENT '�������',
  `audit_state` enum('authstr','failure','pass') default NULL COMMENT '���״̬',
  `audit_remark` varchar(255) default NULL,
  `remark` varchar(225) default NULL COMMENT '��ע',
  `creater` varchar(32) default NULL COMMENT '������',
  `create_time` datetime default NULL COMMENT '¼��ʱ��',
  `updater` varchar(32) default NULL COMMENT '����޸���',
  `update_time` datetime default NULL COMMENT '����޸�ʱ��',
  PRIMARY KEY  (`occupation_id`),
  KEY `FK_OccupationType_Occupation_OccupationTypeId` (`occupation_type_id`),
  CONSTRAINT `t_occupation_ibfk_1` FOREIGN KEY (`occupation_type_id`) REFERENCES `t_par_war_occupation_type` (`occupation_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_occupation
-- ----------------------------

-- ----------------------------
-- Table structure for `t_occupation_detail`
-- ----------------------------
DROP TABLE IF EXISTS `t_occupation_detail`;
CREATE TABLE `t_occupation_detail` (
  `occupation_detail_id` varchar(32) NOT NULL,
  `goods_id` varchar(32) default NULL,
  `goods_code` varchar(225) default NULL,
  `goods_name` varchar(255) default NULL,
  `goods_batch` varchar(255) default NULL,
  `goods_style` varchar(255) default NULL,
  `goods_unit` varchar(32) default NULL,
  `occupation_id` varchar(32) default NULL,
  `occupy_number` int(4) default NULL,
  `out_number` int(4) default NULL,
  `solve_number` int(4) default NULL,
  `remark` varchar(225) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`occupation_detail_id`),
  KEY `FK_Occupation_OccupationDetail_OccupationId` (`occupation_id`),
  CONSTRAINT `t_occupation_detail_ibfk_1` FOREIGN KEY (`occupation_id`) REFERENCES `t_occupation` (`occupation_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_occupation_detail
-- ----------------------------

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
INSERT INTO `t_operalog` VALUES ('058d40734089f38c2c0d08edac5daf42', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 10:07:24');
INSERT INTO `t_operalog` VALUES ('06758bef942f4b9a29afff2808087a6f', '资源管理', '面板列表', '修改', '1', '[交货方式列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2015-01-12 16:19:02');
INSERT INTO `t_operalog` VALUES ('06f85e4021ca4b1df963dcf584d25509', '资源管理', '操作列表', '删除', '1', '成功删除了[ 增加,修改,删除 ]操作!', 'com.glacier.frame.service.system.ActionService', 'delActions', 'ActionList_del', '超级管理员', '2015-01-12 13:54:33');
INSERT INTO `t_operalog` VALUES ('07b36584864f77a145562987c7b13abd', '资源管理', '菜单树', '修改', '1', '[联系人类型] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-01-12 16:21:39');
INSERT INTO `t_operalog` VALUES ('0880e2c8c95ae6d3b7119d79d35f8e31', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 16:58:36');
INSERT INTO `t_operalog` VALUES ('08d9aceb72e455ce65528076c1c368ed', '资源管理', '面板列表', '增加', '1', '[供应商类型列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2015-01-13 10:28:15');
INSERT INTO `t_operalog` VALUES ('093e5c7159fb6bcd5485a27110d92b4a', '资源管理', '菜单树', '增加', '0', '英文名称重复', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-01-12 17:39:06');
INSERT INTO `t_operalog` VALUES ('09c2c95df9977b81f96ba4fd69936fa7', '资源管理', '面板列表', '增加', '1', '[客户级别列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2015-01-13 10:51:52');
INSERT INTO `t_operalog` VALUES ('0a7ba38445950eae9bfa84058c51de17', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 10:30:03');
INSERT INTO `t_operalog` VALUES ('0b01b135d9d4c0560a17e657d9911d2d', '资源管理', '菜单树', '增加', '1', '[出库业务类型] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-01-13 10:03:16');
INSERT INTO `t_operalog` VALUES ('0b44b662e124e4f5b6e1ee6dae77004e', '资源管理', '面板列表', '增加', '1', '[入库业务类型列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2015-01-13 09:50:39');
INSERT INTO `t_operalog` VALUES ('0c04f17c85d7bd4e34e9d5442c695bb8', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 10:33:29');
INSERT INTO `t_operalog` VALUES ('0c920220d1002d3324080ab9cab23cb6', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 10:28:53');
INSERT INTO `t_operalog` VALUES ('0cb8fec7c914192d925bf427bea9bd08', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 10:11:08');
INSERT INTO `t_operalog` VALUES ('0dad25f270286c425602de2acdce05e0', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 10:50:46');
INSERT INTO `t_operalog` VALUES ('0e0dcaf8e6b35c347852705cb2f82c6c', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-13 09:42:53');
INSERT INTO `t_operalog` VALUES ('0e59f286af25565ca1ae3bec1472726c', '资源管理', '菜单树', '修改', '1', '[下拉项管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-01-13 09:31:19');
INSERT INTO `t_operalog` VALUES ('0e5bb22ada48fc736aa542b85a271155', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 16:54:32');
INSERT INTO `t_operalog` VALUES ('19935a456da2d5430d1b0392480bf7ec', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-13 09:57:04');
INSERT INTO `t_operalog` VALUES ('1a45480d0cf9f446777a4f6a24605007', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 16:50:28');
INSERT INTO `t_operalog` VALUES ('1ada905452de78710d2de262d2a061a2', '资源管理', '菜单树', '增加', '1', '[供应商档案] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-01-12 17:40:49');
INSERT INTO `t_operalog` VALUES ('1b3225ecaf7fb70e0a334882b0a5af42', '资源管理', '菜单树', '增加', '1', '[供应商类型] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-01-13 10:27:59');
INSERT INTO `t_operalog` VALUES ('1bd74dd1252588e3ab7df42e186ed12b', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-12 17:46:25');
INSERT INTO `t_operalog` VALUES ('1d08f81df92d453cac294855942da170', '资源管理', '面板列表', '删除', '1', '成功删除名称为：[ 计划类型列表 ]面板', 'com.glacier.frame.service.system.PanelService', 'delPanel', 'PanelList_del', '超级管理员', '2015-01-12 13:54:36');
INSERT INTO `t_operalog` VALUES ('1d5132df68c694608245e617cc8589cd', '资源管理', '菜单树', '修改', '1', '[报价类型] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-01-12 16:33:28');
INSERT INTO `t_operalog` VALUES ('1d8c1293db5d49aa9a0b8e0457199e23', '资源管理', '操作列表', '编辑', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 16:50:03');
INSERT INTO `t_operalog` VALUES ('1e2a378ef0448f17f6a9dcf8880cd142', '资源管理', '面板列表', '增加', '1', '[调拨类型列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2015-01-13 10:06:47');
INSERT INTO `t_operalog` VALUES ('1ebc5b92c978961e98720ea5906dc648', '资源管理', '操作列表', '编辑', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 15:50:07');
INSERT INTO `t_operalog` VALUES ('1ed8da3514d33d056ec91122b4baae47', '资源管理', '面板列表', '增加', '1', '[应收类型列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2015-01-13 10:20:26');
INSERT INTO `t_operalog` VALUES ('1f1e4a5e26bf8b55c47b4b68f084c92f', '资源管理', '操作列表', '编辑', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 17:07:23');
INSERT INTO `t_operalog` VALUES ('218414d002bd1607cdef4f5187f17190', '资源管理', '面板列表', '修改', '1', '[行业管理列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2015-01-12 15:46:20');
INSERT INTO `t_operalog` VALUES ('22773a93c1bfb523b9874247cb394d2d', '资源管理', '面板列表', '增加', '1', '[应付类型列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2015-01-13 10:17:07');
INSERT INTO `t_operalog` VALUES ('229f5b6729c3c4debd6d5b4f8d705c45', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2015-01-12 16:26:17');
INSERT INTO `t_operalog` VALUES ('2366de1b86270ed4bd48ea1213004a0a', '资源管理', '面板列表', '增加', '1', '[客户来源列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2015-01-13 10:54:05');
INSERT INTO `t_operalog` VALUES ('243becc740ff4d831dbc14e57e49fe34', '资源管理', '操作列表', '编辑', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 17:05:14');
INSERT INTO `t_operalog` VALUES ('249827d2b96ed442d52e4eb6b1bf520f', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 16:43:15');
INSERT INTO `t_operalog` VALUES ('24c3876344fe12570d3d5ea9e1c5a6ec', '资源管理', '面板列表', '修改', '1', '[退货原因列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2015-01-12 17:04:41');
INSERT INTO `t_operalog` VALUES ('24f55a971c72127130ba14aefe755f7b', '资源管理', '操作列表', '编辑', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 17:03:28');
INSERT INTO `t_operalog` VALUES ('25a4f8713a3a23ccb9de94924b81ce13', '资源管理', '面板列表', '增加', '1', '[供应商档案列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2015-01-12 17:42:50');
INSERT INTO `t_operalog` VALUES ('26086fe9ab0c82640d93a3bd1a6df797', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 10:18:57');
INSERT INTO `t_operalog` VALUES ('28dfd144072ef9fd89c7b6b6ace5e4ce', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-13 10:05:31');
INSERT INTO `t_operalog` VALUES ('29cda9d61235b7586a976960edc962c4', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 10:54:55');
INSERT INTO `t_operalog` VALUES ('2ab0c6031b30d0684fee6ab92cc124be', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 16:57:37');
INSERT INTO `t_operalog` VALUES ('2c6b3c1ecc2eab02d67d1f374d81c197', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 10:11:41');
INSERT INTO `t_operalog` VALUES ('2d2bffaf321e2742aed76584a83a8039', '资源管理', '操作列表', '编辑', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 16:55:29');
INSERT INTO `t_operalog` VALUES ('2f034a69a9facaec6e6441b370b23f23', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 16:43:01');
INSERT INTO `t_operalog` VALUES ('2f5cffd7f7f372bdd06183676fa08066', '资源管理', '菜单树', '修改', '1', '[供应商管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-01-12 17:38:18');
INSERT INTO `t_operalog` VALUES ('31522f01d95fd34d55dc7cd3cdf0e197', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 17:01:46');
INSERT INTO `t_operalog` VALUES ('369ce966699f0f85ffe53752ff31afd4', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 10:29:44');
INSERT INTO `t_operalog` VALUES ('37eaf7ac43726dde90df0e075fcb32c4', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2015-01-12 16:04:51');
INSERT INTO `t_operalog` VALUES ('3857b2ac89828f789357acdf8e8b9fb8', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 10:35:16');
INSERT INTO `t_operalog` VALUES ('38db0859b8d543bd692b95fc3f48af4c', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2015-01-12 17:47:42');
INSERT INTO `t_operalog` VALUES ('397435f2cb1cf6c47001fb77df313482', '资源管理', '菜单树', '修改', '1', '[下拉项维护] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-01-13 09:28:56');
INSERT INTO `t_operalog` VALUES ('3cd3a9d5c42e0ddd4e248ef23864af77', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 10:35:42');
INSERT INTO `t_operalog` VALUES ('3f3ecdf158d6164fe3a7c4545d6787a2', '资源管理', '操作列表', '删除', '1', '成功删除了[ 添加,修改,删除 ]操作!', 'com.glacier.frame.service.system.ActionService', 'delActions', 'ActionList_del', '超级管理员', '2015-01-12 16:59:40');
INSERT INTO `t_operalog` VALUES ('40ab420581c4707ef250072bb6ba9caf', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 10:12:00');
INSERT INTO `t_operalog` VALUES ('421cd8c963c5c32b7ce61ed1208136e6', '资源管理', '面板列表', '修改', '1', '[交货方式列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2015-01-12 16:19:24');
INSERT INTO `t_operalog` VALUES ('424603f8542e877f7fa1c39143efedb4', '资源管理', '面板列表', '修改', '1', '[退货方式列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2015-01-12 17:02:25');
INSERT INTO `t_operalog` VALUES ('435af340b076c4b15cc14ae2cfacb274', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2015-01-12 16:25:47');
INSERT INTO `t_operalog` VALUES ('44e91bf78fd268358df41c115bd321df', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 10:21:34');
INSERT INTO `t_operalog` VALUES ('45bb71d17b3b78df8c4d3b4d2de0f470', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 16:57:46');
INSERT INTO `t_operalog` VALUES ('4c7d6e63e311e6ee312a59c53ef32b26', '资源管理', '操作列表', '编辑', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 16:42:15');
INSERT INTO `t_operalog` VALUES ('4ce575f2403744e57deddfe9a6d6d240', '资源管理', '操作列表', '编辑', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 16:58:21');
INSERT INTO `t_operalog` VALUES ('4d763de213f34b54fa683efd66c72230', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 17:01:00');
INSERT INTO `t_operalog` VALUES ('4d822c17cc21509fdeb216b3124ab7d6', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2015-01-13 10:56:23');
INSERT INTO `t_operalog` VALUES ('4e0e501e3bcc4a3688d6c6e1971e8ab7', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 10:52:19');
INSERT INTO `t_operalog` VALUES ('4ea5cf2f3cd18c890e91d4d43319acd5', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-13 08:30:22');
INSERT INTO `t_operalog` VALUES ('4fa2d69829a7f43c8f760eaaf8146a63', '资源管理', '菜单树', '增加', '1', '[入库业务类型] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-01-13 09:50:17');
INSERT INTO `t_operalog` VALUES ('5043d5d3113c9b58188c9e07941d3a7e', '资源管理', '面板列表', '修改', '1', '[行业管理列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2015-01-12 16:47:15');
INSERT INTO `t_operalog` VALUES ('50c3b5cfaf215af28bdaeed88db3ff6e', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 10:50:28');
INSERT INTO `t_operalog` VALUES ('51f4c60a20650de31c50bf2ec7e07e9f', '资源管理', '菜单树', '增加', '1', '[供应商管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-01-12 17:37:26');
INSERT INTO `t_operalog` VALUES ('52f3b24b56fa903f85bbb7a97c4486fb', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-13 09:46:39');
INSERT INTO `t_operalog` VALUES ('533c590f51c523b9ca08ae3c8adb7c88', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2015-01-12 17:52:38');
INSERT INTO `t_operalog` VALUES ('538697fbdf5cd12cd56e63e3e368a7aa', '资源管理', '菜单树', '修改', '1', '[退货原因] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-01-12 16:34:19');
INSERT INTO `t_operalog` VALUES ('54a5a9a7a38c5150a812ecd398e7ceda', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 17:01:08');
INSERT INTO `t_operalog` VALUES ('576c2014e9301cd04e6b1478c760c0a0', '资源管理', '面板列表', '增加', '1', '[供应商来源列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2015-01-13 10:34:34');
INSERT INTO `t_operalog` VALUES ('5791d51682b17e2e748c14cc9335ea80', '资源管理', '菜单树', '修改', '1', '[交货方式] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-01-12 16:18:41');
INSERT INTO `t_operalog` VALUES ('59f939fedf4c95c268e7c07a46160731', '资源管理', '菜单树', '修改', '1', '[供应商档案] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-01-13 09:32:03');
INSERT INTO `t_operalog` VALUES ('5d68a431b1b6cd1d42d26a5b3c616f8f', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 15:50:29');
INSERT INTO `t_operalog` VALUES ('5e0a4088c4006eb4efb6b32e30f66add', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 09:53:26');
INSERT INTO `t_operalog` VALUES ('5fc4ddaf21cd1a3a9af104288a98c157', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 17:12:10');
INSERT INTO `t_operalog` VALUES ('5fe4540b8ad5f43305bad6155dcc6d24', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 17:12:18');
INSERT INTO `t_operalog` VALUES ('614104de7152a848f3d34b669a8b0f0a', '资源管理', '操作列表', '编辑', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-13 09:45:23');
INSERT INTO `t_operalog` VALUES ('61d8c858deade08d01c2c9a8f40f8346', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 17:07:31');
INSERT INTO `t_operalog` VALUES ('628901d1fadfe46c5f6e9b7829745c42', '资源管理', '菜单树', '修改', '1', '[退货方式] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-01-12 17:02:14');
INSERT INTO `t_operalog` VALUES ('66bf3955d09d953b950460981d920ff6', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 16:52:36');
INSERT INTO `t_operalog` VALUES ('676d503c50bf348684d17ee543d77441', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 10:22:17');
INSERT INTO `t_operalog` VALUES ('6a165e4cdf5a46252d174515934c6924', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 17:03:36');
INSERT INTO `t_operalog` VALUES ('6a2f3c065a9d9059d7c32457255168ba', '资源管理', '面板列表', '修改', '1', '[公司规模列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2015-01-12 16:20:03');
INSERT INTO `t_operalog` VALUES ('6b414848cdb25e031196ae8a7c43a0d8', '资源管理', '菜单树', '修改', '1', '[货品档案] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-01-13 09:29:23');
INSERT INTO `t_operalog` VALUES ('6bd161683cf7b2533770c27eb1ada9b7', '资源管理', '菜单树', '增加', '1', '[客户级别] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-01-13 10:51:39');
INSERT INTO `t_operalog` VALUES ('6cfdf428f41bd403c2b6db34aa294638', '资源管理', '面板列表', '删除', '1', '成功删除名称为：[ 信用等级列表 ]面板', 'com.glacier.frame.service.system.PanelService', 'delPanel', 'PanelList_del', '超级管理员', '2015-01-12 16:59:42');
INSERT INTO `t_operalog` VALUES ('6f9f40b35352c7534060f3fd758875a6', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2015-01-12 17:08:10');
INSERT INTO `t_operalog` VALUES ('75818d901416041071c0c8dbae46fd23', '资源管理', '菜单树', '修改', '1', '[销售退货原因] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-01-13 09:44:59');
INSERT INTO `t_operalog` VALUES ('7629df1ddc636f953e0eb83ccd8d70f8', '资源管理', '菜单树', '增加', '1', '[锁定类型] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-01-13 10:09:46');
INSERT INTO `t_operalog` VALUES ('78c100ddca34cd03abc60b40706f16e8', '资源管理', '菜单树', '增加', '1', '[客户管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-01-13 10:47:06');
INSERT INTO `t_operalog` VALUES ('79474381feab79efe553dc3e6bb89465', '资源管理', '操作列表', '编辑', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-13 09:46:22');
INSERT INTO `t_operalog` VALUES ('7c386fea88828feea8c898d8b58eddf6', '资源管理', '菜单树', '修改', '1', '[供应商管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-01-12 17:37:53');
INSERT INTO `t_operalog` VALUES ('7cc6ff08e1f126d8ad26e32e48a0f9f8', '资源管理', '菜单树', '删除', '1', '成功删除名称为：[ 计划类型 ]菜单', 'com.glacier.frame.service.system.MenuService', 'delMenu', 'MenuTree_del', '超级管理员', '2015-01-12 13:54:38');
INSERT INTO `t_operalog` VALUES ('7e117b32c0987e7c35c1ceac50c50fb9', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-13 09:56:58');
INSERT INTO `t_operalog` VALUES ('81a361fd8e5cea94a26bc4d1a3114b83', '资源管理', '菜单树', '删除', '1', '成功删除名称为：[ 供应商管理 ]菜单', 'com.glacier.frame.service.system.MenuService', 'delMenu', 'MenuTree_del', '超级管理员', '2015-01-13 09:30:43');
INSERT INTO `t_operalog` VALUES ('8258cc0aaebc13a54196a2f37a040441', '资源管理', '菜单树', '删除', '1', '成功删除名称为：[ 货品档案 ]菜单', 'com.glacier.frame.service.system.MenuService', 'delMenu', 'MenuTree_del', '超级管理员', '2015-01-13 09:30:25');
INSERT INTO `t_operalog` VALUES ('82becf49ea6464183575af994c45837a', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 17:05:22');
INSERT INTO `t_operalog` VALUES ('86cf524a45667a2a5b48d20e7e30d6b7', '资源管理', '面板列表', '增加', '1', '[供应商级别] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2015-01-13 10:31:25');
INSERT INTO `t_operalog` VALUES ('87fafc968eae9c489e65dedbf533c683', '资源管理', '面板列表', '修改', '1', '[报价类型列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2015-01-12 17:05:58');
INSERT INTO `t_operalog` VALUES ('886c5c19e2d44c86cc5b73760597d1b1', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 10:55:14');
INSERT INTO `t_operalog` VALUES ('89f48385f2ed7bd2e3b6597c8e721eed', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2015-01-12 17:08:04');
INSERT INTO `t_operalog` VALUES ('8a4fcf3c649e7dbdb6c99100116ad223', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 10:04:39');
INSERT INTO `t_operalog` VALUES ('8a6cffdefe3a0fad7e4625ff01273840', '资源管理', '面板列表', '增加', '1', '[客户类型列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2015-01-13 10:48:12');
INSERT INTO `t_operalog` VALUES ('8b548ee7b4d6a57ef3a17d699e79c2bb', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 17:05:31');
INSERT INTO `t_operalog` VALUES ('8d0de652f9fc8034c3d15440464cb9b9', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 10:52:38');
INSERT INTO `t_operalog` VALUES ('8ef8c018ee544abbd04c46fe0d248c05', '资源管理', '菜单树', '修改', '1', '[行业管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-01-12 15:49:11');
INSERT INTO `t_operalog` VALUES ('8f7b2d496491debe6127da91ae1266cf', '资源管理', '菜单树', '增加', '1', '[客户来源] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-01-13 10:53:52');
INSERT INTO `t_operalog` VALUES ('904c795c90b26455cc1d851a5f7c7e96', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 16:53:52');
INSERT INTO `t_operalog` VALUES ('90a7e20ec70c11e897bd2e3031a9c2f8', '资源管理', '面板列表', '增加', '1', '[仓库列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2015-01-13 09:35:14');
INSERT INTO `t_operalog` VALUES ('9132819a88093882f69bc6b30e2529fe', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-13 09:53:31');
INSERT INTO `t_operalog` VALUES ('913caf38c53d507da8ea377ff4f82e1d', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 10:17:51');
INSERT INTO `t_operalog` VALUES ('93ee2f9740a33214b48c682469f3b0bb', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 10:32:09');
INSERT INTO `t_operalog` VALUES ('954777a1e89becc57528e195ea35d102', '资源管理', '操作列表', '编辑', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-13 09:43:57');
INSERT INTO `t_operalog` VALUES ('957db7d1dba33810a5d9246f70751be0', '资源管理', '菜单树', '增加', '1', '[客户类型] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-01-13 10:47:58');
INSERT INTO `t_operalog` VALUES ('95b5e94fd936b4c20bfde265c508e6bd', '资源管理', '菜单树', '增加', '1', '[库存管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-01-13 09:48:41');
INSERT INTO `t_operalog` VALUES ('96ac74a370c17f6ec139cee21d73b971', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 09:37:02');
INSERT INTO `t_operalog` VALUES ('9739baf00bac8108c7bc3b04a7d6e40a', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 10:18:12');
INSERT INTO `t_operalog` VALUES ('9836491973ad8e8629cd46e99cd67a78', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 10:35:01');
INSERT INTO `t_operalog` VALUES ('98af0902da6d0177efd404f03c161dbc', '资源管理', '菜单树', '修改', '1', '[支付方式] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-01-12 16:20:31');
INSERT INTO `t_operalog` VALUES ('98cf635c301d3c44a18b425fd41b68c4', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2015-01-12 17:10:12');
INSERT INTO `t_operalog` VALUES ('9a342a00f5e7b454a29d30a1414f7718', '资源管理', '菜单树', '增加', '1', '[财务管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-01-13 10:13:03');
INSERT INTO `t_operalog` VALUES ('9ca4f073abf1002dbf40a423b9c94a75', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 09:38:12');
INSERT INTO `t_operalog` VALUES ('9d33b56c1e1a430a520575fadb32f682', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 15:50:19');
INSERT INTO `t_operalog` VALUES ('9dce7ac65ac8368eaf2a1da081fda849', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 17:47:27');
INSERT INTO `t_operalog` VALUES ('a05311fd6c0bfd3d93a8a7edbe110115', '资源管理', '菜单树', '删除', '1', '成功删除名称为：[ 信用等级 ]菜单', 'com.glacier.frame.service.system.MenuService', 'delMenu', 'MenuTree_del', '超级管理员', '2015-01-12 16:59:50');
INSERT INTO `t_operalog` VALUES ('a09ecce92e12a84aa92bca10b88bbe02', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2015-01-13 08:31:03');
INSERT INTO `t_operalog` VALUES ('a15e525f539522a7510d2f61ddbe6d51', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-13 09:44:21');
INSERT INTO `t_operalog` VALUES ('a16626ae3eed8bdabe000e24c2215aff', '资源管理', '面板列表', '修改', '1', '[行业管理列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2015-01-12 16:19:37');
INSERT INTO `t_operalog` VALUES ('a2ec4dcd37c7a781d8f0c73a70f8dfb9', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 10:24:45');
INSERT INTO `t_operalog` VALUES ('a3ca9f239cf1d7ee84b73a6c173996e9', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 10:07:59');
INSERT INTO `t_operalog` VALUES ('a4a5a12df3265feb083ae2c59adac0d6', '资源管理', '面板列表', '修改', '1', '[行业管理列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2015-01-12 15:49:35');
INSERT INTO `t_operalog` VALUES ('a50cd08aad3bc6358d0bd32d625c220b', '资源管理', '操作列表', '编辑', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 17:05:09');
INSERT INTO `t_operalog` VALUES ('a84284db5802821bf398e2e4407f4d42', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-12 17:44:11');
INSERT INTO `t_operalog` VALUES ('a84d3abb7482e9529e25bce54b91b7b8', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 16:55:49');
INSERT INTO `t_operalog` VALUES ('a93a507c4c831a454f58f8ef9195a03a', '资源管理', '操作列表', '编辑', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 16:53:40');
INSERT INTO `t_operalog` VALUES ('a9723c47a72ab844fb1eb3f2c6ae8941', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 10:05:03');
INSERT INTO `t_operalog` VALUES ('ab23bd05233280ef27af6e6596fabb18', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 16:43:28');
INSERT INTO `t_operalog` VALUES ('ab484490594b54831945b206dc7c8e83', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-13 09:46:30');
INSERT INTO `t_operalog` VALUES ('ab66199a55ce5974c4a7d7de11e4342b', '资源管理', '操作列表', '编辑', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 17:01:38');
INSERT INTO `t_operalog` VALUES ('ab74a44ba7c06b0dd93d874a0e867643', '资源管理', '面板列表', '修改', '1', '[公司规模列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2015-01-12 16:17:50');
INSERT INTO `t_operalog` VALUES ('ac676935321041360c1d38d1e3298150', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-13 09:45:40');
INSERT INTO `t_operalog` VALUES ('ac8148d99b433f967455ecc719fafb47', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 10:32:26');
INSERT INTO `t_operalog` VALUES ('ad5ab439ff1a278c5c231c6d784b54ae', '资源管理', '操作列表', '编辑', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-13 09:56:18');
INSERT INTO `t_operalog` VALUES ('af47e8441df290a4dd84f2a832421893', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 09:37:47');
INSERT INTO `t_operalog` VALUES ('af56dced926928f4ffa33a4e9faa2c2f', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-13 10:35:55');
INSERT INTO `t_operalog` VALUES ('af6867a0c8614fa52e39ef46686a35b7', '资源管理', '菜单树', '修改', '1', '[行业管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-01-12 15:45:52');
INSERT INTO `t_operalog` VALUES ('b04b3686760ac5709d2609d3166cce3b', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2015-01-12 17:08:37');
INSERT INTO `t_operalog` VALUES ('b098c33c129586bae035be169fee9c2d', '资源管理', '菜单树', '修改', '1', '[客户档案管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-01-13 09:29:04');
INSERT INTO `t_operalog` VALUES ('b0d403a9a40e432501c20b35e1fe33a7', '资源管理', '操作列表', '编辑', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 16:54:23');
INSERT INTO `t_operalog` VALUES ('b2862ae23e3737bf5dff1577e16b614a', '资源管理', '菜单树', '增加', '1', '[供应商来源] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-01-13 10:34:17');
INSERT INTO `t_operalog` VALUES ('b2ed140e3c7e268ecd08465dd203febf', '资源管理', '菜单树', '删除', '1', '成功删除名称为：[ 基础资料 ]菜单', 'com.glacier.frame.service.system.MenuService', 'delMenu', 'MenuTree_del', '超级管理员', '2015-01-13 09:29:29');
INSERT INTO `t_operalog` VALUES ('b4a744f0792fcf9b2c197c46f364a7b5', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-13 09:42:46');
INSERT INTO `t_operalog` VALUES ('b64d343bc5e3b91accd5f1636bfb04e3', '资源管理', '操作列表', '编辑', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 17:00:49');
INSERT INTO `t_operalog` VALUES ('b69bfce9ae2404e296a07dce8af986c9', '资源管理', '操作列表', '编辑', '1', '[添加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 17:47:18');
INSERT INTO `t_operalog` VALUES ('b8f2201795f18d515a37d1c5cb558cc8', '资源管理', '菜单树', '增加', '1', '[调拨类型] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-01-13 10:06:30');
INSERT INTO `t_operalog` VALUES ('b8f815abda6b6ac80372077181fe6066', '资源管理', '操作列表', '编辑', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 16:52:01');
INSERT INTO `t_operalog` VALUES ('b9be72b72758aa7d4fe6d0a08fd4d88f', '资源管理', '菜单树', '修改', '1', '[供应商管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-01-12 17:51:18');
INSERT INTO `t_operalog` VALUES ('bb090ace865466a9349ad30073949bd2', '资源管理', '面板列表', '增加', '1', '[出库业务类型列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2015-01-13 10:03:56');
INSERT INTO `t_operalog` VALUES ('bbfdcf7b9575aca57eba812c5af572b9', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-13 09:45:36');
INSERT INTO `t_operalog` VALUES ('bc8c7daf93f428a3916463ef60ed4b27', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 10:25:21');
INSERT INTO `t_operalog` VALUES ('bd2b0345459696f07334596521cad4b1', '资源管理', '菜单树', '修改', '1', '[公司规模] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-01-12 16:16:35');
INSERT INTO `t_operalog` VALUES ('bd963c44fc9ede61e75579d0c4252f22', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-13 08:30:44');
INSERT INTO `t_operalog` VALUES ('bdb16f64dfe59a7b0d2f299f8e702f17', '资源管理', '操作列表', '编辑', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-13 09:42:39');
INSERT INTO `t_operalog` VALUES ('bdc982f073973c999686992fa347d120', '资源管理', '菜单树', '修改', '1', '[货品档案信息] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-01-13 09:32:15');
INSERT INTO `t_operalog` VALUES ('c0da484b595ac67725a0de0003d597aa', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 16:50:34');
INSERT INTO `t_operalog` VALUES ('c17b47c06e82d438f963e23465d21850', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 16:58:47');
INSERT INTO `t_operalog` VALUES ('c222b40a97b09d39f121023f0b910b41', '资源管理', '面板列表', '修改', '1', '[公司规模列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2015-01-12 16:47:42');
INSERT INTO `t_operalog` VALUES ('c29f247a31a58cd2b2137fe5fc993f86', '资源管理', '操作列表', '编辑', '1', '[添加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-13 08:29:58');
INSERT INTO `t_operalog` VALUES ('c383be2a2b985fcf26dfc80a59a2ad40', '资源管理', '菜单树', '修改', '1', '[销售类型] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-01-13 09:41:02');
INSERT INTO `t_operalog` VALUES ('c3f38bce60d8176421d9364c1c68b72c', '资源管理', '菜单树', '修改', '1', '[供应商管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-01-13 09:29:11');
INSERT INTO `t_operalog` VALUES ('c4461619c2c979347e6c845942fbe9fa', '资源管理', '菜单树', '修改', '1', '[销售退货方式] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-01-13 09:43:12');
INSERT INTO `t_operalog` VALUES ('c4c1ceb59e01c8889772fbf8d0f5b0b7', '资源管理', '菜单树', '增加', '1', '[仓库管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-01-13 09:34:03');
INSERT INTO `t_operalog` VALUES ('c5443f3e92cd0764020d974c7e1edef8', '资源管理', '菜单树', '增加', '1', '[应收类型] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-01-13 10:20:05');
INSERT INTO `t_operalog` VALUES ('c942d18ef49212ba8557588b257fb50e', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 17:12:00');
INSERT INTO `t_operalog` VALUES ('cc21f649822c648abcfe205ed4bf49fb', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2015-01-12 17:10:32');
INSERT INTO `t_operalog` VALUES ('cddf2a725af90497a0b9a026ddaa451a', '资源管理', '菜单树', '修改', '1', '[客户档案] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-01-13 09:30:50');
INSERT INTO `t_operalog` VALUES ('cf38c29d0c737bd5e41521a6be84eb0c', '资源管理', '面板列表', '修改', '1', '[公司性质列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2015-01-12 16:58:56');
INSERT INTO `t_operalog` VALUES ('d269fb93698d5a9ed31cd4edb0073115', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 09:52:06');
INSERT INTO `t_operalog` VALUES ('d2a60689ba916f67008a34466ea1aab7', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 10:52:58');
INSERT INTO `t_operalog` VALUES ('d450f58d50b6a1832bb68546c1e44767', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 16:52:28');
INSERT INTO `t_operalog` VALUES ('d6998cd90578e45ab0327db84566e1a6', '资源管理', '面板列表', '修改', '1', '[联系人类型列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2015-01-12 17:00:27');
INSERT INTO `t_operalog` VALUES ('d6a05c154f74f4ea4dc461f685b64d82', '资源管理', '菜单树', '修改', '1', '[货品档案信息] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-01-13 09:29:44');
INSERT INTO `t_operalog` VALUES ('d6db093608246fc868784e8a576075f5', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 17:03:43');
INSERT INTO `t_operalog` VALUES ('d72c62c25ab42ede7fd02fae810c7cad', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-13 10:53:03');
INSERT INTO `t_operalog` VALUES ('d863bea7f33df3e08c25c28aaf81bac1', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-12 17:46:57');
INSERT INTO `t_operalog` VALUES ('d97b2b5c0705b28d1f06db994dbd59d0', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-13 10:33:38');
INSERT INTO `t_operalog` VALUES ('e284b664c1d5b8cb34891bb9f8534e16', '资源管理', '菜单树', '修改', '1', '[客户档案] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-01-13 09:31:35');
INSERT INTO `t_operalog` VALUES ('e456a131cbde0ac4486b69b24fe55716', '资源管理', '菜单树', '修改', '1', '[供应商档案] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-01-13 09:31:57');
INSERT INTO `t_operalog` VALUES ('e4d0d61b32d51b411fecc985864751a2', '资源管理', '菜单树', '修改', '1', '[供应商管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-01-12 17:41:43');
INSERT INTO `t_operalog` VALUES ('e644b587937af0cf06805888f7508ce6', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-13 10:05:43');
INSERT INTO `t_operalog` VALUES ('e73cbaad5b126e4549d414dea31c0f2c', '资源管理', '面板列表', '增加', '1', '[费用类型列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2015-01-13 10:24:06');
INSERT INTO `t_operalog` VALUES ('e74b35f707e43294fe89f490ebe893d4', '资源管理', '面板列表', '修改', '1', '[交货方式列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2015-01-12 16:57:02');
INSERT INTO `t_operalog` VALUES ('e77f3a8ccb2faacde5221e8462244c36', '资源管理', '面板列表', '增加', '1', '[锁定类型列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2015-01-13 10:10:19');
INSERT INTO `t_operalog` VALUES ('e9e9331e2f2b0696e17d928085836eee', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 10:49:01');
INSERT INTO `t_operalog` VALUES ('ecae8b946953ecd0cb32acddab02529b', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 10:25:02');
INSERT INTO `t_operalog` VALUES ('ed1aa693fcea410470b58a798e56c2b6', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 16:54:00');
INSERT INTO `t_operalog` VALUES ('edc7647578734560b2ee5f580ff654d9', '资源管理', '面板列表', '修改', '1', '[行业管理列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2015-01-12 16:19:47');
INSERT INTO `t_operalog` VALUES ('edfabcc79d0616a436017d57e9b19ea5', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 17:07:38');
INSERT INTO `t_operalog` VALUES ('eefd6e33cd47dec78c94c55617f0ec0f', '资源管理', '面板列表', '修改', '1', '[支付方式列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2015-01-12 16:57:54');
INSERT INTO `t_operalog` VALUES ('ef1b0f8ce5bbe437cbe65bfe0b46b1fe', '资源管理', '操作列表', '编辑', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 16:58:15');
INSERT INTO `t_operalog` VALUES ('f075be06ae9adef36fd7322cf1cff387', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2015-01-12 13:54:20');
INSERT INTO `t_operalog` VALUES ('f0e95070d7271c28ca8e7dd67e862686', '资源管理', '面板列表', '修改', '1', '[公司性质列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2015-01-12 16:20:55');
INSERT INTO `t_operalog` VALUES ('f10a506881314326c42a8f7e0956adc7', '资源管理', '菜单树', '增加', '1', '[费用类型] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-01-13 10:23:46');
INSERT INTO `t_operalog` VALUES ('f2097e30bcb9005fdac44d992ed3fd47', '资源管理', '菜单树', '增加', '1', '[应付类型] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-01-13 10:16:39');
INSERT INTO `t_operalog` VALUES ('f3cde85ac66ecfa79c996c5ff5dbbd98', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 16:54:42');
INSERT INTO `t_operalog` VALUES ('f3d405ffa99406269cc92a9e2d065847', '资源管理', '菜单树', '修改', '1', '[系统变量] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-01-13 09:31:09');
INSERT INTO `t_operalog` VALUES ('f48a64f4b1effc70f917368836724e4d', '资源管理', '菜单树', '增加', '1', '[供应商管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-01-13 10:27:14');
INSERT INTO `t_operalog` VALUES ('f4da25a8ec2ee67b3d163ba3a5b9745e', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-13 09:44:28');
INSERT INTO `t_operalog` VALUES ('f4e76811e956b24000880f793af45302', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 10:54:37');
INSERT INTO `t_operalog` VALUES ('f52db961b661bd9ebcf70a69edccabde', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 10:05:22');
INSERT INTO `t_operalog` VALUES ('f5c3c9ad9cd5bd393f2657690c21894c', '资源管理', '菜单树', '增加', '1', '[供应商级别] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-01-13 10:31:07');
INSERT INTO `t_operalog` VALUES ('f6e7e67fb9dda6b370491eef136af47b', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 09:53:52');
INSERT INTO `t_operalog` VALUES ('f728a395694a56d82153fd9491b04216', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 17:01:42');
INSERT INTO `t_operalog` VALUES ('f75071d2c3acc05ca0b1498f376bb617', '资源管理', '菜单树', '修改', '1', '[供应商档案] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-01-12 17:41:56');
INSERT INTO `t_operalog` VALUES ('f76766af75ec4967507803fbafc56932', '资源管理', '菜单树', '修改', '1', '[供应商档案] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-01-13 09:30:35');
INSERT INTO `t_operalog` VALUES ('f7cafd9e2dd2b9eb21123f74a7b7728f', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 10:08:22');
INSERT INTO `t_operalog` VALUES ('fb32275dc5574f6fcf1a706639dbe43d', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-13 10:21:54');
INSERT INTO `t_operalog` VALUES ('fb5ac26f252a70694d3c87dcb0871d92', '资源管理', '菜单树', '修改', '1', '[公司性质] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-01-12 16:20:48');
INSERT INTO `t_operalog` VALUES ('fb75b816359fa78fa5bce359e5712cf3', '资源管理', '操作列表', '编辑', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 16:57:24');
INSERT INTO `t_operalog` VALUES ('fb77cf9a246bead3c76980bb20e2d7fa', '资源管理', '菜单树', '修改', '1', '[退货方式] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-01-12 13:53:12');
INSERT INTO `t_operalog` VALUES ('fc030717f3cbf80fe5160a0a5f4ebd32', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-01-12 16:55:59');
INSERT INTO `t_operalog` VALUES ('fc5da1267a13f047fb22c57ead3892f7', '资源管理', '菜单树', '删除', '1', '成功删除名称为：[ 客户档案管理 ]菜单', 'com.glacier.frame.service.system.MenuService', 'delMenu', 'MenuTree_del', '超级管理员', '2015-01-13 09:30:54');
INSERT INTO `t_operalog` VALUES ('fe9c16b2392ac990deedb148a32a7b03', '资源管理', '菜单树', '修改', '1', '[行业管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-01-12 15:45:39');
INSERT INTO `t_operalog` VALUES ('ff260530b3483315ae2df9884be4c77d', '资源管理', '菜单树', '修改', '1', '[库存管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-01-13 09:49:20');

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
INSERT INTO `t_panel` VALUES ('0d7ed154eebe739d81a20da996d68e6b', 'ccec6c46d43b0e7c40ce5c1ffc0cb3e5', '退货原因列表', 'PurchaseReturnReasonList', '1');
INSERT INTO `t_panel` VALUES ('21f3486dd1b51463c4979dc80ef4009b', 'dc2dcb1b303c05b27e9c01dc23dcc5f7', '采购类型集合', 'PurchaseTypeList', '1');
INSERT INTO `t_panel` VALUES ('3456eg4157cf483a790f4eea35ds5675', 'sdsfeg4157cf483a790f4eea35ds5675', '下拉列表', 'OptgroupValueList', '1');
INSERT INTO `t_panel` VALUES ('365eeace84821f6e45d59cefd702827d', '810ba3686840457556cb55bc87d8010b', '销售类型列表', 'SellTypeList', '1');
INSERT INTO `t_panel` VALUES ('37011217016636a0723462dbc81bf887', '91ca1b4b197688f21b68a72f69e09a8d', '管理员列表', 'UserList', '1');
INSERT INTO `t_panel` VALUES ('3fae5276226498a6cb1b5cf466793cd6', '14sdf54157cf483a790f4eea35dsf6f6', '信用类别', 'creditType', '27');
INSERT INTO `t_panel` VALUES ('42741ce0beb570a8e14a6bee5b2e9cab', 'ea92abb340a62dfd3ecc9b5e4d78c041', '调拨类型列表', 'WarDeployTypeList', '1');
INSERT INTO `t_panel` VALUES ('4284f4950bf67217bf1816260419ebbb', 'd29229a817d81ed224df8c53d2f48f3d', '报价类型列表', 'PurchaseQuotedPriceTypeList', '1');
INSERT INTO `t_panel` VALUES ('4546fgrgrh1dfhsjdfh124564sdf2sag', 'sdsfeg4157cf483a790f4eea35ds5675', '下拉项树', 'OptgroupTree', '2');
INSERT INTO `t_panel` VALUES ('4df3645386cbf2317d35ecf218939b71', '16669401121c47c062cac4d11a21522e', '出库业务类型列表', 'WarOutTypeList', '1');
INSERT INTO `t_panel` VALUES ('4e23476d801ed12824a42aca3f813617', 'e8a2f672e16b2dcaf720a8b0586e99fd', '入库业务类型列表', 'WarInTypeList', '1');
INSERT INTO `t_panel` VALUES ('511268ad8f3a8e0717381748f5f3ae8d', 'bc38d000dee30299a20f254c0aec0aaf', '供应商来源列表', 'SuppliersSourceList', '1');
INSERT INTO `t_panel` VALUES ('5252a18b51e04ddf499aac66a8245367', 'a35ca1bb25e1f11898c78eb03332554b', '锁定类型列表', 'WarOccupationTypeList', '1');
INSERT INTO `t_panel` VALUES ('557cf8b2740e6792f517138703afb407', 'ac892df07f9087fb1c89ac968bb5f555', '操作日志列表', 'OperalogList', '1');
INSERT INTO `t_panel` VALUES ('5731697aea23532eb8162f5ba1818c6f', '54eb754157cf483a790f4eea35200118', '菜单树', 'MenuTree', '1');
INSERT INTO `t_panel` VALUES ('58fc5a925e18a411e10bf5b2084ee609', '8c54260cf2f6704a1739503465d9e9cf', '应收类型列表', 'FinanceReceivableTypeList', '1');
INSERT INTO `t_panel` VALUES ('60ef5b40e8753bdc2909a2413a379091', '14sdf54157cf483a790f4eea35dsf6f6', 'asdf', 'adf', '1');
INSERT INTO `t_panel` VALUES ('628e3c73409f37c6d28bdd97ed61b5fc', 'c81a4c0156789361600940be2ebdab2c', '客户级别列表', 'ClientLevelList', '1');
INSERT INTO `t_panel` VALUES ('6659f9987cbbdf0721f8935b4a3d5a36', '00451bcfd707a2b5c3b80704f992dc21', '退货方式列表', 'PurchaseReturnedType', '1');
INSERT INTO `t_panel` VALUES ('6cfa450f398c5384de09368f8b7094ab', 'a4d88b8b3c70b93d69d0bf24ffb09377', '供应商档案列表', 'SuppliersList', '1');
INSERT INTO `t_panel` VALUES ('6dbbdf0a9349268ead711fc84f3da291', '2261cc3a4a23b23bd6317021981fbd1e', '供应商类型列表', 'SuppliersTypeList', '1');
INSERT INTO `t_panel` VALUES ('7794769fe25fd3fb2f2534fb8ec9e668', '16635dfa4b5e1dda4fd5d804f430eeec', '客户来源列表', 'ClientSourceList', '1');
INSERT INTO `t_panel` VALUES ('82385e2a3e64ac4cf4633ccb4c38c480', '82533b28131409450ad7a00229fd7333', '联系人类型列表', 'ComContactTypeList', '1');
INSERT INTO `t_panel` VALUES ('83bbeed02a85549ae84cde8d98bcd8c1', 'e550884c5e6c1e94ee70cc833aa1c2b9', '角色列表', 'RoleList', '1');
INSERT INTO `t_panel` VALUES ('95eaa68d7a4109e845d63ef82cdb0d3f', '1b41e29c8712c9f36bc3a520a8e5363b', '费用类型列表', 'FinanceCostTypeList', '1');
INSERT INTO `t_panel` VALUES ('961d2e73b3fa93a9f125fb731e0a9529', '54eb754157cf483a790f4eea35200118', '面板列表', 'PanelList', '2');
INSERT INTO `t_panel` VALUES ('977a07ecaf616fcd4ba6e47b19896a42', '4f2b136adfaf68b741d58df8e4adc4ff', '应付类型列表', 'FinancePayableTypeList', '1');
INSERT INTO `t_panel` VALUES ('9e374c52fd0ee843ee81b70c8a1b13d2', '66761e0ea9850fd6cdfc59f282de2ebb', '客户类型列表', 'ClientTypeList', '1');
INSERT INTO `t_panel` VALUES ('ad67aaf12a02906ad088a73410fd097e', '8a2f2500fa46e49dd7ff11b688b6c740', '公司规模列表', 'ComCompanySizeList', '1');
INSERT INTO `t_panel` VALUES ('ad6926567cb16be8966308eb36583a57', '0eac3f9c7b4e4cdd5e42c56a16c85147', '交货方式列表', 'ComDeliveryTypeList', '1');
INSERT INTO `t_panel` VALUES ('af5f8e8847920dc7fd6347e3a4e9c467', '295ffaf17338b3621d532bfe8ee6c779', '公司性质列表', 'ComNatureList', '1');
INSERT INTO `t_panel` VALUES ('afb1cf326e78fe292af33b76aeef02cd', 'bfe6aa265cb92e35e9920f98a61df508', '货品档案信息列表', 'GoodsList', '1');
INSERT INTO `t_panel` VALUES ('bbab3b6621262de4ca87aee3025b8966', '801ecf764a95da45ccbd194800c0eeeb', '仓库列表', 'WarehouseList', '1');
INSERT INTO `t_panel` VALUES ('bbf240fc8c53886e327ff15976026945', '0d5f941c0e815519b859afa0992eda0b', '部门列表', 'DepList', '1');
INSERT INTO `t_panel` VALUES ('c2a06009f4a31f5c63c6631a869ad813', 'c9845e00a5b709d5659d4011119daa67', '供应商级别', 'SuppliersGradeList', '1');
INSERT INTO `t_panel` VALUES ('c7796dffd9d50588655cfc9d6a297efc', '8fc3b6de8076d1e8c3a6514bd29c4c4b', '支付方式列表', 'ComPaymentTypeList', '1');
INSERT INTO `t_panel` VALUES ('cef00aa1a7ab2338e5bb4e85e311af6f', 'ebd8d76ac65eea1c8d65ac5c14da27b0', '行业管理列表', 'ComIndustryList', '1');
INSERT INTO `t_panel` VALUES ('db267d978539cb0f87dc55a9dc1a25f7', '97373f4ec8138e3a74a8a73f90e285f4', '采购类型列表', 'PurchaseType_List', '1');
INSERT INTO `t_panel` VALUES ('e6784ccad10e3414b99b77b303a338c7', '93f0fcfa7cdff069d929723062b53211', '变量列表', 'VariablesList', '1');
INSERT INTO `t_panel` VALUES ('eb2a84c4b7bd11632135e4992ade286e', '54eb754157cf483a790f4eea35200118', '操作列表', 'ActionList', '3');
INSERT INTO `t_panel` VALUES ('eb65d0304dc38ac4db140a1c10fdc7d3', 'aa165bf67dadbeedeb780b3e92dcdcdb', '销售退货方式列表', 'SellReturnTypeList', '1');
INSERT INTO `t_panel` VALUES ('efe32f25f6d4eab27c74e3dbcf326b47', '79d4fbfb8f73e4e21ee67e1d6ad9ff5e', '客户档案列表', 'ClientList', '1');
INSERT INTO `t_panel` VALUES ('f664c6028d8cab504f2771fa78d56312', '90998bf3c3173da5e8319d70cec8a7ab', '销售退货原因列表', 'SellReturnReasonList', '1');
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
INSERT INTO `t_parameter_optgroup` VALUES ('1bf27bce9c73b22e9822fb85380ac347', '113afb2ecac88fe851ad501c53b7d82b', 'status', '状态', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:34:53', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:37:23');
INSERT INTO `t_parameter_optgroup` VALUES ('2fab4b191e528e002329f82c8493c663', 'fdf96023b965dbb34d1e1dd478851076', 'province', '参考价格销售', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-09 17:48:46', '8b25651c2d896297530b64e4b80ec503', '2015-01-09 17:49:33');
INSERT INTO `t_parameter_optgroup` VALUES ('2rtfdg1rgrh1dfhsjdfh124564sdf21d', null, 'system', '系统设置', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:34:53', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:12:31');
INSERT INTO `t_parameter_optgroup` VALUES ('3de467b04ce8984ae48ba243eb25ffb2', null, 'basicdatas', '参数管理', null, null, '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:15:47', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:12:47');
INSERT INTO `t_parameter_optgroup` VALUES ('7114c42efa5349f4c8874787fde91633', 'bd88aee43efe41a6ebd10b263fa29ed1', 'formType', '表单类型', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:19:08', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:04:35');
INSERT INTO `t_parameter_optgroup` VALUES ('87e805fcf0c779b8f57fde22d819e2db', '113afb2ecac88fe851ad501c53b7d82b', 'sex', '性别', null, null, '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:11:51', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:52:39');
INSERT INTO `t_parameter_optgroup` VALUES ('b85ef5842fff5a7eb9535207e7cf5dc9', null, 'basic', '基础资料', null, null, '3', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-09 17:46:50', '8b25651c2d896297530b64e4b80ec503', '2015-01-09 17:46:50');
INSERT INTO `t_parameter_optgroup` VALUES ('bd88aee43efe41a6ebd10b263fa29ed1', '3de467b04ce8984ae48ba243eb25ffb2', 'variables', '系统变量', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:18:18', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:04:28');
INSERT INTO `t_parameter_optgroup` VALUES ('c755d2e108859f9206f73bf19e0b6cbf', '113afb2ecac88fe851ad501c53b7d82b', 'yesOrNo', '是否', null, null, '5', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-09 17:44:59', '8b25651c2d896297530b64e4b80ec503', '2015-01-09 17:44:59');
INSERT INTO `t_parameter_optgroup` VALUES ('fdf78bcc980b29a21a65131eab1c1b38', '113afb2ecac88fe851ad501c53b7d82b', 'builtin', '内置', null, null, '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:34:53', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:04:12');
INSERT INTO `t_parameter_optgroup` VALUES ('fdf96023b965dbb34d1e1dd478851076', 'b85ef5842fff5a7eb9535207e7cf5dc9', 'clientManage', '客户档案管理', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-09 17:47:24', '8b25651c2d896297530b64e4b80ec503', '2015-01-09 17:48:21');
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
INSERT INTO `t_parameter_optgroup_value` VALUES ('04f64bb491caa38214eaf553872cbb5a', '2fab4b191e528e002329f82c8493c663', 'policy1', '参考销售价格一', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-09 17:59:52', '8b25651c2d896297530b64e4b80ec503', '2015-01-09 17:59:52');
INSERT INTO `t_parameter_optgroup_value` VALUES ('07542b2a1098fa1ceb03c3f604c5cc7f', '2fab4b191e528e002329f82c8493c663', 'policy3', '参考销售价格三', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-12 08:49:14', '8b25651c2d896297530b64e4b80ec503', '2015-01-12 08:49:14');
INSERT INTO `t_parameter_optgroup_value` VALUES ('1ed2d672131c69ea00a61b0edd2d5358', 'fdf78bcc980b29a21a65131eab1c1b38', 'builtin', '内置', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:31:13', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:42:00');
INSERT INTO `t_parameter_optgroup_value` VALUES ('239294f5e95b8d95911c4227eb2473e4', 'fdf78bcc980b29a21a65131eab1c1b38', 'custom', '自定义', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:31:32', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:42:04');
INSERT INTO `t_parameter_optgroup_value` VALUES ('2938873297a3772fbe3dc2ed191d72f5', '2fab4b191e528e002329f82c8493c663', 'policy2', '参考销售价格二', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-12 08:48:46', '8b25651c2d896297530b64e4b80ec503', '2015-01-12 08:48:46');
INSERT INTO `t_parameter_optgroup_value` VALUES ('2c663921507de7b121d37b460d65b5c4', 'fdf78bcc980b29a21a65131eab1c1b38', 'admin', '管理员', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:41:48');
INSERT INTO `t_parameter_optgroup_value` VALUES ('3sfsaf1231452112121525as5fsdf454', '1bf27bce9c73b22e9822fb85380ac347', 'enable', '启用', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 14:42:47');
INSERT INTO `t_parameter_optgroup_value` VALUES ('41ad6336a2e35dd9d67ed0ece74ad155', '7114c42efa5349f4c8874787fde91633', 'input', '输入框', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:53:45', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('4346c17adc9f4b126baa6e593dfb1219', '87e805fcf0c779b8f57fde22d819e2db', 'man', '男', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:54:45', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:54:45');
INSERT INTO `t_parameter_optgroup_value` VALUES ('54649309c8f9275b921cf86a288bc012', 'c755d2e108859f9206f73bf19e0b6cbf', 'yes', '是', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-09 17:45:11', '8b25651c2d896297530b64e4b80ec503', '2015-01-09 17:45:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('5dfs2d1f32sd1f2sd1f2sd1f256565sd', '1bf27bce9c73b22e9822fb85380ac347', 'disable', '禁用', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 14:42:50');
INSERT INTO `t_parameter_optgroup_value` VALUES ('659b6401d8a88caa8e4137b2fed0507d', '2fab4b191e528e002329f82c8493c663', 'policy7', '参考销售价格七', 'enable', '7', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-12 08:51:35', '8b25651c2d896297530b64e4b80ec503', '2015-01-12 08:51:35');
INSERT INTO `t_parameter_optgroup_value` VALUES ('6bc1e80e1a7d3b0f1e8a7761afa2b47e', '2fab4b191e528e002329f82c8493c663', 'policy9', '参考销售价格九', 'enable', '9', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-12 08:53:04', '8b25651c2d896297530b64e4b80ec503', '2015-01-12 08:53:04');
INSERT INTO `t_parameter_optgroup_value` VALUES ('85db75ec028f7cbbb412331e8c035470', '7114c42efa5349f4c8874787fde91633', 'textarea', '文本框', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:54:06', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('9df028d9a094c5425892ec216fa44fdb', '2fab4b191e528e002329f82c8493c663', 'policy10', '参考销售价格十', 'enable', '10', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-12 08:53:33', '8b25651c2d896297530b64e4b80ec503', '2015-01-12 08:53:33');
INSERT INTO `t_parameter_optgroup_value` VALUES ('9e422ecb8e30b8a8d990b28b0768b0d5', '2fab4b191e528e002329f82c8493c663', 'policy5', '参考销售价格五', 'enable', '5', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-12 08:50:22', '8b25651c2d896297530b64e4b80ec503', '2015-01-12 08:50:22');
INSERT INTO `t_parameter_optgroup_value` VALUES ('adf5a85fc6937d07f65484014cc2ce76', '0b6919d96ff46e91471d9714bd1d205f', 'failure', '审核失败', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-02 15:17:11', '8b25651c2d896297530b64e4b80ec503', '2014-05-06 10:52:23');
INSERT INTO `t_parameter_optgroup_value` VALUES ('b508a6b4fb3ede4674664a2dfd04e7fd', '2fab4b191e528e002329f82c8493c663', 'policy4', '参考销售价格四', 'enable', '4', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-12 08:49:42', '8b25651c2d896297530b64e4b80ec503', '2015-01-12 08:49:42');
INSERT INTO `t_parameter_optgroup_value` VALUES ('c66f3d262c9be0f4dc9ff7b30f5645ad', '2fab4b191e528e002329f82c8493c663', 'policy8', '参考销售价格八', 'enable', '8', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-12 08:52:33', '8b25651c2d896297530b64e4b80ec503', '2015-01-12 08:52:33');
INSERT INTO `t_parameter_optgroup_value` VALUES ('e2d6acf04183213005f1703fa7a1a77d', 'c755d2e108859f9206f73bf19e0b6cbf', 'no', '否', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-09 17:45:26', '8b25651c2d896297530b64e4b80ec503', '2015-01-09 17:45:26');
INSERT INTO `t_parameter_optgroup_value` VALUES ('e60a0f1adebf1b828640fbb338316eb8', '0b6919d96ff46e91471d9714bd1d205f', 'authstr', '审核中', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-02 15:16:10', '8b25651c2d896297530b64e4b80ec503', '2014-04-02 15:16:10');
INSERT INTO `t_parameter_optgroup_value` VALUES ('edadcc897e844c01a21731f5721a24f9', '2fab4b191e528e002329f82c8493c663', 'policy6', '参考销售价格六', 'enable', '6', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-12 08:50:54', '8b25651c2d896297530b64e4b80ec503', '2015-01-12 08:50:54');
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
-- Table structure for `t_par_client_level`
-- ----------------------------
DROP TABLE IF EXISTS `t_par_client_level`;
CREATE TABLE `t_par_client_level` (
  `client_level_id` varchar(32) NOT NULL,
  `code` varchar(32) default NULL,
  `client_level_name` varchar(32) default NULL,
  `sequenced` int(4) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`client_level_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_par_client_level
-- ----------------------------

-- ----------------------------
-- Table structure for `t_par_client_source`
-- ----------------------------
DROP TABLE IF EXISTS `t_par_client_source`;
CREATE TABLE `t_par_client_source` (
  `client_source_id` varchar(32) NOT NULL,
  `code` varchar(32) default NULL,
  `client_source_name` varchar(32) default NULL,
  `sequenced` int(4) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`client_source_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_par_client_source
-- ----------------------------

-- ----------------------------
-- Table structure for `t_par_client_type`
-- ----------------------------
DROP TABLE IF EXISTS `t_par_client_type`;
CREATE TABLE `t_par_client_type` (
  `client_typeid` varchar(32) NOT NULL,
  `code` varchar(32) default NULL,
  `client_type_name` varchar(32) default NULL,
  `sequenced` int(4) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`client_typeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_par_client_type
-- ----------------------------

-- ----------------------------
-- Table structure for `t_par_com_company_size`
-- ----------------------------
DROP TABLE IF EXISTS `t_par_com_company_size`;
CREATE TABLE `t_par_com_company_size` (
  `company_size_id` varchar(32) NOT NULL,
  `code` varchar(32) default NULL,
  `company_size_name` varchar(32) default NULL,
  `sequenced` int(4) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`company_size_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_par_com_company_size
-- ----------------------------
INSERT INTO `t_par_com_company_size` VALUES ('54f4d9894d824464d2fb4e54e851fa95', null, '100-200人', '3', 'enable', '超级管理员', '2015-01-09 10:13:44', '超级管理员', '2015-01-09 10:13:44');
INSERT INTO `t_par_com_company_size` VALUES ('c1e2b3f9e0f5499300a4fc9cc05b42e3', null, '1-50人', '1', 'enable', '超级管理员', '2015-01-09 10:13:12', '超级管理员', '2015-01-09 10:13:12');
INSERT INTO `t_par_com_company_size` VALUES ('d841c8aba55b21d0e1284525b83b8895', null, '50-100人', '2', 'enable', '超级管理员', '2015-01-09 10:13:29', '超级管理员', '2015-01-09 10:13:29');

-- ----------------------------
-- Table structure for `t_par_com_contact_type`
-- ----------------------------
DROP TABLE IF EXISTS `t_par_com_contact_type`;
CREATE TABLE `t_par_com_contact_type` (
  `contact_type_id` varchar(32) NOT NULL COMMENT '�������ID',
  `contact_type_name` varchar(32) default NULL COMMENT '��ƷID',
  `enabled` enum('enable','disable') default NULL COMMENT '�Ƿ����� ö�٣�(����1/����0)',
  `creater` varchar(32) default NULL COMMENT 'ö�٣�(����1/����0)',
  `create_time` datetime default NULL COMMENT '¼��ʱ��',
  `updater` varchar(32) default NULL COMMENT '����޸���',
  `update_time` datetime default NULL COMMENT '����޸�ʱ��',
  `code` int(4) default NULL,
  `sequenced` int(4) default NULL,
  PRIMARY KEY  (`contact_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_par_com_contact_type
-- ----------------------------
INSERT INTO `t_par_com_contact_type` VALUES ('6a77849f97c648181e98a8cf3fcd10b9', '老总', 'enable', '超级管理员', '2015-01-08 17:50:00', '超级管理员', '2015-01-08 17:50:00', null, '1');

-- ----------------------------
-- Table structure for `t_par_com_credit_grade`
-- ----------------------------
DROP TABLE IF EXISTS `t_par_com_credit_grade`;
CREATE TABLE `t_par_com_credit_grade` (
  `credit_id` varchar(32) NOT NULL,
  `code` varchar(32) default NULL,
  `credit_name` varchar(32) default NULL,
  `credit_begin_integral` int(4) default NULL,
  `credit_end_integral` int(4) default NULL,
  `credit_photo` varchar(255) default NULL,
  `sequenced` int(4) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`credit_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_par_com_credit_grade
-- ----------------------------

-- ----------------------------
-- Table structure for `t_par_com_deliver_type`
-- ----------------------------
DROP TABLE IF EXISTS `t_par_com_deliver_type`;
CREATE TABLE `t_par_com_deliver_type` (
  `deliver_type_id` varchar(32) NOT NULL,
  `code` varchar(32) default NULL,
  `deliver_type_name` varchar(32) default NULL,
  `sequenced` int(4) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`deliver_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_par_com_deliver_type
-- ----------------------------
INSERT INTO `t_par_com_deliver_type` VALUES ('e4cc3992709b20cd061e221d6575d183', null, '走你交货', '2', 'enable', '超级管理员', '2015-01-08 11:16:56', '超级管理员', '2015-01-08 11:16:56');

-- ----------------------------
-- Table structure for `t_par_com_industry`
-- ----------------------------
DROP TABLE IF EXISTS `t_par_com_industry`;
CREATE TABLE `t_par_com_industry` (
  `industry_id` varchar(32) NOT NULL,
  `industry_name` varchar(32) default NULL,
  `industy_code` varchar(32) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`industry_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_par_com_industry
-- ----------------------------
INSERT INTO `t_par_com_industry` VALUES ('8f1eee160288d36fbbe9ebe385199904', '服装', null, 'enable', '', '超级管理员', '2015-01-08 13:49:29', '超级管理员', '2015-01-08 13:49:29');

-- ----------------------------
-- Table structure for `t_par_com_nature`
-- ----------------------------
DROP TABLE IF EXISTS `t_par_com_nature`;
CREATE TABLE `t_par_com_nature` (
  `nature_id` varchar(32) NOT NULL,
  `nature_name` varchar(32) default NULL,
  `nature_code` varchar(32) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`nature_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_par_com_nature
-- ----------------------------
INSERT INTO `t_par_com_nature` VALUES ('e4f769f7918f1f3b9007e0e12f015e73', '私营', '1', 'enable', null, '超级管理员', '2015-01-08 16:35:42', '超级管理员', '2015-01-08 16:35:42');

-- ----------------------------
-- Table structure for `t_par_com_payment_type`
-- ----------------------------
DROP TABLE IF EXISTS `t_par_com_payment_type`;
CREATE TABLE `t_par_com_payment_type` (
  `payment_type_id` varchar(32) NOT NULL,
  `code` varchar(32) default NULL,
  `payment_type_name` varchar(32) default NULL,
  `sequenced` int(4) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`payment_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_par_com_payment_type
-- ----------------------------
INSERT INTO `t_par_com_payment_type` VALUES ('a623c991ee3df66df30de79ce8745c33', null, '现金', '1', 'enable', '超级管理员', '2015-01-08 15:07:28', '超级管理员', '2015-01-08 15:07:28');

-- ----------------------------
-- Table structure for `t_par_finance_cost_type`
-- ----------------------------
DROP TABLE IF EXISTS `t_par_finance_cost_type`;
CREATE TABLE `t_par_finance_cost_type` (
  `cost_type_id` varchar(32) NOT NULL,
  `code` varchar(32) default NULL,
  `name` varchar(32) default NULL,
  `sequenced` int(4) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`cost_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_par_finance_cost_type
-- ----------------------------

-- ----------------------------
-- Table structure for `t_par_finance_payable_type`
-- ----------------------------
DROP TABLE IF EXISTS `t_par_finance_payable_type`;
CREATE TABLE `t_par_finance_payable_type` (
  `payable_type_id` varchar(32) NOT NULL,
  `code` varchar(32) default NULL,
  `name` varchar(32) default NULL,
  `sequenced` int(4) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`payable_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_par_finance_payable_type
-- ----------------------------

-- ----------------------------
-- Table structure for `t_par_finance_receivable_type`
-- ----------------------------
DROP TABLE IF EXISTS `t_par_finance_receivable_type`;
CREATE TABLE `t_par_finance_receivable_type` (
  `receivable_type_id` varchar(32) NOT NULL,
  `code` varchar(32) default NULL,
  `name` varchar(32) default NULL,
  `sequenced` int(4) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`receivable_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_par_finance_receivable_type
-- ----------------------------

-- ----------------------------
-- Table structure for `t_par_purchase_quoted_price_type`
-- ----------------------------
DROP TABLE IF EXISTS `t_par_purchase_quoted_price_type`;
CREATE TABLE `t_par_purchase_quoted_price_type` (
  `quoted_price_type_id` varchar(32) NOT NULL,
  `code` varchar(32) default NULL,
  `name` varchar(32) default NULL,
  `sequenced` int(4) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`quoted_price_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_par_purchase_quoted_price_type
-- ----------------------------
INSERT INTO `t_par_purchase_quoted_price_type` VALUES ('f10739fca5d57a4dc3229fafb8b9f398', null, '55', '5', 'enable', '超级管理员', '2015-01-09 10:08:52', '超级管理员', '2015-01-09 10:08:52');

-- ----------------------------
-- Table structure for `t_par_purchase_returned_type`
-- ----------------------------
DROP TABLE IF EXISTS `t_par_purchase_returned_type`;
CREATE TABLE `t_par_purchase_returned_type` (
  `returned_purchase_type_id` varchar(32) NOT NULL,
  `code` varchar(32) default NULL,
  `name` varchar(32) default NULL,
  `sequenced` int(4) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`returned_purchase_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_par_purchase_returned_type
-- ----------------------------

-- ----------------------------
-- Table structure for `t_par_purchase_return_reason`
-- ----------------------------
DROP TABLE IF EXISTS `t_par_purchase_return_reason`;
CREATE TABLE `t_par_purchase_return_reason` (
  `return_reason_id` varchar(32) NOT NULL,
  `code` varchar(32) default NULL,
  `name` varchar(32) default NULL,
  `sequenced` int(4) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`return_reason_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_par_purchase_return_reason
-- ----------------------------

-- ----------------------------
-- Table structure for `t_par_purchase_type`
-- ----------------------------
DROP TABLE IF EXISTS `t_par_purchase_type`;
CREATE TABLE `t_par_purchase_type` (
  `purchase_type_id` varchar(32) NOT NULL,
  `code` varchar(32) default NULL,
  `name` varchar(32) default NULL,
  `sequenced` int(4) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`purchase_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_par_purchase_type
-- ----------------------------

-- ----------------------------
-- Table structure for `t_par_sell_return_reason`
-- ----------------------------
DROP TABLE IF EXISTS `t_par_sell_return_reason`;
CREATE TABLE `t_par_sell_return_reason` (
  `return_reason_id` varchar(32) NOT NULL,
  `code` varchar(32) default NULL,
  `return_reason_name` varchar(32) default NULL,
  `sequenced` int(4) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`return_reason_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_par_sell_return_reason
-- ----------------------------

-- ----------------------------
-- Table structure for `t_par_sell_return_type`
-- ----------------------------
DROP TABLE IF EXISTS `t_par_sell_return_type`;
CREATE TABLE `t_par_sell_return_type` (
  `return_type_id` varchar(32) NOT NULL,
  `code` varchar(32) default NULL,
  `return_type_name` varchar(32) default NULL,
  `sequenced` int(4) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`return_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_par_sell_return_type
-- ----------------------------

-- ----------------------------
-- Table structure for `t_par_sell_type`
-- ----------------------------
DROP TABLE IF EXISTS `t_par_sell_type`;
CREATE TABLE `t_par_sell_type` (
  `sell_type_id` varchar(32) NOT NULL,
  `code` varchar(32) default NULL,
  `sell_type_name` varchar(32) default NULL,
  `sequenced` int(4) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`sell_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_par_sell_type
-- ----------------------------

-- ----------------------------
-- Table structure for `t_par_suppliers_grade`
-- ----------------------------
DROP TABLE IF EXISTS `t_par_suppliers_grade`;
CREATE TABLE `t_par_suppliers_grade` (
  `grade_id` varchar(32) NOT NULL,
  `grade_name` varchar(32) default NULL,
  `grade_code` varchar(32) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`grade_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_par_suppliers_grade
-- ----------------------------
INSERT INTO `t_par_suppliers_grade` VALUES ('3b9af2f164cc3616ee06d75b97ac254d', '第一等级', null, 'enable', '', '超级管理员', '2015-01-08 15:59:29', '超级管理员', '2015-01-08 15:59:29');

-- ----------------------------
-- Table structure for `t_par_suppliers_source`
-- ----------------------------
DROP TABLE IF EXISTS `t_par_suppliers_source`;
CREATE TABLE `t_par_suppliers_source` (
  `source_id` varchar(32) NOT NULL,
  `source_name` varchar(100) default NULL,
  `source_code` varchar(32) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`source_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_par_suppliers_source
-- ----------------------------

-- ----------------------------
-- Table structure for `t_par_suppliers_type`
-- ----------------------------
DROP TABLE IF EXISTS `t_par_suppliers_type`;
CREATE TABLE `t_par_suppliers_type` (
  `type_id` varchar(32) NOT NULL,
  `type_name` varchar(32) default NULL,
  `type_code` varchar(32) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_par_suppliers_type
-- ----------------------------

-- ----------------------------
-- Table structure for `t_par_war_deploy_type`
-- ----------------------------
DROP TABLE IF EXISTS `t_par_war_deploy_type`;
CREATE TABLE `t_par_war_deploy_type` (
  `deploy_type_id` varchar(32) NOT NULL COMMENT '�������ID',
  `order_num` int(4) default NULL,
  `deploy_type_state` enum('same','different') default NULL,
  `deploy_type_name` varchar(255) default NULL COMMENT '��ƷID',
  `enabled` enum('disable','enable') default NULL COMMENT '�Ƿ����� ö�٣�(����1/����0)',
  `creater` varchar(32) default NULL COMMENT 'ö�٣�(����1/����0)',
  `create_time` datetime default NULL COMMENT '¼��ʱ��',
  `updater` varchar(32) default NULL COMMENT '����޸���',
  `update_time` datetime default NULL COMMENT '����޸�ʱ��',
  PRIMARY KEY  (`deploy_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_par_war_deploy_type
-- ----------------------------

-- ----------------------------
-- Table structure for `t_par_war_in_type`
-- ----------------------------
DROP TABLE IF EXISTS `t_par_war_in_type`;
CREATE TABLE `t_par_war_in_type` (
  `in_type_id` varchar(32) NOT NULL COMMENT '�������ID',
  `order_num` int(4) default NULL,
  `in_type_name` varchar(255) default NULL COMMENT '��ƷID',
  `enabled` enum('disable','enable') default NULL COMMENT '�Ƿ����� ö�٣�(����1/����0)',
  `creater` varchar(32) default NULL COMMENT 'ö�٣�(����1/����0)',
  `create_time` datetime default NULL COMMENT '¼��ʱ��',
  `updater` varchar(32) default NULL COMMENT '����޸���',
  `update_time` datetime default NULL COMMENT '����޸�ʱ��',
  PRIMARY KEY  (`in_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_par_war_in_type
-- ----------------------------

-- ----------------------------
-- Table structure for `t_par_war_occupation_type`
-- ----------------------------
DROP TABLE IF EXISTS `t_par_war_occupation_type`;
CREATE TABLE `t_par_war_occupation_type` (
  `occupation_type_id` varchar(32) NOT NULL COMMENT '�������ID',
  `occupation_type_name` varchar(32) default NULL COMMENT '��ƷID',
  `order_num` int(4) default NULL COMMENT '���',
  `enabled` enum('enable','disable') default NULL COMMENT '�Ƿ����� ö�٣�(����1/����0)',
  `creater` varchar(32) default NULL COMMENT 'ö�٣�(����1/����0)',
  `create_time` datetime default NULL COMMENT '¼��ʱ��',
  `updater` varchar(32) default NULL COMMENT '����޸���',
  `update_time` datetime default NULL COMMENT '����޸�ʱ��',
  PRIMARY KEY  (`occupation_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_par_war_occupation_type
-- ----------------------------

-- ----------------------------
-- Table structure for `t_par_war_out_type`
-- ----------------------------
DROP TABLE IF EXISTS `t_par_war_out_type`;
CREATE TABLE `t_par_war_out_type` (
  `out_type_id` varchar(32) NOT NULL COMMENT '�������ID',
  `order_num` int(4) default NULL COMMENT '���',
  `out_type_name` varchar(100) default NULL COMMENT '��ƷID',
  `enabled` enum('enable','disable') default NULL COMMENT '�Ƿ����� ö�٣�(����1/����0)',
  `creater` varchar(32) default NULL COMMENT 'ö�٣�(����1/����0)',
  `create_time` datetime default NULL COMMENT '¼��ʱ��',
  `updater` varchar(32) default NULL COMMENT '����޸���',
  `update_time` datetime default NULL COMMENT '����޸�ʱ��',
  PRIMARY KEY  (`out_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_par_war_out_type
-- ----------------------------

-- ----------------------------
-- Table structure for `t_purchase_arrival`
-- ----------------------------
DROP TABLE IF EXISTS `t_purchase_arrival`;
CREATE TABLE `t_purchase_arrival` (
  `pur_arrival_id` varchar(32) NOT NULL,
  `purchase_type_id` varchar(32) default NULL,
  `arrival_code` varchar(50) default NULL,
  `arrival_date` datetime default NULL,
  `storage` varchar(32) default NULL,
  `supplier_id` varchar(32) default NULL,
  `contract_code` varchar(50) default NULL,
  `supplier_add` varchar(100) default NULL,
  `phone` varchar(15) default NULL,
  `linkman` varchar(32) default NULL,
  `fax` varchar(15) default NULL,
  `delivery_type` varchar(32) default NULL,
  `delivery_dead` datetime default NULL,
  `delivery_add` varchar(32) default NULL,
  `acceptor` varchar(32) default NULL,
  `invoice` enum('yes','no') default NULL,
  `invoice_type_id` enum('specialvat','generalvat','generaltax','ordinarytax','receipt') default NULL,
  `payment_type_id` varchar(32) default NULL,
  `log_settlement_id` enum('ourcommitment','notcommitment','generationpad','selfpay') default NULL,
  `log_code` varchar(50) default NULL,
  `log_total_tmount` decimal(16,4) default NULL,
  `log_company` varchar(32) default NULL,
  `log_linkman` varchar(32) default NULL,
  `log_phone` varchar(15) default NULL,
  `total_amount` decimal(16,4) default NULL,
  `payment_agr_id` varchar(32) default NULL,
  `accessory` varchar(255) default NULL,
  `return_state` enum('noneCancel','portionCancel','allCancel') default NULL,
  `not_return_amo` decimal(16,4) default NULL,
  `alr_return_amo` decimal(16,4) default NULL,
  `pay_state` enum('nonePay','portionPay','allPay') default NULL,
  `not_pay_amo` decimal(16,4) default NULL,
  `alr_pay_amo` decimal(16,4) default NULL,
  `inv_state` enum('noneInv','portionInv','allInv') default NULL,
  `not_inv_amo` decimal(16,4) default NULL,
  `alr_inv_amo` decimal(16,4) default NULL,
  `audit_state` enum('authstr','pass','failure') default NULL,
  `auditor` varchar(32) default NULL,
  `audit_date` datetime default NULL,
  `audit_remark` varchar(255) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `operators` varchar(32) default NULL,
  `operator_dep` varchar(32) default NULL,
  `confirmor` varchar(32) default NULL,
  `confirmor_department` varchar(32) default NULL,
  `confirmor_time` datetime default NULL,
  `derate_money` decimal(16,4) default NULL,
  `tail_after_status` enum('storage','nostorage') default NULL,
  `summary` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`pur_arrival_id`),
  KEY `FK_T_PURCHA_REFERENCE_T_PAR_PU5` (`purchase_type_id`),
  CONSTRAINT `t_purchase_arrival_ibfk_1` FOREIGN KEY (`purchase_type_id`) REFERENCES `t_par_purchase_type` (`purchase_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_purchase_arrival
-- ----------------------------

-- ----------------------------
-- Table structure for `t_purchase_arrival_affirm`
-- ----------------------------
DROP TABLE IF EXISTS `t_purchase_arrival_affirm`;
CREATE TABLE `t_purchase_arrival_affirm` (
  `pur_arr_aff_id` varchar(32) NOT NULL,
  `pur_arrival_id` varchar(32) default NULL,
  `sign_date` datetime default NULL,
  `sign_person` varchar(32) default NULL,
  `affirm_date` datetime default NULL,
  `affirm_person` varchar(32) default NULL,
  `affirm_dep` varchar(32) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  PRIMARY KEY  (`pur_arr_aff_id`),
  KEY `FK_T_PURCHA_PURCHASE__T_PURCHA6` (`pur_arrival_id`),
  CONSTRAINT `t_purchase_arrival_affirm_ibfk_1` FOREIGN KEY (`pur_arrival_id`) REFERENCES `t_purchase_arrival` (`pur_arrival_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_purchase_arrival_affirm
-- ----------------------------

-- ----------------------------
-- Table structure for `t_purchase_arrival_detail`
-- ----------------------------
DROP TABLE IF EXISTS `t_purchase_arrival_detail`;
CREATE TABLE `t_purchase_arrival_detail` (
  `pur_arrival_det_id` varchar(32) NOT NULL,
  `pur_arrival_id` varchar(32) default NULL,
  `goods_id` varchar(32) default NULL,
  `goods_code` varchar(50) default NULL,
  `goods_name` varchar(32) default NULL,
  `goods_model` varchar(32) default NULL,
  `goods_unit` varchar(32) default NULL,
  `quantity` int(4) default NULL,
  `price` decimal(16,4) default NULL,
  `goods_money` decimal(16,4) default NULL,
  `deadline` datetime default NULL,
  `not_return_num` int(4) default NULL,
  `alr_return_num` int(4) default NULL,
  `not_pay_num` int(4) default NULL,
  `alr_pay_num` int(4) default NULL,
  `not_inv_num` int(4) default NULL,
  `alr_inv_num` int(4) default NULL,
  `brand` varchar(32) default NULL,
  `place_of_origin` varchar(50) default NULL,
  `batch_information` varchar(32) default NULL,
  `arrival` int(4) default NULL,
  `delivery` int(4) default NULL,
  `rejection` int(4) default NULL,
  `original_cost` decimal(16,4) default NULL,
  `deposit_rate` decimal(16,4) default NULL,
  `putstorage` int(4) default NULL,
  `takestorage` int(4) default NULL,
  `remark` varchar(255) default NULL,
  PRIMARY KEY  (`pur_arrival_det_id`),
  KEY `FK_T_PURCHA_PURCHASE__T_PURCHA7` (`pur_arrival_id`),
  CONSTRAINT `t_purchase_arrival_detail_ibfk_1` FOREIGN KEY (`pur_arrival_id`) REFERENCES `t_purchase_arrival` (`pur_arrival_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_purchase_arrival_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `t_purchase_invoice`
-- ----------------------------
DROP TABLE IF EXISTS `t_purchase_invoice`;
CREATE TABLE `t_purchase_invoice` (
  `pur_inv_id` varchar(32) NOT NULL,
  `invoice_code` varchar(50) default NULL,
  `payable_id` varchar(32) default NULL,
  `invoice_date` datetime default NULL,
  `invoice_type_id` varchar(32) default NULL,
  `invoice_start` varchar(32) default NULL,
  `tariff` varchar(50) default NULL,
  `supplier_id` varchar(32) default NULL,
  `linkman` varchar(32) default NULL,
  `telephone` varchar(32) default NULL,
  `bank_of_deposit` varchar(32) default NULL,
  `account_number` int(19) default NULL,
  `period_of_validity` datetime default NULL,
  `invoice_amount` decimal(16,4) default NULL,
  `backwash_state` enum('backwash1','backwash0') default NULL,
  `audit_state` enum('authstr','pass','failure') default NULL,
  `auditor` varchar(32) default NULL,
  `audit_date` datetime default NULL,
  `audit_remark` varchar(255) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `operators` varchar(32) default NULL,
  `operator_dep` varchar(32) default NULL,
  `summary` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`pur_inv_id`),
  KEY `FK_T_PURCHA_FINANCE_P_T_FINANC8` (`payable_id`),
  CONSTRAINT `t_purchase_invoice_ibfk_1` FOREIGN KEY (`payable_id`) REFERENCES `t_finance_payable` (`payable_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_purchase_invoice
-- ----------------------------

-- ----------------------------
-- Table structure for `t_purchase_invoice_detail`
-- ----------------------------
DROP TABLE IF EXISTS `t_purchase_invoice_detail`;
CREATE TABLE `t_purchase_invoice_detail` (
  `pur_inv_det_id` varchar(32) NOT NULL,
  `pur_inv_id` varchar(32) default NULL,
  `good_id` varchar(32) default NULL,
  `goods_code` varchar(50) default NULL,
  `goods_name` varchar(32) default NULL,
  `goods_model` varchar(32) default NULL,
  `goods_unit` varchar(32) default NULL,
  `quantity` int(4) default NULL,
  `price` decimal(16,4) default NULL,
  `money` decimal(16,4) default NULL,
  `cess` decimal(16,4) default NULL,
  `no_tax_price` decimal(16,4) default NULL,
  `no_tax_amount` decimal(16,4) default NULL,
  `not_back_num` int(4) default NULL,
  `alr_back_num` int(4) default NULL,
  `remark` varchar(255) default NULL,
  PRIMARY KEY  (`pur_inv_det_id`),
  KEY `FK_T_PURCHA_PURCHASE__T_PURCHA9` (`pur_inv_id`),
  CONSTRAINT `t_purchase_invoice_detail_ibfk_1` FOREIGN KEY (`pur_inv_id`) REFERENCES `t_purchase_invoice` (`pur_inv_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_purchase_invoice_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `t_purchase_order`
-- ----------------------------
DROP TABLE IF EXISTS `t_purchase_order`;
CREATE TABLE `t_purchase_order` (
  `pur_order_id` varchar(32) NOT NULL,
  `order_code` varchar(50) default NULL,
  `order_date` datetime default NULL,
  `purchase_type_id` varchar(32) default NULL,
  `storage` varchar(32) default NULL,
  `supplier_id` varchar(32) default NULL,
  `supplier_code` varchar(32) default NULL,
  `contract_code` varchar(50) default NULL,
  `supplier_add` varchar(100) default NULL,
  `phone` varchar(15) default NULL,
  `linkman` varchar(32) default NULL,
  `fax` varchar(19) default NULL,
  `delivery_type` varchar(32) default NULL,
  `delivery_dadlines` datetime default NULL,
  `delivery_add` varchar(100) default NULL,
  `contract_terms` text,
  `payment_type_id` varchar(32) default NULL,
  `invoice` enum('yes','no') default NULL,
  `invoice_type_id` enum('specialvat','generalvat','generaltax','ordinarytax','receipt') default NULL,
  `total_amount` decimal(16,4) default NULL,
  `payment_agr_id` varchar(32) default NULL,
  `accessory` varchar(255) default NULL,
  `shared_people_id` varchar(32) default NULL,
  `arr_state` enum('noneArr','portionArr','allArr') default NULL,
  `not_arr_amo` decimal(16,4) default NULL,
  `alr_arr_amo` decimal(16,4) default NULL,
  `pay_state` enum('nonePay','portionPay','allPay') default NULL,
  `not_pay_amo` decimal(16,4) default NULL,
  `alr_pay_amo` decimal(16,4) default NULL,
  `inv_state` enum('noneInv','portionInv','allInv') default NULL,
  `not_inv_amo` decimal(16,4) default NULL,
  `alr_inv_amo` decimal(16,4) default NULL,
  `order_state` enum('noneExe','exeIng','termination','closed','affirm') default NULL,
  `audit_state` enum('authstr','pass','failure') default NULL,
  `auditor` varchar(32) default NULL,
  `audit_date` datetime default NULL,
  `audit_remark` varchar(255) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `operators` varchar(32) default NULL,
  `operator_dep` varchar(32) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`pur_order_id`),
  KEY `FK_T_PURCHA_PURCHASE__T_PAR_PU10` (`purchase_type_id`),
  CONSTRAINT `t_purchase_order_ibfk_1` FOREIGN KEY (`purchase_type_id`) REFERENCES `t_par_purchase_type` (`purchase_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_purchase_order
-- ----------------------------

-- ----------------------------
-- Table structure for `t_purchase_order_closed`
-- ----------------------------
DROP TABLE IF EXISTS `t_purchase_order_closed`;
CREATE TABLE `t_purchase_order_closed` (
  `pur_order_col_id` varchar(32) NOT NULL,
  `pur_order_id` varchar(32) default NULL,
  `order_clo_code` varchar(50) default NULL,
  `content` varchar(255) default NULL,
  `operator_dep` varchar(32) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  PRIMARY KEY  (`pur_order_col_id`),
  KEY `FK_T_PURCHA_PURCHASE__T_PURCHA11` (`pur_order_id`),
  CONSTRAINT `t_purchase_order_closed_ibfk_1` FOREIGN KEY (`pur_order_id`) REFERENCES `t_purchase_order` (`pur_order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_purchase_order_closed
-- ----------------------------

-- ----------------------------
-- Table structure for `t_purchase_order_detail`
-- ----------------------------
DROP TABLE IF EXISTS `t_purchase_order_detail`;
CREATE TABLE `t_purchase_order_detail` (
  `pur_order_det_id` varchar(32) NOT NULL,
  `pur_order_id` varchar(32) default NULL,
  `goods_id` varchar(32) default NULL,
  `goods_code` varchar(50) default NULL,
  `goods_name` varchar(32) default NULL,
  `goods_model` varchar(32) default NULL,
  `goods_unit` varchar(32) default NULL,
  `quantity` int(4) default NULL,
  `price` decimal(16,4) default NULL,
  `money` decimal(16,4) default NULL,
  `deadline` datetime default NULL,
  `not_arr_num` int(4) default NULL,
  `alr_arr_num` int(4) default NULL,
  `not_pay_num` int(4) default NULL,
  `alr_pay_num` int(4) default NULL,
  `not_inv_num` int(4) default NULL,
  `alr_inv_num` int(4) default NULL,
  `not_ter_num` int(4) default NULL,
  `alr_ter_num` int(4) default NULL,
  `brand` varchar(32) default NULL,
  `place_of_origin` varchar(32) default NULL,
  `prime_cost` decimal(16,4) default NULL,
  `discount` decimal(16,4) default NULL,
  `cess` decimal(16,4) default NULL,
  `not_ter_money` decimal(16,4) default NULL,
  `alr_ter_money` decimal(16,4) default NULL,
  `remark` varchar(255) default NULL,
  PRIMARY KEY  (`pur_order_det_id`),
  KEY `FK_T_PURCHA_PURCHASE__T_PURCHA12` (`pur_order_id`),
  CONSTRAINT `t_purchase_order_detail_ibfk_1` FOREIGN KEY (`pur_order_id`) REFERENCES `t_purchase_order` (`pur_order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_purchase_order_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `t_purchase_order_termination`
-- ----------------------------
DROP TABLE IF EXISTS `t_purchase_order_termination`;
CREATE TABLE `t_purchase_order_termination` (
  `pur_order_ter_id` varchar(32) NOT NULL,
  `pur_order_id` varchar(32) default NULL,
  `termination_code` varchar(50) default NULL,
  `content` varchar(255) default NULL,
  `accessory` varchar(225) default NULL,
  `amount` decimal(16,4) default NULL,
  `operator_dep` varchar(32) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `remark` varchar(255) default NULL,
  PRIMARY KEY  (`pur_order_ter_id`),
  KEY `FK_T_PURCHA_PURCHASE__T_PURCHA13` (`pur_order_id`),
  CONSTRAINT `t_purchase_order_termination_ibfk_1` FOREIGN KEY (`pur_order_id`) REFERENCES `t_purchase_order` (`pur_order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_purchase_order_termination
-- ----------------------------

-- ----------------------------
-- Table structure for `t_purchase_order_track`
-- ----------------------------
DROP TABLE IF EXISTS `t_purchase_order_track`;
CREATE TABLE `t_purchase_order_track` (
  `pur_order_tra_id` varchar(32) NOT NULL,
  `pur_order_id` varchar(32) default NULL,
  `order_track_code` varchar(50) default NULL,
  `track_theme` varchar(50) default NULL,
  `supplier_id` varchar(32) default NULL,
  `track_content` varchar(255) default NULL,
  `linkman` varchar(32) default NULL,
  `phone` varchar(15) default NULL,
  `accessory` varchar(225) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`pur_order_tra_id`),
  KEY `FK_T_PURCHA_PURCHASE__T_PURCHA14` (`pur_order_id`),
  CONSTRAINT `t_purchase_order_track_ibfk_1` FOREIGN KEY (`pur_order_id`) REFERENCES `t_purchase_order` (`pur_order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_purchase_order_track
-- ----------------------------

-- ----------------------------
-- Table structure for `t_purchase_requisition`
-- ----------------------------
DROP TABLE IF EXISTS `t_purchase_requisition`;
CREATE TABLE `t_purchase_requisition` (
  `pur_req_id` varchar(32) NOT NULL,
  `req_code` varchar(50) default NULL,
  `req_date` datetime default NULL,
  `purchase_type_id` varchar(32) default NULL,
  `storage` varchar(32) default NULL,
  `accessory` varchar(255) default NULL,
  `order_state` enum('noneOrder','portionOrder','allOrder') default NULL,
  `audit_state` enum('authstr','pass','failure') default NULL,
  `auditor` varchar(32) default NULL,
  `audit_date` datetime default NULL,
  `audit_remark` varchar(255) default NULL,
  `enabled` varchar(100) default NULL,
  `operators` varchar(32) default NULL,
  `operator_dep` varchar(32) default NULL,
  `total` decimal(16,4) default NULL,
  `summary` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`pur_req_id`),
  KEY `FK_T_PURCHA_PURCHASE__T_PAR_PU15` (`purchase_type_id`),
  CONSTRAINT `t_purchase_requisition_ibfk_1` FOREIGN KEY (`purchase_type_id`) REFERENCES `t_par_purchase_type` (`purchase_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_purchase_requisition
-- ----------------------------

-- ----------------------------
-- Table structure for `t_purchase_requisition_detail`
-- ----------------------------
DROP TABLE IF EXISTS `t_purchase_requisition_detail`;
CREATE TABLE `t_purchase_requisition_detail` (
  `pur_req_det_id` varchar(32) NOT NULL,
  `pur_req_id` varchar(32) default NULL,
  `goods_id` varchar(32) default NULL,
  `goods_code` varchar(50) default NULL,
  `goods_name` varchar(32) default NULL,
  `goods_model` varchar(32) default NULL,
  `goods_unit` varchar(32) default NULL,
  `brand` varchar(32) default NULL,
  `place_of_origin` varchar(32) default NULL,
  `inquiry` enum('yes','no') default NULL,
  `quantity` int(4) default NULL,
  `price` decimal(16,4) default NULL,
  `money` decimal(16,4) default NULL,
  `deadline` datetime default NULL,
  `not_order_num` int(4) default NULL,
  `alr_order_num` int(4) default NULL,
  `remark` varchar(255) default NULL,
  PRIMARY KEY  (`pur_req_det_id`),
  KEY `FK_T_PURCHA_PURCHASE__T_PURCHA16` (`pur_req_id`),
  CONSTRAINT `t_purchase_requisition_detail_ibfk_1` FOREIGN KEY (`pur_req_id`) REFERENCES `t_purchase_requisition` (`pur_req_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_purchase_requisition_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `t_purchase_return`
-- ----------------------------
DROP TABLE IF EXISTS `t_purchase_return`;
CREATE TABLE `t_purchase_return` (
  `pur_return_id` varchar(32) NOT NULL,
  `return_code` varchar(50) default NULL,
  `return_date` datetime default NULL,
  `purchase_type` varchar(32) default NULL,
  `storage` varchar(32) default NULL,
  `supplier_id` varchar(32) default NULL,
  `pro_came` varchar(32) default NULL,
  `supplier_add` varchar(100) default NULL,
  `phone` varchar(15) default NULL,
  `linkman` varchar(32) default NULL,
  `fax` varchar(19) default NULL,
  `returned_purchase_type_id` varchar(32) default NULL,
  `return_deadlines` datetime default NULL,
  `return_reason_id` varchar(32) default NULL,
  `return_policy` varchar(50) default NULL,
  `refund_deadlines` datetime default NULL,
  `payment_type_id` varchar(32) default NULL,
  `log_settlement` enum('ourcommitment','notcommitment','generationpad','selfpay') default NULL,
  `log_code` varchar(50) default NULL,
  `log_total_amount` decimal(16,4) default NULL,
  `log_company` varchar(32) default NULL,
  `log_linkman` varchar(32) default NULL,
  `log_phone` varchar(15) default NULL,
  `accessory` varchar(255) default NULL,
  `payment_state` enum('nonePay','portionPay','allPay') default NULL,
  `not_pay_amo` decimal(16,4) default NULL,
  `alr_pay_amo` decimal(16,4) default NULL,
  `inv_state` enum('noneInv','portionInv','allInv') default NULL,
  `not_inv_amo` decimal(16,4) default NULL,
  `alr_inv_amo` decimal(16,4) default NULL,
  `refund_total` decimal(16,4) default NULL,
  `audit_state` enum('authstr','pass','failure') default NULL,
  `auditor` varchar(32) default NULL,
  `audit_date` datetime default NULL,
  `audit_remark` varchar(255) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `operators` varchar(32) default NULL,
  `operator_dep` varchar(32) default NULL,
  `summary` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`pur_return_id`),
  KEY `FK_T_PURCHA_PURCHASE__T_PAR_RE17` (`return_reason_id`),
  KEY `FK_T_PURCHA_RETURNED__T_PAR_RE18` (`returned_purchase_type_id`),
  CONSTRAINT `t_purchase_return_ibfk_1` FOREIGN KEY (`returned_purchase_type_id`) REFERENCES `t_par_purchase_returned_type` (`returned_purchase_type_id`),
  CONSTRAINT `t_purchase_return_ibfk_2` FOREIGN KEY (`return_reason_id`) REFERENCES `t_par_purchase_return_reason` (`return_reason_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_purchase_return
-- ----------------------------

-- ----------------------------
-- Table structure for `t_purchase_return_detail`
-- ----------------------------
DROP TABLE IF EXISTS `t_purchase_return_detail`;
CREATE TABLE `t_purchase_return_detail` (
  `pur_return_det_id` varchar(32) NOT NULL,
  `pur_return_id` varchar(32) default NULL,
  `goods_id` varchar(32) default NULL,
  `goods_code` varchar(50) default NULL,
  `goods_name` varchar(32) default NULL,
  `goods_model` varchar(32) default NULL,
  `goods_unit` varchar(32) default NULL,
  `quantity` int(4) default NULL,
  `price` decimal(16,4) default NULL,
  `money` decimal(16,4) default NULL,
  `deadline` datetime default NULL,
  `not_pay_num` int(4) default NULL,
  `alr_pay_num` int(4) default NULL,
  `not_inv_num` int(4) default NULL,
  `alr_inv_num` int(4) default NULL,
  `brand` varchar(32) default NULL,
  `place_of_origin` varchar(32) default NULL,
  `batch_information` varchar(32) default NULL,
  `pur_money` decimal(16,4) default NULL,
  `cess` decimal(16,4) default NULL,
  `remark` varchar(255) default NULL,
  PRIMARY KEY  (`pur_return_det_id`),
  KEY `FK_T_PURCHA_PURCHASE__T_PURCHA19` (`pur_return_id`),
  CONSTRAINT `t_purchase_return_detail_ibfk_1` FOREIGN KEY (`pur_return_id`) REFERENCES `t_purchase_return` (`pur_return_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_purchase_return_detail
-- ----------------------------

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
-- Table structure for `t_same_deploy`
-- ----------------------------
DROP TABLE IF EXISTS `t_same_deploy`;
CREATE TABLE `t_same_deploy` (
  `same_deploy_id` varchar(32) NOT NULL,
  `same_deploy_code` varchar(32) default NULL,
  `warehouse_in_id` varchar(32) default NULL,
  `warehouse_out_id` varchar(32) default NULL,
  `same_deploy_date` datetime default NULL,
  `deploy_type_id` varchar(32) default NULL,
  `same_total` decimal(16,4) default NULL,
  `department_id` varchar(32) default NULL,
  `arrival_time` datetime default NULL,
  `attn` varchar(32) default NULL,
  `department` varchar(32) default NULL,
  `auditor_id` varchar(32) default NULL,
  `audit_date` datetime default NULL,
  `audit_state` enum('authstr','failure','pass') default NULL,
  `audit_remark` varchar(255) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`same_deploy_id`),
  KEY `FK_DeployType_SameDeploy_deployTypeId` (`deploy_type_id`),
  CONSTRAINT `t_same_deploy_ibfk_1` FOREIGN KEY (`deploy_type_id`) REFERENCES `t_par_war_deploy_type` (`deploy_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_same_deploy
-- ----------------------------

-- ----------------------------
-- Table structure for `t_same_detail`
-- ----------------------------
DROP TABLE IF EXISTS `t_same_detail`;
CREATE TABLE `t_same_detail` (
  `same_detai_id` varchar(32) NOT NULL,
  `same_deploy_id` varchar(32) default NULL,
  `goods_id` varchar(32) default NULL,
  `goods_code` varchar(225) default NULL,
  `goods_name` varchar(255) default NULL,
  `goods_batch` varchar(255) default NULL,
  `goods_style` varchar(255) default NULL,
  `goods_unit` varchar(32) default NULL,
  `allot_number` int(4) default NULL,
  `allot_price` decimal(16,4) default NULL,
  `total_money` decimal(16,4) default NULL,
  `remark` varchar(225) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`same_detai_id`),
  KEY `FK_SameDeploy_SameDetail_SameDeployId` (`same_deploy_id`),
  CONSTRAINT `t_same_detail_ibfk_1` FOREIGN KEY (`same_deploy_id`) REFERENCES `t_same_deploy` (`same_deploy_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_same_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `t_sell_confirmationreceipt`
-- ----------------------------
DROP TABLE IF EXISTS `t_sell_confirmationreceipt`;
CREATE TABLE `t_sell_confirmationreceipt` (
  `confirmation_receipt_id` varchar(32) NOT NULL,
  `send_id` varchar(32) default NULL,
  `client_contact_id` varchar(32) default NULL,
  `confirmation_date` datetime default NULL,
  `sign_date` datetime default NULL,
  `confirmation_person` varchar(32) default NULL,
  `confirm_department` varchar(32) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  PRIMARY KEY  (`confirmation_receipt_id`),
  KEY `FK_T_SELL_C_T_SELL_SE_T_SELL_S` (`send_id`),
  CONSTRAINT `t_sell_confirmationreceipt_ibfk_1` FOREIGN KEY (`send_id`) REFERENCES `t_sell_send` (`send_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sell_confirmationreceipt
-- ----------------------------

-- ----------------------------
-- Table structure for `t_sell_giveaway_samples`
-- ----------------------------
DROP TABLE IF EXISTS `t_sell_giveaway_samples`;
CREATE TABLE `t_sell_giveaway_samples` (
  `giveaway_samples_id` varchar(32) NOT NULL,
  `giveaway_samples_code` varchar(50) default NULL,
  `give_date` datetime default NULL,
  `type` varchar(32) default NULL,
  `warehouse_id` varchar(32) default NULL,
  `client_id` varchar(32) default NULL,
  `client_contact_id` varchar(32) default NULL,
  `phone` varchar(15) default NULL,
  `client_address` varchar(255) default NULL,
  `delivery_deadlines` date default NULL,
  `contract_number` varchar(50) default NULL,
  `accessory` varchar(255) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `summary` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  `audit_state` enum('authstr','pass','failure') default NULL,
  `auditor` varchar(32) default NULL,
  `audit_date` datetime default NULL,
  `audit_remark` varchar(255) default NULL,
  `handle_person` varchar(32) default NULL,
  `handle_department` varchar(32) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  PRIMARY KEY  (`giveaway_samples_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sell_giveaway_samples
-- ----------------------------

-- ----------------------------
-- Table structure for `t_sell_giveaway_samples_detail`
-- ----------------------------
DROP TABLE IF EXISTS `t_sell_giveaway_samples_detail`;
CREATE TABLE `t_sell_giveaway_samples_detail` (
  `giveaway_samples_detail_id` varchar(32) NOT NULL,
  `giveaway_samples_id` varchar(32) default NULL,
  `goods_id` varchar(32) default NULL,
  `batch_id` varchar(32) default NULL,
  `quantity` int(4) default NULL,
  `remark` varchar(255) default NULL,
  PRIMARY KEY  (`giveaway_samples_detail_id`),
  KEY `FK_T_SELL_G_T_SELL_GI_T_SELL_G` (`giveaway_samples_id`),
  CONSTRAINT `t_sell_giveaway_samples_detail_ibfk_1` FOREIGN KEY (`giveaway_samples_id`) REFERENCES `t_sell_giveaway_samples` (`giveaway_samples_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sell_giveaway_samples_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `t_sell_invoice`
-- ----------------------------
DROP TABLE IF EXISTS `t_sell_invoice`;
CREATE TABLE `t_sell_invoice` (
  `invoice_id` varchar(32) NOT NULL,
  `invoice_code` varchar(50) default NULL,
  `receivale_id` varchar(32) default NULL,
  `client_id` varchar(32) default NULL,
  `client_contact_id` varchar(32) default NULL,
  `phone` varchar(15) default NULL,
  `client_address` varchar(255) default NULL,
  `invoice_account` varchar(32) default NULL,
  `invoice_number` varchar(20) default NULL,
  `invoice_date` datetime default NULL,
  `invoice_type_id` enum('specialvat','generalvat','generaltax','ordinarytax','receipt') default NULL,
  `Invoice_start` varchar(50) default NULL,
  `tariff` varchar(50) default NULL,
  `unbilled_amount` decimal(16,4) default NULL,
  `invoice_amount` decimal(16,4) default NULL,
  `deduction_date` decimal(16,4) default NULL,
  `ticket_date` decimal(16,4) default NULL,
  `invoice_collector` varchar(32) default NULL,
  `backwash_state` enum('backwash0','backwash1') default NULL,
  `enabled` enum('enable','disable') default NULL,
  `summary` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  `audit_state` enum('authstr','pass','failure') default NULL,
  `auditor` varchar(32) default NULL,
  `audit_date` datetime default NULL,
  `audit_remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`invoice_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sell_invoice
-- ----------------------------

-- ----------------------------
-- Table structure for `t_sell_invoice_detail`
-- ----------------------------
DROP TABLE IF EXISTS `t_sell_invoice_detail`;
CREATE TABLE `t_sell_invoice_detail` (
  `invoice_detail_id` varchar(32) NOT NULL,
  `invoice_id` varchar(32) default NULL,
  `goods_id` varchar(32) default NULL,
  `quantity` int(4) default NULL,
  `price` decimal(16,4) default NULL,
  `goods_cess` decimal(16,4) default NULL,
  `notax_price` decimal(16,4) default NULL,
  `notax_money` decimal(16,4) default NULL,
  `tax` decimal(16,4) default NULL,
  `money` decimal(16,4) default NULL,
  `not_back_num` int(4) default NULL,
  `alr_back_num` int(4) default NULL,
  `remark` varchar(255) default NULL,
  PRIMARY KEY  (`invoice_detail_id`),
  KEY `FK_T_SELL_I_T_SELL_IN_T_SELL_I` (`invoice_id`),
  CONSTRAINT `t_sell_invoice_detail_ibfk_1` FOREIGN KEY (`invoice_id`) REFERENCES `t_sell_invoice` (`invoice_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sell_invoice_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `t_sell_order_contract`
-- ----------------------------
DROP TABLE IF EXISTS `t_sell_order_contract`;
CREATE TABLE `t_sell_order_contract` (
  `order_contract_id` varchar(32) NOT NULL,
  `order_contract_code` varchar(50) default NULL,
  `requisition_date` datetime default NULL,
  `sell_type_id` varchar(32) default NULL,
  `client_id` varchar(32) default NULL,
  `client_contact_id` varchar(32) default NULL,
  `client_fax` varchar(32) default NULL,
  `client_phone` varchar(15) default NULL,
  `contract_number` varchar(50) default NULL,
  `deliver_type_id` varchar(32) default NULL,
  `policy` varchar(32) default NULL,
  `delivery_deadlines` datetime default NULL,
  `contract_terms` varchar(255) default NULL,
  `invoice` enum('yes','no') default NULL,
  `invoice_type` enum('specialvat','generalvat','generaltax','ordinarytax','receipt') default NULL,
  `invoice_start` varchar(50) default NULL,
  `payment_type_id` varchar(32) default NULL,
  `freight_balance` enum('ourcommitment','notcommitment','generationpad','selfpay') default NULL,
  `freight_total` decimal(16,4) default NULL,
  `payment_agr_id` varchar(32) default NULL,
  `total_amount` decimal(16,4) default NULL,
  `send_state` enum('noneSendr','portionSend','allSendr') default NULL,
  `not_send_amo` decimal(16,4) default NULL,
  `alr_send_amo` decimal(16,4) default NULL,
  `receipt_state` enum('noneReceipt','portionReceipt','allReceipt') default NULL,
  `goods_state` enum('noneExe','transit','termination','affirm') default NULL,
  `not_receipt_amo` decimal(16,4) default NULL,
  `alr_receipt_amo` decimal(16,4) default NULL,
  `inv_state` enum('noneInv','portionInv','allInv') default NULL,
  `not_inv_amo` decimal(16,4) default NULL,
  `alr_inv_amo` decimal(16,4) default NULL,
  `not_return_amo` decimal(16,4) default NULL,
  `alr_return_amo` decimal(16,4) default NULL,
  `order_contract_state` enum('noneExe','exeIng','termination','closed','affirm') default NULL,
  `staff_id` varchar(32) default NULL,
  `accessory` varchar(255) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `department_id` varchar(32) default NULL,
  `exemption_amount` decimal(16,4) default NULL,
  `remark` varchar(255) default NULL,
  `audit_state` enum('authstr','pass','failure') default NULL,
  `auditor` varchar(32) default NULL,
  `audit_date` datetime default NULL,
  `audit_remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`order_contract_id`),
  KEY `FK_T_SELL_O_T_PAR_DEL_T_PAR_DE` (`deliver_type_id`),
  CONSTRAINT `t_sell_order_contract_ibfk_1` FOREIGN KEY (`deliver_type_id`) REFERENCES `t_par_com_deliver_type` (`deliver_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sell_order_contract
-- ----------------------------

-- ----------------------------
-- Table structure for `t_sell_order_contract_closed`
-- ----------------------------
DROP TABLE IF EXISTS `t_sell_order_contract_closed`;
CREATE TABLE `t_sell_order_contract_closed` (
  `order_con_col_id` varchar(32) NOT NULL,
  `order_contract_id` varchar(32) default NULL,
  `order_con_clo_code` varchar(50) default NULL,
  `termination_date` datetime default NULL,
  `content` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  PRIMARY KEY  (`order_con_col_id`),
  KEY `FK_T_SELL_O_T_SELL_OR_T_SELL_O1` (`order_contract_id`),
  CONSTRAINT `t_sell_order_contract_closed_ibfk_1` FOREIGN KEY (`order_contract_id`) REFERENCES `t_sell_order_contract` (`order_contract_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sell_order_contract_closed
-- ----------------------------

-- ----------------------------
-- Table structure for `t_sell_order_contract_detail`
-- ----------------------------
DROP TABLE IF EXISTS `t_sell_order_contract_detail`;
CREATE TABLE `t_sell_order_contract_detail` (
  `order_contract_detail_id` varchar(32) NOT NULL,
  `order_contract_id` varchar(32) default NULL,
  `goods_id` varchar(32) default NULL,
  `brand` varchar(32) default NULL,
  `place_of_origin` varchar(32) default NULL,
  `cess` decimal(16,4) default NULL,
  `quantity` int(4) default NULL,
  `price` decimal(16,4) default NULL,
  `discount_rate` decimal(16,4) default NULL,
  `money` decimal(16,4) default NULL,
  `delivery_deadlines` datetime default NULL,
  `not_send_num` int(4) default NULL,
  `alr_send_num` int(4) default NULL,
  `not_receipt_num` int(4) default NULL,
  `alr_receipt_num` int(4) default NULL,
  `not_inv_num` int(4) default NULL,
  `alr_inv_num` int(4) default NULL,
  `not_ter_num` int(4) default NULL,
  `alr_ter_num` int(4) default NULL,
  `remark` varchar(255) default NULL,
  PRIMARY KEY  (`order_contract_detail_id`),
  KEY `FK_T_SELL_O_T_SELL_OR_T_SELL_O2` (`order_contract_id`),
  CONSTRAINT `t_sell_order_contract_detail_ibfk_1` FOREIGN KEY (`order_contract_id`) REFERENCES `t_sell_order_contract` (`order_contract_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sell_order_contract_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `t_sell_order_contract_termination`
-- ----------------------------
DROP TABLE IF EXISTS `t_sell_order_contract_termination`;
CREATE TABLE `t_sell_order_contract_termination` (
  `order_con_ter_id` varchar(32) NOT NULL,
  `order_contract_id` varchar(32) default NULL,
  `termination_code` varchar(32) default NULL,
  `end_monney` decimal(16,4) default NULL,
  `termination_date` datetime default NULL,
  `termination_content` varchar(255) default NULL,
  `termination_person` varchar(32) default NULL,
  `end_department` varchar(32) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  PRIMARY KEY  (`order_con_ter_id`),
  KEY `FK_T_SELL_O_T_SELL_OR_T_SELL_O3` (`order_contract_id`),
  CONSTRAINT `t_sell_order_contract_termination_ibfk_1` FOREIGN KEY (`order_contract_id`) REFERENCES `t_sell_order_contract` (`order_contract_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sell_order_contract_termination
-- ----------------------------

-- ----------------------------
-- Table structure for `t_sell_order_contract_track`
-- ----------------------------
DROP TABLE IF EXISTS `t_sell_order_contract_track`;
CREATE TABLE `t_sell_order_contract_track` (
  `order_con_tra_id` varchar(32) NOT NULL,
  `order_contract_id` varchar(32) default NULL,
  `order_track_code` varchar(50) default NULL,
  `track_theme` varchar(50) default NULL,
  `track_content` varchar(255) default NULL,
  `accessory` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`order_con_tra_id`),
  KEY `FK_T_SELL_O_T_SELL_OR_T_SELL_O4` (`order_contract_id`),
  CONSTRAINT `t_sell_order_contract_track_ibfk_1` FOREIGN KEY (`order_contract_id`) REFERENCES `t_sell_order_contract` (`order_contract_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sell_order_contract_track
-- ----------------------------

-- ----------------------------
-- Table structure for `t_sell_payment_agreement`
-- ----------------------------
DROP TABLE IF EXISTS `t_sell_payment_agreement`;
CREATE TABLE `t_sell_payment_agreement` (
  `payment_agr_id` varchar(32) NOT NULL,
  `order_contract_id` varchar(32) default NULL,
  `send_id` varchar(32) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`payment_agr_id`),
  KEY `FK_T_SELL_P_T_SELL_OR_T_SELL_O` (`order_contract_id`),
  KEY `FK_T_SELL_P_T_SELL_SE_T_SELL_S` (`send_id`),
  CONSTRAINT `t_sell_payment_agreement_ibfk_1` FOREIGN KEY (`send_id`) REFERENCES `t_sell_send` (`send_id`),
  CONSTRAINT `t_sell_payment_agreement_ibfk_2` FOREIGN KEY (`order_contract_id`) REFERENCES `t_sell_order_contract` (`order_contract_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sell_payment_agreement
-- ----------------------------

-- ----------------------------
-- Table structure for `t_sell_payment_items`
-- ----------------------------
DROP TABLE IF EXISTS `t_sell_payment_items`;
CREATE TABLE `t_sell_payment_items` (
  `payment_items_id` varchar(32) NOT NULL,
  `payment_agr_id` varchar(32) default NULL,
  `percentage` decimal(16,4) default NULL,
  `payment` decimal(16,4) default NULL,
  `payment_deadlines` datetime default NULL,
  `explanation` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`payment_items_id`),
  KEY `FK_T_SELL_P_T_SELL_PA_T_SELL_P` (`payment_agr_id`),
  CONSTRAINT `t_sell_payment_items_ibfk_1` FOREIGN KEY (`payment_agr_id`) REFERENCES `t_sell_payment_agreement` (`payment_agr_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sell_payment_items
-- ----------------------------

-- ----------------------------
-- Table structure for `t_sell_return`
-- ----------------------------
DROP TABLE IF EXISTS `t_sell_return`;
CREATE TABLE `t_sell_return` (
  `return_id` varchar(32) NOT NULL,
  `return_code` varchar(50) default NULL,
  `send_id` varchar(32) default NULL,
  `return_date` datetime default NULL,
  `sell_type_id` varchar(32) default NULL,
  `warehouse_id` varchar(32) default NULL,
  `client_id` varchar(32) default NULL,
  `client_contact_id` varchar(32) default NULL,
  `phone` varchar(15) default NULL,
  `client_fax` varchar(32) default NULL,
  `return_type_id` varchar(32) default NULL,
  `return_reason` varchar(32) default NULL,
  `return_explanation` varchar(255) default NULL,
  `supplier_id` varchar(32) default NULL,
  `supplier_verifier` varchar(32) default NULL,
  `supplier_phone` varchar(15) default NULL,
  `invoice` enum('yes','no') default NULL,
  `mitigate` decimal(16,4) default NULL,
  `payment_type_id` varchar(32) default NULL,
  `refund_deadline` datetime default NULL,
  `freight_balance` enum('ourcommitment','notcommitment','generationpad','selfpay') default NULL,
  `freight_code` varchar(32) default NULL,
  `freight_total` decimal(16,4) default NULL,
  `freight_date` datetime default NULL,
  `freight_department` varchar(32) default NULL,
  `freight_verifier` varchar(32) default NULL,
  `other_costs` decimal(16,4) default NULL,
  `accessory` varchar(255) default NULL,
  `receipt_state` enum('noneReceipt','portionReceipt','allReceipt') default NULL,
  `not_receipt_amo` decimal(16,4) default NULL,
  `alr_receipt_amo` decimal(16,4) default NULL,
  `inv_state` enum('noneInv','portionInv','allInv') default NULL,
  `not_inv_amo` decimal(16,4) default NULL,
  `alr_inv_amo` decimal(16,4) default NULL,
  `staff_id` varchar(32) default NULL,
  `order_contract_state` enum('noneExe','exeIng','termination','closed','affirm') default NULL,
  `enabled` enum('enable','disable') default NULL,
  `remark` varchar(255) default NULL,
  `audit_state` enum('authstr','pass','failure') default NULL,
  `auditor` varchar(32) default NULL,
  `audit_date` datetime default NULL,
  `audti_remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`return_id`),
  KEY `FK_T_SELL_R_SELL_SEND_T_SELL_S` (`send_id`),
  CONSTRAINT `t_sell_return_ibfk_1` FOREIGN KEY (`send_id`) REFERENCES `t_sell_send` (`send_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sell_return
-- ----------------------------

-- ----------------------------
-- Table structure for `t_sell_return_detail`
-- ----------------------------
DROP TABLE IF EXISTS `t_sell_return_detail`;
CREATE TABLE `t_sell_return_detail` (
  `send_detail_id` varchar(32) NOT NULL,
  `return_id` varchar(32) default NULL,
  `goods_id` varchar(32) default NULL,
  `batch_id` varchar(32) default NULL,
  `quantity` int(4) default NULL,
  `price` decimal(16,4) default NULL,
  `money` decimal(16,4) default NULL,
  `not_receipt_num` int(4) default NULL,
  `alr_receipt_num` int(4) default NULL,
  `not_inv_num` int(4) default NULL,
  `alr_inv_num` int(4) default NULL,
  `remark` varchar(255) default NULL,
  PRIMARY KEY  (`send_detail_id`),
  KEY `FK_T_SELL_R_T_SELL_RE_T_SELL_R` (`return_id`),
  CONSTRAINT `t_sell_return_detail_ibfk_1` FOREIGN KEY (`return_id`) REFERENCES `t_sell_return` (`return_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sell_return_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `t_sell_send`
-- ----------------------------
DROP TABLE IF EXISTS `t_sell_send`;
CREATE TABLE `t_sell_send` (
  `send_id` varchar(32) NOT NULL,
  `send_code` varchar(50) default NULL,
  `order_contract_id` varchar(32) default NULL,
  `send_date` datetime default NULL,
  `sell_type_id` varchar(32) default NULL,
  `warehouse_id` varchar(32) default NULL,
  `client_id` varchar(32) default NULL,
  `client_contact_id` varchar(32) default NULL,
  `phone` varchar(15) default NULL,
  `client_fax` varchar(32) default NULL,
  `contract_number` varchar(50) default NULL,
  `deliver_type_id` varchar(32) default NULL,
  `policy` varchar(32) default NULL,
  `delivery_deadlines` datetime default NULL,
  `supplier_id` varchar(32) default NULL,
  `supplier_verifier` varchar(32) default NULL,
  `supplier_phone` varchar(15) default NULL,
  `payment_agr_id` varchar(32) default NULL,
  `invoice` enum('yes','no') default NULL,
  `invoice_type` enum('specialvat','generalvat','generaltax','ordinarytax','receipt') default NULL,
  `invoice_start` varchar(50) default NULL,
  `payment_type_id` varchar(32) default NULL,
  `freight_balance` enum('ourcommitment','notcommitment','generationpad','selfpay') default NULL,
  `freight_code` varchar(30) default NULL,
  `freight_total` decimal(16,4) default NULL,
  `freight_date` datetime default NULL,
  `freight_department` varchar(32) default NULL,
  `freight_verifier` varchar(32) default NULL,
  `other_costs` decimal(16,4) default NULL,
  `accessory` varchar(255) default NULL,
  `return_state` enum('noneReturn','portionReturn','allReturn') default NULL,
  `goods_state` enum('noneExe','transit','termination','affirm') default NULL,
  `not_return_amo` decimal(16,4) default NULL,
  `alr_return_amo` decimal(16,4) default NULL,
  `receipt_state` enum('noneReceipt','portionReceipt','allReceipt') default NULL,
  `not_receipt_amo` decimal(16,4) default NULL,
  `alr_receipt_amo` decimal(16,4) default NULL,
  `inv_state` enum('noneInv','portionInv','allInv') default NULL,
  `not_inv_amo` decimal(16,4) default NULL,
  `alr_inv_amo` decimal(16,4) default NULL,
  `staff_id` varchar(32) default NULL,
  `order_contract_state` enum('noneExe','exeIng','termination','closed','affirm') default NULL,
  `enabled` enum('enable','disable') default NULL,
  `summary` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  `audit_state` enum('authstr','pass','failure') default NULL,
  `auditor` varchar(32) default NULL,
  `audit_date` datetime default NULL,
  `audit_remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`send_id`),
  KEY `FK_T_SELL_S_T_PAR_DEL_T_PAR_DE` (`deliver_type_id`),
  CONSTRAINT `t_sell_send_ibfk_1` FOREIGN KEY (`deliver_type_id`) REFERENCES `t_par_com_deliver_type` (`deliver_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sell_send
-- ----------------------------

-- ----------------------------
-- Table structure for `t_sell_send_detail`
-- ----------------------------
DROP TABLE IF EXISTS `t_sell_send_detail`;
CREATE TABLE `t_sell_send_detail` (
  `send_detail_id` varchar(32) NOT NULL,
  `send_id` varchar(32) default NULL,
  `goods_id` varchar(32) default NULL,
  `batch_id` varchar(32) default NULL,
  `quantity` int(4) default NULL,
  `price` decimal(16,4) default NULL,
  `discount_rate` decimal(16,4) default NULL,
  `money` decimal(16,4) default NULL,
  `not_return_num` int(4) default NULL,
  `alr_return_num` int(4) default NULL,
  `not_receipt_num` int(4) default NULL,
  `alr_receipt_num` int(4) default NULL,
  `not_inv_num` int(4) default NULL,
  `alr_inv_num` int(4) default NULL,
  `remark` varchar(255) default NULL,
  PRIMARY KEY  (`send_detail_id`),
  KEY `FK_T_SELL_S_T_SELL_SE_T_SELL_S` (`send_id`),
  CONSTRAINT `t_sell_send_detail_ibfk_1` FOREIGN KEY (`send_id`) REFERENCES `t_sell_send` (`send_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sell_send_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `t_sell_share_person`
-- ----------------------------
DROP TABLE IF EXISTS `t_sell_share_person`;
CREATE TABLE `t_sell_share_person` (
  `shared_person_id` varchar(32) NOT NULL,
  `order_contract_id` varchar(32) default NULL,
  `client_id` varchar(32) default NULL,
  `logistics_id` varchar(32) default NULL,
  `staff_id` varchar(32) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`shared_person_id`),
  KEY `FK_T_SELL_S_T_SELL_OR_T_SELL_O` (`order_contract_id`),
  CONSTRAINT `t_sell_share_person_ibfk_1` FOREIGN KEY (`order_contract_id`) REFERENCES `t_sell_order_contract` (`order_contract_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sell_share_person
-- ----------------------------

-- ----------------------------
-- Table structure for `t_split`
-- ----------------------------
DROP TABLE IF EXISTS `t_split`;
CREATE TABLE `t_split` (
  `split_id` varchar(32) NOT NULL,
  `split_code` varchar(32) default NULL,
  `warehouse_id` varchar(32) default NULL,
  `split_date` datetime default NULL,
  `batch` int(11) default NULL,
  `sum_indirect_costs` decimal(16,4) default NULL,
  `department` varchar(32) default NULL,
  `auditor_id` varchar(32) default NULL,
  `audit_date` datetime default NULL,
  `audit_state` enum('authstr','failure','pass') default NULL,
  `audit_remark` varchar(255) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`split_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_split
-- ----------------------------

-- ----------------------------
-- Table structure for `t_split_detail`
-- ----------------------------
DROP TABLE IF EXISTS `t_split_detail`;
CREATE TABLE `t_split_detail` (
  `split_detail_id` varchar(32) NOT NULL,
  `split_id` varchar(32) default NULL,
  `goods_id` varchar(32) default NULL,
  `goods_code` varchar(225) default NULL,
  `goods_name` varchar(255) default NULL,
  `goods_batch` varchar(255) default NULL,
  `goods_style` varchar(255) default NULL,
  `goods_unit` varchar(32) default NULL,
  `warehouse_id` varchar(32) default NULL,
  `prime_cost` decimal(16,4) default NULL,
  `order_number` int(11) default NULL,
  `remark` varchar(225) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  `assembly_total` decimal(16,4) default NULL,
  PRIMARY KEY  (`split_detail_id`),
  KEY `FK_Split_SplitDetail_SplitId` (`split_id`),
  CONSTRAINT `t_split_detail_ibfk_1` FOREIGN KEY (`split_id`) REFERENCES `t_split` (`split_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_split_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `t_suppliers`
-- ----------------------------
DROP TABLE IF EXISTS `t_suppliers`;
CREATE TABLE `t_suppliers` (
  `supplier_id` varchar(32) NOT NULL,
  `supplier_number` varchar(32) default NULL COMMENT '供应商编号',
  `supplier_province` varchar(32) default NULL COMMENT '供应商省份',
  `prepaid_balance` decimal(16,4) default NULL COMMENT '预付款余额',
  `suppliers_name` varchar(32) default NULL,
  `type_id` varchar(32) default NULL,
  `company_phone` varchar(32) default NULL,
  `company_fax` varchar(32) default NULL,
  `company_urls` varchar(32) default NULL,
  `company_email` varchar(32) default NULL,
  `city` varchar(255) default NULL,
  `adress` varchar(255) default NULL,
  `postcode` varchar(255) default NULL,
  `supplier_level` enum('normal','illegal') default NULL,
  `source_id` varchar(32) default NULL,
  `nature_id` varchar(32) default NULL,
  `industry_id` varchar(32) default NULL,
  `main_business` varchar(255) default NULL,
  `size_id` varchar(32) default NULL,
  `opened_year` datetime default NULL,
  `registered_capital` decimal(16,4) default NULL,
  `company_legal` varchar(50) default NULL,
  `grade_id` varchar(32) default NULL,
  `bank` varchar(255) default NULL,
  `bank_account` varchar(255) default NULL,
  `tax_id` varchar(255) default NULL,
  `supplier_date` datetime default NULL,
  `supplier_type` varchar(255) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `auditor_id` varchar(32) default NULL COMMENT '�����',
  `auditor_date` datetime default NULL COMMENT '�������',
  `audit_state` enum('authstr','failure','pass') default NULL COMMENT '���״̬',
  `audit_remark` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL COMMENT '������',
  `create_time` datetime default NULL COMMENT '¼��ʱ��',
  `updater` varchar(32) default NULL COMMENT '����޸���',
  `update_time` datetime default NULL COMMENT '����޸�ʱ��',
  PRIMARY KEY  (`supplier_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_suppliers
-- ----------------------------

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `user_id` varchar(32) NOT NULL,
  `username` varchar(20) NOT NULL,
  `user_cn_name` varchar(50) default NULL,
  `password` varchar(64) NOT NULL,
  `dep_id` varchar(32) default NULL,
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
  PRIMARY KEY  (`user_id`),
  KEY `FK_USER_DEP` USING BTREE (`dep_id`),
  CONSTRAINT `FK_USER_DEP` FOREIGN KEY (`dep_id`) REFERENCES `t_dep` (`dep_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('8b25651c2d896297530b64e4b80ec503', 'admin', '超级管理员', '5dc10e7826e648ec6f136974c38f81d0e5e1d0ae', '1ff32f3ab5bd95584a429130956fecea', 'e03b1b95ceff4db6', 'enable', 'admin', 'admin@glacier.cn', null, null, '2015-01-13 10:56:34', '127.0.0.1[本地]', '1023', '8b25651c2d896297530b64e4b80ec503', '2014-02-27 02:58:02');
INSERT INTO `t_user` VALUES ('d31a15b0c9abe32744dc16203b9547d8', 'administrators', '客户管理员', 'f418eabf12e35e6112d8783ef6751c0da68782b5', '1ff32f3ab5bd95584a429130956fecea', 'd5a18894f8d85631', 'enable', 'custom', 'administrators@qq.com', null, '后台管理员', null, null, '0', '8b25651c2d896297530b64e4b80ec503', '2014-07-28 16:30:17');
INSERT INTO `t_user` VALUES ('d6dc13121742a3b331dcb6f93d4f4bce', 'adminTest', '客户管理员', 'd7d62bc0a343ffea509247f1a7c92120e762771d', null, 'baaa252597ec918e', 'enable', 'custom', 'adminTest@163.com', null, '客户、测试使用账号', '2014-08-04 17:53:34', '127.0.0.1[本地]', '4', '8b25651c2d896297530b64e4b80ec503', '2014-07-14 13:40:42');

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

-- ----------------------------
-- Table structure for `t_warehouse`
-- ----------------------------
DROP TABLE IF EXISTS `t_warehouse`;
CREATE TABLE `t_warehouse` (
  `warehouse_id` varchar(32) NOT NULL,
  `order_num` int(4) default NULL,
  `warehouse_code` varchar(32) default NULL,
  `warehouse_name` varchar(32) default NULL,
  `department_id` varchar(32) default NULL,
  `warehouse_manager` varchar(32) default NULL,
  `retail_libraries` enum('yes','no') default NULL COMMENT 'ö�٣���Y��/N��',
  `phone` varchar(32) default NULL,
  `address` varchar(32) default NULL,
  `head` varchar(32) default NULL,
  `remark` varchar(225) default NULL,
  `enabled` enum('disable','enable') default NULL COMMENT 'ö�٣�(����1/����0)',
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`warehouse_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_warehouse
-- ----------------------------

-- ----------------------------
-- Table structure for `t_warehouse_classify`
-- ----------------------------
DROP TABLE IF EXISTS `t_warehouse_classify`;
CREATE TABLE `t_warehouse_classify` (
  `warehouse_classify_id` varchar(32) NOT NULL,
  `warehouse_id` varchar(32) default NULL,
  `warehouse_type_id` varchar(32) default NULL,
  PRIMARY KEY  (`warehouse_classify_id`),
  KEY `FK_WarehouseTtype_WarehouseClassify_WarehouseTypeId` (`warehouse_type_id`),
  KEY `FK_Warehouse_WarehouseClassify_WarehouseId` (`warehouse_id`),
  CONSTRAINT `t_warehouse_classify_ibfk_1` FOREIGN KEY (`warehouse_id`) REFERENCES `t_warehouse` (`warehouse_id`),
  CONSTRAINT `t_warehouse_classify_ibfk_2` FOREIGN KEY (`warehouse_type_id`) REFERENCES `t_warehouse_type` (`warehouse_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_warehouse_classify
-- ----------------------------

-- ----------------------------
-- Table structure for `t_warehouse_detail`
-- ----------------------------
DROP TABLE IF EXISTS `t_warehouse_detail`;
CREATE TABLE `t_warehouse_detail` (
  `detail_id` varchar(32) NOT NULL,
  `detail_code` varchar(100) default NULL,
  `detail_date` date default NULL,
  `detail_type` varchar(100) default NULL,
  `detail_kind` varchar(100) default NULL,
  `warehouse_id` varchar(32) default NULL,
  `goods_id` varchar(32) default NULL,
  `detail_good_code` varchar(100) default NULL,
  `detail_good_name` varchar(100) default NULL,
  `detail_good_way` varchar(100) default NULL,
  `detail_good_depart` varchar(100) default NULL,
  `detail_good_batch` varchar(100) default NULL,
  `detail_good_in` int(4) default NULL,
  `detail_in_price` decimal(16,4) default NULL,
  `detail_in_total` decimal(16,4) default NULL,
  `detail_good_out` int(4) default NULL,
  `detail_out_price` decimal(16,4) default NULL,
  `detail_out_total` decimal(16,4) default NULL,
  `detail_remain_number` int(4) default NULL,
  `detail_remain_price` decimal(16,4) default NULL,
  `detail_remain_total` decimal(16,4) default NULL,
  `detail_good_stream` varchar(100) default NULL,
  `remark` varchar(255) default NULL,
  `batch` varchar(100) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `updater_time` datetime default NULL,
  PRIMARY KEY  (`detail_id`),
  KEY `FK_Warehouse_WarehouseDetail_WarehouseId` (`warehouse_id`),
  CONSTRAINT `t_warehouse_detail_ibfk_1` FOREIGN KEY (`warehouse_id`) REFERENCES `t_warehouse` (`warehouse_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_warehouse_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `t_warehouse_in`
-- ----------------------------
DROP TABLE IF EXISTS `t_warehouse_in`;
CREATE TABLE `t_warehouse_in` (
  `warehouse_in_id` varchar(32) NOT NULL COMMENT '���ID',
  `warehouse_in_code` varchar(32) default NULL COMMENT '��ⵥ��',
  `warehouse_id` varchar(32) default NULL COMMENT '�ֿ�ID',
  `warehouse_in_date` datetime default NULL COMMENT '�������',
  `in_type_id` varchar(32) default NULL COMMENT '�������ID',
  `supplier_id` varchar(32) default NULL COMMENT '��Ӧ��ID',
  `total_money` decimal(16,4) default NULL,
  `line_people` varchar(32) default NULL,
  `phone` varchar(32) default NULL COMMENT '��ϵ�绰',
  `department` varchar(32) default NULL COMMENT '���첿��',
  `enabled` enum('enable','disable') default NULL,
  `auditor_id` varchar(32) default NULL COMMENT '�����',
  `auditor_date` datetime default NULL COMMENT '�������',
  `audit_state` enum('authstr','failure','pass') default NULL COMMENT '���״̬',
  `audit_remark` varchar(255) default NULL,
  `remark` varchar(225) default NULL COMMENT '��ע',
  `creater` varchar(32) default NULL COMMENT '������',
  `create_time` datetime default NULL COMMENT '¼��ʱ��',
  `updater` varchar(32) default NULL COMMENT '����޸���',
  `update_time` datetime default NULL COMMENT '����޸�ʱ��',
  PRIMARY KEY  (`warehouse_in_id`),
  KEY `FK_InType_WarehouseIn_InTypeId` (`in_type_id`),
  CONSTRAINT `t_warehouse_in_ibfk_1` FOREIGN KEY (`in_type_id`) REFERENCES `t_par_war_in_type` (`in_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_warehouse_in
-- ----------------------------

-- ----------------------------
-- Table structure for `t_warehouse_inventory`
-- ----------------------------
DROP TABLE IF EXISTS `t_warehouse_inventory`;
CREATE TABLE `t_warehouse_inventory` (
  `inventory_id` varchar(32) NOT NULL COMMENT '���ID',
  `in_inventory_id` varchar(32) default NULL COMMENT '�������ID',
  `inventory_code` varchar(32) default NULL COMMENT '��ⵥ��',
  `warehouse_id` varchar(32) default NULL COMMENT '�ֿ�ID',
  `inventory_date` datetime default NULL COMMENT '�������',
  `inventory_type` varchar(100) default NULL COMMENT 'ö�٣�(����overflow/����loss)',
  `attn` varchar(32) default NULL COMMENT '������',
  `department` varchar(32) default NULL COMMENT '���첿��',
  `enabled` enum('enable','disable') default NULL,
  `auditor_id` varchar(32) default NULL COMMENT '�����',
  `auditor_date` datetime default NULL COMMENT '�������',
  `audit_state` enum('authstr','failure','pass') default NULL COMMENT '���״̬',
  `audit_remark` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL COMMENT '������',
  `create_time` datetime default NULL COMMENT '¼��ʱ��',
  `updater` varchar(32) default NULL COMMENT '����޸���',
  `update_time` datetime default NULL COMMENT '����޸�ʱ��',
  PRIMARY KEY  (`inventory_id`),
  KEY `FK_InventoryType_WarehouseInventory_InventoryType` (`in_inventory_id`),
  CONSTRAINT `t_warehouse_inventory_ibfk_1` FOREIGN KEY (`in_inventory_id`) REFERENCES `t_inventory_type` (`in_inventory_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_warehouse_inventory
-- ----------------------------

-- ----------------------------
-- Table structure for `t_warehouse_inventory_detail`
-- ----------------------------
DROP TABLE IF EXISTS `t_warehouse_inventory_detail`;
CREATE TABLE `t_warehouse_inventory_detail` (
  `inventory_detai_id` varchar(32) NOT NULL,
  `inventory_id` varchar(32) default NULL,
  `goods_id` varchar(32) default NULL,
  `goods_code` varchar(225) default NULL,
  `goods_name` varchar(255) default NULL,
  `goods_batch` varchar(255) default NULL,
  `goods_style` varchar(255) default NULL,
  `goods_unit` varchar(32) default NULL,
  `inventory_number` int(4) default NULL,
  `normal_number` int(4) default NULL,
  `damage_normal` int(4) default NULL,
  `remark` varchar(225) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`inventory_detai_id`),
  KEY `FK_WarehouseInventory_warehouseInventoryDetail_InventoryId` (`inventory_id`),
  CONSTRAINT `t_warehouse_inventory_detail_ibfk_1` FOREIGN KEY (`inventory_id`) REFERENCES `t_warehouse_inventory` (`inventory_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_warehouse_inventory_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `t_warehouse_in_detail`
-- ----------------------------
DROP TABLE IF EXISTS `t_warehouse_in_detail`;
CREATE TABLE `t_warehouse_in_detail` (
  `in_detai_id` varchar(32) NOT NULL,
  `in_code` varchar(100) default NULL,
  `warehouse_in_id` varchar(32) default NULL,
  `goods_id` varchar(32) default NULL,
  `goods_code` varchar(225) default NULL,
  `goods_name` varchar(255) default NULL,
  `goods_batch` varchar(255) default NULL,
  `goods_style` varchar(255) default NULL,
  `goods_unit` varchar(32) default NULL,
  `in_type_price` decimal(16,4) default NULL,
  `in_number` int(4) default NULL,
  `in_total` decimal(16,4) default NULL,
  `remark` varchar(225) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`in_detai_id`),
  KEY `FK_WarehouseIn_WarehouseInDetail_WarehouseInId` (`warehouse_in_id`),
  CONSTRAINT `t_warehouse_in_detail_ibfk_1` FOREIGN KEY (`warehouse_in_id`) REFERENCES `t_warehouse_in` (`warehouse_in_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_warehouse_in_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `t_warehouse_out`
-- ----------------------------
DROP TABLE IF EXISTS `t_warehouse_out`;
CREATE TABLE `t_warehouse_out` (
  `warehouse_out_id` varchar(32) NOT NULL COMMENT '���ID',
  `warehouse_out_code` varchar(32) default NULL COMMENT '��ⵥ��',
  `warehouse_id` varchar(32) default NULL COMMENT '�ֿ�ID',
  `warehouse_out_date` datetime default NULL COMMENT '�������',
  `out_type_id` varchar(32) default NULL COMMENT '�������ID',
  `client_id` varchar(32) default NULL COMMENT '��Ӧ��ID',
  `total_money` decimal(16,4) default NULL,
  `line_people` varchar(32) default NULL,
  `phone` varchar(32) default NULL COMMENT '��ϵ�绰',
  `auditor_id` varchar(32) default NULL,
  `audit_date` datetime default NULL,
  `audit_state` enum('authstr','failure','pass') default NULL,
  `audit_remark` varchar(255) default NULL,
  `remark` varchar(225) default NULL COMMENT '��ע',
  `attn` varchar(32) default NULL COMMENT '������',
  `department` varchar(32) default NULL COMMENT '���첿��',
  `enabled` enum('enable','disable') default NULL COMMENT 'ö�٣�(����1/����0)',
  `creater` varchar(32) default NULL COMMENT '������',
  `create_time` datetime default NULL COMMENT '¼��ʱ��',
  `updater` varchar(32) default NULL COMMENT '����޸���',
  `update_time` datetime default NULL COMMENT '����޸�ʱ��',
  PRIMARY KEY  (`warehouse_out_id`),
  KEY `FK_OutType_WarehouseOut_OutTypeId` (`out_type_id`),
  CONSTRAINT `t_warehouse_out_ibfk_1` FOREIGN KEY (`out_type_id`) REFERENCES `t_par_war_out_type` (`out_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_warehouse_out
-- ----------------------------

-- ----------------------------
-- Table structure for `t_warehouse_out_detail`
-- ----------------------------
DROP TABLE IF EXISTS `t_warehouse_out_detail`;
CREATE TABLE `t_warehouse_out_detail` (
  `out_detai_id` varchar(32) NOT NULL,
  `warehouse_out_id` varchar(32) default NULL,
  `out_code` varchar(100) default NULL,
  `goods_id` varchar(32) default NULL,
  `goods_code` varchar(225) default NULL,
  `goods_name` varchar(255) default NULL,
  `goods_batch` varchar(255) default NULL,
  `goods_style` varchar(255) default NULL,
  `goods_unit` varchar(32) default NULL,
  `warehouse_id` varchar(32) default NULL,
  `out_type_price` decimal(16,4) default NULL,
  `out_number` int(4) default NULL,
  `out_price_total` decimal(16,4) default NULL,
  `remark` varchar(225) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`out_detai_id`),
  KEY `FK_WarehouseOut_WarehouseOutDetail_WarehouseOuId` (`warehouse_out_id`),
  CONSTRAINT `t_warehouse_out_detail_ibfk_1` FOREIGN KEY (`warehouse_out_id`) REFERENCES `t_warehouse_out` (`warehouse_out_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_warehouse_out_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `t_warehouse_type`
-- ----------------------------
DROP TABLE IF EXISTS `t_warehouse_type`;
CREATE TABLE `t_warehouse_type` (
  `warehouse_type_id` varchar(32) NOT NULL,
  `order_num` int(4) default NULL,
  `warehouse_type_name` varchar(32) default NULL,
  `enabled` enum('enable','disable') default NULL COMMENT 'ö�٣�(����1/����0)',
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`warehouse_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_warehouse_type
-- ----------------------------
