-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 04, 2020 at 06:15 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gudang`
--

-- --------------------------------------------------------

--
-- Table structure for table `gudang_in`
--

CREATE TABLE `gudang_in` (
  `id_barang` int(10) NOT NULL,
  `nama_barang` varchar(10) NOT NULL,
  `jenis_barang` varchar(20) NOT NULL,
  `berat_barang` int(10) NOT NULL,
  `tanggal_masuk` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `gudang_in`
--

INSERT INTO `gudang_in` (`id_barang`, `nama_barang`, `jenis_barang`, `berat_barang`, `tanggal_masuk`) VALUES
(112233, 'bt', 'Dokumen', 30, '1 Juni 2020'),
(112234, 'bg', 'Makanan', 34, '1 Juni 2020');

-- --------------------------------------------------------

--
-- Table structure for table `gudang_out`
--

CREATE TABLE `gudang_out` (
  `id_barang` int(10) NOT NULL,
  `nama_barang` varchar(10) NOT NULL,
  `jenis_barang` varchar(20) NOT NULL,
  `berat_barang` int(10) NOT NULL,
  `tanggal_keluar` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `gudang_out`
--

INSERT INTO `gudang_out` (`id_barang`, `nama_barang`, `jenis_barang`, `berat_barang`, `tanggal_keluar`) VALUES
(112233, 'bt', 'Dokumen', 30, '1 Juni 2020'),
(112234, 'ASD', 'Makanan', 23, '11 Juni 2020'),
(121112, 'gh', 'Makanan', 43, '20 Juni 2020');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id_user` int(10) NOT NULL,
  `hak_akses` varchar(10) NOT NULL,
  `username` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id_user`, `hak_akses`, `username`, `password`) VALUES
(1, 'ADMIN', 'admin', 'admin'),
(2, 'USER', 'user', 'user');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `gudang_in`
--
ALTER TABLE `gudang_in`
  ADD PRIMARY KEY (`id_barang`);

--
-- Indexes for table `gudang_out`
--
ALTER TABLE `gudang_out`
  ADD PRIMARY KEY (`id_barang`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id_user`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
