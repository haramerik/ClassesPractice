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
public class Animal {
    
    protected  final String m_name;
    
    public Animal(String name) {
        m_name = name;
    }
    
    public void SayHi() {
        System.out.println("Hi, " + IntroduceYourSelf());
    }
    
    protected String IntroduceYourSelf() {
        return "my name is " + m_name;
    }
}
