package Aula7;

public class Usuario {
  public String nome;
  public String inscricao;
  public int age;
  Usuario(String nomeInicial) {
    if (nomeInicial == null || nomeInicial.isEmpty()) {
      throw new NomeInvalidoException("nome do usuario não pode ser vazio ou nullo");
    }
    nome = nomeInicial;
  }
}
