/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclasschallenge;

/**
 *
 * @author ncc
 */
public class Conversion {
    
    
    public Double kiloM(Double m){
        return m/1000.0;
    }
    
    public Double feet(Double m){
        return m*3.28;
    }
    
    public Double inches(Double m){
        Double feet = this.feet(m);
        return feet*12;
    }
    
}
