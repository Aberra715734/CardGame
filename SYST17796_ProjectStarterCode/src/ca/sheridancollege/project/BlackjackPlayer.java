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
    
    public boolean hitOrStay(){
        boolean hit = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to hit or stay?");
        String reply = input.next();
        if (reply.equalsIgnoreCase("Hit")){
            hit = true;
        }
        else if (reply.equalsIgnoreCase("Stay")){
            hit = false;
        }
        return hit;
    }
    @Override     
    public boolean checkBust() {
        if (super.getHand().checkTotal() > 21) {
            System.out.println("Player Bust");
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
