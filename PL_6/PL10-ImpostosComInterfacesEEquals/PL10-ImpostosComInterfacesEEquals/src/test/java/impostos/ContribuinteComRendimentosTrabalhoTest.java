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
public class ContribuinteComRendimentosTrabalhoTest {
    
    private ContribuinteComRendimentosTrabalho ctb1, ctb2, ctb3, instance;
    public ContribuinteComRendimentosTrabalhoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        ctb1 = new TrabalhadorContaOutrem("Marta Meireles","Braga",1000.0f,800.0f,"UnifiedLDA");
        ctb2 = new TrabalhadorContaPropria("Jorge Mendes","Porto",2500.0f,500.0f,"Programador");
        ctb3 = new TrabalhadorContaPropria("Jorge Mendes","Porto",500.0f,5000.0f,"Programador");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getRendimentosTrabalho method, of class ContribuinteComRendimentosTrabalho.
     */
    @Ignore("not ready yet") @Test
    public void testGetRendimentosTrabalho() {
        System.out.println("getRendimentosTrabalho");
        float expResult = 0.0F;
        float result = instance.getRendimentosTrabalho();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRendimentosTrabalho method, of class ContribuinteComRendimentosTrabalho.
     */
    @Ignore("not ready yet") @Test
    public void testSetRendimentosTrabalho() {
        System.out.println("setRendimentosTrabalho");
        float rendimentosTrabalho = 0.0F;
        instance.setRendimentosTrabalho(rendimentosTrabalho);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ContribuinteComRendimentosTrabalho.
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
     * Test of equals method, of class Desempregado.
     */
    @Test
    public void testEqualsSuper() {
        System.out.println("equals");
        boolean expResult = false;
        boolean result = ctb1.equals(ctb2);
        assertEquals(expResult, result);
    }
    /**
     * Test of equals method, of class Desempregado.
     */
    @Test
    public void testEqualsOtherCases() {
        System.out.println("equals");
       
        float rt1= ctb2.getRendimentosTrabalho();
        float rt3= ctb3.getRendimentosTrabalho();
        boolean expResult = (rt1==rt3 ? true: false);
        boolean result = ctb2.equals(ctb3);
        assertEquals(expResult, result);
   }

    /**
     * Test of calcularImposto method, of class ContribuinteComRendimentosTrabalho.
     */
    @Test
    public void testCalcularImposto() {
        System.out.println("calcularImposto");
        float expResult = 26.0F;
        float result = ctb1.calcularImposto();
        assertEquals(expResult, result, 0.005);
    }

    /**
     * Test of obterTaxaRendimentosTrabalho method, of class ContribuinteComRendimentosTrabalho.
     */
    @Ignore("not ready yet") @Test
    public void testObterTaxaRendimentosTrabalho() {
        System.out.println("obterTaxaRendimentosTrabalho");
        float expResult = 0.0F;
        float result = instance.obterTaxaRendimentosTrabalho();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterTaxaOutrosRendimentos method, of class ContribuinteComRendimentosTrabalho.
     */
    @Ignore("not ready yet") @Test
    public void testObterTaxaOutrosRendimentos() {
        System.out.println("obterTaxaOutrosRendimentos");
        float expResult = 0.0F;
        float result = instance.obterTaxaOutrosRendimentos();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

        
}
