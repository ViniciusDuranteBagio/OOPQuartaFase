package Prova;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.ano = 1998;
        carro.marca = "Toyota";
        carro.ExibirDados();

        pessoa pessoa = new pessoa();
        pessoa.Apresentar();

        produto produto = new produto();
        produto.nome = "Socorro";
        produto.preco = 2014.4;
        produto.printar();

        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.depositar(100);
        contaBancaria.sacar(150);
        contaBancaria.exibirDados();

        Animal animal = new Animal();
        animal.idade = 50;
        animal.nome = "jurandir";
        animal.bixinho();
        animal.fazerSom();

        pessoa2 pessoa2 = new pessoa2();
        pessoa2.idade = 20;
        pessoa2.nome = "Rebeca";
        pessoa2.apresentar();

        Alunos alunos = new Alunos();
        alunos.idade = 20;
        alunos.nome = "Tamara";
        alunos.matricula = 247910;
        alunos.apresentar();

        Gato gato = new Gato();
        gato.fazerSom();

        Cachorro cachorro = new Cachorro();
        cachorro.fazerSom();




    }
}