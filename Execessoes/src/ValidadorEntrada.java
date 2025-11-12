    import java.util.Scanner;

    class ValidadorEntrada {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int numero = -1;

            while (true) {
                try {
                    System.out.print("Digite um número positivo: ");
                    numero = Integer.parseInt(sc.nextLine());
                    if (numero < 0) throw new IllegalArgumentException("Número negativo!");
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Erro: entrada inválida!");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

            System.out.println("Número válido: " + numero);
        }
    }
