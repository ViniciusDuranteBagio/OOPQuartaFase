import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PessoaTest {

    @Test
    public void testMaiorDeIdade() {
        Pessoa p = new Pessoa("Ana", 20);
        assertTrue(p.ehMaiorDeIdade());
    }

    @Test
    public void testMenorDeIdade() {
        Pessoa p = new Pessoa("Leo", 15);
        assertFalse(p.ehMaiorDeIdade());
    }

    @Test
    public void testSetNome() {
        Pessoa p = new Pessoa("João", 30);
        p.setNome("Carlos");
        assertEquals("Carlos", p.getNome());
    }
}