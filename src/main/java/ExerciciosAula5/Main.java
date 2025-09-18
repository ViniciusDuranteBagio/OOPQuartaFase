package ExerciciosAula5;

public class Main {
    public static void main(String[] args) {

        // --- Exercício 1 – Funcionários de uma empresa ---
        System.out.println("--- Exercício 1: Funcionários ---");
        Funcionario gerente = new Gerente("Ana Costa", 5000.0);
        Funcionario dev = new Desenvolvedor("João Silva", 3500.0);
        Funcionario estagiario = new Estagiario("Carlos Pereira", 1200.0);

        gerente.exibirDados();
        System.out.println();
        dev.exibirDados();
        System.out.println();
        estagiario.exibirDados();
        System.out.println("\n" + "=".repeat(50) + "\n");


        // --- Exercício 2 – Veículos ---
        System.out.println("--- Exercício 2: Veículos ---");
        Veiculo carro = new Carro("ABC-1234", "Toyota Corolla");
        Veiculo moto = new Moto("DEF-5678", "Honda CB 500");
        Veiculo caminhao = new Caminhao("GHI-9012", "Scania R450");

        double distancia = 100; // 100 km
        System.out.printf("Consumo do carro para %.1f km: %.2f litros\n", distancia, carro.calcularConsumo(distancia));
        System.out.printf("Consumo da moto para %.1f km: %.2f litros\n", distancia, moto.calcularConsumo(distancia));
        System.out.printf("Consumo do caminhão para %.1f km: %.2f litros\n", distancia, caminhao.calcularConsumo(distancia));
        System.out.println("\n" + "=".repeat(50) + "\n");


        // --- Exercício 3 – Produtos de um ecommerce ---
        System.out.println("--- Exercício 3: Produtos de Ecommerce ---");
        Produto livro = new Livro("Java para Iniciantes", 80.0);
        Produto note = new Eletronico("Notebook Gamer", 4500.0);
        Produto camisa = new Roupa("Camisa Social", 120.0);

        livro.exibirResumo();
        System.out.println();
        note.exibirResumo();
        System.out.println();
        camisa.exibirResumo();
        System.out.println("\n" + "=".repeat(50) + "\n");


        // --- Exercício 4 – Formas de pagamento ---
        System.out.println("--- Exercício 4: Formas de Pagamento ---");
        FormaDePagamento pgtoCartao = new Cartao();
        FormaDePagamento pgtoBoleto = new Boleto();
        FormaDePagamento pgtoPix = new Pix();

        double valorCompra = 250.0;
        pgtoCartao.processarPagamento(valorCompra);
        pgtoBoleto.processarPagamento(valorCompra);
        pgtoPix.processarPagamento(valorCompra);
        System.out.println("\n" + "=".repeat(50) + "\n");


        // --- Exercício 5 – Exportadores de arquivo ---
        System.out.println("--- Exercício 5: Exportadores de Arquivo ---");
        Exportador pdf = new ExportadorPDF();
        Exportador csv = new ExportadorCSV();
        Exportador xml = new ExportadorXML();

        String dados = "ID;Nome;Idade | 1;Maria;30";
        pdf.exportar(dados);
        csv.exportar(dados);
        xml.exportar(dados);
        System.out.println("\n" + "=".repeat(50) + "\n");


        // --- Exercício 6 – Validações de dados ---
        System.out.println("--- Exercício 6: Validações de Dados ---");
        Validador validadorCPF = new ValidadorCPF();
        Validador validadorEmail = new ValidadorEmail();
        Validador validadorCNPJ = new ValidadorCNPJ();

        System.out.println("CPF '12345678901' é válido? " + validadorCPF.validar("12345678901"));
        System.out.println("CPF '123' é válido? " + validadorCPF.validar("123"));
        System.out.println("Email 'teste@exemplo.com' é válido? " + validadorEmail.validar("teste@exemplo.com"));
        System.out.println("Email 'teste.com' é válido? " + validadorEmail.validar("teste.com"));
        System.out.println("CNPJ '12345678901234' é válido? " + validadorCNPJ.validar("12345678901234"));
        System.out.println("CNPJ '12345' é válido? " + validadorCNPJ.validar("12345"));
        System.out.println("\n" + "=".repeat(50) + "\n");
    }
}