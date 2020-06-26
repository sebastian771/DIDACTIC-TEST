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
public class ValidationTest {
    
    public ValidationTest() {
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
     * Test of pedirInt method, of class Validation.
     */
    @Test
    public void testPedirInt() {
        System.out.println("pedirInt");
        Validation instance = new Validation();
        int expResult = 0;
        int result = instance.pedirInt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pedirInt method, of class Validation.
     */
    @Test
    public void testPedirInt_String() {
        System.out.println("pedirInt");
        String message = "";
        Validation instance = new Validation();
        int expResult = 0;
        int result = instance.pedirInt(message);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pedirInt method, of class Validation.
     */
    @Test
    public void testPedirInt_String_String() {
        System.out.println("pedirInt");
        String messager = "";
        String messagerError = "";
        Validation instance = new Validation();
        int expResult = 0;
        int result = instance.pedirInt(messager, messagerError);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pedirIntPositivo method, of class Validation.
     */
    @Test
    public void testPedirIntPositivo() {
        System.out.println("pedirIntPositivo");
        Validation instance = new Validation();
        int expResult = 0;
        int result = instance.pedirIntPositivo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pedirIntPositivo method, of class Validation.
     */
    @Test
    public void testPedirIntPositivo_String() {
        System.out.println("pedirIntPositivo");
        String massager = "";
        Validation instance = new Validation();
        int expResult = 0;
        int result = instance.pedirIntPositivo(massager);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pedirIntPositivo method, of class Validation.
     */
    @Test
    public void testPedirIntPositivo_String_String() {
        System.out.println("pedirIntPositivo");
        String massager = "";
        String massagerError = "";
        Validation instance = new Validation();
        int expResult = 0;
        int result = instance.pedirIntPositivo(massager, massagerError);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pedirIntNegativo method, of class Validation.
     */
    @Test
    public void testPedirIntNegativo() {
        System.out.println("pedirIntNegativo");
        Validation instance = new Validation();
        int expResult = 0;
        int result = instance.pedirIntNegativo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pedirIntNegativo method, of class Validation.
     */
    @Test
    public void testPedirIntNegativo_String() {
        System.out.println("pedirIntNegativo");
        String mensaje = "";
        Validation instance = new Validation();
        int expResult = 0;
        int result = instance.pedirIntNegativo(mensaje);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pedirIntNegativo method, of class Validation.
     */
    @Test
    public void testPedirIntNegativo_String_String() {
        System.out.println("pedirIntNegativo");
        String massager = "";
        String massagerError = "";
        Validation instance = new Validation();
        int expResult = 0;
        int result = instance.pedirIntNegativo(massager, massagerError);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pedirIntRango method, of class Validation.
     */
    @Test
    public void testPedirIntRango_int_int() {
        System.out.println("pedirIntRango");
        int minimum = 0;
        int maximum = 0;
        Validation instance = new Validation();
        int expResult = 0;
        int result = instance.pedirIntRango(minimum, maximum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pedirIntRango method, of class Validation.
     */
    @Test
    public void testPedirIntRango_3args() {
        System.out.println("pedirIntRango");
        int minimum = 0;
        int maximum = 0;
        String massager = "";
        Validation instance = new Validation();
        int expResult = 0;
        int result = instance.pedirIntRango(minimum, maximum, massager);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pedirIntRango method, of class Validation.
     */
    @Test
    public void testPedirIntRango_4args() {
        System.out.println("pedirIntRango");
        int minimum = 0;
        int maximum = 0;
        String massager = "";
        String massagerError = "";
        Validation instance = new Validation();
        int expResult = 0;
        int result = instance.pedirIntRango(minimum, maximum, massager, massagerError);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
