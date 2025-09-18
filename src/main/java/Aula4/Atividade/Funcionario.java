package Aula4.Atividade;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.salario=salario;
        this.nome=nome;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void aumentarSalario(double porcentagem){
        this.salario=this.salario*(porcentagem/100);
        System.out.println("Salário aumentado em " + porcentagem + "%");
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: R$ " + this.salario);
    }
}
