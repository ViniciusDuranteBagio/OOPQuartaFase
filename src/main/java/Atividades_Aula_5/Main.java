package Atividades_Aula_5;

public class Main {
    public static void main(String[] args) {
        // Atividade 1
        Funcionario gerente = new Gerente("Carlos", 5000.0);
        Funcionario dev = new Desenvolvedor("Ana", 4000.0);
        Funcionario estagiario = new Estagiario("João", 2000.0);


        gerente.exibirDados();
        System.out.println("Salário final: R$ " + gerente.calcularSalario());


        dev.exibirDados();
        System.out.println("Salário final: R$ " + dev.calcularSalario());


        estagiario.exibirDados();
        System.out.println("Salário final: R$ " + estagiario.calcularSalario());

        System.out.println("");
        // Atividade 2

        Veiculos carro = new Carro("ABC-1234", "Fiat Uno");
        Veiculos moto = new Moto("XYZ-5678", "Honda CG");
        Veiculos caminhao = new Caminhao("DEF-9012", "Volvo FH");

        carro.ligarMotor();
        moto.ligarMotor();
        caminhao.ligarMotor();

        carro.abastecer();
        moto.abastecer();
        caminhao.abastecer();

        System.out.println(carro.modelo + " consumo: " + carro.calcularConsumo(500, 40) + " km/l");
        System.out.println(moto.modelo + " consumo: " + moto.calcularConsumo(300, 15) + " km/l");
        System.out.println(caminhao.modelo + " consumo: " + caminhao.calcularConsumo(800, 200) + " km/l");

        System.out.println("");
        //Atividade 3
        Loja livro = new Livro("Java para Iniciantes", 50.0);
        Loja eletronico = new Eletronico("Smartphone", 2000.0);
        Loja roupa = new Roupa("Camiseta", 80.0);


        livro.exibirResumo();
        eletronico.exibirResumo();
        roupa.exibirResumo();
        System.out.println("");
        //Atividade 4

        Pagamento cartao = new Cartao("1234-5678-9876-5432");
        Pagamento boleto = new Boleto("34191.79001 01043.510047 91020.150008 5 82370000010000");
        Pagamento pix = new Pix("meuemail@exemplo.com");

        double valorCompra = 150.0;

        cartao.processarPagamento(valorCompra);
        boleto.processarPagamento(valorCompra);
        pix.processarPagamento(valorCompra);
        System.out.println("");
     // Atividade 5

        Exportador pdf = new ExportadorPDF();
        Exportador csv = new ExportadorCSV();
        Exportador xml = new ExportadorXML();

        String dados = "Nome,Idade,Email\nJoão,25,joao@email.com";

        pdf.exportar(dados);
        csv.exportar(dados);
        xml.exportar(dados);

        System.out.println("");
     //Atividade 6

        Validador cpf = new ValidadorCPF();
        Validador email = new ValidadorEmail();
        Validador cnpj = new ValidadorCNPJ();

        String cpfTeste = "12345678901";
        String emailTeste = "teste@email.com";
        String cnpjTeste = "12345678000199";

        System.out.println("CPF válido? " + cpf.validar(cpfTeste));
        System.out.println("Email válido? " + email.validar(emailTeste));
        System.out.println("CNPJ válido? " + cnpj.validar(cnpjTeste));


}
}