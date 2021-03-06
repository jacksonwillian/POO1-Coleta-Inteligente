/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coletainteligentedaotest;

import coletainteligente.Status;
import coletainteligentedao.StatusDAO;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thiag
 */
public class StatusDAOTest {
    
    public StatusDAOTest() {
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
     * Test of insere method, of class StatusDAO.
     */
    @Test
    public void testInsere() {
        System.out.println("insere");
        StatusDAO instance = new StatusDAO();
        Status b;
        try {
            b = new Status("Otimizada");
            instance.insere(b);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(StatusDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of readDescricao method, of class StatusDAO.
     */
    @Test
    public void testReadDescricao() {
        System.out.println("readDescricao");
        String descricao = "Otimizada";
        StatusDAO instance = new StatusDAO();
        boolean expResult = true;
        boolean result = instance.readDescricao(descricao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of selectListaDescricao method, of class StatusDAO.
     */
    /*@Test
    public void testSelectListaDescricao() {
        System.out.println("selectListaDescricao");
        StatusDAO instance = new StatusDAO();
        ArrayList expResult = null;
        ArrayList result = instance.selectListaDescricao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of selectDescricaoRestrita method, of class StatusDAO.
     */
    /*@Test
    public void testSelectDescricaoRestrita() {
        System.out.println("selectDescricaoRestrita");
        int cod_status = 1;
        StatusDAO instance = new StatusDAO();
        ArrayList expResult = null;
        ArrayList result = instance.selectDescricaoRestrita(cod_status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of selectListaCodStatus method, of class StatusDAO.
     */
   /* @Test
    public void testSelectListaCodStatus() {
        System.out.println("selectListaCodStatus");
        StatusDAO instance = new StatusDAO();
        ArrayList expResult = null;
        ArrayList result = instance.selectListaCodStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of alteraStatus method, of class StatusDAO.
     */
    @Test
    public void testAlteraStatus() {
        System.out.println("alteraStatus");
        String descricaoOld = "Otimizada";
        String descricao = "Nova";
        StatusDAO instance = new StatusDAO();
        instance.alteraStatus(descricaoOld, descricao);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of deleta method, of class StatusDAO.
     */
    @Test
    public void testDeleta() {
        System.out.println("deleta");
        String descricao = "Nova";
        StatusDAO instance = new StatusDAO();
        instance.deleta(descricao);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    

    /**
     * Test of retornaDescricao method, of class StatusDAO.
     */
    @Test
    public void testRetornaDescricao() {
        System.out.println("retornaDescricao");
        int cod_status = 1;
        StatusDAO instance = new StatusDAO();
        String expResult = "Quebrada";
        String result = instance.retornaDescricao(cod_status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of retornaCodigo method, of class StatusDAO.
     */
    @Test
    public void testRetornaCodigo() {
        System.out.println("retornaCodigo");
        String descricao = "Quebrada";
        StatusDAO instance = new StatusDAO();
        int expResult = 1;
        int result = instance.retornaCodigo(descricao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
