package org.example;

public class Operacoes {
    public void converterEDividir(String a, String b) {
        try {
            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);
            System.out.println("Resultado: " + (num1 / num2));
        } catch (NumberFormatException e) {
            System.out.println("Erro: valor digitado não é número!");
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero!");
        }
    }
}

