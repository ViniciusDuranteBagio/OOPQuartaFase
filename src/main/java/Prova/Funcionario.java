package Prova;

public class Funcionario {
    String nome;
    double salario;

    public double calcularBonus() {
        return salario * 0.10;
    }

    public void exibirInformacoes() {
        System.out.println("Nome" + nome + " Salário R$" + salario +" Bônus: R$" + calcularBonus());
    }
}

