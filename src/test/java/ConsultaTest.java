
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ConsultaTest {

    @Test
    public void deveCriarConsultaComSucesso() {
        Animal cachorro = new Cachorro("Rex", 3, "Vira-lata");
        Consulta consulta = new Consulta(cachorro, "Consulta", "Otite");

        assertEquals("Rex", consulta.getAnimal().getNome());
        assertEquals("Consulta", consulta.getTipoAtendimento());
        assertEquals("Otite", consulta.getDoenca());
    }

    @Test
    public void deveRetornarDoencasDoGato() {
        Animal gato = new Gato("Mimi", 2, "Siamês");
        String[] doencas = gato.getDoencasComuns();
        assertTrue(doencas.length > 0);
    }
}