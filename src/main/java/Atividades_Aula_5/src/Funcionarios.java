package Atividades_Aula_5.src;

import javax.swing.*;

public abstract class Funcionarios {

    public String nome;
    public double salarioBase;
    public double salarioComBonus;

    public void Funcionarios(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    abstract double calcularSalario(double bonus);

    public void exibirDados() {
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nSalario Base: " + salarioBase +
                "\nSalario com bonus: " + salarioComBonus);
    }
}