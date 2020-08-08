
package ca.sheridancollege.project;

/**
 *
 * @author Matthew
 */
public class BlackJack extends Game{
    public BlackJack(){
        super("BlackJack");
    }
    Deck deck = new Deck();
    BlackjackPlayer dealer = new BlackjackPlayer("Dealer");
    @Override public void play()//override play method here
    { 
        for(int i = 0; i < super.getPlayerSize(); i++)//for each player
        {
            for(int j = 0; j < 2; j++)//preform the following twice
            {
                super.getPlayers().get(i).getHand().addCard(deck.drawCard());//select the player corresponding to i, takes 1 card from the deck and sends to player's hand.
            }
        }
        for (int j = 0; j < 2; j++)//deal 2 cards to dealer
        {
            dealer.getHand().addCard(deck.drawCard());
        }
        //make a while loop to continue iterating until game is finished
        for(int i = 0; i < super.getPlayerSize(); i++)//Cycle through player turns
        {
            if(super.getPlayers().get(i).hitOrStay())//Prompt player for hit or stay action
            {
                super.getPlayers().get(i).getHand().addCard(deck.drawCard());
            }
            //Evaluate player hand
        }
        //dealer turn
        //check for winner
        
    }
    @Override public void declareWinner()//override declareWinner method here
    {
    }
    
}

