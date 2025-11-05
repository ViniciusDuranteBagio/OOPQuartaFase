package org.example;

import java.util.Scanner;

public class ValidadorEntrada {
    public int lerNumeroPositivo() {
        Scanner sc = new Scanner(System.in);
        int numero = -1;
        while (numero < 0) {
            try {
                System.out.print("Digite um número positivo: ");
                numero = Integer.parseInt(sc.nextLine());
                if (numero < 0) System.out.println("Erro: número negativo!");
            } catch (NumberFormatException e) {
                System.out.println("Erro: valor inválido!");
            }
        }
        return numero;
    }
}

