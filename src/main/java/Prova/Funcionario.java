package Prova;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
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
        this.salario = salario;
    }

    public void calcularBonus(){
        System.out.println("Funcionário: " + getNome() + "\nSalário: R$" + getSalario() + "\nBônus de R$" + getSalario() * 0.1);
    }

}
