package Encapsulamento.pack2;

public class pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = "Desconhecido";
    }

    public pessoa() {
        this.nome = "Sem nome";
        this.idade = 0;
        this.cpf = "Desconhecido";
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
        System.out.println("-------------------");
    }
}


