package org.example;
/*
Exercício 7: Chamando Métodos da Superclasse com super

    Crie uma classe Produto com os atributos nome e preco.Adicione um método exibirDetalhes() que imprime essas informações.

    Crie uma subclasse Eletronico com um atributo garantiaEmMeses.Na subclasse, sobrescreva exibirDetalhes(), mas chame o método da superclasse usando super.exibirDetalhes() antes de imprimir a garantia.

    No main(), crie um Eletronico e chame exibirDetalhes().
 */
public class produto {
    public String nome;
    public double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }



    public void exibirDetalhes(){
        nome = "nescau";
        preco = 20;
        System.out.println("nome: " + nome + "\n" + "preco:" + preco);
    }
}
