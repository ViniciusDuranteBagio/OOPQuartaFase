package Aula5.Atividade;

public abstract class Funcionario implements IFuncionario{
    private String nome;
    private double salarioBase;

    public Funcionario(String nome,double salarioBase){
        this.nome=nome;
        this.salarioBase=salarioBase;
    }

    protected Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public void exibirDados() {
            System.out.println("Nome: " + nome);
            System.out.println("Salário Base: " + salarioBase);
            System.out.println("Salário Final: " + calcularSalario());
            System.out.println("---------------------------");

    }
}
