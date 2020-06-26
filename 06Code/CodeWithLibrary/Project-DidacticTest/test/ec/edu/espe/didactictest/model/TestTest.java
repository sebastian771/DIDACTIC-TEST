
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.didactictest.model;

import ec.edu.espe.didactictest.utils.ListQuestion;
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
public class TestTest {
    
    public TestTest() {
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
     * Test of getQuestions method, of class Test.
     */
    @Test
    public void testGetQuestions() {
        System.out.println("getQuestions");
        ec.edu.espe.didactictest.model.Test instance = new ec.edu.espe.didactictest.model.Test();
        ListQuestion<Question> expResult = null;
        ListQuestion<Question> result = instance.getQuestions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalPoints method, of class Test.
     */
    @Test
    public void testGetTotalPoints() {
        System.out.println("getTotalPoints");
        int expResult = 0;
        int result = ec.edu.espe.didactictest.model.Test.getTotalPoints();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotalPoints method, of class Test.
     */
    @Test
    public void testSetTotalPoints() {
        System.out.println("setTotalPoints");
        int totalPoints = 0;
        ec.edu.espe.didactictest.model.Test.setTotalPoints(totalPoints);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalQuestions method, of class Test.
     */
    @Test
    public void testGetTotalQuestions() {
        System.out.println("getTotalQuestions");
        int expResult = 0;
        int result = ec.edu.espe.didactictest.model.Test.getTotalQuestions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuestionID method, of class Test.
     */
    @Test
    public void testGetQuestionID() {
        System.out.println("getQuestionID");
        ec.edu.espe.didactictest.model.Test instance = new ec.edu.espe.didactictest.model.Test();
        int expResult = 0;
        int result = instance.getQuestionID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nextQuestion method, of class Test.
     */
    @Test
    public void testNextQuestion() {
        System.out.println("nextQuestion");
        ec.edu.espe.didactictest.model.Test instance = new ec.edu.espe.didactictest.model.Test();
        Question expResult = null;
        Question result = instance.nextQuestion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restartTest method, of class Test.
     */
    @Test
    public void testRestartTest() {
        System.out.println("restartTest");
        ec.edu.espe.didactictest.model.Test instance = new ec.edu.espe.didactictest.model.Test();
        instance.restartTest();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of performTest method, of class Test.
     */
    @Test
    public void testPerformTest() {
        System.out.println("performTest");
        ec.edu.espe.didactictest.model.Test instance = new ec.edu.espe.didactictest.model.Test();
        instance.performTest();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadArchive method, of class Test.
     */
    @Test
    public void testLoadArchive() throws Exception {
        System.out.println("loadArchive");
        String archive = "";
        ec.edu.espe.didactictest.model.Test instance = new ec.edu.espe.didactictest.model.Test();
        instance.loadArchive(archive);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of totalQuestions method, of class Test.
     */
    @Test
    public void testTotalQuestions() {
        System.out.println("totalQuestions");
        ec.edu.espe.didactictest.model.Test instance = new ec.edu.espe.didactictest.model.Test();
        instance.totalQuestions();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
