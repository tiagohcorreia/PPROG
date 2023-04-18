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
public class DesempregadoTest {
    
    private Desempregado ctb1, ctb2, ctb3;
    public DesempregadoTest() {
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
        ctb2 = new Desempregado("Pedro Manuel","Faro",3000.0f,2);
        ctb3 = new Desempregado("Pedro Silva","Faro",3000.0f,4);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMesesParagem method, of class Desempregado.
     */
    @Ignore("not ready yet") @Test
    public void testGetMesesParagem() {
        System.out.println("getMesesParagem");
        Desempregado instance = new Desempregado();
        int expResult = 0;
        int result = instance.getMesesParagem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMesesParagem method, of class Desempregado.
     */
    @Ignore("not ready yet") @Test
    public void testSetMesesParagem() {
        System.out.println("setMesesParagem");
        int mesesParagem = 0;
        Desempregado instance = new Desempregado();
        instance.setMesesParagem(mesesParagem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Desempregado.
     */
    @Ignore("not ready yet") @Test
    public void testToString() {
        System.out.println("toString");
        Desempregado instance = new Desempregado();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Desempregado.
     */
    @Test
    public void testEqualsSuper() {
        System.out.println("equals1");
        boolean expResult = false;
        boolean result = ctb1.equals(ctb2);
        assertEquals(expResult, result);
    }
    /**
     * Test of equals method, of class Desempregado.
     */
    @Test
    public void testEqualsOtherCases() {
        System.out.println("equals2");
        int p1 = ctb1.getMesesParagem();
        int p2 = ctb3.getMesesParagem();
        
        boolean expResult = (p1==p2? true:false);
        boolean result = ctb1.equals(ctb3);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getTaxaOutrosRendimentos method, of class Desempregado.
     */
    @Ignore("not ready yet") @Test
    public void testGetTaxaOutrosRendimentos() {
        System.out.println("getTaxaOutrosRendimentos");
        float expResult = 0.0F;
        float result = Desempregado.getTaxaOutrosRendimentos();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaxaOutrosRendimentos method, of class Desempregado.
     */
    @Ignore("not ready yet") @Test
    public void testSetTaxaOutrosRendimentos() {
        System.out.println("setTaxaOutrosRendimentos");
        float taxaOutrosRendimentos = 0.0F;
        Desempregado.setTaxaOutrosRendimentos(taxaOutrosRendimentos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularImposto method, of class Desempregado.
     */
    @Test
    public void testCalcularImposto() {
        System.out.println("calcularImposto");
        float expResult = 60.0F;
        float result = ctb1.calcularImposto();
        assertEquals(expResult, result, 0.005);
    }
    
}
