package Prova;

import javax.swing.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println("A marca do carro: " + carro.marca);
        System.out.println("Ano do carro: " + carro.ano);

        Pessoa pessoa = new Pessoa();
        pessoa.apresentar();

        Produto produto = new Produto();

        produto.nome = "bobina";
        produto.preco = 1500;

        System.out.println("Produto: " + produto.nome);
        System.out.println("Produto: " + produto.preco);

        Produto produto2 = new Produto();
        produto2.nome = "Embreagem";
        produto2.preco = 2000;
        System.out.println("Produto: " + produto2.nome);
        System.out.println("Produto: " + produto2.preco);

        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo da conta: "));

        System.out.println("Saldo da conta: " + contaBancaria.saldo);

        contaBancaria.operacao = Integer.parseInt(JOptionPane.showInputDialog("Digite o operacao da conta(1 - depositar 2 - sacar): "));

        if (contaBancaria.operacao == 1) {
            Double depositar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a  depositar: "));
            contaBancaria.saldo += depositar;
            System.out.println("Saldo da conta: " + contaBancaria.saldo);
        }else if (contaBancaria.operacao == 2) {
            double sacar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a sacar: "));
            if(contaBancaria.saldo >= sacar){
                contaBancaria.saldo -= sacar;
            }else {
                showMessageDialog(null, "Saldo insuficiente");
            }
        }else {}
        System.out.println("opção invalida");


        Animal animal = new Animal();
        animal.fazerBarulho();

        Aluno aluno = new Aluno();
        aluno.apresentar();

        Cachorro cachorro = new Cachorro();
        cachorro.fazerBarulho();

        Gato gato = new Gato();
        gato.fazerBarulho();

        Professor professor = new Professor();
        professor.apresentar();

        Funcionario  funcionario = new Funcionario();
        funcionario.bonus();

        Gerente gerente = new Gerente();
        gerente.bonus();






    }

}
