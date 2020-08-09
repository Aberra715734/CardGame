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
    }
    int totalValue = 0;
    
    public int checkTotal(){
        int sumValue = 0;
        for (int i = 0; i < super.getSize(); i++){
            switch(super.getCard(i).getValue())//get the printed number value of the card
           {
               default: //any other card
                   sumValue = sumValue + super.getCard(i).getValue();//value is equal to printed value
               case 1: //ace
                   if(sumValue >= 11){//If Ace = 11 would bust
                       sumValue = sumValue + 1;//then Ace = 1
                   }
                   else //otherwise
                       sumValue = sumValue + 11;//Ace = 11
                   break;
               case 11: //Jacks
                   sumValue = sumValue + 10;                   
                   break;
               case 12://Queens
                   sumValue = sumValue + 10;
                   break;
               case 13://Kings
                   sumValue = sumValue + 10;
                   break;
           }
        }
        return sumValue;
    }
    @Override public String toString(){
        String handString = "";
        for(int i = 0; i < super.getSize(); i++){
            handString = handString + super.getCard(i).toString();
        }
        return handString;
    }
}
