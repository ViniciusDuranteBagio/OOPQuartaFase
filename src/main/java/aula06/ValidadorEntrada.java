package aula06;

import java.util.Scanner;

public class ValidadorEntrada {
    public int lerNumeroPositivo() {
        Scanner sc = new Scanner(System.in);
        int numero = -1;
        while (true) {
            try {
                System.out.print("Digite um número positivo: ");
                numero = Integer.parseInt(sc.nextLine());
                if (numero < 0) {
                    throw new IllegalArgumentException("Número não pode ser negativo!");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número inteiro.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return numero;
    }
}
