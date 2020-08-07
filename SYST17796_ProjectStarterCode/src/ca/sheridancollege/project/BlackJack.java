/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        
        for(int i = 0; i < super.getPlayerSize(); i++)//for each player, deal 2 cards
        {
            //select the player corresponding to i
            //send 2 cards to player hand from deck
        }
        //deal 2 cards to dealer
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
