## Database -2

1. create database 
2. tables, insert data , where 
3. and or , wildcard[like ]


## constraints 
rules for db tables 

NOT NULL 
UNIQUE 
primary 


1. Japan = 5K
2. Japan = 2K
3. Toronto = 3K
4. Toronto = 4K 
5. Toronto = 3K
6. India = 2K
7. India = 3k



==============================
JOINS 
==============================


show tables;

select * from EMPLOYEE;
select * from SALARY;
-- inner join
select e.EMPLOYEE_NAME, e.EMPLOYEE_ADDRESS, s.EMPLOYEE_SALARY
from EMPLOYEE e
inner join
SALARY s
ON
e.EMPLOYEE_ID = s.EMPLOYEE_ID;


select e.EMPLOYEE_ID, e.EMPLOYEE_NAME, e.EMPLOYEE_ADDRESS, s.EMPLOYEE_SALARY
from EMPLOYEE e
left join
SALARY s
ON
e.EMPLOYEE_ID = s.EMPLOYEE_ID;


-- right join

-- find the average salary of employees based on EMPLOYEE_GENDER ?
-- avg
select  EMPLOYEE_ADDRESS, sum(EMPLOYEE_SALARY) as avg_salary from EMPLOYEE
group by EMPLOYEE_ADDRESS;



-- Stored Procedures
-- ?

-- procedure
create PROCEDURE get_salary()
select * from SALARY;


call get_salary();

-- find the second max salary from salary table?
select * from SALARY;


select max(EMPLOYEE_SALARY) from SALARY
where EMPLOYEE_SALARY < (select max(EMPLOYEE_SALARY) from SALARY);

--  find max salary, second max salary
-- joins 



===================================

show tables;
select * from EMPLOYEE;

create table person (
id int NOT NULL,
firstName varchar(255) NOT NULL,
lastName varchar(255) NOT NULL,
email varchar(255) NOT NULL,
course varchar(255) NOT NULL,
phoneNumber varchar(255) ,
age int
check(age > 18)
);

-- insert into this table
insert into person values (101, 'Prabhleen', 'Kaur', 'prabhleenkaur@gmail.com', 'Software Engineering', '456-897-6789');
INSERT INTO person VALUES(001,"Arman","Rohaj","arman.rohaj3@gmail.com","Web Development","456-897-6789");
insert into person values(101,"sonu","Yadav","sonu@gmail.com","Full Stack",NULL);
insert into person values(10001,"Surinder","Yadav","sonu@gmail.com","Java","12133", 19);

select * from person;


-- constraint for phone number

alter table person
modify column phoneNumber varchar(255) NOT NULL UNIQUE;

drop table person;


-- check constraint ?
-- condition
-- modify the table and add a column age,
-- NOT NULL, age should be greater 18


-- check(age > 18)

alter table person add column age int NOT NULL check(age>18);



--  Primary key , foreign key
-- UNIQUE key, not null , 1 primary key

create table Students(
id int,
firstName varchar(255),
age int,
primary key(id),
primary key(age)

);

select * from Students;
insert into Students values (456, 'Prabhleen', 15);
insert into Students values (NULL, 'Prabhleen', 15);


-- primary key ===== unique

create table Employee(
id int,
firstName varchar(255),
salary int
);

insert into Employee values(101,"Sonu",120382);
insert into Employee values(101,"Sonu",120382);
insert into Employee values(101,"Sonu",120382);
drop table Employee;

select * from Employee;
-- insert query
-- add id as primary

alter table Employee
add primary key (id);


-- Foreign key





-- JOINS
-- types of joins
-- 1. inner join
-- 2. left join 3. right join 4. full join 5. self join 

































