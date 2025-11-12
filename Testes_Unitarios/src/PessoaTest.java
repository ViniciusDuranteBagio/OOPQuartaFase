import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    @Test
    void testMaiorDeIdade() {
        Pessoa p = new Pessoa("Ana", 20);
        assertTrue(p.ehMaiorDeIdade());
    }

    @Test
    void testMenorDeIdade() {
        Pessoa p = new Pessoa("Leo", 15);
        assertFalse(p.ehMaiorDeIdade());
    }

    @Test
    void testSetNome() {
        Pessoa p = new Pessoa("João", 25);
        p.setNome("Carlos");
        assertEquals("Carlos", p.getNome());
    }
}