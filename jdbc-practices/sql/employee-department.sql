-- DepartmentDao:findAll
  select no, name
    from department
order by no desc;

-- EmployeeDao:findAll
  select no, name, department_no
    from employee
order by no desc;

-- EmployeeDao:delete()
delete from employee;

-- DepartmentDao:update
update department
   set name='솔류션개발'
 where no=3;