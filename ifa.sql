
DROP DATABASE IF EXISTS kasir;

CREATE DATABASE kasir;

USE kasir;

DROP TABLE IF EXISTS user;

CREATE TABLE akun (
  Id int(5) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  Username char(100) NOT NULL,
  Email char(100) NOT NULL,
  Password char(20) NOT NULL,
  Level_User char(10) NOT NULL,
  INDEX(email)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

DROP TABLE IF EXISTS barang;

CREATE TABLE barang (
  Id_Barang char(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  Nama_Barang char(50) NOT NULL,
  Harga int(20) NOT NULL,
  Tanggal date NOT NULL,
  Jumlah_Barang_Masuk int(10) NOT NULL,
  Jumlah_Barang_Keluar int(10) NOT NULL,
  INDEX(Nama_Barang)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

DROP TABLE IF EXISTS bayar;

CREATE TABLE pembayaran (
  IdBayar int(5) NOT NULL PRIMARY KEY AUOTO_INCREMENT,
  Id_Barang char(10) NOT NULL,
  NamaBarang char(20) NOT NULL,
  Harga_Barang int(20) NOT NULL,
  Tanggal_Bayar date NOT NULL,
  FOREIGN KEY (Id_Barang) references barang(Id_Barang) ON DELETE CASCADE
  ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
