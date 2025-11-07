package Aula6.exercicio6;

public class Main {
    public static void main(String[] args) {
        CalculadoraMatematica calc = new CalculadoraMatematica();
        try {
            System.out.println("Raiz: " + calc.raiz(-9));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

