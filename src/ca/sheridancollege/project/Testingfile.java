package ca.sheridancollege.project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public  abstract class Testingfile {
    
    /**
     *
     */
    public abstract void  apple();
    
    
}

class Nothing extends Testingfile{

    public  void apple(){
System.out.println("coffee");
    }
} 
    class Nothing1 extends Testingfile{
        public void apple(){
        System.out.println("madmamd");
        }
    }
        class Try {
        public static void main (String[] s){
        Nothing app = new Nothing();
        app.apple();
        }
                
                
        }
    
