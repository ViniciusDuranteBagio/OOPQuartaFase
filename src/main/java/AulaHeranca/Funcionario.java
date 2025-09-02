package AulaHeranca;

public class Funcionario {
    String nome;
    double salario;

    public Funcionario (String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public void aumentarSalario(double porcentagem) {
        salario += salario * (porcentagem / 100);

    }
    public void exibirInformacoes() {
    System.out.println("Nome: " + nome + "\n" + "Salário: R$ " + salario);
    }
}
