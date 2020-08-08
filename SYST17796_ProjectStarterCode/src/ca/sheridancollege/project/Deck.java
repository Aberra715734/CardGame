/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 * Represents a standard deck of 52 playing cards
 *
 * @author Matthew
 */
import java.util.Random;

public class Deck extends GroupOfCards {

    public Deck() {
        super(0);
        //initialize array
        super.initialize();
        buildDeck();
    }

    //Draw card from deck.
    public Card drawCard() {
        //If deck is not empty
        if (super.getSize() > 0) {
            return pickCard();
        } else//If deck is empty
        {
            //add new cards
            buildDeck();
            return pickCard();
        }
    }

    //Used to build deck
    public void buildDeck() {
        for (int x = 0; x < 13; x++) {
            //faces
            for (int y = 0; y < 4; y++) {
                PlayingCard newCard = new PlayingCard();
                //set card value
                newCard.value = x;
                //set card suit
                newCard.suit = newCard.getSuit(y);
                super.addCard(newCard);
                //adds 1 to the size of the deck
                super.setSize(super.getSize() + 1);
            }
        }
    }

    //Selects a random card
    public Card pickCard() {
        //create random generator
        Random r = new Random();
        //pick the index of the card to draw, maximum number is equal to size of card group
        int c = r.nextInt(super.getSize());
        //reduce the size of the card group by one
        super.setSize(super.getSize() - 1);
        //copy drawn card as a picked card
        Card pickedCard = super.getCard(c);
        //remove copied card from deck
        super.removeCard(c);
        return pickedCard;
    }
}
