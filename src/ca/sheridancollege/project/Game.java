/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;

/**
 * The class that models your game. You should create a more specific child of
 * this class and instantiate the methods given.
 *
 * @author Sivagama
 */
public abstract class Game {

    private final String gameName;//the title of the game
    private ArrayList<Player> players;// the players of the game

    public Game(String givenName) {
        gameName = givenName;
        players = new ArrayList();
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

}//end class

     class StarGame extends Game  {
         
         @Override
         public void play(){
register();


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
         
         @Override
         public void declareWinner(){
         
         }
     }