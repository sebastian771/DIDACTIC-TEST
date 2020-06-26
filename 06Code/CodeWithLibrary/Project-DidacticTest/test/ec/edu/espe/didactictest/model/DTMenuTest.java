/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.didactictest.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class DTMenuTest {
    
    public DTMenuTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of menu2 method, of class DTMenu.
     */
    @Test
    public void testMenu2() {
        System.out.println("menu2");
        Associate c = null;
        DTMenu instance = new DTMenu();
        instance.menu2(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
    }

    /**
     * Test of getOption method, of class DTMenu.
     */
    @Test
    public void testGetOption() {
        System.out.println("getOption");
        String expResult = "";
        String result = DTMenu.getOption();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!result.equals(expResult)){
        fail("The test case is a prototype.");
        }
    }
    
}
