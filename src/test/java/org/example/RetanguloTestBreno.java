package org.example;
import static org.junit.jupiter.api.Assertions.*;
import Aula7BrenoLibrelatoManoel.Retangulo;
import org.junit.jupiter.api.Test;

public class RetanguloTestBreno {

    @Test
    public void testeConstrutor() {
        Retangulo r = new Retangulo(3, 6);
        assertEquals(3, r.getLargura(), "A largura deve ser 3");
        assertEquals(6, r.getAltura(), "A altura deve ser 6");
    }

    @Test
    public void calcularPerimetro(){
        Retangulo retangulo = new Retangulo(4,5);
        int resultado = retangulo.calcularArea(4,5);
        assertEquals(20, resultado);
    }
}
