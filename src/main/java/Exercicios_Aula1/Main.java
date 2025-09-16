package Exercicios_Aula1;

public class Main {
    public static void main(String[] args) {

        Monstro monstro = new Monstro();

        monstro.nome = "Mike Wazowski";
        monstro.vida = 100;

        monstro.rugir();

        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();

        jogador1.nome = "Tiago";
        jogador2.nome = "Robertinho";

        jogador1.nivel = 10;
        jogador2.nivel = 5;

        jogador1.pontuacao = 200;
        jogador2.pontuacao = 0.1;

        jogador1.subirDeNivel();
        jogador2.subirDeNivel();

        Inimigo inimigo = new Inimigo();

        inimigo.nome = "Jotape";
        inimigo.tipo = "Fraquinho";
        inimigo.forca = 1;

        inimigo.atacar();

        Arma arma = new Arma();

        arma.nome = "Pistola";
        arma.dano = 25;

        arma.usar();

        Inventario inventario = new Inventario();

        inventario.adicionarItem("Faca");
        inventario.adicionarItem("Videogame");
        inventario.adicionarItem("Bola");

        inventario.mostrarItens();

        Personagem personagem = new Personagem();

        personagem.nome = "Deadpool";
        personagem.vida = 9999;
        personagem.nivel = 1000;

        personagem.mostrarStatus();

        Lampada lampada = new Lampada();

        lampada.ligar();
        lampada.desligar();
        lampada.desligar();
        lampada.ligar();
        lampada.ligar();
        lampada.desligar();

        Usuario usuario = new Usuario();

        usuario.nome = "Tiago";
        usuario.senha = "Tiago1234";

        usuario.verificarSenha("Tigas1234");
        usuario.verificarSenha("Tiago1234");

        Jogo jogo = new Jogo();

        jogo.aumentarPontos(15);
        jogo.aumentarPontos(10);
        jogo.aumentarPontos(5);
        jogo.aumentarPontos(-15);

        jogo.exibirPontuacao();

        Heroi superman = new Heroi("Superman", "Super-Herói");
        Heroi batman = new Heroi("Batman", "Justiceiro");
        Heroi flash = new Heroi("Flash", "Velocista");

        superman.lutar();
        batman.lutar();
        flash.lutar();


    }
}
