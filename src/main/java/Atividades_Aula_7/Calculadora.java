package Atividades_Aula_7;

public class Calculadora {

    public int Somar(int a , int b ){
        int resultado = a + b;
        return resultado;
    }

    public  int subtrair(int a , int b){
       int  Resultado = a - b;
       return Resultado;
    }

    public  double Multiplicar(double a , double b ){
        double Resultado = a * b;
        return Resultado;


    }


    public  double Dividir(double a , double b ){
        double Resultado = a / b;
        return Resultado;


    }


    public  double DividirErro(int a , int b ){
        if (b==0) {
            throw new  ArithmeticException("Nao pode dividir por 0");
        }
        double Resultado = a / b;
        return Resultado;


    }



}
