package cardgameweek4;

import java.util.Scanner;

/**
 * A class to handle the user interaction for the Card
 * project. Contains a main method that generates a card hand
 * and then iterates over it to print its contents to the console.
 * @author srinivsi, 2020
 */
public class GamePlayer {

	public static void main(String[] args) {
		CardHand ch = new CardHand();
                ch.generateHand();
                for(Card c: ch.cards)
                {
                    System.out.println(c.getValue() + " of " + c.getSuit());
                }
               // System.out.println(ch.cards); show what happens when there is no toString()
//	Scanner scn = new Scanner(System.in);
//        System.out.println("Enter the Value:");
//        int inputvalue = scn.nextInt();
//        System.out.println("Enter the Suit:");
//        String inputsuit = scn.next();
//        
//        boolean compare = false;
//        for(Card i:ch.cards){
//            
//            if((inputsuit.equalsIgnoreCase(i.getSuit())) && i.getValue() == inputvalue)
//            {
//                compare = true;
//            }
//        } 
//            if( compare == true){
//                System.out.println("Your card is in the array");
//            }
//            else
//            {
//                System.out.println("Card is not in the array");
//            }
        }

}