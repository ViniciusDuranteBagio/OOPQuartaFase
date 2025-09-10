package atividade7;

public class main {
    public static void main(String[] args) {

        Cachorro cao = new Cachorro();
        cao.idade = 10;
        cao.nome = "toto";

        cao.fazerSom();

        Gato gato = new Gato();
        gato.idade = 2;
        gato.nome = "bixano";

        gato.fazerSom();
    }
}
