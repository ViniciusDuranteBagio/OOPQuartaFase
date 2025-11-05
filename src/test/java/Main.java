package org.example;

public class Main {
    public static void main(String[] args) {
        Funcionario g = new Gerente("Carlos", 8000);
        Funcionario d = new Desenvolvedor("Ana", 5000);
        Funcionario e = new Estagiario("Pedro", 2000);

        System.out.println("--- Dados dos Funcionários ---");
        g.exibirDados();
        System.out.println();
        d.exibirDados();
        System.out.println();
        e.exibirDados();

        //Exercício 2

                Veiculo carro = new Carro("ABC-1234", "Honda Civic");
                Veiculo moto = new Moto("XYZ-5678", "Yamaha MT-07");
                Veiculo caminhao = new Caminhao("JKL-9012", "Volvo FH");

                System.out.println("--- Teste de Veículos ---");
                carro.ligarMotor();
                moto.ligarMotor();
                caminhao.ligarMotor();

                System.out.println();
                carro.abastecer();
                moto.abastecer();
                caminhao.abastecer();

                System.out.println();
                carro.exibirDados();
                System.out.println("Consumo médio: " + carro.calcularConsumo(500, 40) + " km/l\n");

                moto.exibirDados();
                System.out.println("Consumo médio: " + moto.calcularConsumo(300, 10) + " km/l\n");

                caminhao.exibirDados();
                System.out.println("Consumo médio: " + caminhao.calcularConsumo(800, 200) + " km/l");

                //Exercício 3
        Produto livro = new Livro("Clean Code", 120.00);
        Produto eletronico = new Eletronico("Fone Bluetooth", 250.00);
        Produto roupa = new Roupa("Jaqueta Jeans", 180.00);

        System.out.println("--- Resumo dos Produtos ---\n");
        livro.exibirResumo();
        System.out.println();
        eletronico.exibirResumo();
        System.out.println();
        roupa.exibirResumo();

        //Exercício 4
        Pagamento p1 = new Cartao();
        Pagamento p2 = new Boleto();
        Pagamento p3 = new Pix();

        System.out.println("--- Processando Pagamentos ---");
        p1.processarPagamento(250.00);
        p2.processarPagamento(480.50);
        p3.processarPagamento(100.00);

        //Exercício 5
        String dados = "Produto;Preço;Quantidade\nMouse;89.90;10\nTeclado;129.90;5";

        Exportador pdf = new ExportadorPDF();
        Exportador csv = new ExportadorCSV();
        Exportador xml = new ExportadorXML();

        System.out.println("--- Exportando Arquivos ---\n");
        pdf.exportar(dados);
        System.out.println();
        csv.exportar(dados);
        System.out.println();
        xml.exportar(dados);

        //Exercício 6
        Validador vCpf = new ValidadorCPF();
        Validador vEmail = new ValidadorEmail();
        Validador vCnpj = new ValidadorCNPJ();

        System.out.println("--- Teste de Validações ---");
        System.out.println("CPF válido? " + vCpf.validar("12345678901"));
        System.out.println("CPF inválido? " + vCpf.validar("12345"));

        System.out.println();
        System.out.println("Email válido? " + vEmail.validar("usuario@dominio.com"));
        System.out.println("Email inválido? " + vEmail.validar("usuario@@dominio"));

        System.out.println();
        System.out.println("CNPJ válido? " + vCnpj.validar("12345678000199"));
        System.out.println("CNPJ inválido? " + vCnpj.validar("abc123"));




            }
        }




