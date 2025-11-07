package Aula6.exercicio2;

public class Main {
    public static void main(String[] args) {
        Conversor conversor = new Conversor();

        // simulação de entradas do usuário
        String[] entradas = {"abc", "10.5", "25"};
        int numero = 0;
        boolean convertido = false;

        for (String entrada : entradas) {
            try {
                numero = conversor.converterParaInteiro(entrada);
                convertido = true;
                System.out.println("Número convertido com sucesso: " + numero);
                break; // achou válido, sai do loop
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida: " + entrada + " Tentando novamente...");
            }
        }

        if (!convertido) {
            System.out.println("Nenhuma entrada válida encontrada!");
        }
    }
}

