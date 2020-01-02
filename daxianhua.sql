/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2020-01-02 12:22:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for help
-- ----------------------------
DROP TABLE IF EXISTS `help`;
CREATE TABLE `help` (
  `HID` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `message` varchar(30) DEFAULT NULL,
  `picture` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`HID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of help
-- ----------------------------
INSERT INTO `help` VALUES ('1', '有问题', '1.jpg');
INSERT INTO `help` VALUES ('2', '有问题', '2.jpg');
INSERT INTO `help` VALUES ('3', null, null);
INSERT INTO `help` VALUES ('4', null, null);
INSERT INTO `help` VALUES ('5', null, null);
INSERT INTO `help` VALUES ('6', null, null);
INSERT INTO `help` VALUES ('7', '有问题', '5.jpg');
INSERT INTO `help` VALUES ('8', '有问题', '6.jpg');

-- ----------------------------
-- Table structure for merchant
-- ----------------------------
DROP TABLE IF EXISTS `merchant`;
CREATE TABLE `merchant` (
  `MId` int(30) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `merchantpic` varchar(30) NOT NULL,
  `merchantname` varchar(30) NOT NULL,
  `merchantdes` varchar(30) NOT NULL,
  PRIMARY KEY (`MId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of merchant
-- ----------------------------
INSERT INTO `merchant` VALUES ('1', '1.jpg', '红烧牛肉', '很好吃呢');
INSERT INTO `merchant` VALUES ('2', '2.jpg', '清蒸牛肉', '很好吃呢');
INSERT INTO `merchant` VALUES ('3', '3.jpg', '粉蒸牛肉', '很好吃呢');
INSERT INTO `merchant` VALUES ('4', '4.jpg', '爆炒牛肉', '很好吃呢');

-- ----------------------------
-- Table structure for policy
-- ----------------------------
DROP TABLE IF EXISTS `policy`;
CREATE TABLE `policy` (
  `poID` int(20) NOT NULL AUTO_INCREMENT COMMENT '政策ID',
  `message` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`poID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of policy
-- ----------------------------
INSERT INTO `policy` VALUES ('1', '不准违法乱纪');
INSERT INTO `policy` VALUES ('2', '不准违法乱纪');
