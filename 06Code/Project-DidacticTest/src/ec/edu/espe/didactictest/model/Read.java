/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.didactictest.model;


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

    public byte pedirByte() {

        byte num = 0;
        boolean correcto;
        do {
            correcto = true;
            try {
                System.out.println("Introduce un numero entero byte");
                num = sc.nextByte();
            } catch (InputMismatchException ex) {

                correcto = false;
                sc.next();
            }

            if (!correcto) {
                System.out.println("Error, introducce un numero entero byte");
            }

        } while (!correcto);

        return num;
    }

    public byte pedirByte(String mensaje) {

        byte num = 0;
        boolean correcto;
        do {
            correcto = true;
            try {
                System.out.println(mensaje);
                num = sc.nextByte();
            } catch (InputMismatchException ex) {

                correcto = false;
                sc.next();
            }


            if (!correcto) {
                System.out.println("Error, introducce un numero entero byte");
            }

        } while (!correcto);

        return num;
    }

    public byte pedirByte(String mensaje, String mensajeError) {

        byte num = 0;
        boolean correcto;
        do {
            correcto = true;
            try {
                System.out.println(mensaje);
                num = sc.nextByte();
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

 
    public byte pedirBytePositivo() {

        byte num;
        do {
            try {
                System.out.println("Introduce un numero entero byte positivo");
                num = sc.nextByte();
            } catch (InputMismatchException ex) {

                num = -1;
                sc.next();
            }

            if (num < 0) {
                System.out.println("Error, introducce un numero entero byte positivo");
            }

        } while (num < 0);

        return num;
    }

    public byte pedirBytePositivo(String mensaje) {

        byte num;
        do {
            try {
                System.out.println(mensaje);
                num = sc.nextByte();
            } catch (InputMismatchException ex) {
               
                num = -1;
                sc.next();
            }

            if (num < 0) {
                System.out.println("Error, introducce un numero entero byte positivo");
            }

        } while (num < 0);

        return num;
    }

    public byte pedirBytePositivo(String mensaje, String mensajeError) {

        byte num;
        do {
            try {
                System.out.println(mensaje);
                num = sc.nextByte();
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

 
    public byte pedirByteNegativo() {
        byte num;
        do {
            try {
                System.out.println("Introduce un numero entero byte negativo");
                num = sc.nextByte();
            } catch (InputMismatchException ex) {
           
                num = 1;
                sc.next();
            }

            if (num >= 0) {
                System.out.println("Error, introducce un numero entero byte negativo");
            }

        } while (num >= 0);

        return num;
    }

    public byte pedirByteNegativo(String mensaje) {
        byte num;
        do {
            try {
                System.out.println(mensaje);
                num = sc.nextByte();
            } catch (InputMismatchException ex) {
                
                num = 1;
                sc.next();
            }

            if (num >= 0) {
                System.out.println("Error, introducce un numero entero byte negativo");
            }

        } while (num >= 0);

        return num;
    }

  
    public byte pedirByteNegativo(String mensaje, String mensajeError) {
        byte num;
        do {
            try {
                System.out.println(mensaje);
                num = sc.nextByte();
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

 
    public byte pedirByteRango(byte minimo, byte maximo) {
        byte num;


        if (minimo > maximo) {
            byte aux = minimo;
            minimo = maximo;
            maximo = aux;
        }

        do {
            try {
                System.out.println("Introduce un numero byte entre " + minimo + " y " + maximo);
                num = sc.nextByte();
            } catch (InputMismatchException ex) {
  
                num = (byte) (maximo + 1);
                sc.next();
            }

            if (!(num >= minimo && num <= maximo)) {
                System.out.println("Error, Introduce un numero byte entre " + minimo + " y " + maximo);
            }

        } while (!(num >= minimo && num <= maximo));

        return num;
    }

    public byte pedirByteRango(byte minimo, byte maximo, String mensaje) {
        byte num;


        if (minimo > maximo) {
            byte aux = minimo;
            minimo = maximo;
            maximo = aux;
        }

        do {
            try {
                System.out.println(mensaje);
                num = sc.nextByte();
            } catch (InputMismatchException ex) {
  
                num = (byte) (maximo + 1);
                sc.next();
            }

            if (!(num >= minimo && num <= maximo)) {
                System.out.println("Error, Introduce un numero byte entre " + minimo + " y " + maximo);
            }

        } while (!(num >= minimo && num <= maximo));

        return num;
    }

   
    public byte pedirByteRango(byte minimo, byte maximo, String mensaje, String mensajeError) {
        byte num;


        if (minimo > maximo) {
            byte aux = minimo;
            minimo = maximo;
            maximo = aux;
        }

        do {
            try {
                System.out.println(mensaje);
                num = sc.nextByte();
            } catch (InputMismatchException ex) {
          
                num = (byte) (maximo + 1);
                sc.next();
            }

            if (!(num >= minimo && num <= maximo)) {
                System.out.println(mensajeError);
            }

        } while (!(num >= minimo && num <= maximo));

        return num;
    }

  
    public int pedirInt() {

        int num = 0;
        boolean correcto;
        do {
            correcto = true;
            try {
                System.out.println("Introduce un numero entero integer");
                num = sc.nextInt();
            } catch (InputMismatchException ex) {
        
                correcto = false;
                sc.next();
            }

            
            if (!correcto) {
                System.out.println("Error, introducce un numero entero integer");
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
                System.out.println("Error, introducce un numero entero integer");
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
                System.out.println("Introduce un numero entero positivo integer");
                num = sc.nextInt();
            } catch (InputMismatchException ex) {
             
                num = -1;
                sc.next();
            }

            if (num < 0) {
                System.out.println("Error, introducce un numero entero positivo integer");
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
                System.out.println("Error, introducce un numero entero positivo integer");
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
                System.out.println("Introduce un numero entero negativo integer");
                num = sc.nextInt();
            } catch (InputMismatchException ex) {
          
                num = 1;
                sc.next();
            }

            if (num >= 0) {
                System.out.println("Error, introducce un numero entero negativo integer");
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
                System.out.println("Error, introducce un numero entero negativo integer");
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
                System.out.println("Introduce un numero integer entre " + minimo + " y " + maximo);
                num = sc.nextInt();
            } catch (InputMismatchException ex) {
            
                num = maximo + 1;
                sc.next();
            }

            if (!(num >= minimo && num <= maximo)) {
                System.out.println("Error, Introduce un numero integer entre " + minimo + " y " + maximo);
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
                System.out.println("Error, Introduce un numero integer entre " + minimo + " y " + maximo);
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


    public String pedirString() {

        System.out.println("Introduce una cadena");
        String cadena = sc.next();

        return cadena;

    }

    public String pedirString(String mensaje) {

        System.out.println(mensaje);
        String cadena = sc.next();

        return cadena;

    }

  
    public String pedirString(int longitudMaxima) {

        String cadena = "";
        do {
            System.out.println("Introduce una cadena");
            cadena = sc.next();
            
            if(!(cadena.length() < longitudMaxima)){
                System.out.println("Error, la longitud maxima es "+longitudMaxima+" caracteres");
            }
            
        } while (!(cadena.length() < longitudMaxima));

        return cadena;

    }

 
    public String pedirString(int longitudMaxima, String mensaje) {

        String cadena = "";
        do {
            System.out.println(mensaje);
            cadena = sc.next();
            
            if(!(cadena.length() < longitudMaxima)){
                System.out.println("Error, la longitud maxima es "+longitudMaxima+" caracteres");
            }
            
        } while (!(cadena.length() < longitudMaxima));

        return cadena;

    }
 
    public String pedirString(int longitudMaxima, String mensaje, String mensajeError) {

        String cadena = "";
        do {
            System.out.println(mensaje);
            cadena = sc.next();
            
            if(!(cadena.length() < longitudMaxima)){
                System.out.println(mensajeError);
            }
            
        } while (!(cadena.length() < longitudMaxima));

        return cadena;

    }

  
    public long pedirLong() {

        long num = 0;
        boolean correcto;
        do {
            correcto = true;
            try {
                System.out.println("Introduce un numero entero long");
                num = sc.nextLong();
            } catch (InputMismatchException ex) {
           
                correcto = false;
                sc.next();
            }

          
            if (!correcto) {
                System.out.println("Error, introducce un numero entero long");
            }

        } while (!correcto);

        return num;
    }

    
    public long pedirLong(String mensaje) {

        long num = 0;
        boolean correcto;
        do {
            correcto = true;
            try {
                System.out.println(mensaje);
                num = sc.nextLong();
            } catch (InputMismatchException ex) {
                
                correcto = false;
                sc.next();
            }

          
            if (!correcto) {
                System.out.println("Error, introducce un numero entero long");
            }

        } while (!correcto);

        return num;
    }

   
    public long pedirLong(String mensaje, String mensajeError) {

        long num = 0;
        boolean correcto;
        do {
            correcto = true;
            try {
                System.out.println(mensaje);
                num = sc.nextLong();
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

    
    public long pedirLongPositivo() {

        long num;
        do {
            try {
                System.out.println("Introduce un numero entero positivo long");
                num = sc.nextLong();
            } catch (InputMismatchException ex) {
               
                num = -1;
                sc.next();
            }

            if (num < 0) {
                System.out.println("Error, introducce un numero entero positivo long");
            }

        } while (num < 0);

        return num;
    }
    
    
    
}
