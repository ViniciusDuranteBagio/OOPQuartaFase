package TrabalhoFinal;

import java.util.List;

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
        if (nome == null) throw new ValidacaoException("Nome obrigatório.");
        String trimmed = nome.trim();
        if (trimmed.length() < 2 || !trimmed.matches("[A-Za-zÀ-ÖØ-öø-ÿ ]+"))
            throw new ValidacaoException("Nome deve conter apenas letras e espaços ");
        this.nome = trimmed;
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
        if (raca == null || raca.trim().isEmpty()) throw new ValidacaoException("Raça deve ser informada.");
        this.raca = raca.trim();
    }


    public abstract List<String> getDoencasPossiveis();

    @Override
    public String toString() {
        return String.format("%s (Idade: %d, Raça: %s, Tipo: %s)", nome, idade, raca, this.getClass().getSimpleName());
    }
}