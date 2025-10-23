package Aula6;
/*Crie um programa que calcule a raiz quadrada de um número.
Se for negativo, trate o erro. Classes a criar:
CalculadoraMatematica.
 */

public class CalculadoraMatematica {
    public double calcularRaiz (double numero) throws IllegalArgumentException {
        if (numero < 0) {
            throw new IllegalArgumentException("Erro. Não é possível calcular a raiz quadrada de números negativos");
        }
        return Math.sqrt(numero);
    }
}
