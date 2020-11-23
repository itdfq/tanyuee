/*
 Navicat Premium Data Transfer

 Source Server         : duan
 Source Server Type    : MySQL
 Source Server Version : 50709
 Source Host           : 121.36.77.21:5019
 Source Schema         : noctuid

 Target Server Type    : MySQL
 Target Server Version : 50709
 File Encoding         : 65001

 Date: 23/11/2020 13:18:44
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin_authority
-- ----------------------------
DROP TABLE IF EXISTS `admin_authority`;
CREATE TABLE `admin_authority`  (
  `userId` int(11) NOT NULL,
  `equipmentId` int(11) NOT NULL,
  `remark` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`userId`, `equipmentId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin_authority
-- ----------------------------
INSERT INTO `admin_authority` VALUES (2, 1, NULL);
INSERT INTO `admin_authority` VALUES (2, 2, NULL);

-- ----------------------------
-- Table structure for admin_equipment
-- ----------------------------
DROP TABLE IF EXISTS `admin_equipment`;
CREATE TABLE `admin_equipment`  (
  `id` int(200) NOT NULL AUTO_INCREMENT,
  `equipNo` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `equipName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `delFlag` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin_equipment
-- ----------------------------
INSERT INTO `admin_equipment` VALUES (1, '红外线设备', '河南', '安阳县', '河南省安阳市安阳县', '0');
INSERT INTO `admin_equipment` VALUES (2, 'pm2.5检测设备', '北京', '北京县', '北京北京县', '0');
INSERT INTO `admin_equipment` VALUES (3, '温度测量记', '河南省', '安阳', '安阳县', '0');

-- ----------------------------
-- Table structure for admin_user
-- ----------------------------
DROP TABLE IF EXISTS `admin_user`;
CREATE TABLE `admin_user`  (
  `id` int(200) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `unit` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `role` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `delFlag` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `realName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin_user
-- ----------------------------
INSERT INTO `admin_user` VALUES (1, 'zhangsan', '123', '销售部', '14167345766', '河南洛阳', '管理员', '0', '张三');
INSERT INTO `admin_user` VALUES (2, 'lisi', '123', '人事部', '14126356222', '北京', '普通用户', '0', '李四');

-- ----------------------------
-- Table structure for datas
-- ----------------------------
DROP TABLE IF EXISTS `datas`;
CREATE TABLE `datas`  (
  `id` int(200) NOT NULL AUTO_INCREMENT,
  `nowtime` datetime(0) NULL DEFAULT NULL,
  `hongwai` int(255) NULL DEFAULT NULL,
  `fengxiang` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `fengsu` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `wendu` float(255, 1) NULL DEFAULT NULL,
  `shidu` float(255, 1) NULL DEFAULT NULL,
  `PM` float(255, 1) NULL DEFAULT NULL,
  `twendu10` float(255, 1) NULL DEFAULT NULL,
  `tshidu10` float(255, 1) NULL DEFAULT NULL,
  `twendu20` float(255, 1) NULL DEFAULT NULL,
  `tshidu20` float(255, 1) NULL DEFAULT NULL,
  `twendu30` float(255, 1) NULL DEFAULT NULL,
  `tshidu30` float(255, 1) NULL DEFAULT NULL,
  `equipId` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `startTime` datetime(0) NULL DEFAULT NULL,
  `endTime` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of datas
-- ----------------------------
INSERT INTO `datas` VALUES (1, '2020-10-12 14:29:27', 23, '东北风', '12.2', 23.5, 34.5, 23.5, 23.6, 32.2, 23.6, 21.3, 12.3, 34.5, '1', NULL, NULL);
INSERT INTO `datas` VALUES (2, '2020-10-13 14:34:10', 12, '南风', '13.4', 12.6, 23.1, 34.2, 12.5, 14.5, 25.4, 12.4, 10.3, 23.4, '1', NULL, NULL);
INSERT INTO `datas` VALUES (3, '2020-10-14 14:35:12', 23, '西北风', '12.3', 23.4, 23.5, 32.1, 12.4, 43.5, 43.4, 43.3, 45.1, 43.5, '1', NULL, NULL);
INSERT INTO `datas` VALUES (4, '2020-10-09 15:05:08', 12, '东风', '23.1', 23.4, 12.4, 32.1, 32.1, 12.5, 24.1, 15.3, 16.7, 23.6, '2', NULL, NULL);
INSERT INTO `datas` VALUES (5, '2020-10-12 15:06:03', 16, '南风', '12.8', 27.5, 45.6, 23.5, 43.0, 23.5, 31.0, 12.1, 23.4, 34.6, '2', NULL, NULL);
INSERT INTO `datas` VALUES (6, '2020-11-04 20:44:47', 12, '北风', '13.5', 21.3, 13.4, 32.1, 34.2, 21.4, 12.7, 15.8, 18.9, 12.3, '2', NULL, NULL);
INSERT INTO `datas` VALUES (7, '2020-11-03 20:50:11', 12, '南风', '10.3', 16.0, 12.0, 12.0, 17.5, 18.4, 15.7, 13.4, 17.8, 12.4, '1', NULL, NULL);

-- ----------------------------
-- Table structure for yujing
-- ----------------------------
DROP TABLE IF EXISTS `yujing`;
CREATE TABLE `yujing`  (
  `id` int(200) NOT NULL AUTO_INCREMENT,
  `time` datetime(0) NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `dengji` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `equipId` int(11) NULL DEFAULT NULL,
  `delFlag` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 18 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of yujing
-- ----------------------------
INSERT INTO `yujing` VALUES (11, '2020-10-14 14:35:12', '红外指数超标', '特别严重', 1, '0');
INSERT INTO `yujing` VALUES (12, '2020-10-13 14:34:10', '红外指数超标', '轻微', 2, '0');
INSERT INTO `yujing` VALUES (13, '2020-10-12 14:29:27', '红外指数超标', '特别严重', 1, '0');
INSERT INTO `yujing` VALUES (14, '2020-10-13 14:34:10', '土地湿度超标', '特别严重', 2, '1');
INSERT INTO `yujing` VALUES (15, '2020-10-12 14:29:27', '土地湿度超标', '特别严重', 1, '1');
INSERT INTO `yujing` VALUES (16, '2020-10-14 14:35:12', '红外指数超标', '特别严重', 3, '0');
INSERT INTO `yujing` VALUES (17, '2020-10-14 14:35:12', '土地湿度超标', '特别严重', 3, '0');

SET FOREIGN_KEY_CHECKS = 1;
