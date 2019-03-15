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
public class Dog {
    static final String KINGDOM = "Animalia";
    Integer nLegs;
    String name;
    public void bark(){
        System.out.println("Arf");
        System.out.println(name);
        System.out.println(KINGDOM);
    }
    
    public void iDog(String n, Integer l){
        this.name = n;
        this.nLegs = l;
    }
    
    public void iDog(String n){
        this.name = n;
        this.nLegs = 4;
    }
}