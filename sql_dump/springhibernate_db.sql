/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50616
 Source Host           : localhost
 Source Database       : springhibernate_db

 Target Server Type    : MySQL
 Target Server Version : 50616
 File Encoding         : utf-8

 Date: 04/09/2015 15:27:43 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `author`
-- ----------------------------
DROP TABLE IF EXISTS `author`;
CREATE TABLE `author` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bookId` int(11) NOT NULL,
  `first_name` varchar(20) NOT NULL,
  `last_name` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- ----------------------------
--  Records of `author`
-- ----------------------------
BEGIN;
INSERT INTO `author` VALUES ('1', '1', 'Nathan', 'Never'), ('2', '2', 'Dylan', 'Dog'), ('3', '3', 'Jerry', 'Drake');
COMMIT;

-- ----------------------------
--  Table structure for `books`
-- ----------------------------
DROP TABLE IF EXISTS `books`;
CREATE TABLE `books` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `book_name` varchar(100) NOT NULL,
  `price` int(10) NOT NULL,
  `qty` int(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- ----------------------------
--  Records of `books`
-- ----------------------------
BEGIN;
INSERT INTO `books` VALUES ('1', 'Book Title1', '10', '20'), ('2', 'Book Title2', '20', '30');
COMMIT;

-- ----------------------------
--  Table structure for `employee`
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=latin1;

-- ----------------------------
--  Records of `employee`
-- ----------------------------
BEGIN;
INSERT INTO `employee` VALUES ('21', 'Nathan', 'Never', 'nathan.never@alphagency.com', '89898989898'), ('22', 'Jerry', 'Drake', 'misterno@manaus.com', '89876787890'), ('23', 'Clark', 'Kent', 'superman@superman.com', '123456789'), ('24', 'Dylan', 'Dog', 'dylan.dog@incubo.com', '666-666'), ('25', 'Ken', 'Parker', 'lungofucile@prateria.com', '8976778789');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
