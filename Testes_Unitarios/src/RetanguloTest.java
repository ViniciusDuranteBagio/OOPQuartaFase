import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RetanguloTest {

    @Test
    void testArea() {
        Retangulo r = new Retangulo(4, 5);
        assertEquals(20, r.calcularArea());
    }

    @Test
    void testPerimetro() {
        Retangulo r = new Retangulo(4, 5);
        assertEquals(18, r.calcularPerimetro());
    }

    @Test
    void testConstrutorValores() {
        Retangulo r = new Retangulo(3, 6);
        assertEquals(3, r.getLargura());
        assertEquals(6, r.getAltura());
    }
}
