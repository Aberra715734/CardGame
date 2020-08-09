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
                newCard.value = x;//set card value
                newCard.suit = newCard.getSuit(y);//set card suit
                super.showCards().add(newCard);
                super.setSize(super.getSize()+1);//adds 1 to the size of the deck
            }
        }
    }
    public Card pickCard(){//Selects a random card
            Random r = new Random();//create random generator
            int c = r.nextInt(super.getSize());//pick the index of the card to draw, maximum number is equal to size of card group
            super.setSize(super.getSize()-1);//reduce the size of the card group by one
            Card pickedCard = super.getCard(c);//copy drawn card as a picked card
            super.showCards().remove(c);//remove copied card from deck
            return pickedCard;
    }
}
