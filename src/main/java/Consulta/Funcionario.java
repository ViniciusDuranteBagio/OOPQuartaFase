package Consulta;

import Exceptions.ValidacaoOperacaoException;

public class Funcionario {

    private String nome;

    public Funcionario(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().length() < 2 || !nome.matches("^[A-Za-zÀ-ú ]+$")) {
            throw new ValidacaoOperacaoException("Nome inválido. Use apenas letras e espaços.");
        }
        this.nome = nome.trim();
    }

    @Override
    public String toString() {
        return String.format("Funcionário: %s", nome);
    }
}
