/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class PasswordValidatorTest {
    
    public PasswordValidatorTest() {
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
     * Test of main method, of class PasswordValidator.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] s = null;
        PasswordValidator.main(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkUpper method, of class PasswordValidator.
     */
    @Test
    public void testCheckUpper() {
        System.out.println("checkUpper");
        String pass = "";
        boolean expResult = false;
        boolean result = PasswordValidator.checkUpper(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of checkLength method, of class PasswordValidator.
     */
    @Test
    public void testCheckLength() {
        System.out.println("checkLength");
        String password = "df ygygugd d d";
        boolean expResult = false;
        boolean result = PasswordValidator.checkLength(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
        @Test
    public void testCheckLengthA() {
        System.out.println("checkLength");
        String password = "y";
        boolean expResult = false;
        boolean result = PasswordValidator.checkLength(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
        @Test
    public void testCheckLengthBad() {
        System.out.println("checkLength");
        String password = "df d d d";
        boolean expResult = false;
        boolean result = PasswordValidator.checkLength(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
}
