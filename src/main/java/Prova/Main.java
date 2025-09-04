package Prova;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

//        Carro c1 = new Carro("Bmw", 1998);
//        c1.exibirDados();
//

//        Produto produto = new Produto("Prego", 10.0);
//        produto.produtoPreco();

//        ContaBancaria conta1 = new ContaBancaria("Danilo", 1500);
//        conta1.sacar(1700);
//        conta1.depositar(700);

//        Animal animal1 = new Animal("Cão", 11);
//        animal1.somBicho();

//        Aluno aluno1 = new Aluno("Vinicius", 25, "234123");
//        aluno1.apresentar();

//         Cachorro cachorro = new Cachorro(JOptionPane.showInputDialog("Digite o nome do animal"), Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do animal")));
//        cachorro.fazerSom("auau");

//        Gato gato = new Gato(JOptionPane.showInputDialog("Digite o nome do animal"), Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do animal")));
//        gato.fazerSom("miau");

//       Professor professor = new Professor("Vinicius", 25);
//       professor.apresentar();

        Funcionario funcionario = new Funcionario("Danilo", 1200);
        funcionario.calcularBonus();

        Gerente gerente = new Gerente("Danilo", 1500);
        gerente.calcularBonus();
    }
}

