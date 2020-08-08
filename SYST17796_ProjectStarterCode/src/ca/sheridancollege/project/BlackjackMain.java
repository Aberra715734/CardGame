/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author jasleen
 */
public class BlackjackMain {
    
    public static void main(String[] args){
        System.out.println("Welcome to Blackjack"
                + "\n"
                + "\nPLease read the rules before playing: "
                + "\n"
                + "\n* The goal of blackjack is to beat the dealer's hand without going over 21."
                + "\n"
                + "\n* Face cards are worth 10. Aces are worth 1 or 11, whichever makes a better hand."
                + "\n"
                + "\n* Each player starts with two cards, one of the dealer's cards is hidden until the end."
                + "\n"
                + "\n* To 'Hit' is to ask for another card. To 'Stand' is to hold your total and end your turn."
                + "\n"
                + "\n* If you go over 21 you bust, and the dealer wins regardless of the dealer's hand."
                + "\n"
                + "\n* If you are dealt 21 from the start (Ace & 10), you got a blackjack."
                + "\n"
                + "\n* Blackjack usually means you win 1.5 the amount of your bet. Depends on the casino."
                + "\n"
                + "\n* Dealer will hit until his/her cards total 17 or higher."
                + "\n"
                + "\n* Doubling is like a hit, only the bet is doubled and you only get one more card."
                + "\n"
                + "\n* Split can be done when you have two of the same card - the pair is split into two hands."
                + "\n"
                + "\n* Splitting also doubles the bet, because each new hand is worth the original bet."
                + "\n"
                + "\n* You can only double/split on the first move, or first move of a hand created by a split."
                + "\n"
                + "\n* You cannot play on two aces after they are split."
                + "\n"
                + "\n* You can double on a hand resulting from a split, tripling or quadrupling you bet."
                 );
        
        BlackjackGame game = new BlackjackGame();
        game.register();
    }
}
