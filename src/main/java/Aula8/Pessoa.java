package Aula8;

public class Pessoa {
  private String nome;
  private int idade;
  public Pessoa(String nome, int idade) {
    if (idade < 0) {
      idade = 0;
    }
    this.nome = nome;
    this.idade = idade;
  }

  public int getIdade() {
    return idade;
  }

  public String getNome() {
    return nome;
  }

  public boolean isAdult() {
    return idade >= 18;
  }
}
