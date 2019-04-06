/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaddis_6thed_6.pkg3_personalclass;

/**
 *
 * @author ringe
 */
public class Person {
    String name;
    String address;
    Integer age;
    String phone;
    
    public Person(){
	this.name = "";
	this.address = "";
	this.age = 0;
	this.phone = "";
    }
    public Person(String n, String a, String p, Integer y){
	this.name = n;
	this.address = a;
	this.phone = p;
	this.age = y;
    }
    
    public void setName(String n){
	this.name = n;
    }
    public void setAddress(String a){
	this.address = a;
    }
    public void setPhone(String p){
	this.phone = p;
    }
    public void setAge(Integer a){
	this.age = a;
    }
    
    public String getName(){
	return this.name;
    }
    public String getAddy(){
	return this.address;
    }
    public String getPhone(){
	return this.phone;
    }
    public Integer getAge(){
	return this.age;
    }
}
