import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContadorTest {

    @Test
    void testIncrementarTresVezes() {
        Contador c = new Contador();
        c.incrementar();
        c.incrementar();
        c.incrementar();
        assertEquals(3, c.getValor());
    }
}
