/*
Navicat MySQL Data Transfer

Source Server         : zrj
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2020-01-02 12:05:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `name` varchar(50) DEFAULT NULL COMMENT '品类名',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `createtime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of category
-- ----------------------------

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `description` varchar(2000) DEFAULT NULL COMMENT '评论内容',
  `pid` int(11) DEFAULT NULL COMMENT '商品',
  `uid` int(11) DEFAULT NULL COMMENT '用户',
  `createtime` datetime DEFAULT NULL COMMENT '评论时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES ('2', null, '2', '0', '2020-01-01 17:04:18');
INSERT INTO `comment` VALUES ('3', null, '3', '0', '2020-01-01 17:04:24');
INSERT INTO `comment` VALUES ('4', null, '4', '0', '2020-01-01 17:04:25');
INSERT INTO `comment` VALUES ('5', null, '5', '0', '2020-01-01 17:08:52');
INSERT INTO `comment` VALUES ('6', null, '0', '0', '2020-01-01 17:15:04');
INSERT INTO `comment` VALUES ('7', null, '0', '0', '2020-01-01 17:29:36');
INSERT INTO `comment` VALUES ('8', null, '0', '0', '2020-01-01 17:32:17');
INSERT INTO `comment` VALUES ('9', null, '9', '0', '2020-01-01 19:39:29');
INSERT INTO `comment` VALUES ('10', null, '0', '0', '2020-01-01 19:42:29');
INSERT INTO `comment` VALUES ('11', null, '0', '0', '2020-01-01 20:15:38');
INSERT INTO `comment` VALUES ('12', null, '0', '0', '2020-01-02 11:57:14');
INSERT INTO `comment` VALUES ('13', null, '0', '0', '2020-01-02 11:58:48');

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `gdID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `GoodsType` varchar(30) NOT NULL,
  `stuID` varchar(11) NOT NULL,
  `GoodsName` varchar(30) NOT NULL,
  `GoodsAmount` varchar(10) NOT NULL,
  `GoodsPrice` varchar(30) NOT NULL,
  `GoodsDescribe` varchar(200) NOT NULL,
  `GoodsDegree` varchar(10) NOT NULL,
  `GoodsPicture` varchar(100) NOT NULL,
  `StuQQnumber` varchar(30) NOT NULL,
  PRIMARY KEY (`gdID`),
  KEY `FK_stuID` (`stuID`),
  CONSTRAINT `FK_stuID` FOREIGN KEY (`stuID`) REFERENCES `sysuser` (`stuID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('1', '生活类', '20182925', '十孔插座', '2个', '20元/个', '正版公牛插座，家里带过来的，太多了用不过来，全新低价出售。', '十成新', '2.jpg', '1234567890');
INSERT INTO `goods` VALUES ('2', '运动休闲类', '20181515', 'AJ', '1双', '999元/双', '尺码买小了，不合脚，全新转让，40码', '十成新', '/GoodsPicture/1577888264148QQ图片20191023003556.jpg', '1212121212');
INSERT INTO `goods` VALUES ('3', '数码产品类', '20182924', 'iPhone8', '1个', '1200元/个', '64G，4G全网通，才买三个月，用不习惯苹果系统，急需低价转让', '九成新', '/GoodsPicture/15778932151801.jpg', '111111111111');
INSERT INTO `goods` VALUES ('4', '数码产品类', '20183316', '联想Y7000', '2个', '5000元/台', '买了新的，旧的用不着了', '六成新', '/GoodsPicture/15778934163932.jpg', '3333333333');
INSERT INTO `goods` VALUES ('5', '书籍类', '20181414', 'web项目实战教材', '1本', '15元/本', '转专业，用不着了', '七成新', '/GoodsPicture/15778959929541.png', '5201314');
INSERT INTO `goods` VALUES ('6', '书籍类', '20181414', 'web项目实战教材', '1本', '15元/本', '转专业，用不着了', '七成新', '/GoodsPicture/15778961306061.png', '5201314');
INSERT INTO `goods` VALUES ('9', '书籍类', '20181414', 'web项目实战教材', '1本', '15元/本', '转专业，用不着了', '七成新', '/GoodsPicture/15778976192658.jpg', '5201314');
INSERT INTO `goods` VALUES ('10', '娱乐休闲类', '20183316', 'SWICT游戏机', '1部', '80元/部', '玩腻了，不想玩啦', '八成新', '/GoodsPicture/1577899255746QQ图片20191008101304.jpg', '1478952369');

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `name` varchar(50) DEFAULT NULL COMMENT '商品名',
  `description` varchar(1000) DEFAULT NULL COMMENT '商品描述',
  `cid` int(11) DEFAULT NULL COMMENT '商品类型',
  `createtime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('1', '桌子', '赤', '1', '2020-01-24 20:00:34');
INSERT INTO `product` VALUES ('2', '火锅', '橙', '0', '2019-11-21 20:11:38');
INSERT INTO `product` VALUES ('3', '电吹风', '黄', '1', '2020-01-14 03:11:43');
INSERT INTO `product` VALUES ('4', '垃圾桶', '绿', '0', '2020-01-23 20:11:49');
INSERT INTO `product` VALUES ('5', '杯子', '蓝', '1', '2020-01-23 20:11:52');
INSERT INTO `product` VALUES ('6', '毛巾', '紫', '0', '2020-01-16 20:11:55');
INSERT INTO `product` VALUES ('7', '手机', '靛', '1', '2009-07-01 20:11:58');
INSERT INTO `product` VALUES ('8', '电脑', '氢', '0', '2021-03-26 20:12:07');
INSERT INTO `product` VALUES ('9', '耳机', '氦', '1', '2020-01-24 20:12:12');
INSERT INTO `product` VALUES ('10', '零食', '锂', '0', '2020-01-07 20:12:15');
INSERT INTO `product` VALUES ('11', '干货', '砒', '1', '2020-01-15 20:12:18');
INSERT INTO `product` VALUES ('12', '手办', '硼', '0', '2020-01-29 20:12:25');
INSERT INTO `product` VALUES ('13', '汽车', '碳', '1', '2018-06-01 20:12:27');
INSERT INTO `product` VALUES ('14', '房子', '氮', '0', '2020-01-21 20:12:32');
INSERT INTO `product` VALUES ('15', '桌游', '氧', '1', '2020-01-15 20:12:34');
INSERT INTO `product` VALUES ('16', '运动器材', '氟', '0', '2020-01-07 20:12:38');

-- ----------------------------
-- Table structure for searchgoods
-- ----------------------------
DROP TABLE IF EXISTS `searchgoods`;
CREATE TABLE `searchgoods` (
  `gdID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `stuID` varchar(11) NOT NULL,
  `GoodsName` varchar(30) NOT NULL,
  `GoodsAmount` varchar(10) NOT NULL,
  `GoodsDescribe` varchar(200) NOT NULL,
  `StuQQnumber` varchar(30) NOT NULL,
  PRIMARY KEY (`gdID`),
  KEY `NK_stuID` (`stuID`),
  CONSTRAINT `NK_stuID` FOREIGN KEY (`stuID`) REFERENCES `sysuser` (`stuID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of searchgoods
-- ----------------------------
INSERT INTO `searchgoods` VALUES ('1', '20181616', '鞋架', '1个', '能容纳寝室8个人的二手鞋架', '15935782');
INSERT INTO `searchgoods` VALUES ('2', '20182924', '圆孔耳机', '1副', '外表完好无损，音质没问题，物价廉美', '123753159');
INSERT INTO `searchgoods` VALUES ('5', '20182924', '电动牙刷', '1支', '物价廉美', '123753159');
INSERT INTO `searchgoods` VALUES ('6', '20182924', '电动牙刷', '1支', '物价廉美', '123753159');

-- ----------------------------
-- Table structure for sysuser
-- ----------------------------
DROP TABLE IF EXISTS `sysuser`;
CREATE TABLE `sysuser` (
  `stuID` varchar(11) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(10) NOT NULL,
  `name` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `age` int(11) NOT NULL,
  `gender` enum('男','女') DEFAULT '男',
  PRIMARY KEY (`stuID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sysuser
-- ----------------------------
INSERT INTO `sysuser` VALUES ('20180000', '元旦', '3333', '青松', '2902072550@qq.com', '21', '女');
INSERT INTO `sysuser` VALUES ('20181212', 'zhangsan', '123', '张三', '2902072550@qq.com', '21', '男');
INSERT INTO `sysuser` VALUES ('20181313', '松哥', '123', '张三', '2902072550@qq.com', '21', '男');
INSERT INTO `sysuser` VALUES ('20181414', '你好', '123', '张三', '2902072550@qq.com', '21', '男');
INSERT INTO `sysuser` VALUES ('20181515', '棒棒', '123', '王宾彬', '2902072550@qq.com', '21', '女');
INSERT INTO `sysuser` VALUES ('20181616', '棒', '123', '王宾彬', '2902072550@qq.com', '21', '女');
INSERT INTO `sysuser` VALUES ('20181717', '20182924', '1234', '贺轮武', '2902072550@qq.com', '21', '男');
INSERT INTO `sysuser` VALUES ('20182924', '松', '1111', '陈青松', '2902072550@qq.com', '21', '男');
INSERT INTO `sysuser` VALUES ('20182925', '青松', '1111', '陈青松', '2902072550@qq.com', '21', '男');
INSERT INTO `sysuser` VALUES ('20183316', '老邓', '1111', '邓宇辰', '2902072550@qq.com', '21', '女');
