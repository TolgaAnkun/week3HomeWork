package com.company;

public class StudentManager extends UserManager{


    public void editProfile(){

        System.out.println( "Kullanıcı profilini oluşturdu. ");


    }

    @Override
    public  void login(User user){

        System.out.println( user.getFirstName() +" " + "adlı Öğrenci giriş yaptı.");
    }


    public  void logout(User user){

        System.out.println( user.getFirstName() +" " + "adlı Öğrenci çıkış yaptı.");
    }

    @Override
    public void enter() {
        System.out.println("Student giriş yaptı.");
    }
}
