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
      
         @Override
         public void play(){
register();
multChoices();

}
        
    public BlackJack(){
        super("BlackJack");
    }
    Deck deck = new Deck();
    
         
    public void register() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter username and password");

        String username = input.nextLine();

        String password = input.nextLine();
        boolean isValid = false;
        while (isValid = false) {
            if (password.length() > 8) {
                System.out.println("Please enter more then 8 characters");
                password = input.nextLine();
            }

            for (int i = 0; i < password.length(); i++) {

                if (!(Character.isLetterOrDigit(password.charAt(i)))) {
                    System.out.println("Please enter a special character like !@#");
                } else {
                    isValid = true;
                }

            }

        }

    }
   
    public static void multChoices(){
    Scanner input = new Scanner(System.in);
    
    System.out.println("Welcome pal, how many people will be playing with you");
    
    
    int user = input.nextInt();

    if (user>1&&user<5){
    System.out.println("Awesome, let start");
             for(int i=user; i>=0; i--){
            //insert dealer method here
        }
    }
    else
        while(user <1&& user>4)
        System.out.println("Please choose a number between 1 and 4");
    }
    
    
         
         @Override
         public void declareWinner(){
         
         }
     }
