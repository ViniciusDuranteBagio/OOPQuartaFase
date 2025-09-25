package Aula5;

public class Main {
    public static void main(String[] args) {
        System.out.println("EXERCÍCIO 1 - Funcionários de uma empresa");
        Funcionario f1 = new Estagiario("Gabriel", 1500);
        Funcionario f2 = new Desenvolvedor("Lua", 2500);
        Funcionario f3 = new Gerente("Lara", 3500);
        f1.exibirDados();
        f2.exibirDados();
        f3.exibirDados();

        System.out.println("\nEXERCÍCIO 2 - Veículos");
    }
}
