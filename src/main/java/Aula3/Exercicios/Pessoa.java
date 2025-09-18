package Aula3.Exercicios;

public class Pessoa {private String nome;
    private int idade;
    private String cpf;

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = "Desconhecido";
    }

    public Pessoa() {
        this.nome = "Sem nome";
        this.idade = 0;
        this.cpf = "Desconhecido";
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", CPF: " + cpf);
}
}