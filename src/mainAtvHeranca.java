package org.example;

public class mainAtvHeranca {
    public static void main(String[] args) {
        Aluno1 aluno2 = new Aluno1();
        pessoaHeranca aluno1 = new pessoaHeranca();
        veiculo veiculo1 = new veiculo();
        moto moto1 = new moto();
        carro carro1 = new carro();
        cachorro cachorro1 = new cachorro();
        gerente gerente1 = new gerente();
        eletronico eletronico1 = new eletronico();
        contaCorrente contaCorrente1 = new contaCorrente();
        contaPoupanca contaPoupanca1 = new contaPoupanca();
        guerreiro guerreiro1 = new guerreiro();
        mago mago1 = new mago();
        loja loja1 = new loja();

        aluno1.idade = 20;
        aluno1.nome = "Geovanna";

        aluno2.matricula = 11111;
        aluno2.idade = 20;
        aluno2.nome = "davi";

        carro1.marca = "totoya";
        carro1.modelo = "vovorola";
        carro1.quantidadeDePortas = 4;

        moto1.marca = "kawazuki";
        moto1.modelo = "1000";
        moto1.cilindrada = 500;

        cachorro1.nome = "mutley";
        cachorro1.idade = 10;
        cachorro1.metodoDormir();
        cachorro1.metodoLatir();

        gerente1.nome= "Caua";
        gerente1.salario = 7000;
        gerente1.departamento = "TI";

        eletronico1.nome = "pc";
        eletronico1.preco = 5100;
        eletronico1.garantiaEmMeses = 12;

        contaCorrente1.saldo = 1000;
        contaCorrente1.titular = "gustavo";
        contaCorrente1.taxaManutençao = 15;

        contaPoupanca1.saldo = 1200;
        contaPoupanca1.titular = "guilherme";
        contaPoupanca1.taxaJuros = 2;

        guerreiro1.nome = "berserk";
        guerreiro1.nivel = 10;
        guerreiro1.forca = 150;

        mago1.nome = "Mestre dos Magos";
        mago1.nivel = 15;
        mago1.mana = 10000;

        loja1.nome = "havan";
        loja1.cidade = "criciuma";
        loja1.tipoDeProduto = "ferramentas makita";


        System.out.println(aluno1.idade);
        System.out.println(aluno1.nome);

        System.out.println(aluno2.matricula);
        System.out.println(aluno2.idade);
        System.out.println(aluno2.nome);

        System.out.println(carro1.marca);
        System.out.println(carro1.modelo);
        System.out.println(carro1.quantidadeDePortas);

        System.out.println(moto1.marca);
        System.out.println(moto1.modelo);
        System.out.println(moto1.cilindrada);

        System.out.println(cachorro1.nome + "" + "" + cachorro1.idade);
        cachorro1.metodoDormir();
        cachorro1.metodoLatir();

        System.out.println(gerente1.nome);
        System.out.println(gerente1.salario);
        System.out.println(gerente1.departamento);
        gerente1.aumentarSalario(15);

        eletronico1.exibirDetalhes();
        System.out.println(eletronico1.garantiaEmMeses);

        System.out.println(contaCorrente1.saldo);
        System.out.println(contaCorrente1.titular);
        System.out.println(contaCorrente1.taxaManutençao);

        System.out.println(contaPoupanca1.saldo);
        System.out.println(contaPoupanca1.titular);
        System.out.println(contaPoupanca1.taxaJuros);

        System.out.println(guerreiro1.nome);
        System.out.println(guerreiro1.nivel);
        System.out.println(guerreiro1.forca);

        System.out.println(mago1.nome);
        System.out.println(mago1.nivel);
        System.out.println(mago1.mana);

        System.out.println(loja1.nome);
        System.out.println(loja1.cidade);
        System.out.println(loja1.tipoDeProduto);
   }
}
