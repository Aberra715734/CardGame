/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author Matthew
 */
public class PlayingCard extends Card {

    int value;

    //enum for Suits 
    enum Suits {
        HEARTS,
        SPADES,
        CLUBS,
        DIAMONDS;

    }
    String suit;

    PlayingCard() {
    }

    /**
     * Constructor that allows to set Suit and value of card
     *
     * @param giveSuit the suit in the deck
     * @param giveValue the value of the suit
     */
    PlayingCard(String giveSuit, int giveValue) {
        suit = giveSuit;
        value = giveValue;
    }

    //return toString()
    @Override
    public String toString() {
        return suit + value;
    }

    public String getSuit(int i) {
        String s;
        switch (i) {
            case 1:
                s = "HEARTS";
                break;
            case 2:
                s = "SPADES";
                break;
            case 3:
                s = "CLUBS";
                break;
            case 4:
                s = "DIAMONDS";
                break;
            default:
                s = "ERROR";
                break;
        }
        return s;
    }

    /**
     * 
     * @return card value 
     */
    public int getValue() {
        return value;
    }

}
