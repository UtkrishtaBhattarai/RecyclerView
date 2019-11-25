package com.example.recyclerview;

public class Contacts {

    public Contacts(String name, String phoneno, int imageID) {
        this.name = name;
        this.phoneno = phoneno;
        this.imageID = imageID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    private String name;
    private String phoneno;
    private int imageID;
}
