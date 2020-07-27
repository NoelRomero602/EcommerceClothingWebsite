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
  `name` varchar(45) DEFAULT NULL,
  `price` decimal(13,2) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `Clothing_Article`
--

INSERT INTO `Clothing_Article` VALUES 
	(1,'blue v-neck',13.99,'assets/images/products/placeholder.png'),
    (2,'black v-neck',13.99,'assets/images/products/placeholder.png'),
    (3,'red v-neck',13.99,'assets/images/products/placeholder.png'),
	(4,'orange v-neck',13.99,'assets/images/products/placeholder.png');