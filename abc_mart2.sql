CREATE DATABASE  IF NOT EXISTS `abc_mart` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `abc_mart`;
-- MySQL dump 10.13  Distrib 8.0.26, for macos11 (x86_64)
--
-- Host: localhost    Database: abc_mart
-- ------------------------------------------------------
-- Server version	8.0.26

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
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `adminid` varchar(45) NOT NULL,
  `adminname` varchar(45) NOT NULL,
  `adminpw` int NOT NULL,
  `adminlevel` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`adminid`),
  UNIQUE KEY `adminlevel_UNIQUE` (`adminlevel`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES ('admin','김새롬',1234,'사장'),('admin2','허다솜',1234,'부장'),('admin3','김재원',1234,'과장'),('admin4','김상준',1234,'주임');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `custid` varchar(10) NOT NULL,
  `name` varchar(10) NOT NULL,
  `address` varchar(30) DEFAULT NULL,
  `phonenum` varchar(15) DEFAULT NULL,
  `password` int DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `favor` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`custid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES ('cat','오징어게임','서울특별시 강남구 역삼동','010-1111-2222',1234,'여자','운동화'),('cat73','오징어게임','서울특별시 강남구 역삼동','010-1111-2222',1234,'남자','운동화'),('cjscjs','이성구','서울시 중구','010-2355-9999',4567,'여자','구두'),('computer','장한솔','서울시 강서구','010-4935-6237',3344,'남자','운동화'),('crynn','리키','서울시 용산구','010-4565-3298',6667,'남자','운동화'),('fkdnwl','김상순','서울시 은평구','010-6567-1354',1234,'남자','단화'),('flog','김상주','서울시 성북구','010-7793-3495',3121,'남자','샌들'),('hankh','한경호','서울특별시 강남구 역삼동','010-1111-2222',2580,'남자','운동화'),('mago','매튜','서울시 용산구','010-2234-7764',1230,'남자','장화'),('pretty','이미나','서울시 종로구','010-7418-9634',3215,'여자','구두'),('rewq4321','김나무','서울시 용산구','010-4141-8965',4567,'남자','운동화'),('skygo','신태일','서울시 양천구','010-7456-3569',5683,'남자','운동화'),('study','정석','서울시 강남구','010-1597-3571',1212,'남자','샌들'),('zizifnvl','김나미','서울시 도봉구','010-4318-7651',7964,'여자','구두'),('ziziwhfh','김상수','서울시 은평구','010-7956-5342',4653,'남자','샌들');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `orderid` int NOT NULL AUTO_INCREMENT,
  `saleprice` int DEFAULT NULL,
  `orderdate` date DEFAULT NULL,
  `orderamount` int DEFAULT NULL,
  `custid` varchar(10) DEFAULT NULL,
  `productid` int DEFAULT NULL,
  PRIMARY KEY (`orderid`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1,59000,'2021-03-01',1,'cat',1),(2,60000,'2021-03-24',1,'flog',8),(3,60000,'2021-04-04',1,'love',9),(4,23500,'2021-05-24',1,'pretty',4),(5,77000,'2021-06-02',1,'mago',7),(6,60000,'2021-07-09',2,'pretty',8),(7,27600,'2021-08-11',1,'study',5),(8,59900,'2021-09-09',1,'crynn',1),(9,79000,'2021-10-04',1,'computer',2),(10,270000,'2021-10-04',4,'cjswo',9),(11,54500,'2021-10-04',1,'cat',6),(12,23500,'2021-10-05',1,'love',4),(13,59000,'2021-10-05',1,'ahdjfkj',1);
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `productid` int NOT NULL AUTO_INCREMENT,
  `productname` varchar(45) NOT NULL,
  `productprice` int NOT NULL,
  `productsize` int NOT NULL,
  `productsection` varchar(45) NOT NULL,
  `productcolor` varchar(45) NOT NULL,
  `productqnt` varchar(45) DEFAULT NULL,
  `productputin` date NOT NULL,
  `productmadein` varchar(45) NOT NULL,
  PRIMARY KEY (`productid`),
  UNIQUE KEY `productid_UNIQUE` (`productid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,'메이든헤드 스니커즈 모노화이트',69000,260,'운동화','화이트','2','2021-01-01','메이든'),(2,'테르 하이 블랙화이트',89000,270,'운동화','블랙','1','2021-02-01','테르'),(3,'샬케 독일군 스니커즈 빈티지화이트',79000,240,'운동화','화이트','1','2021-03-01','샬케'),(4,'플로라 베이직 펌프스힐',33500,230,'구두','화이트','1','2021-03-21','샬케'),(5,'스토크 스퀘어 슬링백',37600,240,'구두','화이트','1','2021-03-24','메이든'),(6,'미슈콜츠 스트랩 레더 샌들',64500,250,'샌들','블랙','1','2021-05-20','테르'),(7,'스코츠데일 홀스빗 로퍼',87000,270,'구두','블랙','2','2021-07-08','테르'),(8,'핸들빈 레인부츠',35000,200,'장화','퍼플','2','2021-06-28','핸들빈'),(9,'핸들빈 레인부츠',35000,200,'장화','옐로우','2','2021-06-28','핸들빈'),(10,'클래식 올 터레인 클로그',69900,240,'샌들','블랙','2','2021-06-08','핸들빈');
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-07 21:27:26
