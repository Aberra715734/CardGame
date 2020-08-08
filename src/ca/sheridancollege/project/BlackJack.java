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
        super("GameName");
    }
    Deck deck = new Deck();
    
      public void play(){
      
      }
         public void exitGame(){
             Scanner input = new Scanner(System.in);
             String add  =input.nextLine();
             
             if(add.equalsIgnoreCase("exit")){
        System.exit(0);             }
         }
         
      public void addPlayer(Player newPlayer){
 players.add(newPlayer);
 }
      
            public void removePlayer(Player newPlayer){
 players.remove(newPlayer);
 }
            
            public void clearPlayer(Player clear){
            players.clear();
            }
         public void gameOption(){
         
             
         
         }
         @Override
         public void declareWinner(){
         
         }

     


    
     }
