DROP database IF EXISTS 'kasir';

CREATE database kasir;

use kasir;

CREATE TABLE `absen` (
  `idabsen`     int(5)      NOT NULL PRIMARY KEY AUTO_INCREMET,
  `Id`          int(5)      NOT NULL,
  `tanggal`     datetime    NOT NULL,
  `keterangan` enum('Hadir','Sakit','Izin','') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


CREATE TABLE `akun` (
  `Id`           int(5)      NOT NULL PRIMARY KEY AUTO_INCREMET,
  `username`     char(100)   NOT NULL,
  `email`        char(80)    NOT NULL,
  `no_tlp`       int(15)     NOT NULL,
  `password`     char(20)    NOT NULL,
  `level_user`   char(10)    NOT NULL, 
  INDEX(email)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


CREATE TABLE `barang` (
  `idbarang`          char(10)   NOT NULL PRIMARY KEY AUTO_INCREMET,
  `nama_barang`       char(50)   NOT NULL,
  `harga`             int(20)    NOT NULL,
  `id_category`       int(10)    NOT NULL,
  `tanggal`           date       NOT NULL,
  `jml_barang_masuk`  int(10)    NOT NULL,
  `jml_barang_keluar` int(10)    NOT NULL,
  INDEX(nama_barang)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


CREATE TABLE `bayar` (
  `idbayar`           int(5)      NOT NULL PRIMARY KEY AUTO_INCREMET,
  `idbarang`          char(50)    NOT NULL,
  `nama_barang`       char(50)    NOT NULL,
  `harga_barang`      int(20)     NOT NULL,
  `tanggal_bayar`     date        NOT NULL,
  FOREIGN KEY (idbarang) REFERENCES barang (idbarang) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


CREATE TABLE `category` (
  `id_category`       int(10)      NOT NULL PRIMARY KEY AUTO_INCREMET,
  `category`          varchar(50)  NOT NULL,
  FOREIGN KEY (id_category) REFERENCES barang (id_category) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;