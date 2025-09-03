package atividade9;

public class main {
    public static void main(String[] args) {

        Funcionario func = new Funcionario();
        func.nome = "João";
        func.setSalario(2000);
        func.calcularBonus();

        Gerente gerente = new Gerente();
        gerente.nome = "Maria";
        gerente.setSalario(5000);
        gerente.calcularBonus();
    }
}
