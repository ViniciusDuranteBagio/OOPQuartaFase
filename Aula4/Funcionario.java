package Aula4;

public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(){
    }
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

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

    public void aumentarSalario(double porcentagem){
        System.out.println("Valor do salário: R$" + this.salario);
            this.salario += this.salario * (porcentagem / 100);
        System.out.println("Salário aumentado em " + porcentagem + "% \nNovo valor: R$" + this.salario);
    }
    public void exibirInformacoes(){
        System.out.println("        INFORMAÇÕES\nNome: " + this.nome + "\nSalário: R$" + this.salario);
    }
}
