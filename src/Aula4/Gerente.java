package Aula4;

public class Gerente extends Funcionario {
    private String departamento;
    
    // Construtor
    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }
    
    // Getter e Setter
    public String getDepartamento() {
        return departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    // Sobrescrevendo o método da superclasse
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Departamento: " + this.departamento);
    }
} 