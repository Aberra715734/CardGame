/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 *
 * @author jasleen
 */
public class BlackjackPlayer extends Player {

    public BlackjackPlayer(String name) {
        super(name);
    }

    @Override
    public void play() {

    }
        public void playerOption(){
      Scanner input = new Scanner(System.in);
 
  boolean start = true;
   BlackJackPlayer apit = new BlackJackPlayer("");
        BlackJack f = new BlackJack();
  
         
        
     
       
        System.out.println("Do you want to play 'Single' or 'Multiplayer?'?");
       String copy = input.next();
        while(start = true){
        if (copy.equalsIgnoreCase("single")){
        apit.Single();
        start=false;
        }
        else if (copy.equalsIgnoreCase("multiplayer")){
        apit.Multiplayer();
        start=false;
        }
        else
        {System.out.println("Please either choose single or multiplayer");}
        }

       
    }
    public void Single(){
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter a nickname: ");
    String inp = input.next();
            
  BlackJackPlayer apitude = new BlackJackPlayer(inp);
  BlackJack ap = new BlackJack();

            
           
            apitude.setPlayerID(inp);
             ap.addPlayer(apitude);
             System.out.println(apitude.getPlayerID());
       

        
       
            
            
            }
    
    
        
    
    public void Multiplayer(){
       Scanner input = new Scanner(System.in);
       
       int number=0;
  
    
    do{
             System.out.println("How many people will be playing with you?");
        number =  input.nextInt();
       
          
       
       
    System.out.println("Please enter player names");
    String inp;
    String inp1;
    String inp2;
    String inp3;
    if (number==2){
            inp = input.next();
   
                  
         
  BlackJackPlayer apitude = new BlackJackPlayer(inp);
  BlackJack ap = new BlackJack();
    apitude.setPlayerID(inp);
    ap.addPlayer(apitude);
    System.out.println("Player1:  "+apitude.getPlayerID());
    

    System.out.println("2nd Player name");
       inp1 = input.next();
     BlackJackPlayer apitude1 = new BlackJackPlayer(inp1);
        ap.addPlayer(apitude1);
        apitude1.setPlayerID(inp1);
        System.out.println("Player 2: "+apitude1.getPlayerID());
    }
        else if (number ==3){
                        inp = input.next();
   
                  
         
  BlackJackPlayer apitude = new BlackJackPlayer(inp);
  BlackJack ap = new BlackJack();
    apitude.setPlayerID(inp);
    ap.addPlayer(apitude);
    System.out.println("Player1:  "+apitude.getPlayerID());
    

    System.out.println("2nd Player name");
       inp1 = input.next();
     BlackJackPlayer apitude1 = new BlackJackPlayer(inp1);
        ap.addPlayer(apitude1);
        apitude1.setPlayerID(inp1);
        System.out.println("Player 2: "+apitude1.getPlayerID());
            
        System.out.println("3nd Player name");
       inp2= input.next();
     BlackJackPlayer apitude2 = new BlackJackPlayer(inp2);
        ap.addPlayer(apitude2);
        apitude2.setPlayerID(inp2);
        System.out.println("Player 3: "+apitude2.getPlayerID());
        }
    
        else if( number==4){
                                    inp = input.next();
   
                  
         
  BlackJackPlayer apitude = new BlackJackPlayer(inp);
  BlackJack ap = new BlackJack();
    apitude.setPlayerID(inp);
    ap.addPlayer(apitude);
    System.out.println("Player1:  "+apitude.getPlayerID());
    

    System.out.println("2nd Player name");
       inp1 = input.next();
     BlackJackPlayer apitude1 = new BlackJackPlayer(inp1);
        ap.addPlayer(apitude1);
        apitude1.setPlayerID(inp1);
        System.out.println("Player 2: "+apitude1.getPlayerID());
            
        System.out.println("3nd Player name");
       inp2= input.next();
     BlackJackPlayer apitude2 = new BlackJackPlayer(inp2);
        ap.addPlayer(apitude2);
        apitude2.setPlayerID(inp2);
        System.out.println("Player 3: "+apitude2.getPlayerID());
        
        System.out.println("4th Player name");
       inp3= input.next();
     BlackJackPlayer apitude3 = new BlackJackPlayer(inp3);
        ap.addPlayer(apitude3);
        apitude1.setPlayerID(inp3);
        System.out.println("Player 3: "+apitude3.getPlayerID());
        }
        else{
        System.out.println("Please print a number between 2 and 4");
        }
    
    }while(number<2&&number>4);
    }
    
    
    public boolean hitOrStay(){
        super.getHand().toString();
        boolean hit = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to hit or stay?");
        String reply = input.next();
        if (reply.equalsIgnoreCase("Hit")) {
//            super.getHand().addCard(deck.drawCard());
            System.out.println("Player " + getPlayerID() + " Hits!");
            hit = true;
        } else if (reply.equalsIgnoreCase("Stay")) {
//            super.getHand().checkTotal();
            System.out.println("Player " + getPlayerID() + " Stays!");
            hit = false;
        } else {
            System.out.println("Not a valid choice, please type hit or stay");
            hit = false;
        }
        return hit;
    }
    @Override     
    public boolean checkBust() {
        if (super.getHand().checkTotal() > 21) {
            return true;
        } 
        else
            return false;
    }
    
    @Override
    public boolean checkBlackjack(){
        if (super.getHand().checkTotal() == 21){
            System.out.println("Blackjack");
            return true;
        }
        else
           return false;

    }
}
