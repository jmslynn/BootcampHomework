create PROCEDURE emp_duration(
  IN emp_no_in int(10),
  IN date_from_in date,
  OUT years_worked_category varchar(20)
) BEGIN declare years_worked int
SET
  years_worked = YEAR(NOW()) - YEAR(date_from_in);
IF years_worked > 15 THEN
SET
  years_worked_category = 'oldtimer'
END IF
End;
-- I'm having trouble doing math with dates. I ran into this trouble a couple weeks ago as well.