package Aula6atv;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidadorEntrada {
    private Scanner scanner;

    public ValidadorEntrada() {
        this.scanner = new Scanner(System.in);
    }

    public int lerNumeroPositivo() {
        int numero = -1;

        while (true) {
            try {
                System.out.print("Digite um número positivo: ");
                numero = scanner.nextInt();

                if (numero < 0) {
                    throw new IllegalArgumentException("Erro: o número não pode ser negativo!");
                }

                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: entrada inválida! Digite apenas números inteiros.");
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        return numero;
    }
}
