CREATE DATABASE bank;
CREATE TABLE Branch(
branchname VARCHAR(50) Primary key,
branchcity CHAR(10) NOT NULL,
asset DECIMAL(10,2) NOT NULL CHECK(asset>0)
);
SELECT * FROM Branch;


CREATE TABLE Customer(
custname VARCHAR(50) Primary Key,
custstreet VARCHAR(50),
custcity VARCHAR(50) NOT NULL
);
SELECT * FROM Customer;


CREATE TABLE Account(
accnum VARCHAR(50) Primary Key,
branchname VARCHAR(50),
balance DECIMAL(10,2) CHECK (balance>500),
FOREIGN KEY(branchname) REFERENCES Branch(branchname)
);
SELECT * FROM Account;


CREATE TABLE Loan(
loanno VARCHAR(50) Primary Key,
branchname VARCHAR(50),
amount DECIMAL(10,2) CHECK(amount>0),
FOREIGN KEY(branchname) REFERENCES Branch(branchname)
);
SELECT * FROM Loan;


CREATE TABLE Borrower(
custname VARCHAR(50),
loanno VARCHAR(50),
PRIMARY KEY(custname,loanno),
FOREIGN KEY (custname) REFERENCES Customer(custname),
FOREIGN KEY (loanno) REFERENCES Loan(laonno)
);


CREATE TABLE Depositer(
custname VARCHAR(50),
accnum VARCHAR(50),
PRIMARY KEY(custname,accnum),
FOREIGN KEY (custname) REFERENCES Customer(custname),
FOREIGN KEY (accnum) REFERENCES Account(accnum)
);
SELECT * FROM Depositer;

-- OPERATIONS
ALTER TABLE Customer
MODIFY custstreet VARCHAR(50) NOT NULL;

ALTER TABLE Customer
ADD Phoneno VARCHAR(50);

ALTER TABLE Customer
ADD custage INT;

ALTER TABLE Customer
ADD CONSTRAINT chk_const CHECK(custage>18);

ALTER TABLE Customer 
MODIFY Phoneno VARCHAR(10);

ALTER TABLE Customer 
DROP COLUMN Phoneno;

ALTER TABLE Customer
DROP CONSTRAINT chk_const;