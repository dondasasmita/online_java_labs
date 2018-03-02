package mysql.labs;

/**
 *
 * MySQL Exercise 2:
 *
 *      Using MySQLWorkbench,
 *
 *      1.) Create a new database "coding_school"
 *      2.) Create a new table "students" with the following fields:
 *          a. id (auto increment)
 *          b. first_name
 *          c. age
 *
 *      3.) Create a new table "teachers_students" with the following fields:
 *          a. id (auto increment)
 *          b. student_id
 *          c. teacher_id
 *
 *      4.) Create a new table "teachers" with the following fields:
 *          a. id (auto increment)
 *          b. first_name
 *          c. last_name
 *          d. subject
 *
 *      5.) Populate each table with at least 5 records.
 *
 *      6.) Write queries (and paste them below) for each of the following tasks:
 *
 *          a. select all students
 *          SELECT * FROM coding_school.students;
 *
 *          b. select all teacher how teach "Math" (choose a subject you included)
 *          SELECT first_name FROM coding_school.teachers WHERE subject = 'Math';
 *
 *          c. use a join query to select all students with a certain teacher
 *          SELECT coding_school.students.first_name, coding_school.teachers.first_name
 *          FROM coding_school
 *          INNER JOIN students ON coding_school.teachers_students.student_id = coding_school.students.id
 *
 *          d. use a join query to select all students with taking a certain subject
 *          SELECT coding_school.teachers.subject, coding_school.students.first_name
 *          FROM (coding_school.teachers INNER JOIN coding_school.teachers_students ON coding_school.teachers.id = coding_school.teachers_students.teacher_id)
 *          INNER JOIN coding_school.students ON (coding_school.students.id = coding_school.teachers_students.student_id);
 *
 *          e. update a record in the student table
 *          UPDATE coding_school.students SET age = 16 WHERE id = 1;
 *
 *          f. add a record to the teacher table
 *          INSERT INTO coding_school.teachers (first_name, last_name, subject) VALUES ('Emily' , 'Smith', 'History');
 *
 *
 *       7.) Export the schema to a dump file and copy it to this folder.
 */

