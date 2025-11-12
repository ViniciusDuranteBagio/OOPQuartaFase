package org.example;

import Aula8.Calculadora;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTeste {
    //1
    @Test
    public void somar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(7, calculadora.somar(3, 4));
    }
    //2
    @Test
    public void subtrair(){
        Calculadora calculadora = new Calculadora();
        assertEquals(5, calculadora.subtrair(10, 5));
    }
    //3
    @Test
    public void multiplicar(){
        Calculadora calculadora = new Calculadora();
        assertEquals(15, calculadora.multiplicar(3, 5));
    }
    @Test
    public void dividir(){
        Calculadora calculadora = new Calculadora();
        assertEquals(5, calculadora.dividir(10, 2));


    }
}
