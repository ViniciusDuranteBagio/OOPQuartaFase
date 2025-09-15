package exercicio_1;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Gerente("Renato", 5000);
        Funcionario f2 = new Desenvolvedor("Marcelo", 4000);
        Funcionario f3 = new Estagiario("Júnior", 2000);

        Funcionario[] funcionarios = {f1, f2, f3};

        for (Funcionario f : funcionarios) {
            f.exibirDados();
        }
    }
}
