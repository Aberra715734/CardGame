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
public class Dealer extends Player {

    public Dealer() {
        super("Dealer");
    }

    @Override
    public void play() {
    }

    /**
     *
     * @return true if it is a BlackJack
     */
    @Override
    public boolean checkBlackjack() {
        if (getHand().checkTotal() == 21) {
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @return true if dealer busts
     */
    @Override
    public boolean checkBust() {
        if (getHand().checkTotal() > 21) {
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @return true if dealer hits and false if dealer stays
     */
    @Override
    public boolean hitOrStay() {
        if (getHand().checkTotal() <= 17) {
            return true;
        } else//total is 17 or above
        {
            return false;
        }
    }
}
