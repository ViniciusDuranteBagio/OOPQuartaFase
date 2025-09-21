package Atividades.Aula5;

import javax.swing.*;

public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }


    public abstract double calcularSalario();

    public void exibirDados() {

        JOptionPane.showMessageDialog(null,"Nome:" + nome
                + "\nSalário Base:" + salarioBase
                + "\nSalário Total:" + calcularSalario());
    }
}

