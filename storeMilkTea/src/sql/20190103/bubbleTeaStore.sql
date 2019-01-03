-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
-- Host: localhost    Database: bubbleTeaStore
-- ------------------------------------------------------
-- Server version	8.0.11

CREATE DATABASE IF NOT EXISTS bubbleTeaStore;
USE bubbleTeaStore;

/*!40101 SET @OLD_CHARACTER_SET_CLIENT = @@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS = @@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION = @@COLLATION_CONNECTION */;
SET NAMES utf8;
/*!40103 SET @OLD_TIME_ZONE = @@TIME_ZONE */;
/*!40103 SET TIME_ZONE = '+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS = @@UNIQUE_CHECKS, UNIQUE_CHECKS = 0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS = @@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS = 0 */;
/*!40101 SET @OLD_SQL_MODE = @@SQL_MODE, SQL_MODE = 'NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES = @@SQL_NOTES, SQL_NOTES = 0 */;

--
-- Table structure for table `cartDetails`
--
DROP TABLE IF EXISTS `cartDetails`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
SET character_set_client = utf8mb4;
CREATE TABLE `cartDetails`
(
  `id`        INT(11) UNSIGNED        NOT NULL AUTO_INCREMENT,
  `quantity`  INT(11) UNSIGNED        NOT NULL DEFAULT '1',
  `size`      ENUM ('S','M','L','XL') NOT NULL DEFAULT 'S',
  `productID` INT(11) UNSIGNED        NOT NULL,
  `cartID`    INT(11) UNSIGNED        NOT NULL,
  PRIMARY KEY (`id`),
  KEY `indexProductIDCartDetails` (`productID`),
  KEY `indexCartIDCartDetails` (`cartID`),
  CONSTRAINT `fkCartCartDetails` FOREIGN KEY (`cartID`) REFERENCES `carts` (`id`) ON DELETE CASCADE,
  CONSTRAINT `fkProductCartDetails` FOREIGN KEY (`productID`) REFERENCES `products` (`id`) ON DELETE CASCADE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;


--
-- Table structure for table `carts`
--

DROP TABLE IF EXISTS `carts`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
SET character_set_client = utf8mb4;
CREATE TABLE `carts`
(
  `id`     INT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `userID` INT(11) UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  KEY `indexUserIDCart` (`userID`),
  CONSTRAINT `fkUserIDCart` FOREIGN KEY (`userID`) REFERENCES `users` (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `categories`
--

DROP TABLE IF EXISTS `categories`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
SET character_set_client = utf8mb4;
CREATE TABLE `categories`
(
  `id`   INT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(50)      NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categories`
--

LOCK TABLES `categories` WRITE;
/*!40000 ALTER TABLE `categories`
  DISABLE KEYS */;
INSERT INTO `categories`(name)
VALUES ('Tea'),
       ('Coffee');
/*!40000 ALTER TABLE `categories`
  ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `categories`
--

DROP TABLE IF EXISTS `categoryDetails`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
SET character_set_client = utf8mb4;
CREATE TABLE `categoryDetails`
(
  `id`         INT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name`       VARCHAR(50)      NOT NULL,
  `categoryID` INT(11) UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  KEY `indexCategoryIDCategoryDetails` (`categoryID`),
  CONSTRAINT fkCategoryIDCategoryDetails FOREIGN KEY (`categoryID`) REFERENCES categories (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;


--
-- Table structure for table `discount`
--

DROP TABLE IF EXISTS `discounts`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
SET character_set_client = utf8mb4;
CREATE TABLE `discounts`
(
  `id`        INT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `percent`   DECIMAL(10, 2)   NOT NULL,
  `startDate` DATETIME         NOT NULL,
  `endDate`   DATETIME         NOT NULL,
  `productID` INT(11) UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  KEY `indexProductIDDiscounts` (`productID`),
  CONSTRAINT `fkProductIDDiscounts` FOREIGN KEY (`productID`) REFERENCES products (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;


DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
SET character_set_client = utf8mb4;
CREATE TABLE `products`
(
  `id`               INT(11) UNSIGNED        NOT NULL AUTO_INCREMENT,
  `name`             VARCHAR(50)             NOT NULL,
  `image`            VARCHAR(255)            NOT NULL,
  `price`            DECIMAL(10, 2)          NOT NULL DEFAULT 0,
  `size`             ENUM ('S','M','L','XL') NOT NULL DEFAULT 'S',
  `status`           BOOLEAN                 NOT NULL DEFAULT TRUE,
  `categoryDetailID` INT(11) UNSIGNED        NOT NULL,
  `discountID`       INT(11) UNSIGNED        NULL     DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `indexCategoryDetailIDProducts` (`categoryDetailID`),
  KEY `indexDiscountIDProducts` (`discountID`),
  CONSTRAINT `fkCategoryDetailIDProducts` FOREIGN KEY (`categoryDetailID`) REFERENCES `categoryDetails` (`id`),
  CONSTRAINT `fkDiscountIDProducts` FOREIGN KEY (`discountID`) REFERENCES `discounts` (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `review`
--

DROP TABLE IF EXISTS `reviews`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
SET character_set_client = utf8mb4;
CREATE TABLE `reviews`
(
  `id`        INT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `content`   TEXT             NOT NULL,
  `time`      DATETIME         NOT NULL DEFAULT NOW(),
  `userID`    INT(11) UNSIGNED NOT NULL,
  `productID` INT(11) UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  KEY `indexUserIDReviews` (`userID`),
  KEY `indexProductIDReviews` (`productID`),
  CONSTRAINT `fkProductIDReviews` FOREIGN KEY (`productID`) REFERENCES `products` (`id`) ON DELETE CASCADE,
  CONSTRAINT `fkUserIDReviews` FOREIGN KEY (`userID`) REFERENCES `users` (`id`) ON DELETE CASCADE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
SET character_set_client = utf8mb4;
CREATE TABLE `roles`
(
  `id`   INT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45)      NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles`
  DISABLE KEYS */;
INSERT INTO `roles`(name)
VALUES ('ROLE_ADMIN'),
       ('ROLE_CUSTOMER');
/*!40000 ALTER TABLE `roles`
  ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
SET character_set_client = utf8mb4;
CREATE TABLE `users`
(
  `id`       INT(11) UNSIGNED               NOT NULL AUTO_INCREMENT,
  `email`    VARCHAR(254)                   NOT NULL,
  `password` VARCHAR(120)                   NOT NULL,
  `fullName` VARCHAR(50)                    NULL     DEFAULT NULL,
  `phone`    VARCHAR(15)                    NULL     DEFAULT NULL,
  `gender`   ENUM ('Male','Female','other') NOT NULL DEFAULT 'Male',
  `roleID`   INT(11) UNSIGNED               NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE (`roleID`),
  KEY `indexRoleIDUsers` (`roleID`),
  CONSTRAINT `fkRoleIDUsers` FOREIGN KEY (`roleID`) REFERENCES roles (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;


/*!40101 SET character_set_client = @saved_cs_client */;

/*!40103 SET TIME_ZONE = @OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE = @OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS = @OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS = @OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT = @OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS = @OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION = @OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES = @OLD_SQL_NOTES */;

-- Dump completed on 2018-12-27 22:19:59
