package Aula7BrenoLibrelatoManoel;

public class Pessoa {

    private String nome;
    private int idade;

    public boolean ehMaiorDeIdade(String nome, int idade) {
        if (idade >= 18) {
            return true;
        } else  {
            return false;
        }
    }

    public String setNome(String nome) {
        System.out.println(nome);
        return nome;
    }

    public String getNome() {
        return nome;
    }
}
