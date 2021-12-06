package com.Java_Core_IF;

public class Pet {
    private String name;
    private int age;
    private int wegth;
    private Human human;

    public Pet(String name,int age,int wegth){
        this.name = name;
        this.age = age;
        this.wegth = wegth;
    }

    public Pet(String name,int age,int wegth,Human human){
        this.name = name;
        this.age = age;
        this.wegth = wegth;
        this.human = human;
        human.getPets().add(this);
    }

    public void setAge(int age){
        this.age = age;
    }
    public void setWegth(int wegth){
        this.wegth = wegth;
    }
    public void setOnwer(Human human){
        this.human = human;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getWegth(){
        return wegth;
    }
    public Human getOnwer(){
        return human;
    }
}
