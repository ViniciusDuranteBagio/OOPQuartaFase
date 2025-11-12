package exercicios_aula_6.exercicio_7;

class Usuario {
    private String nome;

    public void setNome(String nome) throws NomeInvalidoException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new NomeInvalidoException("O nome não pode ser vazio ou nulo");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
