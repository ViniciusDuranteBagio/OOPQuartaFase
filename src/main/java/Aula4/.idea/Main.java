package Aula4;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Jonas";
        pessoa1.idade = 20;
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Maria";
        aluno1.idade = 21;
        aluno1.matricula = 2030;
        System.out.println("Nome: " + pessoa1.nome + "\nIdade: " + pessoa1.idade);
        System.out.println("Nome: " + aluno1.nome + "\nIdade: " + aluno1.idade + "\nMatricula: " + aluno1.matricula);
        System.out.println("-------------------------------------------");
        /*Pessoa pessoa1 = new Pessoa("Jonas", 20);
        Aluno aluno1 = new Aluno("Maria", 15, 2030);
        pessoa1.exibirInfos();
        aluno1.exibirInfos();*/
        Carro carro1 = new Carro();
        Moto moto1 = new Moto();
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.quantidadeDePortas = 4;
        moto1.marca = "Honda";
        moto1.modelo = "Biz";
        moto1.cilindrada = 100;
        System.out.println("Marca: " + carro1.marca + "\nModelo: " + carro1.modelo +
                "\nQuantidade de portas: " + carro1.quantidadeDePortas);
        System.out.println("Marca: " + moto1.marca + "\nModelo: " + moto1.modelo + "\nCilindrada: " + moto1.cilindrada);
        System.out.println("-------------------------------------------");

        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Rex";
        cachorro1.idade = 4;
        cachorro1.exibirInforamacoes();
        cachorro1.dormir();
        cachorro1.latir();
        cachorro1.brincar();
        System.out.println("-------------------------------------------");

        Gerente gerente1 = new Gerente();
        gerente1.nome = "Alberto";
        gerente1.salario = 7000;
        gerente1.departamento = "Logística";
        System.out.println("Gerente: " + gerente1.nome + "\nSalário: " + gerente1.salario +
                "\nDepartamento: "+ gerente1.departamento);
        gerente1.aumentarSalario(10);
        System.out.println("Salário após aumento: " + gerente1);
        System.out.println("-------------------------------------------");

        Eletronico eletronico1 = new Eletronico();
        eletronico1.nome = "Redmi note 10s";
        eletronico1.preco = 1000;
        eletronico1.garantiaEmMeses = 12;
        eletronico1.exibirDetalhes();
        System.out.println("-------------------------------------------");

        ContaCorrente contaCorrente1 = new ContaCorrente();
        ContaPoupanca contaPoupanca1 = new ContaPoupanca();
        contaCorrente1.titular = "Jonas";
        contaCorrente1.saldo = 160;
        contaCorrente1.taxaManutencao = 40;
        contaPoupanca1.titular = "Maria";
        contaPoupanca1.saldo = 500;
        contaPoupanca1.taxaJuros = 0.5;
        System.out.println("Titular: "+contaCorrente1.titular + "\nSaldo: " + contaCorrente1.saldo
                + "\nTaxa de manutenção: " + contaCorrente1.taxaManutencao);
        System.out.println("Titular: "+contaPoupanca1.titular + "\nSaldo: " + contaPoupanca1.saldo
                + "\nTaxa de manutenção: " + contaPoupanca1.taxaJuros);
        System.out.println("-------------------------------------------");

        Guerreiro guerreiro1 = new Guerreiro();
        Mago mago1 = new Mago();
        guerreiro1.nome = "Kratos";
        guerreiro1.nivel = 100;
        guerreiro1.forca = 1000;
        mago1.nome = "Merlin";
        mago1.nivel = 100;
        mago1.mana = 1000;
        System.out.println("Nome herói: " + guerreiro1.nome + "\nNível: " + guerreiro1.nivel + "\nForça: " + guerreiro1.forca);
        System.out.println("Nome herói: " + mago1.nome + "\nNível: " + mago1.nivel + "\nForça: " + mago1.mana);
        System.out.println("-------------------------------------------");

        Loja loja1 = new Loja("Eletrojo","Braço do Norte","Elétricos");
        System.out.println("Loja: " + loja1.nome+ "\nCidade: " + loja1.cidade + "\nTipo de produto: " + loja1.tipoDeProduto);



    }
}
