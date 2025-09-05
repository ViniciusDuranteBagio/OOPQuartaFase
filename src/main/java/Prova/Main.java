package Prova;

import javax.naming.ldap.PagedResultsControl;

public class Main {
    // Questao 1
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.ano = "1997";
        carro.marca= "Fiat";
        carro.ExibirDados();
        System.out.println(" Uno ano " + carro.ano + " Marca " + carro.marca);

    // Questão 2

        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Gabriel";
        pessoa.idade= "23";
        pessoa.apresentar();
        System.out.println("Meu nome é " + pessoa.nome + " E tenho " + pessoa.idade + " anos " );

        //Questão 3

        Produto produto = new Produto();
        produto.nome = " Corote ";
        produto.preco = " 10 reais ";
        Produto produto2 = new Produto();
        produto2.nome = " Balalaika ";
        produto2.preco =  "15 reais " ;
        System.out.println(" O produto " + produto.nome + " custa " + produto.preco );
        System.out.println(" O produto " + produto2.nome + " custa " + produto2.preco);

        // Questão 4

        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.titular = " Gabriel ";
        contaBancaria.saldo = 50;
        contaBancaria.depositar(100);
        System.out.println(contaBancaria.saldo);
        contaBancaria.sacar(100);

        // Questão 5

        Animal animal = new Animal();
        animal.nome = " Tamanduá Bandeira ";
        animal.idade = " 10 anos ";
        System.out.println(" O animal " + animal.nome + " de " + animal.idade + " fez " );
        animal.fazerSom();

        // Questão 6

        Pessoa1 pessoa1 = new Pessoa1();
        pessoa1.nome = " Gabriel ";
        pessoa1.idade = " 23 anos ";
        Aluno aluno = new Aluno();
        aluno.nome = " Gabriel ";
        aluno.idade = "23 anos ";
        aluno.matricula = " 241960 ";
        aluno.apresentar();

        // Questão 7

        Cachorro cachorro = new Cachorro();
        cachorro.nome = " Meg ";
        Gato gato = new Gato();
        gato.nome = " Danilo ";
        cachorro.fezoSom();
        gato.fezoSom();

        // Questão 8

        Professor professor = new Professor();
        professor.nome = " Gabriel ";
        professor.disciplina = "História";
        professor.apresentar();


        System.out.println("O professor " + professor.nome + " Da aula de " + professor.disciplina);

        // Questão 9

    Funcionario funcionario = new Funcionario();
    funcionario.salario = 1350;
    Gerente gerente = new Gerente();
    gerente.salario1 = 3000;
        System.out.println(" Funcionário tem o salário de " +funcionario.salario);
        System.out.println("Gerente tem o salario de " + gerente.salario1);
    gerente.calcularBonus();
        System.out.println(funcionario.salario + " bônus: R$ " + funcionario.calcularBonus());
        System.out.println(gerente.salario1 + " bônus: R$ " + gerente.calcularBonus());













    }

}




