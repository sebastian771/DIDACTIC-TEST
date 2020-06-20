/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.didactictest.view;

import ec.edu.espe.didactictest.model.Constructor;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author David Zambrano
 */
public class CollectionStudent {
    
    public static void main(String[] args) {
        
       Collection things;
       Collection things2;
       things= new ArrayList(); 
       things2= new ArrayList(); 
      
       Collection<Constructor> students = new ArrayList<>();
        
     
        Collection<Constructor> students2 = new ArrayList<>();
        
     
     for (int i = 0; i < 7; i++){
         students.add(new Constructor("Students_"+(i+1),19+(i+1),"1000P"+(i+1),
                 "School Las Delicias"));
     }
     
      students.forEach((st)-> {
         System.out.println("First school students -->"+st);
   });
       
      
        System.out.println("--------------------------------------------------"
                + "------------------------------------------------------------"
                + "--");
       for (int i = 0; i < 7; i++){
         students2.add(new Constructor("Students_"+(i+1),20+(i+1),"7361LP"+(i+1),
                 "School Nuevo Israel"));
     }
     
      students2.forEach((st)-> {
         System.out.println("Second school students -->"+st);
   });
      
      
    }
   
    
}
