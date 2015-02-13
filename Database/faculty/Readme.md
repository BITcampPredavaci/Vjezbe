This table contains the .sql file to create the tables we used today
and the seed.sql to fill the table with initial data.

You can also find the query.sql file which contains the queries we have writen.

<h3> Tasks </h3>
<ol>
<li> Add the foreign key constraints (on update, on delete) to all
the foreign key references. You should figure out which rule to use (cascade, set null or set default. Add a comment to explain why you used
 a particular rule </li>
<li> Write a query to list all the student names and surnames and the names
of the courses they have taken </li>
<li> Write a query to calculate the average grade for a single student
 (you can pick which one </li>
<li> Write a query to list student names, names of courses they have taken and
the names of the lectures who taught those courses.
For example:
Student Name | Lecturer Name | Course Name
John Pettruci  Cahrles Xavier Intro to Java
</li>
<li> Write a .sql to alter the student table to add a column for age </li>
<li> List all the students for a course code (CS101) ordered by their grade </li>
</ol>

<h5> Notes: </h5>
When creating the database don't forget pragma foreign_keys = on;
If you want to see headers .header on

