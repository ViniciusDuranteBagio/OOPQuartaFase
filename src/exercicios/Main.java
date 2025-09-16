package exercicios;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== EXERCICIO 1 =====");
        Monstro m = new Monstro("Dragão", 100);
        m.rugir();

        System.out.println("\n===== EXERCICIO 2 =====");
        Jogador j1 = new Jogador("Carlos", 0, 1);
        Jogador j2 = new Jogador("Lucas", 10, 2);
        j1.subirDeNivel();
        j2.subirDeNivel();

        System.out.println("\n===== EXERCICIO 3 =====");
        Inimigo inimigo = new Inimigo("Goblin", "Terrestre", 15);
        inimigo.atacar();

        System.out.println("\n===== EXERCICIO 4 =====");
        Arma espada = new Arma("Espada Lendária", 50);
        espada.usar();

        System.out.println("\n===== EXERCICIO 5 =====");
        Inventario inv = new Inventario();
        inv.adicionarItem("Poção de Cura");
        inv.adicionarItem("Escudo");
        inv.adicionarItem("Espada");
        inv.mostrarItens();

        System.out.println("\n===== EXERCICIO 6 =====");
        Personagem pers = new Personagem("Aventureiro", 100, 1);
        pers.mostrarStatus();

        System.out.println("\n===== EXERCICIO 7 =====");
        Lampada lamp = new Lampada();
        lamp.ligar();
        lamp.desligar();

        System.out.println("\n===== EXERCICIO 8 =====");
        Usuario user = new Usuario("Eduardo", "1234");
        System.out.println("Senha correta? " + user.verificarSenha("1234"));
        System.out.println("Senha incorreta? " + user.verificarSenha("0000"));

        System.out.println("\n===== EXERCICIO 9 =====");
        Jogo game = new Jogo();
        game.aumentarPontuacao(10);
        game.aumentarPontuacao(20);
        game.aumentarPontuacao(30);
        game.exibirPontuacao();

        System.out.println("\n===== EXERCICIO 10 =====");
        Heroi h1 = new Heroi("Arthur", "Guerreiro");
        Heroi h2 = new Heroi("Merlin", "Mago");
        Heroi h3 = new Heroi("Robin", "Arqueiro");
        h1.lutar();
        h2.lutar();
        h3.lutar();

        System.out.println("\n===== EXERCICIO 11 =====");
        ContaBancaria conta = new ContaBancaria("12345", "Maria", 500);
        conta.depositar(200);
        conta.sacar(100);
        conta.exibirSaldo();

        System.out.println("\n===== EXERCICIO 12 =====");
        Pessoa p1 = new Pessoa("Ana", 20, "111.111.111-11");
        Pessoa p2 = new Pessoa("Carlos", 25);
        Pessoa p3 = new Pessoa();
        p1.exibirInformacoes();
        p2.exibirInformacoes();
        p3.exibirInformacoes();

        System.out.println("\n===== EXERCICIO 13 =====");
        Produto prod = new Produto("Notebook", 2500, 5);
        prod.vender(2);
        prod.adicionarEstoque(3);
        prod.vender(10);

        System.out.println("\n===== EXERCICIO 14 =====");
        Aluno aluno = new Aluno("Fernanda", "2025A");
        aluno.setNota(9);
        aluno.exibirStatus();

        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 256);
        System.out.println("Exercício Livro: " + livro);

        System.out.println("\n===== EXERCICIO 15 =====");
        Retangulo ret = new Retangulo(5, 10);
        System.out.println("Área: " + ret.calcularArea());
        System.out.println("Perímetro: " + ret.calcularPerimetro());

        System.out.println("\n===== EXERCICIO 16 =====");
        exercicios16.Exercicio16.main(null);

        System.out.println("\n===== EXERCICIO 17 =====");
        exercicios16.Exercicio17.main(null);

        System.out.println("\n===== EXERCICIO 18 =====");
        exercicios16.Exercicio18.main(null);

        System.out.println("\n===== EXERCICIO 19 =====");
        exercicios16.Exercicio19.main(null);

        System.out.println("\n===== EXERCICIO 20 =====");
        exercicios16.Exercicio20.main(null);
    }
}
