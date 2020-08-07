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
public class Hand extends GroupOfCards {
    private int numberOfCards;
            private Deck deck = new Deck();
    public Hand(int givenSize){
        super(2);
        givenSize = 2;
    }

    
    public int checkTotal(){
        int total = 0;
        for (int i = 0; i < numberOfCards; i++){
            
        }
    
    return total;
    }
}
