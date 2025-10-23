package Aula6;
/* Crie um programa que faça uma divisão entre dois números.
Se o divisor for zero, deve ser tratado o erro e mostrar uma mensagem dizendo que
 não é possível dividir por zero. Classes para criar:
Calculadora (responsável pela operação de divisão)*/

public class Calculadora {
    public double dividir(double a, double b){
         if(b==0){
        throw new ArithmeticException("O divisor não pode ser 0.");
    }
    return a/b;
    }
}
