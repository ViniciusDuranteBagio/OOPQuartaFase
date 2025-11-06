package Aula8;

public class Pessoa {
  private String nome;
  private int idade;
  public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }
  public boolean isAdult() {
    return this.idade >= 20;
  }
}
