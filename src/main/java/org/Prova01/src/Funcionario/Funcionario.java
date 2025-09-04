package Funcionario;

public class Funcionario {
    protected String nome;
    protected double sal;
    protected double bonus;
    protected double porcentagem = 0.1;

    public Funcionario(String nome, double sal){
        this.nome = nome;
        this.sal = sal;
        this.bonus = sal;
        this.porcentagem = getPorcentagem();
    }

    protected String getNome() {
        return nome;
    }

    protected double getSal() {
        return sal;
    }

    protected double getBonus() {
        return bonus;
    }

    protected double getPorcentagem() {
        return porcentagem;
    }

    public void calcularBonus(){
        bonus = getSal() * getPorcentagem();
        System.out.println("Nome: " + getNome() +
                            "\nSalário: " + getSal() +
                            "\nBônus: " + getBonus());
    }

}
