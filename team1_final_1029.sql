CREATE DATABASE  IF NOT EXISTS `comeon_baby` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `comeon_baby`;
-- MySQL dump 10.13  Distrib 8.0.26, for macos11 (x86_64)
--
-- Host: localhost    Database: comeon_baby
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
-- Table structure for table `board`
--

DROP TABLE IF EXISTS `board`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `board` (
  `writeCode` int NOT NULL AUTO_INCREMENT,
  `user_userid` varchar(20) DEFAULT NULL,
  `writeTitle` varchar(100) DEFAULT NULL,
  `writeContent` varchar(500) DEFAULT NULL,
  `writeSortation` varchar(20) DEFAULT NULL,
  `writeLocation` varchar(20) DEFAULT NULL,
  `writeInsertdate` varchar(50) DEFAULT NULL,
  `writeModate` varchar(50) DEFAULT NULL,
  `writeDeldate` varchar(50) DEFAULT NULL,
  `writeFile` varchar(200) DEFAULT NULL,
  `writeRealfile` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`writeCode`),
  UNIQUE KEY `writeCode_UNIQUE` (`writeCode`),
  KEY `fk_user_has_gov_user1_idx` (`user_userid`),
  CONSTRAINT `fk_user_has_gov_user1` FOREIGN KEY (`user_userid`) REFERENCES `user` (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=129 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `board`
--

LOCK TABLES `board` WRITE;
/*!40000 ALTER TABLE `board` DISABLE KEYS */;
INSERT INTO `board` VALUES (24,NULL,'[육아] 아기로션으로 어떤게 좋은가요?','아이가 많이 건조한편이라 좋은 제품 추천 부탁드려요~!','육아커뮤니티','서울특별시 중구','2021-10-19 11:34:30',NULL,NULL,NULL,NULL),(25,NULL,'[육아] 아이들 옷 어떻게 입히시나요?','아침저녁에만 춥고 낮엔 더워서 애들 옷 입히기 정말 애매하네요. 다들 어떻게 입히세요?','육아커뮤니티','서울특별시 강남구','2021-10-19 11:34:56',NULL,NULL,NULL,NULL),(28,NULL,'[육아] 자꾸 안먹네요...','이유식 거부가 점점 심해지는것 같아요. 농도가 안맞는건지, 입자기 안맞는건지 힘드네요ㅜㅜ','육아커뮤니티','서울특별시 강북구','2021-10-19 12:11:30',NULL,NULL,NULL,NULL),(29,NULL,'[육아] 애기 우유 뭐 먹이세요?(일반우유)','애기들 생우유 어떤거 먹이시나요(분유아님)~~?','육아커뮤니티','서울특별시 관악구','2021-10-19 12:12:14',NULL,NULL,NULL,NULL),(30,NULL,'[육아] 14개월 아기 너무 자기 싫어해요 ㅜㅜ','14개월 아이인데 낮잠이건 밤잠이건 너무 작히 싫어해요... 지금도 겨울 울다지쳐 잠들게 되버렸네요... 육아고수님들 도와주세요ㅜ1231','임신커뮤니티','서울특별시 강남구','2021-10-19 12:12:37','2021-10-19 19:12:40',NULL,NULL,NULL),(31,NULL,'[육아] 집에서 하는 놀이','4살아이와 집에서 주로 어떤 놀이를 하시나요?','육아커뮤니티','서울특별시 강남구','2021-10-19 12:12:58','2021-10-19 12:20:53',NULL,NULL,NULL),(32,NULL,'[육아] 아이 심리상담 받는 분 계신가요?','요즘 들어 부쩍 애가 짜증이 많아져서 아이 심리가 궁금합니다.. 상담 받아보고 싶은데 아무것도 몰라서요... 상담 받아보신분 계신가요?','육아커뮤니티','서울특별시 강남구','2021-10-19 12:20:13','2021-10-19 12:20:59',NULL,NULL,NULL),(33,NULL,'[육아] 육아용품 저렴한곳','육아용품 저렴한 곳 있을까요? 카시트나 유모차 같이 큰 것부터 젖병같은 것까지요. 저렴하고 한 곳에 모아놓고 판매하는 곳 있으면 알려주세요.','육아커뮤니티','서울특별시 금천구','2021-10-19 12:20:42',NULL,NULL,NULL,NULL),(35,NULL,'[임신] 임신초기인데 입맛이 없네요 ㅜㅜ','혹시 임신초기에 입맛이 사라지신분 계신가요?? 억지로 먹는데 잘 안넘어가네요 ㅜㅜ','임신커뮤니티','서울특별시 도봉구','2021-10-19 12:27:21',NULL,NULL,NULL,NULL),(36,NULL,'[임신] 임신중 운동','개월에 따라 어떤 운동하셨나요?','임신커뮤니티','서울특별시 용산구','2021-10-19 12:28:01',NULL,NULL,NULL,NULL),(37,NULL,'[임신] 임신 13주차 산후조리원 추천부탁드립니다.','산후조리원 추천부탁드립니다.','임신커뮤니티','서울특별시 동작구','2021-10-19 12:28:20',NULL,NULL,NULL,NULL),(38,NULL,'[임신] 임신 우울','다들 임신하셨을때 괜찮으셨나요? 저는 왜이리 우울한지ㅠㅠ 그냥 이유 없이 우울했다가 또 좋아졌다가 계속 반복이네요...','임신커뮤니티','서울특별시 서초구','2021-10-19 12:28:36',NULL,NULL,NULL,NULL),(39,NULL,'[임신] 임신초기에 먹어야할 영양제 추천해주세요','초기 임산부가 먹어야할 영양제 추천해주세요.','임신커뮤니티','서울특별시 송파구','2021-10-19 12:28:56',NULL,NULL,NULL,NULL),(40,NULL,'[임신] 임신초기인데 잠을 못자요 ㅜㅜ','제가 아직 임신초기인데 잠을 잘 못자고 새벽에 자꾸 깨여ㅠㅠㅠ 그리고 다시 잘라해도 잠도 안오고 낮에도 피곤해도 잠을 못자는데 이 증상 좋아질까요?ㅠㅠ','임신커뮤니티','서울특별시 서초구','2021-10-19 12:40:27',NULL,NULL,NULL,NULL),(41,NULL,'[임신] 임신초기인데 세끼 다 먹어야 되나요?','아직 뭣도 모르는 임신초기입니다.. 평소에 두끼정도만 먹는데 세끼 다 먹어야 되나요?','임신커뮤니티','서울특별시 송파구','2021-10-19 12:40:46',NULL,NULL,NULL,NULL),(42,NULL,'[임신] 임신초기 증상이요.','엊그제까지만 해도 가슴통증이랑 배 콕콕 거리는게 있었는ㄴ데 하나도 없어졌어요... 아기집도 못본 초기 인데 증상이 이렇게 빨리 없어지나요?? 괜찮은건가요...?','임신커뮤니티','서울특별시 노원구','2021-10-19 12:41:12',NULL,NULL,NULL,NULL),(43,NULL,'[임신] 임신 초기가 이렇게 힘든가요...?','하루종일 옴살기운에 으슬으슬하고 힘이 하나도 없어요.. 일까지 하려니 정말 죽을맛이에요...ㅜㅜ 좋은 영양제좀 추천해주세요!','임신커뮤니티','서울특별시 양천구','2021-10-19 12:49:11',NULL,NULL,NULL,NULL),(44,NULL,'[임신] 임신하고 잠 안올때 어쩌나요 ㅠㅠ','요즘 임신하고부터 불면증이 심해졌어요. 코로나때문에 공황장애 증상처럼 불안감이 훅 엄습하는데 계속 걱정이 심해지니 불면증이 좀처럼 나아지질 않는듯 싶어요ㅠ','임신커뮤니티','서울특별시 동대문구','2021-10-19 12:49:54',NULL,NULL,NULL,NULL),(45,NULL,'[문의]  제가 쓴 게시글을 보고 싶습니다.','제가 게시판에 여러 글을 작성하였는데 전부 보고 싶은데 어떻게 볼 수 있을까요?','문의사항','서울특별시 중구','2021-10-19 14:24:21',NULL,NULL,NULL,NULL),(46,NULL,'[문의] 접속한지 오래 되어서 아이디랑 비밀번호를 잊어버렸어요.','아이디랑 비밀번호 찾는 방법좀 알려주세요.','문의사항','서울특별시 중구','2021-10-19 14:37:17',NULL,NULL,NULL,NULL),(47,NULL,'[문의] 구매한 제품이 찾아봤는데 없어요.','예전에 구매한 제품 다시 사려고 하는데 없네요. 다시 구매할 수 있을까요?','문의사항','서울특별시 서대문구','2021-10-19 14:56:51',NULL,NULL,NULL,NULL),(48,NULL,'[문의] 임신 게시판에는 임신관련 글만 작성 가능한가요?','임신 말고 다른 것도 질문하고 싶은데 괜찮은가요?','문의사항','서울특별시 양천구','2021-10-19 15:04:12',NULL,NULL,NULL,NULL),(49,NULL,'[문의] 남편도 이 사이트를 이용할 수 있을까요?','이 사이트 남성도 가입 가능한거 맞죠?','문의사항','서울특별시 영등포구','2021-10-19 15:05:19',NULL,NULL,NULL,NULL),(50,NULL,'[문의] 회원정보를 수정하고 싶어요.','이사가서 주소가 변경되었습니다. 어디서 수정 가능 할까요?','문의사항','서울특별시 성동구','2021-10-19 15:14:18',NULL,NULL,NULL,NULL),(51,NULL,'[문의] 제가 쓴 게시글 삭제 가능한가요?','예전에 작성한 글인데 삭제할 수 있죠?','문의사항','서울특별시 중랑구','2021-10-19 15:14:45',NULL,NULL,NULL,NULL),(52,NULL,'[문의] 구매한 제품 환불하고 싶어요.','막상 주문해서 받아놓기만 하고 따로 쓰진 않았는데 환불 가능한가요?','문의사항','서울특별시 송파구','2021-10-19 15:21:55',NULL,NULL,NULL,NULL),(53,NULL,'[문의] 회원탈퇴하고 싶어요','더 이상 사이트를 이용 안할거 같아서 회원 탈퇴하고 싶어요.','문의사항','서울특별시 금천구','2021-10-19 15:22:18',NULL,NULL,NULL,NULL),(54,NULL,'[문의] 금일 사이트 점검인가요?','접속이 안되어서 문의 남깁니다.','문의사항','서울특별시 중구','2021-10-19 15:22:58',NULL,NULL,NULL,NULL),(56,NULL,'123123','123123','임신커뮤니티','서울특별시 강남구','2021-10-20 17:37:19',NULL,NULL,NULL,NULL),(57,NULL,'test','test','임신커뮤니티','서울특별시 강남구','2021-10-20 17:48:17',NULL,NULL,NULL,NULL),(58,NULL,'test2','t','임신커뮤니티','서울특별시 강남구','2021-10-20 17:49:16',NULL,NULL,NULL,NULL),(59,NULL,'test3','t','임신커뮤니티','서울특별시 강남구','2021-10-20 17:50:33',NULL,NULL,NULL,NULL),(60,NULL,'test4','t','임신커뮤니티','서울특별시 강남구','2021-10-20 17:56:51',NULL,NULL,NULL,NULL),(61,NULL,'test5','t','임신커뮤니티','서울특별시 강남구','2021-10-20 18:01:24',NULL,NULL,NULL,NULL),(62,NULL,'test6','t','임신커뮤니티','서울특별시 강남구','2021-10-20 18:04:24',NULL,NULL,NULL,NULL),(64,'jwkimcan','123123','12313','임신커뮤니티','서울특별시 강남구','2021-10-20 18:14:15',NULL,NULL,NULL,NULL),(124,'ektha7677','[임신] 임신초기인데 세끼 다 먹어야 되나요?','입덧이 너무 심해서 먹지를 못하겟어요ㅠㅠ','임신커뮤니티','서울특별시 광진구','2021-10-22 16:40:33',NULL,NULL,'맘마밀 안심이유식.jpg','맘마밀 안심이유식.jpg'),(125,'ektha7677','[임신] 임신초기인데 세끼 다 먹어야 되나요?','입덧이 너무 심해서 먹지를 못하겟어요ㅠㅠ','임신커뮤니티','서울특별시 광진구','2021-10-22 16:41:53',NULL,NULL,'맘마밀 안심이유식.jpg','맘마밀 안심이유식.jpg');
/*!40000 ALTER TABLE `board` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `calender`
--

DROP TABLE IF EXISTS `calender`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `calender` (
  `calCode` int NOT NULL AUTO_INCREMENT,
  `calInsertdate` date DEFAULT NULL,
  `calTitle` varchar(100) DEFAULT NULL,
  `calContent` varchar(500) DEFAULT NULL,
  `calFeel` varchar(50) DEFAULT NULL,
  `calStartday` date DEFAULT NULL,
  `calEndday` date DEFAULT NULL,
  `calCycle` int DEFAULT NULL,
  `calPhoto` varchar(500) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `calUserid` varchar(20) DEFAULT NULL,
  `calCheckCode` int DEFAULT NULL,
  `calPhoto_real` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`calCode`),
  KEY `calender_ibfk_1` (`calUserid`),
  KEY `calCheckCode` (`calCheckCode`),
  CONSTRAINT `calender_ibfk_1` FOREIGN KEY (`calUserid`) REFERENCES `user` (`userid`),
  CONSTRAINT `calender_ibfk_2` FOREIGN KEY (`calCheckCode`) REFERENCES `checklist` (`checkCode`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `calender`
--

LOCK TABLES `calender` WRITE;
/*!40000 ALTER TABLE `calender` DISABLE KEYS */;
INSERT INTO `calender` VALUES (1,'2021-10-01','병원가는날','건강해야지','보통','2021-10-05','2021-10-10',28,NULL,'ektha7677',NULL,NULL),(6,'2021-10-18','산부인과 가는날!','택시타고 가야지','보통','2021-10-01','2021-10-08',30,'',NULL,NULL,NULL),(7,'2021-10-18','임신 8주!','배가 불러오고있다.','보통','2021-08-05','2021-10-12',35,'downloadfile-327.jpg',NULL,NULL,NULL),(8,'2021-10-18','임신 24주!','배가 커지고 있어요','행복','2021-02-02','2021-02-06',35,'downloadfile-327.jpg',NULL,NULL,NULL),(9,'2021-10-19','육아일기 시작','아기가 점심을 많이 먹었다.\r\n','보통','2021-10-05','2021-10-12',30,NULL,NULL,NULL,NULL),(10,'2021-10-21','어린이집 등록!!','친구들 많이 사귀고 오렴^^','행복','2021-09-23','2021-09-28',29,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `calender` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cart` (
  `user_userid` varchar(20) NOT NULL,
  `product_productid` int NOT NULL,
  `cartInsertdate` date DEFAULT NULL,
  `cartAmount` int DEFAULT NULL,
  PRIMARY KEY (`user_userid`,`product_productid`),
  KEY `fk_user_has_product1_product1_idx` (`product_productid`),
  KEY `fk_user_has_product1_user1_idx` (`user_userid`),
  CONSTRAINT `fk_user_has_product1_product1` FOREIGN KEY (`product_productid`) REFERENCES `product` (`productid`),
  CONSTRAINT `fk_user_has_product1_user1` FOREIGN KEY (`user_userid`) REFERENCES `user` (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart`
--

LOCK TABLES `cart` WRITE;
/*!40000 ALTER TABLE `cart` DISABLE KEYS */;
/*!40000 ALTER TABLE `cart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `checklist`
--

DROP TABLE IF EXISTS `checklist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `checklist` (
  `checkCode` int NOT NULL AUTO_INCREMENT,
  `checkAppointdate` date DEFAULT NULL,
  `checkAppointTime` time DEFAULT NULL,
  `checkAppHospital` varchar(100) DEFAULT NULL,
  `checkHAddress1` varchar(100) DEFAULT NULL,
  `checkHAddress2` varchar(100) DEFAULT NULL,
  `checkRelation` varchar(20) DEFAULT NULL,
  `checkBodytemp` varchar(20) DEFAULT NULL,
  `checkDrug` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`checkCode`),
  UNIQUE KEY `checkCode_UNIQUE` (`checkCode`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `checklist`
--

LOCK TABLES `checklist` WRITE;
/*!40000 ALTER TABLE `checklist` DISABLE KEYS */;
INSERT INTO `checklist` VALUES (2,'2021-10-11','13:00:00','강남산부인과','서울 강남구 강남대로 238','','2021-10-04','35.8C','복용'),(4,'2021-12-31','12:00:00','강남산부인과','서울 강남구 가로수길 9','2층','2021-09-29','36.3',''),(5,'2021-11-01','14:00:00','다움산부인과','서울 강남구 개포로 202','5층','2021-09-30','36.2C','복용'),(10,'2021-11-01','15:00:00','다움산부인과','서울 강남구 강남대로 238','5층','2021-10-15','36.5','복용'),(12,'2021-10-14','14:00:00','12:00:00','','','2021-10-21','복용',NULL),(13,'2021-10-22','12:00:00','강남산부인과','서울 강남구 가로수길 9','8층','2021-10-21','36.5','미복용');
/*!40000 ALTER TABLE `checklist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comment`
--

DROP TABLE IF EXISTS `comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comment` (
  `commentCode` int NOT NULL AUTO_INCREMENT,
  `commentInsertdate` date DEFAULT NULL,
  `commentModate` date DEFAULT NULL,
  `commentDeldate` date DEFAULT NULL,
  `commentContent` varchar(300) DEFAULT NULL,
  `comuserid` varchar(20) DEFAULT NULL,
  `comwriteCode` int DEFAULT NULL,
  PRIMARY KEY (`commentCode`),
  KEY `comuserid` (`comuserid`),
  KEY `comwriteCode` (`comwriteCode`),
  CONSTRAINT `comment_ibfk_1` FOREIGN KEY (`comuserid`) REFERENCES `user` (`userid`),
  CONSTRAINT `comment_ibfk_2` FOREIGN KEY (`comwriteCode`) REFERENCES `board` (`writeCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comment`
--

LOCK TABLES `comment` WRITE;
/*!40000 ALTER TABLE `comment` DISABLE KEYS */;
/*!40000 ALTER TABLE `comment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `delete_product`
--

DROP TABLE IF EXISTS `delete_product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `delete_product` (
  `user_userid` varchar(20) NOT NULL,
  `product_productid` int NOT NULL,
  `delete_productDate` date DEFAULT NULL,
  `delete_productAmount` int DEFAULT NULL,
  `delete_productReason` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`user_userid`,`product_productid`),
  KEY `fk_user_has_product_product2_idx` (`product_productid`),
  KEY `fk_user_has_product_user1_idx` (`user_userid`),
  CONSTRAINT `fk_user_has_product_product2` FOREIGN KEY (`product_productid`) REFERENCES `product` (`productid`),
  CONSTRAINT `fk_user_has_product_user1` FOREIGN KEY (`user_userid`) REFERENCES `user` (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `delete_product`
--

LOCK TABLES `delete_product` WRITE;
/*!40000 ALTER TABLE `delete_product` DISABLE KEYS */;
INSERT INTO `delete_product` VALUES ('zizifnvl',47,'2021-09-03',10,'생산중단');
/*!40000 ALTER TABLE `delete_product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order`
--

DROP TABLE IF EXISTS `order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order` (
  `orderid` int NOT NULL AUTO_INCREMENT,
  `user_userid` varchar(20) NOT NULL,
  `product_productid` int NOT NULL,
  `orderInsertdate` date DEFAULT NULL,
  `orderAmount` int DEFAULT NULL,
  `orderDeliverfee` int DEFAULT NULL,
  PRIMARY KEY (`orderid`),
  UNIQUE KEY `orderid_UNIQUE` (`orderid`),
  KEY `fk_user_has_product2_product1_idx` (`product_productid`),
  KEY `fk_user_has_product2_user1_idx` (`user_userid`),
  CONSTRAINT `fk_user_has_product2_product1` FOREIGN KEY (`product_productid`) REFERENCES `product` (`productid`),
  CONSTRAINT `fk_user_has_product2_user1` FOREIGN KEY (`user_userid`) REFERENCES `user` (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order`
--

LOCK TABLES `order` WRITE;
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
/*!40000 ALTER TABLE `order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_cancel`
--

DROP TABLE IF EXISTS `order_cancel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order_cancel` (
  `user_userid` varchar(20) NOT NULL,
  `product_productid` int NOT NULL,
  `cancelDate` date DEFAULT NULL,
  `cancelAmount` int DEFAULT NULL,
  `cancelorderid` int DEFAULT NULL,
  KEY `fk_user_has_product4_product1_idx` (`product_productid`),
  KEY `fk_user_has_product4_user1_idx` (`user_userid`),
  KEY `cancelorderid` (`cancelorderid`),
  CONSTRAINT `fk_user_has_product4_product1` FOREIGN KEY (`product_productid`) REFERENCES `product` (`productid`),
  CONSTRAINT `fk_user_has_product4_user1` FOREIGN KEY (`user_userid`) REFERENCES `user` (`userid`),
  CONSTRAINT `order_cancel_ibfk_1` FOREIGN KEY (`cancelorderid`) REFERENCES `order` (`orderid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_cancel`
--

LOCK TABLES `order_cancel` WRITE;
/*!40000 ALTER TABLE `order_cancel` DISABLE KEYS */;
/*!40000 ALTER TABLE `order_cancel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `payment` (
  `user_userid` varchar(20) NOT NULL,
  `product_productid` int NOT NULL,
  `paymentDate` date DEFAULT NULL,
  `paymentPrice` int DEFAULT NULL,
  PRIMARY KEY (`user_userid`,`product_productid`),
  KEY `fk_user_has_product5_product1_idx` (`product_productid`),
  KEY `fk_user_has_product5_user1_idx` (`user_userid`),
  CONSTRAINT `fk_user_has_product5_product1` FOREIGN KEY (`product_productid`) REFERENCES `product` (`productid`),
  CONSTRAINT `fk_user_has_product5_user1` FOREIGN KEY (`user_userid`) REFERENCES `user` (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment`
--

LOCK TABLES `payment` WRITE;
/*!40000 ALTER TABLE `payment` DISABLE KEYS */;
INSERT INTO `payment` VALUES ('dlfjgtn38',1,'2021-09-01',37900),('dlfjgtn38',47,'2021-09-17',8400),('dlwldms',3,'2021-09-03',60000),('dlwldms',36,'2021-09-19',21900),('ektha7677',5,'2021-09-05',23800),('ektha7677',25,'2021-09-21',9100),('gkgkdurtl',7,'2021-09-07',36300),('gkgkdurtl',21,'2021-09-21',15670),('hdasom',9,'2021-09-09',10030),('hdasom',14,'2021-09-14',3900),('hjwone',11,'2021-09-11',15800),('hjwone',26,'2021-09-26',12280),('jwkimcan',13,'2021-09-13',6900),('jwkimcan',27,'2021-09-27',18440),('tkdel90',8,'2021-09-08',12780),('tkdel90',15,'2021-09-15',3600);
/*!40000 ALTER TABLE `payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paymentInfo`
--

DROP TABLE IF EXISTS `paymentInfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `paymentInfo` (
  `paymentCode` int unsigned NOT NULL AUTO_INCREMENT,
  `paymentMethod` varchar(45) NOT NULL,
  `paymentBank` varchar(45) DEFAULT NULL,
  `paymentCardnum` varchar(45) DEFAULT NULL,
  `paymentCardpw` varchar(45) DEFAULT NULL,
  `paymentAccount` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`paymentCode`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paymentInfo`
--

LOCK TABLES `paymentInfo` WRITE;
/*!40000 ALTER TABLE `paymentInfo` DISABLE KEYS */;
INSERT INTO `paymentInfo` VALUES (1,'카드','신한은행','1387-6541-8963-5692','0908','3'),(2,'카드','국민은행','1215-6346-6696-8521','3569','5'),(3,'카드','농협은행','5512-9645-7894-9632','4479','3'),(4,'카드','우리은행','4582-7321-7412-8852','0518','1'),(5,'카드','하나은행','7456-6532-9634-1125','1345','3'),(6,'카드','기업은행','9654-5235-2584-6541','8521','4');
/*!40000 ALTER TABLE `paymentInfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `productid` int NOT NULL AUTO_INCREMENT,
  `productname` varchar(100) NOT NULL,
  `productcategory` varchar(45) NOT NULL,
  `productprice` int DEFAULT NULL,
  `productsaleprice` int DEFAULT NULL,
  `p_detail_category` varchar(45) DEFAULT NULL,
  `productImage` varchar(200) DEFAULT NULL,
  `productRealPath` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`productid`),
  UNIQUE KEY `productid_UNIQUE` (`productid`)
) ENGINE=InnoDB AUTO_INCREMENT=54 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,'마이시톨 1개 122.7g','임신',39900,37900,'임신영양제',NULL,NULL),(2,'이지맘 임신준비 영양제 스텝, 15g + 포맨 24g +임신테스트기 세트','임신',55000,49000,'임신영양제',NULL,NULL),(3,'엔지뉴트 레이디 4세대 활성엽산 종합 영양제 임산부 임신준비 종합 필수 영양제 1개월','임신',60000,50000,'임신영양제',NULL,NULL),(4,'내추럴프러스 - 임플라민 파더민 -임신준비, 비타민D','임신',16500,16500,'임신영양제',NULL,NULL),(5,'블랙모어스 컨시브 웰 골드 28정+28캡슐','임신',23800,23800,'임신영양제',NULL,NULL),(6,'피엠시톨 활성엽산 미오 이노시톨 임신준비','임신',46500,42000,'임신영양제',NULL,NULL),(7,'닥터맘스1 임신준비초기영양제 120정 하루 2정 2개월분','임신',36300,36300,'임신영양제',NULL,NULL),(8,'동아제약 굿뉴스 얼리체크 임신테스트기','임신',14000,12510,'임신테스트기',NULL,NULL),(9,'원포 패스터 임신테스트기 20mlU','임신',10030,10030,'임신테스트기',NULL,NULL),(11,'스마일 민감도별 임신테스트기 3종 세트','임신',15800,15800,'임신테스트기',NULL,NULL),(12,'스마일 얼리테스터 얼리 임신테스트기 임테기 x 5개','임신',20000,11490,'임신테스트기',NULL,NULL),(13,'휴마시스 헬로베이비 미드스트림 임신테스트기','임신',12000,6900,'임신테스트기',NULL,NULL),(14,'체크엔케어 아이원해 클리어 임신테스트기 3개입','임신',3900,3900,'임신테스트기',NULL,NULL),(15,'아이러브플러스체크 스틱형 임신진단시약','임신',4000,3600,'임신테스트기',NULL,NULL),(16,'뉴트리헬스케어 클리어체크 얼리 임신테스트기','임신',5450,5450,'임신테스트기',NULL,NULL),(17,'세이플리 임신테스트기 3개','임신',5450,5450,'임신테스트기',NULL,NULL),(18,'원포 배란 테스트기 20p + 임신 테스트기 3p','임신',14900,14800,'배란테스트기',NULL,NULL),(19,'스마일랩 배테기 데이비드 배란테스트기','임신',17010,16240,'배란테스트기',NULL,NULL),(20,'슈얼리 디지털 배란테스트기 20개입 + 뉴트리 이노시톨 증정','임신',39800,39800,'배란테스트기',NULL,NULL),(21,'모코랩 임산부 팬티 3p','임신',25000,15670,'임산부 속옷',NULL,NULL),(22,'W 레터링 임부용 팬티 5종 세트','임신',13900,13900,'임산부 속옷',NULL,NULL),(23,'W 임부용 모달 팬티 3종 세트','임신',16900,16900,'임산부 속옷',NULL,NULL),(25,'마더라이크 5068 수유브라팬티세트','임신',9900,9100,'임산부 속옷',NULL,NULL),(26,'쁘띠마리에 면스판 수유나시','임신',12680,12280,'임산부 속옷',NULL,NULL),(27,'프라하우스 수유 브라탑','임신',20750,18440,'임산부 속옷',NULL,NULL),(28,'봉봉스토리 웃음소리 임산부 원피스','임신',22700,22700,'임부복',NULL,NULL),(29,'보리맘 ST 기모 임부 원피스','임신',16900,15540,'임부복',NULL,NULL),(30,'비하인드 원피스 임부복','임신',29700,29700,'임부복',NULL,NULL),(31,'투유 퍼프 임산부 원피스','임신',20990,20990,'임부복',NULL,NULL),(32,'바삐 카라 임산부 원피스','임신',16150,16150,'임부복',NULL,NULL),(33,'살루테 미니 줄 점프슈트 + 모자 세트','육아',12900,12900,'아동복',NULL,NULL),(34,'트리베어 긴팔 우주복 5종 세트','육아',24720,22650,'아동복',NULL,NULL),(35,'코디아이 아동용 나나 칠부내의','육아',9900,9900,'아동복',NULL,NULL),(36,'리틀래빗 아동용 베이비 D 따옴 레깅수트','육아',21900,21900,'아동복',NULL,NULL),(37,'아가방 피요7부내의','육아',9900,9900,'아동복',NULL,NULL),(38,'모이몰른 클립라이트 후드점퍼','육아',29900,25000,'아동복',NULL,NULL),(39,'스마일 가을아기옷 베베상하세트','육아',16900,16900,'아동복',NULL,NULL),(40,'베베니즈 집업 후드 우주복','육아',24500,17320,'아동복',NULL,NULL),(41,'행복한초록 봄가을 체크정장쟈켓 상의티 바지 3종세트복','육아',30800,19800,'아동복',NULL,NULL),(42,'아이엠베베 유아용 스윗허그 행사복 3종 세트','육아',25900,25900,'아동복',NULL,NULL),(43,'엘빈즈 클래식 냉장 이유식 중기1 A세트','육아',15000,15000,'이유식',NULL,NULL),(44,'맘마밀 안심이유식','육아',27000,17050,'이유식',NULL,NULL),(45,'오가닉맘 이유식 골고루 10+1','육아',33200,29900,'이유식',NULL,NULL),(46,'풀무원 베이비밀 이유식 후기 8~10개월 A세트','육아',15900,15900,'이유식',NULL,NULL),(47,'하림 IFF 무항생제 인증 닭안심 다짐육 이유식','육아',8900,8400,'이유식',NULL,NULL);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_detail`
--

DROP TABLE IF EXISTS `product_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product_detail` (
  `detailAmount` int DEFAULT NULL,
  `detailStarscore` double DEFAULT NULL,
  `detailReview` varchar(500) DEFAULT NULL,
  `detailSize` varchar(45) DEFAULT NULL,
  `detailColor` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `detailproductid` int DEFAULT NULL,
  `detailCode` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`detailCode`),
  UNIQUE KEY `detailCode_UNIQUE` (`detailCode`),
  KEY `product_detail_ibfk_1` (`detailproductid`),
  CONSTRAINT `product_detail_ibfk_1` FOREIGN KEY (`detailproductid`) REFERENCES `product` (`productid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_detail`
--

LOCK TABLES `product_detail` WRITE;
/*!40000 ALTER TABLE `product_detail` DISABLE KEYS */;
INSERT INTO `product_detail` VALUES (10,5,'좋은 영양제에요',NULL,NULL,2,1),(5,4,'너무 마음에 들어요!','M','핑크색',28,2),(5,3,'몸에 잘 맞아요^^','L','검은색',29,3);
/*!40000 ALTER TABLE `product_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_search`
--

DROP TABLE IF EXISTS `product_search`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product_search` (
  `user_userid` varchar(20) NOT NULL,
  `product_productid` int NOT NULL,
  PRIMARY KEY (`user_userid`,`product_productid`),
  KEY `fk_user_has_product3_product1_idx` (`product_productid`),
  KEY `fk_user_has_product3_user1_idx` (`user_userid`),
  CONSTRAINT `fk_user_has_product3_product1` FOREIGN KEY (`product_productid`) REFERENCES `product` (`productid`),
  CONSTRAINT `fk_user_has_product3_user1` FOREIGN KEY (`user_userid`) REFERENCES `user` (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_search`
--

LOCK TABLES `product_search` WRITE;
/*!40000 ALTER TABLE `product_search` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_search` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `register`
--

DROP TABLE IF EXISTS `register`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `register` (
  `user_userid` varchar(20) NOT NULL,
  `product_productid` int NOT NULL,
  `registerInsertdate` date DEFAULT NULL,
  `registerAmount` int DEFAULT NULL,
  PRIMARY KEY (`user_userid`,`product_productid`),
  KEY `fk_user_has_product_product1_idx` (`product_productid`),
  KEY `fk_user_has_product_user_idx` (`user_userid`),
  CONSTRAINT `fk_user_has_product_product1` FOREIGN KEY (`product_productid`) REFERENCES `product` (`productid`),
  CONSTRAINT `fk_user_has_product_user` FOREIGN KEY (`user_userid`) REFERENCES `user` (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `register`
--

LOCK TABLES `register` WRITE;
/*!40000 ALTER TABLE `register` DISABLE KEYS */;
INSERT INTO `register` VALUES ('ksa0708',1,'2021-09-28',10),('ksa0708',31,'2021-09-07',10),('tkfkd486',26,'2021-05-31',10),('tkfkd486',47,'2021-07-19',10),('tnekf55',13,'2021-08-25',10),('tnekf55',44,'2021-04-01',10),('wkddpt',9,'2021-10-18',10),('wkddpt',19,'2021-05-07',10),('zizifnvl',5,'2021-06-06',10),('zizifnvl',47,'2021-08-19',10);
/*!40000 ALTER TABLE `register` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `userid` varchar(20) NOT NULL,
  `userpw` varchar(45) DEFAULT NULL,
  `username` varchar(10) DEFAULT NULL,
  `useraddress1` varchar(100) DEFAULT NULL,
  `useraddress2` varchar(100) DEFAULT NULL,
  `userphone` varchar(20) DEFAULT NULL,
  `userbirth` varchar(30) DEFAULT NULL,
  `useremail` varchar(45) DEFAULT NULL,
  `userhospital` varchar(45) DEFAULT NULL,
  `admin` int DEFAULT NULL,
  PRIMARY KEY (`userid`),
  UNIQUE KEY `userid_UNIQUE` (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('baby123','baby1234','김다롬','강원 원주시 백간길 17-14','102-908','01071608877','1991-08-14','ektha@gmail.com','다움산부인과',1),('chedldzz','wkwkdaus89','김새롬','서울 은평구 녹번로 3','205호','01027887268','1992-11-06','chedldzz@naver.com','다움산부인과',1),('dkssudg','rlatofha','김새롬','경기 성남시 분당구 판교역로 235','205호','01071608877','1993-06-08','chedldzz@naver.com','다움산부인과',1),('dlfjgtn38','wndkla3','김주희','서울시 강서구 이름아파트','133-1331','010-5244-3240','1994-05-16','rtdfcv@gmail.com','강남미즈힐산부인과의원',1),('dlwldms','dliu','이지은','서울시 용산구 더힐45','610-302','010-8626-5429','1993.05.15','iu93@daum.net','삼성수여성의원',1),('ektha7677','ektha123','김상준','서울시 강서구','705-629','01071607730','1991-08-11','hdadom@naver.com','다움산부인과의원',1),('gkgkdurtl','wnals5','주현식','서울시 영등포구 롯데캐슬','452-7793','010-5244-3240','1985-04-12','hsz@naver.com','청담든소아청소년과의원',1),('hdasom','ektha234','허다솜','경기 수원시 영통구 센트럴타운로 76','6107 3502','01012345678','1992-01-01','ektha7677@gmail.com','강남산부인과',1),('hjwone','wodnjs55','김재원','수원시 광교 센텀남대로 20','131-4653','010-7764-3564','1995-06-23','hjw@naver.com','강남연세소아과의원',1),('jwkim','gustlr12','김재원','서울 관악구 승방7길 11','1323','01052443240','2021-10-23','jwkimcan97@naver.com','강남산부인과',1),('jwkimcan','gustlr12','이주영','경기 수원시 영통구 센트럴타운로 15','6107 3502','01052443240','2021-10-01','jwkimcan97@naver.com','미녀사랑산부인과의원',1),('jwkimcan231','gustlr12','김재원','경기 수원시 영통구 센트럴타운로 15','1313','01027323123','2021-10-14','jwkimcan97@naver.com','숨',1),('ksa0708','qwer4321','김선아','경기 수원시 영통구 센트럴타운로 76','610-302','010-2868-2581','1978-07-08','ksa0708@naver.com','에스여성의원',0),('tj133','gustlr12','김새롬','경기 수원시 영통구 센트럴타운로 76','6107 - 3502','01028683234','2001-01-22','chedldzz@naver.com','다움산부인과',1),('tkdel90','fnvl43','신세경','경기 안산시  단원구 허브빌라','113-331','010-7845-3265','1987-08-13','wndk87@daumr.net','로앤산부인과의원',1),('tkfkd486','fkdtk486','김민지','서울시 서대문구 회현동 자이','313- 312','010-7895-3256','1993-02-25','kmj93@naver.com','신소애여성의원',0),('tnekf55','rkwkd','진미달','경기 성남시 분당구 돌마로 478','495-364','010-6687-4325','1990-01-08','tnekf@gmail.com','더케이산부인과의원',0),('wkddpt','thfwkd','장예솔','경기도 성남 아름아파트','952-7532','010-9956-7432','1982-06-08','jhthf@naver.com','쉬즈굿여성의원',0),('zizifnvl','sun8612312312','이선애','서울시 압구정도 현대아파트','112-456','010-7935-4565','1993.03.77','zizifnvl@naver.com','리앤채움의원',0);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-29 18:31:29
