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
                
            camps[0]="CIENTÍFICO EXPERIMENTAL";
            camps[1]="CIENTÍFICO TÉCNICO";           
            camps[2]="CIENTÍFICO SANITARIO";            
            camps[3]="TEÓRICO HUMANISTA";            
            camps[4]="LITERARIO";
            camps[5]="PSICOPEDAGÓGICO";
            camps[6]="POLÍTICO SOCIAL";
            camps[7]="ECONÓMICO EMPRESARIAL";
            camps[8]="PERSUASIVO COMERCIAL";
            camps[9]="ADMINISTRATIVO";
            camps[10]="DEPORTIVO";
            camps[11]="AGROPECUARIO";
            camps[12]="ARTÍSTICO MUSICAL";
            camps[13]="ARTÍSTICO PLÁSTICO";
            camps[14]="MILITAR SEGURIDAD";
            camps[15]="AVENTURA RIESGO";
            camps[16]="MECÁNICO MANUAL";        
}
    
    
    public void testAnalysis(){        
        Facultys();
        
        String number;
        Test t=new Test();
        Menu2 menu2 = new Menu2();       
        number = menu2.option;       
        int numEntero = Integer.parseInt(number);
        
        System.out.println("Numero " + number);
        
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
        System.out.println("Puntos totales: " + totalPoints);
        System.out.println("Puntos totales2: " + test.totalQuestions);
        
        if(totalPoints >= 300){
            System.out.println("\nTienes las habilidades para esta carrera");
        }
        else{
            System.out.println("\nNo tienes las habilidades para esta carrera");
        }
        
        }

    public void testOption(){
        
        Test t=new Test();        
        String number;        
        Menu2 menu2 = new Menu2();       
        number = menu2.option;       
        int numEntero = Integer.parseInt(number);
        System.out.println("Numero " + number);
        
        System.out.println("Haz realizado el test de: " +camps[numEntero]);
                System.out.println("\n------------------------------------");
                System.out.println("\nResultados:\n");       
                
                try {
                    
                t.loadArchive("Question" + numEntero +".txt");            
                t.performTest();
            
                } catch (IOException ex) {
                     System.out.println(ex.getMessage());
                }
        
        }
    }
    
    
    
    
    
    
    

