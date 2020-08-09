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
public class BlackjackPlayer extends Player {

    public BlackjackPlayer(String name) {
        super(name);
    }

    @Override
    public void play() {

    }
    
    public boolean hitOrStay(){
        super.getHand().toString();
        boolean hit = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to hit or stay?");
        String reply = input.next();
        if (reply.equalsIgnoreCase("Hit")) {
//            super.getHand().addCard(deck.drawCard());
            System.out.println("Player " + getPlayerID() + " Hits!");
            hit = true;
        } else if (reply.equalsIgnoreCase("Stay")) {
//            super.getHand().checkTotal();
            System.out.println("Player " + getPlayerID() + " Stays!");
            hit = false;
        } else {
            System.out.println("Not a valid choice, please type hit or stay");
            hit = false;
        }
        return hit;
    }
    @Override     
    public boolean checkBust() {
        if (super.getHand().checkTotal() > 21) {
            return true;
        } 
        else
            return false;
    }
    
    @Override
    public boolean checkBlackjack(){
        if (super.getHand().checkTotal() == 21){
            System.out.println("Blackjack");
            return true;
        }
        else
           return false;

    }
}