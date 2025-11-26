import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    static class AnimalFake extends Animal {
        public AnimalFake(String nome, String raca, int idade) {
            super(nome, raca, idade);
        }
    }

    @Test
    void testConstrutorEGetters() {
        Animal animal = new AnimalFake("Bidu", "SRD", 3);

        assertEquals("Bidu", animal.getNome());
        assertEquals("SRD", animal.getRaca());
        assertEquals(3, animal.getIdade());
        assertEquals("Animal", animal.getTipo());
    }

    @Test
    void testSetters() {
        Animal animal = new AnimalFake("Bidu", "SRD", 3);

        animal.setNome("Rex");
        animal.setRaca("Labrador");
        animal.setIdade(10);

        assertEquals("Rex", animal.getNome());
        assertEquals("Labrador", animal.getRaca());
        assertEquals(10, animal.getIdade());
    }
}
