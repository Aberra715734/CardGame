/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 *
 * @author User
 */
 class BlackJack extends Game  {
          public BlackJack(){
        super("BlackJack");
    }
    Deck deck = new Deck();
    
      public void play(){
      
      }
         public void exitGame(){
             Scanner input = new Scanner(System.in);
             String add  =input.nextLine();
             
             if(add.equalsIgnoreCase("exit")){
        System.exit(0);
             }
         }
         public void gameOption(){
         
             
         
         }
         @Override
         public void declareWinner(){
         
         }

    
     }
