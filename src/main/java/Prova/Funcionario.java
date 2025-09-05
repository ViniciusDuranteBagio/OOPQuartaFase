package Prova;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nomeInicial, double salarioInicial){
        this.nome = nomeInicial;
        this.salario = salarioInicial;
    }
    public void calcularBonus(){
        System.out.println(": "+ salario * 0.1);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
