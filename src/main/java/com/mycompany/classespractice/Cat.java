/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classespractice;

/**
 *
 * @author haramerik
 */
public class Cat extends Animal {
    
    public Cat(String name){
        super(name);
    }
    @Override
    public void SayHi() {
        System.out.println("Meow, "+ IntroduceYourSelf());
    }
    
}
