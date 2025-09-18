package Aula_3_Breno;

public class Pessoa {

    private String nome;
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
        this.cpf = cpf;
    }

    public Pessoa() {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String setNome(String nome) {
        return this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade invalida");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setCpf(String cpf) {
        if (cpf.length() == 11) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF invalido");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nCPF: " + cpf);
    }
}