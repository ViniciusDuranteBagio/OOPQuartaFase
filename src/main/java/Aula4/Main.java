package Aula4;

public class Main {
    public static void main(String[] args) {
//        Usuario user = new Usuario("Tiago", "tiago212005@gmail.com");
//        Administrador admin = new Administrador("Odair", "odairghuizoni@g3automation.com.br");
//        Moderador mod = new Moderador("Marivaldo", "marivaldomendes@g3automation.com.br");
//
//        user.acessarSistema();
//        admin.acessarSistema();
//        admin.gerenciarUsuarios();
//        mod.acessarSistema();
//        mod.moderarConteudo();

//        Aluno aluno = new Aluno("Bruno", 22, 12345);
//
//        aluno.imprimeValor();
//
//        Carro carro = new Carro("Hyundai", "HB20", 4);
//        Moto moto = new Moto("Kawasaki", "Ninja", 650 );
//
//        carro.imprimeDadosVeiculo();
//        moto.imprimeDadosVeiculo();

//        Cachorro cachorro = new Cachorro("Thor", 10);
//
//        cachorro.dormir();
//        cachorro.latir();
//        cachorro.exibirInformacoes();
//        cachorro.brincar();

//        Gerente gerente = new Gerente("Tiago", 1000, "RH");
//
//        gerente.aumentarSalario(15);

//        Eletronico eletronico = new Eletronico("Air Pods", 1500.00, 12);
//
//        eletronico.exibirDetalhes();

        ContaCorrente cc = new ContaCorrente("Tiago", 8000, 25);
        ContaPoupanca cp = new ContaPoupanca("Bruno", 7500, 15);

        cc.exibeDetalhes();
        cp.exibeDetalhes();

    }
}
