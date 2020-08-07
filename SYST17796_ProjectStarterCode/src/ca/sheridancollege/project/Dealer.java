/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author jasleen
 */
public class Dealer {
    
    private Hand hand = new Hand(2);
    private Deck deck;
    public boolean checkValue(){
       if (hand.checkTotal() == 21){
           return true;
       }
       else {
           return false;
       }
    }
    
    public void dealerTurn(){
        if (hand.checkTotal() <= 16){
            hand.addCard(deck.drawCard());
        }
        else if (hand.checkTotal() > 21){
            System.out.println("Dealer bust.");
        }
        
    }
}

