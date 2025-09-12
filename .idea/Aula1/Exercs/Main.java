package Exercs;

public class Main {
    public static void main(String[] args) {
        Monstro monstro1 = new Monstro();
        monstro1.nome = "Bicho-Papao";
        monstro1.vida = 100;
        monstro1.rugir();

        Jogador jogador1 = new Jogador();
        jogador1.nomeJogador = "Kratos";
        jogador1.pontuacao = 20;
        jogador1.nivel = 1;
        Jogador jogador2 = new Jogador();
        jogador2.nomeJogador = "Mario";
        jogador2.pontuacao = 20;
        jogador2.nivel = 1;
        jogador2.subirDeNivel();
        jogador2.subirDeNivel();

        Inimigo inimigo1 = new Inimigo();
        inimigo1.nomeInimigo = "Zeus";
        inimigo1.tipoIimigo = "Deus";
        inimigo1.forcaInimigo = 100;
        inimigo1.usarAtaque();

        Arma arma1 = new Arma();
        arma1.nomeArma = "AK-47";
        arma1.danoArma = 150;
        arma1.usarArma();

        Inventario inventario1 = new Inventario();
        inventario1.addItens("Espada");
        inventario1.addItens("Escudo");
        inventario1.mostrarItens();

        Personagem personagem1 = new Personagem();
        personagem1.nomePersonagem = "Jonas";
        personagem1.nivelPersonagem = 7;
        personagem1.vidaPersonagem = 150;
        personagem1.mostarStatus();

        Lampada lampada1 = new Lampada();
        lampada1.ligar();
        lampada1.desligada();

        Usuario user1 = new Usuario();
        user1.nomeUser = "Jonas";
        user1.senhaUser = "1234";
        user1.verificarSenha("1234");

        Jogo jogo1 = new Jogo();
        jogo1.pontuacao = 0;
        jogo1.aumentarPontuacao(2);
        jogo1.aumentarPontuacao(3);
        jogo1.aumentarPontuacao(4);

        Heroi heroi1 = new Heroi();
        heroi1.nomeHeroi = "Kratos";
        heroi1.classeHeroi = "Guerreiro";
        heroi1.lutar();
        heroi1.nomeHeroi = "Doutor Estranho";
        heroi1.classeHeroi = "Mago";
        heroi1.lutar();
        heroi1.nomeHeroi = "Gavião Arqueiro";
        heroi1.classeHeroi = "Arqueiro";
        heroi1.lutar();
    }
}
