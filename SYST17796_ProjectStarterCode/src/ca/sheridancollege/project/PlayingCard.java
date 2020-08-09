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

    enum Suits {
        HEARTS,
        SPADES,
        CLUBS,
        DIAMONDS;

    }
     String suit;

    PlayingCard() {
    }

    PlayingCard(String giveSuit, int giveValue) {
        suit = giveSuit;
        value = giveValue;
    }

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
    public int getValue(){
        return value;
    }
    
} 
