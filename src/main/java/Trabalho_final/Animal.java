package Trabalho_final;

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

    public void setNome(String nome) throws ValidacaoException {
        if (nome == null || nome.length() < 2 || !nome.matches("[a-zA-Z\\s]+")) {
            throw new ValidacaoException("Nome deve conter apenas letras e espaços, mínimo 2 caracteres.");
        }
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws ValidacaoException {
        if (idade <= 0) {
            throw new ValidacaoException("Idade deve ser um número inteiro positivo.");
        }
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) throws ValidacaoException {
        if (raca == null || raca.trim().isEmpty()) {
            throw new ValidacaoException("Raça deve ser informada.");
        }
        this.raca = raca;
    }

    public abstract String[] getDoencas();

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Raça: " + raca;
    }
}
