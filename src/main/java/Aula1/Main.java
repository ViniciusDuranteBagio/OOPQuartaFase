package Aula1;

public class Main {
    public static void main(String[] args) {

        System.out.println("Classe monstro");
        Monstro monstro = new Monstro();
        monstro.nome = "Roars";
        monstro.vida = 15;
        monstro.rugir();

        System.out.println("\nClasse Jogador");
        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();
        jogador1.nome = "Luke";
        jogador1.nivel = 1;
        jogador1.pontuacao = 0;
        jogador2.nome = "Mark";
        jogador2.nivel = 1;
        jogador2.pontuacao = 0;
        jogador2.subirNivel();

        System.out.println("\nClasse Inimigo");
        Inimigo inimigo = new Inimigo();
        inimigo.nome = "Moriah";
        inimigo.tipo = "Yonkou";
        inimigo.forca = 20;
        inimigo.atacar();

        System.out.println("\nClasse Arma");
        Arma arma = new Arma();
        arma.nome = "Bazooka";
        arma.dano = 6000;
        arma.usar();

        System.out.println("\nClasse inventario");
        Inventario inventario = new Inventario();
        inventario.adicionarItem("Espada de fogo");
        inventario.adicionarItem("Espada de gelo");
        inventario.adicionarItem("Espada de diamante");
        inventario.mostrarItens();


        System.out.println("\nClasse Personagem");
        Personagem personagem = new Personagem();
        personagem.nome = "Luffy";
        personagem.vida = 5000;
        personagem.nivel = 100000;
        personagem.mostrarStatus();

        System.out.println("\nClasse Lampada");
        Lampada lampada = new Lampada();
        lampada.acender();
        lampada.apagar();

        System.out.println("\nClasse Usuario");
        Usuario usuario = new Usuario();
        usuario.nome = "Nicolas";
        usuario.senha = "123";
        usuario.verificarSenha("12");
        usuario.verificarSenha("123");

        System.out.println("\nClasse Jogo");
        Jogo jogo = new Jogo();
        jogo.aumentarPontuacao(1);
        jogo.aumentarPontuacao(2);
        jogo.aumentarPontuacao(3);

        System.out.println("\nClasse heroi");
        Heroi heroi1 = new Heroi();
        Heroi heroi2 = new Heroi();
        Heroi heroi3 = new Heroi();
        heroi1.nome = "Nico";
        heroi2.nome = "Luke";
        heroi3.nome = "Mark";
        heroi1.classe = "Arqueiro";
        heroi2.classe = "Cavaleiro";
        heroi3.classe = "Mago";
        heroi1.lutar();
        heroi2.lutar();
        heroi3.lutar();


    }
}
