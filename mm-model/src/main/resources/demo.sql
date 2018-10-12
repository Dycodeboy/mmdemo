/*
Navicat MySQL Data Transfer

Source Server         : 192.168.207.134_3306
Source Server Version : 80012
Source Host           : 192.168.207.134:3306
Source Database       : demo

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2018-10-12 18:30:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for demo
-- ----------------------------
DROP TABLE IF EXISTS `demo`;
CREATE TABLE `demo` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `REMOVED` bit(1) DEFAULT b'0',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of demo
-- ----------------------------
INSERT INTO `demo` VALUES ('1', '222', '', '2018-09-26 15:21:53', '2018-09-26 19:57:44');
INSERT INTO `demo` VALUES ('3', '1231', '\0', '2018-09-26 15:22:00', '2018-09-26 15:22:00');

-- ----------------------------
-- Table structure for sys_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_permission`;
CREATE TABLE `sys_permission` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '权限名称',
  `url` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '权限访问路径',
  `type` tinyint(4) DEFAULT NULL COMMENT '类型   0：目录   1：菜单   2：按钮',
  `parent_id` int(10) unsigned DEFAULT NULL COMMENT '父级权限id',
  `description` varchar(255) DEFAULT NULL COMMENT '权限描述',
  `REMOVED` bit(1) DEFAULT b'0' COMMENT '逻辑删除标识',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_permission
-- ----------------------------
INSERT INTO `sys_permission` VALUES ('1', 'per1', null, '0', null, null, '\0', '2018-10-12 16:34:24', '2018-10-12 16:34:24');
INSERT INTO `sys_permission` VALUES ('2', 'per2', null, '0', null, null, '\0', '2018-10-12 16:34:54', '2018-10-12 16:35:12');
INSERT INTO `sys_permission` VALUES ('3', 'per3', null, '0', null, null, '\0', '2018-10-12 16:35:14', '2018-10-12 16:35:25');
INSERT INTO `sys_permission` VALUES ('4', 'per4', null, '0', '1', null, '\0', '2018-10-12 16:35:16', '2018-10-12 16:35:36');
INSERT INTO `sys_permission` VALUES ('5', 'per5', null, '0', '1', null, '\0', '2018-10-12 16:35:18', '2018-10-12 16:35:37');
INSERT INTO `sys_permission` VALUES ('6', 'per6', null, '0', '2', null, '\0', '2018-10-12 16:35:20', '2018-10-12 16:35:39');
INSERT INTO `sys_permission` VALUES ('7', 'per7', null, '0', '2', null, '\0', '2018-10-12 16:35:23', '2018-10-12 16:35:41');

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '角色名称',
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '角色描述',
  `REMOVED` bit(1) DEFAULT b'0' COMMENT '逻辑删除标识',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', 'role1', 'role1', '\0', '2018-10-12 16:31:39', '2018-10-12 16:31:39');
INSERT INTO `sys_role` VALUES ('2', 'role2', 'role2', '\0', '2018-10-12 16:31:51', '2018-10-12 16:31:51');
INSERT INTO `sys_role` VALUES ('3', 'role3', 'role3', '\0', '2018-10-12 16:31:56', '2018-10-12 16:31:56');

-- ----------------------------
-- Table structure for sys_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_permission`;
CREATE TABLE `sys_role_permission` (
  `role_id` int(10) unsigned NOT NULL,
  `permission_id` int(10) unsigned NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_permission
-- ----------------------------
INSERT INTO `sys_role_permission` VALUES ('1', '1');
INSERT INTO `sys_role_permission` VALUES ('1', '3');
INSERT INTO `sys_role_permission` VALUES ('1', '4');
INSERT INTO `sys_role_permission` VALUES ('1', '6');
INSERT INTO `sys_role_permission` VALUES ('2', '2');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `account` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '账号名',
  `password` varchar(65) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '密码',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '昵称',
  `salt` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '加密盐值',
  `last_login_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后登录时间',
  `REMOVED` bit(1) DEFAULT b'0' COMMENT '逻辑删除标识',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'user1', '123456', 'user1', '666', '2018-10-12 16:29:22', '\0', '2018-10-12 16:29:22', '2018-10-12 16:30:56');
INSERT INTO `sys_user` VALUES ('2', 'user2', '123456', 'user2', '666', '2018-10-12 16:31:07', '\0', '2018-10-12 16:31:07', '2018-10-12 16:31:07');
INSERT INTO `sys_user` VALUES ('3', 'user3', '123456', 'user3', '666', '2018-10-12 16:31:17', '\0', '2018-10-12 16:31:17', '2018-10-12 16:31:17');

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `user_id` bigint(20) unsigned NOT NULL,
  `role_id` int(11) unsigned NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES ('1', '1');
INSERT INTO `sys_user_role` VALUES ('2', '2');
INSERT INTO `sys_user_role` VALUES ('3', '3');
INSERT INTO `sys_user_role` VALUES ('1', '2');
