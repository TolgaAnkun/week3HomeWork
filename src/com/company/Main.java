package com.company;

public class Main {


    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("Tolga");
        student.setLastName("ANKUN");


        Instructor instructor = new Instructor();
        instructor.setFirstName("Engin");
        instructor.setLastName("Demiroğ");


        Course course = new Course();
        course.setCourseName("Java");
        course.setTime("30 dakika");

        StudentManager studentManager = new StudentManager();
        studentManager.login(student);

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.login(instructor);

        CourseManager courseManager = new CourseManager();
        courseManager.add(course);
        courseManager.begin(course);
        courseManager.finish(course);


        studentManager.logout(student);
        instructorManager.logout(instructor);

      


    }
}
