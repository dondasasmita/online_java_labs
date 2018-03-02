SELECT coding_school.teachers.subject, coding_school.students.first_name
FROM (coding_school.teachers INNER JOIN coding_school.teachers_students ON coding_school.teachers.id = coding_school.teachers_students.teacher_id)
INNER JOIN coding_school.students ON (coding_school.students.id = coding_school.teachers_students.student_id);