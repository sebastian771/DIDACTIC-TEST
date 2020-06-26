/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.didactictest.utils;


import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Sebastian
 */
public class Validation {
    
    private Scanner sc;

    public Validation() {
        sc = new Scanner(System.in);
        sc.useDelimiter("\n"); 
        sc.useLocale(Locale.US); 
    }   
  
    public int pedirInt() {
        int number = 0;
        boolean correct;
        
        do {
            correct = true;
            try {
                System.out.println("Enter a integer number");
                number = sc.nextInt();
            } catch (InputMismatchException ex) {        
                correct = false;
                sc.next();
            }
            
            if (!correct) {
                System.out.println("Error, enter an integer");
            }

        } while (!correct);
        
        return number;
    }

   
    public int pedirInt(String message) {        
        int number = 0;
        boolean correct;
        do {
            correct = true;
            try {
                System.out.println(message);
                number = sc.nextInt();
            } catch (InputMismatchException ex) {              
                correct = false;
                sc.next();
            }
            
            if (!correct) {
                System.out.println("Error, enter an integer");
            }

        } while (!correct);
        
        return number;
    }

  
    public int pedirInt(String messager, String messagerError) {
        int number = 0;
        boolean correct;
        
        do {
            correct = true;
            try {
                System.out.println(messager);
                number = sc.nextInt();
            } catch (InputMismatchException ex) {             
                correct = false;
                sc.next();
            }
        
            if (!correct) {
                System.out.println(messagerError);
            }
        } while (!correct);
        
        return number;
    }

   
    public int pedirIntPositivo() {
        int number;
        
        do {
            try {
                    System.out.println("Enter a positive integer");
                number = sc.nextInt();
            } catch (InputMismatchException ex) {             
                number = -1;
                sc.next();
            }

            if (number < 0) {
                System.out.println("Error, enter a positive integer");
            }

        } while (number < 0);
        
        return number;
    }

  
    public int pedirIntPositivo(String massager) {
        int number;
        
        do {
            try {
                System.out.println(massager);
                number = sc.nextInt();
            } catch (InputMismatchException ex) {             
                number = -1;
                sc.next();
            }

            if (number < 0) {
                System.out.println("Error, enter a positive integer");
            }

        } while (number < 0);
        
        return number;
    }
 
    public int pedirIntPositivo(String massager, String massagerError) {
        int number;
        
        do {
            try {
                System.out.println(massager);
                number = sc.nextInt();
            } catch (InputMismatchException ex) {         
                number = -1;
                sc.next();
            }

            if (number < 0) {
                System.out.println(massagerError);
            }

        } while (number < 0);
        
        return number;
    }

   
    public int pedirIntNegativo() {
        int number;
        do {
            try {
                System.out.println("Enter a negative integer");
                number = sc.nextInt();
            } catch (InputMismatchException ex) {
          
                number = 1;
                sc.next();
            }

            if (number >= 0) {
                System.out.println("Error, enter a negative integer");
            }

        } while (number >= 0);

        return number;
    }

   
    public int pedirIntNegativo(String mensaje) {
        int number;
        do {
            try {
                System.out.println(mensaje);
                number = sc.nextInt();
            } catch (InputMismatchException ex) {
              
                number = 1;
                sc.next();
            }

            if (number >= 0) {
                System.out.println("Error, enter a negative integer");
            }

        } while (number >= 0);

        return number;
    }

    public int pedirIntNegativo(String massager, String massagerError) {
        int number;
        do {
            try {
                System.out.println(massager);
                number = sc.nextInt();
            } catch (InputMismatchException ex) {
              
                number = 1;
                sc.next();
            }

            if (number >= 0) {
                System.out.println(massagerError);
            }

        } while (number >= 0);

        return number;
    }

 
    public int pedirIntRango(int minimum, int maximum) {
        int number;
     
        if (minimum > maximum) {
            int aux = minimum;
            minimum = maximum;
            maximum = aux;
        }

        do {
            try {
                System.out.println("Enter an integer number between " + minimum + " & " + maximum);
                number = sc.nextInt();
            } catch (InputMismatchException ex) {            
                number = maximum + 1;
                sc.next();
            }

            if (!(number >= minimum && number <= maximum)) {
                System.out.println("Error, Enter an integer number between " + minimum + " & " + maximum);
            }

        } while (!(number >= minimum && number <= maximum));

        return number;
    }

  
    public int pedirIntRango(int minimum, int maximum, String massager) {
        int number;
     
        if (minimum > maximum) {
            int aux = minimum;
            minimum = maximum;
            maximum = aux;
        }

        do {
            try {
                System.out.println(massager);
                number = sc.nextInt();
            } catch (InputMismatchException ex) {                
                number = maximum + 1;
                sc.next();
            }

            if (!(number >= minimum && number <= maximum)) {
                System.out.println("Error, Enter an integer number between " + minimum + " & " + maximum);
            }

        } while (!(number >= minimum && number <= maximum));

        return number;
    }

  
    public int pedirIntRango(int minimum, int maximum, String massager, String massagerError) {
        int num;

        if (minimum > maximum) {
            int aux = minimum;
            minimum = maximum;
            maximum = aux;
        }

        do {
            try {
                System.out.println(massager);
                num = sc.nextInt();
            } catch (InputMismatchException ex) {    
                num = maximum + 1;
                sc.next();
            }

            if (!(num >= minimum && num <= maximum)) {
                System.out.println(massagerError);
            }

        } while (!(num >= minimum && num <= maximum));

        return num;
    }       
}
