package ca.sheridancollege.project;

/**
 *
 * @author Matthew
 */
public class BlackJack extends Game {

    public BlackJack() {
        super("BlackJack");
    }
    Deck deck = new Deck();
    BlackjackPlayer dealer = new BlackjackPlayer("Dealer");
    private Dealer dealerTurn;

    //override play method here
    @Override
    public void play()
    {//for each player
        for (int i = 0; i < super.getPlayerSize(); i++)
        {
            //preform the following twice
            for (int j = 0; j < 2; j++)
            {
                //select the player corresponding to i, takes 1 card from the deck and sends to player's hand.
                super.getPlayers().get(i).getHand().addCard(deck.drawCard());
            }
        }
        //deal 2 cards to dealer
        for (int j = 0; j < 2; j++)
        {
            dealer.getHand().addCard(deck.drawCard());
        }
        //make a while loop to continue iterating until game is finished
        
        //Cycle through player turns
        for (int i = 0; i < super.getPlayerSize(); i++)
        {
            if (super.getPlayers().get(i).hitOrStay())//Prompt player for hit or stay action
            {
                super.getPlayers().get(i).getHand().addCard(deck.drawCard());
            } else {
                break;
            }
            //Evaluate player hand
        }
        //dealer turn
        dealerTurn.dealerTurn();
        //check for winner
    }

    @Override
    public void declareWinner()//override declareWinner method here
    {

    }

}
