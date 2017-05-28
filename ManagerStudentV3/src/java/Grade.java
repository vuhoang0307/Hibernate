package java;

import javax.persistence.*;

/**
 * Created by MINHHOANG-PC on 28/05/2017.
 */

public class Grade {
    private int grade_id;
    private String name;
    private  String grade_desc;


    public int getGrade_id() {
        return grade_id;
    }

    public void setGrade_id(int grade_id) {
        this.grade_id = grade_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade_desc() {
        return grade_desc;
    }

    public void setGrade_desc(String grade_desc) {
        this.grade_desc = grade_desc;
    }

    public Grade(int grade_id, String name, String grade_desc) {
        this.grade_id = grade_id;
        this.name = name;
        this.grade_desc = grade_desc;
    }
}
