package Prova;
/*
Crie uma classe Funcionario com atributos nome e salario.
Crie um método calcularBonus() que retorna 10% do salário.
Crie uma subclasse Gerente que sobrescreve esse método para retornar 20% do salário
 */
public class funcionario {
    public String nome;
    public double salario;

    public void calcularBonus() {
        salario = salario * 0.10;
        System.out.println("O " + " " + nome +  "\n" + "receberá o bonus de " + " " + salario);
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
}
