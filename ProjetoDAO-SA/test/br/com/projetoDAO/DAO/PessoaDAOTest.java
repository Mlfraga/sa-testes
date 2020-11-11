/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoDAO.DAO;

import br.com.projetoDAO.model.Pessoa;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author info
 */
public class PessoaDAOTest {
    Pessoa p;
    public PessoaDAOTest() {
        p = new Pessoa("Ilzanete","Maezona");
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
     * Test of consulta method, of class PessoaDAO.
     */
    @Test
    public void testConsulta() {
        PessoaDAO instance = new PessoaDAO();
        assertTrue(instance.consulta());
    }
    
    @Test
    public void testInserir(){
        PessoaDAO pd = new PessoaDAO();
        assertTrue(pd.inserir(p));
    }
    
    @Test
    public void testUpdate(){
        
    }
}
