import Questão_1.Carro;
import Questão_2.Pessoa;

public class Main {
    public static void main(String[] args) {
        // Criando o carro
        Carro car = new Carro();
        car.Marca = "Hyundai";
        car.Modelo = "HB20";
        System.out.println("Marca: " + car.Marca + "\nModelo: " + car.Modelo);

        System.out.println("------------------------");

        // Criando a pessoa
        Pessoa pessoa = new Pessoa();
        pessoa.Nome = "Pedro";
        pessoa.Idade = 20;
        System.out.println(pessoa.apresentar());
    }
}
