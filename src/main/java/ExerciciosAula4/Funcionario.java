package ExerciciosAula4;

// Usada no exercício 6
public class Funcionario {
    String nome;
    double salario;

    public void aumentarSalario(double porcentagem) {
        if (porcentagem > 0) {
            this.salario += this.salario * (porcentagem / 100.0);
        }
    }
}