/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classespractice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author haramerik
 */
public class Owner extends Animal {

    private final List<Animal> my_animals = new ArrayList<>();

    public Owner(String name) {
        super(name);
    }

    public void adopt(Animal animal) {

        my_animals.add(animal);
    }
    
     @Override
    public void SayHi() {
        System.out.println("Hi, " + IntroduceYourSelf());
        for (int i = 0; i < my_animals.size(); i++) {
            Animal current_pet = my_animals.get(i);
            System.out.println("My pet: " + current_pet.IntroduceYourSelf());
        }
    }
    //public void print_animals(Animal)
}
