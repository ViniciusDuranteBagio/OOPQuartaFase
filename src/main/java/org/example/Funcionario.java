//Exercício 6: Criando uma Classe com um Método Compartilhado
//Crie uma classe Funcionario com os atributos nome e salario.Adicione um método aumentarSalario(double porcentagem) que aumenta o salário com base na porcentagem.
//Depois, crie uma subclasse Gerente que adiciona o atributo departamento.
//No main(), crie um Gerente, aumente seu salário e exiba as informações.

package org.example;

public class Funcionario {

    protected String nome;
    protected int salario;
    protected int quantidadeDeAumento;

    public Funcionario (String nome, int salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public int aumentarSalario (double porcentagemDeAumento) {
        if (porcentagemDeAumento >= 0 && porcentagemDeAumento <= 100) {
            quantidadeDeAumento = (int) (salario * (porcentagemDeAumento / 100));
            salario += quantidadeDeAumento;
        } else {
            System.out.println("Porcentagem Inválida");
        }
        return salario;
    }
}