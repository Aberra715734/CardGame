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
public class Dealer extends Player {
   public Dealer(){
       super("Dealer");
   }
   @Override public void play(){}
   @Override public boolean checkBlackjack(){
       if(getHand().checkTotal() == 21)
           return true;
       else 
           return false;
   }
   @Override public boolean checkBust(){
       if(getHand().checkTotal() > 21)
           return true;
       else 
           return false;
   }
   @Override public boolean hitOrStay(){
       if(getHand().checkTotal() <= 17)
       {
           return true; //dealer hits
       }
       else//total is 17 or above
           return false;//dealer stays
   }
    /*
    private Hand hand = new Hand();
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
            hand.showCards().add(deck.drawCard());
        }
        else if (hand.checkTotal() > 21){
            System.out.println("Dealer bust.");
        }
        
    }
*/
}

