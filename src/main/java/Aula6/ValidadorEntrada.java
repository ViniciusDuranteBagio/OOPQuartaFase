package Aula6;
/*Leia número positivo do usuário. Se for negativo ou inválido, trate e repita até entrada correta.
Classes a criar:
ValidadorEntrada
 */

import java.util.Scanner;

public class ValidadorEntrada {
    public int lerPositivo(Scanner sc) {
        int numero = -1;
        while (true) {
            try {
                System.out.print("Digite um número positivo: ");
                numero = Integer.parseInt(sc.nextLine());
                if (numero < 0) throw new NumberFormatException();
                return numero;
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Tente novamente.");
            }
        }
    }
}