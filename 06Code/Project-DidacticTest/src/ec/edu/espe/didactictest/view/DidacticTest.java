/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.didactictest.view;

import ec.edu.espe.didactictest.model.Test;
import java.io.IOException;

/**
 *
 * @author USER
 */
public class DidacticTest {
    public static void main(String[] args) throws Exception {
        
        Test t=new Test();
        
        try {
            t.loadArchive("Question.txt");
            
             t.performTest();
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}
