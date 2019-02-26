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

CREATE TABLE tb_order (
id int(11) NOT NULL AUTO_INCREMENT,
user_id int(11) DEFAULT NULL,
order_number varchar(255) DEFAULT NULL,
PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
INSERT INTO tb_order VALUES ('1', '2', '201807010001');

CREATE TABLE tb_item (
id int(11) NOT NULL,
itemName varchar(255) DEFAULT NULL,
itemPrice decimal(10,2) DEFAULT NULL,
itemDetail varchar(255) DEFAULT NULL,
PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO tb_item VALUES ('1', '袜子', '29.90', '香香的袜子');
INSERT INTO tb_item VALUES ('2', '套子', '99.99', '冈本001');

CREATE TABLE tb_orderdetail (
id int(11) NOT NULL AUTO_INCREMENT,
order_id int(11) DEFAULT NULL,
total_price decimal(10,0) DEFAULT NULL,
item_id int(11) DEFAULT NULL,
status int(10) unsigned zerofill DEFAULT NULL COMMENT '0成功非0失败',
PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
INSERT INTO tb_orderdetail VALUES ('1', '1', '10000', '1', '0000000001');
INSERT INTO tb_orderdetail VALUES ('2', '1', '2000', '2', '0000000000');