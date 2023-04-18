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
public class ReformadoTest {
    
    public ReformadoTest() {
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
     * Test of toString method, of class Reformado.
     */
    @Ignore("not ready yet") @Test
    public void testToString() {
        System.out.println("toString");
        Reformado instance = new Reformado();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterTaxaRendimentosTrabalho method, of class Reformado.
     */
    @Ignore("not ready yet") @Test
    public void testObterTaxaRendimentosTrabalho() {
        System.out.println("obterTaxaRendimentosTrabalho");
        Reformado instance = new Reformado();
        float expResult = 0.0F;
        float result = instance.obterTaxaRendimentosTrabalho();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterTaxaOutrosRendimentos method, of class Reformado.
     */
    @Ignore("not ready yet") @Test
    public void testObterTaxaOutrosRendimentos() {
        System.out.println("obterTaxaOutrosRendimentos");
        Reformado instance = new Reformado();
        float expResult = 0.0F;
        float result = instance.obterTaxaOutrosRendimentos();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaxaRendimentosTrabalho method, of class Reformado.
     */
    @Ignore("not ready yet") @Test
    public void testGetTaxaRendimentosTrabalho() {
        System.out.println("getTaxaRendimentosTrabalho");
        float expResult = 0.0F;
        float result = Reformado.getTaxaRendimentosTrabalho();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaxaOutrosRendimentos method, of class Reformado.
     */
    @Ignore("not ready yet") @Test
    public void testGetTaxaOutrosRendimentos() {
        System.out.println("getTaxaOutrosRendimentos");
        float expResult = 0.0F;
        float result = Reformado.getTaxaOutrosRendimentos();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaxaRendimentosTrabalho method, of class Reformado.
     */
    @Ignore("not ready yet") @Test
    public void testSetTaxaRendimentosTrabalho() {
        System.out.println("setTaxaRendimentosTrabalho");
        float taxaRendimentosTrabalho = 0.0F;
        Reformado.setTaxaRendimentosTrabalho(taxaRendimentosTrabalho);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaxaOutrosRendimentos method, of class Reformado.
     */
    @Ignore("not ready yet") @Test
    public void testSetTaxaOutrosRendimentos() {
        System.out.println("setTaxaOutrosRendimentos");
        float taxaOutrosRendimentos = 0.0F;
        Reformado.setTaxaOutrosRendimentos(taxaOutrosRendimentos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
