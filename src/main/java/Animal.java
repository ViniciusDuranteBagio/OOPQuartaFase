

// Classe abstrata que representa um animal genérico
public abstract class Animal {

    private String nome;  // nome do animal
    private int idade;    // idade do animal
    private String raca;  // raça

    // Construtor com validações
    public Animal(String nome, int idade, String raca) {
        setNome(nome);
        setIdade(idade);
        setRaca(raca);
    }

    // Cada animal tem sua lista de doenças (polimorfismo)
    public abstract String[] getDoencasPossiveis();

    public String getNome() { return nome; }

    public void setNome(String nome) {
        if (nome == null || nome.length() < 2 || !nome.matches("[A-Za-zÀ-ÿ ]+"))
            throw new ValidacaoException("Nome inválido!");
        this.nome = nome;
    }

    public int getIdade() { return idade; }

    public void setIdade(int idade) {
        if (idade <= 0)
            throw new ValidacaoException("onde ja se viu idade ser negativo caralhooooooo");
        this.idade = idade;
    }

    public String getRaca() { return raca; }

    public void setRaca(String raca) {
        if (raca == null || raca.isBlank())
            throw new ValidacaoException("não exite carai");
        this.raca = raca;
    }

    @Override
    public String toString() {
        return nome + " (" + idade + " anos, " + raca + ")";
    }
}
