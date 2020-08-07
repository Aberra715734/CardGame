/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class BlackJackPlayer extends Player {

    BlackJackPlayer(String name) {
        super(name);
    }

    public void register() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter username and password");

        String username = input.nextLine();
        System.out.println("Password please");
        String password = input.nextLine();

       
        checkLength(password);
        checkLetterOrDigit(password);
        
    }

    public void checkLength(String password) {
        Scanner input = new Scanner(System.in);

        while (password.length() < 8) {
            System.out.println("Please enter more then 8 characters");
            password = input.nextLine();
        }
    }

    public  void checkLetterOrDigit(String o) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < o.length(); i++) {

            if ((!Character.isLetterOrDigit(o.charAt(i)))) {

                System.out.println("Please enter a special character like !@#");
                o = input.nextLine();
            }

        }

    }

    public void multChoices() {
        Scanner input = new Scanner(System.in);
int user=0;
        System.out.println("Welcome pal, how many people will be playing with you");
        
        boolean loop = true;
     while (loop=true) {
         user = input.nextInt();

        if (user >= 2 && user <= 4) {
            System.out.println("Awesome, What are the "+user+" players name");

            if (user ==2)
            {
                System.out.println("Player 1");
            String mac1 = input.next();
            BlackJackPlayer player1 = new BlackJackPlayer(mac1);
            player1.setPlayerID(mac1);
            player1.getPlayerID();

            System.out.println("Player 2");
            String mac2 = input.next();
            BlackJackPlayer player2 = new BlackJackPlayer(mac2);
            player2.setPlayerID(mac2);
            player2.getPlayerID();
            
           break;
            }

            else if ( user ==3) {
                                System.out.println("Player 1");
            String mac1 = input.next();
            BlackJackPlayer player1 = new BlackJackPlayer(mac1);
            player1.setPlayerID(mac1);
            player1.getPlayerID();

            System.out.println("Player 2");
            String mac2 = input.next();
            BlackJackPlayer player2 = new BlackJackPlayer(mac2);
            player2.setPlayerID(mac2);
            player2.getPlayerID();
            
           
                System.out.println("Player 3");
            String mac3 = input.next();
            BlackJackPlayer player3 = new BlackJackPlayer(mac3);
            player3.setPlayerID(mac3);
            player3.getPlayerID();
                    break;
            }
            else if( user==4){
                
                
             System.out.println("Player 1");
            String mac1 = input.next();
            BlackJackPlayer player1 = new BlackJackPlayer(mac1);
            player1.setPlayerID(mac1);
            player1.getPlayerID();

            System.out.println("Player 2");
            String mac2 = input.next();
            BlackJackPlayer player2 = new BlackJackPlayer(mac2);
            player2.setPlayerID(mac2);
            player2.getPlayerID();
            
            
                System.out.println("Player 3");
            String mac3 = input.next();
            BlackJackPlayer player3 = new BlackJackPlayer(mac3);
            player3.setPlayerID(mac3);
            player3.getPlayerID();
            
                
                
                
                
                    System.out.println("Player 4");
            String mac4 = input.next();
            BlackJackPlayer player4 = new BlackJackPlayer(mac4);
            player4.setPlayerID(mac4);
            player4.getPlayerID();
                   break;
        }
                    
        }
         else {
       
                System.out.println("Please choose a number between 1 and 4");
            
            }
        }
    }
    

}
