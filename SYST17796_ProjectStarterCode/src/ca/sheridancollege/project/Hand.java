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

    public Hand() {
        super(0);
        super.initialize();
    }

    //updates hand total value
    public int checkTotal() {
        int totalValue = 0;
        for (int i = 0; i < getSize(); i++) {
            totalValue += showCards().get(i).getValue();
        }
        return totalValue;
    }

    @Override
    public String toString() {
        String handString = "";
        for (int i = 0; i < getSize(); i++) {
            handString = handString + super.getCard(i).toString();
        }
        return handString;
    }
}
