/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * The class that models your game. You should create a more specific child of
 * this class and instantiate the methods given.
 *
 * @author Sivagama
 */
public abstract class Game {

    private  String gameName;//the title of the game
    public  ArrayList<Player> players;// the players of the game
 public Iterator<Player> iterator;
    public Game(String givenName) {
        gameName = givenName;
         players = new ArrayList();
    }

public void addPlayer(Player newPlayer){
 players.add(newPlayer);
}

public void removePlayer(Player newPlayer){
 players.add(newPlayer);
}

public void clearPlayer(){
 players.clear();
}

    /**
     * @return the gameName
     */
    public String getGameName() {
        return gameName;
    }

    /**
     * @return the players of this game
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

public void iteratePlayer(){
iterator = players.iterator();
iterator.next();
}

public void getPlayer(int n){
System.out.print(players.get(n));}
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
     * When the game is over, use this method to declare and display a winningye
     * player.
     */
    
  
    public abstract void declareWinner();

}//end class

    