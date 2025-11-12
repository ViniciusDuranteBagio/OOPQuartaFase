package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestExample {
  @Test
  public void primeiroTeste() {
    assertTrue(false);
  }
  @Test
  public void testeSomar(){
    Calculadora calculo= new Calculadora();
    int resultado= calculo.somar(3,4);
    assertEquals(7,resultado);
  }
  @Test
  public  void testeSubtrair(){
    Calculadora calculo= new Calculadora();
    int resultado = calculo.subtrair(10,5);
    assertEquals(5,resultado);
  }
  @Test
  public void testeMultiplicar(){
    Calculadora calculo= new Calculadora();
    int resultado = calculo.multiplicar(3,5);
    assertEquals(15,resultado);
  }
  @Test
  public  void testeDivisão(){
    Calculadora calculo= new Calculadora();
    int resultado= calculo.dividir(10,2);
    assertEquals(5,resultado);
  }
  @Test
  public void TestDividirporZero(){
    Calculadora calculo= new Calculadora();
    org.junit.jupiter.api.Assertions.assertThrows(ArithmeticException.class,()->{
      calculo.dividir(10,0);
    });
  }
  @Test
  public void PessoaDeMaior(){
    pessoa idade=new pessoa("joão",18);
    assertTrue(idade.MaiorIdade());
  }
  @Test
  public void PessoaDeMenor(){
    pessoa idade=new pessoa("joão",16);
    assertFalse(idade.MaiorIdade());
  }
  @Test
  public void pessoaCarlos(){
    pessoa Pessoa= new pessoa("Ana",16);
    Pessoa.setNome("Carlos");
    assertEquals("Carlos", Pessoa.getNome());
  }
  @Test
  public void  RetanguloArea1(){
    Retangulo Area= new Retangulo();
    int resultado= Area.Calcarea(4,5);
    assertEquals(20,resultado);
  }
  @Test
  public void  RetanguloArea2(){
    Retangulo Area= new Retangulo();
    int resultado= Area.Calcarea(3,6);
    assertEquals(20,resultado);
  }
}
