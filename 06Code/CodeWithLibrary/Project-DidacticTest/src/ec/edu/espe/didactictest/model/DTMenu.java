/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.didactictest.model;

import ec.edu.espe.filemanagerlibrary.FileManager;
import java.util.Scanner;

/**
 *
 * @author David Zambrano
 */
public class DTMenu {   

    public static String option;
    Scanner writen = new Scanner(System.in);

    public void menu2(Associate c) {
        while (option != "4") {
            
            System.out.println("-----------Welcome to the DIDACTIC TEST-----------");
            System.out.println("1.Perform Didactic Test");
            System.out.println("2.Take Test");
            System.out.println("3.Print Data");
            System.out.println("4.Exit");            
            option = writen.nextLine();
            
            switch (option) {
                case "1":
                    
                    System.out.println("Didactic test will be implemented in "
                                        + "version 2.0 Objects!!!");
                    break;
                    
                case "2":
                    Analysis analysis = new Analysis();
                    Scanner read = new Scanner(System.in);
                    
                    analysis.Facultys();                    

                    for (int i = 0; i < 17; i++) {
                        System.out.println(i + 1 + "  " + analysis.camps[i]);;
                    }
                    System.out.println("Enter the option of the test you want to"
                                       + " take");
                    option = read.nextLine();
                    
                    analysis.testAnalysis();
                    break;
                    
                case "3":
                    Student student = new Student();
                    FileManager fileManager = new FileManager();
                    
                    System.out.println("\n----------Showing tests performed by "
                                      + "the user------------");
                    
                    String fileName = student.getUsername() + ".txt";                    
                    fileManager.openFileForRead(fileName);
                    break;
                    
                case "4":
                    
                    System.exit(0);

                default:
                    System.out.println("Option not valid, just enter 1, 2 , 3 "
                                      + "or, 4");
                    break;
            }
        }
    }
    public static String getOption() {
        return option;
    }   
}
