public class MainExerciciosEncaps {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria(1001);
        System.out.println(contaBancaria.getNumeroConta());
        contaBancaria.setTitular("Thiago");
        System.out.println(contaBancaria.getTitular());
        contaBancaria.depositar(40);
        contaBancaria.sacar(21);
        contaBancaria.exibirSaldo();

        Pessoa pessoa1 = new Pessoa("Thiago", 18, "12345678999");
        pessoa1.exibirInformacoes();
        Pessoa pessoa2 = new Pessoa("João", 19, "99999999999");
        pessoa2.exibirInformacoes();
        Pessoa pessoa3 = new Pessoa();
        pessoa3.exibirInformacoes();


        Produto p = new Produto("Notebook", 3500.00, 10);
        p.exibirInformacoes();
        p.adicionarEstoque(5);
        p.exibirInformacoes();
        p.vender(3);
        p.exibirInformacoes();
        p.setPreco(-50);
        p.setQuantidadeEmEstoque(-10);
        p.vender(20);
        p.exibirInformacoes();


        Aluno aluno = new Aluno("Pedro", "2025001");
        aluno.exibirStatus();
        aluno.setNota(8.5);
        aluno.exibirStatus();
        aluno.setNota(12);
        aluno.exibirStatus();
        aluno.setMatricula("2025002");
        aluno.exibirStatus();


        Retangulo retangulo = new Retangulo();
        retangulo.setLargura(5);
        retangulo.setAltura(3);
        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());
        retangulo.setLargura(-2);
        retangulo.setAltura(0);


        Livro livro = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
        livro.exibirDetalhes();
        livro.setAnoPublicacao(-2025);
    }
}
