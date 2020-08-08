
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
                Card c = deck.drawCard();
                super.getPlayers().get(i).getHand().showCards().add(c);
            }
        }

        //make a while loop to continue iterating until game is finished
        for(int i = 0; i < super.getPlayerSize(); i++)//Cycle through player turns
        {
           
            
        }
        //dealer turn
        //check for winner
        
    }
    @Override public void declareWinner()//override declareWinner method here
    {
    }
    
}

