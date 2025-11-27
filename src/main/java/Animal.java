abstract class Animal {
    private String nome;
    private int idade;
    private String raca;

    public Animal(String nome, int idade, String raca) throws ValidacaoException {
        setNome(nome);
        setIdade(idade);
        setRaca(raca);
    }

    public void setNome(String nome) throws ValidacaoException {
        if (nome == null || nome.trim().length() < 2) {
            throw new ValidacaoException("Nome deve ter no mínimo 2 caracteres");
        }
        if (!nome.matches("^[a-zA-ZÀ-ÿ\\s]+$")) {
            throw new ValidacaoException("Nome deve conter apenas letras e espaços");
        }
        this.nome = nome.trim();
    }

    public void setIdade(int idade) throws ValidacaoException {
        if (idade <= 0) {
            throw new ValidacaoException("Idade deve ser um número positivo");
        }
        this.idade = idade;
    }

    public void setRaca(String raca) throws ValidacaoException {
        if (raca == null || raca.trim().isEmpty()) {
            throw new ValidacaoException("Raça deve ser informada");
        }
        this.raca = raca.trim();
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public String getRaca() { return raca; }

    public abstract String[] getDoencasPossiveis();
    public abstract String getTipo();

    @Override
    public String toString() {
        return getTipo() + " - " + nome + " (" + idade + " anos, " + raca + ")";
    }
}
