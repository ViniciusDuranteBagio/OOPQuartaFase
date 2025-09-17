package exercicios;

public class Main {
    public static void main(String[] args) {
/*        Monstro m = new Monstro("Dragão", 100);
        m.rugir();

*//*        Jogador j1 = new Jogador("Carlos", 0, 1);
        Jogador j2 = new Jogador("Lucas", 10, 2);
        j1.subirDeNivel();
        j2.subirDeNivel();

*//*        Inimigo inimigo = new Inimigo("Goblin", "Terrestre", 15);
        inimigo.atacar();

        Arma espada = new Arma("Espada Lendária", 50);
        espada.usar();
*//*
        Inventario inv = new Inventario();
        inv.adicionarItem("Poção de Cura");
        inv.adicionarItem("Escudo");
        inv.adicionarItem("Espada");
        inv.mostrarItens();
*//*
        Personagem pers = new Personagem("Aventureiro", 100, 1);
        pers.mostrarStatus();

*//*           Lampada lamp = new Lampada();
        lamp.ligar();
        lamp.desligar();

*//*           Usuario user = new Usuario("Eduardo", "1234");
        System.out.println("Senha correta? " + user.verificarSenha("1234"));
        System.out.println("Senha incorreta? " + user.verificarSenha("0000"));

*//*           Jogo game = new Jogo();
        game.aumentarPontuacao(10);
        game.aumentarPontuacao(20);
        game.aumentarPontuacao(30);
        game.exibirPontuacao();

*//*           Heroi h1 = new Heroi("Arthur", "Guerreiro");
        Heroi h2 = new Heroi("Merlin", "Mago");
        Heroi h3 = new Heroi("Robin", "Arqueiro");
        h1.lutar();
        h2.lutar();
        h3.lutar();

*//*           ContaBancaria conta = new ContaBancaria("12345", "Maria", 500);
        conta.depositar(200);
        conta.sacar(100);
        conta.exibirSaldo();

*//*           Pessoa p1 = new Pessoa("Ana", 20, "111.111.111-11");
        Pessoa p2 = new Pessoa("Carlos", 25);
        Pessoa p3 = new Pessoa();
        p1.exibirInformacoes();
        p2.exibirInformacoes();
        p3.exibirInformacoes();

*//*           Produto prod = new Produto("Notebook", 2500, 5);
        prod.vender(2);
        prod.adicionarEstoque(3);
        prod.vender(10);

*//*           Aluno aluno = new Aluno("Fernanda", "2025A");
        aluno.setNota(9);
        aluno.exibirStatus();

        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 256);
        System.out.println("Exercício Livro: " + livro);

*//*           Retangulo ret = new Retangulo(5, 10);
        System.out.println("Área: " + ret.calcularArea());
        System.out.println("Perímetro: " + ret.calcularPerimetro());

*//*  Aluno2 aluno = new Aluno2();
        aluno2.nome = "João Silva";
        aluno2.idade = 20;
        aluno2.matricula = "2024001";

        System.out.println("Nome: " + aluno2.nome);
        System.out.println("Idade: " + aluno2.idade);
        System.out.println("Matrícula: " + aluno2.matricula);
        *//*


        Aluno2 aluno2 = new Aluno2("Maria Santos", 22, "2024002");

        System.out.println("Nome: " + aluno2.nome);
        System.out.println("Idade: " + aluno2.idade);
        System.out.println("Matrícula: " + aluno2.matricula);

*//*
        Carro2 carro2 = new Carro2("Ford", "Fiesta", 4);
        Moto moto = new Moto("Honda", "CB500", 500);

        carro2.exibirDetalhes();
        moto.exibirDetalhes();

*//*



        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Rex";
        cachorro.idade = 3;

        cachorro.exibirInformacoes();
        cachorro.dormir();
        cachorro.latir();
        cachorro.brincar();



*//*


        Eletronico eletronico = new Eletronico();
        eletronico.nome = "Smartphone";
        eletronico.preco = 1500;
        eletronico.garantiaEmMeses = 12;

        eletronico.exibirDetalhes();

*//*
        Carro2 carro2 = new Carro2();
        carro2.placa = "ABC1234";
        carro2.modelo = "Sedan";

        Moto2 moto2 = new Moto2();
        moto2.placa = "XYZ5678";
        moto2.modelo = "Esportiva";

        Caminhao caminhao = new Caminhao();
        caminhao.placa = "DEF9012";
        caminhao.modelo = "Carga";

        carro2.ligarMotor();
        System.out.println("Carro - Consumo: " + carro.calcularConsumo() + " km/l");

        moto2.ligarMotor();
        System.out.println("Moto - Consumo: " + moto.calcularConsumo() + " km/l");

        caminhao.ligarMotor();
        System.out.println("Caminhão - Consumo: " + caminhao.calcularConsumo() + " km/l");
*//*

        Livro2 livro2 = new Livro2();
        livro2.nome = "Java Programming";
        livro2.preco = 89.90;

        Eletronico2 eletronico2 = new Eletronico2();
        eletronico2.nome = "Smartphone";
        eletronico2.preco = 1200.00;

        Roupas roupa = new Roupas();
        roupa.nome = "Camiseta";
        roupa.preco = 49.90;

        livro2.exibirResumo();
        System.out.println();
        eletronico2.exibirResumo();
        System.out.println();
        roupa.exibirResumo();
*//*

        Gerente2 gerente2 = new Gerente2();
        gerente2.nome = "Carlos Silva";
        gerente2.salarioBase = 5000;

        Desenvolvedor dev = new Desenvolvedor();
        dev.nome = "Ana Santos";
        dev.salarioBase = 4000;

        Estagiario estagiario = new Estagiario();
        estagiario.nome = "Pedro Oliveira";
        estagiario.salarioBase = 1500;

        gerente2.exibirDados();
        System.out.println();
        dev.exibirDados();
        System.out.println();
        estagiario.exibirDados();

*//*
        FormaPagamento cartao = new Cartao();
        FormaPagamento boleto = new Boleto();
        FormaPagamento pix = new Pix();

        cartao.processarPagamento(150.50);
        boleto.processarPagamento(200.75);
        pix.processarPagamento(99.90);

*//*
        Validador cpfValidador = new ValidadorCPF();
        Validador emailValidador = new ValidadorEmail();
        Validador cnpjValidador = new ValidadorCNPJ();

        System.out.println("CPF válido: " + cpfValidador.validar("12345678901"));
        System.out.println("Email válido: " + emailValidador.validar("teste@email.com"));
        System.out.println("CNPJ válido: " + cnpjValidador.validar("12345678000199"));

        */
    }
}