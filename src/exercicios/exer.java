public class Exercicio6 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.nome = "Carlos Silva";
        gerente.salario = 5000;
        gerente.departamento = "TI";
        
        gerente.aumentarSalario(10);
        gerente.exibirInformacoes();
    }
}

