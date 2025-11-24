package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import TrabalhoFinal.Agenda;
import TrabalhoFinal.Animal;
import TrabalhoFinal.Atendimento;
import TrabalhoFinal.Cachorro;
import TrabalhoFinal.Coelho;
import TrabalhoFinal.Consulta;
import TrabalhoFinal.Gato;
import TrabalhoFinal.ValidacaoException;

public class Teste {

    @Test
    public void testeAdicionarConsulta() throws Exception {
        Agenda agenda = new Agenda();
        Animal animal = new Cachorro("Luna", 4, "Border Collie");
        Atendimento a = new Atendimento("Banho");
        Consulta c = new Consulta(animal, a, "12/12/2025", null);
        agenda.adicionarConsulta(c);

        assertTrue(agenda.listarConsultas().contains("Luna"));
    }

    @Test
    public void testeAdicionarConsultaComAgendaCheia() throws Exception {
        Agenda agenda = new Agenda();
        Animal animal = new Gato("Milo", 1, "Sphynx");
        Atendimento a = new Atendimento("Tosa");

        for (int i = 0; i < 10; i++) {
            agenda.adicionarConsulta(new Consulta(animal, a,"10/01/2026",null));
        }

        assertThrows(ValidacaoException.class, () -> {
            agenda.adicionarConsulta(new Consulta(animal, a,"11/01/2026",null));
        });
    }

    @Test
    public void testeCancelarConsulta() throws Exception {
        Agenda agenda = new Agenda();
        Animal animal = new Coelho("Nuvem", 3, "Mini Rex");
        Atendimento a = new Atendimento("Banho");
        Consulta c = new Consulta(animal, a, "08/02/2026", null);

        agenda.adicionarConsulta(c);
        agenda.cancelarConsulta("Nuvem");

        assertTrue(agenda.listarConsultas().contains("Nenhuma consulta"));
    }

    @Test
    public void testeCancelarConsulta_Inexistente() throws Exception {
        Agenda agenda = new Agenda();

        assertThrows(ValidacaoException.class, () -> {
            agenda.cancelarConsulta("Desconhecido");
        });
    }

    @Test
    public void testeCriarAnimalComNomeInvalido() {
        assertThrows(ValidacaoException.class, () -> {
            new Gato("A", 2, "Siamês");
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
        Animal animal = new Coelho("Algodão", 6, "Fictício");
        Atendimento a = new Atendimento("Tratamento");

        Consulta c = new Consulta(animal, a, "25/06/2026", "Dermatite");

        assertEquals("Dermatite", c.getDoenca());
    }
}