package Animal;

import Exceptions.ValidacaoOperacaoException;

public abstract class Animal {

    protected String nome;
    protected int idade;
    protected String raca;

    public Animal(String nome, int idade, String raca) {
        setNome(nome);
        setIdade(idade);
        setRaca(raca);
    }

    // Getter e setter da raça
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        if (raca == null || raca.trim().isEmpty()) {
            throw new ValidacaoOperacaoException("Raça deve ser informada.");
        }
        this.raca = raca.trim();
    }

    // Getter e setter da idade
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade <= 0 || idade > 100) {
            throw new ValidacaoOperacaoException("Idade inválida. Informe um inteiro entre 1 e 100.");
        }
        this.idade = idade;
    }

    // Getter e setter do nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null) {
            throw new ValidacaoOperacaoException("Nome inválido.");
        }
        nome = nome.trim();
        if (nome.length() < 2 || !nome.matches("^[A-Za-zÀ-ú ]+$")) {
            throw new ValidacaoOperacaoException(
                    "Nome inválido. Use apenas letras e espaços (mínimo 2 caracteres)."
            );
        }
        this.nome = nome;
    }

    // Método abstrato que deve ser implementado por subclasses
    public abstract String[] getDoencasPossiveis();

    @Override
    public String toString() {
        return String.format("Nome: %s | Idade: %d | Raça: %s", nome, idade, raca);
    }
}
