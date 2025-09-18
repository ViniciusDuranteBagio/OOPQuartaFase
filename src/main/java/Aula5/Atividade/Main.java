package Aula5.Atividade;

public class Main {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Ana",5000.0);
        Desenvolvedor desenvolvedor1 = new Desenvolvedor("Alan",3000.00);
        Estagiario estagiario1 = new Estagiario("Davi",1800.00);
        gerente1.exibirDados();
        desenvolvedor1.exibirDados();
        estagiario1.exibirDados();


        Carro v1 = new Carro("ABC-1234", "Civic");
        Moto v2 = new Moto("XYZ-5678", "Hornet");
        Caminhao v3 = new Caminhao("JKL-9101", "Scania");
        v1.abastecer(20);
        v2.abastecer(10);
        v3.abastecer(50);
        System.out.println("------------------------------------");
        v1.ligarMotor();
        v2.ligarMotor();
        v3.ligarMotor();
        System.out.println("------------------------------------");
        v1.exibirDados();
        v2.exibirDados();
        v3.exibirDados();
        v1.calcularConsumo(120);
        v2.calcularConsumo(200);
        v3.calcularConsumo(60);

        Produto produto1 = new Livro("Java para Iniciantes", 120.0);
        Produto produto2 = new Eletronico("Notebook Dell", 3500.0);
        Produto produto3 = new Roupa("Camiseta Polo", 80.0);
        produto1.exibirResumo();
        produto2.exibirResumo();
        produto3.exibirResumo();

       Cartao p1 = new Cartao();
       Pix p2 = new Pix();
       Boleto p3 = new Boleto();
        p1.processarPagamento(100.0);
        p2.processarPagamento(250.0);
        p3.processarPagamento(50.0);

        String dados = "Nome: Ana Idade: 25 Cidade: São Paulo";
        PDF e1 = new PDF();
        CSV e2 = new CSV();
        XML e3 = new XML();
        e1.exportar(dados);
        e2.exportar(dados);
        e3.exportar(dados);

        ValidadorCPF cpf1 = new ValidadorCPF();
        ValidadorEmail email1 = new ValidadorEmail();
        ValidadorCNPJ cnpj1 = new ValidadorCNPJ();
        String cpf = "123.456.789-00";
        String email = "teste@dominio.com";
        String cnpj = "12.345.678/0001-90";

        System.out.println("CPF válido? " + cpf1.validar(cpf));
        System.out.println("Email válido? " + email1.validar(email));
        System.out.println("CNPJ válido? " + cnpj1.validar(cnpj));




    }
}
