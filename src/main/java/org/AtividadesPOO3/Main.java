package org.AtividadesPOO3;

public class Main {
    /*public static void main(String[] args) {
            Funcionario g1 = new Gerente("Ana Paula", 5000, 1500);
            Funcionario d1 = new Desenvolvedor("Carlos", 3000, 500);
            Funcionario e1 = new Estagiario("Rafael", 1200);

            g1.exibirDados();
            d1.exibirDados();
            e1.exibirDados();
        }
    }*/

    /*public static void main(String[] args) {
        Veiculo carro = new Carro("ABC-1234", "Toyota Corolla");
        Veiculo moto = new Moto("XYZ-5678", "Honda CB500");
        Veiculo caminhao = new Caminhao("JKL-9012", "Volvo FH");

        carro.ligarMotor();
        carro.abastecer(40);
        System.out.println("Consumo carro: " + carro.calcularConsumo(400, 40) + " km/l");
        carro.exibirInfo();

        moto.ligarMotor();
        moto.abastecer(15);
        System.out.println("Consumo moto: " + moto.calcularConsumo(150, 15) + " km/l");
        moto.exibirInfo();

        caminhao.ligarMotor();
        caminhao.abastecer(200);
        System.out.println("Consumo caminhão: " + caminhao.calcularConsumo(500, 200) + " km/l");
        caminhao.exibirInfo();
    }
}*/

    /*public static void main(String[] args) {
        Produto livro = new Livro("Aprendendo Java", 80.0, 2.0);
        Produto eletronico = new Eletronico("Smartphone", 2500.0, 2000);
        Produto roupa = new Roupas("Camiseta", 50.0, "M");

        livro.exibirResumo();
        eletronico.exibirResumo();
        roupa.exibirResumo();
    }
}*/

    /*public static void main(String[] args) {
        Pagamento cartao = new Cartao("1234-5678-9012-3456");
        Pagamento boleto = new Boleto("9876543210");
        Pagamento pix = new Pix("email@exemplo.com");

        cartao.processarPagamento(150.0);
        boleto.processarPagamento(250.0);
        pix.processarPagamento(100.0);
    }
}*/

    /*public static void main(String[] args) {
        Exportador pdf = new ExportadorPDF();
        Exportador csv = new ExportadorCSV();
        Exportador xml = new ExportadorXML();

        String dados = "Nome, Idade, Cidade";

        pdf.exportar(dados);
        csv.exportar(dados);
        xml.exportar(dados);
    }
}*/

    public static void main(String[] args) {
        Validador cpf = new ValidadorCPF();
        Validador email = new ValidadorEmail();
        Validador cnpj = new ValidadorCNPJ();

        cpf.validar("12345678901");
        cpf.validar("12345");

        email.validar("teste@exemplo.com");
        email.validar("testeexemplo.com");

        cnpj.validar("12345678000195");
        cnpj.validar("12345678");
    }
}