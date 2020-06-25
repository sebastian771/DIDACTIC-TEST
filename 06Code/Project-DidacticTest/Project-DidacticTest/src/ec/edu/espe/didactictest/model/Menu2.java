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
    
    
<<<<<<< HEAD:06Code/Project-DidacticTest/src/ec/edu/espe/didactictest/model/Menu2.java
    public void menu2(Constructor c){
     while(option!="4"){
          System.out.println("Welcome to the DIDACTIC TEST "+c.getUsername());
=======
    public void menu2(){
     //while(option!="4"){
          System.out.println("DIDACTIC TEST MENU");
>>>>>>> 1c45afe551f3809219f34a29bcb1e1ab823b9fcb:06Code/Project-DidacticTest/Project-DidacticTest/src/ec/edu/espe/didactictest/model/Menu2.java
          System.out.println("1.Realizar Didactic Test"); 
          System.out.println("2.Realizar Test");
          System.out.println("3.Imprimir Datos");
          System.out.println("4.Salir");
          option=writen.nextLine();
          switch(option){
          case "1":
                 //didactic.didacticTest;             
                 System.out.println("Aun no implementado");
                 break;
          case "2":
              
                Analysis analysis = new Analysis();
                analysis.Facultys();
<<<<<<< HEAD:06Code/Project-DidacticTest/src/ec/edu/espe/didactictest/model/Menu2.java
               
                Scanner read = new Scanner(System.in);
                
                for (int i=0; i< 17; i++)
                {                      
                    System.out.println(i+1 + "  " + analysis.camps[i]);;
                }
                
                System.out.println("Ingrese el Test que desea realizar");
                 
                option=read.nextLine();           
                analysis.testAnalysis();
=======
                Scanner read = new Scanner(System.in);
                
                for (int i=0; i< 17; i++)
                {                      
                    System.out.println(i+1 + "  " + analysis.camps[i]);;
                }
                
                System.out.println("Ingrese el Test que desea realizar");
                
                option=read.nextLine();           
                
>>>>>>> 1c45afe551f3809219f34a29bcb1e1ab823b9fcb:06Code/Project-DidacticTest/Project-DidacticTest/src/ec/edu/espe/didactictest/model/Menu2.java
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
    
    public void performTest(){
              
      }
    }
<<<<<<< HEAD:06Code/Project-DidacticTest/src/ec/edu/espe/didactictest/model/Menu2.java
    public void performTest(){
              
      }
    }
 
=======
 //}
>>>>>>> 1c45afe551f3809219f34a29bcb1e1ab823b9fcb:06Code/Project-DidacticTest/Project-DidacticTest/src/ec/edu/espe/didactictest/model/Menu2.java
