CREATE PROCEDURE performance_adj(merit_raise_in decimal(4, 3)) BEGIN
UPDATE
  salaries If emp_no MOD 2 = 0
SET
  salary = salary * merit_raise_in
end if
WHERE
  to_date = '9999-01-01';
SELECT
  d.dept_name AS "Department",
  SUM(s.salary) AS "Total Salaries"
FROM
  salaries s
  INNER JOIN dept_emp de ON s.emp_no = de.emp_no
  INNER JOIN departments d ON d.dept_no = de.dept_no
  AND de.to_date = '9999-01-01'
GROUP BY
  d.dept_no;
END -- I suspect my if statement is misplaced but I can't find examples of how it should be stated and I'm out of time.