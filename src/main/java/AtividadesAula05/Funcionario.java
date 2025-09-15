package AtividadesAula05;

public abstract class Funcionario {
    String nome;
    double salario;

    public Funcionario (String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public abstract double calcularSalario();

    public void exibirDados () {
        System.out.println("Meu nome é " + nome + " e meu salário é R$" + salario);
    }

}
