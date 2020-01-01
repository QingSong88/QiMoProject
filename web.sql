/*
Navicat MySQL Data Transfer

Source Server         : QingSong88
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : web

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2020-01-02 02:45:59
*/

SET FOREIGN_KEY_CHECKS=0;

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
