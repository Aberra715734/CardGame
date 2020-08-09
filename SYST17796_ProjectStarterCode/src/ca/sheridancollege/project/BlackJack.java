
package ca.sheridancollege.project;

/**
 *
 * @author Matthew
 */
public class BlackJack extends Game{
    public BlackJack(){
        super("BlackJack");
        Dealer dealer = new Dealer();//creates the dealer
        super.getPlayers().add(dealer);//adds the dealer to the player list
    }
    Deck deck = new Deck();
    @Override public void play()//override play method here
    { 
        for(int i = 0; i < super.getPlayerSize(); i++)//for each player
        {
            for(int j = 0; j < 2; j++)//preform the following twice
            {
                super.getPlayers().get(i).getHand().showCards().add(deck.drawCard());//draws a card, places it in player i's hand
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

