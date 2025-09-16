package exercicios;

class Animal {
    protected String nome;
    protected int idade;

    public void dormir() {
        System.out.println("O animal está dormindo");
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}
