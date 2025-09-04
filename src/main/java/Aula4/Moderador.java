package Aula4;

public class Moderador extends Usuario{
    public Moderador(String nome, String email) {
        super(nome, email);
    }

    public void moderarConteudo() {
        System.out.println(nome + " está moderando conteúdo.");
    }
}
