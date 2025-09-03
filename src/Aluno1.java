package org.example;
/*

Exercício 2: Utilizando o super() no Construtor

Expanda o exercício anterior e adicione um construtor em Pessoa que recebe nome e idade.

Na classe Aluno, crie um construtor que use super(nome, idade) e também inicialize matricula.

No main(), instancie um Aluno passando os três atributos e imprima os valores.
*/

public class Aluno1 extends pessoaHeranca {
    public Aluno1(String nome,int idade,int matricula){
        super(nome,idade);
            this.matricula = matricula;

        }



            public int matricula;


    public Aluno1() {

    }
}