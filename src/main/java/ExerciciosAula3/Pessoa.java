package ExerciciosAula3;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    // Construtor Padrão
    public Pessoa() {
        this.nome = "Não informado";
        this.idade = 0;
        this.cpf = "Não informado";
    }

    // Construtor com nome e idade
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = "Desconhecido"; // Valor padrão para este construtor
    }

    // Construtor Completo
    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    // --- Getters e Setters ---
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

    // --- Método para exibir informações ---
    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade + " anos");
        System.out.println("CPF: " + this.cpf);
    }
}