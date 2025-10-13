package Atividades.Aula6;

public class Usuario {
    private String nome;

    public void setNome(String nome) throws NomeInvalidoException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new NomeInvalidoException("Erro: O nome não pode ser vazio ou nulo.");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}