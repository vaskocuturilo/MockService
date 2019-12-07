 drop table IF EXISTS `WORKERS`;
 create TABLE WORKERS(id int(11) NOT NULL,
               firstname varchar(100), 
               lastname varchar(100), 
               department varchar(100),
               location varchar(10));

insert into WORKERS (id, firstname, lastname,department,location)
values (1, 'Vasko', 'Cuturilo', 'IT', 'POLAND');