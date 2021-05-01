package com.company;

public class Course {

    int id;
    private String courseName;
    private String time;

    public Course() {

    }

    public Course(int id, String courseName, String time) {
        this.id = id;
        this.courseName = courseName;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
