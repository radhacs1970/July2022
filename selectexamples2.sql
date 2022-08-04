Use July2022;

select * from department;
select * from employee;
select * from leavedetails;

-- select all the employees whose leavebal is greater than anil
select * from employee where emp_leaveBal > 
		(select emp_leaveBal from employee where emp_name = 'anil' );
-- select all the employees whose designation is same as babu
select * from employee where desig =
	(select desig from employee where emp_name = 'babu');
    
-- select all the employees whose name has same as employeeid 503
select * from employee where emp_name = 
	(select emp_name from employee where emp_id = 503);
    
-- select all the employees whose designation is not same as employee id 504
select * from employee where desig <>
	(select desig from employee where emp_id=504);
select * from employee where desig NOT IN
	(select desig from employee where emp_id=504);
-- select all the employees whose department is not same as employee id 504
select * from employee where emp_dept <>
	( select emp_dept from employee where emp_id = 504);
    
--  select all the employees whose doj months  in same month as anil
select * from employee where Month(emp_doj) = 
	( select Month(emp_doj) from employee where emp_name = 'anil');
    
-- SELECT all the employeesid whose employeeid end with even number.
select emp_id, emp_name from employee where emp_id%2 =0;

-- list all the employees who joined in the month  where 
	-- it is same as anil and sunil..  
select * from employee where Month(emp_doj) IN 
	( select Month(emp_doj) from employee where emp_name = 'anil' or emp_name = 'sunil');
    -- select doj for the employees where the name is anil and sunil.
-- list all the employess details whose department is same aS EMPLOYEED 100 AND 502. 
select * from employee where emp_dept IN 
	(select emp_dept from employee where emp_id = 100 or emp_id = 502);
    
-- list all the employees whose department is same as murugan and salary greater than madhu
select * from employee where 
	emp_dept = ( select emp_dept from employee where emp_name = 'murugan') 
    and 
    salary > ( select salary from employee where emp_name = 'madhu');
    
	-- list all the employees whose salary is greater than avg salary
    select * from employee where salary >
			(select avg(salary) from employee);
    -- list all the employees by their manager_id
    select * from employee where salary > all
		(select  min(salary) from employee group by emp_manager_id);
	select * from employee where salary > any
		(select  min(salary) from employee group by emp_manager_id);
        
	 select * from employee where salary < all
		(select  min(salary) from employee group by emp_manager_id);
	
     select * from employee where salary < any
		(select  min(salary) from employee group by emp_manager_id);

--  apply the < and > with any and all and try it.
-- find all the employee leave greater than the average leave balance grouped by department.
-- select avg(emp_leaveBal) from employee group by emp_dept;
	select * from employee where emp_leaveBal > all 
		( select avg(emp_leaveBal) from employee group by emp_dept);
        
	select * from employee where emp_leaveBal > all 
		( select avg(emp_leaveBal) from employee group by emp_dept 
			having avg(emp_leaveBal) > 10 );
-- Correrelated Queries.
-- find the  employees who earn more than average salary in their department
select  o.emp_id, o.emp_name, o.salary, o.emp_dept from employee o 
	where salary > ( select avg(i.salary) from employee i where i.emp_dept = o.emp_dept);
-- find the employee whose leave balance is less than average leave bal in their designation
select o.emp_id, o.emp_name, o.emp_leaveBal, o.desig from employee o
	where o.emp_leaveBal < ( select avg(i.emp_leaveBal) from employee i where i.desig = o.desig);

-- JOINS
Insert into department  values('HR', 'Human resources','delhi');
Insert into employee(emp_id,emp_name,emp_mob,salary,desig)
		values(900,'goutham', 9898767, 8000,'PGM');
Insert into employee(emp_id,emp_name,emp_mob,salary,desig)
		values(901,'Ganesh', 78678, 8000,'PGM');


-- inner join
select e.emp_name, e.emp_mob, e.salary, e.desig, e.emp_dept, d.dept_name, d.dept_location
	from employee e, department d 
	where e.emp_dept = d.dept_id;
    
 select e.emp_name, e.emp_mob, e.salary, e.desig, e.emp_dept, d.dept_name, d.dept_location
	from employee e join department d  on e.emp_dept= d.dept_id;
    
    -- inner join employee and leave details
select e.emp_name, e.emp_mob, e.salary, e.desig, e.emp_dept, e.emp_leaveBal,
	l.lev_No_of_days,l.lev_start_date,l.lev_end_date,l.lev_type,l.lev_status
    from employee e join leavedetails l on e.emp_id = l.emp_id;
    
select e.emp_name, e.emp_mob, e.salary, e.desig, e.emp_dept, e.emp_leaveBal,
	l.lev_No_of_days,l.lev_start_date,l.lev_end_date,l.lev_type,l.lev_status
    from employee e , leavedetails l where  e.emp_id = l.emp_id;
    
 select e.emp_name, e.emp_mob, e.salary, e.desig, e.emp_dept, e.emp_leaveBal,
	l.lev_No_of_days,l.lev_start_date,l.lev_end_date,l.lev_type,l.lev_status
    from employee e join leavedetails l Using (emp_id);  
    
-- three tables join.
-- display emp_name, department name, lev_startdate, enddate, type
select e.emp_name, d.dept_name,l.lev_start_date,l.lev_end_date
	from employee e join department d on e.emp_dept = d.dept_id
    join leavedetails l on e.emp_id = l.emp_id;

-- inner join
-- only matched records from left and right table are displayed.
select e.emp_name, d.dept_name from 
	employee e 
	join department d on e.emp_dept = d.dept_id order by emp_name;
    
-- left outer join.
-- all records from left table and matched records from right table are displayed.
select e.emp_name, d.dept_name from 
	employee e 
	left join department d on e.emp_dept = d.dept_id order by emp_name;

-- right outer join.
--  matched records from left table and all the records from right table are displayed.
select e.emp_name, d.dept_name from 
	employee e 
	right join department d on e.emp_dept = d.dept_id;
    
-- self join
-- display the employee name and the name of his manager.
select w.emp_name, ' works for the manager ' , m.emp_name 
	from employee w join employee m on w.emp_manager_id = m.emp_id;
    
