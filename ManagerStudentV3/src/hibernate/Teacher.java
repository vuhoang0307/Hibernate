package hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by MINHHOANG-PC on 28/05/2017.
 */

public class Teacher {
    private int teacher_id;
    private String email;
    private String password;
    private String fname;
    private String lname;
    private Date dob;
    private String phone;
    private String mobile;
    private String date_of_join;
    private boolean status;
    private Date last_login_date;
    private String last_login_ip;



    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDate_of_join() {
        return date_of_join;
    }

    public void setDate_of_join(String date_of_join) {
        this.date_of_join = date_of_join;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getLast_login_date() {
        return last_login_date;
    }

    public void setLast_login_date(Date last_login_date) {
        this.last_login_date = last_login_date;
    }

    public String getLast_login_ip() {
        return last_login_ip;
    }

    public void setLast_login_ip(String last_login_ip) {
        this.last_login_ip = last_login_ip;
    }

    public Teacher(int teacher_id, String email, String password, String fname, String lname, Date dob, String phone, String mobile, String date_of_join, boolean status, Date last_login_date, String last_login_ip) {
        this.teacher_id = teacher_id;
        this.email = email;
        this.password = password;
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.phone = phone;
        this.mobile = mobile;
        this.date_of_join = date_of_join;
        this.status = status;
        this.last_login_date = last_login_date;
        this.last_login_ip = last_login_ip;
    }
}
