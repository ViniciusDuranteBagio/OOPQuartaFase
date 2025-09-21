package Atividades.Aula5;

public class Main {
    public static void main(String[] args) {

        //Questão 6
        Validadores validadorCPF = new CPF();
        Validadores validadorEmail = new Email();
        Validadores validadorCNPJ = new CNPJ();

        String cpfTeste = "12345678909";
        String emailTeste = "teste@exemplo.com";
        String cnpjTeste = "12345678000195";

        System.out.println("CPF válido: " + validadorCPF.validar(cpfTeste));
        System.out.println("Email válido: " + validadorEmail.validar(emailTeste));
        System.out.println("CNPJ válido: " + validadorCNPJ.validar(cnpjTeste));

        //Questão 5
        //String dados = "Nome, Idade, Cidade\nAlice, 30, São Paulo\nBob, 25, Rio de Janeiro";
        //exportarcao pdfExporter = new PDF();
        //exportarcao csvExporter = new CSV();
        //exportarcao xmlExporter = new XML();

        //pdfExporter.exportar(dados);
        //csvExporter.exportar(dados);
        //xmlExporter.exportar(dados);

        //Questão 4
        //Pagamentos cartao = new Cartao(150.0, "1234-5678-9012-3456");
        //Pagamentos boleto = new Boleto(250.0, "BOLETO123456");
        //Pagamentos pix = new Pix(100.0, "chave@exemplo.com");

        //cartao.processarPagamento();
        //boleto.processarPagamento();
        //pix.processarPagamento();

        //Questão 3
        //Produtos livro = new Livro("O Senhor dos Anéis", 50.0);
        //Produtos eletronico = new Eletronico("Smartphone", 1200.0);
        //Produtos roupas = new Roupas("Camiseta", 40.0);

        //livro.exibirResumo();
        //eletronico.exibirResumo();
        //roupas.exibirResumo();

        //Questão 2
        //Veiculo carro = new Carro("ABC-1234", "Fusca", 50);
        //Veiculo moto = new Moto("XYZ-5678", "Honda CG", 15);
        //Veiculo caminhao = new Caminhao("LMN-9012", "Volvo FH", 300);

        //carro.ligarMotor();
        //carro.abastecer(20);
        //double consumoCarro = carro.calcularConsumo(100);
        //JOptionPane.showMessageDialog(null, "Consumo do carro para 100 km: " + consumoCarro + " litros.");

        //moto.ligarMotor();
        //moto.abastecer(10);
        //double consumoMoto = moto.calcularConsumo(100);
        //JOptionPane.showMessageDialog(null, "Consumo da moto para 100 km: " + consumoMoto + " litros.");

        //caminhao.ligarMotor();
        //caminhao.abastecer(150);
        //double consumoCaminhao = caminhao.calcularConsumo(100);
        //JOptionPane.showMessageDialog(null, "Consumo do caminhão para 100 km: " + consumoCaminhao + " litros.");

        //Questão 1
        //Funcionario funcionario1 = new Gerente("Alice", 5000);
        //Funcionario funcionario2 = new Desenvolvedor("Bob", 4000);
        //Funcionario funcionario3 = new Estagiario("Carlos", 2000);

        //funcionario1.exibirDados();
        //funcionario2.exibirDados();
        //funcionario3.exibirDados();
    }
}
