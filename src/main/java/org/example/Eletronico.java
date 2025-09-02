//Exercício 7: Chamando Métodos da Superclasse com super
//Crie uma classe Produto com os atributos nome e preco.Adicione um método exibirDetalhes() que imprime essas informações.
//Crie uma subclasse Eletronico com um atributo garantiaEmMeses .Na subclasse, sobrescreva exibirDetalhes(),
//mas chame o método da superclasse usando super.exibirDetalhes() antes de imprimir a garantia.
//No main(), crie um Eletronico e chame exibirDetalhes().

package org.example;

public class Eletronico extends Produto {

    private int garantiaEmMeses;

    public Eletronico (String nome, int preco, int garantiaEmMeses) {
        super(nome, preco);
        this.garantiaEmMeses = garantiaEmMeses;
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Garantia de : " + garantiaEmMeses + " meses");
    }
}
