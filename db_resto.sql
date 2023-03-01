/*
Navicat MySQL Data Transfer

Source Server         : db
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : db_resto

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2023-03-01 21:13:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tbl_menu`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_menu`;
CREATE TABLE `tbl_menu` (
  `id_masakan` int(11) NOT NULL AUTO_INCREMENT,
  `nama_masakan` varchar(50) NOT NULL,
  `harga` int(20) NOT NULL,
  `status` enum('Tersedia','Tidak Tersedia','','') NOT NULL,
  PRIMARY KEY (`id_masakan`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of tbl_menu
-- ----------------------------
INSERT INTO `tbl_menu` VALUES ('3', 'Shusi', '25000', 'Tersedia');
INSERT INTO `tbl_menu` VALUES ('6', 'Ramen', '75000', 'Tersedia');
INSERT INTO `tbl_menu` VALUES ('7', 'Kare Raisu', '150000', 'Tersedia');
INSERT INTO `tbl_menu` VALUES ('9', 'Shasimi', '80000', 'Tersedia');
INSERT INTO `tbl_menu` VALUES ('10', 'Udon', '45000', 'Tidak Tersedia');
INSERT INTO `tbl_menu` VALUES ('11', 'Teriyaki', '60000', 'Tersedia');
INSERT INTO `tbl_menu` VALUES ('12', 'Okonomiyaki', '50000', 'Tersedia');
INSERT INTO `tbl_menu` VALUES ('13', 'Takoyaki', '30000', 'Tersedia');
INSERT INTO `tbl_menu` VALUES ('14', 'Shabu-shabu', '300000', 'Tersedia');

-- ----------------------------
-- Table structure for `tbl_pegawai`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_pegawai`;
CREATE TABLE `tbl_pegawai` (
  `id_pegawai` int(11) NOT NULL AUTO_INCREMENT,
  `nama_pegawai` varchar(50) NOT NULL,
  `jk` enum('Laki-Laki','Perempuan') NOT NULL,
  `tgl_lahir` char(15) NOT NULL,
  `alamat` varchar(55) NOT NULL,
  `telp` char(12) NOT NULL,
  `jabatan` char(25) NOT NULL,
  `gaji` int(25) NOT NULL,
  `tgl_masuk` char(15) NOT NULL,
  PRIMARY KEY (`id_pegawai`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of tbl_pegawai
-- ----------------------------
INSERT INTO `tbl_pegawai` VALUES ('13', 'Zhaka Hidayat', 'Laki-Laki', 'Feb 7, 2023', 'Jl.perunnas', '0876132', 'Chef', '85000000', 'Feb 1, 2023');
INSERT INTO `tbl_pegawai` VALUES ('14', 'Bintang Kun', 'Laki-Laki', 'Feb 7, 2023', 'BPS', '098877643', 'Waiter', '45000000', 'Feb 1, 2023');
INSERT INTO `tbl_pegawai` VALUES ('15', 'Nurul Rahmatul Islami', 'Perempuan', 'Mar 5, 2005', 'Gelora', '089332232', 'Kasir', '25000000', 'Sep 9, 2023');

-- ----------------------------
-- Table structure for `tbl_transaksi`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_transaksi`;
CREATE TABLE `tbl_transaksi` (
  `id_transaksi` int(11) NOT NULL AUTO_INCREMENT,
  `nama_pelanggan` varchar(50) NOT NULL,
  `id_masakan` int(11) NOT NULL,
  `tanggal` date NOT NULL,
  `jml_beli` int(45) NOT NULL,
  `total_beli` int(45) NOT NULL,
  PRIMARY KEY (`id_transaksi`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of tbl_transaksi
-- ----------------------------
INSERT INTO `tbl_transaksi` VALUES ('15', 'Zhakan', '3', '2023-03-13', '3', '75000');
INSERT INTO `tbl_transaksi` VALUES ('16', 'Salim', '3', '2023-03-12', '2', '50000');
INSERT INTO `tbl_transaksi` VALUES ('17', 'Arman', '3', '2023-03-13', '4', '100000');
INSERT INTO `tbl_transaksi` VALUES ('18', 'Aris', '7', '2023-03-15', '5', '750000');
INSERT INTO `tbl_transaksi` VALUES ('19', 'Ari Tegal Exploiter', '9', '2023-03-29', '10', '800000');
INSERT INTO `tbl_transaksi` VALUES ('20', 'Bintang Kun', '14', '2023-03-14', '4', '1200000');
INSERT INTO `tbl_transaksi` VALUES ('21', 'Syahru', '13', '2023-03-14', '2', '60000');
INSERT INTO `tbl_transaksi` VALUES ('22', 'Muh.Alif', '11', '2023-03-14', '6', '360000');
INSERT INTO `tbl_transaksi` VALUES ('23', 'Muh.Agil', '12', '2023-03-14', '8', '400000');
INSERT INTO `tbl_transaksi` VALUES ('24', 'Aldo', '3', '2023-03-06', '5', '125000');
INSERT INTO `tbl_transaksi` VALUES ('25', 'Indra', '3', '2023-03-02', '1', '25000');

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nama_user` varchar(55) NOT NULL,
  `username` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL,
  `level` enum('admin','kasir','owner') DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'RECTY', 'admin', 'admin', 'admin');
INSERT INTO `users` VALUES ('6', 'zhaka', 'owner', 'owner', 'owner');
INSERT INTO `users` VALUES ('7', 'Bintang', 'kasir', 'kasir', 'kasir');

-- ----------------------------
-- View structure for `viewtransaksi`
-- ----------------------------
DROP VIEW IF EXISTS `viewtransaksi`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `viewtransaksi` AS select `tbl_transaksi`.`id_transaksi` AS `id_transaksi`,`tbl_transaksi`.`nama_pelanggan` AS `nama_pelanggan`,`tbl_transaksi`.`id_masakan` AS `id_masakan`,`tbl_transaksi`.`tanggal` AS `tanggal`,`tbl_menu`.`nama_masakan` AS `nama_masakan`,`tbl_menu`.`harga` AS `harga`,`tbl_transaksi`.`jml_beli` AS `jml_beli`,`tbl_transaksi`.`total_beli` AS `total_beli`,`tbl_menu`.`status` AS `status` from (`tbl_transaksi` join `tbl_menu` on(`tbl_transaksi`.`id_masakan` = `tbl_menu`.`id_masakan`)) ;
