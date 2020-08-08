/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific child of
 * this class and instantiate the methods given.
 *
 * @author Sivagama
 */
public abstract class Game {

    //the title of the game
    private final String gameName;
    // the players of the game
    private ArrayList<Player> players;

    /**
     * constructor that allows to set game name.
     *
     * @param givenName set the game name
     */
    public Game(String givenName) {
        gameName = givenName;
        players = new ArrayList<Player>();
    }

    /**
     * @return the gameName
     */
    public String getGameName() {
        return gameName;
    }

    /**
     * Register the player with game.
     */
    public void register() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter username and password");
        System.out.printf("\nUsername: ");
        String username = input.nextLine();
        System.out.printf("\nPassword:");
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

    /**
     * @return the players of this game
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * @param newplayer add player to players ArrayList
     */
    public void addPlayer(Player newplayer) {
        players.add(newplayer);
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    /**
     * Play the game. This might be one method or many method calls depending on
     * your game.
     */
    public abstract void play();

    /**
     * When the game is over, use this method to declare and display a winning
     * player.
     */
    public abstract void declareWinner();

    /**
     * @return the player size
     */
    public int getPlayerSize() {
        return this.players.size();
    }

}//end class
