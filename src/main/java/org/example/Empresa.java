//Exercício 10: Trabalhando com Construtores em Cadeia
//Crie uma classe Empresa com os atributos nome e cidade. Crie uma subclasse Loja, que adiciona o atributo tipoDeProduto.
//No construtor de Loja, chame super(nome, cidade) para inicializar os atributos da superclasse.
//No main(), crie uma Loja e imprima seus dados.

package org.example;

public class Empresa {

    protected String nome;
    protected String cidade;

    public Empresa(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }
}
