/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.didactictest.model;

import java.io.IOException;

/**
 *
 * @author David Zambrano
 */
public class Return {
    
    public void returns() throws IOException{
        Student s = new Student();
        s.login();
    }
}
