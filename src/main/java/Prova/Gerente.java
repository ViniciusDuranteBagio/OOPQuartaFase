package Prova;

public class Gerente extends Funcionario {

    public void calcularBonusGerente () {
        salario = salario + salario * 0.2;
    }

    public void mostrarInformacoes () {
        System.out.println("Nome: " + nome);
        System.out.println("Salario + Bônus: " + salario + " R$");
    }
}