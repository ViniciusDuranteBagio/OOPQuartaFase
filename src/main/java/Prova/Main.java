package Prova;


import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //Q1
        System.out.println("Q1/");

        Carro carro = new Carro("Fiat", 2014);
        carro.exibirDados();
        System.out.println();

        //Q2
        System.out.println("Q2/");

        Pessoa pessoa = new Pessoa("Otávio", 19);
        pessoa.apresentar();
        System.out.println();

        //Q3
        System.out.println("Q3/");

        Produto produto1 = new Produto("Camiseta", 99.90);
        Produto produto2 = new Produto("Shorts", 129.90);

        produto1.exibirProduto();
        produto2.exibirProduto();
        System.out.println();

        //Q4
        System.out.println("Q4/");

        ContaBancaria conta = new ContaBancaria("Otávio Corrêa");
        conta.depositar(200.00);
        conta.exibirConta();
        conta.sacar(250.00);
        conta.exibirConta();
        conta.sacar(180.00);
        conta.exibirConta();
        System.out.println();

        //Q5
        System.out.println("Q5/");

        Animal animal = new Animal("Rex", 8);
        animal.fazerSom("latido");
        System.out.println();

        //Q6
        System.out.println("Q6/");

        Aluno aluno = new Aluno("João", 19, "99763233");
        aluno.apresentar();
        System.out.println();

        //Q7
        System.out.println("Q7/");

        Cachorro cachorro = new Cachorro("Bob", 6);
        cachorro.fazerSom();
        Gato gato = new Gato("Niba", 5);
        gato.fazerSom();
        System.out.println();

        //Q8
        System.out.println("Q8/");

        Professor professor = new Professor("Alan", 28, "química");
        professor.apresentar();
        System.out.println();

        //Q9
        System.out.println("Q9/");

        Funcionario func = new Funcionario("João", 3000.00);
        func.calcularBonus();
        Gerente gerente = new Gerente("Pedro", 9000.00);
        gerente.calcularBonus();
        System.out.println();

    }
}



