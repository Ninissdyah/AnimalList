package com.example.animallist;

public class Animal {
    String name;
    String gender;
    String desc;

    public Animal(String name, String gender, String desc) {
        this.name = name;
        this.gender = gender;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return gender;
    }

    public void setColor(String color) {
        this.gender = gender;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
