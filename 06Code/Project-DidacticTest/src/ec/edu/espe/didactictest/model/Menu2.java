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
    
    String option;
    Scanner writen = new Scanner(System.in);
    public void menu2(){
     while(option!="4"){
          System.out.println("DIDACTIC TEST MENU");
          System.out.println("1.Realizar Didactic Test"); 
          System.out.println("2.Realizar Test");
          System.out.println("3.Imprimir Datos");
          System.out.println("4.Salir");
          option=writen.nextLine();
          switch(option){
          case "1":
                 //didactic.didacticTest;             
                 System.out.println("Aun no implementado");
          case "2":
                //test.test();
                
          case "3":
                //filemanager.print();                             
               
          case "4":System.exit(0);
                    
                    
                default:
                    System.out.println("Option not valid, just enter 1, 2 , 3 "
                            + "or, 4");
                    break;
              
                              
          }  
       }
    }
 }
