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
    Dealer dealer = new Dealer();//creates the dealer
    @Override public void play()//override play method here
    { 
        for(int i = 0; i < super.getPlayerSize(); i++)//for each player
        {
            //preform the following twice
            for (int j = 0; j < 2; j++)
            {
                super.getPlayers().get(i).getHand().showCards().add(deck.drawCard());//draws a card, places it in player i's hand
                getPlayers().get(i).getHand().addOne();//add one to size
            }
        }
        for(int i = 0; i < 2; i++){
        dealer.getHand().showCards().add(deck.drawCard());//add 2 cards to the dealer's hand
        dealer.getHand().addOne();//add one to size
        }
        for (int i = 0; i < getPlayerSize(); i++)//for each player
        {
            System.out.println("Player " + getPlayers().get(i).getPlayerID() + "'s turn");
            System.out.println("Player's hand value is " + getPlayers().get(i).getHand().checkTotal());
            if(getPlayers().get(i).checkBust() != true)//if player is still in the match
            {
                boolean turn = true;
                while(turn == true)
                {
                    if(getPlayers().get(i).hitOrStay())//check if you want to hit or stay
                    {
                        Card c = deck.drawCard();//draw a card from deck
                        System.out.println(c.toString());//display card
                        getPlayers().get(i).getHand().showCards().add(c);//add c card to hand
                        getPlayers().get(i).getHand().addOne();//increase hand size
                        System.out.println("Player's hand is now " + getPlayers().get(i).getHand().checkTotal());//check total
                        if(getPlayers().get(i).checkBust() == true){//check if bust
                            System.out.println("Player Busted");
                            turn = false;
                            break;//exit while loop
                        }
                    }
                    else
                        break;//exit while loop
                }
            }
        }
        //begin dealer turn
        System.out.println("Dealer has a value of " + dealer.getHand().checkTotal());
        
           
    }

    @Override
    public void declareWinner()//override declareWinner method here
    {

    }

}
