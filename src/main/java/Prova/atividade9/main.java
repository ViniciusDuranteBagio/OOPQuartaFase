package atividade9;

public class main {
    public static void main(String[] args) {

        Funcionario func = new Funcionario();
        func.nome = "João";
        func.salario = 2000;
        func.calcularBonus();

        Gerente gerente = new Gerente();
        gerente.nome = "Maria";
        gerente.salario = 5000;
        gerente.calcularBonus();
    }
}
