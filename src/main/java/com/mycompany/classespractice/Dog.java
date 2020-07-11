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
public class Dog extends Animal {
    
    public Dog(String name) {
        super(name);
    }

    @Override
    public void SayHi() {
        System.out.println("Woof, my name is " + m_name);
    }
    
    
}
