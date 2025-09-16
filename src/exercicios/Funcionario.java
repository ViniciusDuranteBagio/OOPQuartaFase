package exercicios;

class Funcionario {
    String nome;
    double salario;

    public void aumentarSalario(double porcentagem) {
        salario += salario * (porcentagem / 100);
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Salário: R$" + salario);
    }
}
