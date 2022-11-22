-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 01, 2022 at 03:04 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `project_sms`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(10) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `username`, `password`) VALUES
(1, 'sdd', 'ddas5160'),
(2, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `dept`
--

CREATE TABLE `dept` (
  `id` int(11) NOT NULL,
  `dept` varchar(4) NOT NULL,
  `name` varchar(100) NOT NULL,
  `total_student` varchar(100) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dept`
--

INSERT INTO `dept` (`id`, `dept`, `name`, `total_student`) VALUES
(1, 'BBA', 'BBA', '0'),
(2, 'CSE', 'CSE', '0'),
(3, 'LLB', 'LLB', '0');

-- --------------------------------------------------------

--
-- Table structure for table `result`
--

CREATE TABLE `result` (
  `std_id` bigint(12) NOT NULL,
  `course_code` varchar(7) NOT NULL,
  `course_tittle` varchar(200) NOT NULL,
  `credit` double NOT NULL,
  `cgpa` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `std_id` bigint(12) NOT NULL,
  `std_name` varchar(50) NOT NULL,
  `dept` varchar(4) NOT NULL,
  `std_cgpa` double NOT NULL,
  `std_credit` double NOT NULL,
  `std_gpa` double NOT NULL,
  `std_mbl` varchar(15) DEFAULT 'Not Found',
  `std_email` varchar(100) DEFAULT 'Not Found',
  `std_adrs` varchar(200) DEFAULT 'Not Found'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`std_id`, `std_name`, `dept`, `std_cgpa`, `std_credit`, `std_gpa`, `std_mbl`, `std_email`, `std_adrs`) VALUES
(200203020007, 'sample', 'CSE', 0, 0, 0, 'Not Found', 'Not Found', 'Not Found'),
(210203020002, 'Pritam Dam', 'CSE', 0, 0, 0, 'Not Found', 'Not Found', 'Not Found'),
(210203020005, 'Nusrat', 'CSE', 0, 0, 0, 'Not Found', 'Not Found', 'Not Found'),
(210203020007, 'Sankarsan Das', 'CSE', 0, 0, 0, 'Not Found', 'Not Found', 'Not Found');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indexes for table `dept`
--
ALTER TABLE `dept`
  ADD PRIMARY KEY (`dept`);

--
-- Indexes for table `result`
--
ALTER TABLE `result`
  ADD KEY `test` (`std_id`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`std_id`),
  ADD UNIQUE KEY `std_id` (`std_id`),
  ADD KEY `tttt` (`dept`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `result`
--
ALTER TABLE `result`
  ADD CONSTRAINT `test` FOREIGN KEY (`std_id`) REFERENCES `student` (`std_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
