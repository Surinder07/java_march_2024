## Database 

1. SQL , NOSQL 

mysql , mongoDB, Oracle....

SQL : structured query language 
CRUD operations 


###  Relational DB
data is stored tables... 
rows/columns 


Files... 

Files/papers/registers.... 
1. easily / no backup
2. Hard to handle 
3. searching was very difficult 
4. write/read  one at a time.. 

why relational database ? 

Normalization ? : 
process , which removes redundancy 
1n, 


Queries 


-- short to run , control + enter or command + enter [mac ]
show databases;

-- create a database
create database test;
drop database test;


-- database = Employee
-- table = EMPLOYEE , TITLES, DEPT_MANAGER, SALARY
use Employee;

show tables;

-- fetch all the records from EMPLOYEE table ?
select * from EMPLOYEE;

-- fetch only EMPLOYEE_NAME
select EMPLOYEE_NAME, EMPLOYEE_ADDRESS, EMPLOYEE_PHONE from EMPLOYEE;

-- fetch some distinct record
select distinct EMPLOYEE_ADDRESS from EMPLOYEE;

-- find all the employees from Japan
-- Where clause

select * from EMPLOYEE
where
EMPLOYEE_ADDRESS = 'Japan';




