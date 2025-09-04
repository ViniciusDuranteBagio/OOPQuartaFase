    package Prova;

    public class Gerente extends Funcionario{
        public Gerente(String nome, double salario) {
            super(nome, salario);
        }
        @Override
        public double calcularBonus() {
            return salario * 0.20;

        }
    }
