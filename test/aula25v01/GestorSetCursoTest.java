/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula25v01;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**

 @author Tomas
 */
public class GestorSetCursoTest{
    
    public GestorSetCursoTest(){
    }
    
    @BeforeClass
    public static void setUpClass(){
    }
    
    @AfterClass
    public static void tearDownClass(){
    }
    
    @Before
    public void setUp(){
    }
    
    @After
    public void tearDown(){
    }

    /**
     * Test of gestorJButtonSetCursoMousePressed method, of class GestorSetCurso.
     */
    @Test
    public void testGestorJButtonSetCursoMousePressed(){
        System.out.println("gestorJButtonSetCursoMousePressed");
        boolean expResult = true;
        boolean result = GestorSetCurso.gestorJButtonSetCursoMousePressed();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of gestorJButtonCancelarMousePressed method, of class GestorSetCurso.
     */
    @Test
    public void testGestorJButtonCancelarMousePressed(){
        System.out.println("gestorJButtonCancelarMousePressed");
        FSetCurso formulario = null;
        boolean expResult = true;
        boolean result = GestorSetCurso.gestorJButtonCancelarMousePressed(formulario);
        assertEquals(expResult, result);
    }

    
    
}
