Use july2022;
show tables;
Create table department(
	dept_id varchar(5),
    dept_name varchar(40),
    dept_location varchar(40)
);
Alter table employee add salary integer;
Alter table employee add Desig varchar(3);
select * from employee;
describe employee;
insert into department (dept_id, dept_name, dept_location)
values ( 'TRN', 'TRAINING', 'CHENNAI'),
 ( 'FN', 'FINANCE', 'MUMBAI'),
  ( 'Adm', 'Admin', 'CHENNAI');
  
select * from department;

select emp_id , salary from employee where salary < 20000;
select emp_id as 'Employee id' , Salary as ' Monthly Salary'  from employee;
select emp_id  'Employee id' , Salary  ' Monthly Salary'  from employee;
select emp_id  'Employee id' , Salary  ' Monthly Salary',
		salary * 12 'Annual Salary' ,
        salary + 3000 'total with bonus' from employee;
        
select emp_id  'Employee id' , Salary  ' Monthly Salary',
		salary * 12 'Annual Salary' ,
        salary + 3000 'total with bonus' from employee where desig = 'PGM';
        
        -- find the unique designations of employee
select emp_id, desig from employee;
select  distinct desig from employee;

-- find the employees whose manager id is 125
select emp_id, emp_name, emp_manager_id, emp_dept, desig from employee where emp_manager_id = 125;

-- find employees whose salary greater than equal 25000
select emp_id , salary from employee where salary >= 25000;

-- find employees whose salary not equal to 40000
select emp_id , salary from employee where salary <> 40000;

-- check the salary between 40000 and 8000
select emp_id , salary from employee where salary between 8000 and 40000 
	order by salary asc;

-- check the salary not between 40000 and 8000
select emp_id , salary from employee where salary not between 8000 and 40000 
	order by salary asc;    
select * from employee;  
-- select employeees whose salary is greater than 8000 and design pgm
select * from employee where salary >8000 and desig = 'pgm';
-- find employees who joined in the year 2022 or desig is spv
select * from employee where year(emp_DOJ)=2022  or desig = 'spv';

-- select employeees whose salary is not greater than 8000 and not design mgr
select * from employee where salary <=8000 and desig <> 'mgr';
select * from employee where  not salary > 8000 and not desig = 'mgr';

-- Like operator
-- select employees whose name starts with a
select * from employee where emp_name Like 'a%';
-- select employees whose name ends with n
select * from employee where emp_name Like '%n';
 -- select employees whose second letter is u 
 select * from employee where emp_name Like '_u%';
 
 -- select employees whose middle letter is u and contains only 5 letters
 select * from employee where emp_name like '_u___';
 -- select employees whose last but previous (second letter is a)  
 select * from employee where emp_name Like '%a_';

-- select employees who has letter a any where in their name 
 select * from employee where emp_name Like '%a%';

-- select employees who has letter NO a any where in their name 
 select * from employee where emp_name NOT Like '%a%';
    
    
    -- select employees from admin depart and training department
select * from employee where emp_dept = 'Adm' or emp_dept='trn';
select * from employee where emp_dept in ('Adm','trn');
-- not in condition find employees who are not mgr or spv
select * from employee where desig not in ( 'mgr', 'spv' );

select * from employee where emp_manager_id is null;
select * from employee where emp_manager_id is not null;

-- amny trainees are there, there are many batches ,
-- the how many trainees are in each batch.
-- table Trainee( tid, tname, batchNumber)
-- 1. how many trainees are there , count the number of rows
select count(tid) from trainee;
select count(tid), batchNumber from trainee group by batchNumber;

--- 2. find the batchNumber where the count of trainees is greater than 30.
select batchNumber, count(tid) from trainee 
		group by batchNumber 
        having count(tid) > 30;
	
--  EMPLOYEES  AGGREGATE FUNCTION
select * from employee;
select min(salary), max(salary), avg(salary), sum(salary) from employee;
select count(*) from employee;
select count(emp_id) from employee;
select count(emp_manager_id) from employee;
select count(distinct emp_manager_id) from employee;

