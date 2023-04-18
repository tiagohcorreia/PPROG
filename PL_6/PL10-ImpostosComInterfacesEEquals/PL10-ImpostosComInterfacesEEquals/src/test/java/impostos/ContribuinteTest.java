/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impostos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author ISEP-DEI-PPROG
 */
public class ContribuinteTest {
    
    private Contribuinte ctb1, ctb2, ctb3, instance;
    public ContribuinteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        ctb1 = new Desempregado("Pedro Silva","Faro",3000.0f,2);
        ctb2 = new Reformado("António Sousa","Lisboa",1500.0f,600.0f);
        ctb3 = new Desempregado("Pedro Silva","Faro",3000.0f,2);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNome method, of class Contribuinte.
     */
    @Ignore("not ready yet") @Test
    public void testGetNome() {
        System.out.println("getNome");
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMorada method, of class Contribuinte.
     */
    @Ignore("not ready yet") @Test
    public void testGetMorada() {
        System.out.println("getMorada");
        String expResult = "";
        String result = instance.getMorada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOutrosRendimentos method, of class Contribuinte.
     */
    @Ignore("not ready yet") @Test
    public void testGetOutrosRendimentos() {
        System.out.println("getOutrosRendimentos");
        float expResult = 0.0F;
        float result = instance.getOutrosRendimentos();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Contribuinte.
     */
    @Ignore("not ready yet") @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMorada method, of class Contribuinte.
     */
    @Ignore("not ready yet") @Test
    public void testSetMorada() {
        System.out.println("setMorada");
        String morada = "";
        instance.setMorada(morada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOutrosRendimentos method, of class Contribuinte.
     */
    @Ignore("not ready yet") @Test
    public void testSetOutrosRendimentos() {
        System.out.println("setOutrosRendimentos");
        float outrosRendimentos = 0.0F;
        instance.setOutrosRendimentos(outrosRendimentos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Contribuinte.
     */
    @Ignore("not ready yet") @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Contribuinte.
     */
    @Test
    public void testEqualsThis() {
        System.out.println("equals");
        boolean expResult = true;
        boolean result = ctb1.equals(ctb1);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method, of class Contribuinte.
     */
    @Test
    public void testEqualsNull() {
        System.out.println("equals");
        boolean expResult = false;
        boolean result = ctb1.equals(null);
        assertEquals(expResult, result);
    }
    /**
     * Test of equals method, of class Contribuinte.
     */
    @Test
    public void testEqualsClass() {
        boolean expResult = false;
        boolean result = ctb1.equals(ctb2);
        assertEquals(expResult, result);
    }
    /**
     * Test of equals method, of class Contribuinte.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        boolean expResult = true;
        boolean result = ((ctb1. getNome()).equals(ctb3. getNome())) &&
                ((ctb1. getMorada()).equals(ctb3. getMorada())) &&
                ((ctb1. getOutrosRendimentos())==(ctb3.getOutrosRendimentos()));
        assertEquals(expResult, result);
        
    }
}
