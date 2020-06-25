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
public class Menu2 {

    public static String getOption() {
        return option;
    }
   
    public static String option;
    Scanner writen = new Scanner(System.in);
    
    
    public void menu2(Constructor c){
     while(option!="4"){
          System.out.println("Welcome to the DIDACTIC TEST "+c.getUsername());
          System.out.println("1.Perform Didactic Test"); 
          System.out.println("2.Take Test");
          System.out.println("3.Print Data");
          System.out.println("4.Exit");
          option=writen.nextLine();
          switch(option){
          case "1":
                 //didactic.didacticTest;             
                 System.out.println("Not yet implemented!!!");
                 break;
          case "2":
              
                Analysis analysis = new Analysis();
                analysis.Facultys();
               
                Scanner read = new Scanner(System.in);
                
                for (int i=0; i< 17; i++)
                {                      
                    System.out.println(i+1 + "  " + analysis.camps[i]);;
                }
                
                System.out.println("Enter the Test you want to take");
                 
                option=read.nextLine();           
                analysis.testAnalysis();
                break;
          case "3":               
                break;
          case "4":System.exit(0);                   
                    
                default:
                    System.out.println("Option not valid, just enter 1, 2 , 3 "
                            + "or, 4");
                    break;
              
                              
          }  
       }
    }
    public void performTest(){
              
      }
    }
 
