
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
