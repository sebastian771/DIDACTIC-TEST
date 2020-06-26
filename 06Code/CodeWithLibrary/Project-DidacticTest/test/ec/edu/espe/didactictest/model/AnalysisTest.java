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
public class AnalysisTest {
    
    public AnalysisTest() {
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
     * Test of Facultys method, of class Analysis.
     */
    @Test
    public void testFacultys() {
        System.out.println("Facultys");
        Analysis instance = new Analysis();
        instance.Facultys();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of testAnalysis method, of class Analysis.
     */
    @Test
    public void testTestAnalysis() {
        System.out.println("testAnalysis");
        Analysis instance = new Analysis();
        instance.testAnalysis();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Results method, of class Analysis.
     */
    @Test
    public void testResults() {
        System.out.println("Results");
        Analysis instance = new Analysis();
        instance.Results();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of testOption method, of class Analysis.
     */
    @Test
    public void testTestOption() {
        System.out.println("testOption");
        Analysis instance = new Analysis();
        instance.testOption();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveTest method, of class Analysis.
     */
    @Test
    public void testSaveTest() {
        System.out.println("saveTest");
        Analysis instance = new Analysis();
        instance.saveTest();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalPints method, of class Analysis.
     */
    @Test
    public void testGetTotalPints() {
        System.out.println("getTotalPints");
        Analysis instance = new Analysis();
        int expResult = 0;
        int result = instance.getTotalPints();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotalPints method, of class Analysis.
     */
    @Test
    public void testSetTotalPints() {
        System.out.println("setTotalPints");
        int totalPints = 0;
        Analysis instance = new Analysis();
        instance.setTotalPints(totalPints);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Analysis.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Analysis instance = new Analysis();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
