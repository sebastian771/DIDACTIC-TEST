/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.didactictest.utils;
import ec.edu.espe.didactictest.view.DidacticTest;
import java.awt.Desktop;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author USER
 */
public class FileManager {
     public boolean removeFile(String fileName){       
        
        try{
            File fichero = new File(fileName);
            if (fichero.delete()){
                System.out.println("Erase archive");
            }                
            else{
                System.out.println("Error");
        }           
            
        } catch(Exception e){
            System.err.println("Error---->" + e.getMessage());
        }       
        return false;
    }   
    
    public boolean openFileForRead(String fileName){             
     try {

            File objetofile = new File (fileName);
            Desktop.getDesktop().open(objetofile);

             }catch (IOException ex) {
                     System.out.println(ex);                     
             }       
        
        return true;
    }
    
    public boolean createFile(String fileName){
        File archivetxt;            
        
        try{
        System.out.println("creating File" + fileName);
        
         archivetxt = new File(fileName);
                
        if(!archivetxt.exists()){
            try {
                archivetxt.createNewFile();                
          } catch (IOException ex) {
              Logger.getLogger(DidacticTest.class.getName()).log(Level.SEVERE, null, ex);
          }          
        }
         else {
            System.out.println("Archive ---->" +fileName + "<---- Alredy exist");
        }  
        
        return true;
            
        }catch(Exception ex){
            System.out.println("Messages and acctions taken after a fail");
        
        return false;
        }
    }   
    
    public boolean writeString(String result, String dataStudent, String fileName){
        File archivetxt;
        FileWriter write;
        PrintWriter line;  
        
        try{
        System.out.println("saving" +result+ "into "+ fileName);   
              
        archivetxt = new File(fileName);
                
        if(!archivetxt.exists()){
            try {                          
                write = new FileWriter(archivetxt,true); 
                line = new PrintWriter(write);
                line.println(result);
                line.println(dataStudent);
                line.close();
                write.close();
          } catch (IOException ex) {
                Logger.getLogger(DidacticTest.class.getName()).log(Level.SEVERE, null, ex);
          }
          
        }
       else {
            try {
                write = new FileWriter(archivetxt,true); 
                line = new PrintWriter(write);
                line.println(result);
                line.println(dataStudent);
                line.close();
                write.close();
          } catch (IOException ex) {
              Logger.getLogger(DidacticTest.class.getName()).log(Level.SEVERE, null, ex);
              }
        }   
        
        return true;
    }
        
    catch(Exception ex){
        System.out.println("Writing a string infile a fail");
        return false;
        }
}
    
    public String read(String fileName) {
        try {
            String data = "";
            System.out.println("reading from File " + fileName);
            String cadena;
            FileReader f = new FileReader(fileName);
            BufferedReader b = new BufferedReader(f);
            while((cadena = b.readLine())!=null) {
            System.out.println(cadena);
            }
            b.close();         
            
            data = "Lucy,white,2,false";
            return data;

        } catch (Exception ex) {
            System.out.println("Reading file " + fileName + " Failed :( ");
            
            return "";
   }
 }
}
