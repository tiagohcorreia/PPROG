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
public class TrabalhadorContaPropriaTest {
    
    private TrabalhadorContaPropria ctb1, ctb2, ctb3;
    
    public TrabalhadorContaPropriaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        ctb1 = new TrabalhadorContaPropria("Pedro Mendes","Porto",3500.0f,1500.0f,"Arquiteto");
        ctb2 = new TrabalhadorContaPropria("Carla Nunes","Faro",4500.0f,1500.0f,"Advogado");
        ctb3 = new TrabalhadorContaPropria("Pedro Mendes","Porto",3500.0f,1500.0f,"Programador");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getProfissao method, of class TrabalhadorContaPropria.
     */
    @Ignore("not ready yet") @Test
    public void testGetProfissao() {
        System.out.println("getProfissao");
        TrabalhadorContaPropria instance = new TrabalhadorContaPropria();
        String expResult = "";
        String result = instance.getProfissao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProfissao method, of class TrabalhadorContaPropria.
     */
    @Ignore("not ready yet") @Test
    public void testSetProfissao() {
        System.out.println("setProfissao");
        String profissao = "";
        TrabalhadorContaPropria instance = new TrabalhadorContaPropria();
        instance.setProfissao(profissao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class TrabalhadorContaPropria.
     */
    @Ignore("not ready yet") @Test
    public void testToString() {
        System.out.println("toString");
        TrabalhadorContaPropria instance = new TrabalhadorContaPropria();
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
        String p1 = ctb1.getProfissao();
        String p3 = ctb3.getProfissao();
        boolean expResult = p1.equalsIgnoreCase(p3);
        boolean result = ctb1.equals(ctb3);
        assertEquals(expResult, result);
    }

    /**
     * Test of obterTaxaRendimentosTrabalho method, of class TrabalhadorContaPropria.
     */
    @Ignore("not ready yet") @Test
    public void testObterTaxaRendimentosTrabalho() {
        System.out.println("obterTaxaRendimentosTrabalho");
        TrabalhadorContaPropria instance = new TrabalhadorContaPropria();
        float expResult = 0.0F;
        float result = instance.obterTaxaRendimentosTrabalho();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterTaxaOutrosRendimentos method, of class TrabalhadorContaPropria.
     */
    @Ignore("not ready yet") @Test
    public void testObterTaxaOutrosRendimentos() {
        System.out.println("obterTaxaOutrosRendimentos");
        TrabalhadorContaPropria instance = new TrabalhadorContaPropria();
        float expResult = 0.0F;
        float result = instance.obterTaxaOutrosRendimentos();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEscalao1OutrosRendimentos method, of class TrabalhadorContaPropria.
     */
    @Ignore("not ready yet") @Test
    public void testGetEscalao1OutrosRendimentos() {
        System.out.println("getEscalao1OutrosRendimentos");
        float expResult = 0.0F;
        float result = TrabalhadorContaPropria.getEscalao1OutrosRendimentos();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaxaRendimentosTrabalho method, of class TrabalhadorContaPropria.
     */
    @Ignore("not ready yet") @Test
    public void testGetTaxaRendimentosTrabalho() {
        System.out.println("getTaxaRendimentosTrabalho");
        float expResult = 0.0F;
        float result = TrabalhadorContaPropria.getTaxaRendimentosTrabalho();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaxaOutrosRendimentos1 method, of class TrabalhadorContaPropria.
     */
    @Ignore("not ready yet") @Test
    public void testGetTaxaOutrosRendimentos1() {
        System.out.println("getTaxaOutrosRendimentos1");
        float expResult = 0.0F;
        float result = TrabalhadorContaPropria.getTaxaOutrosRendimentos1();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaxaOutrosRendimentos2 method, of class TrabalhadorContaPropria.
     */
    @Ignore("not ready yet") @Test
    public void testGetTaxaOutrosRendimentos2() {
        System.out.println("getTaxaOutrosRendimentos2");
        float expResult = 0.0F;
        float result = TrabalhadorContaPropria.getTaxaOutrosRendimentos2();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaxaRendimentosTrabalho method, of class TrabalhadorContaPropria.
     */
    @Ignore("not ready yet") @Test
    public void testSetTaxaRendimentosTrabalho() {
        System.out.println("setTaxaRendimentosTrabalho");
        float taxaRendimentosTrabalho = 0.0F;
        TrabalhadorContaPropria.setTaxaRendimentosTrabalho(taxaRendimentosTrabalho);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaxaOutrosRendimentos1 method, of class TrabalhadorContaPropria.
     */
    @Ignore("not ready yet") @Test
    public void testSetTaxaOutrosRendimentos1() {
        System.out.println("setTaxaOutrosRendimentos1");
        float taxaOutrosRendimentos1 = 0.0F;
        TrabalhadorContaPropria.setTaxaOutrosRendimentos1(taxaOutrosRendimentos1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaxaOutrosRendimentos2 method, of class TrabalhadorContaPropria.
     */
    @Ignore("not ready yet") @Test
    public void testSetTaxaOutrosRendimentos2() {
        System.out.println("setTaxaOutrosRendimentos2");
        float taxaOutrosRendimentos2 = 0.0F;
        TrabalhadorContaPropria.setTaxaOutrosRendimentos2(taxaOutrosRendimentos2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEscalao1OutrosRendimentos method, of class TrabalhadorContaPropria.
     */
    @Ignore("not ready yet") @Test
    public void testSetEscalao1OutrosRendimentos() {
        System.out.println("setEscalao1OutrosRendimentos");
        float escalao1OutrosRendimentos = 0.0F;
        TrabalhadorContaPropria.setEscalao1OutrosRendimentos(escalao1OutrosRendimentos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
