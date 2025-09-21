package Atividades.Aula4;

public class Empresa {
    String nome;
    String cidade;

    Empresa(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

   public void exibirDados() {
        System.out.println("Nome da Empresa: " + nome);
        System.out.println("Cidade: " + cidade);
    }
}
