/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50067
Source Host           : localhost:3306
Source Database       : invoicing

Target Server Type    : MYSQL
Target Server Version : 50067
File Encoding         : 65001

Date: 2015-02-03 13:24:44
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
  `method` varchar(200) default NULL,
  `order_num` int(10) unsigned default NULL,
  `remark` varchar(50) default NULL,
  PRIMARY KEY  (`action_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_action
-- ----------------------------
INSERT INTO `t_action` VALUES ('00373dc94a1610aab1a50b060bb17e88', '91ca1b4b197688f21b68a72f69e09a8d', '37011217016636a0723462dbc81bf887', '分配角色', 'assign', 'icon-standard-key-go', 'Button', 'disable', 'glacier.system_mgr.user_mgr.user.roleAssign();', '4', null);
INSERT INTO `t_action` VALUES ('00c00486af94f98319867dd391199e3b', 'c81a4c0156789361600940be2ebdab2c', '628e3c73409f37c6d28bdd97ed61b5fc', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.clientLevel_mgr.clientLevel.editClientLevel();', '2', '');
INSERT INTO `t_action` VALUES ('00f9caf1c2b624a16c5e90a15931925e', '5f51460aaf2854c5c03af9190ef94017', 'ca2d12285d0d2c284991f1079e3fc181', '批量审核', 'batchAudit', 'icon-standard-joystick', 'Button', 'enable', 'glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.batchAuditPurchaseArrival();', '1', '');
INSERT INTO `t_action` VALUES ('0292b24bf2613a3e26c01b7486bc0344', '1b41e29c8712c9f36bc3a520a8e5363b', '95eaa68d7a4109e845d63ef82cdb0d3f', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.financeCostType_mgr.financeCostType.addFinanceCostType();', '1', '');
INSERT INTO `t_action` VALUES ('04749b4fbcdf65596ba8883beeda704f', 'efb8f52b5c4539e98c9d4215e792cb4e', 'f784974e8e1478c8ad79f374e588b699', '批量启用', 'batchEnable', 'icon-standard-joystick', 'Button', 'enable', 'glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.batchEnablePurchaseArrival();', '1', '');
INSERT INTO `t_action` VALUES ('052f8f3a3dee3781a1f3a60bee4cfbfc', '8a2f2500fa46e49dd7ff11b688b6c740', 'ad67aaf12a02906ad088a73410fd097e', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.companySize_mgr.companySize.editCompanySize();', '2', '');
INSERT INTO `t_action` VALUES ('05a5037e885717d834ccbc15cae394d0', '14cf54d0d98b03aa15845d63071f9c68', 'bc2d2f30667d8a327596e8cb9f6bd7fe', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.suppliersContact_mgr.suppliersContact.delSuppliersContact();', '3', '');
INSERT INTO `t_action` VALUES ('08fcfc5ac69513b18eb1c67b3d108a37', '810ba3686840457556cb55bc87d8010b', '365eeace84821f6e45d59cefd702827d', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.sellType_mgr.sellType.delSellType();', '3', '');
INSERT INTO `t_action` VALUES ('099bbd95bea8b3e311ed8075f30cdbda', '8a2f2500fa46e49dd7ff11b688b6c740', 'ad67aaf12a02906ad088a73410fd097e', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.companySize_mgr.companySize.addCompanySize();', '1', '');
INSERT INTO `t_action` VALUES ('0bd2298fc6339f8b5ddc191ff7a79cbd', '8c54260cf2f6704a1739503465d9e9cf', '58fc5a925e18a411e10bf5b2084ee609', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.financeReceivableType_mgr.financeReceivableType.addFinanceReceivableType();', '1', '');
INSERT INTO `t_action` VALUES ('0ef27657d1028fe40098277e557db695', '4f2b136adfaf68b741d58df8e4adc4ff', '977a07ecaf616fcd4ba6e47b19896a42', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.financePayableType_mgr.financePayableType.editFinancePayableType();', '2', '');
INSERT INTO `t_action` VALUES ('0fdce7c7faac53572cdb71d659fec353', '8c54260cf2f6704a1739503465d9e9cf', '58fc5a925e18a411e10bf5b2084ee609', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.financeReceivableType_mgr.financeReceivableType.delFinanceReceivableType();', '3', '');
INSERT INTO `t_action` VALUES ('10b73e3ae8921345c84b4ee9f3116667', '40b4045ca1b6a457298e76ad34cfb5be', 'ff77e2eb7cff4173eaa531eb708a1527', '取消审核', 'cancelAudit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.cancelAuditPurchaseArrival();', '7', '');
INSERT INTO `t_action` VALUES ('11155cdaf84232cf47b1b68f9e755f75', '8c54260cf2f6704a1739503465d9e9cf', '58fc5a925e18a411e10bf5b2084ee609', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.financeReceivableType_mgr.financeReceivableType.editFinanceReceivableType();', '2', '');
INSERT INTO `t_action` VALUES ('11d620cccb4d3dafc3a1bff37d41f40b', '96f4fcb49e57d6a1a001718d5c5aeee8', '9bd61e80d5fe7892b77fa5ccc069c825', '禁用', 'disable', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseOrder_mgr.purchaseOrder.disablePurchaseOrder();', '5', '');
INSERT INTO `t_action` VALUES ('127f7723026209cb1fe9fe531e4e699f', '522545bf918daa876c0c31e3ac4df53d', 'df852a739432f8f496e8a46ae244a6e7', '批量取消审核', 'batchCancelAudit', 'icon-standard-joystick', 'Button', 'enable', 'glacier.purchase_mgr.purchaseOrder_mgr.purchaseOrder.batchCancelAuditPurchaseOrder();', '1', '');
INSERT INTO `t_action` VALUES ('136f8d63b9c4b4f3b9c92213a321ca24', '96f4fcb49e57d6a1a001718d5c5aeee8', '9bd61e80d5fe7892b77fa5ccc069c825', '取消终止', 'cancelTer', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseOrder_mgr.purchaseOrder.cancelTerPurchaseOrder();', '11', '');
INSERT INTO `t_action` VALUES ('1584c8fdea140ac79be4abdca1dff321', '14cf54d0d98b03aa15845d63071f9c68', 'bc2d2f30667d8a327596e8cb9f6bd7fe', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.suppliersContact_mgr.suppliersContact.editSuppliersContact();', '2', '');
INSERT INTO `t_action` VALUES ('1667a1dc9485bc1da1f4ec4cf39efe6e', '40b4045ca1b6a457298e76ad34cfb5be', 'ff77e2eb7cff4173eaa531eb708a1527', '取消收货确认', 'cancelAffirm', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.cancelAffirmPurchaseArrival();', '11', '');
INSERT INTO `t_action` VALUES ('18060139f0e736a796d5ac4bdd78eadc', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.role_mgr.role.editRole();', '2', null);
INSERT INTO `t_action` VALUES ('1b906ab8b271f7effdd490c4e9f7deec', '0c77cb97fb54089e6b6f89b24d555023', 'ac7d8ce120825cc6023f4edaaf2b5b55', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.purchase_mgr.purchaseInvoice_mgr.purchaseInvoice.addPurchaseInvoice();', '1', '');
INSERT INTO `t_action` VALUES ('1ea6629af6438c02467c03635fc39acf', '222561c0716cce27e6fc8e82eef0bce5', 'e469eecb4bd133c072f247d0d9635979', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.purchase_mgr.purchaseRequisition_mgr.purchaseRequisition.addPurchaseRequisition();', '1', '');
INSERT INTO `t_action` VALUES ('1f030c5d4303316d090fc0567ec10ea2', '16669401121c47c062cac4d11a21522e', '4df3645386cbf2317d35ecf218939b71', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.warOutType_mgr.warOutType.delWarOutType();', '3', '');
INSERT INTO `t_action` VALUES ('216c6d43f085ba920e11bd60a8e06886', 'a4d88b8b3c70b93d69d0bf24ffb09377', '6cfa450f398c5384de09368f8b7094ab', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.suppliers_mgr.suppliers.editSuppliers();', '2', '');
INSERT INTO `t_action` VALUES ('21c425f0255738c5e278304dd6264476', '4f2b136adfaf68b741d58df8e4adc4ff', '977a07ecaf616fcd4ba6e47b19896a42', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.financePayableType_mgr.financePayableType.delFinancePayableType();', '3', '');
INSERT INTO `t_action` VALUES ('229ce82b6f56b1a629cf2ea67faba203', '222561c0716cce27e6fc8e82eef0bce5', 'e469eecb4bd133c072f247d0d9635979', '订购', 'order', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseRequisition_mgr.purchaseRequisition.orderPurchaseRequisition();', '8', '');
INSERT INTO `t_action` VALUES ('22b38655d16fa1042893e49b1cdfc611', '82533b28131409450ad7a00229fd7333', '82385e2a3e64ac4cf4633ccb4c38c480', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.comContactType_mgr.comContactType.addComContactType();', '1', '');
INSERT INTO `t_action` VALUES ('2421bd42880819c8be703d7c4f49894b', '2261cc3a4a23b23bd6317021981fbd1e', '6dbbdf0a9349268ead711fc84f3da291', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.suppliersType_mgr.suppliersType.delSuppliersType();', '3', '');
INSERT INTO `t_action` VALUES ('24f54bf0162f94e1855200a818b62d73', '96f4fcb49e57d6a1a001718d5c5aeee8', '9bd61e80d5fe7892b77fa5ccc069c825', '到货', 'arr', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseOrder_mgr.purchaseOrder.arrPurchaseOrder();', '9', '');
INSERT INTO `t_action` VALUES ('252406da7cfa367b741142c71a9c89e2', '810ba3686840457556cb55bc87d8010b', '365eeace84821f6e45d59cefd702827d', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.sellType_mgr.sellType.addSellType();', '1', '');
INSERT INTO `t_action` VALUES ('264435a21bf6a59d2d4e2065244cf858', 'e8a2f672e16b2dcaf720a8b0586e99fd', '4e23476d801ed12824a42aca3f813617', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.warInType_mgr.warInType.delWarInType();', '3', '');
INSERT INTO `t_action` VALUES ('289adb04b61fb737bd7da153c0750f16', '295ffaf17338b3621d532bfe8ee6c779', 'af5f8e8847920dc7fd6347e3a4e9c467', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.comNature_mgr.comNature.editComNature();', '2', '');
INSERT INTO `t_action` VALUES ('293b275e09230acf37f0aa98031c83c0', '90998bf3c3173da5e8319d70cec8a7ab', 'f664c6028d8cab504f2771fa78d56312', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.sellReturnReason_mgr.sellReturnReason.delSellReturnReason();', '3', '');
INSERT INTO `t_action` VALUES ('2aa54ec65699c4e2c31fc9aa7de04043', '0c77cb97fb54089e6b6f89b24d555023', 'ac7d8ce120825cc6023f4edaaf2b5b55', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.purchase_mgr.purchaseInvoice_mgr.purchaseInvoice.delPurchaseInvoice();', '3', '');
INSERT INTO `t_action` VALUES ('2c69d455096c537bf3df243febdb5a93', '2261cc3a4a23b23bd6317021981fbd1e', '6dbbdf0a9349268ead711fc84f3da291', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.suppliersType_mgr.suppliersType.editSuppliersType();', '2', '');
INSERT INTO `t_action` VALUES ('301ae7590f12623a1ff3aa43c77a6a26', 'd29229a817d81ed224df8c53d2f48f3d', '4284f4950bf67217bf1816260419ebbb', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.quotedPriceType_mgr.quotedPriceType.editQuotedPriceType();', '2', '');
INSERT INTO `t_action` VALUES ('314ea4bd2c038e141e8893448f1c8679', '96f4fcb49e57d6a1a001718d5c5aeee8', '9bd61e80d5fe7892b77fa5ccc069c825', '跟踪', 'track', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseOrder_mgr.purchaseOrder.trackPurchaseOrder();', '14', '');
INSERT INTO `t_action` VALUES ('32740020a8816f83b38564a64eee4278', 'e42b98561176563f930d82c80b041ed8', 'f769a64bb571aa0c7ac269b807af4782', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.system_mgr.loginlog_mgr.loginlog.delLoginlog();', '1', null);
INSERT INTO `t_action` VALUES ('3285f8a0e06570b708bc49657be83e14', '222561c0716cce27e6fc8e82eef0bce5', '1fcaaf879975dc772875bbdcc42af61a', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.purchase_mgr.purchaseRequisition_mgr.purchaseRequisition.addPurchaseRequisitionDetail();', '1', '');
INSERT INTO `t_action` VALUES ('36e847cc5b5744525c0b3b2985d196b9', 'c9845e00a5b709d5659d4011119daa67', 'c2a06009f4a31f5c63c6631a869ad813', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.suppliersGrade_mgr.suppliersGrade.delSuppliersGrade();', '3', '');
INSERT INTO `t_action` VALUES ('377f401ba2cfbd0ccfdbf0739f0fff48', 'a35ca1bb25e1f11898c78eb03332554b', '5252a18b51e04ddf499aac66a8245367', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.warOccupationType_mgr.warOccupationType.addWarOccupationType();', '1', '');
INSERT INTO `t_action` VALUES ('380b3c09490efab8df31bf0d3ffa746f', '2261cc3a4a23b23bd6317021981fbd1e', '6dbbdf0a9349268ead711fc84f3da291', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.suppliersType_mgr.suppliersType.addSuppliersType();', '1', '');
INSERT INTO `t_action` VALUES ('3ac74098128017095a49fa85b61703d8', 'dc2dcb1b303c05b27e9c01dc23dcc5f7', '21f3486dd1b51463c4979dc80ef4009b', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.purchaseType_mgr.purchaseType.editPurchaseType();', '2', '');
INSERT INTO `t_action` VALUES ('3ac7e3d7e926110b169c87b0a38eac95', '904d503fbdeddae78da4db24d8563080', 'da23ee602a07d41e279ffe940cfccf8b', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.clientContact_mgr.clientContact.delClientContact();', '3', '');
INSERT INTO `t_action` VALUES ('419ec6d31bcf0f12c11f6d5413a460c2', '4cd535b32c8395464ebdd8cca36f3a3a', 'c5cdcd3e45b35765f477502c5b51800d', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturn.delPurchaseReturn();', '3', '');
INSERT INTO `t_action` VALUES ('4260fbed3c951dde2e25a56ac6d7693c', '0eac3f9c7b4e4cdd5e42c56a16c85147', 'ad6926567cb16be8966308eb36583a57', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.comDeliverType_mgr.comDeliverType.addComDeliverType();', '1', '');
INSERT INTO `t_action` VALUES ('429f54b614db46af58598c8d9a47a36f', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.delPanel();', '3', null);
INSERT INTO `t_action` VALUES ('43ff2bc17680b95d56675fe69dc43512', '4cd535b32c8395464ebdd8cca36f3a3a', 'c5cdcd3e45b35765f477502c5b51800d', '启用', 'enable', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturn.enablePurchaseReturn();', '4', '');
INSERT INTO `t_action` VALUES ('4513cd94bc444acf5e3689e7f81e3491', '4cd535b32c8395464ebdd8cca36f3a3a', 'c5cdcd3e45b35765f477502c5b51800d', '禁用', 'disable', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturn.disablePurchaseReturn();', '5', '');
INSERT INTO `t_action` VALUES ('467e2099ef79c51a5ef12e93603cce5c', '00451bcfd707a2b5c3b80704f992dc21', '6659f9987cbbdf0721f8935b4a3d5a36', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.purchaseReturnedType_mgr.purchaseReturnedType.editPurchaseReturnedType();', '2', '');
INSERT INTO `t_action` VALUES ('47825847f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '3456eg4157cf483a790f4eea35ds5675', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.editOptgroupValue();', '2', null);
INSERT INTO `t_action` VALUES ('486ee8a95df71f04f384129d7471ff6d', 'ccec6c46d43b0e7c40ce5c1ffc0cb3e5', '0d7ed154eebe739d81a20da996d68e6b', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.purchaseReturnReason_mgr.purchaseReturnReason.addPurchaseReturnReason();', '1', '');
INSERT INTO `t_action` VALUES ('4a4acbb584f3c5601bbd1b9ed7a6062f', '0eac3f9c7b4e4cdd5e42c56a16c85147', 'ad6926567cb16be8966308eb36583a57', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.comDeliverType_mgr.comDeliverType.editComDeliverType();', '2', '');
INSERT INTO `t_action` VALUES ('4a876056b394778d17d8e1f548b7c840', 'aa165bf67dadbeedeb780b3e92dcdcdb', 'eb65d0304dc38ac4db140a1c10fdc7d3', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.sellReturnType_mgr.sellReturnType.editSellReturnType();', '2', '');
INSERT INTO `t_action` VALUES ('4b72b8dcc33ff635ea8bfa9c2ed38263', 'bfe6aa265cb92e35e9920f98a61df508', 'afb1cf326e78fe292af33b76aeef02cd', '添加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.goodsList_mgr.goodsList.addGoodsList();', '1', '');
INSERT INTO `t_action` VALUES ('4d05ce95cb561b35788bc8d2911d8419', '0d5f941c0e815519b859afa0992eda0b', 'bbf240fc8c53886e327ff15976026945', '分配角色', 'assign', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.system_mgr.dep_mgr.dep.assignDep();', '4', '');
INSERT INTO `t_action` VALUES ('4d92c5013ec5c0fc5c48178e884047b9', '89ed0cefb773a85b9afdc28c70cb7f70', 'd2b941bdcab9ab3bfd214e6c19ae7105', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.warGoodsType_mgr.warGoodsType.addWarGoodsType();', '1', '');
INSERT INTO `t_action` VALUES ('4db30ace29c9f34af035ba015328b995', '222561c0716cce27e6fc8e82eef0bce5', '1fcaaf879975dc772875bbdcc42af61a', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseRequisition_mgr.purchaseRequisition.editPurchaseRequisitionDetail();', '2', '');
INSERT INTO `t_action` VALUES ('50315339902940309f14a107b9c61652', '40b4045ca1b6a457298e76ad34cfb5be', 'ff77e2eb7cff4173eaa531eb708a1527', '退货', 'returnGoods', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.returnPurchaseArrival();', '9', '');
INSERT INTO `t_action` VALUES ('50ed20b20f2b4b3252696513c6c3412a', '96f4fcb49e57d6a1a001718d5c5aeee8', '9bd61e80d5fe7892b77fa5ccc069c825', '审核', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseOrder_mgr.purchaseOrder.auditPurchaseOrder();', '6', '');
INSERT INTO `t_action` VALUES ('5108ed873b431394c0d7186bd574bab4', '2055fc2aca880d69cf7ecef9f48fbd3c', 'fd41cf12ad7b4f35da9a47abb8495657', '批量禁用', 'batchDisable', 'icon-standard-joystick', 'Button', 'enable', 'glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.batchDisablePurchaseArrival();', '1', '');
INSERT INTO `t_action` VALUES ('527cb8cba3673d10375a88bb75adeeab', '16635dfa4b5e1dda4fd5d804f430eeec', '7794769fe25fd3fb2f2534fb8ec9e668', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.clientSource_mgr.clientSource.editClientSource();', '2', '');
INSERT INTO `t_action` VALUES ('5298219398cd19dc9ef48354974a3832', '96f4fcb49e57d6a1a001718d5c5aeee8', 'eda50ccf41c512bcfbc194807e338c45', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.purchase_mgr.purchaseOrder_mgr.purchaseOrder.addPurchaseOrderDetail();', '1', '');
INSERT INTO `t_action` VALUES ('5300c78332708702525328aec0963016', 'e8a2f672e16b2dcaf720a8b0586e99fd', '4e23476d801ed12824a42aca3f813617', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.warInType_mgr.warInType.editWarInType();', '2', '');
INSERT INTO `t_action` VALUES ('54c90c0fa9cd518840bc9dbb649fb806', '295ffaf17338b3621d532bfe8ee6c779', 'af5f8e8847920dc7fd6347e3a4e9c467', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.comNature_mgr.comNature.delComNature();', '3', '');
INSERT INTO `t_action` VALUES ('558a41fc5d1f3adbfa3e36ba63a941de', '40b4045ca1b6a457298e76ad34cfb5be', 'ff77e2eb7cff4173eaa531eb708a1527', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.editPurchaseArrival();', '2', '');
INSERT INTO `t_action` VALUES ('561282446d6fb8b1b0cad4748dafa323', '40b4045ca1b6a457298e76ad34cfb5be', 'ff77e2eb7cff4173eaa531eb708a1527', '付款', 'pay', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.payPurchaseArrival();', '8', '');
INSERT INTO `t_action` VALUES ('5652a940a901f412456efc1ecf13b634', '0d5f941c0e815519b859afa0992eda0b', 'bbf240fc8c53886e327ff15976026945', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.system_mgr.dep_mgr.dep.delDep();', '3', '');
INSERT INTO `t_action` VALUES ('57c33059be2f294cb6df1ed6f8ba8e25', 'e8a2f672e16b2dcaf720a8b0586e99fd', '4e23476d801ed12824a42aca3f813617', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.warInType_mgr.warInType.addWarInType();', '1', '');
INSERT INTO `t_action` VALUES ('5825847f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '3456eg4157cf483a790f4eea35ds5675', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.delOptgroupValue();', '3', null);
INSERT INTO `t_action` VALUES ('58660bccb69289b1f0299d9a664931d3', '91ca1b4b197688f21b68a72f69e09a8d', '37011217016636a0723462dbc81bf887', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.system_mgr.user_mgr.user.editUser();', '2', null);
INSERT INTO `t_action` VALUES ('58c66ce489e1ee8588e881a1abe9de56', '93f0fcfa7cdff069d929723062b53211', 'e6784ccad10e3414b99b77b303a338c7', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.variables_mgr.variables.editVariables();', '2', null);
INSERT INTO `t_action` VALUES ('58e1ae547ab73090f5a5497ac6a2c76d', '295ffaf17338b3621d532bfe8ee6c779', 'af5f8e8847920dc7fd6347e3a4e9c467', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.comNature_mgr.comNature.addComNature();', '1', '');
INSERT INTO `t_action` VALUES ('592d30deb551c4d4065f3b264b192305', '4cd535b32c8395464ebdd8cca36f3a3a', '0edc8b49a0eba9200310ea704054d568', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturn.delPurchaseReturnDetail();', '3', '');
INSERT INTO `t_action` VALUES ('593960111adc79b7567a6ca755a5173b', 'b5b37bbe98d7d9737ea77a81aa9f7342', '3be6c0cad57a5412fc9aabacc8f5b2b0', '批量取消审核', 'batchCancelAudit', 'icon-standard-joystick', 'Button', 'enable', 'glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturn.batchCancelAuditPurchaseReturn();', '1', '');
INSERT INTO `t_action` VALUES ('5976836e651b45350e017f69fbf3bd4e', 'ea92abb340a62dfd3ecc9b5e4d78c041', '42741ce0beb570a8e14a6bee5b2e9cab', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.warDeployType_mgr.warDeployType.addWarDeployType();', '1', '');
INSERT INTO `t_action` VALUES ('59ec881007a26cc63adfda4a22e3561f', 'a35ca1bb25e1f11898c78eb03332554b', '5252a18b51e04ddf499aac66a8245367', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.warOccupationType_mgr.warOccupationType.delWarOccupationType();', '3', '');
INSERT INTO `t_action` VALUES ('5db796929f23e991708fd0af99b3b4bc', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.role_mgr.role.addRole();', '1', null);
INSERT INTO `t_action` VALUES ('5e4a665abe7f3e0704d8aee151e68cfa', '0c77cb97fb54089e6b6f89b24d555023', 'ac7d8ce120825cc6023f4edaaf2b5b55', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseInvoice_mgr.purchaseInvoice.editPurchaseInvoice();', '2', '');
INSERT INTO `t_action` VALUES ('5fdd7acf8c60e4f1aa4dac3f9c545008', '40b4045ca1b6a457298e76ad34cfb5be', '3ae87a2b203944214386ba2d2030a819', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.delPurchaseArrivalDetail();', '3', '');
INSERT INTO `t_action` VALUES ('60da1638339ea92a02999525f06a6fcb', '96f4fcb49e57d6a1a001718d5c5aeee8', '9bd61e80d5fe7892b77fa5ccc069c825', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.purchase_mgr.purchaseOrder_mgr.purchaseOrder.addPurchaseOrder();', '1', '');
INSERT INTO `t_action` VALUES ('6712c8b2f0852d51eb9972422d372ff3', '82533b28131409450ad7a00229fd7333', '82385e2a3e64ac4cf4633ccb4c38c480', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.comContactType_mgr.comContactType.editComContactType();', '2', '');
INSERT INTO `t_action` VALUES ('6838d18fa1e582d4dc28404a80445c88', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.res_mgr.res.addMenu();', '1', null);
INSERT INTO `t_action` VALUES ('697b473a81d445cdef36da072c0427ba', 'c9845e00a5b709d5659d4011119daa67', 'c2a06009f4a31f5c63c6631a869ad813', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.suppliersGrade_mgr.suppliersGrade.addSuppliersGrade();', '1', '');
INSERT INTO `t_action` VALUES ('6b73fd176d2e32f1dee38a760e7bdb61', 'd29229a817d81ed224df8c53d2f48f3d', '4284f4950bf67217bf1816260419ebbb', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.quotedPriceType_mgr.quotedPriceType.delQuotedPriceType();', '3', '');
INSERT INTO `t_action` VALUES ('6c0bc1e009b3742af24d7bdc94adec3c', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.res_mgr.res.addPanel();', '1', null);
INSERT INTO `t_action` VALUES ('6d8af71a871f3bf13016153d51ab9dc7', '16635dfa4b5e1dda4fd5d804f430eeec', '7794769fe25fd3fb2f2534fb8ec9e668', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.clientSource_mgr.clientSource.delClientSource();', '3', '');
INSERT INTO `t_action` VALUES ('6db054225117794f9997d7b9d5c5c826', '1b41e29c8712c9f36bc3a520a8e5363b', '95eaa68d7a4109e845d63ef82cdb0d3f', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.financeCostType_mgr.financeCostType.editFinanceCostType();', '2', '');
INSERT INTO `t_action` VALUES ('6e1027dd7e57195d06dd2fac811f8ebf', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.editMenu();', '2', null);
INSERT INTO `t_action` VALUES ('6e5a5abfd1f569ef565c67d453f423b9', 'affd8db9730b330c098c5449c72e72cd', '97f2132f6557fab4d228f948c350a3f4', '批量禁用', 'batchDisable', 'icon-standard-joystick', 'Button', 'enable', 'glacier.purchase_mgr.purchaseRequisition_mgr.purchaseRequisition.batchDisablePurchaseRequisition();', '1', '');
INSERT INTO `t_action` VALUES ('6ebb0c66afb41e8cf0d890ea46ab54ca', 'ac892df07f9087fb1c89ac968bb5f555', '557cf8b2740e6792f517138703afb407', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.system_mgr.operalog_mgr.operalog.delOperalog();', '1', null);
INSERT INTO `t_action` VALUES ('6f27ff5d0ea6db9718deb396dcd54cb0', 'bc38d000dee30299a20f254c0aec0aaf', '511268ad8f3a8e0717381748f5f3ae8d', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.suppliersSource_mgr.suppliersSource.delSuppliersSource();', '3', '');
INSERT INTO `t_action` VALUES ('75c176566b9105b26c44f0b97050dcbf', '0d5f941c0e815519b859afa0992eda0b', 'bbf240fc8c53886e327ff15976026945', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.dep_mgr.dep.addDep();', '1', '');
INSERT INTO `t_action` VALUES ('75ef694872b72e65e08bb60c54941e21', 'ccec6c46d43b0e7c40ce5c1ffc0cb3e5', '0d7ed154eebe739d81a20da996d68e6b', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.purchaseReturnReason_mgr.purchaseReturnReason.delPurchaseReturnReason();', '3', '');
INSERT INTO `t_action` VALUES ('76396242211135644608e5feb35f2265', '14cf54d0d98b03aa15845d63071f9c68', 'bc2d2f30667d8a327596e8cb9f6bd7fe', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.suppliersContact_mgr.suppliersContact.addSuppliersContact();', '1', '');
INSERT INTO `t_action` VALUES ('76c5705f08886bdbc29e63e4289ff017', '96f4fcb49e57d6a1a001718d5c5aeee8', '9bd61e80d5fe7892b77fa5ccc069c825', '启用', 'enable', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseOrder_mgr.purchaseOrder.enablePurchaseOrder();', '4', '');
INSERT INTO `t_action` VALUES ('7a7a5d8f8127137351818b5f05a5e721', '4f2b136adfaf68b741d58df8e4adc4ff', '977a07ecaf616fcd4ba6e47b19896a42', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.financePayableType_mgr.financePayableType.addFinancePayableType();', '1', '');
INSERT INTO `t_action` VALUES ('7a9370d9f05cee1792cb30ece363d031', 'bfe6aa265cb92e35e9920f98a61df508', 'afb1cf326e78fe292af33b76aeef02cd', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.goodsList_mgr.goodsList.delGoodsList();', '3', '');
INSERT INTO `t_action` VALUES ('7c3c0638f3699c4cead64be05a4eff4b', '79d4fbfb8f73e4e21ee67e1d6ad9ff5e', 'efe32f25f6d4eab27c74e3dbcf326b47', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.basisClient_mgr.basisClient.addBasisClient();', '1', '');
INSERT INTO `t_action` VALUES ('7cd6206e5d6cf22c466105eef922fadd', '8fc3b6de8076d1e8c3a6514bd29c4c4b', 'c7796dffd9d50588655cfc9d6a297efc', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.comPaymentType_mgr.comPaymentType.editComPaymentType();', '2', '');
INSERT INTO `t_action` VALUES ('8213322b6c68daa22e149f80a698dd61', '222561c0716cce27e6fc8e82eef0bce5', '1fcaaf879975dc772875bbdcc42af61a', ' 删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.purchase_mgr.purchaseRequisition_mgr.purchaseRequisition.delPurchaseRequisitionDetail();', '3', '');
INSERT INTO `t_action` VALUES ('84a6d68db501404625c5401b218aad53', '0a3c97af0b82f321bedfc97d62069feb', '73e31ef538d8f465ed4ca910f831669a', '批量取消审核', 'batchCancelAudit', 'icon-standard-joystick', 'Button', 'enable', 'glacier.purchase_mgr.purchaseRequisition_mgr.purchaseRequisition.batchCancelAuditPurchaseRequisition();', '1', '');
INSERT INTO `t_action` VALUES ('84d847ac3c1150d15029ec71e81da9c7', '222561c0716cce27e6fc8e82eef0bce5', 'e469eecb4bd133c072f247d0d9635979', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseRequisition_mgr.purchaseRequisition.editPurchaseRequisition();', '2', '');
INSERT INTO `t_action` VALUES ('84fd30c2b03282a32dd9e0d552130442', '91ca1b4b197688f21b68a72f69e09a8d', '37011217016636a0723462dbc81bf887', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.user_mgr.user.addUser();', '1', null);
INSERT INTO `t_action` VALUES ('8530139f0e736a796d5ac4bdd78eadc', 'sdsfeg4157cf483a790f4eea35ds5675', '4546fgrgrh1dfhsjdfh124564sdf2sag', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.addOptgroup();', '1', null);
INSERT INTO `t_action` VALUES ('8537147f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '4546fgrgrh1dfhsjdfh124564sdf2sag', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.delOptgroup();', '3', null);
INSERT INTO `t_action` VALUES ('8537899f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '4546fgrgrh1dfhsjdfh124564sdf2sag', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.editOptgroup();', '2', null);
INSERT INTO `t_action` VALUES ('86c6a9871f432ac6696f1beccdf34000', '40b4045ca1b6a457298e76ad34cfb5be', 'ff77e2eb7cff4173eaa531eb708a1527', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.delPurchaseArrival();', '3', '');
INSERT INTO `t_action` VALUES ('872b9916549e55209ca59cb4e1fb5ae9', '801ecf764a95da45ccbd194800c0eeeb', 'bbab3b6621262de4ca87aee3025b8966', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.warehouse_mgr.warehouse.editWarehouse();', '2', '');
INSERT INTO `t_action` VALUES ('884d40589528f855619ab40b43e99922', '801ecf764a95da45ccbd194800c0eeeb', 'bbab3b6621262de4ca87aee3025b8966', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.warehouse_mgr.warehouse.delWarehouse();', '3', '');
INSERT INTO `t_action` VALUES ('885243c9f8e32de2beab2a7627d5dcb1', '63c2cfe82530e29b0312ad52944436ad', '01748f6fbe274d7759d3710fdec609f8', '批量禁用', 'batchDisable', 'icon-standard-joystick', 'Button', 'enable', 'glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturn.batchDisablePurchaseReturn();', '1', '');
INSERT INTO `t_action` VALUES ('897843ed4d61f9ba7d09434e6943590f', '79d4fbfb8f73e4e21ee67e1d6ad9ff5e', 'efe32f25f6d4eab27c74e3dbcf326b47', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.basisClient_mgr.basisClient.editBasisClient();', '2', '');
INSERT INTO `t_action` VALUES ('8ac6203f9d8ad2d2fa9b349aadd2657c', '40b4045ca1b6a457298e76ad34cfb5be', 'ff77e2eb7cff4173eaa531eb708a1527', '启用', 'enable', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.enablePurchaseArrival();', '4', '');
INSERT INTO `t_action` VALUES ('8c8d20ba6b12fbdb94f4244b28ea69cd', '66761e0ea9850fd6cdfc59f282de2ebb', '9e374c52fd0ee843ee81b70c8a1b13d2', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.clientType_mgr.clientType.editClientType();', '2', '');
INSERT INTO `t_action` VALUES ('8cb6abf3445367c52e0e85e878c83e46', 'a35ca1bb25e1f11898c78eb03332554b', '5252a18b51e04ddf499aac66a8245367', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.warOccupationType_mgr.warOccupationType.editWarOccupationType();', '2', '');
INSERT INTO `t_action` VALUES ('8e0c06cd4fe465539e91e3c5731c20a2', '40b4045ca1b6a457298e76ad34cfb5be', '3ae87a2b203944214386ba2d2030a819', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.editPurchaseArrivalDetail();', '2', '');
INSERT INTO `t_action` VALUES ('8e76f210a302f1de38be012cc4ae869d', '96f4fcb49e57d6a1a001718d5c5aeee8', '9bd61e80d5fe7892b77fa5ccc069c825', '终止', 'ter', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseOrder_mgr.purchaseOrder.terPurchaseOrder();', '10', '');
INSERT INTO `t_action` VALUES ('8eb3b50d119f05c30127c3359e4a5d2a', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.role_mgr.role.delRole();', '3', null);
INSERT INTO `t_action` VALUES ('9163777154ed8cc571d1a4ca5ac5d8b1', 'bc38d000dee30299a20f254c0aec0aaf', '511268ad8f3a8e0717381748f5f3ae8d', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.suppliersSource_mgr.suppliersSource.addSuppliersSource();', '1', '');
INSERT INTO `t_action` VALUES ('916e71e34065c3420f97915b67ed12f9', '00451bcfd707a2b5c3b80704f992dc21', '6659f9987cbbdf0721f8935b4a3d5a36', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.purchaseReturnedType_mgr.purchaseReturnedType.addPurchaseReturnedType();', '1', '');
INSERT INTO `t_action` VALUES ('917539b81296b191513c8c5942a5e306', 'c81a4c0156789361600940be2ebdab2c', '628e3c73409f37c6d28bdd97ed61b5fc', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.clientLevel_mgr.clientLevel.addClientLevel();', '1', '');
INSERT INTO `t_action` VALUES ('9320f5b0199abd8d53990eef7cdcd745', '54eb754157cf483a790f4eea35200118', 'eb2a84c4b7bd11632135e4992ade286e', '编辑', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.editAction();', '2', null);
INSERT INTO `t_action` VALUES ('939cfbe44bddcff99deed80e7a472997', 'ebd8d76ac65eea1c8d65ac5c14da27b0', 'cef00aa1a7ab2338e5bb4e85e311af6f', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.comIndustry_mgr.comIndustry.delComIndustry();', '3', '');
INSERT INTO `t_action` VALUES ('96325847f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '3456eg4157cf483a790f4eea35ds5675', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.addOptgroupValue();', '1', null);
INSERT INTO `t_action` VALUES ('9a4afcb595389b7bbf59b08e0f983b0d', '8fc3b6de8076d1e8c3a6514bd29c4c4b', 'c7796dffd9d50588655cfc9d6a297efc', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.comPaymentType_mgr.comPaymentType.delComPaymentType();', '3', '');
INSERT INTO `t_action` VALUES ('9b3983f95a848b517f21ac7433524348', '5935787a3462c25bdeedbb7dd60025bd', 'fbfb879e955211387eafabb50d79e738', '批量取消审核', 'batchCancelAudit', 'icon-standard-joystick', 'Button', 'enable', 'glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.batchCancelAuditPurchaseArrival();', '1', '');
INSERT INTO `t_action` VALUES ('9b3d4e690948a1290f7ccea6327868e0', 'ebd8d76ac65eea1c8d65ac5c14da27b0', 'cef00aa1a7ab2338e5bb4e85e311af6f', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.comIndustry_mgr.comIndustry.addComIndustry();', '1', '');
INSERT INTO `t_action` VALUES ('9cdc3f791b15fe0cfceb6a05e2b8505b', '57de09722e61bad9f9385eb865afc0ab', 'f94ea11ae5c04c27b97b6a086ff3e078', '批量审核', 'batchAudit', 'icon-standard-joystick', 'Button', 'enable', 'glacier.purchase_mgr.purchaseOrder_mgr.purchaseOrder.batchAuditPurchaseOrder();', '1', '');
INSERT INTO `t_action` VALUES ('9cdc7b08f06304c42f1e6c408f170fcb', '93f0fcfa7cdff069d929723062b53211', 'e6784ccad10e3414b99b77b303a338c7', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.variables_mgr.variables.addVariables();', '1', null);
INSERT INTO `t_action` VALUES ('9dfcdfc6becbf920be628c30a8906d80', 'dc2dcb1b303c05b27e9c01dc23dcc5f7', '21f3486dd1b51463c4979dc80ef4009b', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.purchaseType_mgr.purchaseType.delPurchaseType();', '3', '');
INSERT INTO `t_action` VALUES ('9fb2ca3d443f4377d55bb33dc36bd409', '96f4fcb49e57d6a1a001718d5c5aeee8', '9bd61e80d5fe7892b77fa5ccc069c825', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseOrder_mgr.purchaseOrder.editPurchaseOrder();', '2', '');
INSERT INTO `t_action` VALUES ('9ffc444223f48cb8f88a00c5855a6c99', 'ccec6c46d43b0e7c40ce5c1ffc0cb3e5', '0d7ed154eebe739d81a20da996d68e6b', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.purchaseReturnReason_mgr.purchaseReturnReason.editPurchaseReturnReason();', '2', '');
INSERT INTO `t_action` VALUES ('a124a6716dfb677b0654ce2bb4d36546', '8a2f2500fa46e49dd7ff11b688b6c740', 'ad67aaf12a02906ad088a73410fd097e', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.companySize_mgr.companySize.delCompanySize();', '3', '');
INSERT INTO `t_action` VALUES ('a18a84d6a769941ab82dc049814948a0', '16669401121c47c062cac4d11a21522e', '4df3645386cbf2317d35ecf218939b71', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.warOutType_mgr.warOutType.addWarOutType();', '1', '');
INSERT INTO `t_action` VALUES ('a39a10982d5bd7c7435b32040a4d902e', '222561c0716cce27e6fc8e82eef0bce5', 'e469eecb4bd133c072f247d0d9635979', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.purchase_mgr.purchaseRequisition_mgr.purchaseRequisition.delPurchaseRequisition();', '3', '');
INSERT INTO `t_action` VALUES ('a55d3061c3d01adc8e1b0358c49fc4e7', 'd29229a817d81ed224df8c53d2f48f3d', '4284f4950bf67217bf1816260419ebbb', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.quotedPriceType_mgr.quotedPriceType.addQuotedPriceType();', '1', '');
INSERT INTO `t_action` VALUES ('a670a0415538dd3d5c8c428ef7bc8668', '222561c0716cce27e6fc8e82eef0bce5', 'e469eecb4bd133c072f247d0d9635979', '启用', 'enable', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseRequisition_mgr.purchaseRequisition.enablePurchaseRequisition();', '4', '');
INSERT INTO `t_action` VALUES ('a68af5a4e9e91134bf97ded78208b1c5', '66761e0ea9850fd6cdfc59f282de2ebb', '9e374c52fd0ee843ee81b70c8a1b13d2', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.clientType_mgr.clientType.delClientType();', '3', '');
INSERT INTO `t_action` VALUES ('a95fe6b2e5ae6dd8b8492227aa44fd05', 'df777a3e0f601242355caa81019a9a3d', 'e6ab5e4cacae5daeb895569b9e3935fd', '批量启用', 'batchEnable', 'icon-standard-joystick', 'Button', 'enable', 'glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturn.batchEnablePurchaseReturn();', '1', '');
INSERT INTO `t_action` VALUES ('ab0f035104ae27e2fa0a5bd28ebe409e', '16635dfa4b5e1dda4fd5d804f430eeec', '7794769fe25fd3fb2f2534fb8ec9e668', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.clientSource_mgr.clientSource.addClientSource();', '1', '');
INSERT INTO `t_action` VALUES ('ad6560bbcf35c5b8f54fc816fb20d19e', '4cd535b32c8395464ebdd8cca36f3a3a', 'c5cdcd3e45b35765f477502c5b51800d', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturn.addPurchaseReturn();', '1', '');
INSERT INTO `t_action` VALUES ('ae8377f4dee2f49d7ff54d8d7fcc0df6', '0eac3f9c7b4e4cdd5e42c56a16c85147', 'ad6926567cb16be8966308eb36583a57', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.comDeliverType_mgr.comDeliverType.delComDeliverType();', '3', '');
INSERT INTO `t_action` VALUES ('af380e1d69b8495f32c2ca2603af1a57', '96f4fcb49e57d6a1a001718d5c5aeee8', '9bd61e80d5fe7892b77fa5ccc069c825', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.purchase_mgr.purchaseOrder_mgr.purchaseOrder.delPurchaseOrder();', '3', '');
INSERT INTO `t_action` VALUES ('b5852fac0798a25a13b87e8532c60440', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.delMenu();', '3', null);
INSERT INTO `t_action` VALUES ('b5cf238fa008d521b9bc008d3fabd06b', '222561c0716cce27e6fc8e82eef0bce5', 'e469eecb4bd133c072f247d0d9635979', '取消审核', 'cancelAudit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseRequisition_mgr.purchaseRequisition.cancelAuditPurchaseRequisition();', '7', '');
INSERT INTO `t_action` VALUES ('b666b551b8528b1562626fa1b4691e22', '82533b28131409450ad7a00229fd7333', '82385e2a3e64ac4cf4633ccb4c38c480', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.comContactType_mgr.comContactType.delComContactType();', '3', '');
INSERT INTO `t_action` VALUES ('b6a27dc1819230f61617bb0d9c25dd2f', 'dc2dcb1b303c05b27e9c01dc23dcc5f7', '21f3486dd1b51463c4979dc80ef4009b', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.purchaseType_mgr.purchaseType.addPurchaseType();', '1', '');
INSERT INTO `t_action` VALUES ('b6b3ea910e34fea49bc1bc0e557c59de', 'cb88f5de7d6f3f5dfb38474d0cd52986', '4eac4c23176171ce95190b361de571c4', '批量审核', 'batchAudit', 'icon-standard-joystick', 'Button', 'enable', 'glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturn.batchAuditPurchaseReturn();', '1', '');
INSERT INTO `t_action` VALUES ('b7e88da8c1dec3668ca66340dabee03f', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '授权', 'auth', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.role_mgr.role.actionAuth();', '4', null);
INSERT INTO `t_action` VALUES ('b858df774a3292b2e64c92aac5332681', '1b41e29c8712c9f36bc3a520a8e5363b', '95eaa68d7a4109e845d63ef82cdb0d3f', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.financeCostType_mgr.financeCostType.delFinanceCostType();', '3', '');
INSERT INTO `t_action` VALUES ('b86dd096846f200ee7b305eb2562cdc2', 'a4d88b8b3c70b93d69d0bf24ffb09377', '6cfa450f398c5384de09368f8b7094ab', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.suppliers_mgr.suppliers.delSuppliers();', '3', '');
INSERT INTO `t_action` VALUES ('b8b2a1c40e50439fcb4569d7454513ac', '222561c0716cce27e6fc8e82eef0bce5', 'e469eecb4bd133c072f247d0d9635979', '审核', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseRequisition_mgr.purchaseRequisition.auditPurchaseRequisition();', '6', '');
INSERT INTO `t_action` VALUES ('c28dc169ad75cb06b737caa36a4ffd30', '8fc3b6de8076d1e8c3a6514bd29c4c4b', 'c7796dffd9d50588655cfc9d6a297efc', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.comPaymentType_mgr.comPaymentType.addComPaymentType();', '1', '');
INSERT INTO `t_action` VALUES ('c443543fd454dd4ef6df28772c36eb39', '00451bcfd707a2b5c3b80704f992dc21', '6659f9987cbbdf0721f8935b4a3d5a36', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.purchaseReturnedType_mgr.purchaseReturnedType.delPurchaseReturnedType();', '3', '');
INSERT INTO `t_action` VALUES ('c5388f61718417c695d71deabb1fb7f1', '79d4fbfb8f73e4e21ee67e1d6ad9ff5e', 'efe32f25f6d4eab27c74e3dbcf326b47', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.basisClient_mgr.basisClient.delBasisClient();', '3', '');
INSERT INTO `t_action` VALUES ('c5a46f223a3724e1c479e8ecf64e13aa', '904d503fbdeddae78da4db24d8563080', 'da23ee602a07d41e279ffe940cfccf8b', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.clientContact_mgr.clientContact.editClientContact();', '2', '');
INSERT INTO `t_action` VALUES ('c971a7760c5b98501c9e5e7a5598fc15', 'bfe6aa265cb92e35e9920f98a61df508', 'afb1cf326e78fe292af33b76aeef02cd', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.goodsList_mgr.goodsList.editGoodsList();', '2', '');
INSERT INTO `t_action` VALUES ('cab1e5fd5d1bdd3257344d94083b6e0e', '90998bf3c3173da5e8319d70cec8a7ab', 'f664c6028d8cab504f2771fa78d56312', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.sellReturnReason_mgr.sellReturnReason.addSellReturnReason();', '1', '');
INSERT INTO `t_action` VALUES ('ccc389b6852eb8f9d17057d433276b09', '66761e0ea9850fd6cdfc59f282de2ebb', '9e374c52fd0ee843ee81b70c8a1b13d2', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.clientType_mgr.clientType.addClientType();', '1', '');
INSERT INTO `t_action` VALUES ('cdaeca3723236503435cc1bacaaf788b', '0ce2498756e8a266b6a090b5a55d7b23', '3643ad37a97101560e57858eff9b9609', '批量启动', 'batchEnable', 'icon-standard-joystick', 'Button', 'enable', 'glacier.purchase_mgr.purchaseOrder_mgr.purchaseOrder.batchEnablePurchaseOrder();', '1', '');
INSERT INTO `t_action` VALUES ('cfa4a15d6ecbcb2df84427c6b8feaf47', '4cd535b32c8395464ebdd8cca36f3a3a', 'c5cdcd3e45b35765f477502c5b51800d', '取消审核', 'cancelAudit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturn.cancelAuditPurchaseReturn();', '7', '');
INSERT INTO `t_action` VALUES ('d2b13ca067a16fa7913249a713cd0197', '4cd535b32c8395464ebdd8cca36f3a3a', 'c5cdcd3e45b35765f477502c5b51800d', '付款', 'pay', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturn.payPurchaseReturn();', '8', '');
INSERT INTO `t_action` VALUES ('d3fe9a8f005f059002826779db107dd9', '40b4045ca1b6a457298e76ad34cfb5be', 'ff77e2eb7cff4173eaa531eb708a1527', '收货确认', 'affirm', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.affirmPurchaseArrival();', '10', '');
INSERT INTO `t_action` VALUES ('d63b03cd24a29b40ef6a5f652768ea80', '96f4fcb49e57d6a1a001718d5c5aeee8', 'eda50ccf41c512bcfbc194807e338c45', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.purchase_mgr.purchaseOrder_mgr.purchaseOrder.delPurchaseOrderDetail();', '3', '');
INSERT INTO `t_action` VALUES ('d73d2c253aeae1916877f85438ee8062', '4cd535b32c8395464ebdd8cca36f3a3a', '0edc8b49a0eba9200310ea704054d568', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturn.addPurchaseReturnDetail();', '1', '');
INSERT INTO `t_action` VALUES ('d8121384c9b7ffa3e04bde9222f16b72', '90998bf3c3173da5e8319d70cec8a7ab', 'f664c6028d8cab504f2771fa78d56312', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.sellReturnReason_mgr.sellReturnReason.editSellReturnReason();', '2', '');
INSERT INTO `t_action` VALUES ('d82f13907705287eae86336dcc3cf126', '89ed0cefb773a85b9afdc28c70cb7f70', 'd2b941bdcab9ab3bfd214e6c19ae7105', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.warGoodsType_mgr.warGoodsType.editWarGoodsType();', '2', '');
INSERT INTO `t_action` VALUES ('d94d6c0df8ca7322bdbe99279c140243', 'bc38d000dee30299a20f254c0aec0aaf', '511268ad8f3a8e0717381748f5f3ae8d', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.suppliersSource_mgr.suppliersSource.editSuppliersSource();', '2', '');
INSERT INTO `t_action` VALUES ('dad8f671986722837f7eecb2b77c284b', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.editPanel();', '2', null);
INSERT INTO `t_action` VALUES ('dc856e5fdff4bd17953da32ff0a1ec83', 'ea92abb340a62dfd3ecc9b5e4d78c041', '42741ce0beb570a8e14a6bee5b2e9cab', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.warDeployType_mgr.warDeployType.editWarDeployType();', '2', '');
INSERT INTO `t_action` VALUES ('dd965480a3e169d2cdf5b5b03355844a', '40b4045ca1b6a457298e76ad34cfb5be', 'ff77e2eb7cff4173eaa531eb708a1527', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.addPurchaseArrival();', '1', '');
INSERT INTO `t_action` VALUES ('dfa4de7e65c22862671fb990ea28e7cf', '96f4fcb49e57d6a1a001718d5c5aeee8', '9bd61e80d5fe7892b77fa5ccc069c825', '跟踪记录', 'trackDetail', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseOrder_mgr.purchaseOrder.trackDetailPurchaseOrder();', '15', '');
INSERT INTO `t_action` VALUES ('e0353e60007a6227d95c687d56555a4f', '40b4045ca1b6a457298e76ad34cfb5be', 'ff77e2eb7cff4173eaa531eb708a1527', '禁用', 'disable', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.disablePurchaseArrival();', '5', '');
INSERT INTO `t_action` VALUES ('e03a7a0bbff22d4ad4e568bd93967128', '89ed0cefb773a85b9afdc28c70cb7f70', 'd2b941bdcab9ab3bfd214e6c19ae7105', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.warGoodsType_mgr.warGoodsType.delWarGoodsType();', '3', '');
INSERT INTO `t_action` VALUES ('e04af48bbb72b3e506a72ef3f37a654f', '4cd535b32c8395464ebdd8cca36f3a3a', 'c5cdcd3e45b35765f477502c5b51800d', '审核', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturn.auditPurchaseReturn();', '6', '');
INSERT INTO `t_action` VALUES ('e1e5268cff61dc4231932ae1484caf97', '93f0fcfa7cdff069d929723062b53211', 'e6784ccad10e3414b99b77b303a338c7', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.variables_mgr.variables.delVariables();', '3', null);
INSERT INTO `t_action` VALUES ('e31bfd5e94c064bfc89c881f5f214e75', 'c81a4c0156789361600940be2ebdab2c', '628e3c73409f37c6d28bdd97ed61b5fc', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.clientLevel_mgr.clientLevel.delClientLevel();', '3', '');
INSERT INTO `t_action` VALUES ('e3efee26070b25d8135a954ad576ca2c', '40b4045ca1b6a457298e76ad34cfb5be', 'ff77e2eb7cff4173eaa531eb708a1527', '审核', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.auditPurchaseArrival();', '6', '');
INSERT INTO `t_action` VALUES ('e42491080e3eb105c4fa1becb609860a', '801ecf764a95da45ccbd194800c0eeeb', 'bbab3b6621262de4ca87aee3025b8966', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.warehouse_mgr.warehouse.addWarehouse();', '1', '');
INSERT INTO `t_action` VALUES ('e550884c5e6c1e94a970cc833aa1c2b9', '54eb754157cf483a790f4eea35200118', 'eb2a84c4b7bd11632135e4992ade286e', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.res_mgr.res.addAction();', '1', null);
INSERT INTO `t_action` VALUES ('e7a71593371bc3ff47f95b340453d13b', 'a4d88b8b3c70b93d69d0bf24ffb09377', '6cfa450f398c5384de09368f8b7094ab', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.suppliers_mgr.suppliers.addSuppliers();', '1', '');
INSERT INTO `t_action` VALUES ('e7b69a5e675cc63650dd59edb1abe08c', '96f4fcb49e57d6a1a001718d5c5aeee8', '9bd61e80d5fe7892b77fa5ccc069c825', '取消审核', 'cancelAudit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseOrder_mgr.purchaseOrder.cancelAuditPurchaseOrder();', '7', '');
INSERT INTO `t_action` VALUES ('e91fa4796f1973bab0b7a5bff883eaac', '96f4fcb49e57d6a1a001718d5c5aeee8', 'eda50ccf41c512bcfbc194807e338c45', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseOrder_mgr.purchaseOrder.editPurchaseOrderDetail();', '2', '');
INSERT INTO `t_action` VALUES ('e9c13caa85a6d333581bfd26a8d108d7', 'ea92abb340a62dfd3ecc9b5e4d78c041', '42741ce0beb570a8e14a6bee5b2e9cab', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.warDeployType_mgr.warDeployType.delWarDeployType();', '3', '');
INSERT INTO `t_action` VALUES ('eb69f9d028036cdd23fe217cd39bb83e', '24eb7681b66c631e26052279dafca716', '7b034f67886f334a12aeab8c263defef', '批量启动', 'batchEnable', 'icon-standard-joystick', 'Button', 'enable', 'glacier.purchase_mgr.purchaseRequisition_mgr.purchaseRequisition.batchEnablePurchaseRequisition();', '1', '');
INSERT INTO `t_action` VALUES ('edb1cbbfbbc531bfeaee01b0fe77d975', '904d503fbdeddae78da4db24d8563080', 'da23ee602a07d41e279ffe940cfccf8b', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.clientContact_mgr.clientContact.addClientContact();', '1', '');
INSERT INTO `t_action` VALUES ('ee6f881272d3da97f893e48a6da97994', 'aa165bf67dadbeedeb780b3e92dcdcdb', 'eb65d0304dc38ac4db140a1c10fdc7d3', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.sellReturnType_mgr.sellReturnType.delSellReturnType();', '3', '');
INSERT INTO `t_action` VALUES ('ef0a9268c8b0b4d3b2cbc283da1a97e5', '96f4fcb49e57d6a1a001718d5c5aeee8', '9bd61e80d5fe7892b77fa5ccc069c825', '结案', 'clo', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseOrder_mgr.purchaseOrder.cloPurchaseOrder();', '12', '');
INSERT INTO `t_action` VALUES ('efdc621a389623f151e9abc582d7df6e', '4cd535b32c8395464ebdd8cca36f3a3a', 'c5cdcd3e45b35765f477502c5b51800d', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturn.editPurchaseReturn();', '2', '');
INSERT INTO `t_action` VALUES ('f175302ba155cb3c5206619004b5d86b', '810ba3686840457556cb55bc87d8010b', '365eeace84821f6e45d59cefd702827d', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.sellType_mgr.sellType.editSellType();', '2', '');
INSERT INTO `t_action` VALUES ('f314d065f68f2d4be08e5b3a62507815', 'ebd8d76ac65eea1c8d65ac5c14da27b0', 'cef00aa1a7ab2338e5bb4e85e311af6f', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.comIndustry_mgr.comIndustry.editComIndustry();', '2', '');
INSERT INTO `t_action` VALUES ('f4065bd55bb4d1a51db0cc775f854c6e', '0d5f941c0e815519b859afa0992eda0b', 'bbf240fc8c53886e327ff15976026945', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.system_mgr.dep_mgr.dep.editDep();', '2', '');
INSERT INTO `t_action` VALUES ('f4b5eca05e616d411f1aeef044346664', '54eb754157cf483a790f4eea35200118', 'eb2a84c4b7bd11632135e4992ade286e', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.delAction();', '3', null);
INSERT INTO `t_action` VALUES ('f77defad2ded207dd6b9ad004d78f3af', 'c9845e00a5b709d5659d4011119daa67', 'c2a06009f4a31f5c63c6631a869ad813', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.suppliersGrade_mgr.suppliersGrade.editSuppliersGrade();', '2', '');
INSERT INTO `t_action` VALUES ('f79ce922e6b0ce23c604bc303c62ab89', '16669401121c47c062cac4d11a21522e', '4df3645386cbf2317d35ecf218939b71', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.warOutType_mgr.warOutType.editWarOutType();', '2', '');
INSERT INTO `t_action` VALUES ('f8329c4420c9592ba25a22a838af1d15', 'bf47b2f3cc93e5cea6740a62c91a3297', 'b9a33d91c31c0ef3b9350f39cfb0915e', '批量禁用', 'batchDisable', 'icon-standard-joystick', 'Button', 'enable', 'glacier.purchase_mgr.purchaseOrder_mgr.purchaseOrder.batchDisablePurchaseOrder();', '1', '');
INSERT INTO `t_action` VALUES ('f84a5323d1e52ce2f69c652cd3b860e1', '4cd535b32c8395464ebdd8cca36f3a3a', '0edc8b49a0eba9200310ea704054d568', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseReturn_mgr.purchaseReturn.editPurchaseReturnDetail();', '2', '');
INSERT INTO `t_action` VALUES ('f888619460f14c5c2fac0f09908e134d', '96f4fcb49e57d6a1a001718d5c5aeee8', '9bd61e80d5fe7892b77fa5ccc069c825', '取消结案', 'cancelClo', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseOrder_mgr.purchaseOrder.cancelCloPurchaseOrder();', '13', '');
INSERT INTO `t_action` VALUES ('f9f0227e991e0e34029bdb652c58f85c', '222561c0716cce27e6fc8e82eef0bce5', 'e469eecb4bd133c072f247d0d9635979', '禁用', 'disable', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.purchase_mgr.purchaseRequisition_mgr.purchaseRequisition.disablePurchaseRequisition();', '5', '');
INSERT INTO `t_action` VALUES ('fb704c6990a905d7647d761f656a919a', 'c16fc5c61f4ad87b3e2de4104ad3250a', 'a0526b388c633d301f2bfed1110ec9a9', '批量审核', 'batchAudit', 'icon-standard-joystick', 'Button', 'enable', 'glacier.purchase_mgr.purchaseRequisition_mgr.purchaseRequisition.batchAuditPurchaseRequisition();', '1', '');
INSERT INTO `t_action` VALUES ('fc4a79d7d0831e00ec3157c560ce2784', 'aa165bf67dadbeedeb780b3e92dcdcdb', 'eb65d0304dc38ac4db140a1c10fdc7d3', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.sellReturnType_mgr.sellReturnType.addSellReturnType();', '1', '');
INSERT INTO `t_action` VALUES ('fe0aba8fdfd70084f8cb0d942d414747', '40b4045ca1b6a457298e76ad34cfb5be', '3ae87a2b203944214386ba2d2030a819', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.purchase_mgr.purchaseArrival_mgr.purchaseArrival.addPurchaseArrivalDetail();', '1', '');

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
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '0a3c97af0b82f321bedfc97d62069feb', 'BatchCancelAuditReqList_batchCancelAudit');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '0c77cb97fb54089e6b6f89b24d555023', 'PurchaseInvoiceList_add,PurchaseInvoiceList_edit,PurchaseInvoiceList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '0ce2498756e8a266b6a090b5a55d7b23', 'BatchEnableOrderList_batchEnable');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '0d5f941c0e815519b859afa0992eda0b', 'DepList_add,DepList_edit,DepList_del,DepList_assign');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '0eac3f9c7b4e4cdd5e42c56a16c85147', 'ComDeliverTypeList_add,ComDeliverTypeList_edit,ComDeliverTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '14cf54d0d98b03aa15845d63071f9c68', 'SuppliersContactList_add,SuppliersContactList_edit,SuppliersContactList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '14sdf54157cf483a790f4eea35dsf6f6', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '16635dfa4b5e1dda4fd5d804f430eeec', 'ClientSourceList_add,ClientSourceList_edit,ClientSourceList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '16669401121c47c062cac4d11a21522e', 'WarOutTypeList_add,WarOutTypeList_edit,WarOutTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '16ac1df11de350c61722dc7b98cecca7', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '1b41e29c8712c9f36bc3a520a8e5363b', 'FinanceCostTypeList_add,FinanceCostTypeList_edit,FinanceCostTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '2055fc2aca880d69cf7ecef9f48fbd3c', 'BatchDisableArrList_batchDisable');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '222561c0716cce27e6fc8e82eef0bce5', 'PurchaseRequisitionDetailList_add,PurchaseRequisitionDetailList_edit,PurchaseRequisitionDetailList_del,PurchaseRequisitionList_add,PurchaseRequisitionList_edit,PurchaseRequisitionList_del,PurchaseRequisitionList_enable,PurchaseRequisitionList_disable,PurchaseRequisitionList_audit,PurchaseRequisitionList_cancelAudit,PurchaseRequisitionList_order');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '2261cc3a4a23b23bd6317021981fbd1e', 'SuppliersTypeList_add,SuppliersTypeList_edit,SuppliersTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '23e47757685c7b53d87b114e0add3966', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '24eb7681b66c631e26052279dafca716', 'BatchEnableReqList_batchEnable');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '295ffaf17338b3621d532bfe8ee6c779', 'ComNatureList_add,ComNatureList_edit,ComNatureList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '2afb5ed7e423adf169914f7031af78db', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '3323443f95463a891cd336731217d9be', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '3c56b44e8b5257490094b048877422b3', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '40b4045ca1b6a457298e76ad34cfb5be', 'PurchaseArrivalDetailList_add,PurchaseArrivalDetailList_edit,PurchaseArrivalDetailList_del,PurchaseArrivalList_add,PurchaseArrivalList_edit,PurchaseArrivalList_del,PurchaseArrivalList_enable,PurchaseArrivalList_disable,PurchaseArrivalList_audit,PurchaseArrivalList_cancelAudit,PurchaseArrivalList_pay,PurchaseArrivalList_returnGoods,PurchaseArrivalList_affirm,PurchaseArrivalList_cancelAffirm');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '42294ceb4cbc4d64cff0cb5eaafb2d2e', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '4cd535b32c8395464ebdd8cca36f3a3a', 'PurchaseReturnList_add,PurchaseReturnList_edit,PurchaseReturnList_del,PurchaseReturnList_enable,PurchaseReturnList_disable,PurchaseReturnList_audit,PurchaseReturnList_cancelAudit,PurchaseReturnList_pay,PurchaseReturnDetailList_add,PurchaseReturnDetailList_edit,PurchaseReturnDetailList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '4f2b136adfaf68b741d58df8e4adc4ff', 'FinancePayableTypeList_add,FinancePayableTypeList_edit,FinancePayableTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '522545bf918daa876c0c31e3ac4df53d', 'BatchCancelAuditOrderList_batchCancelAudit');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '54eb754157cf483a790f4eea35200118', 'ActionList_add,ActionList_edit,ActionList_del,PanelList_add,PanelList_edit,PanelList_del,MenuTree_add,MenuTree_edit,MenuTree_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '57de09722e61bad9f9385eb865afc0ab', 'BatchAuditOrderList_batchAudit');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '5935787a3462c25bdeedbb7dd60025bd', 'BatchCancelAuditArrList_batchCancelAudit');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '5f51460aaf2854c5c03af9190ef94017', 'BatchAuditArrList_batchAudit');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '63c2cfe82530e29b0312ad52944436ad', 'BatchDisableRetList_batchDisable');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '66761e0ea9850fd6cdfc59f282de2ebb', 'ClientTypeList_add,ClientTypeList_edit,ClientTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '66874136f65e1eb718d4299784f7c7d3', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '79d4fbfb8f73e4e21ee67e1d6ad9ff5e', 'ClientList_add,ClientList_edit,ClientList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '801ecf764a95da45ccbd194800c0eeeb', 'WarehouseList_add,WarehouseList_edit,WarehouseList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '810ba3686840457556cb55bc87d8010b', 'SellTypeList_add,SellTypeList_edit,SellTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '82533b28131409450ad7a00229fd7333', 'ComContactTypeList_add,ComContactTypeList_edit,ComContactTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '89ed0cefb773a85b9afdc28c70cb7f70', 'WarGoodsTypeList_add,WarGoodsTypeList_edit,WarGoodsTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '8a2f2500fa46e49dd7ff11b688b6c740', 'ComCompanySizeList_add,ComCompanySizeList_edit,ComCompanySizeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '8c54260cf2f6704a1739503465d9e9cf', 'FinanceReceivableTypeList_add,FinanceReceivableTypeList_edit,FinanceReceivableTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '8d1aeed3000f03e704609e7ebc5eafb3', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '8fc3b6de8076d1e8c3a6514bd29c4c4b', 'ComPaymentTypeList_add,ComPaymentTypeList_edit,ComPaymentTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '904d503fbdeddae78da4db24d8563080', 'ClientContactList_add,ClientContactList_edit,ClientContactList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '90998bf3c3173da5e8319d70cec8a7ab', 'SellReturnReasonList_add,SellReturnReasonList_edit,SellReturnReasonList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '91ca1b4b197688f21b68a72f69e09a8d', 'UserList_add,UserList_edit,UserList_assign');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '93f0fcfa7cdff069d929723062b53211', 'VariablesList_add,VariablesList_edit,VariablesList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '96f4fcb49e57d6a1a001718d5c5aeee8', 'PurchaseOrderDetailList_add,PurchaseOrderDetailList_edit,PurchaseOrderDetailList_del,PurchaseOrderList_add,PurchaseOrderList_edit,PurchaseOrderList_del,PurchaseOrderList_enable,PurchaseOrderList_disable,PurchaseOrderList_audit,PurchaseOrderList_cancelAudit,PurchaseOrderList_arr,PurchaseOrderList_ter,PurchaseOrderList_cancelTer,PurchaseOrderList_clo,PurchaseOrderList_cancelClo,PurchaseOrderList_track,PurchaseOrderList_trackDetail');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'a35ca1bb25e1f11898c78eb03332554b', 'WarOccupationTypeList_add,WarOccupationTypeList_edit,WarOccupationTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'a4d88b8b3c70b93d69d0bf24ffb09377', 'SuppliersList_add,SuppliersList_edit,SuppliersList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'a7325658a225443d4352659f9a54d516', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'aa165bf67dadbeedeb780b3e92dcdcdb', 'SellReturnTypeList_add,SellReturnTypeList_edit,SellReturnTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'ac892df07f9087fb1c89ac968bb5f555', 'OperalogList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'affd8db9730b330c098c5449c72e72cd', 'BatchDisableReqList_batchDisable');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'b5b37bbe98d7d9737ea77a81aa9f7342', 'BatchCancelAuditRetList_batchCancelAudit');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'bc38d000dee30299a20f254c0aec0aaf', 'SuppliersSourceList_add,SuppliersSourceList_edit,SuppliersSourceList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'bf47b2f3cc93e5cea6740a62c91a3297', 'BatchDisableOrderList_batchDisable');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'bfe6aa265cb92e35e9920f98a61df508', 'GoodsList_add,GoodsList_edit,GoodsList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'c16fc5c61f4ad87b3e2de4104ad3250a', 'BatchAuditReqList_batchAudit');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'c81a4c0156789361600940be2ebdab2c', 'ClientLevelList_add,ClientLevelList_edit,ClientLevelList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'c9845e00a5b709d5659d4011119daa67', 'SuppliersGradeList_add,SuppliersGradeList_edit,SuppliersGradeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'cb88f5de7d6f3f5dfb38474d0cd52986', 'BatchAuditRetList_batchAudit');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'ccec6c46d43b0e7c40ce5c1ffc0cb3e5', 'PurchaseReturnReasonList_add,PurchaseReturnReasonList_edit,PurchaseReturnReasonList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'd29229a817d81ed224df8c53d2f48f3d', 'PurchaseQuotedPriceTypeList_add,PurchaseQuotedPriceTypeList_edit,PurchaseQuotedPriceTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'd41096a0247a0b5768f8f39e9bd357ab', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'd46b0600ead708c4f5827b7082f2490a', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'dc2dcb1b303c05b27e9c01dc23dcc5f7', 'PurchaseTypeList_add,PurchaseTypeList_edit,PurchaseTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'df777a3e0f601242355caa81019a9a3d', 'BatchEnableRetList_batchEnable');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'e26f7b5d1601735ab0b123632afe02c5', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'e42b98561176563f930d82c80b041ed8', 'LoginlogList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'e550884c5e6c1e94ee70cc833aa1c2b9', 'RoleList_add,RoleList_edit,RoleList_del,RoleList_auth');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'e7017db1f6af77a208004d7bf98dc2af', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'e8a2f672e16b2dcaf720a8b0586e99fd', 'WarInTypeList_add,WarInTypeList_edit,WarInTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'ea92abb340a62dfd3ecc9b5e4d78c041', 'WarDeployTypeList_add,WarDeployTypeList_edit,WarDeployTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'ebd8d76ac65eea1c8d65ac5c14da27b0', 'ComIndustryList_add,ComIndustryList_edit,ComIndustryList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'efb8f52b5c4539e98c9d4215e792cb4e', 'BatchEnableArrList_batchEnable');
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
INSERT INTO `t_basis_client` VALUES ('2cd9ab8208958194df457bb1f37fc8b3', 'client2015_01_15_14_06_01', 'a87523ee368501cc80d1de87519d4dc2', '珠海市魅族有限公司', '2faf4886abcb93565c3d6c69339ccf9c', '7681c1350084dadd51934e3fb3ed221f', null, null, '39185726a792f1192869439b2dbe6a68', '管理部', '', '', '', '', '广东省', '珠海市', '广东省珠海市香洲区', '', 'policy2', null, '456943fef9434c97595c9ac49c4e6dba', '', null, null, '小吴', null, null, '中国银行', '622055515666655', '3265524555', 'yes', null, null, null, null, null, null, null, '', '', '8b25651c2d896297530b64e4b80ec503', 'enable', '', null, null, null, null, '超级管理员', '2015-01-15 14:06:01', '超级管理员', '2015-01-15 14:06:01');
INSERT INTO `t_basis_client` VALUES ('d6e9a6bcddbe5fbf3bb7276d8a6e6e21', 'client2015_01_15_14_07_02', '1afa46b9c1063c4ff333607d6b8042e6', '小米有限公司', '218395643d16d90442db44e298b3496b', '209d91c5102da69db4b2e93cc1f67426', null, null, '26a093f5603e8152077c1f4ce8fc02ad', '管理部', '', '', '', '', '', '', '', '', 'policy3', null, '887acdc7a787d0b1f3f55b22cb5adedd', '', null, null, '', null, null, '中国银行', '62205954464654', '', 'yes', null, null, null, null, null, null, null, '2cd9ab8208958194df457bb1f37fc8b3', '', '8b25651c2d896297530b64e4b80ec503', 'enable', '', null, null, null, null, '超级管理员', '2015-01-15 14:07:02', '超级管理员', '2015-01-15 14:07:02');

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
INSERT INTO `t_dep` VALUES ('04186ef8d2e5dca245506732e11b7496', '销售部_A', 'sell_A', '9aadf56ac5f8ba2a7c6945aa31d1f2e8', '1', '', '超级管理员', '2015-01-15 17:10:24');
INSERT INTO `t_dep` VALUES ('135dd5299e3fa0029b92533ae300c143', '采购总部', 'purchase', null, '1', '', '超级管理员', '2015-01-15 17:11:13');
INSERT INTO `t_dep` VALUES ('1ff32f3ab5bd95584a429130956fecea', '管理部', 'system', null, '1', '', 'admin', '2015-01-06 17:10:21');
INSERT INTO `t_dep` VALUES ('20433476c911a7804aa8e5c43f2b8b16', '采购部_A', 'purchase_A', '135dd5299e3fa0029b92533ae300c143', '1', '', '超级管理员', '2015-01-15 17:17:25');
INSERT INTO `t_dep` VALUES ('2fae527622659411b5cf466793cd6', '开发总部', 'develop', null, '2', '1', '2', '2015-01-05 16:50:55');
INSERT INTO `t_dep` VALUES ('5484ccad10e3414b99b77b303as62', '开发部_A', 'develop_A', '2fae527622659411b5cf466793cd6', '2', '2', '65', '2015-01-05 17:06:57');
INSERT INTO `t_dep` VALUES ('8489385d4c74e47f1a3d77c9932644a9', '采购部_B', 'purchase_B', '135dd5299e3fa0029b92533ae300c143', '2', '', '超级管理员', '2015-01-15 17:17:47');
INSERT INTO `t_dep` VALUES ('8ed000a5781bcfb2448a0dd5067ea709', '仓库部', 'warehouse', null, '6', '', '超级管理员', '2015-01-15 17:12:51');
INSERT INTO `t_dep` VALUES ('9aadf56ac5f8ba2a7c6945aa31d1f2e8', '销售总部', 'sell', null, '3', '', '超级管理员', '2015-01-15 17:09:51');
INSERT INTO `t_dep` VALUES ('b21f25be5e8fdccb5f53aabfdac1f329', '销售部_B', 'sell_B', '9aadf56ac5f8ba2a7c6945aa31d1f2e8', '2', '', '超级管理员', '2015-01-15 17:13:24');
INSERT INTO `t_dep` VALUES ('b6bac45f4027ffaa85fbd6f25f469d32', '财务部', 'finance', null, '5', '', '超级管理员', '2015-01-15 17:11:45');

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
INSERT INTO `t_goods_list` VALUES ('1', 'GD_001', '仙贝', '食物类', '3c136a164ca37156fadb393c94b77a46', '62a73e97049a17a9ec325a5e3e68e65e', 'GD_001', 'GD_SP_001', '张三', '包', '0.0010', '比列计算', '0.0100', 'yes', 'yes', '5.0000', '10.0000', '12.0000', '5.0000', '6.0000', '7.0000', '8.0000', '9.0000', '10.0000', '11.0000', '12.0000', '13.0000', '14.0000', 'image', '珠海', '旺旺', '旺旺小馒头', '2015-01-09 00:00:00', '2015-01-10 00:00:00', '546aa3d14b0f8d8af3f31bd761454980', '20433476c911a7804aa8e5c43f2b8b16', 'enable', '超级管理员', '2015-01-09 16:51:41', 'pass', '超级管理员', '通过', '超级管理员', '2015-01-09 16:53:38', '超级管理员', '2015-01-22 17:41:37');
INSERT INTO `t_goods_list` VALUES ('6fbccbb745c2d67bc9540f4e3c0cafe5', 'GD_6296', '锥子', '792fb0107f931b65d27352d02981d395', '792fb0107f931b65d27352d02981d395', '34fcfe262dd4016a8348bdd4e0d83030', null, 'SP_6296', '个', '个', '20.0000', '10', '10.0000', 'yes', 'yes', '20.0000', '30.0000', '40.0000', '50.0000', null, null, null, null, null, null, null, null, null, null, '深圳', '深圳', '刚石', '2015-01-23 00:00:00', '2015-01-21 00:00:00', '6a28fdc7af46a33ba7ca10910e1e33b1', '5484ccad10e3414b99b77b303as62', 'enable', '超级管理员', '2015-01-23 16:35:55', 'pass', null, '', '超级管理员', '2015-01-23 16:35:55', '超级管理员', '2015-01-23 16:35:55');
INSERT INTO `t_goods_list` VALUES ('a471a158d1108d20681ccf25cd8c521c', 'GD_8841', '方便面', '3c136a164ca37156fadb393c94b77a46', '3c136a164ca37156fadb393c94b77a46', '62a73e97049a17a9ec325a5e3e68e65e', null, 'SP_8841', '包', '包', '1.0000', '1', '1.0000', 'yes', 'yes', '2.0000', '3.0000', '2.0000', '2.0000', null, null, null, null, null, null, null, null, null, null, '珠海市', '珠海市', '康师傅', '2015-01-23 00:00:00', '2015-01-23 00:00:00', '62717e26384e41f4a7209e5cbefbc3a8', '8489385d4c74e47f1a3d77c9932644a9', 'enable', '超级管理员', '2015-01-23 16:32:53', 'pass', null, '', '超级管理员', '2015-01-23 16:32:53', '超级管理员', '2015-01-23 16:32:53');
INSERT INTO `t_goods_list` VALUES ('adf0c5295147a7c0ca3098a9f0fe704a', 'GD_9696', '青岛啤酒', '3c136a164ca37156fadb393c94b77a46', '3c136a164ca37156fadb393c94b77a46', '62a73e97049a17a9ec325a5e3e68e65e', null, 'SP_9696', '支', '支', '5.0000', '5', '3.0000', 'yes', 'yes', '2.0000', '4.0000', '3.0000', '5.0000', null, null, null, null, null, null, null, null, null, null, '青岛', '青岛', '青岛', '2015-01-23 00:00:00', '2015-01-23 00:00:00', '546aa3d14b0f8d8af3f31bd761454980', '20433476c911a7804aa8e5c43f2b8b16', 'enable', '超级管理员', '2015-01-23 16:33:50', 'pass', null, '', '超级管理员', '2015-01-23 16:33:50', '超级管理员', '2015-01-23 16:33:50');
INSERT INTO `t_goods_list` VALUES ('f89c5e076b6900765eb3feb2987d7f88', 'GD_6822', '香水', 'b2b25c4b9ab4172b8903f75f8bfd6d27', 'b2b25c4b9ab4172b8903f75f8bfd6d27', '3bd2455b1e73171579f68c68f7d20080', null, 'SP_6822', '支', '支', '20.0000', '20', '20.0000', 'yes', 'yes', '25.0000', '40.0000', '30.0000', '50.0000', null, null, null, null, null, null, null, null, null, null, '北京', '郎龙', '郎龙', '2015-01-23 00:00:00', '2015-01-23 00:00:00', '62717e26384e41f4a7209e5cbefbc3a8', '8489385d4c74e47f1a3d77c9932644a9', 'enable', '超级管理员', '2015-01-23 16:34:54', 'pass', null, '', '超级管理员', '2015-01-23 16:34:54', '超级管理员', '2015-01-23 16:34:54');

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
INSERT INTO `t_loginlog` VALUES ('10e4cc3a8958fa9657863f807e1c4ba6', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-02-03 09:12:14', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('54aea19016bb943c9676126fdf123267', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-02-02 15:17:38', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('66a5ba1ba5f203408018dcae408b4d18', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-02-03 09:07:28', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('68485fb422c5d15355b501dc54a8e467', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-01-30 15:53:14', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('6ff3ca60d84e3c4c32895f288697c8c9', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-01-31 09:07:27', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('78558930576b7906f80c859488d985de', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-01-30 16:19:45', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('873f74c649059abc0bd251646cb2efe8', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-01-31 17:28:18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('992e44e85be4d35e12bc4a11375ea3cd', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-02-02 10:46:29', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('9b298944e5ce2bcb5852d309a95a3054', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-02-03 13:24:26', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('c251ae132b3a147e36d4e8811447b785', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2015-02-02 09:16:19', '127.0.0.1[本地]', null, null);

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
INSERT INTO `t_menu` VALUES ('07d7e1fd5f95ab20e7cb3090cd8ac7ba', '42294ceb4cbc4d64cff0cb5eaafb2d2e', 'purchaseManage', '采购参数', 'icon-cologne-process', '', '2', '');
INSERT INTO `t_menu` VALUES ('0a3c97af0b82f321bedfc97d62069feb', 'a7325658a225443d4352659f9a54d516', 'batchCancelAuditReq', '批量取消审核', 'icon-standard-joystick', '/do/purchaseRequisition/batchCancelAudit.htm', '2', '');
INSERT INTO `t_menu` VALUES ('0c77cb97fb54089e6b6f89b24d555023', '8d1aeed3000f03e704609e7ebc5eafb3', 'purchaseInvoice', '采购发票', 'icon-cologne-suppliers', '/do/purchaseInvoice/index.htm', '9', '');
INSERT INTO `t_menu` VALUES ('0ce2498756e8a266b6a090b5a55d7b23', 'd41096a0247a0b5768f8f39e9bd357ab', 'batchEnableOrder', '批量启动', 'icon-standard-joystick', '/do/purchaseOrder/batchEnable.htm', '3', '');
INSERT INTO `t_menu` VALUES ('0d5f941c0e815519b859afa0992eda0b', '16ac1df11de350c61722dc7b98cecca7', 'dep', '部门管理', 'icon-standard-folder-user', '/do/dep/index.htm', '2', '');
INSERT INTO `t_menu` VALUES ('0eac3f9c7b4e4cdd5e42c56a16c85147', 'fd696e8607c36c917f546787976f4fa8', 'comDeliverType', '交货方式', 'icon-standard-application-tile-horizontal', '/do/comDeliverType/index.htm', '3', '');
INSERT INTO `t_menu` VALUES ('14cf54d0d98b03aa15845d63071f9c68', '2afb5ed7e423adf169914f7031af78db', 'suppliersContact', '供应商联系人', 'icon-standard-user', '/do/suppliersContact/index.htm', '4', '');
INSERT INTO `t_menu` VALUES ('14sdf54157cf483a790f4eea35dsf6f6', null, 'basicdatas', '参数管理', 'icon-standard-application-xp-terminal', '', '12', '');
INSERT INTO `t_menu` VALUES ('16635dfa4b5e1dda4fd5d804f430eeec', 'd46b0600ead708c4f5827b7082f2490a', 'clientSource', '客户来源', 'icon-standard-group', '/do/clientSource/index.htm', '3', '');
INSERT INTO `t_menu` VALUES ('16669401121c47c062cac4d11a21522e', '66874136f65e1eb718d4299784f7c7d3', 'warOutType', '出库业务类型', 'icon-standard-brick', '/do/warOutType/index.htm', '2', '');
INSERT INTO `t_menu` VALUES ('16ac1df11de350c61722dc7b98cecca7', null, 'system', '系统设置', 'icon-standard-cog', '', '1', '');
INSERT INTO `t_menu` VALUES ('1b41e29c8712c9f36bc3a520a8e5363b', '3c56b44e8b5257490094b048877422b3', 'financeCostType', '费用类型', 'icon-standard-coins', '/do/financeCostType/index.htm', '3', '');
INSERT INTO `t_menu` VALUES ('2055fc2aca880d69cf7ecef9f48fbd3c', 'e26f7b5d1601735ab0b123632afe02c5', 'batchDisableArr', '批量禁用', 'icon-standard-joystick', '/do/purchaseArrival/batchDisable.htm', '4', '');
INSERT INTO `t_menu` VALUES ('222561c0716cce27e6fc8e82eef0bce5', '8d1aeed3000f03e704609e7ebc5eafb3', 'purchaseRequisition', '采购申请', 'icon-cologne-suppliers', '/do/purchaseRequisition/index.htm', '1', '');
INSERT INTO `t_menu` VALUES ('2261cc3a4a23b23bd6317021981fbd1e', '2afb5ed7e423adf169914f7031af78db', 'suppliersType', '供应商类型', 'icon-standard-user', '/do/suppliersType/index.htm', '1', '');
INSERT INTO `t_menu` VALUES ('23e47757685c7b53d87b114e0add3966', '42294ceb4cbc4d64cff0cb5eaafb2d2e', 'sellManage', '销售参数', 'icon-cologne-future-projects', '', '3', '');
INSERT INTO `t_menu` VALUES ('24eb7681b66c631e26052279dafca716', 'a7325658a225443d4352659f9a54d516', 'batchEnableReq', '批量启动', 'icon-standard-joystick', '/do/purchaseRequisition/batchEnable.htm', '3', '');
INSERT INTO `t_menu` VALUES ('295ffaf17338b3621d532bfe8ee6c779', 'fd696e8607c36c917f546787976f4fa8', 'comNature', '公司性质', 'icon-cologne-bank', '/do/comNature/index.htm', '5', '');
INSERT INTO `t_menu` VALUES ('2afb5ed7e423adf169914f7031af78db', '42294ceb4cbc4d64cff0cb5eaafb2d2e', 'suppliersManage', '供应商管理', 'icon-standard-user', '', '6', '');
INSERT INTO `t_menu` VALUES ('3323443f95463a891cd336731217d9be', '42294ceb4cbc4d64cff0cb5eaafb2d2e', 'warGoodsManage', '仓库货品管理', 'icon-hamburg-database', '', '8', '');
INSERT INTO `t_menu` VALUES ('3c56b44e8b5257490094b048877422b3', '42294ceb4cbc4d64cff0cb5eaafb2d2e', 'financeManage', '财务参数', 'icon-standard-coins', '', '5', '');
INSERT INTO `t_menu` VALUES ('40b4045ca1b6a457298e76ad34cfb5be', '8d1aeed3000f03e704609e7ebc5eafb3', 'purchaseArrival', '采购到货', 'icon-cologne-suppliers', '/do/purchaseArrival/index.htm', '5', '');
INSERT INTO `t_menu` VALUES ('42294ceb4cbc4d64cff0cb5eaafb2d2e', '14sdf54157cf483a790f4eea35dsf6f6', 'dropDown ', '下拉项维护', 'icon-standard-add', '', '1', '');
INSERT INTO `t_menu` VALUES ('4cd535b32c8395464ebdd8cca36f3a3a', '8d1aeed3000f03e704609e7ebc5eafb3', 'purchaseReturn', '采购退货', 'icon-cologne-suppliers', '/do/purchaseReturn/index.htm', '7', '');
INSERT INTO `t_menu` VALUES ('4f2b136adfaf68b741d58df8e4adc4ff', '3c56b44e8b5257490094b048877422b3', 'financePayableType', '应付类型', 'icon-standard-coins', '/do/financePayableType/index.htm', '2', '');
INSERT INTO `t_menu` VALUES ('522545bf918daa876c0c31e3ac4df53d', 'd41096a0247a0b5768f8f39e9bd357ab', 'batchCancelAuditOrder', '批量取消审核', 'icon-standard-joystick', '/do/purchaseOrder/batchCancelAudit.htm', '2', '');
INSERT INTO `t_menu` VALUES ('54eb754157cf483a790f4eea35200118', '16ac1df11de350c61722dc7b98cecca7', 'res', '资源管理', 'icon-cologne-featured', '/do/res/index.htm', '4', '');
INSERT INTO `t_menu` VALUES ('57de09722e61bad9f9385eb865afc0ab', 'd41096a0247a0b5768f8f39e9bd357ab', 'batchAuditOrder', '批量审核', 'icon-standard-joystick', '/do/purchaseOrder/batchAudit.htm', '1', '');
INSERT INTO `t_menu` VALUES ('5935787a3462c25bdeedbb7dd60025bd', 'e26f7b5d1601735ab0b123632afe02c5', 'batchCancelAuditArr', '批量取消审核', 'icon-standard-joystick', '/do/purchaseArrival/batchCancelAudit.htm', '2', '');
INSERT INTO `t_menu` VALUES ('5f51460aaf2854c5c03af9190ef94017', 'e26f7b5d1601735ab0b123632afe02c5', 'batchAuditArr', '批量审核', 'icon-standard-joystick', '/do/purchaseArrival/batchAudit.htm', '1', '');
INSERT INTO `t_menu` VALUES ('63c2cfe82530e29b0312ad52944436ad', 'e7017db1f6af77a208004d7bf98dc2af', 'batchDisableRet', '批量禁用', 'icon-standard-joystick', '/do/purchaseReturn/batchDisable.htm', '4', '');
INSERT INTO `t_menu` VALUES ('66761e0ea9850fd6cdfc59f282de2ebb', 'd46b0600ead708c4f5827b7082f2490a', 'clientType', '客户类型', 'icon-standard-group', '/do/clientType/index.htm', '1', '');
INSERT INTO `t_menu` VALUES ('66874136f65e1eb718d4299784f7c7d3', '42294ceb4cbc4d64cff0cb5eaafb2d2e', 'warehouseManage', '库存参数', 'icon-standard-brick', '', '4', '');
INSERT INTO `t_menu` VALUES ('79d4fbfb8f73e4e21ee67e1d6ad9ff5e', '14sdf54157cf483a790f4eea35dsf6f6', 'client', '客户档案', 'icon-standard-book-open', '/do/client/index.htm', '3', '');
INSERT INTO `t_menu` VALUES ('801ecf764a95da45ccbd194800c0eeeb', '14sdf54157cf483a790f4eea35dsf6f6', 'warehouse', '仓库管理', 'icon-standard-brick', '/do/warehouse/index.htm', '5', '');
INSERT INTO `t_menu` VALUES ('810ba3686840457556cb55bc87d8010b', '23e47757685c7b53d87b114e0add3966', 'sellType', '销售类型', 'icon-standard-page-gear', '/do/sellType/index.htm', '1', '');
INSERT INTO `t_menu` VALUES ('82533b28131409450ad7a00229fd7333', 'fd696e8607c36c917f546787976f4fa8', 'comContactType', '联系人类型', 'icon-standard-vcard', '/do/comContactType/index.htm', '7', '');
INSERT INTO `t_menu` VALUES ('89ed0cefb773a85b9afdc28c70cb7f70', '3323443f95463a891cd336731217d9be', 'warGoodsType', '仓库货品分类', 'icon-hamburg-database', '/do/warGoodsType/index.htm', '1', '');
INSERT INTO `t_menu` VALUES ('8a2f2500fa46e49dd7ff11b688b6c740', 'fd696e8607c36c917f546787976f4fa8', 'comCompanySize', '公司规模', 'icon-hamburg-customers', '/do/comCompanySize/index.htm', '2', '');
INSERT INTO `t_menu` VALUES ('8c54260cf2f6704a1739503465d9e9cf', '3c56b44e8b5257490094b048877422b3', 'financeReceivableType', '应收类型', 'icon-standard-coins', '/do/financeReceivableType/index.htm', '1', '');
INSERT INTO `t_menu` VALUES ('8d1aeed3000f03e704609e7ebc5eafb3', null, 'purchase', '采购管理', 'icon-cologne-suppliers', '', '3', '');
INSERT INTO `t_menu` VALUES ('8fc3b6de8076d1e8c3a6514bd29c4c4b', 'fd696e8607c36c917f546787976f4fa8', 'comPaymentType', '支付方式', 'icon-standard-arrow-switch', '/do/comPaymentType/index.htm', '4', '');
INSERT INTO `t_menu` VALUES ('904d503fbdeddae78da4db24d8563080', 'd46b0600ead708c4f5827b7082f2490a', 'clientContact', '客户联系人', 'icon-standard-group', '/do/clientContact/index.htm', '4', '');
INSERT INTO `t_menu` VALUES ('90998bf3c3173da5e8319d70cec8a7ab', '23e47757685c7b53d87b114e0add3966', 'sellReturnReason', '销售退货原因', 'icon-cologne-publish', '/do/sellReturnReason/index.htm', '3', '');
INSERT INTO `t_menu` VALUES ('91ca1b4b197688f21b68a72f69e09a8d', '16ac1df11de350c61722dc7b98cecca7', 'user', '管理员设置', 'icon-hamburg-hire-me', '/do/user/index.htm', '1', '');
INSERT INTO `t_menu` VALUES ('93f0fcfa7cdff069d929723062b53211', '14sdf54157cf483a790f4eea35dsf6f6', 'variables', '系统变量', 'icon-standard-layout-content', '/do/variables/index.htm', '12', '');
INSERT INTO `t_menu` VALUES ('96f4fcb49e57d6a1a001718d5c5aeee8', '8d1aeed3000f03e704609e7ebc5eafb3', 'purchaseOrder', '采购订购合同', 'icon-cologne-suppliers', '/do/purchaseOrder/index.htm', '3', '');
INSERT INTO `t_menu` VALUES ('a35ca1bb25e1f11898c78eb03332554b', '66874136f65e1eb718d4299784f7c7d3', 'warOccupationType', '锁定类型', 'icon-standard-brick', '/do/warOccupationType/index.htm', '4', '');
INSERT INTO `t_menu` VALUES ('a4d88b8b3c70b93d69d0bf24ffb09377', '14sdf54157cf483a790f4eea35dsf6f6', 'suppliers', '供应商档案', 'icon-cologne-customers', '/do/suppliers/index.htm', '2', '');
INSERT INTO `t_menu` VALUES ('a7325658a225443d4352659f9a54d516', '222561c0716cce27e6fc8e82eef0bce5', 'batchReq', '批量操作', 'icon-standard-joystick', '', '1', '');
INSERT INTO `t_menu` VALUES ('aa165bf67dadbeedeb780b3e92dcdcdb', '23e47757685c7b53d87b114e0add3966', 'sellReturnType', '销售退货方式', 'icon-standard-script', '/do/sellReturnType/index.htm', '2', '');
INSERT INTO `t_menu` VALUES ('ac892df07f9087fb1c89ac968bb5f555', '16ac1df11de350c61722dc7b98cecca7', 'operalog', '操作日志', 'icon-standard-report-key', '/do/operalog/index.htm', '5', '');
INSERT INTO `t_menu` VALUES ('affd8db9730b330c098c5449c72e72cd', 'a7325658a225443d4352659f9a54d516', 'batchDisableReq', '批量禁用', 'icon-standard-joystick', '/do/purchaseRequisition/batchDisable.htm', '4', '');
INSERT INTO `t_menu` VALUES ('b5b37bbe98d7d9737ea77a81aa9f7342', 'e7017db1f6af77a208004d7bf98dc2af', 'batchCancelAuditRet', '批量取消审核', 'icon-standard-joystick', '/do/purchaseReturn/batchCancelAudit.htm', '2', '');
INSERT INTO `t_menu` VALUES ('bc38d000dee30299a20f254c0aec0aaf', '2afb5ed7e423adf169914f7031af78db', 'suppliersSource', '供应商来源', 'icon-standard-user', '/do/suppliersSource/index.htm', '3', '');
INSERT INTO `t_menu` VALUES ('bf47b2f3cc93e5cea6740a62c91a3297', 'd41096a0247a0b5768f8f39e9bd357ab', 'batchDisableOrder', '批量禁用', 'icon-standard-joystick', '/do/purchaseOrder/batchDisable.htm', '4', '');
INSERT INTO `t_menu` VALUES ('bfe6aa265cb92e35e9920f98a61df508', '14sdf54157cf483a790f4eea35dsf6f6', 'goodsList', '货品档案', 'icon-standard-server-database', '/do/goodsList/index.htm', '4', '');
INSERT INTO `t_menu` VALUES ('c16fc5c61f4ad87b3e2de4104ad3250a', 'a7325658a225443d4352659f9a54d516', 'batchAuditReq', '批量审核', 'icon-standard-joystick', '/do/purchaseRequisition/batchAudit.htm', '1', '');
INSERT INTO `t_menu` VALUES ('c81a4c0156789361600940be2ebdab2c', 'd46b0600ead708c4f5827b7082f2490a', 'clientLevel', '客户级别', 'icon-standard-group', '/do/clientLevel/index.htm', '2', '');
INSERT INTO `t_menu` VALUES ('c9845e00a5b709d5659d4011119daa67', '2afb5ed7e423adf169914f7031af78db', 'suppliersGrade', '供应商级别', 'icon-standard-user', '/do/suppliersGrade/index.htm', '2', '');
INSERT INTO `t_menu` VALUES ('cb88f5de7d6f3f5dfb38474d0cd52986', 'e7017db1f6af77a208004d7bf98dc2af', 'batchAuditRet', '批量审核', 'icon-standard-joystick', '/do/purchaseReturn/batchAudit.htm', '1', '');
INSERT INTO `t_menu` VALUES ('ccec6c46d43b0e7c40ce5c1ffc0cb3e5', '07d7e1fd5f95ab20e7cb3090cd8ac7ba', 'purchaseReturnReason', '退货原因', 'icon-cologne-order', '/do/purchaseReturnReason/index.htm', '3', '');
INSERT INTO `t_menu` VALUES ('d29229a817d81ed224df8c53d2f48f3d', '07d7e1fd5f95ab20e7cb3090cd8ac7ba', 'purchaseQuotedPriceType', '报价类型', 'icon-cologne-invoice', '/do/purchaseQuotedPriceType/index.htm', '5', '');
INSERT INTO `t_menu` VALUES ('d41096a0247a0b5768f8f39e9bd357ab', '96f4fcb49e57d6a1a001718d5c5aeee8', 'batchOrder', '批量操作', 'icon-standard-joystick', '', '1', '');
INSERT INTO `t_menu` VALUES ('d46b0600ead708c4f5827b7082f2490a', '42294ceb4cbc4d64cff0cb5eaafb2d2e', 'clientManage', '客户管理', 'icon-standard-group', '', '7', '');
INSERT INTO `t_menu` VALUES ('dc2dcb1b303c05b27e9c01dc23dcc5f7', '07d7e1fd5f95ab20e7cb3090cd8ac7ba', 'purchaseType', '采购类型', 'icon-hamburg-sitemap', '/do/purchaseType/index.htm', '1', '');
INSERT INTO `t_menu` VALUES ('df777a3e0f601242355caa81019a9a3d', 'e7017db1f6af77a208004d7bf98dc2af', 'batchEnableRet', '批量启用', 'icon-standard-joystick', '/do/purchaseReturn/batchEnable.htm', '3', '');
INSERT INTO `t_menu` VALUES ('e26f7b5d1601735ab0b123632afe02c5', '40b4045ca1b6a457298e76ad34cfb5be', 'batchArr', '批量操作', 'icon-standard-joystick', '', '1', '');
INSERT INTO `t_menu` VALUES ('e42b98561176563f930d82c80b041ed8', '16ac1df11de350c61722dc7b98cecca7', 'loginlog', '登录日志', 'icon-standard-report-edit', '/do/loginlog/index.htm', '6', '');
INSERT INTO `t_menu` VALUES ('e550884c5e6c1e94ee70cc833aa1c2b9', '16ac1df11de350c61722dc7b98cecca7', 'role', '角色管理', 'icon-hamburg-customers', '/do/role/index.htm', '3', '');
INSERT INTO `t_menu` VALUES ('e7017db1f6af77a208004d7bf98dc2af', '4cd535b32c8395464ebdd8cca36f3a3a', 'batchRet', '批量操作', 'icon-standard-joystick', '', '1', '');
INSERT INTO `t_menu` VALUES ('e8a2f672e16b2dcaf720a8b0586e99fd', '66874136f65e1eb718d4299784f7c7d3', 'warInType', '入库业务类型', 'icon-standard-brick', '/do/warInType/index.htm', '1', '');
INSERT INTO `t_menu` VALUES ('ea92abb340a62dfd3ecc9b5e4d78c041', '66874136f65e1eb718d4299784f7c7d3', 'warDeployType', '调拨类型', 'icon-standard-brick', '/do/warDeployType/index.htm', '3', '');
INSERT INTO `t_menu` VALUES ('ebd8d76ac65eea1c8d65ac5c14da27b0', 'fd696e8607c36c917f546787976f4fa8', 'comIndustry', '行业管理', 'icon-hamburg-config', '/do/comIndustry/index.htm', '1', '');
INSERT INTO `t_menu` VALUES ('efb8f52b5c4539e98c9d4215e792cb4e', 'e26f7b5d1601735ab0b123632afe02c5', 'batchEnableArr', '批量启用', 'icon-standard-joystick', '/do/purchaseArrival/batchEnable.htm', '3', '');
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
INSERT INTO `t_operalog` VALUES ('018ee4e892e3843c5195e7bdb916fca7', '资源管理', '面板列表', '修改', '1', '[批量取消审核列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2015-02-03 13:16:07');
INSERT INTO `t_operalog` VALUES ('072e75e557ee31e593e95aa1615f8161', '资源管理', '面板列表', '增加', '1', '[批量禁用列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2015-02-02 15:59:06');
INSERT INTO `t_operalog` VALUES ('0e9b5fd5e4e0369ecd5d5b9be0aefc8f', '资源管理', '菜单树', '修改', '1', '[批量操作] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-02-03 13:13:43');
INSERT INTO `t_operalog` VALUES ('0f4d70ffa0bef547505f695b68f1700e', '资源管理', '操作列表', '编辑', '1', '[批量取消审核] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-02-02 15:27:17');
INSERT INTO `t_operalog` VALUES ('0f6735a5f528b8b1fd0c040d2e52750c', '资源管理', '菜单树', '修改', '1', '[批量禁用] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-02-03 13:23:21');
INSERT INTO `t_operalog` VALUES ('10396ca595255991f860c41843b9b436', '资源管理', '面板列表', '增加', '1', '[批量启用列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2015-02-02 16:41:42');
INSERT INTO `t_operalog` VALUES ('11623e66e25378a95070703751c5d747', '资源管理', '操作列表', '增加', '1', '[批量禁用] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-31 17:11:03');
INSERT INTO `t_operalog` VALUES ('13614dc634d99e0cc36aa978dfe15d73', '资源管理', '面板列表', '增加', '1', '[批量禁用列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2015-02-02 16:43:10');
INSERT INTO `t_operalog` VALUES ('15b4c1aaaeb08f3e69a09ad2a7cb4caa', '资源管理', '菜单树', '修改', '1', '[批量操作] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-02-03 13:13:08');
INSERT INTO `t_operalog` VALUES ('166d026cf9693e270b5f93bc48600849', '资源管理', '面板列表', '增加', '1', '[批量审核列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2015-02-02 15:32:53');
INSERT INTO `t_operalog` VALUES ('18d45b0e1cf51e605c1b586ca7d2d468', '资源管理', '菜单树', '增加', '1', '[批量操作] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-02-02 15:31:17');
INSERT INTO `t_operalog` VALUES ('19f2369de1349677403f8d896af21ef5', '资源管理', '面板列表', '修改', '1', '[批量启动列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2015-02-03 13:19:29');
INSERT INTO `t_operalog` VALUES ('1e403fdbf212c3bace4f91eadb38d1a0', '资源管理', '菜单树', '增加', '1', '[批量操作] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-02-02 15:59:59');
INSERT INTO `t_operalog` VALUES ('1ec8bbc85af1b2b2849b6c253065a400', '资源管理', '面板列表', '增加', '1', '[批量审核列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2015-02-02 15:23:28');
INSERT INTO `t_operalog` VALUES ('1f6c801b537a83bbd16465542ed3cdf9', '资源管理', '操作列表', '增加', '1', '[批量审核] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-31 17:07:55');
INSERT INTO `t_operalog` VALUES ('205893fef35a37f5cf977bec4d4e2ce9', '资源管理', '操作列表', '增加', '1', '[批量审核] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-02-02 15:26:37');
INSERT INTO `t_operalog` VALUES ('2724f00aa72deca59f297217c3a01571', '资源管理', '菜单树', '修改', '1', '[批量审核] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-02-03 13:14:12');
INSERT INTO `t_operalog` VALUES ('289409c80452ec7817eb24012be42a54', '资源管理', '菜单树', '修改', '1', '[批量禁用] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-02-03 10:04:55');
INSERT INTO `t_operalog` VALUES ('29efcbd415add529c3747524216db371', '资源管理', '菜单树', '增加', '1', '[批量操作] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-02-02 15:18:36');
INSERT INTO `t_operalog` VALUES ('2b557fd5953b6dcb626b10586e5ffe52', '资源管理', '面板列表', '增加', '1', '[批量审核列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2015-01-31 17:05:39');
INSERT INTO `t_operalog` VALUES ('2e7a71766dc05e0ac512ed3c4fe14353', '资源管理', '菜单树', '修改', '1', '[批量禁用] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-02-03 13:14:23');
INSERT INTO `t_operalog` VALUES ('2f0b45dc74a9973357777b6a3f18640b', '资源管理', '操作列表', '编辑', '1', '[批量取消审核] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-02-02 15:38:39');
INSERT INTO `t_operalog` VALUES ('308e0ca9c026ab418b57097431c041c0', '资源管理', '操作列表', '编辑', '1', '[批量启动] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-02-02 15:27:28');
INSERT INTO `t_operalog` VALUES ('32d2ced487c019acc3dbf7ce60361d93', '资源管理', '菜单树', '修改', '1', '[批量启动] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-02-03 10:03:40');
INSERT INTO `t_operalog` VALUES ('35baf287793d80280396e40a24fbbb8b', '采购订购合同', '采购订购合同列表', '启用', '1', '订购合同启用成功！', 'com.glacier.frame.service.purchase.PurchaseOrderService', 'enablePurchaseOrder', 'PurchaseOrderList_enable', '超级管理员', '2015-01-31 09:42:34');
INSERT INTO `t_operalog` VALUES ('397b435250575ef6e4bdd89a8ed1cb88', '资源管理', '面板列表', '修改', '1', '[批量禁用列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2015-02-03 13:18:38');
INSERT INTO `t_operalog` VALUES ('399b3f0bf81c13eaea813f2f911df0cc', '资源管理', '操作列表', '增加', '1', '[批量禁用] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-02-02 16:43:44');
INSERT INTO `t_operalog` VALUES ('3cfc714bca3d56b623e54d8060b70a21', '资源管理', '面板列表', '增加', '1', '[批量启用列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2015-02-02 15:40:49');
INSERT INTO `t_operalog` VALUES ('42f934317df7a7524767dc82c7cc9eee', '资源管理', '面板列表', '修改', '1', '[批量取消审核列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2015-02-02 16:02:55');
INSERT INTO `t_operalog` VALUES ('447260bed715c119336fdbd04771ecc1', '资源管理', '面板列表', '增加', '1', '[批量取消审核列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2015-02-02 15:34:40');
INSERT INTO `t_operalog` VALUES ('452053691927b79d4cc4c448d5654474', '资源管理', '菜单树', '修改', '1', '[批量取消审核] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-02-03 10:06:27');
INSERT INTO `t_operalog` VALUES ('46934163617f90624299a65fe1a0a5c3', '销售类型', '销售类型列表', '修改', '1', '[普通销售] 销售类型信息已保存', 'com.glacier.frame.service.basicdatas.ParSellTypeService', 'editParSellType', 'SellTypeList_edit', '超级管理员', '2015-01-31 17:28:46');
INSERT INTO `t_operalog` VALUES ('47fdf968d2ca16ede1a7ec49add99a82', '资源管理', '操作列表', '增加', '1', '[批量取消审核] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-02-02 15:29:15');
INSERT INTO `t_operalog` VALUES ('490dbb3c605d7fd485f546d09c90434f', '资源管理', '菜单树', '增加', '1', '[批量启动] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-02-02 15:21:38');
INSERT INTO `t_operalog` VALUES ('4989f0e4e46f4c06072877d567211311', '资源管理', '操作列表', '编辑', '1', '[批量取消审核] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-02-02 15:39:07');
INSERT INTO `t_operalog` VALUES ('4bf182e69ecfdcc0f1f2a6301d45bd3e', '资源管理', '菜单树', '修改', '1', '[批量启动] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-02-03 13:14:20');
INSERT INTO `t_operalog` VALUES ('4d7ba027efbc2c7a404b28ebddfd018a', '资源管理', '操作列表', '增加', '1', '[批量启用] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-02-02 16:42:08');
INSERT INTO `t_operalog` VALUES ('500c7e4eff09dbc3b38a31dd7829106b', '资源管理', '面板列表', '修改', '1', '[批量取消审核列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2015-02-03 13:18:05');
INSERT INTO `t_operalog` VALUES ('585480ceb665b4f2e05b8a958bf4d6bd', '资源管理', '操作列表', '增加', '1', '[批量禁用] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-02-02 15:30:24');
INSERT INTO `t_operalog` VALUES ('58582cb4514d5402d91cf99b99eed992', '资源管理', '操作列表', '增加', '1', '[批量启用] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-02-02 15:57:59');
INSERT INTO `t_operalog` VALUES ('5a7decb82912cd652ae58ec7678771c7', '资源管理', '菜单树', '修改', '1', '[批量启用] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-02-03 13:23:05');
INSERT INTO `t_operalog` VALUES ('5c529921cd59fde85051c396b6d0050c', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2015-01-31 17:13:15');
INSERT INTO `t_operalog` VALUES ('5f4604f3f0f50a5da04a20ceed2bbdd8', '资源管理', '操作列表', '增加', '1', '[批量启动] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-02-02 15:29:53');
INSERT INTO `t_operalog` VALUES ('600b0ee68f026e245d259c9047b7016f', '资源管理', '面板列表', '增加', '1', '[批量禁用列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2015-02-02 15:25:18');
INSERT INTO `t_operalog` VALUES ('60d1a3bdbf16c114c4e3e6e1df65641a', '资源管理', '菜单树', '增加', '1', '[批量审核] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-01-31 16:53:51');
INSERT INTO `t_operalog` VALUES ('61f0cfc8e8d1364c8e1fe73b658f586a', '资源管理', '面板列表', '增加', '1', '[批量取消审核列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2015-02-02 15:24:26');
INSERT INTO `t_operalog` VALUES ('63953179ca5545fabcf99c4f9fcb8468', '资源管理', '菜单树', '增加', '1', '[批量启用] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-02-02 15:40:16');
INSERT INTO `t_operalog` VALUES ('641319978a66906b7e0b88fadb3a8219', '资源管理', '菜单树', '增加', '1', '[批量禁用] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-01-31 16:57:35');
INSERT INTO `t_operalog` VALUES ('6422ea6b401bf4133200d416aa5d71da', '资源管理', '菜单树', '修改', '1', '[批量启用] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-02-02 16:41:21');
INSERT INTO `t_operalog` VALUES ('67498b39018bdba672307ec6024798aa', '资源管理', '面板列表', '增加', '1', '[批量取消审核列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2015-01-31 17:08:17');
INSERT INTO `t_operalog` VALUES ('6908411d23fb5764a5cded958279297a', '资源管理', '面板列表', '修改', '1', '[批量取消审核列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2015-02-03 13:22:56');
INSERT INTO `t_operalog` VALUES ('6a79a0ac0a725da22754f621346ebc42', '采购订购合同', '采购订购合同列表', '禁用', '1', '订购合同禁用成功！', 'com.glacier.frame.service.purchase.PurchaseOrderService', 'disablePurchaseOrder', 'PurchaseOrderList_disable', '超级管理员', '2015-01-31 09:42:39');
INSERT INTO `t_operalog` VALUES ('6a90ac4c0b89aa6550a5ff3814ca7678', '资源管理', '面板列表', '修改', '1', '[批量启用列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2015-02-03 13:16:55');
INSERT INTO `t_operalog` VALUES ('6c4e8271c991de4abd0048341523f42a', '资源管理', '菜单树', '修改', '1', '[批量启动] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-02-02 15:22:01');
INSERT INTO `t_operalog` VALUES ('6f6a9b559030a664fce0d4a61067d300', '资源管理', '面板列表', '修改', '1', '[批量审核] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2015-02-03 13:22:10');
INSERT INTO `t_operalog` VALUES ('712d18ac87ff8b91954b7be40e5c008c', '资源管理', '操作列表', '编辑', '1', '[批量取消审核] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-02-02 15:36:34');
INSERT INTO `t_operalog` VALUES ('72a19f4bb955909425375c9d95883b3d', '资源管理', '菜单树', '修改', '1', '[批量取消审核] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-02-03 13:12:47');
INSERT INTO `t_operalog` VALUES ('73291b31e3a77f0482f89659e5b49d6f', '资源管理', '操作列表', '增加', '1', '[批量审核] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-02-02 15:33:24');
INSERT INTO `t_operalog` VALUES ('75b0eaa9e8b2f26bf90e9c85cfcf450f', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2015-02-03 13:24:05');
INSERT INTO `t_operalog` VALUES ('773985afa6d6edad00027ba6471e0773', '资源管理', '菜单树', '修改', '1', '[批量审核] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-02-03 10:03:17');
INSERT INTO `t_operalog` VALUES ('78e851f31858f2108ace0dbaaea92d3c', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2015-02-03 10:09:56');
INSERT INTO `t_operalog` VALUES ('7b0bbb9a4e1f36dcb35afef8c927cd25', '资源管理', '面板列表', '增加', '1', '[批量禁用列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2015-01-31 17:10:39');
INSERT INTO `t_operalog` VALUES ('7b8cd40077d4879de0e29214d0b1ef5d', '资源管理', '操作列表', '编辑', '1', '[批量禁用] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-02-02 15:27:36');
INSERT INTO `t_operalog` VALUES ('7c32b3e584f831899d9f850ad6dc5d21', '资源管理', '操作列表', '删除', '1', '成功删除了[ 付款 ]操作!', 'com.glacier.frame.service.system.ActionService', 'delActions', 'ActionList_del', '超级管理员', '2015-02-03 10:07:15');
INSERT INTO `t_operalog` VALUES ('7f916bc874e6ff394c7a5b81f6353676', '销售类型', '销售类型列表', '修改', '1', '[普通销售] 销售类型信息已保存', 'com.glacier.frame.service.basicdatas.ParSellTypeService', 'editParSellType', 'SellTypeList_edit', '超级管理员', '2015-01-31 17:28:37');
INSERT INTO `t_operalog` VALUES ('8263f0cbb1a159d51d00e4da729a141f', '资源管理', '菜单树', '修改', '1', '[批量审核] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-02-03 13:19:55');
INSERT INTO `t_operalog` VALUES ('8304897f8246baeae6b394269dc85da2', '资源管理', '面板列表', '增加', '1', '[批量启动列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2015-02-02 15:24:57');
INSERT INTO `t_operalog` VALUES ('83c885103a77532fd6ea9a95d3726fff', '资源管理', '面板列表', '增加', '1', '[批量启动列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2015-01-31 17:09:34');
INSERT INTO `t_operalog` VALUES ('859036c3856d8c3474b4609dc6f32b33', '资源管理', '菜单树', '修改', '1', '[批量审核] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-02-03 10:04:22');
INSERT INTO `t_operalog` VALUES ('8953b9ca49dcc72e3124f88ff46db766', '资源管理', '菜单树', '修改', '1', '[批量审核] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-02-03 13:22:02');
INSERT INTO `t_operalog` VALUES ('910a65b2f539651f429842d37aacff32', '资源管理', '菜单树', '增加', '1', '[批量禁用] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-02-02 15:22:39');
INSERT INTO `t_operalog` VALUES ('923344c4d6080a0720f887549ab67e9d', '资源管理', '面板列表', '修改', '1', '[批量启动列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2015-02-03 13:17:54');
INSERT INTO `t_operalog` VALUES ('92a58997e91fa9540a88e4af02e4f637', '资源管理', '操作列表', '增加', '1', '[批量禁用] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-02-02 15:59:31');
INSERT INTO `t_operalog` VALUES ('93ade3373ead3d9127dccf55008a5e77', '资源管理', '面板列表', '修改', '1', '[批量禁用列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2015-02-03 13:17:05');
INSERT INTO `t_operalog` VALUES ('93b03d2dd81a79195a3e0d62eaf10016', '资源管理', '操作列表', '编辑', '1', '[退货] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-02-02 16:45:02');
INSERT INTO `t_operalog` VALUES ('994a5fd28e7a4b22e8ab6f2227e97e8e', '资源管理', '菜单树', '增加', '1', '[批量禁用] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-02-02 15:58:45');
INSERT INTO `t_operalog` VALUES ('99926519d83366ad76eaaab4f8c7489f', '资源管理', '菜单树', '修改', '1', '[批量取消审核] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-02-03 13:22:48');
INSERT INTO `t_operalog` VALUES ('99b850b54187a691a3954e44d942c840', '资源管理', '操作列表', '增加', '1', '[批量启动] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-31 17:09:59');
INSERT INTO `t_operalog` VALUES ('9c3ca50c756879e2810304cb3237d9f8', '采购订购合同', '采购订购合同列表', '增加', '1', '信息已保存', 'com.glacier.frame.service.purchase.PurchaseOrderService', 'addPurchaseOrder', 'PurchaseOrderList_add', '超级管理员', '2015-01-31 09:42:07');
INSERT INTO `t_operalog` VALUES ('9c76ac1e28076fe3c2fe618973fbe4b0', '资源管理', '面板列表', '修改', '1', '[批量审核列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2015-02-03 13:19:59');
INSERT INTO `t_operalog` VALUES ('9ca18007b330f4ca344e472340c901da', '资源管理', '菜单树', '增加', '1', '[批量操作] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-01-31 16:51:20');
INSERT INTO `t_operalog` VALUES ('9cdb84b9823477fbe56e51d33d4d0cf6', '资源管理', '面板列表', '修改', '1', '[批量取消审核列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2015-02-03 13:15:19');
INSERT INTO `t_operalog` VALUES ('9e47a8c262b34f8e61884ea8ad8b8079', '资源管理', '菜单树', '修改', '1', '[批量启动] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-02-03 13:19:23');
INSERT INTO `t_operalog` VALUES ('a37bf1cbcb35f17d52a6fae724136153', '资源管理', '操作列表', '编辑', '1', '[批量审核] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2015-02-02 15:26:53');
INSERT INTO `t_operalog` VALUES ('a4467d2e637ee6bf59cbeafd8282bedc', '资源管理', '菜单树', '增加', '1', '[批量取消审核] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-02-02 16:02:13');
INSERT INTO `t_operalog` VALUES ('a4d8b1c057e413080f51d919816449fd', '资源管理', '面板列表', '修改', '1', '[批量禁用列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2015-02-03 13:23:25');
INSERT INTO `t_operalog` VALUES ('a5d4c944a7a7f3ebf576169d4bc631a4', '资源管理', '操作列表', '增加', '1', '[批量取消审核] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-02-02 15:35:02');
INSERT INTO `t_operalog` VALUES ('a99ebdabd3ea21ab5b712f35eca7d087', '资源管理', '菜单树', '修改', '1', '[批量禁用] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-02-03 13:18:31');
INSERT INTO `t_operalog` VALUES ('b2a0f94ee30b0b8e22456693c6a0a1a3', '资源管理', '菜单树', '修改', '1', '[批量操作] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-02-03 13:21:55');
INSERT INTO `t_operalog` VALUES ('b37476286cb504b18558d9bf5fb6816c', '资源管理', '操作列表', '增加', '1', '[批量取消审核] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-02-02 16:03:47');
INSERT INTO `t_operalog` VALUES ('b3fe5e5beb2b3460934e962cc079d9ac', '资源管理', '菜单树', '修改', '1', '[批量启用] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-02-03 10:04:45');
INSERT INTO `t_operalog` VALUES ('b435d5cdb44a9f28048e6ab261307ac2', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2015-02-03 13:24:11');
INSERT INTO `t_operalog` VALUES ('b6fbdc0ca8fa9021b6f63edae3383612', '资源管理', '操作列表', '增加', '1', '[批量审核] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-02-02 16:01:31');
INSERT INTO `t_operalog` VALUES ('bb1be4d4df505a2b5e3be52e564fffe6', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2015-02-02 16:46:07');
INSERT INTO `t_operalog` VALUES ('bb4432177e0fa1bf079ab995951e5273', '资源管理', '菜单树', '修改', '1', '[批量取消审核] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-02-03 10:04:35');
INSERT INTO `t_operalog` VALUES ('bbdb7c8dbee63abd4fc3ee11519e1e75', '资源管理', '面板列表', '修改', '1', '[批量禁用列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2015-02-03 13:15:05');
INSERT INTO `t_operalog` VALUES ('bbdc689ce76c97d6fdd2183af2cbb796', '资源管理', '菜单树', '增加', '1', '[批量启用] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-02-02 16:41:14');
INSERT INTO `t_operalog` VALUES ('bedd7ed7db5b979be7b2f604a2288992', '资源管理', '菜单树', '增加', '1', '[批量审核] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-02-02 16:00:43');
INSERT INTO `t_operalog` VALUES ('c4f2ed218e84c8344ca47d45aa85d2e4', '资源管理', '菜单树', '增加', '1', '[批量禁用] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-02-02 16:42:49');
INSERT INTO `t_operalog` VALUES ('d084ac466efdbfa610b0226ce1979309', '资源管理', '菜单树', '增加', '1', '[批量审核] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-02-02 15:32:35');
INSERT INTO `t_operalog` VALUES ('d1c863ded713bacd49978f46e1c9efbf', '资源管理', '面板列表', '修改', '1', '[批量启用列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2015-02-03 13:23:11');
INSERT INTO `t_operalog` VALUES ('d4c824e8ec95f30a78b2e3a84040f58f', '资源管理', '菜单树', '修改', '1', '[批量启用] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-02-03 13:12:54');
INSERT INTO `t_operalog` VALUES ('d50f0650040cbf2824783f4b40d0ddde', '资源管理', '面板列表', '修改', '1', '[批量审核列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2015-02-03 13:18:13');
INSERT INTO `t_operalog` VALUES ('d516c1ef2052c2aecd9ae8ee4ea05e8f', '资源管理', '面板列表', '修改', '1', '[批量审核列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2015-02-03 13:16:30');
INSERT INTO `t_operalog` VALUES ('d66a7913bc6b4f30a7688758af2c0ca0', '资源管理', '面板列表', '增加', '1', '[批量审核] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2015-02-02 16:01:01');
INSERT INTO `t_operalog` VALUES ('d7ed98ecfdc07c4b9b3080fdddf4826f', '资源管理', '操作列表', '增加', '1', '[批量取消审核] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-01-31 17:09:14');
INSERT INTO `t_operalog` VALUES ('d8012ef6b53310a5bb0461fbdbd71deb', '资源管理', '菜单树', '增加', '1', '[批量取消审核] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-02-02 15:34:12');
INSERT INTO `t_operalog` VALUES ('dd186516da13fb48c22b76c8786cc1f3', '资源管理', '菜单树', '修改', '1', '[批量启用] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-02-03 10:06:37');
INSERT INTO `t_operalog` VALUES ('dd713b5a8cb9362d83c456d943c528dd', '资源管理', '菜单树', '增加', '1', '[批量审核] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-02-02 15:19:41');
INSERT INTO `t_operalog` VALUES ('dfb3f09051fa01f467464536a88607b6', '资源管理', '面板列表', '修改', '1', '[批量取消审核列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2015-02-03 13:19:49');
INSERT INTO `t_operalog` VALUES ('e1cc198c12bdec1441d7a8661da3006e', '资源管理', '菜单树', '增加', '1', '[批量取消审核] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-02-02 15:20:48');
INSERT INTO `t_operalog` VALUES ('e49b48b35f4fed92ce64b644dcc1e596', '资源管理', '面板列表', '增加', '1', '[批量取消审核列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2015-02-02 16:02:41');
INSERT INTO `t_operalog` VALUES ('e546f0ca557784ae942bc5b39a0c9000', '资源管理', '菜单树', '修改', '1', '[批量禁用] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-02-03 10:06:47');
INSERT INTO `t_operalog` VALUES ('e7c4dbbebbf18a82bb3e80ef80bdbd59', '资源管理', '菜单树', '修改', '1', '[批量禁用] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-02-03 13:13:01');
INSERT INTO `t_operalog` VALUES ('e87aaaf8f4e4fdb8226fa8c44292a664', '资源管理', '面板列表', '修改', '1', '[批量禁用列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2015-02-03 13:17:29');
INSERT INTO `t_operalog` VALUES ('e9e9e1ea55f0c1b2ec9ee7d3d37dbd28', '资源管理', '菜单树', '修改', '1', '[批量审核] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-02-03 10:06:16');
INSERT INTO `t_operalog` VALUES ('eaf5d5d3a762e42dc88f5096b9c32c1c', '资源管理', '菜单树', '增加', '1', '[批量启动] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-01-31 16:56:35');
INSERT INTO `t_operalog` VALUES ('ee981e46068d489d3b7d7faee9537b39', '资源管理', '菜单树', '修改', '1', '[批量禁用] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-02-03 10:03:50');
INSERT INTO `t_operalog` VALUES ('f62408b8c00f8ca57db24c20394766bf', '资源管理', '操作列表', '增加', '1', '[跟踪记录] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2015-02-03 10:09:15');
INSERT INTO `t_operalog` VALUES ('f8cbd140170238fddd7e446196dd1917', '资源管理', '菜单树', '修改', '1', '[批量审核] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-02-03 13:12:41');
INSERT INTO `t_operalog` VALUES ('fad132cf5f4d13a2f6f3bdaf900ab982', '资源管理', '菜单树', '修改', '1', '[批量取消审核] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-02-03 13:14:16');
INSERT INTO `t_operalog` VALUES ('fde654c3d0dc7daca38ac886520ca5dc', '资源管理', '菜单树', '修改', '1', '[批量取消审核] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-02-03 13:19:42');
INSERT INTO `t_operalog` VALUES ('fe38b66ba674ac426a13e540016ce8f3', '资源管理', '菜单树', '修改', '1', '[批量取消审核] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-02-03 10:03:29');
INSERT INTO `t_operalog` VALUES ('febe2b0ee09ca774112c96496955e5a5', '资源管理', '菜单树', '修改', '1', '[批量操作] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2015-02-03 13:20:03');
INSERT INTO `t_operalog` VALUES ('fee1bae2ef000f9b5f8a58e7b7fc2aa0', '资源管理', '菜单树', '增加', '1', '[批量取消审核] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2015-01-31 16:55:28');

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
INSERT INTO `t_panel` VALUES ('01748f6fbe274d7759d3710fdec609f8', '63c2cfe82530e29b0312ad52944436ad', '批量禁用列表', 'BatchDisableRetList', '1');
INSERT INTO `t_panel` VALUES ('0d7ed154eebe739d81a20da996d68e6b', 'ccec6c46d43b0e7c40ce5c1ffc0cb3e5', '退货原因列表', 'PurchaseReturnReasonList', '1');
INSERT INTO `t_panel` VALUES ('0edc8b49a0eba9200310ea704054d568', '4cd535b32c8395464ebdd8cca36f3a3a', '退货货品明细列表', 'PurchaseReturnDetailList', '2');
INSERT INTO `t_panel` VALUES ('1fcaaf879975dc772875bbdcc42af61a', '222561c0716cce27e6fc8e82eef0bce5', '申请货品明细列表', 'PurchaseRequisitionDetailList', '2');
INSERT INTO `t_panel` VALUES ('21f3486dd1b51463c4979dc80ef4009b', 'dc2dcb1b303c05b27e9c01dc23dcc5f7', '采购类型集合', 'PurchaseTypeList', '1');
INSERT INTO `t_panel` VALUES ('3456eg4157cf483a790f4eea35ds5675', 'sdsfeg4157cf483a790f4eea35ds5675', '下拉列表', 'OptgroupValueList', '1');
INSERT INTO `t_panel` VALUES ('3643ad37a97101560e57858eff9b9609', '0ce2498756e8a266b6a090b5a55d7b23', '批量启动列表', 'BatchEnableOrderList', '1');
INSERT INTO `t_panel` VALUES ('365eeace84821f6e45d59cefd702827d', '810ba3686840457556cb55bc87d8010b', '销售类型列表', 'SellTypeList', '1');
INSERT INTO `t_panel` VALUES ('37011217016636a0723462dbc81bf887', '91ca1b4b197688f21b68a72f69e09a8d', '管理员列表', 'UserList', '1');
INSERT INTO `t_panel` VALUES ('3ae87a2b203944214386ba2d2030a819', '40b4045ca1b6a457298e76ad34cfb5be', '到货货品明细列表', 'PurchaseArrivalDetailList', '2');
INSERT INTO `t_panel` VALUES ('3be6c0cad57a5412fc9aabacc8f5b2b0', 'b5b37bbe98d7d9737ea77a81aa9f7342', '批量取消审核列表', 'BatchCancelAuditRetList', '1');
INSERT INTO `t_panel` VALUES ('3fae5276226498a6cb1b5cf466793cd6', '14sdf54157cf483a790f4eea35dsf6f6', '信用类别', 'creditType', '27');
INSERT INTO `t_panel` VALUES ('42741ce0beb570a8e14a6bee5b2e9cab', 'ea92abb340a62dfd3ecc9b5e4d78c041', '调拨类型列表', 'WarDeployTypeList', '1');
INSERT INTO `t_panel` VALUES ('4284f4950bf67217bf1816260419ebbb', 'd29229a817d81ed224df8c53d2f48f3d', '报价类型列表', 'PurchaseQuotedPriceTypeList', '1');
INSERT INTO `t_panel` VALUES ('4546fgrgrh1dfhsjdfh124564sdf2sag', 'sdsfeg4157cf483a790f4eea35ds5675', '下拉项树', 'OptgroupTree', '2');
INSERT INTO `t_panel` VALUES ('4df3645386cbf2317d35ecf218939b71', '16669401121c47c062cac4d11a21522e', '出库业务类型列表', 'WarOutTypeList', '1');
INSERT INTO `t_panel` VALUES ('4e23476d801ed12824a42aca3f813617', 'e8a2f672e16b2dcaf720a8b0586e99fd', '入库业务类型列表', 'WarInTypeList', '1');
INSERT INTO `t_panel` VALUES ('4eac4c23176171ce95190b361de571c4', 'cb88f5de7d6f3f5dfb38474d0cd52986', '批量审核', 'BatchAuditRetList', '1');
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
INSERT INTO `t_panel` VALUES ('73e31ef538d8f465ed4ca910f831669a', '0a3c97af0b82f321bedfc97d62069feb', '批量取消审核列表', 'BatchCancelAuditReqList', '1');
INSERT INTO `t_panel` VALUES ('7794769fe25fd3fb2f2534fb8ec9e668', '16635dfa4b5e1dda4fd5d804f430eeec', '客户来源列表', 'ClientSourceList', '1');
INSERT INTO `t_panel` VALUES ('7b034f67886f334a12aeab8c263defef', '24eb7681b66c631e26052279dafca716', '批量启动列表', 'BatchEnableReqList', '1');
INSERT INTO `t_panel` VALUES ('82385e2a3e64ac4cf4633ccb4c38c480', '82533b28131409450ad7a00229fd7333', '联系人类型列表', 'ComContactTypeList', '1');
INSERT INTO `t_panel` VALUES ('83bbeed02a85549ae84cde8d98bcd8c1', 'e550884c5e6c1e94ee70cc833aa1c2b9', '角色列表', 'RoleList', '1');
INSERT INTO `t_panel` VALUES ('95eaa68d7a4109e845d63ef82cdb0d3f', '1b41e29c8712c9f36bc3a520a8e5363b', '费用类型列表', 'FinanceCostTypeList', '1');
INSERT INTO `t_panel` VALUES ('961d2e73b3fa93a9f125fb731e0a9529', '54eb754157cf483a790f4eea35200118', '面板列表', 'PanelList', '2');
INSERT INTO `t_panel` VALUES ('977a07ecaf616fcd4ba6e47b19896a42', '4f2b136adfaf68b741d58df8e4adc4ff', '应付类型列表', 'FinancePayableTypeList', '1');
INSERT INTO `t_panel` VALUES ('97f2132f6557fab4d228f948c350a3f4', 'affd8db9730b330c098c5449c72e72cd', '批量禁用列表', 'BatchDisableReqList', '1');
INSERT INTO `t_panel` VALUES ('9bd61e80d5fe7892b77fa5ccc069c825', '96f4fcb49e57d6a1a001718d5c5aeee8', '采购订购合同列表', 'PurchaseOrderList', '1');
INSERT INTO `t_panel` VALUES ('9e374c52fd0ee843ee81b70c8a1b13d2', '66761e0ea9850fd6cdfc59f282de2ebb', '客户类型列表', 'ClientTypeList', '1');
INSERT INTO `t_panel` VALUES ('a0526b388c633d301f2bfed1110ec9a9', 'c16fc5c61f4ad87b3e2de4104ad3250a', '批量审核列表', 'BatchAuditReqList', '1');
INSERT INTO `t_panel` VALUES ('ac7d8ce120825cc6023f4edaaf2b5b55', '0c77cb97fb54089e6b6f89b24d555023', '采购发票列表', 'PurchaseInvoiceList', '1');
INSERT INTO `t_panel` VALUES ('ad67aaf12a02906ad088a73410fd097e', '8a2f2500fa46e49dd7ff11b688b6c740', '公司规模列表', 'ComCompanySizeList', '1');
INSERT INTO `t_panel` VALUES ('ad6926567cb16be8966308eb36583a57', '0eac3f9c7b4e4cdd5e42c56a16c85147', '交货方式列表', 'ComDeliverTypeList', '1');
INSERT INTO `t_panel` VALUES ('af5f8e8847920dc7fd6347e3a4e9c467', '295ffaf17338b3621d532bfe8ee6c779', '公司性质列表', 'ComNatureList', '1');
INSERT INTO `t_panel` VALUES ('afb1cf326e78fe292af33b76aeef02cd', 'bfe6aa265cb92e35e9920f98a61df508', '货品档案信息列表', 'GoodsList', '1');
INSERT INTO `t_panel` VALUES ('b9a33d91c31c0ef3b9350f39cfb0915e', 'bf47b2f3cc93e5cea6740a62c91a3297', '批量禁用列表', 'BatchDisableOrderList', '1');
INSERT INTO `t_panel` VALUES ('bbab3b6621262de4ca87aee3025b8966', '801ecf764a95da45ccbd194800c0eeeb', '仓库列表', 'WarehouseList', '1');
INSERT INTO `t_panel` VALUES ('bbf240fc8c53886e327ff15976026945', '0d5f941c0e815519b859afa0992eda0b', '部门列表', 'DepList', '1');
INSERT INTO `t_panel` VALUES ('bc2d2f30667d8a327596e8cb9f6bd7fe', '14cf54d0d98b03aa15845d63071f9c68', '供应商联系人列表', 'SuppliersContactList', '1');
INSERT INTO `t_panel` VALUES ('c2a06009f4a31f5c63c6631a869ad813', 'c9845e00a5b709d5659d4011119daa67', '供应商级别', 'SuppliersGradeList', '1');
INSERT INTO `t_panel` VALUES ('c5cdcd3e45b35765f477502c5b51800d', '4cd535b32c8395464ebdd8cca36f3a3a', '采购退货列表', 'PurchaseReturnList', '1');
INSERT INTO `t_panel` VALUES ('c7796dffd9d50588655cfc9d6a297efc', '8fc3b6de8076d1e8c3a6514bd29c4c4b', '支付方式列表', 'ComPaymentTypeList', '1');
INSERT INTO `t_panel` VALUES ('ca2d12285d0d2c284991f1079e3fc181', '5f51460aaf2854c5c03af9190ef94017', '批量审核列表', 'BatchAuditArrList', '1');
INSERT INTO `t_panel` VALUES ('cef00aa1a7ab2338e5bb4e85e311af6f', 'ebd8d76ac65eea1c8d65ac5c14da27b0', '行业管理列表', 'ComIndustryList', '1');
INSERT INTO `t_panel` VALUES ('d2b941bdcab9ab3bfd214e6c19ae7105', '89ed0cefb773a85b9afdc28c70cb7f70', '库存货品分类列表', 'WarGoodsTypeList', '1');
INSERT INTO `t_panel` VALUES ('da23ee602a07d41e279ffe940cfccf8b', '904d503fbdeddae78da4db24d8563080', '客户联系人列表', 'ClientContactList', '1');
INSERT INTO `t_panel` VALUES ('db267d978539cb0f87dc55a9dc1a25f7', '97373f4ec8138e3a74a8a73f90e285f4', '采购类型列表', 'PurchaseType_List', '1');
INSERT INTO `t_panel` VALUES ('df852a739432f8f496e8a46ae244a6e7', '522545bf918daa876c0c31e3ac4df53d', '批量取消审核列表', 'BatchCancelAuditOrderList', '1');
INSERT INTO `t_panel` VALUES ('e469eecb4bd133c072f247d0d9635979', '222561c0716cce27e6fc8e82eef0bce5', '采购申请列表', 'PurchaseRequisitionList', '1');
INSERT INTO `t_panel` VALUES ('e6784ccad10e3414b99b77b303a338c7', '93f0fcfa7cdff069d929723062b53211', '变量列表', 'VariablesList', '1');
INSERT INTO `t_panel` VALUES ('e6ab5e4cacae5daeb895569b9e3935fd', 'df777a3e0f601242355caa81019a9a3d', '批量启用列表', 'BatchEnableRetList', '1');
INSERT INTO `t_panel` VALUES ('eb2a84c4b7bd11632135e4992ade286e', '54eb754157cf483a790f4eea35200118', '操作列表', 'ActionList', '3');
INSERT INTO `t_panel` VALUES ('eb65d0304dc38ac4db140a1c10fdc7d3', 'aa165bf67dadbeedeb780b3e92dcdcdb', '销售退货方式列表', 'SellReturnTypeList', '1');
INSERT INTO `t_panel` VALUES ('eda50ccf41c512bcfbc194807e338c45', '96f4fcb49e57d6a1a001718d5c5aeee8', '订购货品明细列表', 'PurchaseOrderDetailList', '2');
INSERT INTO `t_panel` VALUES ('efe32f25f6d4eab27c74e3dbcf326b47', '79d4fbfb8f73e4e21ee67e1d6ad9ff5e', '客户档案列表', 'ClientList', '1');
INSERT INTO `t_panel` VALUES ('f664c6028d8cab504f2771fa78d56312', '90998bf3c3173da5e8319d70cec8a7ab', '销售退货原因列表', 'SellReturnReasonList', '1');
INSERT INTO `t_panel` VALUES ('f769a64bb571aa0c7ac269b807af4782', 'e42b98561176563f930d82c80b041ed8', '登录日志列表', 'LoginlogList', '1');
INSERT INTO `t_panel` VALUES ('f784974e8e1478c8ad79f374e588b699', 'efb8f52b5c4539e98c9d4215e792cb4e', '批量启用列表', 'BatchEnableArrList', '1');
INSERT INTO `t_panel` VALUES ('f94ea11ae5c04c27b97b6a086ff3e078', '57de09722e61bad9f9385eb865afc0ab', '批量审核列表', 'BatchAuditOrderList', '1');
INSERT INTO `t_panel` VALUES ('fbfb879e955211387eafabb50d79e738', '5935787a3462c25bdeedbb7dd60025bd', '批量取消审核列表', 'BatchCancelAuditArrList', '1');
INSERT INTO `t_panel` VALUES ('fd41cf12ad7b4f35da9a47abb8495657', '2055fc2aca880d69cf7ecef9f48fbd3c', '批量禁用列表', 'BatchDisableArrList', '1');
INSERT INTO `t_panel` VALUES ('ff77e2eb7cff4173eaa531eb708a1527', '40b4045ca1b6a457298e76ad34cfb5be', '采购到货列表', 'PurchaseArrivalList', '1');

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
INSERT INTO `t_parameter_optgroup` VALUES ('3a92254355ab9a7883a2a1157a92dd7c', '898dca0a9effa17afb23f62cc066e92a', 'arrState', '到货状态', null, null, '4', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:03:50', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:15:16');
INSERT INTO `t_parameter_optgroup` VALUES ('3de467b04ce8984ae48ba243eb25ffb2', null, 'basicdatas', '参数管理', null, null, '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:15:47', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:12:47');
INSERT INTO `t_parameter_optgroup` VALUES ('4431d9c12ecd52747d84160690fc3528', '898dca0a9effa17afb23f62cc066e92a', 'orderState', '订购状态', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:13:30', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:13:30');
INSERT INTO `t_parameter_optgroup` VALUES ('451cac012877e62b9086e646a9019ccc', '898dca0a9effa17afb23f62cc066e92a', 'invState', '开票状态', null, null, '3', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:03:30', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:15:12');
INSERT INTO `t_parameter_optgroup` VALUES ('4bf86d257f4da0be1df451d0bea1b62d', '113afb2ecac88fe851ad501c53b7d82b', 'backwashState', '回冲状态', null, null, '6', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:23:44', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:23:44');
INSERT INTO `t_parameter_optgroup` VALUES ('685c05b507ee9934cf6fff8deab53733', '898dca0a9effa17afb23f62cc066e92a', 'payState', '付款状态', null, null, '5', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:04:14', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:15:21');
INSERT INTO `t_parameter_optgroup` VALUES ('7114c42efa5349f4c8874787fde91633', 'bd88aee43efe41a6ebd10b263fa29ed1', 'formType', '表单类型', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:19:08', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:04:35');
INSERT INTO `t_parameter_optgroup` VALUES ('715be73f07495ad9861fa7b9967ac003', '898dca0a9effa17afb23f62cc066e92a', 'orderState', '订购合同状态', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 14:38:00', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:14:58');
INSERT INTO `t_parameter_optgroup` VALUES ('78dca7e6a8b8a34a8d87060a785a88a3', '898dca0a9effa17afb23f62cc066e92a', 'tailAfterStatus', '入库状态', null, null, '8', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:17:00', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:17:00');
INSERT INTO `t_parameter_optgroup` VALUES ('87e805fcf0c779b8f57fde22d819e2db', '113afb2ecac88fe851ad501c53b7d82b', 'sex', '性别', null, null, '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:11:51', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:52:39');
INSERT INTO `t_parameter_optgroup` VALUES ('898dca0a9effa17afb23f62cc066e92a', null, 'purchase', '采购管理', null, null, '4', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 14:35:53', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 14:35:53');
INSERT INTO `t_parameter_optgroup` VALUES ('afc779e6329119d063afc090e994a482', '898dca0a9effa17afb23f62cc066e92a', 'returnState', '退货状态', null, null, '7', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:10:52', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:10:52');
INSERT INTO `t_parameter_optgroup` VALUES ('b85ef5842fff5a7eb9535207e7cf5dc9', null, 'basic', '基础资料', null, null, '3', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-09 17:46:50', '8b25651c2d896297530b64e4b80ec503', '2015-01-09 17:46:50');
INSERT INTO `t_parameter_optgroup` VALUES ('bd88aee43efe41a6ebd10b263fa29ed1', '3de467b04ce8984ae48ba243eb25ffb2', 'variables', '系统变量', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:18:18', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:04:28');
INSERT INTO `t_parameter_optgroup` VALUES ('c755d2e108859f9206f73bf19e0b6cbf', '113afb2ecac88fe851ad501c53b7d82b', 'yesOrNo', '是否', null, null, '5', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-09 17:44:59', '8b25651c2d896297530b64e4b80ec503', '2015-01-09 17:44:59');
INSERT INTO `t_parameter_optgroup` VALUES ('d3c1f77f16035714a0257cd33a50e8e9', '898dca0a9effa17afb23f62cc066e92a', 'invoiceTypeId', '发票类别', null, null, '2', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 14:51:21', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:15:06');
INSERT INTO `t_parameter_optgroup` VALUES ('df83e491aacd7d3c425db1dd254805c9', '898dca0a9effa17afb23f62cc066e92a', 'logSettlement', '运费结算', null, null, '9', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:19:50', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:19:50');
INSERT INTO `t_parameter_optgroup` VALUES ('f16dfbbf67b09873fbfcff2094984d49', '898dca0a9effa17afb23f62cc066e92a', 'logSettlementId', '运费结算方式', null, null, '6', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:09:04', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:09:04');
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
INSERT INTO `t_parameter_optgroup_value` VALUES ('02df4e5c07bb38221b41c9c74448fd8f', '87e805fcf0c779b8f57fde22d819e2db', 'secret', '保密', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:55:17', '8b25651c2d896297530b64e4b80ec503', '2015-01-29 17:48:28');
INSERT INTO `t_parameter_optgroup_value` VALUES ('04f64bb491caa38214eaf553872cbb5a', '2fab4b191e528e002329f82c8493c663', 'policy1', '参考销售价格一', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-09 17:59:52', '8b25651c2d896297530b64e4b80ec503', '2015-01-09 17:59:52');
INSERT INTO `t_parameter_optgroup_value` VALUES ('07542b2a1098fa1ceb03c3f604c5cc7f', '2fab4b191e528e002329f82c8493c663', 'policy3', '参考销售价格三', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-12 08:49:14', '8b25651c2d896297530b64e4b80ec503', '2015-01-12 08:49:14');
INSERT INTO `t_parameter_optgroup_value` VALUES ('0d67e476b47a77648bc35c1c4be0ddb3', 'df83e491aacd7d3c425db1dd254805c9', 'notcommitment', '我方承担不摊成本', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:21:24', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:21:24');
INSERT INTO `t_parameter_optgroup_value` VALUES ('0ff889013f92b3fe2b7426c39bf92b59', 'afc779e6329119d063afc090e994a482', 'noneReturn', '未退货', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:11:25', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:11:25');
INSERT INTO `t_parameter_optgroup_value` VALUES ('1233a04cf462734fc99c4174cea5dac3', 'f16dfbbf67b09873fbfcff2094984d49', 'generationpad', '我方代垫', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:10:03', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:10:03');
INSERT INTO `t_parameter_optgroup_value` VALUES ('1ad455f31f4cdea702ff115357cad666', 'f16dfbbf67b09873fbfcff2094984d49', 'selfpay', '对方自付', 'enable', '4', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:10:18', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:10:18');
INSERT INTO `t_parameter_optgroup_value` VALUES ('1bf5fc949e2442b832d014a220503cf4', '451cac012877e62b9086e646a9019ccc', 'noneInv', '未开票', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:04:39', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:04:39');
INSERT INTO `t_parameter_optgroup_value` VALUES ('1ed2d672131c69ea00a61b0edd2d5358', 'fdf78bcc980b29a21a65131eab1c1b38', 'builtin', '内置', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:31:13', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:42:00');
INSERT INTO `t_parameter_optgroup_value` VALUES ('22c0fa88d53f2a17e88a088976013b16', '4431d9c12ecd52747d84160690fc3528', 'noneOrder', '未订购', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:13:47', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:13:47');
INSERT INTO `t_parameter_optgroup_value` VALUES ('239294f5e95b8d95911c4227eb2473e4', 'fdf78bcc980b29a21a65131eab1c1b38', 'custom', '自定义', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:31:32', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:42:04');
INSERT INTO `t_parameter_optgroup_value` VALUES ('24e8bb2f1727caee8095fcc11b07f7a3', '715be73f07495ad9861fa7b9967ac003', 'closed', '已结案', 'enable', '4', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 14:49:59', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 14:49:59');
INSERT INTO `t_parameter_optgroup_value` VALUES ('2938873297a3772fbe3dc2ed191d72f5', '2fab4b191e528e002329f82c8493c663', 'policy2', '参考销售价格二', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-12 08:48:46', '8b25651c2d896297530b64e4b80ec503', '2015-01-12 08:48:46');
INSERT INTO `t_parameter_optgroup_value` VALUES ('2c663921507de7b121d37b460d65b5c4', 'fdf78bcc980b29a21a65131eab1c1b38', 'admin', '管理员', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:41:48');
INSERT INTO `t_parameter_optgroup_value` VALUES ('2f56fcfd532c6399ff49d01a8890cc7b', 'f16dfbbf67b09873fbfcff2094984d49', 'ourcommitment', '我方承担分摊成本', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:09:37', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:09:37');
INSERT INTO `t_parameter_optgroup_value` VALUES ('3ed9c712de4b3076d458ea8a12a65d7c', 'd3c1f77f16035714a0257cd33a50e8e9', 'receipt', '收据', 'enable', '5', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:02:28', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:02:28');
INSERT INTO `t_parameter_optgroup_value` VALUES ('3sfsaf1231452112121525as5fsdf454', '1bf27bce9c73b22e9822fb85380ac347', 'enable', '启用', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 14:42:47');
INSERT INTO `t_parameter_optgroup_value` VALUES ('41ad6336a2e35dd9d67ed0ece74ad155', '7114c42efa5349f4c8874787fde91633', 'input', '输入框', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:53:45', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('4346c17adc9f4b126baa6e593dfb1219', '87e805fcf0c779b8f57fde22d819e2db', 'man', '男', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:54:45', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:54:45');
INSERT INTO `t_parameter_optgroup_value` VALUES ('4614edd71f0bbd4199ee71bd29cd859f', '451cac012877e62b9086e646a9019ccc', 'allInv', '全部开票', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:05:08', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:05:08');
INSERT INTO `t_parameter_optgroup_value` VALUES ('4770b6fe1a1043d4cde541e7f4066d21', 'd3c1f77f16035714a0257cd33a50e8e9', 'generaltax', '普通国税发票', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:01:37', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:01:37');
INSERT INTO `t_parameter_optgroup_value` VALUES ('49068c77b1c78536ff41403e299634b8', 'f16dfbbf67b09873fbfcff2094984d49', 'notcommitment', '我方承担不摊成本', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:09:51', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:09:51');
INSERT INTO `t_parameter_optgroup_value` VALUES ('54649309c8f9275b921cf86a288bc012', 'c755d2e108859f9206f73bf19e0b6cbf', 'yes', '是', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-09 17:45:11', '8b25651c2d896297530b64e4b80ec503', '2015-01-09 17:45:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('5dfs2d1f32sd1f2sd1f2sd1f256565sd', '1bf27bce9c73b22e9822fb85380ac347', 'disable', '禁用', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 14:42:50');
INSERT INTO `t_parameter_optgroup_value` VALUES ('60e7111350ccc8cccecd7d704b05fda4', '3a92254355ab9a7883a2a1157a92dd7c', 'noneArr', '未到货', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:05:25', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:05:25');
INSERT INTO `t_parameter_optgroup_value` VALUES ('61b8a6da98efa85312de0db2d3e3a474', '4bf86d257f4da0be1df451d0bea1b62d', 'backwash1', '已回冲', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:25:46', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:25:46');
INSERT INTO `t_parameter_optgroup_value` VALUES ('659b6401d8a88caa8e4137b2fed0507d', '2fab4b191e528e002329f82c8493c663', 'policy7', '参考销售价格七', 'enable', '7', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-12 08:51:35', '8b25651c2d896297530b64e4b80ec503', '2015-01-12 08:51:35');
INSERT INTO `t_parameter_optgroup_value` VALUES ('66d433a8e6279e56ad0023b17c0ecf2d', 'd3c1f77f16035714a0257cd33a50e8e9', 'ordinarytax', '普通地税发票', 'enable', '4', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:01:56', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:01:56');
INSERT INTO `t_parameter_optgroup_value` VALUES ('6bc1e80e1a7d3b0f1e8a7761afa2b47e', '2fab4b191e528e002329f82c8493c663', 'policy9', '参考销售价格九', 'enable', '9', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-12 08:53:04', '8b25651c2d896297530b64e4b80ec503', '2015-01-12 08:53:04');
INSERT INTO `t_parameter_optgroup_value` VALUES ('711fde52b782ac34e2e6e60e820014dd', '685c05b507ee9934cf6fff8deab53733', 'portionPay', '部分付款', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:06:24', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:06:24');
INSERT INTO `t_parameter_optgroup_value` VALUES ('7c4b10cbe60023a931697d39b2156c0f', '4431d9c12ecd52747d84160690fc3528', 'allOrder', '全部订购', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:14:09', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:14:09');
INSERT INTO `t_parameter_optgroup_value` VALUES ('7d49e450babd14a977f591f1a3531dac', '78dca7e6a8b8a34a8d87060a785a88a3', 'storage', '已入库', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:17:19', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:17:19');
INSERT INTO `t_parameter_optgroup_value` VALUES ('82b8c11fce52692f75e9696928563fd7', '3a92254355ab9a7883a2a1157a92dd7c', 'allArr', '全部到货', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:05:51', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:05:51');
INSERT INTO `t_parameter_optgroup_value` VALUES ('842370390c97bcb5a183a8b729fa81b9', 'd3c1f77f16035714a0257cd33a50e8e9', 'generalvat', '增值税普通发票', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:00:31', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:00:31');
INSERT INTO `t_parameter_optgroup_value` VALUES ('85db75ec028f7cbbb412331e8c035470', '7114c42efa5349f4c8874787fde91633', 'textarea', '文本框', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:54:06', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('979d5ebd7b432d124d4ae89386ac3ce7', '715be73f07495ad9861fa7b9967ac003', 'affirm', '已收货确认', 'enable', '5', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 14:50:20', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 14:50:20');
INSERT INTO `t_parameter_optgroup_value` VALUES ('9a0291f473d6d57a0d7b70c865fbeb4a', '4431d9c12ecd52747d84160690fc3528', 'portionOrder', '部分订购', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:13:58', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:13:58');
INSERT INTO `t_parameter_optgroup_value` VALUES ('9c4423340fbe1a2d3c0f8e4f8d2c4921', '685c05b507ee9934cf6fff8deab53733', 'allPay', '全部付款', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:06:37', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:06:37');
INSERT INTO `t_parameter_optgroup_value` VALUES ('9d800fb23d678308f4a91a3cc33ffdbe', 'df83e491aacd7d3c425db1dd254805c9', 'selfpay', '对方自付', 'enable', '4', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:22:04', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:22:04');
INSERT INTO `t_parameter_optgroup_value` VALUES ('9df028d9a094c5425892ec216fa44fdb', '2fab4b191e528e002329f82c8493c663', 'policy10', '参考销售价格十', 'enable', '10', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-12 08:53:33', '8b25651c2d896297530b64e4b80ec503', '2015-01-12 08:53:33');
INSERT INTO `t_parameter_optgroup_value` VALUES ('9e422ecb8e30b8a8d990b28b0768b0d5', '2fab4b191e528e002329f82c8493c663', 'policy5', '参考销售价格五', 'enable', '5', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-12 08:50:22', '8b25651c2d896297530b64e4b80ec503', '2015-01-12 08:50:22');
INSERT INTO `t_parameter_optgroup_value` VALUES ('a4d3ed43895d24816d87de7af5d38690', '715be73f07495ad9861fa7b9967ac003', 'exeIng', '执行中', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 14:49:18', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 14:49:18');
INSERT INTO `t_parameter_optgroup_value` VALUES ('a58dc2a344db1af84264dedd8912cf40', '3a92254355ab9a7883a2a1157a92dd7c', 'portionArr', '部分到货', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:05:37', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:05:37');
INSERT INTO `t_parameter_optgroup_value` VALUES ('adf5a85fc6937d07f65484014cc2ce76', '0b6919d96ff46e91471d9714bd1d205f', 'failure', '审核失败', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-02 15:17:11', '8b25651c2d896297530b64e4b80ec503', '2014-05-06 10:52:23');
INSERT INTO `t_parameter_optgroup_value` VALUES ('b508a6b4fb3ede4674664a2dfd04e7fd', '2fab4b191e528e002329f82c8493c663', 'policy4', '参考销售价格四', 'enable', '4', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-12 08:49:42', '8b25651c2d896297530b64e4b80ec503', '2015-01-12 08:49:42');
INSERT INTO `t_parameter_optgroup_value` VALUES ('c4c89e2e119f658e369e002d3e6e84b3', 'd3c1f77f16035714a0257cd33a50e8e9', 'specialvat', '增值税专用发票', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 14:54:16', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:00:35');
INSERT INTO `t_parameter_optgroup_value` VALUES ('c66f3d262c9be0f4dc9ff7b30f5645ad', '2fab4b191e528e002329f82c8493c663', 'policy8', '参考销售价格八', 'enable', '8', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-12 08:52:33', '8b25651c2d896297530b64e4b80ec503', '2015-01-12 08:52:33');
INSERT INTO `t_parameter_optgroup_value` VALUES ('ccc60ccdce31223aeaf1bc940122ff18', 'df83e491aacd7d3c425db1dd254805c9', 'generationpad', '我方代垫', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:21:42', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:21:42');
INSERT INTO `t_parameter_optgroup_value` VALUES ('d31845a9aacaaca87f300bc51942f520', '715be73f07495ad9861fa7b9967ac003', 'termination', '已终止', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 14:49:39', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 14:49:39');
INSERT INTO `t_parameter_optgroup_value` VALUES ('d8cf159a166e0518accf6165d5d77457', 'df83e491aacd7d3c425db1dd254805c9', 'ourcommitment', '我方承担分摊成本', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:21:04', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:21:04');
INSERT INTO `t_parameter_optgroup_value` VALUES ('e0e619ab78940bdf04b36314070f6474', '451cac012877e62b9086e646a9019ccc', 'portionInv', '部分开票', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:04:55', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:04:55');
INSERT INTO `t_parameter_optgroup_value` VALUES ('e179d0bcaa55901f3c109fda1477662a', '715be73f07495ad9861fa7b9967ac003', 'noneExe', '未执行', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 14:48:42', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 14:48:42');
INSERT INTO `t_parameter_optgroup_value` VALUES ('e2d6acf04183213005f1703fa7a1a77d', 'c755d2e108859f9206f73bf19e0b6cbf', 'no', '否', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-09 17:45:26', '8b25651c2d896297530b64e4b80ec503', '2015-01-09 17:45:26');
INSERT INTO `t_parameter_optgroup_value` VALUES ('e60a0f1adebf1b828640fbb338316eb8', '0b6919d96ff46e91471d9714bd1d205f', 'authstr', '审核中', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-02 15:16:10', '8b25651c2d896297530b64e4b80ec503', '2014-04-02 15:16:10');
INSERT INTO `t_parameter_optgroup_value` VALUES ('ea126e0395c3ce97a894bebe5d9ffa33', '685c05b507ee9934cf6fff8deab53733', 'nonePay', '未付款', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:06:09', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:06:09');
INSERT INTO `t_parameter_optgroup_value` VALUES ('ea6be37dc11349e414e9c6df67379186', '78dca7e6a8b8a34a8d87060a785a88a3', 'nostorage', '未入库', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:17:32', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:17:32');
INSERT INTO `t_parameter_optgroup_value` VALUES ('edadcc897e844c01a21731f5721a24f9', '2fab4b191e528e002329f82c8493c663', 'policy6', '参考销售价格六', 'enable', '6', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-12 08:50:54', '8b25651c2d896297530b64e4b80ec503', '2015-01-12 08:50:54');
INSERT INTO `t_parameter_optgroup_value` VALUES ('f081962b0b8f3b28b727c60b821dbee2', '87e805fcf0c779b8f57fde22d819e2db', 'woman', '女', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:55:01', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:55:01');
INSERT INTO `t_parameter_optgroup_value` VALUES ('f1498ee9de5b4e78fe4654ae3b3175bb', '0b6919d96ff46e91471d9714bd1d205f', 'pass', '审核通过', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-02 15:16:43', '8b25651c2d896297530b64e4b80ec503', '2014-05-06 10:52:17');
INSERT INTO `t_parameter_optgroup_value` VALUES ('f2c2af92bfe16e3e2fad935796d2c2ee', '4bf86d257f4da0be1df451d0bea1b62d', 'backwash0', '未回冲', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:25:15', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:25:55');
INSERT INTO `t_parameter_optgroup_value` VALUES ('f550f4a68750e5f73420b6625bfd0e9d', 'afc779e6329119d063afc090e994a482', 'portionReturn', '部分退货', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:11:40', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:11:40');
INSERT INTO `t_parameter_optgroup_value` VALUES ('fe3e31824ce497d435b2bf0c67f43058', 'afc779e6329119d063afc090e994a482', 'allReturn', '全部退货', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:11:53', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 15:11:53');

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
-- Table structure for `t_par_client_contact`
-- ----------------------------
DROP TABLE IF EXISTS `t_par_client_contact`;
CREATE TABLE `t_par_client_contact` (
  `client_contact_id` varchar(32) NOT NULL,
  `client_id` varchar(32) default NULL,
  `contact_type_id` varchar(32) default NULL,
  `name` varchar(32) default NULL,
  `sex` enum('man','secret','woman') default NULL,
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
  `enabled` enum('enable','disable') default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`client_contact_id`),
  KEY `FK_T_BASIS__T_BASIS_C_T_BASIS_` (`client_id`),
  CONSTRAINT `t_par_client_contact_ibfk_1` FOREIGN KEY (`client_id`) REFERENCES `t_basis_client` (`client_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_par_client_contact
-- ----------------------------
INSERT INTO `t_par_client_contact` VALUES ('68801e71df03cdfa384954d7ac169580', '2cd9ab8208958194df457bb1f37fc8b3', '0c3fec9ff1e47a787d6d9d4ae426df53', '小方', 'secret', '开发部', '经理', '开发', '13486464', '7866', '786', '5564@qq.com', '07552655', '珠海市', '65656', '2015-01-30 00:00:00', '打篮球', '8', '', 'enable', '超级管理员', '2015-01-30 14:52:12', '超级管理员', '2015-01-30 15:11:09');
INSERT INTO `t_par_client_contact` VALUES ('8c1d7da7be98de6417fa2c7cd7b7c7c6', '2cd9ab8208958194df457bb1f37fc8b3', '0c3fec9ff1e47a787d6d9d4ae426df53', '小古', 'man', '管理', '员工', '管理', '1341388', '32', '', '656@qq.com', '', '', '', '2015-01-30 00:00:00', '', '3', '', 'enable', '超级管理员', '2015-01-30 15:13:08', '超级管理员', '2015-01-30 15:13:08');

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
INSERT INTO `t_par_client_level` VALUES ('218395643d16d90442db44e298b3496b', null, '一般客户', '1', 'enable', '超级管理员', '2015-01-15 13:49:39', '超级管理员', '2015-01-15 13:49:39');
INSERT INTO `t_par_client_level` VALUES ('2faf4886abcb93565c3d6c69339ccf9c', null, 'VIP客户', '4', 'enable', '超级管理员', '2015-01-15 13:50:12', '超级管理员', '2015-01-15 13:50:12');
INSERT INTO `t_par_client_level` VALUES ('e780d74b9252f2f1b3ac2c85f12c4b3e', null, '重要客户', '3', 'enable', '超级管理员', '2015-01-15 13:49:45', '超级管理员', '2015-01-15 13:50:03');
INSERT INTO `t_par_client_level` VALUES ('fb82c8891771f64d5503a21dd73a9d8e', null, '普通客户', '2', 'enable', '超级管理员', '2015-01-15 13:49:57', '超级管理员', '2015-01-15 13:49:57');

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
INSERT INTO `t_par_client_source` VALUES ('08e2d12496e9812ca5f3a119348a20ce', null, '其它', '1', 'enable', '超级管理员', '2015-01-15 13:50:38', '超级管理员', '2015-01-15 13:50:38');
INSERT INTO `t_par_client_source` VALUES ('209d91c5102da69db4b2e93cc1f67426', null, '促销活动', '11', 'enable', '超级管理员', '2015-01-15 13:52:30', '超级管理员', '2015-01-15 13:52:30');
INSERT INTO `t_par_client_source` VALUES ('279509e821292e4b08780d56e1f63f3c', null, '在线订购', '3', 'enable', '超级管理员', '2015-01-15 13:50:55', '超级管理员', '2015-01-15 13:50:55');
INSERT INTO `t_par_client_source` VALUES ('5c6d6b901bc19a4a0229bfa93da9cf94', null, '网络营销', '8', 'enable', '超级管理员', '2015-01-15 13:51:57', '超级管理员', '2015-01-15 13:51:57');
INSERT INTO `t_par_client_source` VALUES ('7681c1350084dadd51934e3fb3ed221f', null, '合作伙伴', '5', 'enable', '超级管理员', '2015-01-15 13:51:21', '超级管理员', '2015-01-15 13:51:21');
INSERT INTO `t_par_client_source` VALUES ('77dc5ea9743c472935aa7a03e27aaa20', null, '后台订单', '2', 'enable', '超级管理员', '2015-01-15 13:50:47', '超级管理员', '2015-01-15 13:50:47');
INSERT INTO `t_par_client_source` VALUES ('812f7040fb942ccc51197eeec31f5c0f', null, '客户介绍', '13', 'enable', '超级管理员', '2015-01-15 13:52:55', '超级管理员', '2015-01-15 13:52:55');
INSERT INTO `t_par_client_source` VALUES ('9be387e608be25f088f5dacf19828d56', null, '朋友介绍', '10', 'enable', '超级管理员', '2015-01-15 13:52:20', '超级管理员', '2015-01-15 13:52:20');
INSERT INTO `t_par_client_source` VALUES ('b092cadc8fbda764adebf1527e7fceec', null, '邮寄宣传', '7', 'enable', '超级管理员', '2015-01-15 13:51:45', '超级管理员', '2015-01-15 13:51:45');
INSERT INTO `t_par_client_source` VALUES ('c87d3564ecc904452c5864e63b50e381', null, '代理商', '6', 'enable', '超级管理员', '2015-01-15 13:51:31', '超级管理员', '2015-01-15 13:51:31');
INSERT INTO `t_par_client_source` VALUES ('e25ea5021dd19905693d0940ec4f5aa9', null, '短信订购', '4', 'enable', '超级管理员', '2015-01-15 13:51:06', '超级管理员', '2015-01-15 13:51:06');
INSERT INTO `t_par_client_source` VALUES ('f459fe9cc27948ef53aefa98f3de6c50', null, '媒体宣传', '12', 'enable', '超级管理员', '2015-01-15 13:52:40', '超级管理员', '2015-01-15 13:52:40');
INSERT INTO `t_par_client_source` VALUES ('f4a6e4a79a7eebcd96eed9f1c3d32db8', null, '电话来访', '14', 'enable', '超级管理员', '2015-01-15 13:53:06', '超级管理员', '2015-01-15 13:53:06');
INSERT INTO `t_par_client_source` VALUES ('f95f8e30088c0777fab22aaed95ad2dc', null, '公开招标', '9', 'enable', '超级管理员', '2015-01-15 13:52:08', '超级管理员', '2015-01-15 13:52:08');

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
INSERT INTO `t_par_client_type` VALUES ('1afa46b9c1063c4ff333607d6b8042e6', null, '意向客户', '2', 'enable', '超级管理员', '2015-01-15 13:48:52', '超级管理员', '2015-01-15 13:48:52');
INSERT INTO `t_par_client_type` VALUES ('1ce29a3e2781c57212d8e050b901210c', null, '潜在客户', '5', 'enable', '超级管理员', '2015-01-15 13:49:24', '超级管理员', '2015-01-15 13:49:24');
INSERT INTO `t_par_client_type` VALUES ('6a13ad97739ff914554fe09f9dda6c7b', null, '社员', '1', 'enable', '超级管理员', '2015-01-15 13:48:36', '超级管理员', '2015-01-15 13:48:36');
INSERT INTO `t_par_client_type` VALUES ('a87523ee368501cc80d1de87519d4dc2', null, '合作伙伴', '4', 'enable', '超级管理员', '2015-01-15 13:49:14', '超级管理员', '2015-01-15 13:49:14');
INSERT INTO `t_par_client_type` VALUES ('e972cac6c30732040912de0c9f627d24', null, '经销商', '3', 'enable', '超级管理员', '2015-01-15 13:49:02', '超级管理员', '2015-01-15 13:49:02');

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
INSERT INTO `t_par_com_company_size` VALUES ('1b63381cdd32c07378dbaeaedb28359d', null, '201-300人', '4', 'enable', '超级管理员', '2015-01-13 14:39:31', '超级管理员', '2015-01-15 13:26:09');
INSERT INTO `t_par_com_company_size` VALUES ('26a093f5603e8152077c1f4ce8fc02ad', null, '401-500人', '6', 'enable', '超级管理员', '2015-01-15 13:26:42', '超级管理员', '2015-01-15 13:26:42');
INSERT INTO `t_par_com_company_size` VALUES ('39185726a792f1192869439b2dbe6a68', null, '500以上', '7', 'enable', '超级管理员', '2015-01-15 13:26:56', '超级管理员', '2015-01-15 13:26:56');
INSERT INTO `t_par_com_company_size` VALUES ('4b2b3b2adc1d756ce1ff45a6fa9902ee', null, '301-400人', '5', 'enable', '超级管理员', '2015-01-15 13:26:26', '超级管理员', '2015-01-15 13:26:26');
INSERT INTO `t_par_com_company_size` VALUES ('54f4d9894d824464d2fb4e54e851fa95', null, '101-200人', '3', 'enable', '超级管理员', '2015-01-09 10:13:44', '超级管理员', '2015-01-15 13:25:43');
INSERT INTO `t_par_com_company_size` VALUES ('c1e2b3f9e0f5499300a4fc9cc05b42e3', null, '1-50人', '1', 'enable', '超级管理员', '2015-01-09 10:13:12', '超级管理员', '2015-01-09 10:13:12');
INSERT INTO `t_par_com_company_size` VALUES ('d841c8aba55b21d0e1284525b83b8895', null, '51-100人', '2', 'enable', '超级管理员', '2015-01-09 10:13:29', '超级管理员', '2015-01-15 13:25:36');

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
INSERT INTO `t_par_com_contact_type` VALUES ('0c3fec9ff1e47a787d6d9d4ae426df53', '普通员工', 'enable', '超级管理员', '2015-01-15 13:32:40', '超级管理员', '2015-01-15 13:32:40', null, '4');
INSERT INTO `t_par_com_contact_type` VALUES ('6a77849f97c648181e98a8cf3fcd10b9', '老总', 'enable', '超级管理员', '2015-01-08 17:50:00', '超级管理员', '2015-01-08 17:50:00', null, '1');
INSERT INTO `t_par_com_contact_type` VALUES ('8c5bd6da82434ebd455a2cf3de43f24e', '部门经理', 'enable', '超级管理员', '2015-01-15 13:32:11', '超级管理员', '2015-01-15 13:32:11', null, '2');
INSERT INTO `t_par_com_contact_type` VALUES ('a275494c1155a87ab6417f090f661f74', '重要联系人', 'enable', '超级管理员', '2015-01-15 13:32:31', '超级管理员', '2015-01-15 13:32:31', null, '3');

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
INSERT INTO `t_par_com_deliver_type` VALUES ('5d4031b343c8a2ef9c181defc2fd5ce7', null, '物流公司', '1', 'enable', '超级管理员', '2015-01-15 13:27:32', '超级管理员', '2015-01-15 13:27:32');
INSERT INTO `t_par_com_deliver_type` VALUES ('9f072c76de763879f7f328fec2c2d32c', null, '客户自提', '3', 'enable', '超级管理员', '2015-01-15 13:27:57', '超级管理员', '2015-01-15 13:27:57');
INSERT INTO `t_par_com_deliver_type` VALUES ('d61383c331468cc0c7724f2e792fdd7e', null, '我方送货', '2', 'enable', '超级管理员', '2015-01-15 13:27:46', '超级管理员', '2015-01-15 13:27:46');

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
INSERT INTO `t_par_com_industry` VALUES ('0398742afbc7ff3b7c464546fbf7c2d9', '工程', '8', 'enable', null, '超级管理员', '2015-01-15 13:25:03', '超级管理员', '2015-01-15 13:25:03');
INSERT INTO `t_par_com_industry` VALUES ('1fa43af341d27306f4165d105b15fe71', '制造', '7', 'enable', null, '超级管理员', '2015-01-15 13:24:51', '超级管理员', '2015-01-15 13:24:51');
INSERT INTO `t_par_com_industry` VALUES ('4fb8b0ada79478f9d48aaf1138807259', '食品', '2', 'enable', null, '超级管理员', '2015-01-15 13:23:24', '超级管理员', '2015-01-15 13:23:24');
INSERT INTO `t_par_com_industry` VALUES ('a92352354db6fd1c5677acc651a5590c', '医药', '3', 'enable', null, '超级管理员', '2015-01-15 13:23:49', '超级管理员', '2015-01-15 13:23:49');
INSERT INTO `t_par_com_industry` VALUES ('cb8171caf2cea8f63f874178793ff1d3', '其它', '9', 'enable', null, '超级管理员', '2015-01-15 13:25:13', '超级管理员', '2015-01-15 13:25:13');
INSERT INTO `t_par_com_industry` VALUES ('cf712e8e9c227eaf3bc145cf1e827e88', '化学', '1', 'enable', null, '超级管理员', '2015-01-15 13:23:15', '超级管理员', '2015-01-15 13:23:15');
INSERT INTO `t_par_com_industry` VALUES ('d6bf6230cbfd3356b5d83d4175205cf2', '服装', '4', 'enable', null, '超级管理员', '2015-01-15 13:23:59', '超级管理员', '2015-01-15 13:23:59');
INSERT INTO `t_par_com_industry` VALUES ('f59a0f81a0da339a10bb8da2941b9044', '运输', '5', 'enable', null, '超级管理员', '2015-01-15 13:24:19', '超级管理员', '2015-01-15 13:24:19');
INSERT INTO `t_par_com_industry` VALUES ('fe6fc36447615765153c3ec3b5682063', '建筑', '6', 'enable', null, '超级管理员', '2015-01-15 13:24:32', '超级管理员', '2015-01-15 13:24:32');

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
INSERT INTO `t_par_com_nature` VALUES ('23e5b5dcc9783195a71e6c65f59156ef', '事业单位', '4', 'enable', null, '超级管理员', '2015-01-15 13:30:30', '超级管理员', '2015-01-15 13:30:30');
INSERT INTO `t_par_com_nature` VALUES ('35ac1a67127dfb96e5fe436f968f2a31', '政府机构', '3', 'enable', null, '超级管理员', '2015-01-15 13:30:17', '超级管理员', '2015-01-15 13:30:17');
INSERT INTO `t_par_com_nature` VALUES ('387f87a6586d859f15feb4c9b5b45f55', '外商独资', '5', 'enable', null, '超级管理员', '2015-01-15 13:30:51', '超级管理员', '2015-01-15 13:30:51');
INSERT INTO `t_par_com_nature` VALUES ('456943fef9434c97595c9ac49c4e6dba', '国有企业', '2', 'enable', null, '超级管理员', '2015-01-15 13:30:07', '超级管理员', '2015-01-15 13:30:07');
INSERT INTO `t_par_com_nature` VALUES ('57094af11e218141ad32de09de0146dd', '其它', '8', 'enable', null, '超级管理员', '2015-01-15 13:31:34', '超级管理员', '2015-01-15 13:31:34');
INSERT INTO `t_par_com_nature` VALUES ('887acdc7a787d0b1f3f55b22cb5adedd', '私营企业', '7', 'enable', null, '超级管理员', '2015-01-15 13:31:25', '超级管理员', '2015-01-15 13:31:25');
INSERT INTO `t_par_com_nature` VALUES ('e4f769f7918f1f3b9007e0e12f015e73', '私民营企业', '1', 'enable', null, '超级管理员', '2015-01-08 16:35:42', '超级管理员', '2015-01-15 13:29:55');
INSERT INTO `t_par_com_nature` VALUES ('f43fe95e1a36ca5c66c9d2a1a838cf40', '合资/合作', '6', 'enable', null, '超级管理员', '2015-01-15 13:31:07', '超级管理员', '2015-01-15 13:31:07');

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
INSERT INTO `t_par_com_payment_type` VALUES ('3c1ef590b23fd70d9e5d17d8f7c9752e', null, '支票', '2', 'enable', '超级管理员', '2015-01-15 13:28:16', '超级管理员', '2015-01-15 13:28:16');
INSERT INTO `t_par_com_payment_type` VALUES ('4d1f120a4cf0cc114d00d046ae3aeceb', null, '转账', '3', 'enable', '超级管理员', '2015-01-15 13:28:27', '超级管理员', '2015-01-15 13:28:27');
INSERT INTO `t_par_com_payment_type` VALUES ('5205be0048ffa5a2a835147ed011c1ec', null, '邮政', '4', 'enable', '超级管理员', '2015-01-15 13:28:36', '超级管理员', '2015-01-15 13:28:36');
INSERT INTO `t_par_com_payment_type` VALUES ('79b75efd2b27c69e1ad451531a5bd6ed', null, '电汇', '5', 'enable', '超级管理员', '2015-01-15 13:28:50', '超级管理员', '2015-01-15 13:28:50');
INSERT INTO `t_par_com_payment_type` VALUES ('a623c991ee3df66df30de79ce8745c33', null, '现金', '1', 'enable', '超级管理员', '2015-01-08 15:07:28', '超级管理员', '2015-01-08 15:07:28');
INSERT INTO `t_par_com_payment_type` VALUES ('cd049fedf03522d85c35374d451aced4', null, '使用预付款', '7', 'enable', '超级管理员', '2015-01-15 13:29:23', '超级管理员', '2015-01-15 13:29:23');
INSERT INTO `t_par_com_payment_type` VALUES ('eee41af2d709d3f8c30223c71e067000', null, '使用预收款', '6', 'enable', '超级管理员', '2015-01-15 13:29:08', '超级管理员', '2015-01-15 13:29:08');

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
INSERT INTO `t_par_finance_cost_type` VALUES ('31f7a07573a2712f23f02bc04eae17c4', null, '饭费', '1', 'enable', '超级管理员', '2015-01-15 13:43:20', '超级管理员', '2015-01-15 13:43:20');
INSERT INTO `t_par_finance_cost_type` VALUES ('47be9eda32bf36641f87f5ee2f692841', null, '办公费', '2', 'enable', '超级管理员', '2015-01-15 13:43:29', '超级管理员', '2015-01-15 13:43:29');
INSERT INTO `t_par_finance_cost_type` VALUES ('49383c1d7d16f08c66b2392e48eb4437', null, '差旅费', '4', 'enable', '超级管理员', '2015-01-15 13:43:56', '超级管理员', '2015-01-15 13:43:56');
INSERT INTO `t_par_finance_cost_type` VALUES ('b7f572bc9375235d6cd847c5c5e02255', null, '其它', '5', 'enable', '超级管理员', '2015-01-15 13:44:02', '超级管理员', '2015-01-15 13:44:02');
INSERT INTO `t_par_finance_cost_type` VALUES ('ea7ae1a3dd95b379c98a369d9bb9c9a6', null, '水电费', '3', 'enable', '超级管理员', '2015-01-15 13:43:38', '超级管理员', '2015-01-15 13:43:38');

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
INSERT INTO `t_par_finance_payable_type` VALUES ('0c6e3567b8d3462004463a37d529df22', null, '其它采购', '2', 'enable', '超级管理员', '2015-01-15 13:42:11', '超级管理员', '2015-01-15 13:42:11');
INSERT INTO `t_par_finance_payable_type` VALUES ('950749d42df56f44f482ab7e79e6fbc5', null, '采购退货', '3', 'enable', '超级管理员', '2015-01-15 13:42:23', '超级管理员', '2015-01-15 13:42:23');
INSERT INTO `t_par_finance_payable_type` VALUES ('dab9667b0cdbd17ab0e5707f4124189e', null, '普通采购', '1', 'enable', '超级管理员', '2015-01-15 13:41:57', '超级管理员', '2015-01-15 13:41:57');
INSERT INTO `t_par_finance_payable_type` VALUES ('f14d54357ef04e7c368da6dc84637c5c', null, '其它应付', '5', 'enable', '超级管理员', '2015-01-15 13:42:47', '超级管理员', '2015-01-15 13:42:47');
INSERT INTO `t_par_finance_payable_type` VALUES ('f9d92d648702087a56d38590215c7110', null, '运费应付', '4', 'enable', '超级管理员', '2015-01-15 13:42:33', '超级管理员', '2015-01-15 13:42:33');

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
INSERT INTO `t_par_finance_receivable_type` VALUES ('6420bf1b34279d30bd5d42f40b8c95d0', null, '普通销售', '6', 'enable', '超级管理员', '2015-01-15 13:41:44', '超级管理员', '2015-01-15 13:41:44');
INSERT INTO `t_par_finance_receivable_type` VALUES ('78df4fbca6a3a92b4d11f3e47a5bb6cd', null, '其它应收', '2', 'enable', '超级管理员', '2015-01-15 13:41:08', '超级管理员', '2015-01-15 13:41:08');
INSERT INTO `t_par_finance_receivable_type` VALUES ('867df4558cf05a07d1b5e83d43b2ebd6', null, '销售退货', '4', 'enable', '超级管理员', '2015-01-15 13:41:25', '超级管理员', '2015-01-15 13:41:25');
INSERT INTO `t_par_finance_receivable_type` VALUES ('93fd55c2d0f46161e0ed6c9690f1bee1', null, '合同应收', '1', 'enable', '超级管理员', '2015-01-15 13:40:48', '超级管理员', '2015-01-15 13:40:48');
INSERT INTO `t_par_finance_receivable_type` VALUES ('c3b5b719ecf83d98f080bb3f9d5e6b73', null, '运费应收', '3', 'enable', '超级管理员', '2015-01-15 13:41:17', '超级管理员', '2015-01-15 13:41:17');
INSERT INTO `t_par_finance_receivable_type` VALUES ('d91854f7429b5b36c058ffcc8a910b55', null, '其他销售', '5', 'enable', '超级管理员', '2015-01-15 13:41:35', '超级管理员', '2015-01-15 13:41:35');

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
INSERT INTO `t_par_purchase_quoted_price_type` VALUES ('40e468d97bb3b551bdaa60d411804710', null, '普通报价', '1', 'enable', '超级管理员', '2015-01-15 13:35:12', '超级管理员', '2015-01-15 13:35:12');

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
INSERT INTO `t_par_purchase_returned_type` VALUES ('322611ce2e457c2f854093e8892ebe3f', null, '直接退货', '1', 'enable', '超级管理员', '2015-01-15 13:34:08', '超级管理员', '2015-01-15 13:34:08');
INSERT INTO `t_par_purchase_returned_type` VALUES ('5af1d30aa292d8f34d0c122ebc890e85', null, '上门办理', '2', 'enable', '超级管理员', '2015-01-15 13:33:59', '超级管理员', '2015-01-15 13:33:59');

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
INSERT INTO `t_par_purchase_return_reason` VALUES ('35addd669ac5613da746a9bdcddf658c', null, '运输中损坏', '2', 'enable', '超级管理员', '2015-01-15 13:34:37', '超级管理员', '2015-01-15 13:34:37');
INSERT INTO `t_par_purchase_return_reason` VALUES ('51e9bf6deb7565a6d04866a4f92a0899', null, '质量问题', '1', 'enable', '超级管理员', '2015-01-15 13:34:22', '超级管理员', '2015-01-15 13:34:22');
INSERT INTO `t_par_purchase_return_reason` VALUES ('59654a0490e2c1b31f9878f759e45a4c', null, '其它原因', '4', 'enable', '超级管理员', '2015-01-15 13:34:57', '超级管理员', '2015-01-15 13:34:57');
INSERT INTO `t_par_purchase_return_reason` VALUES ('76071dc448495742d43c9d0a018b8f17', null, '客户原因', '3', 'enable', '超级管理员', '2015-01-15 13:34:48', '超级管理员', '2015-01-15 13:34:48');

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
INSERT INTO `t_par_purchase_type` VALUES ('06d9a91b7416bf2af8d51cc9a7771190', null, '办公用品采购', '3', 'enable', '超级管理员', '2015-01-15 13:33:35', '超级管理员', '2015-01-15 13:33:35');
INSERT INTO `t_par_purchase_type` VALUES ('5a045a64dbf5b96d474dee248d50979b', null, '食品酒水采购', '2', 'enable', '超级管理员', '2015-01-15 13:33:15', '超级管理员', '2015-01-15 13:33:15');
INSERT INTO `t_par_purchase_type` VALUES ('ea9d4b40f6556fccdb4942251498cb0e', null, '其它', '4', 'enable', '超级管理员', '2015-01-15 13:33:41', '超级管理员', '2015-01-15 13:33:41');
INSERT INTO `t_par_purchase_type` VALUES ('ef52023ffbe66a75e3acc4b0282a411b', null, '普通采购', '1', 'enable', '超级管理员', '2015-01-15 13:33:00', '超级管理员', '2015-01-15 13:33:00');

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
INSERT INTO `t_par_sell_return_reason` VALUES ('558daba490249d2204c47111da419658', null, '过期产品', '1', 'enable', '超级管理员', '2015-01-15 13:36:31', '超级管理员', '2015-01-15 13:36:31');
INSERT INTO `t_par_sell_return_reason` VALUES ('577a717efea6cebf9e00bdb7b4f74e13', null, '质量问题', '3', 'enable', '超级管理员', '2015-01-15 13:36:50', '超级管理员', '2015-01-15 13:36:50');
INSERT INTO `t_par_sell_return_reason` VALUES ('6bbf0f28f861bde56eabd8ae7d141ead', null, '其它', '5', 'enable', '超级管理员', '2015-01-15 13:37:15', '超级管理员', '2015-01-15 13:37:15');
INSERT INTO `t_par_sell_return_reason` VALUES ('89c31e9d551a4b002d8398b2c6482d3e', null, '接近有效期', '2', 'enable', '超级管理员', '2015-01-15 13:36:43', '超级管理员', '2015-01-15 13:36:43');
INSERT INTO `t_par_sell_return_reason` VALUES ('f4ac7d84f5c257eea16924a997bfd73a', null, '包装破损', '4', 'enable', '超级管理员', '2015-01-15 13:37:04', '超级管理员', '2015-01-15 13:37:04');

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
INSERT INTO `t_par_sell_return_type` VALUES ('3f3f18a01e003f23527c7aaccc45dc85', null, '我方自提', '3', 'enable', '超级管理员', '2015-01-15 13:36:18', '超级管理员', '2015-01-15 13:36:18');
INSERT INTO `t_par_sell_return_type` VALUES ('ca8a97ee788cb77370239bbc8fb98688', null, '客户送货', '2', 'enable', '超级管理员', '2015-01-15 13:36:07', '超级管理员', '2015-01-15 13:36:07');
INSERT INTO `t_par_sell_return_type` VALUES ('dba30946adbfddb397aaebab8b31c194', null, '物流公司', '1', 'enable', '超级管理员', '2015-01-15 13:36:00', '超级管理员', '2015-01-15 13:36:00');

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
INSERT INTO `t_par_sell_type` VALUES ('4e386bb2e2983711edb979c801c184be', null, '普通销售', '2', 'enable', '超级管理员', '2015-01-15 13:35:29', '超级管理员', '2015-01-31 17:28:46');
INSERT INTO `t_par_sell_type` VALUES ('db35c992dabff789b515283758f8771b', null, '促销销售', '1', 'enable', '超级管理员', '2015-01-15 13:35:41', '超级管理员', '2015-01-15 13:35:41');

-- ----------------------------
-- Table structure for `t_par_suppliers_contact`
-- ----------------------------
DROP TABLE IF EXISTS `t_par_suppliers_contact`;
CREATE TABLE `t_par_suppliers_contact` (
  `supplier_contact_id` varchar(32) NOT NULL,
  `contact_type_id` varchar(32) default NULL,
  `supplier_id` varchar(32) default NULL,
  `name` varchar(32) default NULL,
  `sex` enum('man','secret','woman') default NULL,
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
  PRIMARY KEY  (`supplier_contact_id`),
  KEY `FK_ContactPerson_ContactType_ContactTypeId` (`contact_type_id`),
  KEY `FK_ContactPerson_Suppliers_ContactPersonId` (`supplier_id`),
  CONSTRAINT `t_par_suppliers_contact_ibfk_1` FOREIGN KEY (`supplier_id`) REFERENCES `t_suppliers` (`supplier_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_par_suppliers_contact
-- ----------------------------
INSERT INTO `t_par_suppliers_contact` VALUES ('3c33a5569a525aed48bb41cdb490757a', '6a77849f97c648181e98a8cf3fcd10b9', '983369162c230830eb8d8e9a167953b3', '冰冰', 'secret', '管理', '管理', '33', '1347897494', '32365965', '62226', '455', '', '', '', '', '2015-01-30 00:00:00', '', '', 'enable', '超级管理员', '2015-01-30 15:12:15', '超级管理员', '2015-01-30 15:12:15');
INSERT INTO `t_par_suppliers_contact` VALUES ('7fc0cf5bd635f4e00f3b96e3599a794a', '6a77849f97c648181e98a8cf3fcd10b9', '4d5ffdf8f36018a270d58bc98916b267', '小明', 'man', '经理', '经理', '提供物品', '13411379365', '经理', '6554654', '406592176@qq.com', '75520155', '珠海市', '55665', '54584878', '2015-01-30 00:00:00', '篮球', '经理', 'enable', '超级管理员', '2015-01-30 13:56:25', '超级管理员', '2015-01-30 15:11:31');

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
INSERT INTO `t_par_suppliers_grade` VALUES ('0a2c5de76d99e3f455b7b23f9ac96605', '其它供应商', '3', 'enable', null, '超级管理员', '2015-01-15 13:46:37', '超级管理员', '2015-01-15 13:46:37');
INSERT INTO `t_par_suppliers_grade` VALUES ('3b9af2f164cc3616ee06d75b97ac254d', '普通快递', '1', 'enable', '', '超级管理员', '2015-01-15 13:46:13', '超级管理员', '2015-01-15 13:46:13');
INSERT INTO `t_par_suppliers_grade` VALUES ('4f070400fdbb690247a03434e2c5d877', 'VIP供应商', '6', 'enable', null, '超级管理员', '2015-01-15 13:47:13', '超级管理员', '2015-01-15 13:47:13');
INSERT INTO `t_par_suppliers_grade` VALUES ('5f362f953dc17ef6ffecad25dd4279f5', '优质快递公司', '2', 'enable', null, '超级管理员', '2015-01-15 13:46:21', '超级管理员', '2015-01-15 13:46:21');
INSERT INTO `t_par_suppliers_grade` VALUES ('880d11c519a5a7181c3852f85fae2c16', '重要供应商', '5', 'enable', null, '超级管理员', '2015-01-15 13:46:57', '超级管理员', '2015-01-15 13:46:57');
INSERT INTO `t_par_suppliers_grade` VALUES ('a53010358cafd665b7bd76784c64e4a0', '普通供应商', '4', 'enable', null, '超级管理员', '2015-01-15 13:46:45', '超级管理员', '2015-01-15 13:46:45');

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
INSERT INTO `t_par_suppliers_source` VALUES ('094823ddb25c4af5f4fd1cb0ec0353f3', '媒体宣传', '3', 'enable', null, '超级管理员', '2015-01-15 13:47:58', '超级管理员', '2015-01-15 13:47:58');
INSERT INTO `t_par_suppliers_source` VALUES ('0fd0649d217072fca2a6a4e656f2f105', '电话来访', '5', 'enable', null, '超级管理员', '2015-01-15 13:47:29', '超级管理员', '2015-01-15 13:47:29');
INSERT INTO `t_par_suppliers_source` VALUES ('50a7920690592c804ad32930a8db2224', '朋友介绍', '4', 'enable', null, '超级管理员', '2015-01-15 13:47:46', '超级管理员', '2015-01-15 13:47:46');
INSERT INTO `t_par_suppliers_source` VALUES ('5bc1f3fa1101cbcbf6d68f09da5cbc21', '网络营销', '2', 'enable', null, '超级管理员', '2015-01-15 13:48:10', '超级管理员', '2015-01-15 13:48:10');
INSERT INTO `t_par_suppliers_source` VALUES ('c807410fd05e283f1f6e80c249d1c05b', '其它', '1', 'enable', null, '超级管理员', '2015-01-15 13:48:16', '超级管理员', '2015-01-15 13:48:16');

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
INSERT INTO `t_par_suppliers_type` VALUES ('53a50c1ba48cd25b7a3b5a0d5f5e8f88', '物流公司', '1', 'enable', null, '超级管理员', '2015-01-15 13:44:20', '超级管理员', '2015-01-15 13:44:20');
INSERT INTO `t_par_suppliers_type` VALUES ('541eb3706bd20afd7913a4bfff7c5c86', '配件类供应商', '2', 'enable', null, '超级管理员', '2015-01-15 13:44:32', '超级管理员', '2015-01-15 13:44:32');
INSERT INTO `t_par_suppliers_type` VALUES ('5acc068d2912a6bf8839ab3a363587b9', '酒水供应商', '4', 'enable', null, '超级管理员', '2015-01-15 13:45:15', '超级管理员', '2015-01-15 13:45:15');
INSERT INTO `t_par_suppliers_type` VALUES ('6b793a8bb74ad5c7cdfd9521091d2f9e', '家电供应商', '7', 'enable', null, '超级管理员', '2015-01-15 13:45:55', '超级管理员', '2015-01-15 13:45:55');
INSERT INTO `t_par_suppliers_type` VALUES ('8712f87b55b36eb1e7068fbceee14793', '办公用品供应商', '6', 'enable', null, '超级管理员', '2015-01-15 13:45:44', '超级管理员', '2015-01-15 13:45:44');
INSERT INTO `t_par_suppliers_type` VALUES ('da824ba453baeaae1358ad88ceac0645', '食品供应商', '5', 'enable', null, '超级管理员', '2015-01-15 13:45:28', '超级管理员', '2015-01-15 13:45:28');
INSERT INTO `t_par_suppliers_type` VALUES ('ef8657b82c98b4d0028e17ce9e118581', '日常用品供应商', '3', 'enable', null, '超级管理员', '2015-01-15 13:45:06', '超级管理员', '2015-01-15 13:45:06');

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
INSERT INTO `t_par_war_deploy_type` VALUES ('3f84f7df4c3923aff44ecdc73455b4d5', '2', null, '半成品调拨', 'enable', '超级管理员', '2015-01-23 14:54:10', '超级管理员', '2015-01-23 14:54:10');
INSERT INTO `t_par_war_deploy_type` VALUES ('48dcf060ba170754dc7b90109fbace63', '3', null, '其它调拨', 'enable', '超级管理员', '2015-01-23 14:54:20', '超级管理员', '2015-01-23 14:54:20');
INSERT INTO `t_par_war_deploy_type` VALUES ('f9ed14264450e7aca07285f2fa4485b5', '1', null, '成品调拨', 'enable', '超级管理员', '2015-01-23 14:53:50', '超级管理员', '2015-01-23 14:53:50');

-- ----------------------------
-- Table structure for `t_par_war_goods_classify`
-- ----------------------------
DROP TABLE IF EXISTS `t_par_war_goods_classify`;
CREATE TABLE `t_par_war_goods_classify` (
  `warehouse_classify_id` varchar(32) NOT NULL,
  `warehouse_id` varchar(32) default NULL,
  `war_goods_type_id` varchar(32) default NULL,
  PRIMARY KEY  (`warehouse_classify_id`),
  KEY `FK_Warehouse_WarehouseClassify_WarehouseId` (`warehouse_id`),
  KEY `FK_WarGoodsType_WarehouseClassify_WarGoodsTypeId` USING BTREE (`war_goods_type_id`),
  CONSTRAINT `FK_WarGoodsType_WarClassify_WarGoodsTypeId` FOREIGN KEY (`war_goods_type_id`) REFERENCES `t_par_war_goods_type` (`war_goods_type_id`),
  CONSTRAINT `t_par_war_goods_classify_ibfk_1` FOREIGN KEY (`warehouse_id`) REFERENCES `t_warehouse` (`warehouse_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_par_war_goods_classify
-- ----------------------------
INSERT INTO `t_par_war_goods_classify` VALUES ('13657656bcb661c374b2aaf5927bfbcc', '62a73e97049a17a9ec325a5e3e68e65e', '3c136a164ca37156fadb393c94b77a46');
INSERT INTO `t_par_war_goods_classify` VALUES ('2346b3ce2f533e0a63ec80694ffb9e23', '5223d6bd8ba6e0a256abce4378461097', '535dca1b4f1f09a7e689d652b4494bc9');
INSERT INTO `t_par_war_goods_classify` VALUES ('6c8700056ce19efc48e59baeb1f411e3', '3bd2455b1e73171579f68c68f7d20080', 'b2b25c4b9ab4172b8903f75f8bfd6d27');
INSERT INTO `t_par_war_goods_classify` VALUES ('8e7983f7e409feb092163f26ca9d9c84', '34fcfe262dd4016a8348bdd4e0d83030', '792fb0107f931b65d27352d02981d395');
INSERT INTO `t_par_war_goods_classify` VALUES ('bf8e135ce4f1e2c9eb8202da340ba65c', 'ae76c06bb36ce40d5fde188db7fa5a6f', '2f1bdfd481cf74f29ebad99e599c22d9');
INSERT INTO `t_par_war_goods_classify` VALUES ('c0b108c97411b661a74b22fead2e1b1f', 'e371e1d21659709b642a5bb5f7ff9056', '371bd5a31a2f03d64d6ea4e7cdc28488');
INSERT INTO `t_par_war_goods_classify` VALUES ('c13e35ec3f09bca5d8f54efdae1c7b1d', '86694c417941452e7e0aa915e7039bd4', '371044b50dabec3ffe93790226e3b644');

-- ----------------------------
-- Table structure for `t_par_war_goods_type`
-- ----------------------------
DROP TABLE IF EXISTS `t_par_war_goods_type`;
CREATE TABLE `t_par_war_goods_type` (
  `war_goods_type_id` varchar(32) NOT NULL,
  `order_num` int(4) default NULL,
  `name` varchar(50) default NULL,
  `enabled` enum('enable','disable') default NULL COMMENT 'ö�٣�(����1/����0)',
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`war_goods_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_par_war_goods_type
-- ----------------------------
INSERT INTO `t_par_war_goods_type` VALUES ('2f1bdfd481cf74f29ebad99e599c22d9', '9', '家电类', 'enable', null, '超级管理员', '2015-01-15 13:55:16', '超级管理员', '2015-01-15 13:55:16');
INSERT INTO `t_par_war_goods_type` VALUES ('371044b50dabec3ffe93790226e3b644', '3', '化工用品', 'enable', null, '超级管理员', '2015-01-15 13:54:17', '超级管理员', '2015-01-15 13:54:17');
INSERT INTO `t_par_war_goods_type` VALUES ('371bd5a31a2f03d64d6ea4e7cdc28488', '4', '灯具类', 'enable', null, '超级管理员', '2015-01-15 13:54:26', '超级管理员', '2015-01-15 13:54:26');
INSERT INTO `t_par_war_goods_type` VALUES ('3c136a164ca37156fadb393c94b77a46', '10', '食品酒水', 'enable', null, '超级管理员', '2015-01-15 13:55:35', '超级管理员', '2015-01-15 13:55:35');
INSERT INTO `t_par_war_goods_type` VALUES ('535dca1b4f1f09a7e689d652b4494bc9', '2', '仪器仪表类', 'enable', null, '超级管理员', '2015-01-15 13:54:08', '超级管理员', '2015-01-15 13:54:08');
INSERT INTO `t_par_war_goods_type` VALUES ('792fb0107f931b65d27352d02981d395', '7', '五金耗材', 'enable', null, '超级管理员', '2015-01-15 13:54:56', '超级管理员', '2015-01-15 13:54:56');
INSERT INTO `t_par_war_goods_type` VALUES ('b2b25c4b9ab4172b8903f75f8bfd6d27', '6', '汽车用品', 'enable', null, '超级管理员', '2015-01-15 13:54:45', '超级管理员', '2015-01-15 13:54:45');
INSERT INTO `t_par_war_goods_type` VALUES ('bd4dbfef2897185c87b4850057c2fe6f', '8', '电子产品', 'enable', null, '超级管理员', '2015-01-15 13:55:05', '超级管理员', '2015-01-15 13:55:05');
INSERT INTO `t_par_war_goods_type` VALUES ('c4a9bf841d083b9cbeefa3acac1dcddb', '11', '办公劳保', 'enable', null, '超级管理员', '2015-01-15 13:55:47', '超级管理员', '2015-01-15 13:55:47');
INSERT INTO `t_par_war_goods_type` VALUES ('db705f5630edcdc7afc01f7b0c3e57ad', '1', '医疗器械类', 'enable', null, '超级管理员', '2015-01-15 13:53:55', '超级管理员', '2015-01-15 13:53:55');
INSERT INTO `t_par_war_goods_type` VALUES ('e9c3ebcf70756f9ce664859301de1f79', '5', '机械设备', 'enable', null, '超级管理员', '2015-01-15 13:54:36', '超级管理员', '2015-01-15 13:54:36');

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
INSERT INTO `t_par_war_in_type` VALUES ('0855b46c5ff2e42d3a6127644a1321f3', '1', '不合格品入库', 'enable', '超级管理员', '2015-01-23 15:00:30', '超级管理员', '2015-01-23 15:00:30');
INSERT INTO `t_par_war_in_type` VALUES ('1b150c34a36fe097da2c3285e74c4b0f', '8', '还回入库', 'enable', '超级管理员', '2015-01-23 15:01:53', '超级管理员', '2015-01-23 15:01:53');
INSERT INTO `t_par_war_in_type` VALUES ('5dd1801c044b684f0bea405d172696da', '2', '报废品入库', 'enable', '超级管理员', '2015-01-23 15:00:43', '超级管理员', '2015-01-23 15:00:43');
INSERT INTO `t_par_war_in_type` VALUES ('653be8805638c6bc9b6ee41f81634615', '6', '组装入库', 'enable', '超级管理员', '2015-01-23 15:01:33', '超级管理员', '2015-01-23 15:01:33');
INSERT INTO `t_par_war_in_type` VALUES ('6bf11b763d6178ee5ad521c5c62dc29f', '4', '临时入库', 'enable', '超级管理员', '2015-01-23 15:01:12', '超级管理员', '2015-01-23 15:01:12');
INSERT INTO `t_par_war_in_type` VALUES ('72cc634d5031f1f163a5b79ac532a5f6', '3', '采购退货', 'enable', '超级管理员', '2015-01-23 15:00:59', '超级管理员', '2015-01-23 15:00:59');
INSERT INTO `t_par_war_in_type` VALUES ('a1e5f0acb5607d6ec78e56bf01464d89', '10', '报溢入库', 'enable', '超级管理员', '2015-01-23 15:02:25', '超级管理员', '2015-01-23 15:02:25');
INSERT INTO `t_par_war_in_type` VALUES ('ac9bdfae2029968d8059fd74ef5d61ef', '12', '采购入库', 'enable', '超级管理员', '2015-01-23 15:02:45', '超级管理员', '2015-01-23 15:02:45');
INSERT INTO `t_par_war_in_type` VALUES ('b1d16d3cff4228e23055e5a5f19be17c', '9', '获赠入库', 'enable', '超级管理员', '2015-01-23 15:02:13', '超级管理员', '2015-01-23 15:02:13');
INSERT INTO `t_par_war_in_type` VALUES ('dfd2eb094ebe2616154a6313612f427d', '7', '成品入库', 'enable', '超级管理员', '2015-01-23 15:01:44', '超级管理员', '2015-01-23 15:01:44');
INSERT INTO `t_par_war_in_type` VALUES ('e72986aad7a4c022ffaa2a2b3a550267', '11', '调拨入库', 'enable', '超级管理员', '2015-01-23 15:02:35', '超级管理员', '2015-01-23 15:02:35');
INSERT INTO `t_par_war_in_type` VALUES ('ea2f4c22ec47e988b2bea30bdc6b0777', '5', '拆分入库', 'enable', '超级管理员', '2015-01-23 15:01:22', '超级管理员', '2015-01-23 15:01:22');

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
INSERT INTO `t_par_war_occupation_type` VALUES ('43d2379cdbfc96a4a440b6d116abea39', '项目占用', '4', 'enable', '超级管理员', '2015-01-23 14:53:34', '超级管理员', '2015-01-23 14:53:34');
INSERT INTO `t_par_war_occupation_type` VALUES ('82629d9fc6532672e20ecb4903ece4fc', '生产配套占用', '2', 'enable', '超级管理员', '2015-01-23 14:53:11', '超级管理员', '2015-01-23 14:53:11');
INSERT INTO `t_par_war_occupation_type` VALUES ('ccef919658ceb83f894cf43dbeda3470', '销售订单占用', '1', 'enable', '超级管理员', '2015-01-23 14:52:59', '超级管理员', '2015-01-23 14:52:59');
INSERT INTO `t_par_war_occupation_type` VALUES ('f772cfd1057da8a2a04305a34f68158a', '客户占用', '3', 'enable', '超级管理员', '2015-01-23 14:53:23', '超级管理员', '2015-01-23 14:53:23');

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
INSERT INTO `t_par_war_out_type` VALUES ('105127cf97fdf4c3ebbfde639503c470', '8', '赠送出库', 'enable', '超级管理员', '2015-01-23 14:59:21', '超级管理员', '2015-01-23 14:59:21');
INSERT INTO `t_par_war_out_type` VALUES ('25016cad6e6504ff194370fa22049c2c', '5', '半成品出库', 'enable', '超级管理员', '2015-01-23 14:58:18', '超级管理员', '2015-01-23 14:58:18');
INSERT INTO `t_par_war_out_type` VALUES ('32f7e93e5563ba70c888df6ca79b3d3a', '11', '销售出库', 'enable', '超级管理员', '2015-01-23 14:59:55', '超级管理员', '2015-01-23 14:59:55');
INSERT INTO `t_par_war_out_type` VALUES ('4d345ebc85c9f9d940b4cbd5f56427db', '6', '原材料出库', 'enable', '超级管理员', '2015-01-23 14:58:30', '超级管理员', '2015-01-23 14:58:30');
INSERT INTO `t_par_war_out_type` VALUES ('590d17227babc38ca96cbef15e776b09', '1', '销售退货', 'enable', '超级管理员', '2015-01-23 14:56:24', '超级管理员', '2015-01-23 14:56:24');
INSERT INTO `t_par_war_out_type` VALUES ('68d06104b88f5167e9d49b5af322892d', '2', '拆分出库', 'enable', '超级管理员', '2015-01-23 14:56:34', '超级管理员', '2015-01-23 14:56:34');
INSERT INTO `t_par_war_out_type` VALUES ('72dcecf41e79c44ada47b0fd52dafada', '3', '组装出库', 'enable', '超级管理员', '2015-01-23 14:57:36', '超级管理员', '2015-01-23 14:57:36');
INSERT INTO `t_par_war_out_type` VALUES ('76a1b191a5ea560f1117ec3a4154812b', '4', '借出出库', 'enable', '超级管理员', '2015-01-23 14:58:06', '超级管理员', '2015-01-23 14:58:06');
INSERT INTO `t_par_war_out_type` VALUES ('9325cc855fcfe9f3555b2ee88f7f97f5', '9', '报损出库', 'enable', '超级管理员', '2015-01-23 14:59:35', '超级管理员', '2015-01-23 14:59:35');
INSERT INTO `t_par_war_out_type` VALUES ('c3eead6761bc1882ed317ddece0b8e32', '10', '调拨出库', 'enable', '超级管理员', '2015-01-23 14:59:44', '超级管理员', '2015-01-23 14:59:44');
INSERT INTO `t_par_war_out_type` VALUES ('c5cd474bfe78f4d8098bafba08204955', '7', '领用出库', 'enable', '超级管理员', '2015-01-23 14:58:46', '超级管理员', '2015-01-23 14:58:46');
INSERT INTO `t_par_war_out_type` VALUES ('e0b66c6f8b5f3cbb54b05819b6327a6f', '12', '零售出库', 'enable', '超级管理员', '2015-01-23 15:00:06', '超级管理员', '2015-01-23 15:00:06');

-- ----------------------------
-- Table structure for `t_purchase_arrival`
-- ----------------------------
DROP TABLE IF EXISTS `t_purchase_arrival`;
CREATE TABLE `t_purchase_arrival` (
  `pur_arrival_id` varchar(32) NOT NULL,
  `purchase_type_id` varchar(32) default NULL,
  `arrival_code` varchar(50) default NULL,
  `contract_code` varchar(50) default NULL,
  `supplier_id` varchar(32) default NULL,
  `fax` varchar(15) default NULL,
  `linkman` varchar(32) default NULL,
  `phone` varchar(15) default NULL,
  `supplier_add` varchar(100) default NULL,
  `storage` varchar(32) default NULL,
  `delivery_type` varchar(32) default NULL,
  `delivery_dead` datetime default NULL,
  `payment_agr_id` varchar(32) default NULL,
  `delivery_add` varchar(32) default NULL,
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
  `derate_money` decimal(16,4) default NULL,
  `arrival_date` datetime default NULL,
  `acceptor` varchar(32) default NULL,
  `accessory` varchar(255) default NULL,
  `not_pay_amo` decimal(16,4) default NULL,
  `alr_pay_amo` decimal(16,4) default NULL,
  `inv_state` enum('noneInv','portionInv','allInv') default NULL,
  `not_inv_amo` decimal(16,4) default NULL,
  `alr_inv_amo` decimal(16,4) default NULL,
  `return_state` enum('noneCancel','portionCancel','allCancel') default NULL,
  `not_return_amo` decimal(16,4) default NULL,
  `alr_return_amo` decimal(16,4) default NULL,
  `pay_state` enum('nonePay','portionPay','allPay') default NULL,
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
  `tail_after_status` enum('storage','nostorage') default NULL,
  `affirm_arrival` enum('no','yes') default NULL,
  `summary` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`pur_arrival_id`),
  KEY `FK_T_PURCHA_REFERENCE_T_PAR_PU1` (`purchase_type_id`),
  CONSTRAINT `t_purchase_arrival_ibfk_1` FOREIGN KEY (`purchase_type_id`) REFERENCES `t_par_purchase_type` (`purchase_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_purchase_arrival
-- ----------------------------
INSERT INTO `t_purchase_arrival` VALUES ('22a3600e3dcec7b8f8a85084768d8580', '06d9a91b7416bf2af8d51cc9a7771190', 'arrival2015_01_23_15_31_17', '', '4d5ffdf8f36018a270d58bc98916b267', '', '', '', '', '34fcfe262dd4016a8348bdd4e0d83030', '5d4031b343c8a2ef9c181defc2fd5ce7', '2015-01-05 00:00:00', '', '', 'yes', 'generaltax', '4d1f120a4cf0cc114d00d046ae3aeceb', 'selfpay', '', null, '4d5ffdf8f36018a270d58bc98916b267', '', '', null, '0.0000', '2015-01-22 00:00:00', '小米', '', '0.0000', '0.0000', 'noneInv', '0.0000', '0.0000', 'noneCancel', '0.0000', '0.0000', 'nonePay', 'authstr', null, null, null, 'disable', '62717e26384e41f4a7209e5cbefbc3a8', '采购部_B', null, null, null, null, null, null, '', '超级管理员', '2015-01-23 15:31:17', '超级管理员', '2015-01-23 15:31:17');

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
  KEY `FK_T_PURCHA_PURCHASE__T_PURCHA2` (`pur_arrival_id`),
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
  KEY `FK_T_PURCHA_PURCHASE__T_PURCHA3` (`pur_arrival_id`),
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
  `contract_code` varchar(50) default NULL,
  `contract_terms` text,
  `order_state` enum('noneExe','exeIng','termination','closed','affirm') default NULL,
  `purchase_type_id` varchar(32) default NULL,
  `order_date` datetime default NULL,
  `storage` varchar(32) default NULL,
  `supplier_code` varchar(32) default NULL,
  `supplier_id` varchar(32) default NULL,
  `supplier_add` varchar(100) default NULL,
  `linkman` varchar(32) default NULL,
  `phone` varchar(15) default NULL,
  `fax` varchar(19) default NULL,
  `payment_type_id` varchar(32) default NULL,
  `payment_agr_id` varchar(32) default NULL,
  `delivery_type` varchar(32) default NULL,
  `delivery_dadlines` datetime default NULL,
  `delivery_add` varchar(100) default NULL,
  `invoice` enum('yes','no') default NULL,
  `invoice_type_id` enum('specialvat','generalvat','generaltax','ordinarytax','receipt') default NULL,
  `inv_state` enum('noneInv','portionInv','allInv') default NULL,
  `total_amount` decimal(16,4) default NULL,
  `arr_state` enum('noneArr','portionArr','allArr') default NULL,
  `pay_state` enum('nonePay','portionPay','allPay') default NULL,
  `not_arr_amo` decimal(16,4) default NULL,
  `alr_arr_amo` decimal(16,4) default NULL,
  `not_pay_amo` decimal(16,4) default NULL,
  `alr_pay_amo` decimal(16,4) default NULL,
  `not_inv_amo` decimal(16,4) default NULL,
  `alr_inv_amo` decimal(16,4) default NULL,
  `accessory` varchar(255) default NULL,
  `shared_people_id` varchar(32) default NULL,
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
  KEY `FK_T_PURCHA_PURCHASE__T_PAR_PU4` (`purchase_type_id`),
  CONSTRAINT `t_purchase_order_ibfk_1` FOREIGN KEY (`purchase_type_id`) REFERENCES `t_par_purchase_type` (`purchase_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_purchase_order
-- ----------------------------
INSERT INTO `t_purchase_order` VALUES ('1e3181d50d2726ef422ba603054c1d54', 'CGDD-23-09-20', '', null, 'exeIng', '5a045a64dbf5b96d474dee248d50979b', '2015-01-21 00:00:00', '62a73e97049a17a9ec325a5e3e68e65e', null, '4d5ffdf8f36018a270d58bc98916b267', null, '', null, null, '4d1f120a4cf0cc114d00d046ae3aeceb', '', '5d4031b343c8a2ef9c181defc2fd5ce7', '2015-01-23 00:00:00', '', 'no', 'generaltax', null, null, 'noneArr', 'nonePay', '0.0000', '0.0000', null, '0.0000', '0.0000', '0.0000', null, '', 'authstr', null, null, null, 'enable', '62717e26384e41f4a7209e5cbefbc3a8', null, '', '超级管理员', '2015-01-23 09:32:20', '超级管理员', '2015-01-23 09:32:20');
INSERT INTO `t_purchase_order` VALUES ('2a164eca2f4f4ca101b6cf23887158a3', 'CGDD-2015_01_31_09_42_07', '', null, 'exeIng', '5a045a64dbf5b96d474dee248d50979b', '2015-01-31 09:42:07', '62a73e97049a17a9ec325a5e3e68e65e', '100001', '983369162c230830eb8d8e9a167953b3', '珠海市香洲区唐家湾镇', '', null, '', '3c1ef590b23fd70d9e5d17d8f7c9752e', '', 'd61383c331468cc0c7724f2e792fdd7e', '2015-01-31 09:42:07', '', 'no', 'generaltax', 'noneInv', '5469.0000', 'noneArr', 'nonePay', '5469.0000', '0.0000', '5469.0000', '0.0000', '5469.0000', '0.0000', null, '', 'pass', '超级管理员', '2015-02-03 11:12:27', '', 'disable', '', '', '', '超级管理员', '2015-01-31 09:42:07', '超级管理员', '2015-01-31 09:42:39');

-- ----------------------------
-- Table structure for `t_purchase_order_closed`
-- ----------------------------
DROP TABLE IF EXISTS `t_purchase_order_closed`;
CREATE TABLE `t_purchase_order_closed` (
  `pur_order_col_id` varchar(32) NOT NULL,
  `order_clo_code` varchar(50) default NULL,
  `pur_order_id` varchar(32) default NULL,
  `content` varchar(255) default NULL,
  `operator_dep` varchar(32) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  PRIMARY KEY  (`pur_order_col_id`),
  KEY `FK_T_PURCHA_PURCHASE__T_PURCHA5` (`pur_order_id`),
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
  `brand` varchar(32) default NULL,
  `place_of_origin` varchar(32) default NULL,
  `prime_cost` decimal(16,4) default NULL,
  `discount` decimal(16,4) default NULL,
  `cess` decimal(16,4) default NULL,
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
  `not_ter_money` decimal(16,4) default NULL,
  `alr_ter_money` decimal(16,4) default NULL,
  `remark` varchar(255) default NULL,
  PRIMARY KEY  (`pur_order_det_id`),
  KEY `FK_T_PURCHA_PURCHASE__T_PURCHA6` (`pur_order_id`),
  CONSTRAINT `t_purchase_order_detail_ibfk_1` FOREIGN KEY (`pur_order_id`) REFERENCES `t_purchase_order` (`pur_order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_purchase_order_detail
-- ----------------------------
INSERT INTO `t_purchase_order_detail` VALUES ('75d1995f94ecfba51cb073ac7c3fc70f', '2a164eca2f4f4ca101b6cf23887158a3', '1', 'GD_001', '仙贝', 'GD_SP_001', null, '65', '5.0000', '旺旺小馒头', '珠海', '5.0000', '1.0000', '0.0100', '325.0000', '2015-01-31 09:42:07', '0', '0', '0', '0', '0', '0', '0', '0', '0.0000', '0.0000', '通过');
INSERT INTO `t_purchase_order_detail` VALUES ('761c4f863c1012344da5781ace13c30f', '2a164eca2f4f4ca101b6cf23887158a3', 'a471a158d1108d20681ccf25cd8c521c', 'GD_8841', '方便面', 'SP_8841', null, '10', '4.0000', '康师傅', '珠海市', '2.0000', '2.0000', '1.0000', '40.0000', '2015-01-31 09:42:07', '0', '0', '0', '0', '0', '0', '0', '0', '0.0000', '0.0000', '');
INSERT INTO `t_purchase_order_detail` VALUES ('9ab359406ae7ae820227aefa192b737c', '2a164eca2f4f4ca101b6cf23887158a3', 'a471a158d1108d20681ccf25cd8c521c', 'GD_8841', '方便面', 'SP_8841', null, '2', '2.0000', '康师傅', '珠海市', '2.0000', '1.0000', '1.0000', '4.0000', '2015-01-31 09:42:07', '0', '0', '0', '0', '0', '0', '0', '0', '0.0000', '0.0000', '');
INSERT INTO `t_purchase_order_detail` VALUES ('d97fa7149fa31864e993cbb3db0b5c41', '1e3181d50d2726ef422ba603054c1d54', '1', 'GD_001', '仙贝', 'GD_SP_001', null, '10', '12.0000', '旺旺小馒头', '珠海', '5.0000', '1.0000', '0.0000', '0.0000', '2015-01-23 09:32:20', '0', '0', '0', '0', '0', '0', '0', '0', '0.0000', '0.0000', '通过');
INSERT INTO `t_purchase_order_detail` VALUES ('da07ea598700804c564f9a29f05cc8cc', '2a164eca2f4f4ca101b6cf23887158a3', '6fbccbb745c2d67bc9540f4e3c0cafe5', 'GD_6296', '锥子', 'SP_6296', null, '5', '20.0000', '刚石', '深圳', '20.0000', '1.0000', '10.0000', '100.0000', '2015-01-31 09:42:07', '0', '0', '0', '0', '0', '0', '0', '0', '0.0000', '0.0000', '');
INSERT INTO `t_purchase_order_detail` VALUES ('fa1b2069d8a775955b43d92c4066a494', '2a164eca2f4f4ca101b6cf23887158a3', 'f89c5e076b6900765eb3feb2987d7f88', 'GD_6822', '香水', 'SP_6822', null, '100', '50.0000', '郎龙', '北京', '25.0000', '2.0000', '20.0000', '5000.0000', '2015-01-31 09:42:07', '0', '0', '0', '0', '0', '0', '0', '0', '0.0000', '0.0000', '');

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
  KEY `FK_T_PURCHA_PURCHASE__T_PURCHA7` (`pur_order_id`),
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
  `order_track_code` varchar(50) default NULL,
  `pur_order_id` varchar(32) default NULL,
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
  KEY `FK_T_PURCHA_PURCHASE__T_PURCHA8` (`pur_order_id`),
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
  `purchase_type_id` varchar(32) default NULL,
  `req_date` datetime default NULL,
  `storage` varchar(32) default NULL,
  `order_state` enum('noneOrder','portionOrder','allOrder') default NULL,
  `operators` varchar(32) default NULL,
  `operator_dep` varchar(32) default NULL,
  `total` decimal(16,4) default NULL,
  `accessory` varchar(255) default NULL,
  `audit_state` enum('authstr','pass','failure') default NULL,
  `auditor` varchar(32) default NULL,
  `audit_date` datetime default NULL,
  `audit_remark` varchar(255) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `summary` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`pur_req_id`),
  KEY `FK_T_PURCHA_PURCHASE__T_PAR_PU9` (`purchase_type_id`),
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
  `price` decimal(16,4) default NULL,
  `quantity` int(4) default NULL,
  `money` decimal(16,4) default NULL,
  `deadline` datetime default NULL,
  `not_order_num` int(4) default NULL,
  `alr_order_num` int(4) default NULL,
  `remark` varchar(255) default NULL,
  PRIMARY KEY  (`pur_req_det_id`),
  KEY `FK_T_PURCHA_PURCHASE__T_PURCHA10` (`pur_req_id`),
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
  `pro_came` varchar(32) default NULL,
  `storage` varchar(32) default NULL,
  `supplier_id` varchar(32) default NULL,
  `supplier_add` varchar(100) default NULL,
  `linkman` varchar(32) default NULL,
  `phone` varchar(15) default NULL,
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
  `payment_state` enum('nonePay','portionPay','allPay') default NULL,
  `not_pay_amo` decimal(16,4) default NULL,
  `alr_pay_amo` decimal(16,4) default NULL,
  `inv_state` enum('noneInv','portionInv','allInv') default NULL,
  `not_inv_amo` decimal(16,4) default NULL,
  `alr_inv_amo` decimal(16,4) default NULL,
  `refund_total` decimal(16,4) default NULL,
  `enabled` enum('enable','disable') default NULL,
  `operators` varchar(32) default NULL,
  `operator_dep` varchar(32) default NULL,
  `audit_state` enum('authstr','pass','failure') default NULL,
  `auditor` varchar(32) default NULL,
  `audit_date` datetime default NULL,
  `audit_remark` varchar(255) default NULL,
  `summary` varchar(255) default NULL,
  `accessory` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`pur_return_id`),
  KEY `FK_T_PURCHA_PURCHASE__T_PAR_PU11` (`return_reason_id`),
  KEY `FK_T_PURCHA_RETURNED__T_PAR_PU12` (`returned_purchase_type_id`),
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
  `brand` varchar(32) default NULL,
  `place_of_origin` varchar(32) default NULL,
  `batch_information` varchar(32) default NULL,
  `cess` decimal(16,4) default NULL,
  `money` decimal(16,4) default NULL,
  `pur_money` decimal(16,4) default NULL,
  `deadline` datetime default NULL,
  `not_pay_num` int(4) default NULL,
  `alr_pay_num` int(4) default NULL,
  `not_inv_num` int(4) default NULL,
  `alr_inv_num` int(4) default NULL,
  `remark` varchar(255) default NULL,
  PRIMARY KEY  (`pur_return_det_id`),
  KEY `FK_T_PURCHA_PURCHASE__T_PURCHA13` (`pur_return_id`),
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
  `supplier_level` varchar(32) default NULL,
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
INSERT INTO `t_suppliers` VALUES ('4d5ffdf8f36018a270d58bc98916b267', '100002', '广东省', '2000.0000', '顺风快递', '5acc068d2912a6bf8839ab3a363587b9', '0755-3628820', '0755-3628820', 'shunfeng.com', 'shunfeng@qq.com', '珠海市', '珠海市香洲区', '919800', '0a2c5de76d99e3f455b7b23f9ac96605', '0fd0649d217072fca2a6a4e656f2f105', '35ac1a67127dfb96e5fe436f968f2a31', '0398742afbc7ff3b7c464546fbf7c2d9', '运输', '26a093f5603e8152077c1f4ce8fc02ad', null, '1000000.0000', '小王', '高', '中国农业银行', '622058155546120525', '111455511', '2015-01-30 00:00:00', '', 'enable', null, null, null, null, '', '超级管理员', '2015-01-15 14:03:17', '超级管理员', '2015-01-30 15:13:29');
INSERT INTO `t_suppliers` VALUES ('983369162c230830eb8d8e9a167953b3', '100001', '广东省', '1000.0000', '珠海小木设备有限公司', '541eb3706bd20afd7913a4bfff7c5c86', '020-3628802', '', '', '', '珠海市', '珠海市香洲区唐家湾镇', '525100', '4f070400fdbb690247a03434e2c5d877', '0fd0649d217072fca2a6a4e656f2f105', '35ac1a67127dfb96e5fe436f968f2a31', '1fa43af341d27306f4165d105b15fe71', '', '26a093f5603e8152077c1f4ce8fc02ad', null, '50000.0000', '小董', '高', '中国工商银行', '622062220551022214', '03258411551', '2015-01-30 00:00:00', '', 'enable', null, null, null, null, '', '超级管理员', '2015-01-15 14:00:38', '超级管理员', '2015-01-30 14:08:16');

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
INSERT INTO `t_user` VALUES ('546aa3d14b0f8d8af3f31bd761454980', 'dongxiaofeng', '董小峰', 'ae457e6127ea8482e613989e849a54500306f0c3', '20433476c911a7804aa8e5c43f2b8b16', '818a349e244d0dde', 'enable', 'custom', '2265665@qq.ocm', null, '', null, null, '0', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 17:15:53');
INSERT INTO `t_user` VALUES ('62717e26384e41f4a7209e5cbefbc3a8', 'xiaomi', '小米', 'c2ca9e8e5e11c20cb5a51c657e6add86f71a9ee8', '8489385d4c74e47f1a3d77c9932644a9', 'da140f4b69f398f9', 'enable', 'custom', '56654654@qq.com', null, '', null, null, '0', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 17:22:52');
INSERT INTO `t_user` VALUES ('6a28fdc7af46a33ba7ca10910e1e33b1', 'xiaoming', '小明', 'ed2e3b949228ed0651807541e08ee14e99253dd8', '5484ccad10e3414b99b77b303as62', '537cfb777b628c78', 'enable', 'custom', 'xiaomi@qq.com', null, '', null, null, '0', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 17:22:28');
INSERT INTO `t_user` VALUES ('796684d2d92d636f3ef7f7b05452e001', 'xiaoxie', '小谢', 'e767737399257cd5d8b763961cac15b10ed8f2b1', '9aadf56ac5f8ba2a7c6945aa31d1f2e8', 'e8c9971d56ffe61f', 'enable', 'custom', '654545@qq.com', null, '', null, null, '0', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 17:21:36');
INSERT INTO `t_user` VALUES ('8b25651c2d896297530b64e4b80ec503', 'admin', '超级管理员', '5dc10e7826e648ec6f136974c38f81d0e5e1d0ae', '1ff32f3ab5bd95584a429130956fecea', 'e03b1b95ceff4db6', 'enable', 'admin', 'admin@glacier.cn', null, null, '2015-02-03 13:24:26', '127.0.0.1[本地]', '1094', '8b25651c2d896297530b64e4b80ec503', '2014-02-27 02:58:02');
INSERT INTO `t_user` VALUES ('b3c392662caa88d95aeda0ac72ec5cc2', 'xiaowang', '小王', 'bec3f1905a46ac3fc2254b20a4e01e039d2358b9', '8ed000a5781bcfb2448a0dd5067ea709', 'f479bd75d16f6ffe', 'enable', 'custom', '2165456456@qq.com', null, '', null, null, '0', '8b25651c2d896297530b64e4b80ec503', '2015-01-15 17:21:56');
INSERT INTO `t_user` VALUES ('d31a15b0c9abe32744dc16203b9547d8', 'administrators', '客户管理员', 'f418eabf12e35e6112d8783ef6751c0da68782b5', '1ff32f3ab5bd95584a429130956fecea', 'd5a18894f8d85631', 'enable', 'custom', 'administrators@qq.com', null, '后台管理员', null, null, '0', '8b25651c2d896297530b64e4b80ec503', '2014-07-28 16:30:17');
INSERT INTO `t_user` VALUES ('d6dc13121742a3b331dcb6f93d4f4bce', 'adminTest', '客户管理员', 'd7d62bc0a343ffea509247f1a7c92120e762771d', '1ff32f3ab5bd95584a429130956fecea', 'baaa252597ec918e', 'enable', 'custom', 'adminTest@163.com', null, '客户、测试使用账号', '2014-08-04 17:53:34', '127.0.0.1[本地]', '4', '8b25651c2d896297530b64e4b80ec503', '2014-07-14 13:40:42');

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
INSERT INTO `t_warehouse` VALUES ('34fcfe262dd4016a8348bdd4e0d83030', '1', 'WH_4942', '五金耗材库', '8ed000a5781bcfb2448a0dd5067ea709', 'b3c392662caa88d95aeda0ac72ec5cc2', 'yes', '13750046325', '珠海市', '小王', null, 'enable', '超级管理员', '2015-01-16 16:20:19', '超级管理员', '2015-01-23 10:09:13');
INSERT INTO `t_warehouse` VALUES ('3bd2455b1e73171579f68c68f7d20080', '33', 'WH_2015-01-23-163137', '汽车用品库', '8ed000a5781bcfb2448a0dd5067ea709', 'b3c392662caa88d95aeda0ac72ec5cc2', 'yes', '13520254526', '珠海市', '小红', '', 'enable', '超级管理员', '2015-01-23 16:31:37', '超级管理员', '2015-01-23 16:31:37');
INSERT INTO `t_warehouse` VALUES ('5223d6bd8ba6e0a256abce4378461097', '6', 'WH_2015-01-23-163109', '仪器仪表库', '8ed000a5781bcfb2448a0dd5067ea709', 'b3c392662caa88d95aeda0ac72ec5cc2', 'yes', '13520254526', '珠海市', '小强', '', 'enable', '超级管理员', '2015-01-23 16:31:09', '超级管理员', '2015-01-23 16:31:09');
INSERT INTO `t_warehouse` VALUES ('62a73e97049a17a9ec325a5e3e68e65e', '2', 'WH_8327', '食品酒水库', '8ed000a5781bcfb2448a0dd5067ea709', 'b3c392662caa88d95aeda0ac72ec5cc2', 'yes', '13750046524', '珠海市香洲区', '小王', '', 'enable', '超级管理员', '2015-01-16 16:20:58', '超级管理员', '2015-01-23 16:12:22');
INSERT INTO `t_warehouse` VALUES ('86694c417941452e7e0aa915e7039bd4', '4', 'WH_2015-01-23-162939', '化工用品库', '8ed000a5781bcfb2448a0dd5067ea709', 'b3c392662caa88d95aeda0ac72ec5cc2', 'yes', '13411379365', '珠海市', '小王', '', 'enable', '超级管理员', '2015-01-23 16:29:39', '超级管理员', '2015-01-23 16:29:39');
INSERT INTO `t_warehouse` VALUES ('ae76c06bb36ce40d5fde188db7fa5a6f', '3', 'WH_2015-01-23-161314', '家电库', '20433476c911a7804aa8e5c43f2b8b16', '546aa3d14b0f8d8af3f31bd761454980', 'yes', '13411379365', '广州市', '小王', '', 'enable', '超级管理员', '2015-01-23 16:13:14', '超级管理员', '2015-01-23 16:13:14');
INSERT INTO `t_warehouse` VALUES ('e371e1d21659709b642a5bb5f7ff9056', '5', 'WH_2015-01-23-163015', '灯具库', '8ed000a5781bcfb2448a0dd5067ea709', 'b3c392662caa88d95aeda0ac72ec5cc2', 'yes', '13750042148', '珠海市', '小文', '', 'enable', '超级管理员', '2015-01-23 16:30:15', '超级管理员', '2015-01-23 16:30:15');

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
