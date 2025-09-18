package Exercicios_Aula5;

public class Main {
    public static void main(String[] args) {
        //Exercício 1
        System.out.println("////////Exercício 1///////////\n");
        Funcionario funcionario1 = new Gerente("Marivaldo", 10000);
        Funcionario funcionario2 = new Desenvolvedor("Tiago", 6000);
        Funcionario funcionario3 = new Estagiario("Jotapê", 1500);

        Funcionario[] funcionarios = {funcionario1, funcionario2, funcionario3};

        for (Funcionario f : funcionarios) {
            f.exibirDados();
        }
        System.out.println("///////////////////////////////\n");

        //Exercício 2
        System.out.println("////////Exercício 2///////////\n");
        Veiculo carro1 = new Carro();
        carro1.Veiculo("Ford", "ABC-123");
        carro1.calcularConsumo(100,8);

        Veiculo moto1 = new Moto();
        moto1.Veiculo("Honda", "XYZ-456");
        moto1.calcularConsumo(100,5);

        Veiculo caminhao1 = new Caminhao();
        caminhao1.Veiculo("Volkswagen", "AAA-789");
        caminhao1.calcularConsumo(100,25);

        Veiculo[] veiculos = { carro1, moto1, caminhao1 };

        for (Veiculo v : veiculos) {
            v.ligarMotor();
            v.abastecer();
        }
        System.out.println("///////////////////////////////\n");

        //Exercício 3
        System.out.println("////////Exercício 3///////////\n");

        Produto produto1 = new Livro("Guerra Civil", 89.90);
        Produto produto2 = new Eletronico("iPhone 13", 3500);
        Produto produto3 = new Roupa("Camiseta S.I", 180);

        Produto[] produtos = { produto1, produto2, produto3 };

        for (Produto p : produtos) {
            p.exibirResumo();
        }

        System.out.println("///////////////////////////////\n");


        //Exercício 4
        System.out.println("////////Exercício 4///////////\n");

        IFormaPagamento pagamento1 = new Cartao();
        IFormaPagamento pagamento2 = new Boleto();
        IFormaPagamento pagamento3 = new Pix();

        IFormaPagamento[] pagamentos = { pagamento1, pagamento2, pagamento3 };

        for (IFormaPagamento p : pagamentos) {
            p.processarPagamento(150.0);
        }

        System.out.println("///////////////////////////////\n");

        //Exercício 5
        System.out.println("////////Exercício 5///////////\n");

        String dados = "Simulação de entrada de dados por aqui";

        IExportador e1 = new PDF();
        IExportador e2 = new CSV();
        IExportador e3 = new XML();

        IExportador[] exportadores = { e1, e2, e3 };

        for (IExportador e : exportadores) {
            e.exportar(dados);
        }

        System.out.println("///////////////////////////////\n");

        //Exercício 6
        System.out.println("////////Exercício 6///////////\n");

        IValidador cpf = new ValidadorCPF();
        IValidador cnpj = new ValidadorCNPJ();
        IValidador email = new ValidadorEMAIL();

        String valorCPF = "12345678901";
        String valorCNPJ = "12345678901234";
        String valorEmail = "exemplo@unibave.com";

        System.out.println("CPF válido? " + cpf.validar(valorCPF));
        System.out.println("CNPJ válido? " + cnpj.validar(valorCNPJ));
        System.out.println("Email válido? " + email.validar(valorEmail));

        System.out.println("///////////////////////////////\n");



    }
}
