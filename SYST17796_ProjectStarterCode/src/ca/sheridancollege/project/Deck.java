/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;
/**
 * Represents a standard deck of 52 playing cards
 * @author Matthew
 */
import java.util.Random;
public class Deck extends GroupOfCards{
    public Deck(){
        super(52);
        for (int x = 0; x<13; x++){//faces
            
            for(int y = 0; y<4; y++){
                PlayingCard c = new PlayingCard();
                c.value = x;//set card value
                c.suit = c.getSuit(y);
                super.addCard(c);    
            }
            
        }
    }
    public Card drawCard(){
        
        
        Random r = new Random();
        int c = r.nextInt(super.getSize());//pick the index of the card to draw, maximum number is equal to size of card group
        super.setSize(super.getSize()-1);//reduce the size of the card group by one
        Card pickedCard = super.getCard(c);//copy drawn card as a picked card
        super.removeCard(c);//remove copied card from deck
        return pickedCard;//Send picked card to hand

    }

}
