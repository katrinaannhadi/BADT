package com.katrinaann.badt.models;

public class Model {

    //Attributes
    private int image;
    private String title;
    private int id;
    private String user;

    //Constructor
    public Model(int image, String title, int id, String user) {
        this.image = image;
        this.title = title;
        this.id = id;
        this.user = user;
    }
    //Getters and Setters
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
