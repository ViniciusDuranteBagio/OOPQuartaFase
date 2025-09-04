package Aula4;

public class Administrador extends Usuario {
    public Administrador (String nome, String email) {
        super(nome, email);
    }

    public void gerenciarUsuarios() {
        System.out.println(nome + " está gerenciando usuários.");
    }
}
