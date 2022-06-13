package com.example.fpbarbon;

public class Employees {
    private String id, name, date, position,image;
    public Employees(){

    }
    public Employees(String id, String name, String date, String position) {
        this.id = id;
        this.name = name;
        this.date= date;
        this.position = position;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date= date;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }




}

