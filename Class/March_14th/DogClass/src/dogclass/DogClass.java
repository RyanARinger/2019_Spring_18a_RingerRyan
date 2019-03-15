/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogclass;

/**
 *
 * @author ncc
 */
public class DogClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog Lucky = new Dog();
        Lucky.iDog("Lucky");
        Lucky.bark();
        
        System.out.println();
        
        Dog tripod = new Dog();
        tripod.iDog("Tripod", 3);
        tripod.bark();
    }
    
}