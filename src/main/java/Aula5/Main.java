package Aula5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Vinicius";

        Aluno aluno = new Aluno();
        aluno.nome = "Tiago";

        professor.respirar();
        aluno.respirar();

        professor.falar();
        aluno.falar();

        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal elefante = new Elefante();

        cachorro.fazerSom();
        gato.fazerSom();

        Veterinario veterinario = new Veterinario();

        veterinario.cuidarDosAnimais(cachorro);
        veterinario.cuidarDosAnimais(gato);

        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(cachorro);
        animais.add(gato);

//        for (int contador = 0; contador < animais.size(); contador++) {
//            System.out.println("Contador: " + contador);
//        }

        for (Animal animal : animais) {
            veterinario.cuidarDosAnimais(animal);
        }

        List<MetodoPagamento> metodosDePagamento = new ArrayList<>();
        metodosDePagamento.add(new Pix());
        metodosDePagamento.add(new CartaoDeCredito());
        metodosDePagamento.add(new Boleto());

        for (MetodoPagamento metodo : metodosDePagamento) {
            metodo.cobrar();
        }

    }
}
