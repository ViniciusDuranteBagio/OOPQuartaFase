import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class DoencasAnimalTest {

    @Test
    void deveRetornarDoencasCorretasParaCachorro() throws ValidacaoException {
        Animal cachorro = new Cachorro("Rex", 3, "Vira-lata");
        List<String> diseases = cachorro.getCommonDiseases();

        Assertions.assertTrue(diseases.contains("Cinomose"));
        Assertions.assertTrue(diseases.contains("Parvovirose"));
        Assertions.assertTrue(diseases.contains("Leptospirose"));
        Assertions.assertTrue(diseases.contains("Dermatite"));
        Assertions.assertTrue(diseases.contains("Otite"));
    }

    @Test
    void deveRetornarListaDeDoencasParaGato() throws ValidacaoException {
        Animal gato = new Gato("Sam", 2, "Siames");
        List<String> diseases = gato.getCommonDiseases();

        Assertions.assertFalse(diseases.isEmpty());
    }

    @Test
    void deveRetornarListaDeDoencasParaCoelho() throws ValidacaoException {
        Animal coelho = new Coelho("Mesclado", 1, "Fofo");
        List<String> diseases = coelho.getCommonDiseases();

        Assertions.assertFalse(diseases.isEmpty());
    }
}

