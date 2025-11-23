import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnimalTest {

    @Test
    void deveCriarCachorroComDadosCorretos() throws ValidacaoException {
        Cachorro cachorro = new Cachorro("Bob", 4, "Rusky");

        Assertions.assertEquals("Bob", cachorro.getNome());
        Assertions.assertEquals(4, cachorro.getIdade());
        Assertions.assertEquals("Rusky", cachorro.getRaca());
    }

    @Test
    void deveLancarExececaoQuandoNomeForInvalido() throws ValidacaoException {
        Assertions.assertThrows(ValidacaoException.class, () -> {
            new Gato("B", 2, "Siames");
        });
    }

    @Test
    void deceLancarExececaoQuandoIdadeForMenorQueUm() throws ValidacaoException {
        Assertions.assertThrows(ValidacaoException.class, () -> {
            new Coelho("Branquinho", 0, "Baixo");
        });

        Assertions.assertThrows(ValidacaoException.class, () -> {
            new Gato("Frajola", -4, "Siames");
        });
    }

    @Test
    void deveLancarExececaoQuandoRacaForVazia() throws ValidacaoException {
        Assertions.assertThrows(ValidacaoException.class, () -> {
            new Cachorro("Rex", 2, "");
        });

        Assertions.assertThrows(ValidacaoException.class, () -> {
            new Coelho("Pintado", 7, "");
        });
    }
}
