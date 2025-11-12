import java.util.Scanner;

public class Operações {
    class Operacoes {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            try {
                System.out.print("Digite o primeiro número: ");
                int n1 = Integer.parseInt(sc.nextLine());

                System.out.print("Digite o segundo número: ");
                int n2 = Integer.parseInt(sc.nextLine());

                int resultado = n1 / n2;
                System.out.println("Resultado: " + resultado);
            } catch (NumberFormatException e) {
                System.out.println("Erro: Valor informado não é um número válido!");
            } catch (ArithmeticException e) {
                System.out.println("Erro: Divisão por zero não é permitida!");
            }
        }
    }
}
