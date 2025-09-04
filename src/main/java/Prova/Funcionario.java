package Prova;

public class Funcionario {

    private String nome;
    private Double salario;

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void calcularBonus(){
        double bonus = this.salario * 0.10;
        System.out.println("Funcionário: " + getNome() + "\nBônus: " + bonus);
    }
}
