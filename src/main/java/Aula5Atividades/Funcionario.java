package Aula5Atividades;

public abstract class Funcionario {
    protected String nome;
    protected double baseSalary;

    public Funcionario(String nome, double baseSalary){
        this.nome = nome;
        this.baseSalary = baseSalary;
    }
    public abstract double calcularSalario ();

    public void exibirOsDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Tem um sálario base de: " + calcularSalario());
        System.out.println("-------------------------");
    }
}
