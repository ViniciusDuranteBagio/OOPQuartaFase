package Aula6.exercicio1;

public class Calculadora {

        public double dividir(double a, double b) throws ArithmeticException {
            if (b == 0) {
                throw new ArithmeticException("Erro: não é possível dividir por zero!");
            }
            return a / b;
        }
    }


