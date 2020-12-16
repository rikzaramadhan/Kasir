DROP database IF EXISTS 'kasir';

CREATE database kasir;

use kasir;

DROP TABLE if EXISTS akun;

CREATE TABLE akun (
  Id int(5) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  username char(100) NOT NULL,
  email char(80) NOT NULL,
  password char(20) NOT NULL,
  level_user char(10) NOT NULL,
  INDEX(email)
<<<<<<< HEAD
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
=======
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
>>>>>>> 8e1fa6305ac5ef6e5869d596b7a764094114eacd


DROP TABLE if EXISTS barang;

CREATE TABLE barang (
  idbarang char(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  nama_barang char(50) NOT NULL,
  harga int(20) NOT NULL,
  tanggal date NOT NULL,
  jml_barang_masuk int(10) NOT NULL,
  jml_barang_keluar int(10) NOT NULL,
  INDEX (nama_barang)
<<<<<<< HEAD
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
=======
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
>>>>>>> 8e1fa6305ac5ef6e5869d596b7a764094114eacd

DROP TABLE if EXISTS bayar;

CREATE TABLE bayar (
idbayar int(5) NOT NULL PRIMARY KEY AUTO_INCREMENT,
idbarang char(10) NOT NULL,
nama_barang char(50) NOT NULL,
harga_barang int(20) NOT NULL,
tanggal_bayar date NOT NULL,
FOREIGN KEY (idbarang) references barang(idbarang) ON DELETE CASCADE
<<<<<<< HEAD
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
=======
) ENGINE=InnoDB DEFAULT CHARSET=tf8mb4 COLLATE=utf8mb4_general_ci;
>>>>>>> 8e1fa6305ac5ef6e5869d596b7a764094114eacd


