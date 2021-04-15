-- new employee onboarding
CREATE PROCEDURE add_new_emp (
  emp_no_in INT(10),
  first_name_in VARCHAR(14),
  last_name_in VARCHAR(16),
  gender_in ENUM('M', 'F'),
  birth_date_in date,
  hire_date_in DATE,
  dept_no_in char(4),
  title_in varchar(50),
  salary_in INT
) BEGIN
INSERT INTO
  employees(
    emp_no,
    birth_date,
    first_name,
    last_name,
    gender,
    hire_date
  )
VALUES
  (
    emp_no_in,
    birth_date_in,
    first_name_in,
    last_name_in,
    gender_in,
    hire_date_in
  );
INSERT INTO
  salaries(emp_no, salary, from_date, to_date)
VALUES
  (
    emp_no_in,
    salary_in,
    hire_date_in,
    '9999-01-01'
  );
INSERT INTO
  titles(emp_no, title, from_date, to_date)
VALUES
  (
    emp_no_in,
    title_in,
    hire_date_in,
    '9999-01-01'
  );
INSERT INTO
  dept_emp(emp_no, dept_no, from_date, to_date)
VALUES
  (
    emp_no_in,
    dept_no_in,
    hire_date_in,
    '9999-01-01'
  );
END -- call procedure
CALL add_new_emp (
  213,
  'Mimosa',
  'Jones',
  'F',
  '1999-04-23',
  '2017-04-04',
  'd001',
  'Queen, Ununited Kindom',
  47000
);