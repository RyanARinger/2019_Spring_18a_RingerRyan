
package deckofcardsv2;


public class Card {
    
    public String fValue;
    public String suit;
    
    public Card(){
        this.fValue = null;
        this.suit = null;
    }
    
    public Card(String s1, String s2){
        this.fValue = s1;
        this.suit = s2;
    }
    
    public void setFValue(String s){
        this.fValue = s;
    }
    
    public void setSuit(String s){
        this.suit = s;
    }
    
    public String getFValue(){
        return this.fValue;
    }
    
    public String getSuit(){
        return this.suit;
    }
}
