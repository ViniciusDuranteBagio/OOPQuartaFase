package Aula6atv;

public class Calculadora {

    public double dividir(double numerador,double denominador){
        if(denominador == 0){
            throw new ArithmeticException("Erro: não é possível realizar a divisão por zero");
        }

        return numerador/denominador;
    }
}
