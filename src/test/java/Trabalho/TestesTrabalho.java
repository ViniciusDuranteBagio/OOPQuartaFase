package Trabalho;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestesTrabalho {
    @Test
    public void testValidarTextoComNumero() {
        Consulta c = new Consulta();
        assertThrows(ValidacaoException.class, () -> c.validarTexto("1"));
    }

    @Test
    public void testValidarTextoCurto() {
        Consulta c = new Consulta();
        assertThrows(ValidacaoException.class, () -> c.validarTexto("A"));
    }

    @Test
    public void testSetAnimal() {
        Consulta c = new Consulta();
        Animal a = new Cachorro();
        c.setAnimal(a);
        assertEquals(a, c.getAnimal());
    }

    @Test
    public void testListaDoenca() {
        Animal a = new Cachorro();
        String[] lista = a.getListaDoenca();
        assertNotNull(lista);
        assertTrue(lista.length > 0);
    }


}
