package com.katrinaann.badt.models;

public class Model {

    private int image;
    private String title;
    private String desc;
    private int id;

    public Model(int image, String title, String desc, int id) {
        this.image = image;
        this.title = title;
        this.desc = desc;
        this.id = id;
    }

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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
