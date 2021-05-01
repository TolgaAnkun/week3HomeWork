package com.company;

public class InstructorManager extends UserManager{
    @Override
    public  void login(User user){

        System.out.println(user.getFirstName()+ " " +"adlı Eğitmen giriş yaptı.");
    }


    public  void logout(User user){

        System.out.println(user.getFirstName()+ " " +" adlı Eğitmen çıkış yaptı.");
    }




    public void editBio(){
        System.out.println( "Eğitmen bio oluşturuldu. ");


    }

    @Override
    public void enter() {
        System.out.println("Instructor giriş yaptı");
    }
}
