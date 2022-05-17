/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit3TestClass.java to edit this template
 */
package Calculadora;

import junit.framework.TestCase;

/**
 *
 * @author catal
 */
public class CalculadoraTest extends TestCase {
   
    public void testSuma(){
        Calculadora calculadora = new Calculadora();
        float x = calculadora.suma(7,3);
        assertEquals(10, x, 0);
    }


    public void testResta(){
        Calculadora calculadora = new Calculadora();
        float x = calculadora.resta(10,3);
        assertEquals(7, x, 0);
    }


    public void testDivision(){
        Calculadora calculadora = new Calculadora();
        float x = calculadora.division(10,2);
        assertEquals(5, x,0);
    }


    public void testMultiplicacion(){
        Calculadora calculadora = new Calculadora();
        float x = calculadora.multiplicacion(4,3);
        assertEquals(12,x,0);
    }
    
}
