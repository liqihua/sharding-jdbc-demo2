/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50521
Source Host           : localhost:3306
Source Database       : shared_db1_master

Target Server Type    : MYSQL
Target Server Version : 50521
File Encoding         : 65001

Date: 2018-04-09 11:06:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` varchar(32) NOT NULL COMMENT '系统用户表',
  `username` varchar(255) NOT NULL COMMENT '用户名（登录账号）',
  `password` varchar(255) NOT NULL COMMENT '登录密码',
  `locked` varchar(2) NOT NULL COMMENT '锁定：1是，0否',
  `gender` varchar(2) DEFAULT NULL COMMENT '性别：1男，0女',
  `nickname` varchar(255) DEFAULT NULL COMMENT '昵称',
  `update_date` datetime NOT NULL,
  `create_date` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'admin', '40bd001563085fc35165329ea1ff5c5ecbdbbeef', '0', '1', 'adminadmin', '2016-08-26 11:29:25', '2016-08-08 12:27:34');
INSERT INTO `sys_user` VALUES ('6a28b9d3c34d47ccb2750d85544a9487', 'aa', '40bd001563085fc35165329ea1ff5c5ecbdbbeef', '1', '1', 'aa', '2016-08-26 11:29:34', '2016-08-23 16:10:22');
