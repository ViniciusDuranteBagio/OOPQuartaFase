public class Main {
    public static void main(String[] args) {

        Funcionario f1 = new Gerente("Carlos", 5000);
        Funcionario f2 = new Desenvolvedor("Ana", 4000);
        Funcionario f3 = new Estagiario("Pedro", 1500);

        f1.exibirDados();
        f2.exibirDados();
        f3.exibirDados();

        Veiculo v1 = new Carro("ABC-1234", "Corsa");
        Veiculo v2 = new Moto("XYZ-9876", "Honda");
        Veiculo v3 = new Caminhao("TTT-5555", "Volvo");

        v1.ligarMotor();
        v2.ligarMotor();
        v3.ligarMotor();

        Produto p1 = new Livro("Java Básico", 50);
        Produto p2 = new Eletronico("Notebook", 3000);
        Produto p3 = new Roupa("Camiseta", 80);

        p1.exibirResumo();
        p2.exibirResumo();
        p3.exibirResumo();

        FormaPagamento fp1 = new Cartao();
        FormaPagamento fp2 = new Pix();

        fp1.processarPagamento(120);
        fp2.processarPagamento(75);

        Exportador ex1 = new ExportadorPDF();
        ex1.exportar("Relatório de vendas");

        Validador cpf = new ValidadorCPF();
        System.out.println("CPF válido? " + cpf.validar("12345678901"));
    }
}
