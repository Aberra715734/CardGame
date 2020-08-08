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
    private Hand hand;

    public BlackjackPlayer(String name) {
        super(name);
    }

    @Override
    public void play() {
      
    }
    
    public void hitOrStay(){
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to hit or stay?");
        String reply = input.next();
        if (reply.equalsIgnoreCase("Hit")){
            deck.getCard(0);
        }
        else if (reply.equalsIgnoreCase("Stay")){
            
        }
    }
        public void checkBust() {
        if (hand.checkTotal() > 21) {
            System.out.println("Player Bust");
        } 
    }
    
    public void checkBlackjack(){
        if (hand.checkTotal() == 21){
            System.out.println("Blackjack");
        }
    }
}
