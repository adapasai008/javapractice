
--To featch the 3rd highest salary
--(limit 2,1) here it will skip the first and second record and featch the 1 recored record
--it's means 3rd record
select DISTINCT salary FROM employee ORDER BY salary desc limit 2,1;

--To Featch the Nth highest salary above query will featch only the salary value if I wantes to print the 
--required emp details we shoudl use the DENSE_RANK()
select emp_id, emp_name, salary, salary_ranck from(
select emp_id, emp_name, salary, DENSE_RANK() OVER (order by salary desc) as salary_ranck from employee
)result
where result.salary_ranck = 2;

--To Featch the 5th highest salary from the employee table -> Q31
select distinct salary from employee order by salary desc limit 4,1;

select emp_id, emp_name, salary, salary_rank from(
select emp_id, emp_name, salary,dense_rank() over (order by salary desc)
as salary_rank from employee	
)result
where result.salary_rank = 5;

--33 SQL query for sorting, pagination and filter in single query.
select * from employee where emp_dep = 'IT' and salary >= 50000 order by salary desc limit 5;

--33 SQL query for JOIN, sorting, pagination and filter in single query.
select * from employee e join department d on d.dept_id = e.dept_id where d.dept_name = 'IT' and e.salary >= 50000 order by e.salary desc limit 2;

--34 RESTAPI URI for sorting, pagination and filter in the single URI
--GET /employees?department=IT&minSalary=50000&sortBy=salary&sortOrder=desc&page=0&size=5

--40 SQL query to update the email of a user with the help of user_id
update employee set email = 'ravi102@gmail.com' where emp_id = 102;

--41 SQL query to get all transactions 
SELECT *
FROM transactions
WHERE transaction_date >= '2026-10-12'
  AND transaction_date <  '2026-10-13';
  
 --42 SQL query for inner join
 select e.emp_id, e.emp_name, d.dept_name from employee e inner join department d on e.dept_id = d.dept_id;
 
 

