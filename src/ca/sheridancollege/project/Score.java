/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author User
 */
public class Score extends Game {
    ArrayList score;
    Iterator addScore;
    
    public void scoreLeaderBoard(){
    score = new ArrayList(players.size());
    
    addScore =score.iterator();
    
    for(int i =0; i>=players.size(); i++){
    System.out.print("Player "+ players.get(i));
    }
    
    }
    
    public void addScore(){
     
    
    }
    public void declareWinner(){}
    
    public void play(){}
}
