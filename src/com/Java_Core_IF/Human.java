package com.Java_Core_IF;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Human implements Comparable{
    private String name;
    private int age;
    private List<Pet> pets = new ArrayList<Pet>();

    public Human(String name,int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public void Sort(){
        // sort List pets by wegth
        Collections.sort(pets, (pet1,pet2) -> pet1.getWegth() - pet2.getWegth());
    }
    @Override
    public void PrintPets() {
        for (Pet pet : pets){
            System.out.println(pet.getName() + " is " + pet.getAge() + " years old. It wegths " + pet.getWegth() + " kg.");
        }
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public List getPets(){
        return pets;
    }

}
