package Prova;

public class Main {
    //ATIVIDADE 1
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.marca = "Renault";
        meuCarro.ano = 2010;

        meuCarro.ExibirResultados();

        //ATIVIDADE 2
     Pessoa pessoa1 = new Pessoa();

     pessoa1.nome = "Carlos";
     pessoa1.idade = 45;

     pessoa1.apresentar();


     //ATIVIDADE 3

    Produto produto1 = new Produto();
    produto1.nome = "Geladeira";
    produto1.preco = 4000;

    Produto produto2 = new Produto();
    produto2.nome = "Playstation";
    produto2.preco = 5000;

        System.out.println("Produto um:" + produto1 +"R$  " + produto1.preco);
        System.out.println("Produto dois:" + produto2 + "R$ " + produto2.preco);


     //ATIVIDADE 4

        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Andreia";
        conta.saldo = 5000;

        conta.exibirSaldo();

        //ATIVIDADE 5

        Animal animal1 = new Animal();
        animal1.nome = "Baleia";
        animal1.idade = 5;

        animal1.fazerSom();

        //ATIVIDADE 6

        Aluno aluno = new Aluno();
        aluno.nome = "Andrei";
        aluno.idade = 20;
        aluno.matricula = "2000A0";

        aluno.apresentar();

        //ATIVIDADE 7

    Cachorro cachorro = new Cachorro();
    cachorro.nome = "Bartolomeu";
    cachorro.idade = 4;
    cachorro.fazerSom();

    Gato gato = new Gato();
    gato.nome = "Mia";
    gato.idade = 3;
    gato.fazerSom();

    //ATIVIDADE 8

        Professor professor = new Professor();
        professor.nome = "Eduardo";
        professor.idade = 35;
        professor.disciplina = "Matemática";

        professor.apresentar();

        //ATIVIDADE 9

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Carlos";
        funcionario.salario = 3000.0;

        funcionario.exibirInformacoes();

        Gerente gerente = new Gerente();
        gerente.nome = "Luciano";
        gerente.salario = 50000;

        gerente.exibirInformacoes();
    }
}

