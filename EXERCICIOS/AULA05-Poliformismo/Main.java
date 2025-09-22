abstract class Funcionario {
    String nome;
    double salarioBase;
    Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    abstract double calcularSalario();
    void exibirDados() {
        System.out.println("Nome: " + nome + ", Salário: " + calcularSalario());
    }
}

class Gerente extends Funcionario {
    Gerente(String nome, double salarioBase) { super(nome, salarioBase); }
    double calcularSalario() { return salarioBase * 1.5; }
}

class Desenvolvedor extends Funcionario {
    Desenvolvedor(String nome, double salarioBase) { super(nome, salarioBase); }
    double calcularSalario() { return salarioBase * 1.2; }
}

class Estagiario extends Funcionario {
    Estagiario(String nome, double salarioBase) { super(nome, salarioBase); }
    double calcularSalario() { return salarioBase; }
}

abstract class Veiculo {
    String placa, modelo;
    Veiculo(String placa, String modelo) { this.placa = placa; this.modelo = modelo; }
    void ligarMotor() { System.out.println(modelo + " ligou o motor."); }
    void abastecer() { System.out.println(modelo + " foi abastecido."); }
    abstract double calcularConsumo(double km);
}

class Carro extends Veiculo {
    Carro(String placa, String modelo) { super(placa, modelo); }
    double calcularConsumo(double km) { return km / 12; }
}

class Moto extends Veiculo {
    Moto(String placa, String modelo) { super(placa, modelo); }
    double calcularConsumo(double km) { return km / 25; }
}

class Caminhao extends Veiculo {
    Caminhao(String placa, String modelo) { super(placa, modelo); }
    double calcularConsumo(double km) { return km / 5; }
}

abstract class Produto {
    String nome; double preco;
    Produto(String nome, double preco) { this.nome = nome; this.preco = preco; }
    abstract double calcularFrete();
    void exibirResumo() {
        System.out.println("Produto: " + nome + ", Preço: " + preco + ", Frete: " + calcularFrete());
    }
}

class Livro extends Produto {
    Livro(String nome, double preco) { super(nome, preco); }
    double calcularFrete() { return 10; }
}

class Eletronico extends Produto {
    Eletronico(String nome, double preco) { super(nome, preco); }
    double calcularFrete() { return preco * 0.05; }
}

class Roupa extends Produto {
    Roupa(String nome, double preco) { super(nome, preco); }
    double calcularFrete() { return 15; }
}

interface Pagamento { void processarPagamento(double valor); }

class Cartao implements Pagamento {
    public void processarPagamento(double valor) { System.out.println("Pagamento de R$" + valor + " no cartão."); }
}

class Boleto implements Pagamento {
    public void processarPagamento(double valor) { System.out.println("Pagamento de R$" + valor + " via boleto."); }
}

class Pix implements Pagamento {
    public void processarPagamento(double valor) { System.out.println("Pagamento de R$" + valor + " via Pix."); }
}

interface Exportador { void exportar(String dados); }

class ExportadorPDF implements Exportador {
    public void exportar(String dados) { System.out.println("Exportando dados em PDF: " + dados); }
}

class ExportadorCSV implements Exportador {
    public void exportar(String dados) { System.out.println("Exportando dados em CSV: " + dados); }
}

class ExportadorXML implements Exportador {
    public void exportar(String dados) { System.out.println("Exportando dados em XML: " + dados); }
}

interface Validador { boolean validar(String valor); }

class ValidadorCPF implements Validador {
    public boolean validar(String valor) { return valor != null && valor.length() == 11; }
}

class ValidadorEmail implements Validador {
    public boolean validar(String valor) { return valor != null && valor.contains("@"); }
}

class ValidadorCNPJ implements Validador {
    public boolean validar(String valor) { return valor != null && valor.length() == 14; }
}

public class Main {
    public static void main(String[] args) {
        Funcionario g = new Gerente("Ana", 5000);
        Funcionario d = new Desenvolvedor("Carlos", 4000);
        Funcionario e = new Estagiario("João", 1500);
        g.exibirDados(); d.exibirDados(); e.exibirDados();

        Veiculo c = new Carro("ABC1234", "Civic");
        Veiculo m = new Moto("DEF5678", "CB500");
        Veiculo ca = new Caminhao("GHI9012", "Volvo FH");
        c.ligarMotor();
        System.out.println("Consumo Carro: " + c.calcularConsumo(240) + " L");
        m.abastecer();
        System.out.println("Consumo Moto: " + m.calcularConsumo(240) + " L");
        System.out.println("Consumo Caminhão: " + ca.calcularConsumo(240) + " L");

        Produto l = new Livro("Java Básico", 80);
        Produto el = new Eletronico("Notebook", 3000);
        Produto r = new Roupa("Camiseta", 50);
        l.exibirResumo(); el.exibirResumo(); r.exibirResumo();

        Pagamento p1 = new Cartao();
        Pagamento p2 = new Boleto();
        Pagamento p3 = new Pix();
        p1.processarPagamento(100);
        p2.processarPagamento(200);
        p3.processarPagamento(300);

        Exportador ex1 = new ExportadorPDF();
        Exportador ex2 = new ExportadorCSV();
        Exportador ex3 = new ExportadorXML();
        ex1.exportar("Relatório"); ex2.exportar("Planilha"); ex3.exportar("Dados Estruturados");

        Validador v1 = new ValidadorCPF();
        Validador v2 = new ValidadorEmail();
        Validador v3 = new ValidadorCNPJ();
        System.out.println("CPF válido? " + v1.validar("12345678901"));
        System.out.println("Email válido? " + v2.validar("teste@email.com"));
        System.out.println("CNPJ válido? " + v3.validar("12345678000199"));
    }
}
