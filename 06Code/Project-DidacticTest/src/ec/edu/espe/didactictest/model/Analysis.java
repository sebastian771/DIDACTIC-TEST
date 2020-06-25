/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.didactictest.model;

import java.io.IOException;

/**
 *
 * @author Mati
 */
public class Analysis {
    
    
    String [ ] camps = new String [17];
    int totalPoints;
    
    public int getTotalPints() {
        return totalPoints;
    }

    public void setTotalPints(int totalPints) {
        this.totalPoints = totalPints;
    }
    
    public void Facultys(){
                
            camps[0]="EXPERIMENTAL SCIENTIST";
            camps[1]="TECHNICAL SCIENTIST";           
            camps[2]="HEALTH SCIENTIST";            
            camps[3]="HUMANIST THEORETICAL";            
            camps[4]="LITERARY";
            camps[5]="PSYCHOPEDAGOGICAL";
            camps[6]="SOCIAL POLITICAL";
            camps[7]="BUSINESS ECONOMIC";
            camps[8]="BUSINESS PERSUASIVE";
            camps[9]="ADMINISTRATIVE";
            camps[10]="SPORTS";
            camps[11]="FARMER";
            camps[12]="MUSICAL ARTISTIC";
            camps[13]="ARTISTIC PLASTIC";
            camps[14]="MILITARY SECURITY";
            camps[15]="RISK ADVENTURE";
            camps[16]="MANUAL MECHANICAL";        
}
    
    
    public void testAnalysis(){        
        Facultys();
        
        String number;
        Test t=new Test();
        Menu2 menu2 = new Menu2();       
        number = menu2.option;       
        int numEntero = Integer.parseInt(number);
        
        System.out.println("Number " + number);
        
        switch(number){
            case "0":
                testOption();
                Results();                
            break;
            
            case "1":
                testOption();
                Results();                
            break;
            
            case "2":
                testOption();
                Results();
            break;
            
            case "3":
                testOption();
                Results();
            break;
            case "4":
                testOption();
                Results();
            break;
            case "5":
                testOption();
                Results();
            break;
            case "6":
                testOption();
                Results();
            break;
            case "7":
                testOption();
                Results();
            break;
            case "8":
                testOption();
                Results();
            break;
            case "9":
                testOption();
                Results();
            break;
            case "10":
                testOption();
                Results();
            break;
            case "11":
                testOption();
                Results();
            break;
            case "12":
                testOption();
                Results();
            break;
            case "13":
                testOption();
                Results();
            break;
            case "14":
                testOption();
                Results();
            break;   
            case "15":
                testOption();
                Results();
            break;  
            case "16":
                testOption();
                Results();
            break;  
        }           
}
    
    public void Results(){
        
        Test test = new Test();
        int totalPoints = test.totalQuestions;
        //System.out.println("Total points: " + totalPoints);
        //System.out.println("Total Points2: " + test.totalQuestions);
        
        if(totalPoints >= 300){
            System.out.println("\nYou have the skills for this race");
        }
        else{
            System.out.println("\nYou don't have the skills for this race");
        }
        
        }

    public void testOption(){
        
        Test t=new Test();        
        String number;        
        Menu2 menu2 = new Menu2();       
        number = menu2.option;       
        int numEntero = Integer.parseInt(number);
        System.out.println("Number " + number);
        
        System.out.println("You have taken the test: " +camps[numEntero]);
                System.out.println("\n------------------------------------");
                System.out.println("\nResults:\n");       
                
                try {
                    
                t.loadArchive("Question" + numEntero +".txt");            
                t.performTest();
            
                } catch (IOException ex) {
                     System.out.println(ex.getMessage());
                }
        
        }
    }
    
    
    
    
    
    
    

