Create table classroom(
    classroom_id SERIAL primary key,
    year date,
    grade_id int,
    section char(2),
    status boolean,
    remarks varchar(45),
    teacher_id int
    )
Create table grade(
    grade_id SERIAL primary key,
    name varchar(45),
    grade_desc varchar(45)
    )
 Create table course(
     course_id SERIAL primary key,
     name varchar(45),
     description varchar(45),
     grade_id int
     )
 Create table classroom_student(
     classroom_id SERIAL,
     student_id SERIAL,
     PRIMART KEY(classroom_id, student_id)
     )
 create table attendance(
 	attendance_id SERIAL PRIMARY KEY,
     date date,
    student_id int,
     status boolean,
     remark text
     )
  Create table exam_type(
      exam_type_id S primary key,
      name varchar(45),
      exam_type_desc varchar(45)
      )
      
   create table exam(
       exam_id int primary key,
       exam_type_id int unique,
    	name varchar(45),
       start_date date
       )
       
       
    create table exam_result(
        exam_id int,
        student_id int,
        course_id int,
        marks varchar(45)
        )
     create table student(
         student_id int primary key,
         email varchar(45),
         password varchar(45),
         fname varchar(45),
         lname varchar(45),
         dob date,
         phone varchar(15),
         mobile varchar(15),
         parent_id int,
         date_of_join date,
         status boolean,
         last_login_date date,
         last_login_ip varchar(45)
         )
         
    Create table parent(
        parent_id int primary key,
        email varchar(45),
        password varchar(45),
        fname varchar(45),
         lname varchar(45),
         dob date,
         phone varchar(15),
         mobile varchar(15),
         date_of_join date,
         status boolean,
         last_login_date date,
         last_login_ip varchar(45)
         )
         
      Create table teacher(
         teacher_id int primary key,
         email varchar(45),
        password varchar(45),
        fname varchar(45),
         lname varchar(45),
         dob date,
         phone varchar(15),
         mobile varchar(15),
         date_of_join date,
         status boolean,
         last_login_date date,
         last_login_ip varchar(45)
         )
		 
    alter table classroom add constraint fk foreign key(teacher_id) references teacher(teacher_id)
    alter table classroom add constraint fk1 foreign key(grade_id) references grade(grade_id)
    
    alter table course add constraint fk foreign key(grade_id) references grade(grade_id)
    
    alter table classroom_student add constraint fk foreign key(classroom_id) references classroom(classroom_id)
    alter table classroom_student add constraint fk1 foreign key(student_id) references student(student_id)
    
    alter table attendance add constraint fk foreign key(student_id) references student(student_id)
    
    alter table exam add constraint fk foreign key(exam_type_id) references exam_type(exam_type_id)
   
   
    alter table exam_result add constraint fk foreign key(exam_id) references exam(exam_id)
    alter table exam_result add constraint fk1 foreign key(student_id) references student(student_id)
    alter table exam_result add constraint fk2 foreign key(course_id) references course(course_id)
   
    alter table student add constraint fk foreign key(parent_id) references parent(parent_id)
    