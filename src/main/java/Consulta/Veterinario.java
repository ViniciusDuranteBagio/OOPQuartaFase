package Consulta;

import Exceptions.ValidacaoOperacaoException;

public class Veterinario {

    private String nome;
    private int idade;

    public Veterinario(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().length() < 2 || !nome.matches("^[A-Za-zÀ-ú ]+$")) {
            throw new ValidacaoOperacaoException(
                    "Nome inválido. Use apenas letras e espaços (mínimo 2 caracteres)."
            );
        }
        this.nome = nome.trim();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade <= 18 || idade > 80) { // por exemplo, veterinário deve ter idade mínima
            throw new ValidacaoOperacaoException("Idade inválida para veterinário.");
        }
        this.idade = idade;
    }

    @Override
    public String toString() {
        return String.format("Veterinário: %s | Idade: %d", nome, idade);
    }
}
