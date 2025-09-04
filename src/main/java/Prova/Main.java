package Prova;

public class Main {

    //QUESTÃO 1
    public static void main(String[] args) {

        /*QUESTÃO 1*/        System.out.println("\n-> QUESTÃO 1 \n");
        Carro carro = new Carro();

        carro.marca = "Hyundai";
        carro.ano = 2018;

        carro.exibirDados();

        /*QUESTÃO 2*/        System.out.println("\n-> QUESTÃO 2 \n");
        Pessoa pessoa = new Pessoa("Tiago", 19);

        pessoa.apresentar();

        /*QUESTÃO 3*/        System.out.println("\n-> QUESTÃO 3 \n");
        Produto celular = new Produto("iPhone 13 Pro Max", 3.499);
        Produto computador = new Produto("Dell G15", 5.798);

        celular.imprimeValores();
        computador.imprimeValores();

        /*QUESTÃO 4*/        System.out.println("\n-> QUESTÃO 4 \n");
        ContaBancaria minhaConta = new ContaBancaria("Tiago", 1000);

        minhaConta.depositar(200);
        minhaConta.exibirSaldo();
        minhaConta.depositar(-500);
        minhaConta.exibirSaldo();
        minhaConta.sacar(500);
        minhaConta.exibirSaldo();
        minhaConta.sacar(10000);
        minhaConta.exibirSaldo();

        /*QUESTÃO 5*/        System.out.println("\n-> QUESTÃO 5 \n");
        Animal animal = new Animal("Thor", 10);

        animal.fazerSom();


        /*QUESTÃO 6*/        System.out.println("\n-> QUESTÃO 6 \n");
        Pessoa pessoa2 = new Pessoa("Tiago", 19);

        pessoa2.apresentar();

        Aluno aluno = new Aluno("Jotapê", 19, 12345);

        aluno.apresentar();

        /*QUESTÃO 7*/        System.out.println("\n-> QUESTÃO 7 \n");
        Cachorro cachorro = new Cachorro("Thor", 10);
        Gato gato = new Gato("Ziggy", 8);

        cachorro.fazerSom();
        gato.fazerSom();

        /*QUESTÃO 8*/        System.out.println("\n-> QUESTÃO 8 \n");
        Professor professor = new Professor("Vinicius", 24, "OOP");

        professor.apresentar();

        /*QUESTÃO 9*/        System.out.println("\n-> QUESTÃO 9 \n");
        Funcionario funcionario = new Funcionario("Jotapê", 2500);
        Gerente gerente = new Gerente("Tiago", 7000);

        funcionario.calcularBonus();
        gerente.calcularBonus();
    }


}
