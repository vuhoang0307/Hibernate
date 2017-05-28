/**
 * Created by MINHHOANG-PC on 28/05/2017.
 */

public class Course {
    private int course_id;
    private String name;
    private String description;

    private Grade grade_id;



    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public Grade getGrade_id() {
        return grade_id;
    }

    public void setGrade_id(Grade grade_id) {
        this.grade_id = grade_id;
    }

    public Course(int course_id, String name, String description) {
        this.course_id = course_id;
        this.name = name;
        this.description = description;
    }
}
