public abstract class Animal {
    private String nome;
    private int idade;
    private String raca;

    public Animal(String nome, int idade, String raca) throws ValidacaoException {
        setNome(nome);
        setIdade(idade);
        setRaca(raca);
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) throws ValidacaoException {
        if (nome == null) {
            throw new ValidacaoException();
        }
        nome = nome.trim();
        if (nome.length() < 2 || !nome.matches("[A-Za-zÀ-ÖØ-öø-ÿ ]+")) {
            throw new ValidacaoException("Nome deve ter pelo menos 2 letras e conter apenas letras e espaços.");
        }
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public final void setIdade(int idade) throws ValidacaoException {
        if (idade <= 0) throw new ValidacaoException("Idade deve ser um inteiro positivo.");
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public final void setRaca(String raca) throws ValidacaoException {
        if (raca == null) throw new ValidacaoException("Raça obrigatória.");
        raca = raca.trim();
        if (raca.isEmpty()) throw new ValidacaoException("Raça obrigatória.");
        this.raca = raca;
    }

    // Retorna lista/descrição das doenças possíveis para o tipo
    public abstract String[] getDoencasPossiveis();

    @Override
    public String toString() {
        return String.format("%s (Nome: %s, Idade: %d, Raça: %s)", this.getClass().getSimpleName(), nome, idade, raca);
    }
}

