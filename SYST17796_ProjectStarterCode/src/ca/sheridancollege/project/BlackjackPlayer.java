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

    private Deck deck;

    public BlackjackPlayer(String name) {
        super(name);
    }

    @Override
    public void play() {
      
    }
    
    @Override
    public boolean hitOrStay(){
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to hit or stay?");
        String reply = input.next();
        if (reply.equalsIgnoreCase("Hit")){
//            super.getHand().addCard(deck.drawCard());
              return true; 
        }
        else {
//            super.getHand().checkTotal();
             return false;
        }
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
