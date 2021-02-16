use bank;

CREATE TABLE banks(
id int AUTO_INCREMENT NOT NULL,
name varchar(50),
city varchar(50),
customerID int,
PRIMARY KEY(id),
FOREIGN KEY (customerID) REFERENCES customers (id)
);

CREATE TABLE customers(
id int AUTO_INCREMENT NOT NULL,
name varchar(50),
city varchar(50),
PRIMARY KEY(id)
);

CREATE TABLE transactions(
id int AUTO_INCREMENT NOT NULL,
amount int NOT NULL,
date datetime,
PRIMARY KEY(id)
);

CREATE TABLE accounts(
id int AUTO_INCREMENT NOT NULL,
transactionID int,
PRIMARY KEY(id),
FOREIGN KEY (transactionID) REFERENCES transactions (id)
);


