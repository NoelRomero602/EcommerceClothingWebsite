
 DROP USER if exists 'springstudent'@'localhost' ;
 
 -- Now create user with proper privs
 CREATE USER 'springstudent'@'localhost' IDENTIFIED BY 'springstudent';
 GRANT ALL PRIVILEGES ON * . * TO 'springstudent'@'localhost';
 ALTER USER 'springstudent'@'localhost' IDENTIFIED WITH mysql_native_password BY 'springstudent';

CREATE DATABASE  IF NOT EXISTS `Clothing_Article_directory`;
USE `Clothing_Article_directory`;

--
-- Table structure for table `Clothing_Article`
--

DROP TABLE IF EXISTS `Clothing_Article`;

CREATE TABLE `Clothing_Article` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category` varchar(45) DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `Clothing_Article`
--

INSERT INTO `Clothing_Article` VALUES 
	(1,'Leslie','Andrews'),
	(2,'Emma','Baumgarten'),
	(3,'Avani','Gupta'),
	(4,'Yuri','Petrov'),
	(5,'Juan','Vega');