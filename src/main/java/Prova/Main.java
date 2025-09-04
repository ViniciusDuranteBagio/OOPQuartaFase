package Prova;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Atividade 1 - Carro
        Carro c1 = new Carro();
        c1.setMarca("Volkswagen");
        c1.setAno(2008);
        c1.exibirResultado();

        //Atividade 2 - Pessoa
        System.out.println("----------------------------------------------------------");
        Pessoa p1 = new Pessoa();
        p1.setNome("Gabriel");
        p1.setIdade(20);
        p1.apresentar();

        //Atividade 3 - Produto
        System.out.println("----------------------------------------------------------");
        Produto product = new Produto();
        product.setNome("Sacola");
        product.setPreco(58.99);
        System.out.println("Produto: " + product.getNome() + "" +
                "\nPreço: " + product.getPreco());

        //Atividade 4 - Conta Bancaria
        System.out.println("----------------------------------------------------------");
        ContaBancaria conta1 = new ContaBancaria();
        conta1.setTitular("Gabriel");
        conta1.deposito(500);
        conta1.sacar(250); //Se colocar um valor maior que o depósito o codigo informa que o valor é maior e não saca nada, mostrando apenas o valor depositado :)
        conta1.exibirSaldo();

        //Atividade 5 - Animal
        System.out.println("----------------------------------------------------------");
        Animal a1 = new Animal();
        a1.fazerSom();

        //Atividade 6 - Aluno com herança da classe Pessoa
        System.out.println("----------------------------------------------------------");
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Gabriel");
        aluno1.setIdade(20);
        aluno1.apresentar();

        //Atividade 7 - Animal com herança
        System.out.println("----------------------------------------------------------");
        Cachorro dog = new Cachorro();
        dog.fazerSom();
        Gato cat = new Gato();
        cat.fazerSom();

        //Atividade 8 - Professor
        System.out.println("----------------------------------------------------------");
        Professor pro1 = new Professor();
        pro1.apresentar();

        //Atividade 9 - Funcionario
        System.out.println("----------------------------------------------------------");
        Funcionario f1 = new Funcionario();
        f1.CalcularBonus();
        Gerente g1 = new Gerente();
        g1.CalcularBonus();
    }
}
