package ExerciciosAula1;

class Usuario {
    String nome;
    private String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public void verificarSenha(String senhaDigitada) {
        if (this.senha.equals(senhaDigitada)) {
            System.out.println("Acesso concedido para " + this.nome + ".");
        } else {
            System.out.println("Acesso negado. Senha incorreta.");
        }
    }
}