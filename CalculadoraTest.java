package org.example;

import Atividades_Aula_7.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculadoraTest {

    @Test
    public void TesteSoma(){
        Calculadora calc = new Calculadora();
        int Resultado = calc.Somar(3,4);

        assertEquals(7,Resultado);

    }

    @Test
    public  void TesteSubtrair(){
        Calculadora calc = new Calculadora();
        int resultado = calc.subtrair(10,5);
        assertEquals(5,resultado);
    }

    @Test
    public void TesteMultiplicar(){
        Calculadora calc = new Calculadora();
        double resultado = calc.Multiplicar(3,5);
        assertEquals(15,resultado);
    }


    @Test
    public void TesteDividir(){
        Calculadora calc = new Calculadora();
        double resultado = calc.Dividir(10,2);
        assertEquals(5,resultado);
    }


    @Test
    public void TesteDividirErro(){
        Calculadora calc = new Calculadora();
        double resultado = calc.DividirErro(10,0);
        assertEquals(2,resultado);
    }





}
