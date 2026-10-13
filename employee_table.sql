CREATE TABLE Employeees (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    gender VARCHAR(10),
    age INT,
    department VARCHAR(50),
    salary DECIMAL(10,2),
    city VARCHAR(50),
    joining_date DATE,
    manager_id INT
);

INSERT INTO Employeees VALUES
(101,'Arun','Male',25,'IT',45000,'Chennai','2023-01-10',201),
(102,'Priya','Female',28,'HR',35000,'Coimbatore','2022-05-18',202),
(103,'Karthik','Male',30,'Finance',50000,'Madurai','2021-03-15',203),
(104,'Divya','Female',27,'IT',48000,'Chennai','2023-06-20',201),
(105,'Rahul','Male',35,'Sales',55000,'Bangalore','2020-12-11',204),
(106,'Anitha','Female',26,'HR',36000,'Salem','2022-07-08',202),
(107,'Vijay','Male',29,'IT',60000,'Chennai','2021-09-09',201),
(108,'Sneha','Female',24,'Sales',32000,'Coimbatore','2024-01-05',204),
(109,'Manoj','Male',31,'Finance',62000,'Madurai','2020-11-18',203),
(110,'Keerthi','Female',29,'IT',58000,'Bangalore','2022-10-12',201);

CREATE TABLE Department (
    dept_id INT PRIMARY KEY,
    department VARCHAR(50),
    location VARCHAR(50)
);
INSERT INTO Department VALUES
(1,'IT','Chennai'),
(2,'HR','Coimbatore'),
(3,'Finance','Madurai'),
(4,'Sales','Bangalore'),
(5,'Testing','Hyderabad');

select *from employeees;
insert into employeees(emp_id,emp_name,salary)values(111,'shri',50000);
update employeees set salary =75000 where emp_id=101;
update employeees set salary =salary * 1.10 where department='IT';
update employeees set city='banglore'where city='chennai'and emp_id>0;
update employeees set department='human resources'where city='hr'and emp_id>0;
update employeees set manager_id=206 where emp_id=108;
update employeees set salary =80000 where salary>50000 and emp_id>0;

delete  from employeees where emp_id=110;
delete from employeees where department='HR';
delete from employeees where salary<35000 and emp_id>0;
delete from employeees where city='bangalore'and emp_id>0;
delete from employeees where age>30 and  emp_id>0;

select * from employeees order by age;
select * from employeees order by emp_name;

select city, count(*) from employeees group by  city;
select city,avg(salary) from employeees group by city;

select sum(salary) from employeees;
select upper(emp_name) from employeees;
select lower(emp_name)from employeees;

