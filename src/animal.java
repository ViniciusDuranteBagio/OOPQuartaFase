package org.example;
/*
Exercício 4: Adicionando Métodos em Herança

    Crie uma classe Animal com os atributos nome e idade, além de um método dormir() que imprime "O animal está dormindo".

    Depois, crie uma subclasse Cachorro que adiciona um método latir() imprimindo "O cachorro está latindo".

    No main(), crie um Cachorro, chame dormir() e latir().
 */
/*
  Exercício 5: Protegendo Atributos com protected

    Modifique o exercício anterior e torne os atributos nome e idade protected na classe Animal.

            Depois, crie um método exibirInformacoes() em Animal para exibir nome e idade.

    Na classe Cachorro, crie um método brincar(), que imprime "O cachorro [nome] está brincando!".

    No main(), crie um cachorro e teste os métodos.
 */
public class animal {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    protected String nome;
    protected int idade;
    public void metodoDormir(){
        System.out.println("O animal está dormindo");
    }
}
