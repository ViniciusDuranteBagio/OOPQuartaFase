package Prova;

public class Funcionario {

    public String nome;
    public double salario;

    public void calcularBonus () {
        salario = salario + salario * 0.1;
    }

    public void mostrarInformacoes () {
        System.out.println("Nome: " + nome);
        System.out.println("Salario + Bônus: " + salario + " R$");
    }
}
