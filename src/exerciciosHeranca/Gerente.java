public class Gerente extends Funcionario{
    int departamento;
    public Gerente(String nome, double salario, int departamento){
        super(nome, salario);
        this.departamento=departamento;
    }
}
