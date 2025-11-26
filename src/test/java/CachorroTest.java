import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class CachorroTest {

    @Test
    void deveCriarCachorroCorretamente() {
        Cachorro c = new Cachorro("Rex", "Labrador", 5);

        assertEquals("Rex", c.getNome());
        assertEquals("Labrador", c.getRaca());
        assertEquals(5, c.getIdade());
        assertEquals("Cachorro", c.getTipo());
    }

    @Test
    void deveRetornarListaDeDoencas() {
        Cachorro c = new Cachorro("Bolt", "Beagle", 3);
        List<String> doencas = c.getDoencas();

        assertNotNull(doencas);
        assertEquals(5, doencas.size());

        assertTrue(doencas.contains("Cinomose"));
        assertTrue(doencas.contains("Dermatite"));
    }

    @Test
    void listaDeDoencasNaoDeveSerModificavel() {
        Cachorro c = new Cachorro("Toby", "Pug", 2);
        List<String> doencas = c.getDoencas();

        assertThrows(UnsupportedOperationException.class, () -> doencas.add("Doença Extra"));
    }

    @Test
    void tipoRetornadoDeveSerCachorro() {
        Cachorro c = new Cachorro("Spike", "Pastor Alemão", 4);
        assertEquals("Cachorro", c.getTipo());
    }
}
