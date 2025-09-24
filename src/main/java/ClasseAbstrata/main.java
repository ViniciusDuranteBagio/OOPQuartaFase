package ClasseAbstrata;
//
//public class main {
//    public static void main(String[] args) {
//        Gerente g = new Gerente("Ana", 5000.0, 1500.0);
//        Desenvolvedor d = new Desenvolvedor("Carlos", 3000.0, 500.0);
//        Estagiario e = new Estagiario("Lucas", 1000.0, 300.0);
//
//        g.exibirDados();
//        d.exibirDados();
//        e.exibirDados();
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Carro carro = new Carro("ABC1234", "Fiat Uno", 12.0);
//        Moto moto = new Moto("XYZ5678", "Honda CB500", 25.0);
//        Caminhao caminhao = new Caminhao("TRK9001", "Volvo FH", 5.0);
//
//        carro.ligarMotor();
//        moto.ligarMotor();
//        caminhao.ligarMotor();
//
//        carro.abastecer(40);
//        moto.abastecer(15);
//        caminhao.abastecer(200);
//
//        System.out.println("Consumo do carro: " + carro.calcularConsumo() + " km/l");
//        System.out.println("Consumo da moto: " + moto.calcularConsumo() + " km/l");
//        System.out.println("Consumo do caminhão: " + caminhao.calcularConsumo() + " km/l");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Livro livro = new Livro("Java Programming", 150.0, 2.0);
//        Eletronico eletronico = new Eletronico("Smartphone", 2500.0, 50.0);
//        Roupa roupa = new Roupa("Camisa", 100.0);
//
//        livro.exibirResumo();
//        eletronico.exibirResumo();
//        roupa.exibirResumo();
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Pagamento cartao = new Cartao(150.0);
//        Pagamento boleto = new Boleto(200.0);
//        Pagamento pix = new Pix(100.0);
//
//        cartao.processarPagamento();
//        boleto.processarPagamento();
//        pix.processarPagamento();
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Exportador pdf = new ExportadorPDF();
//        Exportador csv = new ExportadorCSV();
//        Exportador xml = new ExportadorXML();
//
//        String dados = "Nome,Idade,Cidade";
//
//        pdf.exportar(dados);
//        csv.exportar(dados);
//        xml.exportar(dados);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Validador cpf = new ValidadorCPF();
//        Validador email = new ValidadorEmail();
//        Validador cnpj = new ValidadorCNPJ();
//
//        System.out.println("CPF válido? " + cpf.validar("12345678901"));
//        System.out.println("Email válido? " + email.validar("teste@exemplo.com"));
//        System.out.println("CNPJ válido? " + cnpj.validar("12345678000199"));
//    }
//}
