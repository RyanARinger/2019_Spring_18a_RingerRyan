/* 
 * Author: Ryan Ringer
 * Created on: April 26th, 2019
 * File: deckofcardsv2
 * Purpose: creating a deck of cards
 */

package deckofcardsv2;

public class DeckOfCardsV2 {

    public static void main(String[] args) {
        // Seed random number or initialize scanner


        // Constant Variables
        final int DSIZE = 52;
        final int SSIZE = 13;
        final int NSUITS = 4;

        // Declare all Variables Here
        String suits[] = {"Sp", "Cl", "He", "Di"}; // Array to hold suits of deck of cards
        Card deck[]; // the deck (duh)
        String crntVal;
        int cSuit = 0;
        
        // Input or initialize values Here
        deck = new Card[DSIZE];
        
        for(int j = 0; j<NSUITS; j++){
            for (int i = 0; i < SSIZE; i++) {
                
                switch(i%SSIZE+2){
                    case 11:
                        crntVal = "Jack";
                        break;
                    case 12:
                        crntVal = "Queen";
                        break;
                    case 13:
                        crntVal = "King";
                        break;
                    case 14:
                        crntVal = "Ace";
                        break;
                    default:
                        crntVal = String.format("%d", (i%SSIZE+2));
                }
                    
                
                //if(i%SSIZE+2 == 11){
                //    crntVal = "Jack";
                //}
                //else if(i%SSIZE+2 == 12){
                //    crntVal = "Queen";
                //}
                //else if(i%SSIZE+2 == 13){
                //    crntVal = "King";
                //}
                //else if(i%SSIZE+2 == 14){
                //    crntVal = "Ace";
                //}
                //else{
                //    crntVal = String.format("%d", (i%SSIZE+2));
                //}
                
                deck[i+(j*SSIZE)] = new Card(crntVal, suits[j]);
            }
            
        }
        // Process/Calculations Here


        // Output Located Here
        for (int i = 0; i < DSIZE; i++) {
            System.out.println(deck[i].fValue + "->" + deck[i].suit);
        }

        // Exit
    }

}
