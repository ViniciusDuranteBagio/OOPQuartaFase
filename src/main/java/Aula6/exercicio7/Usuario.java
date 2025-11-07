package Aula6.exercicio7;

class Usuario {
    public String nome;

    public void setNome(String nome) throws NomeInvalidoException {
        if (nome == null || nome.trim().isEmpty())
            throw new NomeInvalidoException("Nome não pode ser vazio!");
        this.nome = nome;
    }
}