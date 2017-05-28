package hibernate;
import java.util.Date;

/**
 * Created by MINHHOANG-PC on 27/05/2017.
 */

public class Attendance {
    private int attendance_id;
    private boolean status;
    private String remake;
    private Date date;

    private Student student;

    public Attendance() {
    }


    public int getAttendance_id() {
        return attendance_id;
    }

    public void setAttendance_id(int attendance_id) {
        this.attendance_id = attendance_id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getRemake() {
        return remake;
    }

    public void setRemake(String remake) {
        this.remake = remake;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Attendance(int attendance_id, boolean status, String remake, Date date) {
        this.attendance_id = attendance_id;
        this.status = status;
        this.remake = remake;
        this.date = date;
    }



    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
