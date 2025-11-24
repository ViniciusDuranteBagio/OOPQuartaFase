package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import trabalho_final.Agenda;
import trabalho_final.Animal;
import trabalho_final.Atendimento;
import trabalho_final.Cachorro;
import trabalho_final.Coelho;
import trabalho_final.Consulta;
import trabalho_final.Gato;
import trabalho_final.ValidacaoException;

public class TestesTrabalho {

    @Test
    public void testeAdicionarConsulta() throws Exception {
        Agenda agenda = new Agenda();
        Animal animal = new Cachorro("Thor", "5 anos", "Basset Hound");
        Atendimento a = new Atendimento("Banho");
        Consulta c = new Consulta(animal, a, "21/11/2025", null);

        agenda.adicionarConsulta(c);

        assertTrue(agenda.listarConsultas().contains("Thor"));
    }

    @Test
    public void testeAdicionarConsultaComAgendaCheia() throws Exception {
        Agenda agenda = new Agenda();
        Animal animal = new Gato("Fred", "3 meses", "Persa");
        Atendimento a = new Atendimento("Tosa");

        for (int i = 0; i < 10; i++) {
            agenda.adicionarConsulta(new Consulta(animal, a,"01/01/2025",null));
        }

        assertThrows(ValidacaoException.class, () -> {
            agenda.adicionarConsulta(new Consulta(animal, a,"02/01/2025",null));
        });
    }

    @Test
    public void testeCancelarConsulta() throws Exception {
        Agenda agenda = new Agenda();
        Animal animal = new Coelho("Peralta", "2 anos", "Rex");
        Atendimento a = new Atendimento("Banho");
        Consulta c = new Consulta(animal, a, "05/03/2025", null);

        agenda.adicionarConsulta(c);
        agenda.cancelarConsulta("Peralta");

        assertTrue(agenda.listarConsultas().contains("Nenhuma consulta"));
    }

    @Test
    public void testeCancelarConsulta_Inexistente() throws Exception {
        Agenda agenda = new Agenda();

        assertThrows(ValidacaoException.class, () -> {
            agenda.cancelarConsulta("Fantasma");
        });
    }


    @Test
    public void testeCriarAnimalComNomeInvalido() {
        assertThrows(ValidacaoException.class, () -> {
            new Gato("Y", "3 anos", "Siamês");
        });
    }


    @Test
    public void testeCriarAtendimentoInvalido() {
        assertThrows(ValidacaoException.class, () -> {
            new Atendimento("");
        });
    }


    @Test
    public void testeCriarConsultaValidaComTratamento() throws Exception {
        Animal animal = new Coelho("Pernalonga", "17 anos", "Fictício");
        Atendimento a = new Atendimento("Tratamento");

        Consulta c = new Consulta(animal, a, "18/05/2023", "Sarna Auricular");

        assertEquals("Sarna Auricular", c.getDoenca());
    }
}
