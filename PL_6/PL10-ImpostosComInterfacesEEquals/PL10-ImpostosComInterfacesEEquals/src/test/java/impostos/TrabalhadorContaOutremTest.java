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
public class TrabalhadorContaOutremTest {
    
    private TrabalhadorContaOutrem ctb1, ctb2, ctb3;
    
    public TrabalhadorContaOutremTest() {
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
        ctb2 = new TrabalhadorContaOutrem("Ana Maria","Braga",1500.0f,500.0f,"4Home");
        ctb3 = new TrabalhadorContaOutrem("Marta Meireles","Braga",1000.0f,800.0f,"4Home");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getEmpresa method, of class TrabalhadorContaOutrem.
     */
    @Ignore("not ready yet") @Test
    public void testGetEmpresa() {
        System.out.println("getEmpresa");
        TrabalhadorContaOutrem instance = new TrabalhadorContaOutrem();
        String expResult = "";
        String result = instance.getEmpresa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmpresa method, of class TrabalhadorContaOutrem.
     */
    @Ignore("not ready yet") @Test
    public void testSetEmpresa() {
        System.out.println("setEmpresa");
        String empresa = "";
        TrabalhadorContaOutrem instance = new TrabalhadorContaOutrem();
        instance.setEmpresa(empresa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class TrabalhadorContaOutrem.
     */
    @Ignore("not ready yet") @Test
    public void testToString() {
        System.out.println("toString");
        TrabalhadorContaOutrem instance = new TrabalhadorContaOutrem();
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
        String n1 = ctb1.getEmpresa();
        String n3 = ctb3.getEmpresa();
        boolean expResult = n1.equalsIgnoreCase(n3);
        boolean result = ctb1.equals(ctb3);
        assertEquals(expResult, result);
    }

    /**
     * Test of obterTaxaRendimentosTrabalho method, of class TrabalhadorContaOutrem.
     */
    @Ignore("not ready yet") @Test
    public void testObterTaxaRendimentosTrabalho() {
        System.out.println("obterTaxaRendimentosTrabalho");
        TrabalhadorContaOutrem instance = new TrabalhadorContaOutrem();
        float expResult = 0.0F;
        float result = instance.obterTaxaRendimentosTrabalho();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterTaxaOutrosRendimentos method, of class TrabalhadorContaOutrem.
     */
    @Ignore("not ready yet") @Test
    public void testObterTaxaOutrosRendimentos() {
        System.out.println("obterTaxaOutrosRendimentos");
        TrabalhadorContaOutrem instance = new TrabalhadorContaOutrem();
        float expResult = 0.0F;
        float result = instance.obterTaxaOutrosRendimentos();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEscalao1RendimentosTrabalho method, of class TrabalhadorContaOutrem.
     */
    @Ignore("not ready yet") @Test
    public void testGetEscalao1RendimentosTrabalho() {
        System.out.println("getEscalao1RendimentosTrabalho");
        float expResult = 0.0F;
        float result = TrabalhadorContaOutrem.getEscalao1RendimentosTrabalho();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaxaRendimentosTrabalho1 method, of class TrabalhadorContaOutrem.
     */
    @Ignore("not ready yet") @Test
    public void testGetTaxaRendimentosTrabalho1() {
        System.out.println("getTaxaRendimentosTrabalho1");
        float expResult = 0.0F;
        float result = TrabalhadorContaOutrem.getTaxaRendimentosTrabalho1();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaxaRendimentosTrabalho2 method, of class TrabalhadorContaOutrem.
     */
    @Ignore("not ready yet") @Test
    public void testGetTaxaRendimentosTrabalho2() {
        System.out.println("getTaxaRendimentosTrabalho2");
        float expResult = 0.0F;
        float result = TrabalhadorContaOutrem.getTaxaRendimentosTrabalho2();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaxaOutrosRendimentos method, of class TrabalhadorContaOutrem.
     */
    @Ignore("not ready yet") @Test
    public void testGetTaxaOutrosRendimentos() {
        System.out.println("getTaxaOutrosRendimentos");
        float expResult = 0.0F;
        float result = TrabalhadorContaOutrem.getTaxaOutrosRendimentos();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEscalao1RendimentosTrabalho method, of class TrabalhadorContaOutrem.
     */
    @Ignore("not ready yet") @Test
    public void testSetEscalao1RendimentosTrabalho() {
        System.out.println("setEscalao1RendimentosTrabalho");
        float escalao1RendimentosTrabalho = 0.0F;
        TrabalhadorContaOutrem.setEscalao1RendimentosTrabalho(escalao1RendimentosTrabalho);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaxaRendimentosTrabalho1 method, of class TrabalhadorContaOutrem.
     */
    @Ignore("not ready yet") @Test
    public void testSetTaxaRendimentosTrabalho1() {
        System.out.println("setTaxaRendimentosTrabalho1");
        float taxaRendimentosTrabalho1 = 0.0F;
        TrabalhadorContaOutrem.setTaxaRendimentosTrabalho1(taxaRendimentosTrabalho1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaxaRendimentosTrabalho2 method, of class TrabalhadorContaOutrem.
     */
    @Ignore("not ready yet") @Test
    public void testSetTaxaRendimentosTrabalho2() {
        System.out.println("setTaxaRendimentosTrabalho2");
        float taxaRendimentosTrabalho2 = 0.0F;
        TrabalhadorContaOutrem.setTaxaRendimentosTrabalho2(taxaRendimentosTrabalho2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaxaOutrosRendimentos method, of class TrabalhadorContaOutrem.
     */
    @Ignore("not ready yet") @Test
    public void testSetTaxaOutrosRendimentos() {
        System.out.println("setTaxaOutrosRendimentos");
        float taxaOutrosRendimentos = 0.0F;
        TrabalhadorContaOutrem.setTaxaOutrosRendimentos(taxaOutrosRendimentos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
