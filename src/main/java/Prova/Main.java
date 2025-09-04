package Prova;

public class Main {
    public static void main(String[] args) {

    	//QUESTÃO 1
    	Carro carro = new Carro();
    	carro.ano = 2018;
    	carro.marca = "Fiat";

        carro.exibirDados();

        //QUESTÃO 2
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Álvaro";
        pessoa.idade = 18;

        pessoa.apresentar();

        //QUESTÃO 3
        Produto produto1 = new Produto();
        produto1.nome = "Geladeira";
        produto1.preco = 3500.00;

        Produto produto2 = new Produto();
        produto2.nome = "Fogão";
        produto2.preco = 2200.00;

        System.out.println("Produto 1: " + produto1.nome + " - R$" + produto1.preco);
        System.out.println("Produto 2: " + produto2.nome + " - R$" + produto2.preco);

        //QUESTÃO 4
        contaBancaria conta = new contaBancaria();
        conta.titular = "Álvaro";
        conta.saldo = 1000.00; //quem dera tivesse isso na conta

        System.out.println("Saldo inicial: R$" + conta.saldo);

        conta.depositar(500.00);
        System.out.println("Saldo após depósito: R$" + conta.saldo);

        conta.sacar(300.00);
        System.out.println("Saldo após saque: R$" + conta.saldo);

        conta.sacar(1500.00);
        System.out.println("Saldo final: R$" + conta.saldo);

        //QUESTÃO 5
        Animal animal1 = new Animal();
        animal1.nome = "Leão";
        animal1.idade = 10;

        animal1.fazerSom();

        //QUESTÃO 6
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Álvaro";
        aluno1.idade = 20;
        aluno1.matricula = "3613";

        aluno1.apresentar();

        //QUESTÃO 7
        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Thor José";
        cachorro.idade = 8;

        Gato gato = new Gato();
        gato.nome = "Maria Betânia";
        gato.idade = 6;

        cachorro.fazerSom();
        gato.fazerSom();

        //QUESTÃO 8
        Professor professor = new Professor();
        professor.nome = "Vinicius";
        professor.idade = 23;
        professor.disciplina = "Programação Orientada a Objeto";

        professor.apresentar();

        //QUESTÃO 9
        Funcionario func = new Funcionario();
        func.nome = "Álvaro";
        func.salario = 50000.00; //quem dera fosse pqp
        System.out.println(func.nome + " tem bônus de R$" + func.calcularBonus());

        Gerente gerente = new Gerente();
        gerente.nome = "James";
        gerente.salario = 80000.00;
        System.out.println(gerente.nome + " tem bônus de R$" + gerente.calcularBonus());
    }
}
