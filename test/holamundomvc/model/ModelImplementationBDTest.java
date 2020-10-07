/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class ModelImplementationBDTest {
    
    public ModelImplementationBDTest() {
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
     * Test of getGreeting method, of class ModelImplementationBD.
     */
    @Test
    public void testGetGreeting() {
        ModelImplementationBD instance = new ModelImplementationBD();
        String expResult = "Hola Mundo MVC";
        String result = instance.getGreeting();
        if( result.equals(expResult)){    
        }else{
          fail("Ha ocurrido un error texto no esperado.");  
        }
      
        
    }
    
}
