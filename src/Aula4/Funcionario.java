package Aula4;

public class Funcionario {
    protected String nome;
    protected double salario;
    
    // Construtor
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    // Método para aumentar salário
    public void aumentarSalario(double porcentagem) {
        this.salario += this.salario * (porcentagem / 100);
        System.out.println("Salário aumentado em " + porcentagem + "%");
    }
    
    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: R$ " + this.salario);
    }
} 