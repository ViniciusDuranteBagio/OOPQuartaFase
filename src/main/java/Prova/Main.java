package Prova;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*Carro carro = new Carro("Fiat", 2012);

        Carro carro1;
        carro.ExibirDados();*/

       /*Pessoa pessoa = new Pessoa("Alan", 21);
        Pessoa pessoa1 = pessoa;
        pessoa1.Apresentar();*/


        /*Produto produto1 = new Produto("Pera", 10.50);
        Produto produto2 = new Produto("Papel", 150);

        produto1.ExibirDados();
        produto2.ExibirDados();*/

        /*ContaBancaria contaBancaria = new ContaBancaria("alan");

        contaBancaria.Depositar(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser depositado: ")));
        contaBancaria.Sacar(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser sacado: ")));*/

       /* Animal animal = new Animal(JOptionPane.showInputDialog("Digite o nome do animal"), Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do animal")));
        animal.fazerSom();*/

       /* Aluno aluno = new Aluno(JOptionPane.showInputDialog("Digite seu nome"), Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade")));
        Aluno aluno1 = aluno;
        aluno1.apresentar();*/

       /* Cachorro cachorro = new Cachorro(JOptionPane.showInputDialog("Digite o nome do animal"), Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do animal")));
        cachorro.fazerSom("auau");*/

       /* Gato gato = new Gato(JOptionPane.showInputDialog("Digite o nome do animal"), Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do animal")));
        gato.fazerSom("miau");*/

        /*Professor professor = new Professor("Alan", 20);
        professor.apresentar();*/

        Funcionario funcionario = new Funcionario("alan", 1200);
        funcionario.calcularBonus();

        Gerente gerente = new Gerente("Alan", 2000);
        gerente.calcularBonus();






    }
}
