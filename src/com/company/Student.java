package com.company;

public class Student extends User{

   private String adress;
   private String phoneNumber;
   private String courses;

   public Student() {

   }

   public Student(int id, String email, String password, String firstName, String lastName, String adress, String phoneNumber, String courses) {
      super(id, email, password, firstName, lastName);
      this.adress = adress;
      this.phoneNumber = phoneNumber;
      this.courses = courses;
   }

   public String getAdress() {
      return adress;
   }

   public void setAdress(String adress) {
      this.adress = adress;
   }

   public String getPhoneNumber() {
      return phoneNumber;
   }

   public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
   }

   public String getCourses() {
      return courses;
   }

   public void setCourses(String courses) {
      this.courses = courses;
   }
}


