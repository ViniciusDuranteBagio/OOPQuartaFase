package trabalho_final;

import javax.swing.*;
import java.util.List;

public abstract class Animal {
    private String nome;
    private int idade;
    private String raca;

    public Animal(String nome, int idade, String raca) throws ValidacaoException {
        validarNome(nome);
        validarIdade(idade);
        validarRaca(raca);

        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }

    private void validarNome(String nome) throws ValidacaoException {
        if (nome == null || nome.trim().length() < 2 || !nome.matches("[a-zA-Z\\s]+")) {
            throw new ValidacaoException("Nome deve conter apenas letras e espaços (mínimo 2 caracteres).");
        }
    }

    private void validarIdade(int idade) throws ValidacaoException {
        if (idade <= 0) {
            throw new ValidacaoException("Idade deve ser um número inteiro positivo.");
        }
    }

    private void validarRaca(String raca) throws ValidacaoException {
        if (raca == null || raca.trim().isEmpty()) {
            throw new ValidacaoException("Raça deve ser informada.");
        }
    }

    // Getters
    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public String getRaca() { return raca; }

    // Método abstrato para doenças (polimorfismo)
    public abstract List<String> getDoencasComuns();

    public abstract String getTipoAnimal();

    @Override
    public String toString() {
        return getTipoAnimal() + " - Nome: " + nome + ", Idade: " + idade + ", Raça: " + raca;
    }
}