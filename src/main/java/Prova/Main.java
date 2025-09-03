package Prova;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Exercício 1: ");
        Carro carro = new Carro("Citroen ", 2011);
        carro.exibirDados();
        System.out.println(" ");

        System.out.println("Exercício 2: ");
        Pessoa pessoa = new Pessoa("Luciano", 25);
        pessoa.apresentar();
        System.out.println(" ");

        System.out.println("Exercício 3: ");
        Produto produto1 = new Produto("Papel higiênico", 31.99);
        Produto produto2 = new Produto("Telefone celular", 1550.99);

        System.out.println("Produto 1: " + produto1.nome + "\nPreço do produto 1: " + produto1.preco);
        System.out.println("Produto 2: " + produto2.nome + "\nPreço do produto 2: " + produto2.preco);
        System.out.println(" ");

        System.out.println("Exercício 4: ");
        ContaBancaria contaBancaria = new ContaBancaria("Ednaldo", 1500);
        contaBancaria.depositar(1000);
        contaBancaria.exibirSaldo();
        contaBancaria.sacar(3000);
        contaBancaria.sacar(2000);
        contaBancaria.exibirSaldo();
        System.out.println(" ");

        System.out.println("Exercício 5: ");
        Animal animal = new Animal("Thor", 12);
        animal.fazerSom();
        System.out.println(" ");

        System.out.println("Exercício 6: ");
        Aluno aluno = new Aluno("Paulo", 17, 12345);
        aluno.apresentar();
        System.out.println(" ");

        System.out.println("Exercício 7: ");
        Cachorro cachorro = new Cachorro("Lisa", 16);
        cachorro.fazerSom();
        Gato gato = new Gato("Eva", 18);
        gato.fazerSom();
        System.out.println(" ");

        System.out.println("Exercício 8: ");
        Professor professor = new Professor("Sandro", 48, "Química");
        professor.apresentar();
        System.out.println(" ");

        System.out.println("Exercício 9");
        Funcionario funcionario = new Funcionario("Marcelo", 5000);
        funcionario.calcularBonus();
        Gerente gerente = new Gerente("Douglas", 10000);
        gerente.calcularBonus();
    }
}
