package Prova;
/*
Crie uma classe Animal com os atributos nome e idade, e um método fazerSom().
Na classe main, crie um objeto Animal e chame o método para fazer som, mostrando o nome a idade do animal, a frase "fez algum som".
 */
public class animal {
    public String nome;
    public int idade;

    public void metodofazerSom(){
        System.out.println("nome " + "\n" + nome + "idade" + "\n" + idade + "Fez algum som");
    }

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
}
