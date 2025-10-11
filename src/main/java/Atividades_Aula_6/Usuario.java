package Atividades_Aula_6;

public class Usuario {
    private String nome;

    public Usuario(String nome) throws NomeInvalidoException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new NomeInvalidoException("Nome não pode ser vazio ou nulo");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public static void main(String[] args) {
        try {
            Usuario u1 = new Usuario("João");
            System.out.println("Nome: " + u1.getNome());
            Usuario u2 = new Usuario("");
        } catch (NomeInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}