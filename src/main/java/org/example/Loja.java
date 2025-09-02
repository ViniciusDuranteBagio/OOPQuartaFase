//Exercício 10: Trabalhando com Construtores em Cadeia
//Crie uma classe Empresa com os atributos nome e cidade. Crie uma subclasse Loja, que adiciona o atributo tipoDeProduto.
//No construtor de Loja, chame super(nome, cidade) para inicializar os atributos da superclasse.
//No main(), crie uma Loja e imprima seus dados.

package org.example;

public class Loja extends Empresa{

    private String tipoDeProduto;

    public Loja(String nome, String cidade, String tipoDeProduto) {
        super(nome, cidade);
        this.tipoDeProduto = tipoDeProduto;
    }

    public void exibirInformacoes() {
        System.out.println("Nome da empresa: " + nome + "\nCidade de origem: " + cidade + "\nTipo de produto para venda: " + tipoDeProduto);
    }
}
