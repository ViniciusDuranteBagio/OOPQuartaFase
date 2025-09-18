package Aula1.Atividade;

public class Main {
    public static void main(String[] args) {
        Monstro monstro1 = new Monstro();
        monstro1.nome = "Dragão";
        monstro1.vida = 152;
        System.out.println(monstro1.nome);
        monstro1.rugir();

        Jogador jogador1 = new Jogador();
        jogador1.nome = "Riftan";
        jogador1.nivel = 47;
        jogador1.pontuacao = 33;

        Jogador jogador2 = new Jogador();
        jogador2.nome = "Charlotte";
        jogador2.nivel = 62;
        jogador2.pontuacao = 74;
        jogador2.subirDeNivel();

        Inimigo inimigo1 = new Inimigo();
        inimigo1.nome = "Maeven";
        inimigo1.tipo = "Férica";
        inimigo1.forca = 1000;
        inimigo1.atacar();

        Arma arma1 = new Arma();
        arma1.nome = "Scalibur";
        arma1.dano = 54;
        arma1.Usar();

        Inventario inve = new Inventario();
        inve.adicionarItem("Espada");
        inve.adicionarItem("Escudo");
        inve.adicionarItem("Poção");

        inve.mostrarItens();

        Personagem pers1 = new Personagem();
        pers1.nome = "Aelin";
        pers1.nivel = 100;
        pers1.vida = 1000;
        pers1.mostratStatus();

        Lampada lampada = new Lampada();
        lampada.ligar();
        lampada.desligar();

        Usuario usua1 = new Usuario();
        usua1.nome = "Lara";
        usua1.senha = "AelinPatroa";
        usua1.verificarSenha(null);

        Jogo jogo1 = new Jogo();
        jogo1.aumentarPontuacao(100);
        jogo1.aumentarPontuacao(105);
        jogo1.aumentarPontuacao(32);

        Heroi heroi1 = new Heroi("Arthur", "Guerreiro");
        Heroi heroi2 = new Heroi("Merlin", "Mago");
        Heroi heroi3 = new Heroi("Legolas", "Arqueiro");

        heroi1.lutar();
        heroi2.lutar();
        heroi3.lutar();





    }
}
