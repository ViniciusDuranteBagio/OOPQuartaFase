package Prova;

    public class Gerente extends Funcionario {
        @Override
        public double calcularBonus() {
            return getSalario() * 0.20;
        }
    }