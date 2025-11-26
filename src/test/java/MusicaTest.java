import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MusicaTest {


    private Musica musica;

    @BeforeEach
    void setUp() {
        musica = new Musica(0.5f);
    }

    @Test
    void testVolumeInicial() {
        assertEquals(0.5f, musica.getVolume(), 0.001);
        assertTrue(musica.isAtiva());
    }

    @Test
    void testSetVolume() {
        musica.setVolume(0.8f);
        assertEquals(0.8f, musica.getVolume(), 0.001);
        assertTrue(musica.isAtiva());

        musica.setVolume(0f);
        assertEquals(0f, musica.getVolume(), 0.001);
        assertFalse(musica.isAtiva());
    }

    @Test
    void testVolumeAtivaEAnterior() {

        musica.setVolume(0.7f);
        assertTrue(musica.isAtiva());

        musica.setVolume(0f);
        assertFalse(musica.isAtiva());

        musica.setVolume(0.7f);
        assertTrue(musica.isAtiva());
        assertEquals(0.7f, musica.getVolume(), 0.001);
    }


}
