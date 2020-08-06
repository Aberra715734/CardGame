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
    Deck(){
        super(52);
        for (int x = 0; x<13; x++){//faces
            for(int y = 0; y<4; y++){
                PlayingCard c = new PlayingCard();
                
                super.addCard(c);    
            }
            
        }
    }
    public Card drawCard(){
        Random r = new Random();
        int c = r.nextInt(super.getSize());
        return super.getCard(c);
    }
}