-- group by
-- find the salary based on department;
select emp_dept, sum(salary) from employee group by emp_dept;

-- find count of employee id based on their manager id
-- how many employees are working under each manager.
select emp_manager_id,  count(emp_id) from employee group by emp_manager_id;
-- find the average salary of employee under each manager.
select emp_manager_id, avg(salary), sum(salary), min(salary), max(salary)
	from employee group by emp_manager_id;
-- multiple grouping
 select emp_dept, desig, count(emp_id)   from employee 
		group by emp_dept, desig 
        order by emp_dept asc, desig desc ; 
        
	-- list the department where the employee count is greater than 2
select emp_dept, count(emp_id) from employee group by emp_dept 
	having count(emp_id) > 2;
    -- list the department where the  AVG SALARY IS GREATER THAN 10000
SELECT emp_dept, avg(salary) from employee 
		group by emp_dept having avg(salary) > 10000;
-- list the department where the  AVG SALARY IS GREATER THAN 10000 , 
-- also where the emp_leaveBal is greater 10;
select * from employee;
SELECT emp_dept, sum(salary) from employee  where emp_leaveBal >= 10
		group by emp_dept having sum(salary) > 40000 ;
        
select * from leavedetails;
Insert into leaveDetails(lev_No_of_days,lev_start_date,lev_end_date,
		lev_status,lev_applied,emp_id)
	value(1,'2022-03-10','2022-03-10','Applied',now(),501);
    
Insert into leaveDetails(lev_No_of_days,lev_start_date,lev_end_date,
		lev_status,lev_applied,emp_id)
	value(1,'2022-03-10','2022-03-10','Approved',now(),501);
   
Insert into leaveDetails(lev_No_of_days,lev_start_date,lev_end_date,
		lev_status,lev_applied,emp_id)
	value(2,'2022-03-13','2022-03-14','Approved',now(),500);
   -- CL, SL, EL
   -- Applied, Approved, Denied
Insert into leaveDetails(lev_No_of_days,lev_start_date,lev_end_date,
		lev_type,lev_status,lev_applied,emp_id)
	value
    (2,'2022-04-13','2022-04-14','CL', 'Applied',now(),500),
    (3,'2021-04-11','2021-04-13','CL', 'Approved',now(),501),
    (4,'2021-03-13','2022-03-16','EL', 'Denied',now(),502),
    (5,'2022-04-10','2022-04-14','CL', 'Applied',now(),501),
    (10,'2022-04-13','2022-04-22','CL', 'Denied',now(),502),
    (2,'2022-04-13','2022-04-14','CL', 'Applied',now(),125),
    (3,'2021-04-11','2021-04-13','SL', 'Approved',now(),125),
    (4,'2021-02-13','2022-02-16','EL', 'Applied',now(),140),
    (5,'2022-03-10','2022-03-14','SL', 'Applied',now(),140),
    (10,'2022-02-13','2022-02-22','CL', 'Denied',now(),100),
     (12,'2022-02-01','2022-02-011','SL', 'Approved',now(),140) ;
 describe leaveDetails;  
 
-- insert appropriate data and do the following.
-- find the count of employee who has taken lev_type as 'CL'
select count(emp_id) from leavedetails where lev_type = 'CL';
select count(emp_id) from leavedetails;
select count( distinct emp_id) from leavedetails where lev_type = 'CL';

--   find the count of employee id  taken each lev_type;
select lev_type, count(emp_id) from leavedetails group by lev_type  ;

-- find the total leave taken by each employee
select emp_id, sum(lev_No_of_days) from leavedetails group  by emp_id;

-- find the max number of leave taken by employee (lev_No_of_days),min
select emp_id, max(lev_no_of_days), min(lev_no_of_days) from leavedetails group by emp_id;

-- find the count of applied, approved, denied leave for each employee,
select emp_id , lev_status, count(lev_status) from leavedetails 
		group by lev_status, emp_id  order by emp_id; 

