package java;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by MINHHOANG-PC on 28/05/2017.
 */

public class Exam {
    private int exam_id;
    private String name;
    private Date start_date;

    private ExamType exam_type_id;


    public int getExam_id() {
        return exam_id;
    }

    public void setExam_id(int exam_id) {
        this.exam_id = exam_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }


    public ExamType getExam_type_id() {
        return exam_type_id;
    }

    public void setExam_type_id(ExamType exam_type_id) {
        this.exam_type_id = exam_type_id;
    }

    public Exam(int exam_id, String name, Date start_date) {
        this.exam_id = exam_id;
        this.name = name;
        this.start_date = start_date;
    }
}
