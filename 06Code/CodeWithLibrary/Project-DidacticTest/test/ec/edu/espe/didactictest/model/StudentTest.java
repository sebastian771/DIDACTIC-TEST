/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.didactictest.model;

import java.util.Scanner;
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
public class StudentTest {
    
    public StudentTest() {
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
     * Test of login method, of class Student.
     */
    @Test
    public void testLogin() throws Exception {
        System.out.println("login");
        Student instance = new Student();
        instance.login();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of relogin method, of class Student.
     */
    @Test
    public void testRelogin() throws Exception {
        System.out.println("relogin");
        Student instance = new Student();
        instance.relogin();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveData method, of class Student.
     */
    @Test
    public void testSaveData() {
        System.out.println("saveData");
        Student instance = new Student();
        boolean expResult = false;
        boolean result = instance.saveData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "";
        String result = Student.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Student.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class Student.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class Student.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        Student instance = new Student();
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class Student.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAge method, of class Student.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        String age = "";
        Student instance = new Student();
        instance.setAge(age);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSchool method, of class Student.
     */
    @Test
    public void testGetSchool() {
        System.out.println("getSchool");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getSchool();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSchool method, of class Student.
     */
    @Test
    public void testSetSchool() {
        System.out.println("setSchool");
        String school = "";
        Student instance = new Student();
        instance.setSchool(school);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getID_Username method, of class Student.
     */
    @Test
    public void testGetID_Username() {
        System.out.println("getID_Username");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getID_Username();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID_Username method, of class Student.
     */
    @Test
    public void testSetID_Username() {
        System.out.println("setID_Username");
        String username = "";
        Student instance = new Student();
        instance.setID_Username(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Student.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Student.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Student instance = new Student();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPasswordA method, of class Student.
     */
    @Test
    public void testGetPasswordA() {
        System.out.println("getPasswordA");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getPasswordA();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPasswordA method, of class Student.
     */
    @Test
    public void testSetPasswordA() {
        System.out.println("setPasswordA");
        String passwordA = "";
        Student instance = new Student();
        instance.setPasswordA(passwordA);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isConfirmation method, of class Student.
     */
    @Test
    public void testIsConfirmation() {
        System.out.println("isConfirmation");
        Student instance = new Student();
        boolean expResult = false;
        boolean result = instance.isConfirmation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConfirmation method, of class Student.
     */
    @Test
    public void testSetConfirmation() {
        System.out.println("setConfirmation");
        boolean confirmation = false;
        Student instance = new Student();
        instance.setConfirmation(confirmation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSave method, of class Student.
     */
    @Test
    public void testIsSave() {
        System.out.println("isSave");
        Student instance = new Student();
        boolean expResult = false;
        boolean result = instance.isSave();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSave method, of class Student.
     */
    @Test
    public void testSetSave() {
        System.out.println("setSave");
        boolean save = false;
        Student instance = new Student();
        instance.setSave(save);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOption method, of class Student.
     */
    @Test
    public void testGetOption() {
        System.out.println("getOption");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getOption();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOption method, of class Student.
     */
    @Test
    public void testSetOption() {
        System.out.println("setOption");
        String option = "";
        Student instance = new Student();
        instance.setOption(option);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWrite method, of class Student.
     */
    @Test
    public void testGetWrite() {
        System.out.println("getWrite");
        Student instance = new Student();
        Scanner expResult = null;
        Scanner result = instance.getWrite();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWrite method, of class Student.
     */
    @Test
    public void testSetWrite() {
        System.out.println("setWrite");
        Scanner write = null;
        Student instance = new Student();
        instance.setWrite(write);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWriten method, of class Student.
     */
    @Test
    public void testGetWriten() {
        System.out.println("getWriten");
        Student instance = new Student();
        Scanner expResult = null;
        Scanner result = instance.getWriten();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWriten method, of class Student.
     */
    @Test
    public void testSetWriten() {
        System.out.println("setWriten");
        Scanner writen = null;
        Student instance = new Student();
        instance.setWriten(writen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMenu method, of class Student.
     */
    @Test
    public void testGetMenu() {
        System.out.println("getMenu");
        Student instance = new Student();
        DTMenu expResult = null;
        DTMenu result = instance.getMenu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMenu method, of class Student.
     */
    @Test
    public void testSetMenu() {
        System.out.println("setMenu");
        DTMenu menu = null;
        Student instance = new Student();
        instance.setMenu(menu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getW method, of class Student.
     */
    @Test
    public void testGetW() {
        System.out.println("getW");
        Student instance = new Student();
        Writer expResult = null;
        Writer result = instance.getW();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setW method, of class Student.
     */
    @Test
    public void testSetW() {
        System.out.println("setW");
        Writer w = null;
        Student instance = new Student();
        instance.setW(w);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Student instance = new Student();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
