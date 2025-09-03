package org.example;
/*
 Exercício 10: Trabalhando com Construtores em Cadeia

    Crie uma classe Empresa com os atributos nome e cidade.Crie uma subclasse Loja, que adiciona o atributo tipoDeProduto.

    No construtor de Loja, chame super(nome, cidade) para inicializar os atributos da superclasse.

    No main(), crie uma Loja e imprima seus dados.
 */
public class empresa {
    public String nome;
    public String cidade;

    public empresa(String nome, String cidade) {
    }

    public empresa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
