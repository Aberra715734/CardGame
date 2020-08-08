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
public class Hand extends GroupOfCards {
    public Hand(){
        super(0);
        super.initialize();
        super.showCards().add(new PlayingCard());
    }

    
    public int checkTotal(){
        int total = 0;
        for (int i = 0; i < super.getSize(); i++){
           super.getCard(i).toString();
           
        }
    
    return total;
    }
}
