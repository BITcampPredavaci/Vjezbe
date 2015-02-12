/* alias */
/* neki query pravo_ime_kolone AS zeljeno_ime */
select name as Ime, surname as Prezime, study_year as Godina 
from students
where Godina > 2;

/* count() */
select count(name) as BrojStudenata from students; 

/* avg() */
select avg(salary) as ProsjecnaPlata from lecturers;

/* sum() */
select sum(salary) as UkupnaPlata from lecturers;

/* multiple functions */
select sum(salary) as UkupnaPlata, avg(salary) as ProsjecnaPlata from lecturers;

select name, salary from lecturers order by salary DESC;

select max(salary) as Najveca, min(salary) as Najmanja from lecturers;

select max(name) as Najveca, min(name) as Najmanja from lecturers;

/* we want to print the course name and the lecturers name */
select courses.name as cn, lecturers.name as ln from courses
inner join course_taught on courses.code = course_taught.course_code
inner join lecturers on course_taught.lecturer_id = lecturers.id;

















