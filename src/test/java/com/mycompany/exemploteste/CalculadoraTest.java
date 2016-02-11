/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemploteste;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luciana
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
     * Test of somar method, of class Calculadora.
     */
    @Test
    public void testSomar() {
        System.out.println("somar");
        int num1 = 1;
        int num2 = 2;
        Calculadora calculadora = new Calculadora();
        
        int soma = calculadora.somar(num1, num2);
        assertEquals(3, soma);
    }
    
    @Test
    public void testSubtrair(){
    
        System.out.println("subtrair");
        int num1=2;
        int num2=1;
        
        Calculadora calculadora = new Calculadora();
        
        int subtracao = calculadora.subtrair(num1, num2);
        assertEquals(1, subtracao);
        
    }
}