-- find the count of applied leave for each employee which is lesser than or equal to 1
select emp_id , lev_status, count(lev_status) from leavedetails 
		where lev_status = 'Applied'
		group by lev_status, emp_id
        having count(lev_status) <= 1
        order by emp_id ; 

-- find the sum of applied leave days for each employee 
 -- which is lesser than 4 in the year 2022.
 
select emp_id ,  sum(lev_No_of_days)   from leavedetails 
		where lev_status = 'Applied' and year(lev_start_date) = 2022
		group by   emp_id
        having sum(lev_No_of_days) <= 4
        order by emp_id ; 

-- STRING FUNCTIONS
select  concat( emp_name, ' ' , emp_dept ) as empNDept from employee;

select lower( concat( emp_name, ' ' , emp_dept ) ) as empNDept from employee;

select concat( 'Radha' , 'Chand' ) as name;
SELECT LEFT('abcdefgh', 5);
select right('abcdefg', 3);
select length (concat( 'Radha' , 'Chand' ) ) as name;
select length('abc');

SELECT LPAD('hi',4,'##');
select reverse('goodday');
SELECT REPLACE('www.mysql.com', 'w', 'ab');

SELECT SUBSTRING('abcdefghijk',5,3);
SELECT SUBSTRING('abcdefghijk',-5,3);
 
select instr('abcdefghi', 'z');

 select now(), sysdate(), curdate() as curdate, current_date(), 
					curtime(), current_time(), current_timestamp();
                    
 select emp_doj, year(emp_doj), month(emp_doj), day(emp_doj),
	monthname(emp_doj),dayname(emp_doj),dayofweek(emp_doj)
		from employee; 

-- calculate year of experience
select Round(( datediff(curdate(),emp_doj))/365)  as year, emp_doj from employee;

-- calculate the days
Insert into leaveDetails(lev_No_of_days,lev_start_date,lev_end_date,
		lev_type,lev_status,lev_applied,emp_id)
	value
    ( datediff('2022-05-17','2022-05-13'),
    '2022-05-13','2022-05-17','CL', 'Applied',now(),100);
   select * from leaveDetails;    
   
-- find employees who joined on wednesday
 select emp_id, emp_doj, year(emp_doj), month(emp_doj), day(emp_doj),
	monthname(emp_doj),dayname(emp_doj),dayofweek(emp_doj)
 from employee where dayofweek(emp_doj) = 4;

-- find the employee who joined on july
-- find the employee joined year 2022
-- how many employees joined each year
select year(emp_doj), count(emp_id) from employee group by year(emp_doj);

select * from employee;
-- find employee joined in july and october
select * from employee where month(emp_DOJ) in (7,10);
select * from employee where monthname(emp_doj) in ( 'July','October');

-- confirmation after 6 months
select emp_name, emp_doj, 
	date_add(emp_doj, interval 6  Month )  as confirmation from employee;
    
-- display -start , middle, end of the month if  date is < 5 , 5to 20, >20 respectively   
select emp_name, emp_doj, 
case
	WHEN day(emp_doj) > 20 THEN "End of the month" 
    WHEN day(emp_doj) between 5 and 20 THEN "MIDDLE of the month" 
    else 'Start of the month'
end  as datedisplay
from employee;
-- display the details designation.
select emp_name, desig,
case
	when desig='SPV' then 'Supervisor'
    when desig='MGR' then 'MANAGER'
    when desig='PGM' then 'PROGRAMMER'
end as Designation
from employee;

SELECT IF(5>2,'yes','no');
-- select employees whose leave balance is greater than 10 display as excellent in work,
-- else display can improve.

select emp_name, emp_leavebal, 
	if (emp_leavebal>=10, 'Excellent', 'Can Improve') as status
	from employee;
    
SELECT IFNULL(1,0);
SELECT IFNULL(null,5);
select emp_name,  emp_manager_id,
		ifnull(emp_manager_id, 'I am the boss') from employee 
        order by emp_manager_id asc;
        
SELECT NULLIF(1,1);  
SELECT NULLIF(1,2);     