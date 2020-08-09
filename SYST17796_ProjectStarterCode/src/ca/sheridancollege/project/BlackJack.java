
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
    Dealer dealer = new Dealer();//creates the dealer
    @Override public void play()//override play method here
    { 
        for(int i = 0; i < super.getPlayerSize(); i++)//for each player
        {
            for(int j = 0; j < 2; j++)//preform the following twice
            {
                super.getPlayers().get(i).getHand().showCards().add(deck.drawCard());//draws a card, places it in player i's hand
            }
        }
        for(int i = 0; i < 2; i++){
        dealer.getHand().showCards().add(deck.drawCard());//add 2 cards to the dealer's hand
        }
        boolean dealerhits = true;
        while(dealer.checkBust() != true && dealerhits == true)//checks if dealer has busted
        {
            for(int i = 0; i < super.getPlayerSize(); i++)//Cycle through player turns
            {
                while (super.getPlayers().get(i).checkBust() != true)//checks if player has busted out
                {
                    boolean hit = true;//create hit variable, set to true
                    do 
                    {
                        hit = getPlayers().get(i).hitOrStay();//do hitOrStay command until hit is false
                    }
                    while(hit == true);//continue loop while hit is true
                }
            }
            dealerhits = dealer.hitOrStay();//evaluate while loop condition
        }
        //Turn order ended, check for winner
        
    }
    @Override public void declareWinner()//override declareWinner method here
    {
    }
    
}

