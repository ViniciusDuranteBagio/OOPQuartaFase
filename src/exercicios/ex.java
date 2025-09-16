public class FuncionariosEmpresa {
    public static void main(String[] args) {
        Gerente2 gerente2 = new Gerente2();
        gerente2.nome = "Carlos Silva";
        gerente2.salarioBase = 5000;
        
        Desenvolvedor dev = new Desenvolvedor();
        dev.nome = "Ana Santos";
        dev.salarioBase = 4000;
        
        Estagiario estagiario = new Estagiario();
        estagiario.nome = "Pedro Oliveira";
        estagiario.salarioBase = 1500;
        
        gerente2.exibirDados();
        System.out.println();
        dev.exibirDados();
        System.out.println();
        estagiario.exibirDados();
    }
}

