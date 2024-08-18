CREATE DATABASE job;
 
CREATE TABLE Employee(
Emp_no VARCHAR(50) Primary Key,
E_name VARCHAR(50),
E_address CHAR(50),
E_ph_no INT,
Dept_no VARCHAR(50),
Dept_name CHAR(50),
Job_id CHAR(50),
Salary INT);
SELECT * FROM Employee;

ALTER TABLE Employee ADD COLUMN (HIREDATE VARCHAR(10));
SELECT * FROM Employee;

ALTER TABLE Employee MODIFY Job_id VARCHAR(10);
SELECT * FROM Employee;

ALTER TABLE Employee RENAME COLUMN Emp_no to E_no;
SELECT * FROM Employee;

ALTER TABLE Employee MODIFY COLUMN Job_id VARCHAR(20);
SELECT * FROM Employee;
