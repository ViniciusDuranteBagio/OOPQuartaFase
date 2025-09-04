package Aula4;

public class Usuario {
    protected String nome;
    protected String email;

    public Usuario (String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void acessarSistema() {
        System.out.println(nome + " acessou o sistema");
    }
}
