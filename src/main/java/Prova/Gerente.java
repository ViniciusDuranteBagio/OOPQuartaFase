package Prova;

public class Gerente extends Funcionario {

    public Gerente(String nome, Double salario) {
        super(nome, salario);
    }

    public void calcularBonus () {
        double bonus = getSalario() * 0.20;
    System.out.println("\nO gerente: " + getNome() + "\nRecebeu um bônus de: " + bonus);
    }
}