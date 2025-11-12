import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    @Test
    public void testeMaiorDeIdade() {
        Pessoa p = new Pessoa("Ana", 20);
        assertTrue(p.ehMaiorDeIdade());
    }

    @Test
    public void testeMenorDeIdade() {
        Pessoa p = new Pessoa("Leo", 15);
        assertFalse(p.ehMaiorDeIdade());
    }

    @Test
    public void testeSetNome() {
        Pessoa p = new Pessoa("Marcos", 30);
        p.setNome("Carlos");
        assertEquals("Carlos", p.getNome());
    }
}

