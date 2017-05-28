package java;

import javax.persistence.*;

/**
 * Created by MINHHOANG-PC on 28/05/2017.
 */

public class ExamResult {
    private int exam_result_id;
    private String marks;

    private Exam exam_id;
    private Student student_id;
    private Course course_id;


    public int getExam_result_id() {
        return exam_result_id;
    }

    public void setExam_result_id(int exam_result_id) {
        this.exam_result_id = exam_result_id;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }


    public Exam getExam_id() {
        return exam_id;
    }

    public void setExam_id(Exam exam_id) {
        this.exam_id = exam_id;
    }

    public Student getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Student student_id) {
        this.student_id = student_id;
    }

    public Course getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Course course_id) {
        this.course_id = course_id;
    }

    public ExamResult(int exam_result_id, String marks) {
        this.exam_result_id = exam_result_id;
        this.marks = marks;
    }
}
