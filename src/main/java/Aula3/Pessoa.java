package Aula3;

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
        this.cpf = "Desconhecido";
    }
    
    public Pessoa() {
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
    
    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Informações:");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("CPF: " + this.cpf);
    }
} 