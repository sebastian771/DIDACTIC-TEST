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
public class ReplyTest {
    
    public ReplyTest() {
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
     * Test of getReply method, of class Reply.
     */
    @Test
    public void testGetReply() {
        System.out.println("getReply");
        Reply instance = null;
        String expResult = "";
        String result = instance.getReply();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCorrectly method, of class Reply.
     */
    @Test
    public void testIsCorrectly() {
        System.out.println("isCorrectly");
        Reply instance = null;
        boolean expResult = false;
        boolean result = instance.isCorrectly();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCorrectly method, of class Reply.
     */
    @Test
    public void testSetCorrectly() {
        System.out.println("setCorrectly");
        boolean correctly = false;
        Reply instance = null;
        instance.setCorrectly(correctly);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Reply.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Reply instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
