-- terminate employee
create PROCEDURE term_employee (
  first_name_in VARCHAR(14),
  last_name_in VARCHAR (16),
  birth_date_in DATE,
  last_day_in DATE,
  emp_no_in INT (10)
) BEGIN
UPDATE
  salaries
SET
  to_date = last_day_in
WHERE
  emp_no = emp_no_in;
update
  titles
SET
  to_date = last_day_in
WHERE
  emp_no = emp_no_in;
update
  dept_emp
SET
  to_date = last_day_in
WHERE
  emp_no = emp_no_in;
END