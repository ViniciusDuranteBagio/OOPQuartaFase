package org.example.aula01;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Maria";
        pessoa1.Falar();

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "John";
        pessoa2.Falar();
        System.out.println("----------------------------");

        Monstro monstro = new Monstro();
        monstro.rugir();
        System.out.println("----------------------------");

        Jogador jogador1 = new Jogador();
        jogador1.nomeJogador = "Caio";
        jogador1.subirDeNivel();
        jogador1.subirDeNivel();
        System.out.println("----------------------------");

        Inimigo inimigo = new Inimigo();
        inimigo.nomeInimigo = "Victor";
        inimigo.atacar();
        System.out.println("----------------------------");

        Arma arma = new Arma();
        arma.usar();
        System.out.println("----------------------------");

        Inventario inventario = new Inventario();
        inventario.adiconarItem("Roupa");
        inventario.adiconarItem("Chave");
        inventario.mostrarLista();
        System.out.println("----------------------------");

        Personagem personagem = new Personagem();
        personagem.nome = "Cris";
        personagem.idade = 88;
        personagem.nivel = 99;
        personagem.mostrarStatus();
        System.out.println("----------------------------");

        Lampada lampada = new Lampada();
        lampada.ligar();
        System.out.println("----------------------------");

        Usuario usuario = new Usuario();
        usuario.nome = "Hillary";
        usuario.verificarSenha("1234");
        usuario.verificarSenha("12");
        System.out.println("----------------------------");

        Jogo jogo1 = new Jogo();
        jogo1.aumentarPontuacao(3);
        jogo1.aumentarPontuacao(5);
        jogo1.aumentarPontuacao(10);
        System.out.println("----------------------------");

        Heroi heroi1 = new Heroi();
        heroi1.nome = "Kick Butwoski";
        heroi1.lutar();
        Heroi heroi2 = new Heroi();
        heroi2.nome = "SuperShock";
        heroi2.lutar();
        Heroi heroi3 = new Heroi();
        heroi3.nome = "Deadpool";
        heroi3.lutar();
        System.out.println("----------------------------");
    }
}