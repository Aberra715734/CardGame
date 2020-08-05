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
public class PasswordValidator {
    public static void main (String[] s){
    Scanner input = new Scanner(System.in);
    
    boolean valid =false;
    
    do 
    {
        String password =input.next();
        if (checkLength(password) && checkUpper(password)){
        valid=true;
        System.out.println("Valid Password ");
        }
    } while(valid);
    
    }
    public static boolean checkUpper(String pass){
    for(int i=0; i<pass.length();i++){
        if (Character.isUpperCase(pass.charAt(i)))
        {
            return true;
        }
       }
        return false;
    
    }
    public static boolean checkLength(String password){
        if (password.length()>=8)
        {
            return true;
        }
        return false;
    }
    
}
