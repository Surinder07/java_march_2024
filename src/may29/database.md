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

====
part 2 

-- LIMIT
select * from EMPLOYEE limit 5;

-- order by asc
select * from EMPLOYEE order by EMPLOYEE_NAME;

-- order by dsc
select * from EMPLOYEE order by EMPLOYEE_NAME DESC;


-- fetch records
-- wildcards LIKE % , _

select * from EMPLOYEE where EMPLOYEE_ADDRESS like 'C%';


select * from EMPLOYEE where EMPLOYEE_ADDRESS like 'Ind_a';

-- find all the employees who are from Japan and Name starts with J

-- AND OR NOT
select * from EMPLOYEE where EMPLOYEE_NAME like 'J%' AND EMPLOYEE_ADDRESS = 'Japan';

-- find all the employees who are from Japan OR Name starts with J
select * from EMPLOYEE where EMPLOYEE_NAME like 'J%' OR EMPLOYEE_ADDRESS = 'Japan';

-- NOT
select * from EMPLOYEE where NOT EMPLOYEE_ADDRESS = 'Japan';

--

show tables;
show databases;

create database pragra;
use pragra;

-- create table
create table student (student_id int, name varchar(50), email varchar(50));

-- insert data into this table
insert into student (student_id, name, email)
values
(101, 'Ankita', 'abc@gmail.com');

select * from student;

-- 5 mins,
-- create table with your name and insert two records.
-- id name email, course 

[
 ## STEPS 

-- first
-- create database
create database database_name;
use database_name;

-- create table
create table table_name(column1, column2....)

show tables;
-- insert the data
insert into table_name(column1, column2....)
values (101, 'something'...)
]

-- 3 questions [interview ]
1. joins 
2. find second hightest salary 
3. group by , having ... 

--- functions 


show databases;
use Employee;

show tables;
select * from EMPLOYEE;

-- max salary
select max(EMPLOYEE_SALARY) from EMPLOYEE;

-- min
select min(EMPLOYEE_SALARY) from EMPLOYEE;

-- how many employees with salary greater than 50K

select count(EMPLOYEE_SALARY)
from EMPLOYEE
where
EMPLOYEE_SALARy > 50000;


-- find the total employees who either from Toronto or salary greater than 40K.


