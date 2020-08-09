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
        for(int i = 0; i < getPlayerSize(); i++)//for each player
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
        System.out.println("Dealer has a value of " + dealer.getHand().checkTotal());
        for (int i = 0; i < getPlayerSize(); i++)//for each player
        {
            System.out.println("Player " + getPlayers().get(i).getPlayerID() + "'s turn");
            System.out.println("Player's hand value is " + getPlayers().get(i).getHand().checkTotal());
            for(int j = 0; j < getPlayers().get(i).getHand().getSize(); j++)
            {
                System.out.println(getPlayers().get(i).getHand().getCard(j).toString());//show cards
            }
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
        boolean dealerturn = true;
        while(dealerturn == true)
        {
            if(dealer.checkBust() != true)//check if dealer is still in
            {
                if(dealer.hitOrStay() == true)
                {
                    Card d = deck.drawCard();
                    System.out.println("Dealer draws " + d.toString());
                    System.out.println("Dealer's hand is now " + dealer.getHand().checkTotal());
                    dealer.getHand().showCards().add(d);
                    dealer.getHand().addOne();
                }
                else
                {
                    System.out.println("Dealer stays");
                    dealerturn = false;
                    break;
                }
            }
            else
            {
                System.out.println("Dealer busted!");
                dealerturn = false;
                break;
            }
        }
        //compare results
        if(dealer.checkBust() == true)//dealer busted
        {
            for(int p = 0; p < getPlayerSize(); p++)
            {
                if(getPlayers().get(p).checkBust() == true)
                    System.out.println("Player" + getPlayers().get(p).getPlayerID() + " loses" );//player busted
                else
                    System.out.println("Player " + getPlayers().get(p).getPlayerID() + "Wins the round");//player did not bust
            }
        }
        else//dealer did not bust
        {
            System.out.println("Dealer final score: " + dealer.getHand().checkTotal());
            for(int p = 0; p < getPlayerSize(); p++)
            {
                if(getPlayers().get(p).checkBust() == false)//player did not bust
                {
                    if(getPlayers().get(p).getHand().checkTotal() > dealer.getHand().checkTotal())//player hand beats dealer hand
                        System.out.println("Player " + getPlayers().get(p).getPlayerID() + " Wins!");
                    else // player hand is equal to or less than dealer
                        System.out.println("Player " + getPlayers().get(p).getPlayerID() + " Loses.");
                }
                else//player busted
                    System.out.println("Player " + getPlayers().get(p).getPlayerID() + " Loses.");
            }
        }
           //end of program
    }

    @Override
    public void declareWinner()//override declareWinner method here
    {

    }

}
