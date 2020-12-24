DROP database IF EXISTS 'kasir';

CREATE database kasir;

use kasir;

DROP TABLE if EXISTS user;

CREATE TABLE user(
	Nama char(50) NOT NULL,
	ID int(10) NOT NULL PRIMARY KEY AUTO_INCREENT,
	Alamat char(100) NOT NULL,
	telfon int(15) NOT NULL,
	INDEX (Nama)
)	ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci
	

DROP TABLE if EXISTS barang;

CREATE TABLE barang(
	ID_Barang int(10) NOT NULL PRIMARY KEY AUTO_INCREENT,
	Nama_Barang char(30) NOT NULL,
	Harga_Barang int(50) NOT NULL,
	INDEX (Nama_Barang)
)	ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci

DROP TABLE if EXISTS pembayaran;

CREATE TABLE pembayaran (
	ID_Barang int(10) NOT NULL PRIMARY KEY AUTO_INCREENT,
	Nama_Barang char(50) NOT NULL,
	Harga_Barang int (50) NOT NULL,
	Tanggal_Pembelian date NOT NULL,
	FOREIGN KEY (ID_Barang) references barang(ID_Barang) ON DELETE CASCADE
)	ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci