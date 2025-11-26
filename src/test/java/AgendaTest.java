import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class AgendaTest {

    private Agenda agenda;

    @BeforeEach
    void setUp() {
        agenda = new Agenda();
    }

    @Test
    void deveIniciarComZeroConsultas() {
        assertEquals(0, agenda.getNumeroConsultas());
    }

    @Test
    void deveLimparConsultasParaNovoDia() {
        agenda.limparConsultasParaNovoDia();
        assertEquals(0, agenda.getNumeroConsultas());
        assertEquals(LocalDate.now(), agenda.getUltimaData());
    }

    @Test
    void deveGerarHashSHA256Corretamente() throws Exception {
        Method m = Agenda.class.getDeclaredMethod("gerarHashSHA256", String.class);
        m.setAccessible(true);

        String hash = (String) m.invoke(agenda, "123");
        assertEquals("a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3", hash);
    }

    @Test
    void deveAceitarNomeValido() throws Exception {
        Method m = Agenda.class.getDeclaredMethod("validarNome", String.class);
        m.setAccessible(true);

        assertDoesNotThrow(() -> m.invoke(agenda, "Rex"));
    }

    @Test
    void deveRejeitarNomeInvalido() throws Exception {
        Method m = Agenda.class.getDeclaredMethod("validarNome", String.class);
        m.setAccessible(true);

        assertThrows(Exception.class, () -> m.invoke(agenda, "1"));
    }

    @Test
    void deveAceitarRacaValida() throws Exception {
        Method m = Agenda.class.getDeclaredMethod("validarRaca", String.class);
        m.setAccessible(true);

        assertDoesNotThrow(() -> m.invoke(agenda, "Poodle"));
    }

    @Test
    void deveRejeitarRacaVazia() throws Exception {
        Method m = Agenda.class.getDeclaredMethod("validarRaca", String.class);
        m.setAccessible(true);

        assertThrows(Exception.class, () -> m.invoke(agenda, ""));
    }

    @Test
    void deveAceitarIdadeValida() throws Exception {
        Method m = Agenda.class.getDeclaredMethod("validarIdade", String.class);
        m.setAccessible(true);

        Object idade = m.invoke(agenda, "5");
        assertEquals(5, idade);
    }

    @Test
    void deveRejeitarIdadeInvalida() throws Exception {
        Method m = Agenda.class.getDeclaredMethod("validarIdade", String.class);
        m.setAccessible(true);

        assertThrows(Exception.class, () -> m.invoke(agenda, "-1"));
    }

    @Test
    void deveReconstruirChaveApi() throws Exception {
        Method reconstruir = Agenda.class.getDeclaredMethod("reconstruirChave");
        reconstruir.setAccessible(true);

        reconstruir.invoke(agenda);

        var field = Agenda.class.getDeclaredField("chaveAPI");
        field.setAccessible(true);
        String chave = (String) field.get(agenda);

        assertNotNull(chave);
        assertFalse(chave.isEmpty());
    }

}
