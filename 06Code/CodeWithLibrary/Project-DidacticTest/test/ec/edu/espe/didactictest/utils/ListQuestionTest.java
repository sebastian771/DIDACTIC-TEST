/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.didactictest.utils;

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
public class ListQuestionTest {
    
    public ListQuestionTest() {
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
     * Test of isEmpty method, of class ListQuestion.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        ListQuestion instance = new ListQuestion();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class ListQuestion.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ListQuestion instance = new ListQuestion();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class ListQuestion.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int index = 0;
        ListQuestion instance = new ListQuestion();
        Object expResult = null;
        Object result = instance.get(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirst method, of class ListQuestion.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        ListQuestion instance = new ListQuestion();
        Object expResult = null;
        Object result = instance.getFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLast method, of class ListQuestion.
     */
    @Test
    public void testGetLast() {
        System.out.println("getLast");
        ListQuestion instance = new ListQuestion();
        Object expResult = null;
        Object result = instance.getLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addLast method, of class ListQuestion.
     */
    @Test
    public void testAddLast() {
        System.out.println("addLast");
        Object element = null;
        ListQuestion instance = new ListQuestion();
        Object expResult = null;
        Object result = instance.addLast(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFirst method, of class ListQuestion.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        Object element = null;
        ListQuestion instance = new ListQuestion();
        Object expResult = null;
        Object result = instance.addFirst(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class ListQuestion.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object element = null;
        int index = 0;
        ListQuestion instance = new ListQuestion();
        Object expResult = null;
        Object result = instance.add(element, index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ListQuestion.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ListQuestion instance = new ListQuestion();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exists method, of class ListQuestion.
     */
    @Test
    public void testExists() {
        System.out.println("exists");
        Object element = null;
        ListQuestion instance = new ListQuestion();
        boolean expResult = false;
        boolean result = instance.exists(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of indexOf method, of class ListQuestion.
     */
    @Test
    public void testIndexOf() {
        System.out.println("indexOf");
        Object element = null;
        ListQuestion instance = new ListQuestion();
        int expResult = 0;
        int result = instance.indexOf(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFirst method, of class ListQuestion.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        ListQuestion instance = new ListQuestion();
        Object expResult = null;
        Object result = instance.removeFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeLast method, of class ListQuestion.
     */
    @Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        ListQuestion instance = new ListQuestion();
        Object expResult = null;
        Object result = instance.removeLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class ListQuestion.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        int index = 0;
        ListQuestion instance = new ListQuestion();
        Object expResult = null;
        Object result = instance.remove(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modify method, of class ListQuestion.
     */
    @Test
    public void testModify() {
        System.out.println("modify");
        Object element = null;
        int index = 0;
        ListQuestion instance = new ListQuestion();
        Object expResult = null;
        Object result = instance.modify(element, index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
