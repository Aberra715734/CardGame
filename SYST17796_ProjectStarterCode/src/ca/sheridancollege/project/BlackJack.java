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
    //creates the dealer
    Dealer dealer = new Dealer();

    //override play method here
    @Override
    public void play() {
        //for each player
        for (int i = 0; i < getPlayerSize(); i++) {
            //preform the following twice
            for (int j = 0; j < 2; j++) {
                //draws a card, places it in player i's hand
                super.getPlayers().get(i).getHand().showCards().add(deck.drawCard());
                //add one to size
                getPlayers().get(i).getHand().addOne();
            }
        }
        for (int i = 0; i < 2; i++) {
            //add 2 cards to the dealer's hand
            dealer.getHand().showCards().add(deck.drawCard());
            //add one to size
            dealer.getHand().addOne();
        }
        System.out.println("Dealer has a value of " + dealer.getHand().checkTotal());
        for (int i = 0; i < getPlayerSize(); i++)//for each player
        {
            System.out.println("Player " + getPlayers().get(i).getPlayerID() + "'s turn");
            System.out.println("Player's hand value is " + getPlayers().get(i).getHand().checkTotal());
            for (int j = 0; j < getPlayers().get(i).getHand().getSize(); j++) {
                System.out.println(getPlayers().get(i).getHand().getCard(j).toString());//show cards
            }
            if (getPlayers().get(i).checkBust() != true)//if player is still in the match
            {
                boolean turn = true;
                while (turn == true) {
                    if (getPlayers().get(i).hitOrStay())//check if you want to hit or stay
                    {
                        //draw a card from deck
                        Card c = deck.drawCard();
                        //display card
                        System.out.println(c.toString());
                        //add c card to hand
                        getPlayers().get(i).getHand().showCards().add(c);
                        //increase hand size
                        getPlayers().get(i).getHand().addOne();
                        //check total
                        System.out.println("Player's hand is now " + getPlayers().get(i).getHand().checkTotal());
                        if (getPlayers().get(i).checkBust() == true) {//check if bust
                            System.out.println("Player Busted");
                            turn = false;
                            break;//exit while loop
                        }
                    } else {
                        break;//exit while loop
                    }
                }
            }
        }
        //begin dealer turn
        boolean dealerturn = true;
        while (dealerturn == true) {
            if (dealer.checkBust() != true)//check if dealer is still in
            {
                if (dealer.hitOrStay() == true) {
                    Card d = deck.drawCard();
                    System.out.println("Dealer draws " + d.toString());
                    System.out.println("Dealer's hand is now " + dealer.getHand().checkTotal());
                    dealer.getHand().showCards().add(d);
                    dealer.getHand().addOne();
                } else {
                    System.out.println("Dealer stays");
                    dealerturn = false;
                    break;
                }
            } else {
                System.out.println("Dealer busted!");
                dealerturn = false;
                break;
            }
        }
        //compare results
        if (dealer.checkBust() == true)//dealer busted
        {
            for (int p = 0; p < getPlayerSize(); p++) {
                if (getPlayers().get(p).checkBust() == true) {
                    //player busted
                    System.out.println("Player" + getPlayers().get(p).getPlayerID() + " loses");
                } else {
                    //player did not bust
                    System.out.println("Player " + getPlayers().get(p).getPlayerID() + "Wins the round");
                }
            }
        } else//dealer did not bust
        {
            System.out.println("Dealer final score: " + dealer.getHand().checkTotal());
            for (int p = 0; p < getPlayerSize(); p++) {
                //player did not bust
                if (getPlayers().get(p).checkBust() == false) {
                    //player hand beats dealer hand
                    if (getPlayers().get(p).getHand().checkTotal() > dealer.getHand().checkTotal()) {
                        System.out.println("Player " + getPlayers().get(p).getPlayerID() + " Wins!");
                    } else // player hand is equal to or less than dealer
                    {
                        System.out.println("Player " + getPlayers().get(p).getPlayerID() + " Loses.");
                    }
                } else//player busted
                {
                    System.out.println("Player " + getPlayers().get(p).getPlayerID() + " Loses.");
                }
            }
        }
        //end of program
    }

    //override declareWinner method here
    @Override
    public void declareWinner() {

    }

}
