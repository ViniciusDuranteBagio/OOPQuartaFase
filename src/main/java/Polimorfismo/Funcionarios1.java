package Polimorfismo;

public abstract class Funcionarios1 {

  protected   String nome;
   protected double salario;

    public  Funcionarios1(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;

    }
    public abstract double calcularSalario();

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
        System.out.println("Salario atual: " + calcularSalario());

    }




}
