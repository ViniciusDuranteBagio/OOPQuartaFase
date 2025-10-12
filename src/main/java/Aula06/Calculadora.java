package Aula06;

public class Calculadora {

    public void dividir(int num1, int num2){
        try {
            int resultado = num1/num2;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: nao e possivel dividir por 0");
        } finally {
            System.out.println("Operação finalizada.");
        }
    }
}
