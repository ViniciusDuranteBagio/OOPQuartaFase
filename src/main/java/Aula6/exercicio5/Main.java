package Aula6.exercicio5;

public class Main {
    public static void main(String[] args) {
        VetorNumeros v = new VetorNumeros();
        try {
            System.out.println("Valor: " + v.acessar(6));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
