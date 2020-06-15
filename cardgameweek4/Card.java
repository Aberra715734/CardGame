package cardgameweek4;
/**
 * Starter code for the Card class.
 * 
 * @author srinivsi, 2020
 */
public class Card {
    
        public enum Suit{RED,GREEN,BLUE,YELLOW};
        public enum Value{ZERO,ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE,SKIP,REVERSE,DRAW_TWO,DRAW_FOUR,WILD};
        private final Suit suit;
        private final Value value;
        
        public Card(Suit s, Value gVal)
        {
           suit =s;
           value= gVal;
        }
	public Value getValue() {
		return this.value;
	}

	
	public Suit getSuit() {
		return this.suit;
        }
}