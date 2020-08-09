/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you
 * might want to subclass this more than once. The group of cards has a maximum
 * size attribute which is flexible for reuse.
 *
 * @author Sivagama
 */
public class GroupOfCards {

    //The group of cards, stored in an ArrayList
    private ArrayList<Card> cards;
    //the size of the grouping
    private int size;

    /**
     * constructor that allows to set size of the deck.
     *
     * @param givenSize the size of deck.
     */
    public GroupOfCards(int givenSize) {
        size = givenSize;
    }

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<Card> showCards() {
        return cards;
    }

    /**
     * method which is used to shuffle the cards in a deck.
     */
    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }
    public void addOne(){
        size = size + 1;
    }
    /**
     * Initialize the ArrayList of cards.
     */
    public void initialize() {
        cards = new ArrayList<Card>();
    }
    
    public Card getCard(int i){
        Card c = cards.get(i);
        return c;
    }
}//end class
