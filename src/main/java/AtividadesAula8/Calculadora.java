package AtividadesAula8;

public class Calculadora {
    public double somar(int a, int b){
        return a+b;
    }

    public double subtrair(int a, int b){
        return a-b;
    }

    public double multiplicar(int a, int b){
        return a*b;
    }

    public double dividir(int a, int b){
        if (b == 0){
            throw new ArithmeticException();
        }
        else return a/b;
    }
}
