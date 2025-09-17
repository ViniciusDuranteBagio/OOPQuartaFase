package Atividades_Aula_5.src;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Funcionarios gerente1 = new Gerente();
        gerente1.Funcionarios("Breno", 3000);
        gerente1.calcularSalario(1000);
        gerente1.exibirDados();

        Funcionarios dev1 = new Desenvolvedor();
        dev1.Funcionarios("Joao", 1000);
        dev1.calcularSalario(800);
        dev1.exibirDados();

        Funcionarios estagiario1 = new Estagiario();
        estagiario1.Funcionarios("Braian", 600);
        estagiario1.calcularSalario(300);
        estagiario1.exibirDados();

        Veiculo carro1 = new Carro();
        carro1.Veiculo("Ford", "ABC-123");
        carro1.calcularConsumo(100,8);

        Veiculo moto1 = new Moto();
        moto1.Veiculo("Honda", "XYZ-456");
        moto1.calcularConsumo(100,5);

        Veiculo caminhao1 = new Caminhao();
        caminhao1.Veiculo("Volkswagen", "AAA-789");
        caminhao1.calcularConsumo(100,25);

        Produtos livro1 = new Livro();
        livro1.Produtos("Livro de Java", 79.99);
        livro1.calcularFrete(30);
        livro1.exibirResumo();

        Produtos roupa1 = new Roupa();
        roupa1.Produtos("Camisa", 99.99);
        roupa1.calcularFrete(25);
        roupa1.exibirResumo();

        Produtos eletronico1 = new Eletronico();
        eletronico1.Produtos("Mouse", 199.99);
        eletronico1.calcularFrete(35);
        eletronico1.exibirResumo();

        Metodo cartao1 = new Cartao();
        cartao1.processarPagamento();
        Metodo pix1 = new Pix();
        pix1.processarPagamento();
        Metodo boleto1 = new Boleto();
        boleto1.processarPagamento();

        Exportador pdf1 = new PDF();
        pdf1.exportar();
        Exportador csv1 = new CSV();
        csv1.exportar();
        Exportador xml1 = new XML();
        xml1.exportar();

        Validador cpf1 = new CPF();
        cpf1.validar("123.456.789-00");
        Validador cnpj1 = new CNPJ();
        cnpj1.validar("12.345.678/9012-34");
        Validador email1 = new Email();
        email1.validar("librelatobreno@gmail.com");
    }
}