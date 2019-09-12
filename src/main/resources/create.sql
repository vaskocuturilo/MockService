 drop table IF EXISTS `WORKERS`;
 create TABLE WORKERS(employeeid int auto_increment primary key,
               firstname varchar(100), 
               lastname varchar(100), 
               department varchar(100),
               location varchar(10));