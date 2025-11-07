package Aula6.exercicio7;

public class Main {
    public static void main(String[] args) {
        Usuario u = new Usuario();
        try {
            u.setNome("");
            System.out.println("Nome cadastrado: " + u.nome);
        } catch (NomeInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}

