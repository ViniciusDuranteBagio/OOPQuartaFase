package heranca_atividade;

public class Funcionario {
    String nome;
    double salario;

    double aumento;
    public void aumentarSalario(double porcentagem){
        aumento = porcentagem / 100;
        salario = salario + (salario * aumento);
        System.out.println("novo salario : " + salario);
    }
}
