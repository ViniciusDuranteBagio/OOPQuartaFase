import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    void testSoma() {
        int resultado = 2 + 3;
        assertEquals(5, resultado, "A soma deve ser igual a 5");
    }
}
