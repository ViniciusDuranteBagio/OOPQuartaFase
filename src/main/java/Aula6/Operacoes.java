package Aula6;
/*Tente converter texto em número e, depois, faça divisão.
Trate erro de conversão e de divisão por zero separadamente. Classes a criar:
Operacoes
 */

public class Operacoes {
    public static int converterTextoNum(String texto) throws NumberFormatException {
        return Integer.parseInt(texto);
    }

    public static double dividir(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Erro: o divisor não pode ser 0");
        }
        return (double) a / b;
    }
}
