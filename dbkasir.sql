-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 02 Des 2020 pada 05.04
-- Versi server: 10.4.6-MariaDB
-- Versi PHP: 7.1.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbkasir`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `akun`
--

CREATE TABLE `akun` (
  `noId` int(6) NOT NULL,
  `username` char(50) NOT NULL,
  `email` char(50) NOT NULL,
  `password` char(30) NOT NULL,
  `leveluser` char(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `akun`
--

INSERT INTO `akun` (`noId`, `username`, `email`, `password`, `leveluser`) VALUES
(111, 'syafrinadyah', 'syafrinadyah16@gmail.com', 'syafrinadyah16', 'karyawan'),
(222, 'ifatus22', 'ifatusufairoh22@gmail.com', 'ifatus567', 'karyawan'),
(333, 'novitakhasanah33', 'novitakhasanah12@gmail.com', 'novi12', 'admin'),
(444, 'kevinnn', 'kevinprianka@gmail.com', 'kevinn987', 'karyawan');

-- --------------------------------------------------------

--
-- Struktur dari tabel `produk`
--

CREATE TABLE `produk` (
  `kd_barang` char(10) NOT NULL,
  `nama_barang` char(30) NOT NULL,
  `harga_barang` int(25) NOT NULL,
  `tgl` date NOT NULL,
  `jml_barang_masuk` int(15) NOT NULL,
  `jml_barang_keluar` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `produk`
--

INSERT INTO `produk` (`kd_barang`, `nama_barang`, `harga_barang`, `tgl`, `jml_barang_masuk`, `jml_barang_keluar`) VALUES
('A001', 'NESCAFE', 7000, '2020-05-01', 200, 50),
('B001', 'NUTRIVE', 8000, '2020-06-17', 500, 200),
('C003', 'FRESTEA', 6200, '2020-02-22', 500, 200),
('D004', 'SHINZUI', 29900, '2019-12-25', 300, 20),
('E005', 'CIMORY', 14000, '2020-07-15', 200, 10);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `akun`
--
ALTER TABLE `akun`
  ADD PRIMARY KEY (`noId`);

--
-- Indeks untuk tabel `produk`
--
ALTER TABLE `produk`
  ADD PRIMARY KEY (`kd_barang`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
