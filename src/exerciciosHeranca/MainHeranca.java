public class MainHeranca {
    public static void main(String[] args) {

        AlunoHeranca alunoHeranca = new AlunoHeranca("Thiago", 19, 300);
        System.out.println(alunoHeranca.nome);
        System.out.println(alunoHeranca.idade);
        System.out.println(alunoHeranca.matricula);


        Carro carro1 = new Carro("Toyota", "Corolla", 4);
        Moto moto1 = new Moto("Honda", "CB500", 500);
        System.out.println(carro1.marca);
        System.out.println(carro1.modelo);
        System.out.println(carro1.qtdPortas);
        System.out.println(moto1.marca);
        System.out.println(moto1.modelo);
        System.out.println(moto1.cilindradas);


        Cachorro cachorro1 = new Cachorro("Bob", 15);
        cachorro1.dormir();
        cachorro1.latir();
        cachorro1.exibirInformacoes();
        cachorro1.brincar();


        Gerente gerente = new Gerente("Claudio", 1000, 20);
        gerente.aumentarSalario(30);
        System.out.println(gerente.salario);


        Eletronico eletronico = new Eletronico("Notebook", 3500, 12);
        eletronico.exibirDetalhes();


        ContaCorrente contaCorrente = new ContaCorrente("Pedro", 3000, 25);
        ContaPoupanca contaPoupanca= new ContaPoupanca("Eduardo", 5000, 0.5);
        contaCorrente.exibirDetalhes();
        contaPoupanca.exibirDetalhes();
    }
}

