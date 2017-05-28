package java;

import javax.persistence.*;

/**
 * Created by MINHHOANG-PC on 28/05/2017.
 */

public class ExamType {
    private int exam_type_id;
    private String name;
    private String exam_type_desc;


    public int getExam_type_id() {
        return exam_type_id;
    }

    public void setExam_type_id(int exam_type_id) {
        this.exam_type_id = exam_type_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExam_type_desc() {
        return exam_type_desc;
    }

    public void setExam_type_desc(String exam_type_desc) {
        this.exam_type_desc = exam_type_desc;
    }

    public ExamType(int exam_type_id, String name, String exam_type_desc) {
        this.exam_type_id = exam_type_id;
        this.name = name;
        this.exam_type_desc = exam_type_desc;
    }
}
