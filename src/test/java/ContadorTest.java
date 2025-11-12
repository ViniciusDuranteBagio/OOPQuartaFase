import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContadorTest {

    @Test
    public void testeIncrementar() {
        Contador c = new Contador();
        c.incrementar();
        c.incrementar();
        c.incrementar();
        assertEquals(3, c.getContador());
    }
}

