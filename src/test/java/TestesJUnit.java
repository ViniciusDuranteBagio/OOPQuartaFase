import Aula7.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestesJUnit {

    @Test
    void testSomar() {
        Calculadora calc = new Calculadora();
        assertEquals(7, calc.somar(3, 4));
    }

    @Test
    void testSubtrair() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.subtrair(10, 5));
    }

    @Test
    void testMultiplicar() {
        Calculadora calc = new Calculadora();
        assertEquals(15, calc.multiplicar(3, 5));
    }

    @Test
    void testDividir() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.dividir(10, 2));
    }

    @Test
    void testDividirPorZero() {
        Calculadora calc = new Calculadora();
        assertThrows(ArithmeticException.class, () -> calc.dividir(10, 0));
    }

    @Test
    void testEhPar() {
        Calculadora calc = new Calculadora();
        assertTrue(calc.ehPar(2));
        assertTrue(calc.ehPar(10));
        assertFalse(calc.ehPar(3));
        assertFalse(calc.ehPar(9));
    }

    @Test
    void testMaiorDeIdade() {
        Pessoa p = new Pessoa("Ana", 20);
        assertTrue(p.ehMaiorDeIdade());
    }

    @Test
    void testMenorDeIdade() {
        Pessoa p = new Pessoa("Leo", 15);
        assertFalse(p.ehMaiorDeIdade());
    }

    @Test
    void testSetNome() {
        Pessoa p = new Pessoa("João", 25);
        p.setNome("Carlos");
        assertEquals("Carlos", p.getNome());
    }

    @Test
    void testAreaRetangulo() {
        Retangulo r = new Retangulo(4, 5);
        assertEquals(20, r.calcularArea());
    }

    @Test
    void testConstrutorRetangulo() {
        Retangulo r = new Retangulo(3, 6);
        assertEquals(3, r.getLargura());
        assertEquals(6, r.getAltura());
    }

    @Test
    void testDepositoNegativo() {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(-50);
        assertEquals(0, conta.getSaldo());
    }

    @Test
    void testIncrementar() {
        Contador c = new Contador();
        c.incrementar();
        c.incrementar();
        c.incrementar();
        assertEquals(3, c.getValor());
    }

    @Test
    void testAdicionarItemCarrinho() {
        CarrinhoDeCompras c = new CarrinhoDeCompras();
        c.adicionarItem("maçã");
        assertTrue(c.getItens().contains("maçã"));
    }
}
