package Prova;

public class Funcionario {

    private String nome;
    private double salario;

    // Getters e Setters
    public String getNome(String nome) {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario(double salario) {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método calcularBonus
    public double calcularBonus() {
        return salario * 0.10; // 10%
    }
}
