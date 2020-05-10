use customerservice;

create table CustomerDetails
( customerId INT NOT NULL, 
firstName VARCHAR(100) NOT NULL, 
lastName VARCHAR(100) NOT NULL,
emailId VARCHAR(40) NOT NULL,
phoneNo LONG NOT NULL,
DateOfBirth DATE, PRIMARY KEY ( customerId ) ) ;

ALTER TABLE CustomerDetails MODIFY customerId INT NOT NULL AUTO_INCREMENT;

INSERT INTO CustomerDetails(firstName,lastName,emailId,phoneNo,DateOfBirth) VALUES 
('Raghu','Thota','raghu.thota@gmail.com',9856475362,'1983-03-03');

INSERT INTO CustomerDetails(firstName,lastName,emailId,phoneNo,DateOfBirth) VALUES 
('Swathi','Thota','swathi.thota@gmail.com',9853775362,'1990-08-03');

INSERT INTO CustomerDetails(firstName,lastName,emailId,phoneNo,DateOfBirth) VALUES 
('lekha','reddy','lekha.reddy@gmail.com',9826478962,'1973-04-08');

INSERT INTO CustomerDetails(firstName,lastName,emailId,phoneNo,DateOfBirth) VALUES 
('kavya','challa','kavya.challa@gmail.com',9898625362,'1994-01-10');

INSERT INTO CustomerDetails(firstName,lastName,emailId,phoneNo,DateOfBirth) VALUES 
('ramya','rao','ramya.rao@gmail.com',9820945962,'1990-03-08');

INSERT INTO CustomerDetails(firstName,lastName,emailId,phoneNo,DateOfBirth) VALUES 
('vimal','rega','vimal.rega@gmail.com',9027625362,'1993-10-10');

Select * from CustomerDetails;
select max(customerId) from customerdetails;
select * from CustomerAddress;

create table CustomerAddress(
AddressId int not null auto_increment,
customerId int not null,
aptNum varchar(10),
streetName varChar(20),
city varchar(20),
state varChar(4),
zip int,
country varchar(10),
primary key (addressId),
 FOREIGN KEY (customerId) REFERENCES CustomerDetails(customerId)
);
ALTER TABLE CustomerAddress MODIFY state varchar(20) ;

INSERT INTO CustomerAddress(customerId,aptNum,streetName,city,state,zip,country) VALUES 
(6,231,'roger','kansas','Missouri',60312,'US');

INSERT INTO CustomerAddress(customerId,aptNum,streetName,city,state,zip,country) VALUES 
(3,456,'olathe','Dallas','Texas',20456,'US');

INSERT INTO CustomerAddress(customerId,aptNum,streetName,city,state,zip,country) VALUES 
(5,289,'overland','kansas','Missouri',60213,'US');

INSERT INTO CustomerAddress(customerId,aptNum,streetName,city,state,zip,country) VALUES 
(2,987,'highland','kansas','Missouri',20456,'US');

INSERT INTO CustomerAddress(customerId,aptNum,streetName,city,state,zip,country) VALUES 
(4,387,'subedari','warangal','Hanamkonda',506011,'India');

INSERT INTO CustomerAddress(customerId,aptNum,streetName,city,state,zip,country) VALUES 
(1,3456,'kondapur','hitech city','Hyderabad',52345,'India');

DROP TABLE CustomerAddress;
DESCRIBE CustomerDetails;

CREATE TABLE Catrgories(
categoryId int not null auto_increment,
productId int not null,
customerId int not null,
appliances varchar(40),
electronics varchar(40),
clothing varchar(40),
jewlery varchar(40),
shoes varchar(40),
primary key (categoryId));


ALTER TABLE Catrgories DROP foreign key productId;

drop table Catrgories;

select * from Catrgories;

CREATE TABLE productTable(
productId int not null auto_increment,
productName varchar(30),
category varchar(20),
price float ,
PRIMARY KEY (productId));

drop table productTable;

create table orders(
orderId int not null auto_increment,
customerId int not null,
productId int not null,
orderDate date,
primary key (orderId),
foreign key (customerId) references customerdetails(customerId),
foreign key (productId) references productTable(productId)); 
 
select * from productTable;
selct * from cust



