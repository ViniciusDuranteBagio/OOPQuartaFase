//Exercício 6: Criando uma Classe com um Método Compartilhado
//Crie uma classe Funcionario com os atributos nome e salario.Adicione um método aumentarSalario(double porcentagem) que aumenta o salário com base na porcentagem.
//Depois, crie uma subclasse Gerente que adiciona o atributo departamento.
//No main(), crie um Gerente, aumente seu salário e exiba as informações.

package org.example;

public class Gerente extends Funcionario {

    private String departamento;

    public Gerente(String nome, int salario) {
        super(nome, salario);
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void mostrarInformacoes() {
        System.out.println("O Gerente " + nome + " do departamento de " + departamento + " recebeu " + quantidadeDeAumento + " de aumento");
    }
}
