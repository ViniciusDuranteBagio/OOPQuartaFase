public abstract class Animal {
    private String nome;
    private int idade;
    private String raca;

    public Animal(String nome, int idade, String raca) throws ValidacaoException {
        setNome(nome);
        setIdade(idade);
        setRaca(raca);
    }

    public abstract String[] getDoencasPossiveis();

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public String getRaca() { return raca; }

    public void setNome(String nome) throws ValidacaoException {
        if (nome == null || nome.length() < 2 || !nome.matches("[A-Za-zÀ-ÿ ]+"))
            throw new ValidacaoException("Nome inválido!");
        this.nome = nome;
    }

    public void setIdade(int idade) throws ValidacaoException {
        if (idade <= 0)
            throw new ValidacaoException("Idade deve ser positiva!");
        this.idade = idade;
    }

    public void setRaca(String raca) throws ValidacaoException {
        if (raca == null || raca.isBlank())
            throw new ValidacaoException("Raça obrigatória!");
        this.raca = raca;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " - Nome: " + nome +
                ", Idade: " + idade + ", Raça: " + raca;
    }
}