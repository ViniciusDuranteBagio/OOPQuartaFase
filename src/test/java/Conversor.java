package org.example;

import java.util.Scanner;

public class Conversor {
    public int converterParaInteiro(String valor) {
        try {
            return Integer.parseInt(valor);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Valor inválido! Digite um número inteiro.");
        }
    }

    public static int lerNumeroValido() {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean valido = false;

        while (!valido) {
            System.out.print("Digite um número inteiro: ");
            String entrada = sc.nextLine();
            try {
                numero = Integer.parseInt(entrada);
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Erro: valor inválido! Tente novamente.");
            }
        }
        return numero;
    }
}
