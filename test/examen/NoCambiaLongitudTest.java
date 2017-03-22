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
public class NoCambiaLongitudTest {
    
    public NoCambiaLongitudTest() {
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
     * Test of modificar method, of class NoCambiaLongitud.
     */
    @Test
    public void testModificar() {
        System.out.println("modificar");
        int[] vector = {2, 4, 6, 8, 0};
        int LongitudActual = 0;
        int posicion = 0;
        CambiaLongitud cambiaLongitud = null;
        NoCambiaLongitud instance = new NoCambiaLongitud();
        instance.modificar(vector, LongitudActual, posicion, cambiaLongitud);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    
}
