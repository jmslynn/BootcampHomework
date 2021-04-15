-- annual cost of living adjustment
CREATE PROCEDURE annual_col_adj(col_adj_in DECIMAL (4, 3)) BEGIN
UPDATE
  salaries
SET
  salary = salary * col_adj_in
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
END