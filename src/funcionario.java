package org.example;

/*
 Exercício 6: Criando uma Classe com um Método Compartilhado

    Crie uma classe Funcionario com os atributos nome e salario.Adicione um método aumentarSalario(double porcentagem) que aumenta o salário com base na porcentagem.

    Depois, crie uma subclasse Gerente que adiciona o atributo departamento.

    No main(), crie um Gerente, aumente seu salário e exiba as informações.
 */
public class funcionario {
    public String nome;
    public int salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void aumentarSalario(double porcentagem){
        salario += ((salario / 100) * porcentagem);
        System.out.println("novo salario:" + " " + salario);
    }


}
