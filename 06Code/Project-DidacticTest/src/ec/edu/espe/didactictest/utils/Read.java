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
public class Read {
    
    private Scanner sc;

    public Read() {
        sc = new Scanner(System.in);
        sc.useDelimiter("\n"); 
        sc.useLocale(Locale.US); 
    }   
  
    public int pedirInt() {
        int num = 0;
        boolean correcto;
        
        do {
            correcto = true;
            try {
                System.out.println("Enter a integer number");
                num = sc.nextInt();
            } catch (InputMismatchException ex) {        
                correcto = false;
                sc.next();
            }
            
            if (!correcto) {
                System.out.println("Error, enter an integer");
            }

        } while (!correcto);
        
        return num;
    }

   
    public int pedirInt(String mensaje) {        
        int num = 0;
        boolean correcto;
        do {
            correcto = true;
            try {
                System.out.println(mensaje);
                num = sc.nextInt();
            } catch (InputMismatchException ex) {              
                correcto = false;
                sc.next();
            }
            
            if (!correcto) {
                System.out.println("Error, enter an integer");
            }

        } while (!correcto);
        
        return num;
    }

  
    public int pedirInt(String mensaje, String mensajeError) {
        int num = 0;
        boolean correcto;
        
        do {
            correcto = true;
            try {
                System.out.println(mensaje);
                num = sc.nextInt();
            } catch (InputMismatchException ex) {             
                correcto = false;
                sc.next();
            }
        
            if (!correcto) {
                System.out.println(mensajeError);
            }
        } while (!correcto);
        
        return num;
    }

   
    public int pedirIntPositivo() {
        int num;
        
        do {
            try {
                    System.out.println("Enter a positive integer");
                num = sc.nextInt();
            } catch (InputMismatchException ex) {             
                num = -1;
                sc.next();
            }

            if (num < 0) {
                System.out.println("Error, enter a positive integer");
            }

        } while (num < 0);
        
        return num;
    }

  
    public int pedirIntPositivo(String mensaje) {
        int num;
        
        do {
            try {
                System.out.println(mensaje);
                num = sc.nextInt();
            } catch (InputMismatchException ex) {             
                num = -1;
                sc.next();
            }

            if (num < 0) {
                System.out.println("Error, enter a positive integer");
            }

        } while (num < 0);
        
        return num;
    }
 
    public int pedirIntPositivo(String mensaje, String mensajeError) {
        int num;
        
        do {
            try {
                System.out.println(mensaje);
                num = sc.nextInt();
            } catch (InputMismatchException ex) {         
                num = -1;
                sc.next();
            }

            if (num < 0) {
                System.out.println(mensajeError);
            }

        } while (num < 0);
        
        return num;
    }

   
    public int pedirIntNegativo() {
        int num;
        do {
            try {
                System.out.println("Enter a negative integer");
                num = sc.nextInt();
            } catch (InputMismatchException ex) {
          
                num = 1;
                sc.next();
            }

            if (num >= 0) {
                System.out.println("Error, enter a negative integer");
            }

        } while (num >= 0);

        return num;
    }

   
    public int pedirIntNegativo(String mensaje) {
        int num;
        do {
            try {
                System.out.println(mensaje);
                num = sc.nextInt();
            } catch (InputMismatchException ex) {
              
                num = 1;
                sc.next();
            }

            if (num >= 0) {
                System.out.println("Error, enter a negative integer");
            }

        } while (num >= 0);

        return num;
    }

    public int pedirIntNegativo(String mensaje, String mensajeError) {
        int num;
        do {
            try {
                System.out.println(mensaje);
                num = sc.nextInt();
            } catch (InputMismatchException ex) {
              
                num = 1;
                sc.next();
            }

            if (num >= 0) {
                System.out.println(mensajeError);
            }

        } while (num >= 0);

        return num;
    }

 
    public int pedirIntRango(int minimo, int maximo) {
        int num;
     
        if (minimo > maximo) {
            int aux = minimo;
            minimo = maximo;
            maximo = aux;
        }

        do {
            try {
                System.out.println("Enter an integer number between " + minimo + " & " + maximo);
                num = sc.nextInt();
            } catch (InputMismatchException ex) {            
                num = maximo + 1;
                sc.next();
            }

            if (!(num >= minimo && num <= maximo)) {
                System.out.println("Error, Enter an integer number between " + minimo + " & " + maximo);
            }

        } while (!(num >= minimo && num <= maximo));

        return num;
    }

  
    public int pedirIntRango(int minimo, int maximo, String mensaje) {
        int num;
     
        if (minimo > maximo) {
            int aux = minimo;
            minimo = maximo;
            maximo = aux;
        }

        do {
            try {
                System.out.println(mensaje);
                num = sc.nextInt();
            } catch (InputMismatchException ex) {                
                num = maximo + 1;
                sc.next();
            }

            if (!(num >= minimo && num <= maximo)) {
                System.out.println("Error, Enter an integer number between " + minimo + " & " + maximo);
            }

        } while (!(num >= minimo && num <= maximo));

        return num;
    }

  
    public int pedirIntRango(int minimo, int maximo, String mensaje, String mensajeError) {
        int num;

        if (minimo > maximo) {
            int aux = minimo;
            minimo = maximo;
            maximo = aux;
        }

        do {
            try {
                System.out.println(mensaje);
                num = sc.nextInt();
            } catch (InputMismatchException ex) {    
                num = maximo + 1;
                sc.next();
            }

            if (!(num >= minimo && num <= maximo)) {
                System.out.println(mensajeError);
            }

        } while (!(num >= minimo && num <= maximo));

        return num;
    }       
}
