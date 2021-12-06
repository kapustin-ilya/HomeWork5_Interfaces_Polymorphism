package com.Java_Core_IF;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main implements Comparable{

    public static List<Pet> allPets = new ArrayList<Pet>();

    public static void main(String[] args) {
	// write your code here
        Human Derek = new Human("Derek",35);
        Human Lisa = new Human("Lisa",30);
        Pet murka = new Pet("Murka", 2 , 5, Derek);
        allPets.add(murka);
        Pet black = new Pet("Black", 4 , 7, Derek);
        allPets.add(black);
        Pet white = new Pet("White", 8, 6, Derek);
        allPets.add(white);
        Pet happy = new Pet("Happy", 3, 6, Lisa);
        allPets.add(happy);

        Derek.PrintPets();
        System.out.println();

        Derek.Sort();
        Derek.PrintPets();
        System.out.println();

        new Main().Sort();
        new Main().PrintPets();

    }
    @Override
    public void Sort () {
        // sort allPets by age
        Collections.sort(allPets, (pet1, pet2) -> pet1.getAge() - pet2.getAge());
    }
    @Override
    public void PrintPets() {
        for (Pet pet : allPets){
            System.out.println(pet.getName() + " is " + pet.getAge() + " years old. It wegths " + pet.getWegth() + " kg. Onwer is " + pet.getOnwer().getName() + ".");
        }
    }
}
