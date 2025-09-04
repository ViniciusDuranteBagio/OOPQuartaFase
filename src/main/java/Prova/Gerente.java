package Prova;

    public class Gerente extends Funcionario {

        @Override
        double calcularBonus() {
            return salario * 0.20; // 20% do salário
        }
    }

