DROP DATABASE IF EXISTS 'db_kasir';

CREATE DATABASE db_kasir;

USE db_kasir;

DROP TABLE IF EXISTS akun;

CREATE TABLE akun (
  noId int(6) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  username char(50) NOT NULL,
  email char(50) NOT NULL,
  password char(30) NOT NULL,
  leveluser char(15) NOT NULL,
  INDEX(email)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE = latin1_swedish_ci;


DROP TABLE IF EXISTS produk;

CREATE TABLE produk (
  kd_barang char(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  nama_barang char(30) NOT NULL,
  harga_barang int(25) NOT NULL,
  tgl date NOT NULL,
  jml_barang_masuk int(15) NOT NULL,
  jml_barang_keluar int(15) NOT NULL,
  INDEX(nama_barang)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE = latin1_swedish_ci;


DROP TABLE IF EXISTS pembayaran ;

CREATE TABLE pembayaran (
  noId_pembayaran int(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  kd_barang char(10) NOT NULL,
  nama_barang char(30) NOT NULL,
  harga_barang int(25) NOT NULL,
  tgl_pembayaran date NOT NULL,
  FOREIGN KEY (kd_barang) REFERENCES produk (kd_barang) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE = latin1_swedish_ci;
