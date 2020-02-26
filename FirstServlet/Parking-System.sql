-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: parking
-- ------------------------------------------------------
-- Server version	8.0.18

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
-- Dumping data for table `cardata`
--

LOCK TABLES `cardata` WRITE;
/*!40000 ALTER TABLE `cardata` DISABLE KEYS */;
INSERT INTO `cardata` VALUES ('MH-12-MD-7262','white','2020/02/26 13:02:39','2020/02/26 13:17:46','OUT',1),('MG-45-ER-4345','red','2020/02/26 13:04:21','2020/02/26 16:43:44','OUT',2),('MH-12-BH-4546','black','2020/02/26 13:17:15','2020/02/26 21:45:46','OUT',3),('MH-12-BH-2645','black','2020/02/26 13:18:08','2020/02/26 15:49:37','OUT',1),('MM-23-HH-6788','black','2020/02/26 15:17:05','-','IN',4),('MH-12-BG-6573','red','2020/02/26 15:44:33','2020/02/26 15:48:12','OUT',5),('MH-12-BG-6573','black','2020/02/26 15:49:53','-','IN',1),('MH-12-BG-6573','black','2020/02/26 15:50:16','-','IN',5),('MH-55-HH-6574','red','2020/02/26 16:43:15','2020/02/26 16:44:48','OUT',6),('MM-34-HH-5533','white','2020/02/26 16:44:12','-','IN',2),('MH-45-TY-5334','black','2020/02/26 21:45:28','-','IN',6),('MH-54-GH-2345','black','2020/02/26 23:20:25','-','IN',3);
/*!40000 ALTER TABLE `cardata` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `slot`
--

LOCK TABLES `slot` WRITE;
/*!40000 ALTER TABLE `slot` DISABLE KEYS */;
INSERT INTO `slot` VALUES (1,'Yes'),(2,'Yes'),(3,'Yes'),(4,'Yes'),(5,'Yes'),(6,'Yes');
/*!40000 ALTER TABLE `slot` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-02-27  0:18:48