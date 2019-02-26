/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50559
Source Host           : localhost:3306
Source Database       : ssmdemo

Target Server Type    : MYSQL
Target Server Version : 50559
File Encoding         : 65001

Date: 2019-02-26 10:26:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `id` char(32) NOT NULL,
  `user_name` varchar(32) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  `name` varchar(32) DEFAULT NULL,
  `age` int(10) DEFAULT NULL,
  `sex` int(2) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `created` datetime DEFAULT NULL,
  `updated` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('1', 'Jinjin', '123456', '静静', '18', '0', '2019-02-25', '2019-02-25 10:03:37', '2019-02-25 18:00:16');
INSERT INTO `tb_user` VALUES ('10', 'bigGod222', '123456', '大神', '20', '2', '2019-02-25', '2019-02-25 18:06:15', '2019-02-25 18:06:15');
INSERT INTO `tb_user` VALUES ('2', 'zhu1', '1', '111', '19', '1', '2019-02-25', '2019-02-25 10:04:08', '2019-02-25 10:04:11');
INSERT INTO `tb_user` VALUES ('3', 'evan', '123456', '大鹏', '16', '1', '1990-09-02', '2019-02-25 13:57:46', '2019-02-25 13:57:46');
