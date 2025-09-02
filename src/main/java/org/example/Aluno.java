//Exercício 1: Criando uma herança básica
//Crie uma classe Pessoa com os atributos nome e idade.Depois, crie uma classe Aluno que herda Pessoa e adiciona o atributo matricula.
//No main(), crie um objeto Aluno, atribua valores e imprima as informações.

//Exercício 2: Utilizando o super() no Construtor
//Expanda o exercício anterior e adicione um construtor em Pessoa que recebe nome e idade.
//Na classe Aluno, crie um construtor que use super(nome, idade) e também inicialize matricula.
//No main(), instancie um Aluno passando os três atributos e imprima os valores.

package org.example;

public class Aluno extends Pessoa {

    private int matricula;

    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Matricula: " + matricula);
    }
}
