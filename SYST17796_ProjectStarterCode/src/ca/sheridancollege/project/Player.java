/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier,
 * which should be unique.
 *
 * @author Sivagama
 */
public abstract class Player {

    private String playerID; //the unique ID for this player
    private Hand playerHand = new Hand();//Represents the player's hand

    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
    public Player(String name) {
        playerID = name;
    }

    /**
     *
     * The method that is instantiated in player subclass to check if player
     * chooses to hit or stay.
     */
    public abstract boolean hitOrStay();

    /**
     * The method that checks if player if busted or not.
     *
     * @return true if player is busted.
     */
    public abstract boolean checkBust();

    /**
     * The method that checks if player got a BlackJack
     *
     * @return true if it is a BlackJack
     */
    public abstract boolean checkBlackjack();

    /**
     * @return the playerID
     */
    public String getPlayerID() {
        return playerID;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param givenID the playerID to set
     */
    public void setPlayerID(String givenID) {
        playerID = givenID;
    }

    /**
     *
     * @return the playerHand
     */
    public Hand getHand() {
        return playerHand;
    }

    /**
     * The method to be instantiated when you subclass the Player class with
     * your specific type of Player and filled in with logic to play your game.
     */
    public abstract void play();

}
