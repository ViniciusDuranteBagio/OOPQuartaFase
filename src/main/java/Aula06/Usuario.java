package Aula06;

public class Usuario {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws NomeInvalidoException {
        if (nome == null || nome.isEmpty())
            throw new NomeInvalidoException("Nome nao pode ser vazio ou nulo");
        this.nome = nome;
    }
}

