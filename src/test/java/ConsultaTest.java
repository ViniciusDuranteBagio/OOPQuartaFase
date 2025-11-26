import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConsultaTest {

    @Test
    void testConsultaComDoenca() {
        Animal gato = new Gato("Mingau", "Persa", 3);
        Consulta consulta = new Consulta(gato, "Vacinação", "Rinotraqueíte");

        String texto = consulta.toString();

        assertTrue(texto.contains("Animal: Mingau"));
        assertTrue(texto.contains("(Gato)"));
        assertTrue(texto.contains("Raça: Persa"));
        assertTrue(texto.contains("Idade: 3 anos"));
        assertTrue(texto.contains("Atendimento: Vacinação"));
        assertTrue(texto.contains("Doença: Rinotraqueíte"));
    }

    @Test
    void testConsultaSemDoenca() {
        Animal gato = new Gato("Mingau", "Persa", 3);
        Consulta consulta = new Consulta(gato, "Consulta Geral", null);

        String texto = consulta.toString();

        assertTrue(texto.contains("Animal: Mingau"));
        assertTrue(texto.contains("Atendimento: Consulta Geral"));
        assertFalse(texto.contains("Doença:"));
    }

    @Test
    void testCamposRecord() {
        Animal gato = new Gato("Mingau", "Persa", 3);
        Consulta consulta = new Consulta(gato, "Cirurgia", "Otite");

        assertEquals(gato, consulta.animal());
        assertEquals("Cirurgia", consulta.tipoAtendimento());
        assertEquals("Otite", consulta.doenca());
    }
}
