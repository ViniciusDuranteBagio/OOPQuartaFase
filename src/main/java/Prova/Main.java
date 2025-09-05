package Prova;

public class Main {
    public static void main(String[] args) {
        // Q1
        System.out.println("Q1");
        Carro carro = new Carro();
        carro.marca = "Pagani";
        carro.ano = 2025;
        carro.exibirDados();
        System.out.println();

        // Q2
        System.out.println("Q2");
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Ana Gabriela";
        pessoa.idade = 21;
        pessoa.apresentar();
        System.out.println();

        // Q3
        System.out.println("Q3");
        Produto p1 = new Produto();
        p1.nome = "Perfume";
        p1.preco = 399.00;
        Produto p2 = new Produto();
        p2.nome = "Shampoo";
        p2.preco = 176.00;
        System.out.println("Produto 1: " + p1.nome + " - R$" + p1.preco);
        System.out.println("Produto 2: " + p2.nome + " - R$" + p2.preco);
        System.out.println();

        // Q4
        System.out.println("Q4");
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Ana Gabriela";
        conta.saldo = 2150.00;
        conta.depositar(150);
        conta.sacar(1000);
        conta.sacar(1000); // saldo insuficiente
        System.out.println("Titular: " + conta.titular);
        System.out.println("Saldo: R$" + conta.saldo);
        System.out.println();

        // Q5
        System.out.println("Q5");
        Animal animal = new Animal();
        animal.nome = "Perola";
        animal.idade = 1;
        animal.fazerSom();
        System.out.println();

        // Q6
        System.out.println("Q6");
        Aluno aluno = new Aluno();
        aluno.nome = "Ana Gabriela";
        aluno.idade = 21;
        aluno.matricula = "17122003";
        aluno.apresentar();
        System.out.println();

        // Q7
        System.out.println("Q7");
        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Theo";
        cachorro.fazerSom();

        Gato gato = new Gato();
        gato.nome = "Mimi";
        gato.fazerSom();
        System.out.println();

        // Q8
        System.out.println("Q8");
        Professor prof = new Professor();
        prof.nome = "Vinicius";
        prof.idade = 24;
        prof.disciplina = "Programação orientada";
        prof.apresentar();
        System.out.println();

        // Q9
        System.out.println("Q9");
        Funcionario func = new Funcionario();
        func.nome = "Gabriel T";
        func.salario = 150.00;

        Gerente gerente = new Gerente();
        gerente.nome = "Ana Gabriela";
        gerente.salario = 4000.00;

        System.out.println(func.nome + " - bônus: R$" + func.calcularBonus());
        System.out.println(gerente.nome + " - bônus: R$" + gerente.calcularBonus());
        System.out.println();
    }
}
