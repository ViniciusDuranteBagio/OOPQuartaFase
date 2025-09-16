package exercicios;

public class Exercicio3 {
    public static void main(String[] args) {
        Carro carro = new Carro("Ford", "Fiesta", 4);
        Moto moto = new Moto("Honda", "CB500", 500);

        carro.exibirDetalhes();
        moto.exibirDetalhes();
    }
}
