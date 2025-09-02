package exercicio6;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Ricardo", 4000.00, "Vendas");
        System.out.println("O gerente " + gerente.nome + " tem o salario " + gerente.salario);
        gerente.aumentarSalario(50);
        System.out.println("O gerente " + gerente.nome + " agora tem o salario " + gerente.salario);
    }
}
