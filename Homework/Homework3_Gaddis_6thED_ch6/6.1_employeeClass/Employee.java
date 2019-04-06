/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ringe
 */
public class Employee {
    // Members
    String name;
    String id;
    String dept;
    String pos;
    
    // Constructors
    public Employee(){
	this.name = "";
	this.id = "";
	this.dept = "";
	this.pos= "";
    }
    public Employee(String n, String i, String d, String p){
	this.name = n;
	this.id = i;
	this.dept = d;
	this.pos = p;
    }
    public Employee(String n, String i){
	this.name = n;
	this.id = i;
	this.dept = "";
	this.pos = "";
    }
    
    // Mutators
    public void setName( String n ){
	name = n;
    }
    public void setId(String i){
	id = i;
    }
    public void setDept(String d){
	dept = d;
    }
    public void setPos(String p){
	pos = p;
    }
    
    // Accessors
    public String getName(){
	return name;
    }
    public String getId(){
	return id;
    }
    public String getDept(){
	return dept;
    }
    public String getPos(){
	return pos;
    }
}

