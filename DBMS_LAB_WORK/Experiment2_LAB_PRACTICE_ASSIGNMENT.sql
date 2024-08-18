CREATE DATABASE job;
 
CREATE TABLE Employee(
Emp_no VARCHAR(50),
E_name VARCHAR(50),
E_address CHAR(50),
E_ph_no INT,
Dept_no VARCHAR(50),
Dept_name CHAR(50),
Job_id VARCHAR(50),
Salary INT);
SELECT * FROM Employee;

ALTER TABLE Employee ADD COLUMN (HIREDATE VARCHAR(10));
SELECT * FROM Employee;