package TrabalhoFinal;

abstract class Animal {

    private String nome;
    private int idade;
    private String raca;

    public Animal(String nome, int idade, String raca) throws ValidacaoException {
        setNome(nome);
        setIdade(idade);
        setRaca(raca);
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public String getRaca() { return raca; }

    public void setNome(String nome) throws ValidacaoException {
        if (nome == null || !nome.matches("[A-Za-zÀ-ú ]{2,}"))
            throw new ValidacaoException("Nome inválido! Use apenas letras e no mínimo 2 caracteres.");
        this.nome = nome;
    }

    public void setIdade(int idade) throws ValidacaoException {
        if (idade <= 0)
            throw new ValidacaoException("Idade deve ser um número positivo!");
        this.idade = idade;
    }

    public void setRaca(String raca) throws ValidacaoException {
        if (raca == null || raca.trim().isEmpty())
            throw new ValidacaoException("Raça deve ser informada!");
        this.raca = raca;
    }

    public abstract String[] getDoencasComuns();

    @Override
    public String toString() {
        return nome + " (" + getClass().getSimpleName() + ", " + idade + " anos, Raça " + raca + ")";
    }
}
