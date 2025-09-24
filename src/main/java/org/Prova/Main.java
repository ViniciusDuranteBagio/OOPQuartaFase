package org.Prova;

public class Main {
    public static void main(String[] args) {
        //Questão01
        Carro meuCarro = new Carro();

        meuCarro.setMarca("Ford");
        meuCarro.setAno(2012);

        meuCarro.exibirDados();

        //------------------------
        //Questão02
        Pessoa p1 = new Pessoa();

        p1.setNome("Gabriel");
        p1.setIdade(22);

        p1.apresentar();

        //------------------------
        //Questão03
        Produto produto = new Produto();
        produto.setNome("Calção");
        produto.setPreco(59.90);

        Produto p2 = new Produto();
        p2.setNome("Meia");
        p2.setPreco(15.50);

        System.out.println("--- Produto 1 ---");
        produto.exibirDados();

        System.out.println("\n--- Produto 2 ---");
        p2.exibirDados();

        //------------------------
        //Questão04
        ContaBancaria conta = new ContaBancaria();
        conta.setTitular("Baggio");
        conta.setSaldo(100);

        conta.exibirDados();
        conta.depositar(50);

        conta.sacar(80);

        conta.sacar(5000);

        conta.exibirDados();

        //------------------------
        //Questão05
        Animal a = new Animal();

        a.setNome("Tob");
        a.setIdade(5);
        a.metodoSom();

        //Questão06
        Pessoa1 p = new Pessoa1();
        p.setNome("Carlos");
        p.setIdade(40);
        p.apresentar();
/*
        System.out.println("------------------------");

        /*Aluno b = new Aluno();
        b.setNome("Ana");
        b.setIdade(20);
        b.setMatricula("2025A123");
        b.apresentar();

        //------------------------
        //Questão07
        Cachorro c = new Cachorro();
        c.setNome("Tob");
        c.setIdade(5);
        c.fazerSom();

        System.out.println("------------------");

        Gato g = new Gato();
        g.setNome("Fenix");
        g.setIdade(5);
        g.fazerSom();

        //------------------------
        //Questão08
        Professora prof = new Professora();
        prof.setNome("Zanini");
        prof.setIdade(50);
        prof.setDisciplina("Camaro");

        prof.apresentar();

        //------------------------
        //Questão09
        Funcionario f = new Funcionario();
        f.setNome("Carlos");
        f.setSalario(3000);
        System.out.println(f.getNome() + " recebeu bônus de R$" + f.calcularBonus());

        System.out.println("-------------------");

        Gerente g = new Gerente();
        g.setNome("Ana");
        g.setSalario(5000);
        System.out.println(g.getNome() + " recebeu bônus de R$" + g.calcularBonus());
    }
}
}]



 /*/}}