package org.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class TestExample {

    @Test
    public void deveLancarErroParaNomeInvalido() {
        assertThrows(ValidacaoException.class, () -> {
            new Cachorro("1", 3, "Poodle");
        });
    }

    @Test
    public void deveLancarErroParaIdadeZeroOuNegativa() {
        assertThrows(ValidacaoException.class, () -> {
            new Gato("Mimi", 0, "Siamês");
        });

        assertThrows(ValidacaoException.class, () -> {
            new Gato("Mimi", -5, "Siamês");
        });
    }

    @Test
    public void cachorroDeveTerDoencasDefinidas() throws Exception {
        Animal dog = new Cachorro("Rex", 4, "Vira-lata");
        List<String> doencas = dog.getDoencasComuns();

        assertTrue(doencas.contains("Cinomose"));
        assertTrue(doencas.contains("Parvovirose"));
        assertEquals(5, doencas.size());
        assertEquals(5, doencas.size());
    }


    @Test
    public void gatoDeveTerDoencasDefinidas() throws Exception {
        Animal gato = new Gato("Luna", 2, "SRD");
        List<String> doencas = gato.getDoencasComuns();

        assertTrue(doencas.contains("PIF"));
        assertTrue(doencas.contains("Otite"));
        assertEquals(5, doencas.size());
    }


    @Test
    public void coelhoDeveTerDoencasDefinidas() throws Exception {
        Animal coelho = new Coelho("Bunny", 1, "Mini Lop");
        List<String> doencas = coelho.getDoencasComuns();

        assertTrue(doencas.contains("Mixomatose"));
        assertTrue(doencas.contains("Coccidiose"));
        assertEquals(5, doencas.size());
    }

    @Test
    public void deveImpederMaisDeDezConsultas() throws Exception {
        Agenda agenda = new Agenda();

        Animal dog = new Cachorro("Rex", 3, "Boxer");

        for (int i = 0; i < 10; i++) {
            agenda.adicionarConsulta(new Consulta(dog, TipoAtendimento.BANHO, null));
        }

        assertThrows(ValidacaoException.class, () -> {
            agenda.adicionarConsulta(new Consulta(dog, TipoAtendimento.BANHO, null));
        });
    }


    @Test
    public void deveCriarAnimalValido() throws Exception {
        Animal a = new Gato("Mimi", 3, "Persa");

        assertEquals("Mimi", a.getNome());
        assertEquals(3, a.getIdade());
        assertEquals("Persa", a.getRaca());
    }
}
