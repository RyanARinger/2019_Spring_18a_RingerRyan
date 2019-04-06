/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaddis_6thed_6.pkg2_carclass;

/**
 *
 * @author ringe
 */
public class Car {
    Integer speed;
    Integer model;
    String make;
    
    // Constructors
    public Car(){
	this.speed = 0;
	this.model = 6969;
	this.make = "The Bean Mobile";
    }
    public Car(String m, Integer n){
	this.make = m;
	this.model = n;
	this.speed = 0;
    }
    
    // Mutators
    public void setSpeed(Integer s){
	this.speed = s;
    }
    public void setModel(Integer m){
	this.model = m;
    }
    public void setMake(String m){
	this.make = m;
    }
    
    // Accessors
    public Integer getSpeed(){
	return this.speed;
    }
    public Integer getModel(){
	return this.model;
    }
    public String getMake(){
	return make;
    }
    
    // member functions
    public void accelerate(){
	this.speed+=5;
    }
    public void brake(){
	this.speed-=5;
    }
}
