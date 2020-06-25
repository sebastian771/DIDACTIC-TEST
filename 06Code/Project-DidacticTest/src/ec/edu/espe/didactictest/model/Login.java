/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.didactictest.model;

import java.util.Scanner;

/**
 *
 * @author David Zambrano
 */
public class Login {
   
    Scanner write = new Scanner(System.in);
    public void createAccount(){
        
            System.out.println("DIDACTIC TEST - REGISTER");
            System.out.println("Enter your names:");
            String name=write.nextLine();
            System.out.println("Enter your last name:");
            String lastName=write.nextLine();
            System.out.println("Enter your age:");
            String age=write.nextLine();
            System.out.println("Enter your ID:");
            String indentificationCard=write.nextLine();
            System.out.println("Enter your school");
            String school=write.nextLine();
            
            System.out.println("Your username must be your ID number");
            System.out.println("Username:"); 
            String username=write.nextLine();
            System.out.println("Password:");
            String password=write.nextLine();
            System.out.println("Again the password");
            String passwordA=write.nextLine();
            
            if(username == indentificationCard){
                System.out.println("You have successfully registered");
            }else{
                System.out.println("Not successfully registered :(");
            }
         
    }
}
