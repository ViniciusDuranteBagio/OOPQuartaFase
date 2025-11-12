package org.example;

import Aula8.Pessoa;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteMaiorIdade {
    @Test
    public void TestAdult(){
        Pessoa p1 = new Pessoa("Pedro", 19);
        assertEquals(true, p1.isAdult());
    }
    @Test
    public void TesteMenorIdade(){
        Pessoa p2 = new Pessoa ("João", 15);
        assertEquals(true, p2.isAdult());
    }
    @Test
    public void TesteAna(){
        Pessoa p3 = new Pessoa ("Ana", 21);
        assertEquals(true, p3.isAdult());
    }
    @Test
    public void TesteLeo(){
        Pessoa p4 = new Pessoa("Leo", 15);
        assertEquals(false, p4.isAdult());
    }
    //6
    @Test
    public void TestesetNome(){
        Pessoa p5 = new Pessoa ("Carlos", 25);
        p5.setNome("Carlos");
        assertEquals("Carlos", p5.getNome());
    }
}
