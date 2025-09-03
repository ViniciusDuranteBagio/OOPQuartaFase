package org.example;

public class pessoaHeranca {
    /*Exercicios

     Exercício 1: Criando uma herança básica

     Crie uma classe Pessoa com os atributos nome e idade.Depois, crie uma classe Aluno que herda Pessoa e adiciona o atributo matricula.

     No main(), crie um objeto Aluno, atribua valores e imprima as informações.

    */

        public String nome;
        public int idade;

    public pessoaHeranca() {
    }

    public pessoaHeranca(String nome, int idade) {
    }

    public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
    }


    /*

    Exercício 10: Trabalhando com Construtores em Cadeia

    Crie uma classe Empresa com os atributos nome e cidade.Crie uma subclasse Loja, que adiciona o atributo tipoDeProduto.

    No construtor de Loja, chame super(nome, cidade) para inicializar os atributos da superclasse.

    No main(), crie uma Loja e imprima seus dados.

    */
