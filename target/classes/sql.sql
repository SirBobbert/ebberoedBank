use bank;

SET FOREIGN_KEY_CHECKS=0;
DROP TABLE IF EXISTS banks;
DROP TABLE IF EXISTS customers;
DROP TABLE IF EXISTS transactions;
DROP TABLE IF EXISTS accounts;
SET FOREIGN_KEY_CHECKS=1;

CREATE TABLE customers(
id int AUTO_INCREMENT NOT NULL,
name varchar(50),
city varchar(50),
PRIMARY KEY(id)
);

CREATE TABLE banks(
id int AUTO_INCREMENT NOT NULL,
name varchar(50),
city varchar(50),
PRIMARY KEY(id)
);

CREATE TABLE transactions(
id int AUTO_INCREMENT NOT NULL,
amount int NOT NULL,
date date,
PRIMARY KEY(id)
);

CREATE TABLE accounts(
id int AUTO_INCREMENT NOT NULL,
transactionID int,
customerID int,
PRIMARY KEY(id),
FOREIGN KEY (customerID) REFERENCES customers (id),
FOREIGN KEY (transactionID) REFERENCES transactions (id)
);

INSERT INTO banks (name, city)
VALUES ("Ebberød Bank", "Ebberød");

INSERT INTO customers (name, city)
VALUES
("'lil' Tutti Frutti", "København"),
("Jonas", "Lyngby"),
("OliieJ", "Bagsværd"),
("Rapper_D", "Lyngby"),
("Backend_Bobbert", "Stubbekøbing")
;

INSERT INTO transactions (amount, date)
VALUES
(100, 20210216),
(100, 20210212),
(105, 20210211),
(50, 20210211),
(100, 20210216),
(75, 20210209),
(60, 20210209),
(40, 20210216),
(99, 20210207),
(14, 20210208),
(53, 20210207),
(87, 20210201),
(84, 20210210)
;

INSERT INTO accounts (transactionID, customerID)
VALUES
(1,1),
(2,4),
(3,1),
(4,3),
(5,5),
(6,4),
(7,2),
(8,2),
(9,3),
(10,3)
;

SELECT * FROM customers