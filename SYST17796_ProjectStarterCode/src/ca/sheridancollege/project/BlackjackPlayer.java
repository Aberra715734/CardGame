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

    @Override
    public boolean hitOrStay() {
        boolean hit = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to hit or stay?");
        String reply = input.next();
        if (reply.equalsIgnoreCase("Hit")) {
//            super.getHand().addCard(deck.drawCard());
            hit = true;
        } else if (reply.equalsIgnoreCase("Stay")) {
//            super.getHand().checkTotal();
            hit = false;
        } else {
            System.out.println("Not a valid choice, please choose hit or stay");
            hit = false;
        }
        return hit;
    }

    public boolean checkBust() {
        boolean bust = false;
        if (super.getHand().checkTotal() > 21) {
//            System.out.println("Player has been busted, he is no longer in this round.");
            bust = true;
        }
        else {
            bust = false;
        }
        return bust;
    }

    public boolean checkBlackjack() {
        boolean blackjack = false;
        if (super.getHand().checkTotal() == 21) {
//            System.out.println("Blackjack");
             blackjack = true;
        }
        else {
            blackjack = false;
        }
        return blackjack;
    }
}
