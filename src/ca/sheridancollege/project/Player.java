/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 * A class that models each Player in the game. Players have an identifier,
 * which should be unique.
 *
 * @author Sivagama
 */
public abstract class Player {


     Scanner input = new Scanner(System.in);
    private String playerID; //the unique ID for this player
    private int score;

    @Override
    public String toString() {
        return "Player{" + "input=" + input + ", playerID=" + playerID + ", score=" + score + '}';
    }
    


    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
    public Player(String name) {
        playerID = name;
    }

    
        
         public void viewScore(){
         
         
         }
    /**
     * @return the playerID
     */
      public String getPlayerID() {
        return playerID;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param the playerID to set
     */
    public void setPlayerID(String givenID) {
        playerID = givenID;

    }
    
    

    

    /**
     * The method to be instantiated when you subclass the Player class with
     * your specific type of Player and filled in with logic to play your game.
     */
}
