package Polimorfismo;

public class Main {

    public static void main(String[] args) {
        /*Funcionarios1 funcionarios1 = new Gerente1("Alan", 2000);
        Funcionarios1 funcionarios2 = new Desenvolvedor("Alan", 2000);
        Funcionarios1  funcionarios3 = new Estagiario("Alan", 2000);
        funcionarios1.exibirDados();
        funcionarios2.exibirDados();
        funcionarios3.exibirDados();
        funcionarios1.calcularSalario();
        funcionarios2.calcularSalario();
        funcionarios3.calcularSalario();*/

        /*Veiculos moto = new Moto("Cg150", "mk6a12");
        Veiculos carro = new Carro("Focus", "mk6a12");
        Veiculos caminhao = new Caminhao("Scania", "mk6a12");
       moto.abastecer();
       moto.ligarMotor();
        System.out.println("A moto consome: " + moto.calcularConsumo(500, 20) + "Km/l");
       carro.abastecer();
       carro.ligarMotor();
        System.out.println("O carro consome: " + carro.calcularConsumo(500, 50) + "Km/l");
       caminhao.abastecer();
       caminhao.ligarMotor();
        System.out.println("O caminhão consome: " + moto.calcularConsumo(12000, 200) + "Km/l");*/

        /*Produtos livro = new Livro("Dom quixote", 100, 2);
        livro.exibirResumo();
        Produtos eletronico = new Eletronico("Geladeira" , 5000);
        eletronico.exibirResumo();
        Produtos roupa = new Roupas("Blusa", 100.50, 500);
        roupa.exibirResumo();*/

        /*Pagamento cartao = new Cartao("10211820");
        cartao.processarPagamento(200);
        Pagamento pix = new Pix("ALAN", "Uni");
        pix.processarPagamento(350);
        Pagamento boleto = new Boleto(1006070044);
        boleto.processarPagamento(1000);*/

        /*Arquivos arquivosPdf = new Pdf();
        arquivosPdf.exportar("ALAN, IDADE: 21");
        Arquivos arquivosCsv = new Csv();
        arquivosCsv.exportar("ALAN, IDADE: 22");
        Arquivos arquivosXml = new Xml();
        arquivosXml.exportar("ALAN, IDADE: 23");*/

        Validador cpf = new Cpf();
        cpf.validar("10211100012");
        Validador email = new Email();
        email.validar("email@alan");
        Validador cnpj = new Cnpj();
        cnpj.validar("11111111111111");

    }
}
