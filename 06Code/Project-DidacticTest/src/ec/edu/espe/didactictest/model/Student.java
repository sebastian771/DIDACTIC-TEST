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
public class Student {
    String name;
    String lastName;
    String age;
    String indentificationCard;
    String school;
    String fitness;
    String inclination;
    String affinity;
    String taste;
    String quality;
    String username="Unregistered username";
    String password;
    String passwordA;
    boolean confirmation;
    private boolean save;
    private String option; 
     
     private Scanner write = new Scanner(System.in);
     private Scanner writen = new Scanner(System.in);
     Menu2 menu = new Menu2();
     Write w = new Write();
    public void studentData(){
   
    }
    public void login(){
        
        while(option !="3"){
             try{
            System.out.println("DIDACTIC TEST - LOG IN");
            System.out.println("1.Register"); 
            System.out.println("2.Log in");
            System.out.println("3.-Exit");
                option=writen.nextLine();
            }catch(Exception ex){
                 ex.printStackTrace();       
            }
         switch (option) {
       
          
          case "1":  
            System.out.println("DIDACTIC TEST - REGISTER");
            System.out.println("Enter your names:");
            name=write.nextLine();
            System.out.println("Enter your last name:");
            lastName=write.nextLine();
            System.out.println("Enter your age:");
            age=write.nextLine();
            System.out.println("Enter your ID:");
            indentificationCard=write.nextLine();
            System.out.println("Enter your school");
            school=write.nextLine();
            
            System.out.println("Your username must be your ID number");
            System.out.println("Username:"); 
            username=write.nextLine();
            System.out.println("Password:");
            password=write.nextLine();
            System.out.println("Again the password");
            passwordA=write.nextLine();
            Constructor c = new Constructor(username,passwordA);
             w.user(c);
            if(username.equals(indentificationCard)){
                System.out.println("You have successfully registered");
            }else{
                System.out.println("Not successfully registered :(");
            }
       
                     break;
                    
                case "2":                  
                
                   System.out.println("DIDACTIC TEST - LOG IN");                    
                   System.out.println("Username is:" + username);
                   
                    if(username.equals(indentificationCard)){
                   System.out.println("Password:");
                   if (password.equals(passwordA)){
                        password=write.nextLine();
                       menu.menu2();
                   }
                  
                   
                   }else{
                    System.out.println("It does not have yet. Sign up!!"); 
                    }
                    
                   break;
                case "3":
                    System.exit(0);
                    
                    
                default:
                    System.out.println("Option not valid, just enter \"1\", "
                            + "\"2\" or \"3\"");
                    break;
            }

       }
 }
    public void deleteAccount(){
        
    }
    public void registerCapacities(){
        
    }
    public boolean saveData(){
        return false;
    }
    public void edit(){
        
    }
}

 






