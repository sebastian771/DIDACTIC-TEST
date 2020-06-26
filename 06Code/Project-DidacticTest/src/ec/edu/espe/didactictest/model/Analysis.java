/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.didactictest.model;

import ec.edu.espe.didactictest.utils.FileManager;
import java.io.IOException;

/**
 *
 * @author Mati
 */
public class Analysis {

    String[] camps = new String[17];
    int totalPoints;
    String result;
   
    public void Facultys() {

        camps[0] = "EXPERIMENTAL SCIENTIST";
        camps[1] = "TECHNICAL SCIENTIST";
        camps[2] = "HEALTH SCIENTIST";
        camps[3] = "HUMANIST THEORETICAL";
        camps[4] = "LITERARY";
        camps[5] = "PSYCHOPEDAGOGICAL";
        camps[6] = "SOCIAL POLITICAL";
        camps[7] = "BUSINESS ECONOMIC";
        camps[8] = "BUSINESS PERSUASIVE";
        camps[9] = "ADMINISTRATIVE";
        camps[10] = "SPORTS";
        camps[11] = "FARMER";
        camps[12] = "MUSICAL ARTISTIC";
        camps[13] = "ARTISTIC PLASTIC";
        camps[14] = "MILITARY SECURITY";
        camps[15] = "RISK ADVENTURE";
        camps[16] = "MANUAL MECHANICAL";
    }

    public void testAnalysis() {
        Facultys();

        String number;
        Test t = new Test();
        DTMenu menu2 = new DTMenu();
        
        number = menu2.option;          

        switch (number) {
            case "1":
                testOption();
                Results();
                saveTest();
                break;

            case "2":
                testOption();
                Results();
                saveTest();
                break;

            case "3":
                testOption();
                Results();
                saveTest();
                break;

            case "4":
                testOption();
                Results();
                saveTest();
                break;
                
            case "5":
                testOption();
                Results();
                saveTest();
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
                
            case "17":
                testOption();
                Results();
                break;
        }
    }

    public void Results() {

        DTMenu menu2 = new DTMenu();
        Test test = new Test();
        String number;             
                
        number = menu2.option; 
        int numEntero = Integer.parseInt(number);
        
        System.out.println("Total points: " + test.getTotalPoints());      

        if (totalPoints >= 7) {
            System.out.println("\nTienes las habilidades para esta carrera");
            result = "\nTus habilidades para la carrera de:" + camps[numEntero] 
                    + "\nTu puntuación en esta carreara es del " + 
                    test.getTotalPoints() + "0%";
        } else {
            System.out.println("\nNo tienes las habilidades para esta carrera");
            result = "\nTus habilidades para la carrera de:" + camps[numEntero] 
                    + "\nTu puntuación en esta carreara es del " + 
                    test.getTotalPoints() + "0%";
        }

    }

    public void testOption() {
        Test t = new Test();
        DTMenu menu2 = new DTMenu();
        
        String number;        
        number = menu2.option;
        int integer = Integer.parseInt(number);

        System.out.println("You have taken the test: " + camps[integer]);
        System.out.println("\n------------------------------------");
        System.out.println("\nResults:\n");

        try {
            t.loadArchive("Question" + integer + ".txt");
            t.performTest();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void saveTest() {
        FileManager fileManager = new FileManager();
        Student student = new Student();
        
        String fileName = student.getUsername() + ".txt";
        
        fileManager.createFile(fileName);
        fileManager.writeString(toString(), student.toString(), fileName);
    }

    public int getTotalPints() {
        return totalPoints;
    }

    public void setTotalPints(int totalPints) {
        this.totalPoints = totalPints;
    }    
    
    @Override
    public String toString() {
        return "\n-----------Analysis of results-----------" + result;
    }
}
