/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author User
 */
public class PlayingCard extends Card {
    int value;
    enum Suits {
        HEARTS,
        SPADES,
        CLUBS,
        DIAMONDS
    }
    String suit;
    PlayingCard(){}
    PlayingCard(String giveSuit, int giveValue){
        suit = giveSuit;
        value = giveValue;
    }
    @Override public String toString(){
        return suit + value;
    }
}
