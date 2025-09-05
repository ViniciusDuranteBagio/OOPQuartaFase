package Prova;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario (String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        }
    }
public void calcBonus(){
    System.out.println("bonus de: " + salario * 0.10);
        }
    }

