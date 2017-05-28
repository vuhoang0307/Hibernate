package java;

import javax.persistence.*;

/**
 * Created by MINHHOANG-PC on 27/05/2017.
 */


public class Classroom {
    private int classroom_id;
    private int year;
    private String section;
    private boolean status;
    private String remarks;

    private Teacher teacher_id;
    private Grade grade_id;



    public int getClassroom_id() {
        return classroom_id;
    }

    public void setClassroom_id(int classroom_id) {
        this.classroom_id = classroom_id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }



    public Teacher getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(Teacher teacher_id) {
        this.teacher_id = teacher_id;
    }

    public Grade getGrade_id() {
        return grade_id;
    }

    public void setGrade_id(Grade grade_id) {
        this.grade_id = grade_id;
    }

    public Classroom(int classroom_id, int year, String section, boolean status, String remarks) {
        this.classroom_id = classroom_id;
        this.year = year;
        this.section = section;
        this.status = status;
        this.remarks = remarks;
    }


}
