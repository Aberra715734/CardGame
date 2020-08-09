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
public class BlackJackPlayer extends Player {

    public BlackJackPlayer(String name) {
        super(name);
    }

    @Override
    public void play() {

    }

    /**
     * Method that ask user if he want to player single or multiplayer.
     */
    public void playerOption() {
        Scanner input = new Scanner(System.in);

        boolean start = true;
        BlackJackPlayer apit = new BlackJackPlayer("");
        BlackJack f = new BlackJack();

        System.out.println("Do you want to play 'Single' or 'Multiplayer?'?");
        String copy = input.next();
        if (copy.equalsIgnoreCase("single")) {
            apit.Single();
            start = false;
        } else if (copy.equalsIgnoreCase("multiplayer")) {
            apit.Multiplayer();
            start = false;
        } else {
            System.out.println("Please either choose single or multiplayer");
        }

    }

    /**
     * Method for single player.
     */
    public void Single() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a nickname: ");
        String inp = input.next();

        BlackJackPlayer apitude = new BlackJackPlayer(inp);
        BlackJack ap = new BlackJack();

        apitude.setPlayerID(inp);
        ap.addPlayer(apitude);
        System.out.println(apitude.getPlayerID());

    }

    /**
     * Method for multiplayer.
     */
    public void Multiplayer() {
        Scanner input = new Scanner(System.in);

        int number = 0;
        System.out.println("How many people will be playing with you?");
        number = input.nextInt();
        for (int i = 1; i <= number; i++) {

            if (i <= 4) {
                String inp;

                System.out.println("Please enter player names");
                System.out.println(" Player " + i + " name");
                inp = input.next();

                BlackJackPlayer apitude = new BlackJackPlayer(inp);
                BlackJack ap = new BlackJack();
                BlackJackPlayer apitude1 = new BlackJackPlayer(inp);
                ap.addPlayer(apitude1);
                apitude1.setPlayerID(inp);
                System.out.println("Player " + i + ": " + apitude1.getPlayerID());
            } else {
                System.out.println("Please enter a number between 2 to 4.");
            }
        }

    }

    public boolean hitOrStay() {
        super.getHand().toString();
        boolean hit = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to hit or stay?");
        String reply = input.next();
        if (reply.equalsIgnoreCase("Hit")) {
            //  super.getHand().addCard(deck.drawCard());
            System.out.println("Player " + getPlayerID() + " Hits!");
            hit = true;
        } else if (reply.equalsIgnoreCase("Stay")) {
            // super.getHand().checkTotal();
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
        } else {
            return false;
        }
    }

    @Override
    public boolean checkBlackjack() {
        if (super.getHand().checkTotal() == 21) {
            System.out.println("Blackjack");
            return true;
        } else {
            return false;
        }

    }
}
