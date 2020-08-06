/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author Sivagama
 */
public abstract class Player extends Game
{
    private String playerID; //the unique ID for this player
       private int score;
    /**
     * A constructor that allows you to set the player's unique ID
     * @param name the unique ID to assign to this player.
     */
    public Player(String name)
    {
        playerID= name;
    }
    
    /**
     * @return the playerID
     */
    public String getPlayerID() 
    {
        return playerID;
    }

    /**
     * Ensure that the playerID is unique
     * @param givenID the playerID to set
     */
    public void setPlayerID(String givenID) 
    {
        playerID = givenID;
        
       
    }
    @Override
         public void play(){
register();
multChoices();

}
        
   
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
    
    
    
    
    /**
     * The method to be instantiated when you subclass the Player class
     * with your specific type of Player and filled in with logic to play your game.
     */

    
}
