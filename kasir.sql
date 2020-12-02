-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 02, 2020 at 06:07 AM
-- Server version: 10.1.34-MariaDB
-- PHP Version: 7.0.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
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
-- Table structure for table `akun`
--

CREATE TABLE `akun` (
  `Id` int(5) NOT NULL,
  `username` char(100) NOT NULL,
  `email` char(80) NOT NULL,
  `password` char(20) NOT NULL,
  `level_user` char(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `akun`
--

INSERT INTO `akun` (`Id`, `username`, `email`, `password`, `level_user`) VALUES
(11001, 'ifa', 'ifatus2@gmail.com', 'ifatu223', 'karyawan'),
(11002, 'dyah', 'dyahkusuma@gmail.com', 'dyhkusuma0', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `idbarang` char(10) NOT NULL,
  `nama_barang` char(50) NOT NULL,
  `harga` int(20) NOT NULL,
  `tanggal` date NOT NULL,
  `jml_barang_masuk` int(10) NOT NULL,
  `jml_barang_keluar` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`idbarang`, `nama_barang`, `harga`, `tanggal`, `jml_barang_masuk`, `jml_barang_keluar`) VALUES
('11H4', 'Buku Tulis', 4000, '2020-11-04', 55, 25),
('11H6', 'Pensil', 2000, '2020-10-30', 30, 22),
('11H8', 'Buku Gambar', 5500, '2020-11-02', 30, 19);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `akun`
--
ALTER TABLE `akun`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`idbarang`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
