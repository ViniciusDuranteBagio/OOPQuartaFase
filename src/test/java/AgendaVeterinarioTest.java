import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AgendaVeterinarioTest {

    @Test
    void deveAdicionarConsultaComSucesso() throws ValidacaoException {
        AgendaVeterinario agendaVeterinario = new AgendaVeterinario();
        Animal cachorro = new Cachorro("Thor", 4, "Rusky");
        Consulta consulta = new Consulta(cachorro, "Banho e Tosa", null);

        agendaVeterinario.adicionarConsulta(consulta);

        Assertions.assertEquals(1, agendaVeterinario.listaConsultas().size());
    }

    @Test
    void naoDevePermitirMaisDeDezConsultas() throws ValidacaoException {
        AgendaVeterinario agendaVeterinario = new AgendaVeterinario();
        Animal cachorro = new Cachorro("Thor", 4, "Rusky");

        for(int i = 0; i < 10; i++) {
            agendaVeterinario.adicionarConsulta(new Consulta(cachorro, "Banho e Tosa", null));
        }

        Assertions.assertThrows(ValidacaoException.class, () -> {
            agendaVeterinario.adicionarConsulta(new Consulta(cachorro, "Banho e Tosa", null));
        });
    }
}
