package com.company;

public class CourseManager {
    public void  add(Course course){
        System.out.println(course.getTime() +"lık" +" " + course.getCourseName() + " adlı ders eklendi. " );

    }

    public void begin(Course course){

        System.out.println(course.getCourseName() + " adlı ders başladı.");

    }

    public void finish(Course course){

        System.out.println(course.getCourseName() + " adlı ders bitti. Teşekkür Ederiz.");

    }



}
