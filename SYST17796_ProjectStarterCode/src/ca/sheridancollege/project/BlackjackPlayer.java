/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 *
 * @author jasleen
 */
public class BlackjackPlayer extends Player{


    public BlackjackPlayer(String name) {
        super(name);
    }

    @Override
    public void play() {
      
    }
    
<<<<<<< HEAD
    @Override
    public boolean hitOrStay(){
=======
    public boolean hitOrStay(){
        boolean hit = false;
>>>>>>> 12ce080191f0ca7d13a4f1b2b0fdf2aeb1b96439
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to hit or stay?");
        String reply = input.next();
        if (reply.equalsIgnoreCase("Hit")){
<<<<<<< HEAD
//            super.getHand().addCard(deck.drawCard());
              return true; 
        }
        else {
//            super.getHand().checkTotal();
             return false;
=======
            hit = true;
        }
        else if (reply.equalsIgnoreCase("Stay")){
            hit = false;
>>>>>>> 12ce080191f0ca7d13a4f1b2b0fdf2aeb1b96439
        }
        return hit;
    }
        
    public void checkBust() {
        if (super.getHand().checkTotal() > 21) {
            System.out.println("Player has been busted, he is no longer in this round."); 
        } 
    }
    
    public void checkBlackjack(){
        if (super.getHand().checkTotal() == 21){
            System.out.println("Blackjack");
        }
    }
}
