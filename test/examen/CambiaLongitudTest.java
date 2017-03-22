/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class CambiaLongitudTest {
    
    public CambiaLongitudTest() {
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
     * Test of borrar method, of class CambiaLongitud.
     */
    @Test
    public void testBorrar() {
        System.out.println("borrar");
        int[] vector = {2, 4, 6, 8, 0};
        int LongitudActual = 0;
        int posicion = 0;
        CambiaLongitud instance = new CambiaLongitud();
        instance.borrar(vector, LongitudActual, posicion);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of in method, of class CambiaLongitud.
     */
    @Test
    public void testIn() {
        System.out.println("in");
        int[] vector = {2, 4, 6, 8, 0};
        int LongitudActual = 0;
        int posicion = 0;
        CambiaLongitud instance = new CambiaLongitud();
        instance.in(vector, LongitudActual, posicion);
        // TODO review the generated test code and remove the default call to fail.
       
    }

   
   
    
}
