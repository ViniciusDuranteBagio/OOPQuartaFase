package Aula6.exercicio3;

public class Main {
    public static void main(String[] args) {
        try {
            Pessoas p = new Pessoas(-9);
        } catch (IdadeInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}

