package Aula6atv;

public class Usuario {
    private String nome;

    public void setNome(String nome) throws NomeInvalidoException {
        if (nome == null || nome.trim().isEmpty()) {
            // Lança exceção se o nome for nulo ou vazio
            throw new NomeInvalidoException("Erro: o nome não pode ser vazio ou nulo!");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
