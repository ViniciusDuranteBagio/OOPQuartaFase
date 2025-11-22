package Consulta;

import Animal.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SistemaVeterinarioTest {

    @Test
    public void testCriarAnimalValido() {
        Cachorro c = new Cachorro("Rex", 3, "SRD");
        Assertions.assertEquals("Rex", c.getNome());
        Assertions.assertEquals(3, c.getIdade());
    }

    @Test
    public void testNomeInvalidoLancaExcecao() {
        Assertions.assertThrows(RuntimeException.class, () -> new Gato("A", 2, "Persa"));
        Assertions.assertThrows(RuntimeException.class, () -> new Cachorro("1234", 2, "SRD"));
    }

    @Test
    public void testIdadeInvalidaLancaExcecao() {
        Assertions.assertThrows(RuntimeException.class, () -> new Coelho("Bunny", 0, "Angorá"));
        Assertions.assertThrows(RuntimeException.class, () -> new Cachorro("Dog", -1, "SRD"));
    }

    @Test
    public void testAgendaLimiteDez() {
        Agenda agenda = new Agenda();
        Funcionario func = new Funcionario("Maria"); // necessário para Banho/Tosa

        for (int i = 0; i < 10; i++) {
            Animal a = new Cachorro("Dog" + (char)('A' + i), 2, "SRD");
            Agendamento ag = new Agendamento(a, "Banho", func); // passa funcionário
            Assertions.assertTrue(agenda.adicionar(ag));
        }

        Animal extra = new Cachorro("Extra", 3, "SRD");
        Agendamento agExtra = new Agendamento(extra, "Tosa", func);
        Assertions.assertFalse(agenda.adicionar(agExtra));
    }

    @Test
    public void testAgendamentoConsultaComDoenca() {
        Animal a = new Gato("Luna", 4, "Persa");
        Veterinario vet = new Veterinario("Yago", 25); // necessário para consultas
        Agendamento ag = new Agendamento(a, "Consulta", vet);
        ag.setDoenca("Rinotraqueíte");
        Assertions.assertEquals("Rinotraqueíte", ag.getDoenca());
    }

    @Test
    public void testToStringAgendamentoBanho() {
        Animal a = new Cachorro("Rex", 3, "SRD");
        Funcionario func = new Funcionario("Maria");
        Agendamento ag = new Agendamento(a, "Banho", func);
        String esperado = "Rex | Atendimento: Banho | Funcionário(a): Maria";
        Assertions.assertEquals(esperado, ag.toString());
    }

    @Test
    public void testToStringAgendamentoConsulta() {
        Animal a = new Gato("Luna", 4, "Persa");
        Veterinario vet = new Veterinario("Carlos", 25);
        Agendamento ag = new Agendamento(a, "Consulta", vet);
        ag.setDoenca("Calicivirose");
        String esperado = "Luna | Atendimento: Consulta | Veterinário(a): Carlos | Doença: Calicivirose";
        Assertions.assertEquals(esperado, ag.toString());
    }
}
