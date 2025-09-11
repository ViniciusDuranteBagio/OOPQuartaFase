package polimorfismo.atividades.ativ1;

public class main {
    public static void main(String[] args) {


        Funcionario gerente = new Gerente("Alice", 5000, 2000);
        Funcionario dev = new Desenvolvedor("Bob", 4000, 10, 50);
        Funcionario estagiario = new Estagiario("Charlie", 1000, 500);

        gerente.exibirDados();
        dev.exibirDados();
        estagiario.exibirDados();

    }
}
