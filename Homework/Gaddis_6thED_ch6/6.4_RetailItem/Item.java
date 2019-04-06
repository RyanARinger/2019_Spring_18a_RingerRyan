/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaddis_6thed_6.pkg4_retailitem;

/**
 *
 * @author ringe
 */
public class Item {
    String desc;
    Integer amt;
    Integer price;
    
    public Item(String d, Integer a, Integer p){
	this.desc = d;
	this.amt = a;
	this.price = p;
    }
    
    public void setDesc(String d){
	this.desc = d;
    }
    public void setAmt(Integer a){
	this.amt = a;
    }
    public void setPrice(Integer p){
	this.price = p;
    }
    
    public void print(){
	System.out.println("   " + this.desc + "   " + this.amt + "  $" + this.price);
    }
}
