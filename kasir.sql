-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 02 Des 2020 pada 06.11
-- Versi server: 10.4.14-MariaDB
-- Versi PHP: 7.2.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kasir`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `akun`
--

CREATE TABLE `akun` (
  `Id` int(5) NOT NULL,
  `Username` char(100) NOT NULL,
  `Email` char(100) NOT NULL,
  `Password` char(20) NOT NULL,
  `Level_User` char(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `akun`
--

INSERT INTO `akun` (`Id`, `Username`, `Email`, `Password`, `Level_User`) VALUES
(16056, 'ifa', 'ifatusufairoh@gmail.com', 'ifasufairoh', 'karyawan'),
(16057, 'dyah', 'dyahkusuma@gmail.com', 'dyahdong', 'admin');

-- --------------------------------------------------------

--
-- Struktur dari tabel `barang`
--

CREATE TABLE `barang` (
  `Id_Barang` char(10) NOT NULL,
  `Nama_Barang` char(50) NOT NULL,
  `Harga` int(20) NOT NULL,
  `Tanggal` date NOT NULL,
  `Jumlah_Barang_Masuk` int(10) NOT NULL,
  `Jumlah_Barang_Keluar` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `barang`
--

INSERT INTO `barang` (`Id_Barang`, `Nama_Barang`, `Harga`, `Tanggal`, `Jumlah_Barang_Masuk`, `Jumlah_Barang_Keluar`) VALUES
('B2655', 'Bimoli', 25000, '2020-06-01', 250, 150),
('B2657', 'So Klin', 15000, '2020-06-08', 300, 200),
('B2658', 'Tessa', 14000, '2020-09-05', 450, 300),
('B2659', 'Sariwangi', 8000, '2020-06-03', 250, 150);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `akun`
--
ALTER TABLE `akun`
  ADD PRIMARY KEY (`Id`);

--
-- Indeks untuk tabel `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`Id_Barang`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
