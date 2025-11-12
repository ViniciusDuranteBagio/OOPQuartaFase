import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculadoraTest {

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
        void testDivisaoPorZero() {
            Calculadora calc = new Calculadora();
            assertThrows(ArithmeticException.class, () -> calc.dividir(10, 0));
        }
    }