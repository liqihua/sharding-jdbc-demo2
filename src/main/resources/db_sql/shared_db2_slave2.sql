/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50521
Source Host           : localhost:3306
Source Database       : shared_db2_slave2

Target Server Type    : MYSQL
Target Server Version : 50521
File Encoding         : 65001

Date: 2018-04-09 11:07:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_province
-- ----------------------------
DROP TABLE IF EXISTS `sys_province`;
CREATE TABLE `sys_province` (
  `id` varchar(32) NOT NULL COMMENT 'id',
  `name` varchar(32) NOT NULL COMMENT '省份名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_province
-- ----------------------------
INSERT INTO `sys_province` VALUES ('10', '江苏');
INSERT INTO `sys_province` VALUES ('11', '浙江');
INSERT INTO `sys_province` VALUES ('12', '安徽');
INSERT INTO `sys_province` VALUES ('13', '福建');
INSERT INTO `sys_province` VALUES ('14', '江西');
INSERT INTO `sys_province` VALUES ('15', '山东');
INSERT INTO `sys_province` VALUES ('16', '河南');
INSERT INTO `sys_province` VALUES ('17', '湖北');
INSERT INTO `sys_province` VALUES ('18', '湖南');
INSERT INTO `sys_province` VALUES ('19', '广东');
INSERT INTO `sys_province` VALUES ('2', '天津');
INSERT INTO `sys_province` VALUES ('20', '广西');
INSERT INTO `sys_province` VALUES ('21', '海南');
INSERT INTO `sys_province` VALUES ('22', '重庆');
INSERT INTO `sys_province` VALUES ('23', '四川');
INSERT INTO `sys_province` VALUES ('24', '贵州');
INSERT INTO `sys_province` VALUES ('25', '云南');
INSERT INTO `sys_province` VALUES ('26', '西藏');
INSERT INTO `sys_province` VALUES ('27', '陕西');
INSERT INTO `sys_province` VALUES ('28', '甘肃');
INSERT INTO `sys_province` VALUES ('29', '青海');
INSERT INTO `sys_province` VALUES ('3', '河北');
INSERT INTO `sys_province` VALUES ('30', '宁夏');
INSERT INTO `sys_province` VALUES ('31', '新疆');
INSERT INTO `sys_province` VALUES ('32', '香港');
INSERT INTO `sys_province` VALUES ('33', '澳门');
INSERT INTO `sys_province` VALUES ('34', '台湾');
INSERT INTO `sys_province` VALUES ('4', '山西');
INSERT INTO `sys_province` VALUES ('5', '内蒙古');
INSERT INTO `sys_province` VALUES ('6', '辽宁');
INSERT INTO `sys_province` VALUES ('7', '吉林');
INSERT INTO `sys_province` VALUES ('8', '黑龙江');
INSERT INTO `sys_province` VALUES ('9', '上海');
INSERT INTO `sys_province` VALUES ('bb', '北京');
