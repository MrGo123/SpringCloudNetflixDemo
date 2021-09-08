CREATE DATABASE /*!32312 IF NOT EXISTS */`db01` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `db01`;
/*Table structure for table `dept` */
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept`
(
    `deptno`    int(11) NOT NULL AUTO_INCREMENT,
    `dname`     varchar(50) DEFAULT NULL,
    `db_source` varchar(30) DEFAULT NULL,
    PRIMARY KEY (`deptno`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 6
  DEFAULT CHARSET = utf8;
/*Data for the table `dept` */
insert into `dept`(`deptno`, `dname`, `db_source`)
values (1, '后勤部', 'db01'),
       (2, '开发部', 'db01'),
       (3, '市场部', 'db01'),
       (4, '运营部', 'db01'),
       (5, '教研部', 'db01');