import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class CoelhoTest {

    @Test
    void deveCriarCoelhoCorretamente() {
        Coelho c = new Coelho("Pipoca", "Mini Rex", 2);

        assertEquals("Pipoca", c.getNome());
        assertEquals("Mini Rex", c.getRaca());
        assertEquals(2, c.getIdade());
        assertEquals("Coelho", c.getTipo());
    }

    @Test
    void deveRetornarListaDeDoencas() {
        Coelho c = new Coelho("Snow", "Angorá", 3);
        List<String> doencas = c.getDoencas();

        assertNotNull(doencas);
        assertEquals(5, doencas.size());

        assertTrue(doencas.contains("Mixomatose"));
        assertTrue(doencas.contains("Coccidiose"));
    }

    @Test
    void listaDeDoencasNaoDeveSerModificavelPeloObjeto() {
        Coelho c = new Coelho("Luna", "Lionhead", 1);
        List<String> doencas = c.getDoencas();

        assertThrows(UnsupportedOperationException.class, () -> doencas.add("Doença Inventada"));
    }

    @Test
    void tipoRetornadoDeveSerCoelho() {
        Coelho c = new Coelho("Nuvem", "Holland Lop", 4);
        assertEquals("Coelho", c.getTipo());
    }
}
