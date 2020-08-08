
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
            
        }
        //make a while loop to continue iterating until game is finished
        for(int i = 0; i < super.getPlayerSize(); i++)//Cycle through player turns
        {
            //Prompt player for hit or stay action
            //Evaluate player hand
        }
        //dealer turn
        //check for winner
        
    }
    @Override public void declareWinner()//override declareWinner method here
    {
    }
    
}

