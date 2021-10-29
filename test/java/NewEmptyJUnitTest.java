/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author PC
 */
public class NewEmptyJUnitTest {
    
    operaciones operacion1 = new operaciones();
    @Test
    public void testSuma1(){
        assertEquals(5, operacion1.suma(3,2));
    }

    @Test
    public void testResta1(){
        assertEquals(5, operacion1.resta(7,2));
    }
    
    @Test
    public void testResta2(){
        assertEquals(-3, operacion1.resta(-4,-1));
    }

    @Test
    public void testMultiplicacion1(){
        assertEquals(6, operacion1.multiplicacion(3,2));
    }
    
    @Test
    public void testMultiplicacion2(){
        assertEquals(6, operacion1.multiplicacion(-3,-2));
    }

//------------------------------------------------------------------------------
    @Test
    public void testExpon1(){
        assertEquals(9, operacion1.expon(3,2));
    }
    @Test
    public void testExpon2(){
        assertEquals(3125, operacion1.expon(5,5));
    }
    @Test
    public void testRaiz1(){
        assertEquals(3, operacion1.raiz2(9));
    }
    @Test
    public void testRaiz2(){
        assertEquals(5, operacion1.raiz2(25));
    }
    @Test
    public void testPorcent1(){
        assertEquals(100, operacion1.porcent(200,50));
    }
    @Test
    public void testPorcent2(){
        assertEquals(135, operacion1.porcent(150,90));
    }  
                
    public NewEmptyJUnitTest() {
    }
    
}
