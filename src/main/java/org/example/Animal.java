package org.example;
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

    public void setNome(String nome) throws ValidacaoException {
        if (nome == null || nome.isBlank()) {
            throw new ValidacaoException("Nome não pode ser vazio.");
        }

        String apenasLetras = nome.replaceAll(" ", "");
        if (apenasLetras.length() < 2 || !apenasLetras.matches("[A-Za-zÀ-ÖØ-öø-ÿ]+")) {
            throw new ValidacaoException("Nome deve conter apenas letras e ter pelo menos 2 caracteres.");
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
        if (raca == null || raca.isBlank()) {
            throw new ValidacaoException("Raça deve ser informada.");
        }
        this.raca = raca;
    }

    public abstract List<String> getDoencasComuns();

    public boolean possuiDoenca(String doenca) {
        if (doenca == null) return false;
        String d = doenca.trim().toLowerCase();
        return getDoencasComuns()
                .stream()
                .anyMatch(s -> s.toLowerCase().equals(d));
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " {nome='" + nome + '\'' +
                ", idade=" + idade +
                ", raca='" + raca + '\'' +
                '}';
    }
}
