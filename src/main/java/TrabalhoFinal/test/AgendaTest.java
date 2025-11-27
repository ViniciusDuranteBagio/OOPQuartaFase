import org.junit.Test;
import static org.junit.Assert.*;

public class AgendaTest {
    @Test
    public void testAdicionarEListar() throws Exception {
        Agenda a = new Agenda();
        Cachorro c = new Cachorro("Rex", 3, "SRD");
        Consulta cons = new Consulta(c, Consulta.TipoAtendimento.BANHO, null);
        a.adicionarConsulta(cons);
        assertEquals(1, a.listar().size());
    }
}
