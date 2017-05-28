package java;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by MINHHOANG-PC on 28/05/2017.
 */

public class ClassroomStudent {
    private int ClassroomStudent_id;

    private Classroom classroom_id;
    private Student student_id;

    public int getClassroomStudent_id() {
        return ClassroomStudent_id;
    }

    public void setClassroomStudent_id(int classroomStudent_id) {
        ClassroomStudent_id = classroomStudent_id;
    }


    public Classroom getClassroom_id() {
        return classroom_id;
    }

    public void setClassroom_id(Classroom classroom_id) {
        this.classroom_id = classroom_id;
    }

    public Student getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Student student_id) {
        this.student_id = student_id;
    }

    public ClassroomStudent(int classroomStudent_id) {
        ClassroomStudent_id = classroomStudent_id;
    }
}
