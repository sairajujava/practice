CREATE DATABASE  IF NOT EXISTS `sbatch` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `sbatch`;
-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: sbatch
-- ------------------------------------------------------
-- Server version	8.0.25

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tbl_student`
--

DROP TABLE IF EXISTS `tbl_student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_student` (
  `s_id` bigint NOT NULL AUTO_INCREMENT,
  `s_name` varchar(45) NOT NULL,
  `s_email` varchar(45) NOT NULL,
  `s_dob` varchar(45) NOT NULL,
  `s_course` varchar(45) NOT NULL,
  `s_mobile` varchar(45) NOT NULL,
  PRIMARY KEY (`s_id`),
  UNIQUE KEY `s_email_UNIQUE` (`s_email`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_student`
--

LOCK TABLES `tbl_student` WRITE;
/*!40000 ALTER TABLE `tbl_student` DISABLE KEYS */;
INSERT INTO `tbl_student` VALUES (1,'Ganguly','sourav.ganguly@gmail.com','1971-10-13','8899776655','JavaFullstack'),(2,'RahilDravid','rahul.dravid@gmail.com','2021-10-13','8899776655','JavaFullstack'),(4,'Kohili','virat.kohili_ind@gmail.com','1992-02-14','CaptainCourse','9744556677'),(5,'Dhoni','mahi.dhoni@gmail.com','2021-10-13','8899776655','JavaFullstack'),(7,'Sehwag','sehwag@gmail.com','2021-10-13','8899776655','Opener'),(10,'Yuvaraj','yuvaraj@gmail.com','2021-10-14','8899776655','Allrounder');
/*!40000 ALTER TABLE `tbl_student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-16  8:15:40
