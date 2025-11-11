package org.example;
import static org.junit.jupiter.api.Assertions.*;

import Aula7BrenoLibrelatoManoel.Calculadora;
import org.junit.jupiter.api.Test;

public class CalculadoraTestBreno {

    @Test
    public void somar(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(3,4);
        assertEquals(7,resultado);
    }

    @Test
    public void subtrair(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.subtrair(10,5);
        assertEquals(5,resultado);
    }

    @Test
    public void multiplicar(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.multiplicar(3,5);
        assertEquals(15,resultado);
    }

//    @Test
//    public void dividir(){
//        Calculadora calculadora = new Calculadora();
//        int resultado = calculadora.dividir(10,2);
//        assertEquals(5,resultado);
//
//    }

    @Test
    public void dividir(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dividir(10,0);
        assertEquals(0,resultado);
    }
}
