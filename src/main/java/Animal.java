public abstract class Animal {
    private String nome;
    private int idade;
    private String raca;

    public Animal(String nome, int idade, String raca) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setRaca(raca);
    }

    public abstract String[] getDoencasComuns();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || !nome.matches("[A-Za-z ]{2,}")) {
            throw new ValidacaoException("Nome inválido.");
        }
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade <= 0) {
            throw new ValidacaoException("Idade inválida.");
        }
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        if (raca == null || raca.isBlank()) {
            throw new ValidacaoException("Raça deve ser informada.");
        }
        this.raca = raca;
    }
}

