package AtividadesAula05;

public class Main {

    public static void main(String[] args) {
        System.out.println("ATIVIDADE 1");

        Funcionario f1 = new Gerente ("Josh", 2500);
        Funcionario f2 = new Desenvolvedor ("Diana", 4200);
        Funcionario f3 = new Estagiario ("Carlos", 1800);

        f1.exibirDados();
        System.out.println("Salario: R$" + f1.calcularSalario());
        f2.exibirDados();
        System.out.println("Salario: R$" + f2.calcularSalario());
        f3.exibirDados();
        System.out.println("Salario: R$" + f3.calcularSalario());

        System.out.println("ATIVIDADE 2");

        Veiculos v1 = new Carro("MDG-2541", "HYUNDAI");
        Veiculos v2 = new Moto("JDF-4522", "YAMAHA");
        Veiculos v3 = new Caminhao("KDS-7888", "VOLVO FH");

        v1.ligarMotor();
        v1.abastecer();
        v1.calcularConsumo();

        v2.ligarMotor();
        v2.abastecer();
        v2.calcularConsumo();

        v3.ligarMotor();
        v3.abastecer();
        v3.calcularConsumo();

        System.out.println("ATIVIDADE 3");
        Produtos p1 = new Livro("O pequeno príncipe", 25.00);
        Produtos p2 = new Eletronico("Celular", 2500.99);
        Produtos p3 = new Roupas("Saia", 69.98);

        p1.exibirResumo();
        p1.calcularFrete();

        p2.exibirResumo();
        p2.calcularFrete();

        p3.exibirResumo();
        p3.calcularFrete();

        System.out.println("ATIVIDADE 4");

        Pagamento pag1 = new Boleto();
        Pagamento pag2 = new Pix();
        Pagamento pag3 = new Cartao();

        pag1.processarPagamento(500.99);
        pag2.processarPagamento(425.52);
        pag3.processarPagamento(455.25);

        System.out.println("ATIVIDADE 5");
        Exportadores e1 = new Csv();
        Exportadores e2 = new Pdf();
        Exportadores e3 = new Xml();

        e1.exportar("Relatório");
        e2.exportar("Relatório");
        e3.exportar("Relatório");

        System.out.println("ATIVIDADE 6");

        Validador cpf = new ValidadorCPF();
        Validador email = new ValidadorEmail();
        Validador cnpj = new ValidadorCNPJ();

        System.out.println("CPF VÁLIDO? " + (cpf.validar("25945696686") ? "VÁLIDO" : "INVÁLIDO"));
        System.out.println("EMAIL VÁLIDO? " + (email.validar("babszoca@gmail.com") ? "VÁLIDO" : "INVÁLIDO"));
        System.out.println("CNPJ VÁLIDO? " + (cnpj.validar("75896546000154") ? "VÁLIDO" : "INVÁLIDO"));

    }
}
