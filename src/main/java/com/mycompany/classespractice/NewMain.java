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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal george = new Animal("George");
        george.SayHi();
        
        Animal amy = new Animal("Amy");
        amy.SayHi();
        
        Animal wolfie = new Dog("Wolfie");
        wolfie.SayHi();
        
        Animal plori = new Cat("Plori");
        plori.SayHi();
        
              
    }
    
}
