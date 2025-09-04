package Prova;

public class Main {
    public static void main(String[] args) {
        Carro1 Carro2 = new Carro1();
        Carro2.marca = "Mitsubishi";
        Carro2.ano = 2013;
        //  Carro2.ExibirDados();



//      QUESTÃO 2

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome= "Fernando Coan";
        pessoa1.idade = 21;
        // pessoa1.apresentar();

//      Questão 3

        Produto produto1 = new Produto();
        produto1.nome= "tenis";
        produto1.preco = 129;

        Produto produto2 = new Produto();
        produto2.nome= "meia";
        produto2.preco = 10;

        //    produto1.ExibirDados();
        //    produto2.ExibirDados();

//      Questão 4

        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Jhonny";
        conta1.saldo = 160.00;
        //    conta1.Depositar(530);
        //    conta1.ExibirSaldo();
        //   conta1.sacar(1320);
        //    conta1.ExibirSaldo();

//      Questão 5

        Animal animal1 = new Animal();
        animal1.nome = "cobra";
        animal1.idade = 2;
        //    animal1.fazerSom();

//      Questão 6

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome= "Fernando Coan";
        pessoa2.idade = 21;
        // pessoa2.apresentar();

        Aluno aluno1 = new Aluno();
        aluno1.nome= "Dominic";
        aluno1.idade = 120;
        //aluno1.matricula = 89432948;
        //aluno1.apresentar();



//      Questão 7

        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome= "Joana";
        cachorro1.idade = 7;
       // cachorro1.fazerSom();

        Gato gato1 = new Gato();
        gato1.nome= "jinx";
        gato1.idade = 2;
        //gato1.fazerSom();

        //      Questão 8

        Professora professor1 = new Professora();
        professor1.nome = "joao neto";
        professor1.idade = 44;
        professor1.disciplina = "Estrutura e dados";
        //professor1.apresentar();

//      Questão 9

        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Fernando";
        funcionario1.salario = 110.00;
        funcionario1.CalcularBonus();

        Gerente gerente1 = new Gerente();
        gerente1.nome = "Joao";
        gerente1.salario = 70.00;
        gerente1.CalcularBonus();

    }
}