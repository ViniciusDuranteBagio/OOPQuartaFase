import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void testeSoma() {
        Calculadora calc = new Calculadora();
        assertEquals(7, calc.somar(3, 4));
    }

    @Test
    public void testeSubtracao() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.subtrair(10, 5));
    }

    @Test
    public void testeMultiplicacao() {
        Calculadora calc = new Calculadora();
        assertEquals(15, calc.multiplicar(3, 5));
    }

    @Test
    public void testeDivisao() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.dividir(10, 2));
    }

    @Test
    public void testeDivisaoPorZero() {
        Calculadora calc = new Calculadora();
        assertThrows(ArithmeticException.class, () -> calc.dividir(10, 0));
    }
}