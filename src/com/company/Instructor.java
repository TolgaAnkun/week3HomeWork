package com.company;

public class Instructor extends User{

    private String bio;
    private String image;

    public Instructor() {

    }

    public Instructor(String bio, String image) {
        this.bio = bio;
        this.image = image;
    }

    public String getBio() {
        return bio;
    }



    public String getImage() {
        return image;
    }


}
