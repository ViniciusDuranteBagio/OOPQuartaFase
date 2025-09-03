public class Funcionario {
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Erro: o nome não pode ser vazio.");
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("Erro: o salário deve ser positivo.");
        }
    }

    public double calcularBonus() {
        return salario * 0.10;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + " | Salário: R$ " + salario + " | Bônus: R$ " + calcularBonus());
    }
}

