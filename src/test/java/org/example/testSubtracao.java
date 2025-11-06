package org.example;
import Aula8.TesteSubtracao;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testSubtracao {

    @Test
    public void subtracao(){
        TesteSubtracao test = new TesteSubtracao();
        int resultado = test.subtrair(10,5);
        assertEquals(5, resultado);

    }
}
