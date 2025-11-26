import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class GatoTest {

    @Test
    public void testCriacaoGato() {
        Gato gato = new Gato("Mingau", "Persa", 3);

        assertEquals("Mingau", gato.getNome());
        assertEquals("Persa", gato.getRaca());
        assertEquals(3, gato.getIdade());
    }

    @Test
    public void testGetTipo() {
        Gato gato = new Gato("Mingau", "Persa", 3);

        assertEquals("Gato", gato.getTipo());
    }

    @Test
    public void testGetDoencas() {
        Gato gato = new Gato("Mingau", "Persa", 3);

        List<String> doencas = gato.getDoencas();

        assertNotNull(doencas);
        assertEquals(5, doencas.size());
        assertTrue(doencas.contains("PIF (Peritonite Infecciosa Felina)"));
        assertTrue(doencas.contains("Rinotraqueíte"));
    }

    @Test
    public void testListaImutavel() {
        Gato gato = new Gato("Mingau", "Persa", 3);

        List<String> doencas = gato.getDoencas();

        assertThrows(UnsupportedOperationException.class, () -> doencas.add("Outra"));
    }
}
