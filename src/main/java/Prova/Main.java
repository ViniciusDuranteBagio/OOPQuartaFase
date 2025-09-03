package Prova;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.marca = "Toyota";
        carro.ano = 2020;

        carro.exibirDados();

        System.out.println("--------------------");

        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Carlos";
        pessoa.idade = 23;

        pessoa.apresentar();

        System.out.println("--------------------");

        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 3500.00;

        Produto p2 = new Produto();
        p2.nome = "Smartphone";
        p2.preco = 2500.00;

        p1.exibirProduto();
        p2.exibirProduto();

        System.out.println("--------------------");

        ContaBancaria conta = new ContaBancaria();
        conta.titular = "João";
        conta.saldo = 1000.0;

        conta.exibirConta();

        conta.depositar(500.0);
        conta.sacar(200.0);
        conta.sacar(2000.0);

        conta.exibirConta();

        System.out.println("--------------------");

        Animal cachorro = new Animal();
        cachorro.nome = "Rex";
        cachorro.idade = 5;

        cachorro.fazerSom();

        System.out.println("--------------------");

        Aluno a1 = new Aluno();
        a1.nome = "Julio";
        a1.idade = 18;
        a1.matricula = "2025A123";

        a1.apresentar();

        System.out.println("--------------------");

        Cachorro dog = new Cachorro();
        dog.nome = "Rex";
        dog.idade = 4;

        dog.fazerSom();

        System.out.println("--------------------");

        Gato cat = new Gato();
        cat.nome = "Tommy";
        cat.idade = 10;

        cat.fazerSom();

        System.out.println("--------------------");

        Professor prof = new Professor();
        prof.nome = "Ana";
        prof.idade = 35;
        prof.disciplina = "Artes";

        prof.apresentar();

        System.out.println("--------------------");

        Funcionario f1 = new Funcionario();
        f1.nome = "João";
        f1.salario = 3000.0;

        Gerente g1 = new Gerente();
        g1.nome = "Maria";
        g1.salario = 5000.0;

        f1.exibirDados();
        g1.exibirDados();

    }
}
