package Aula5.Exercicios;

public class Main {
    public static void main(String[] args) {

    System.out.println("Questão 1");
        Funcionario g = new Gerente("Ana", 5000);
        Funcionario d = new Desenvolvedor("João", 4000);
        Funcionario e = new Estagiario("Carlos", 1500);
            g.exibirDados();
            d.exibirDados();
            e.exibirDados();

    System.out.println("\nQuestão 2:");
        Veiculo carro = new Carro("hut-8492", "Corolla");
        Veiculo moto = new Moto("pfn-2164", "Honda CG");
        Veiculo caminhao = new Caminhao("DEF-9624", "Volvo FH");
            carro.ligarMotor(); System.out.println("Consumo: " + carro.calcularConsumo(120) + " L");
            moto.ligarMotor(); System.out.println("Consumo: " + moto.calcularConsumo(120) + " L");
            caminhao.ligarMotor(); System.out.println("Consumo: " + caminhao.calcularConsumo(120) + " L");

    System.out.println("\nQuestão 3");
        Produto livro = new Livro("Java Básico", 100);
        Produto celular = new Eletronico("Smartphone", 2000);
        Produto camisa = new Roupa("Camiseta", 80);
            livro.exibirResumo();
            celular.exibirResumo();
            camisa.exibirResumo();

    System.out.println("\nQuestão 4");
        Pagamento p1 = new Cartao();
        Pagamento p2 = new Boleto();
        Pagamento p3 = new Pix();
            p1.processarPagamento(250);
            p2.processarPagamento(300);
            p3.processarPagamento(150);

    System.out.println("\nQuestão 5");
        Exportador expPDF = new ExportadorPDF();
        Exportador expCSV = new ExportadorCSV();
        Exportador expXML = new ExportadorXML();
            expPDF.exportar("Relatório Financeiro");
            expCSV.exportar("Lista de Vendas");
            expXML.exportar("Configurações do Sistema");

    System.out.println("\nQuestão 6");
        Validador cpf = new ValidadorCPF();
        Validador email = new ValidadorEmail();
        Validador cnpj = new ValidadorCNPJ();
            System.out.println("CPF válido? " + cpf.validar("523.947.516-12"));
            System.out.println("Email válido? " + email.validar("teste@email.com"));
            System.out.println("CNPJ válido? " + cnpj.validar("42576183597542"));
}
}
