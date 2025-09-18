package ExerciciosAula1;

public class Main {

    public static void main(String[] args) {

        System.out.println("### Executando todos os exercícios em sequência ###\n");

        // --- Exercício 1: Criando uma classe Monstro ---
        System.out.println("--- Exercício 1: Monstro ---");
        Monstro ogro = new Monstro();
        ogro.nome = "Ogro";
        ogro.vida = 100;
        ogro.rugir();
        System.out.println("========================================\n");

        // --- Exercício 2: Criando uma classe Jogador ---
        System.out.println("--- Exercício 2: Jogador ---");
        Jogador jogador1 = new Jogador();
        jogador1.nome = "Arthur";
        jogador1.pontuacao = 1500;
        jogador1.nivel = 5;
        Jogador jogador2 = new Jogador();
        jogador2.nome = "Beatriz";
        jogador2.pontuacao = 2200;
        jogador2.nivel = 7;
        jogador1.subirDeNivel();
        System.out.println("========================================\n");

        // --- Exercício 3: Criando uma classe Inimigo ---
        System.out.println("--- Exercício 3: Inimigo ---");
        Inimigo goblin = new Inimigo();
        goblin.nome = "Goblin Verde";
        goblin.tipo = "Comum";
        goblin.forca = 15;
        goblin.atacar();
        System.out.println("========================================\n");

        // --- Exercício 4: Criando uma classe Arma ---
        System.out.println("--- Exercício 4: Arma ---");
        Arma espadaLonga = new Arma();
        espadaLonga.nome = "Espada Longa de Ferro";
        espadaLonga.dano = 25;
        espadaLonga.usar();
        System.out.println("========================================\n");

        // --- Exercício 5: Criando um sistema de inventário ---
        System.out.println("--- Exercício 5: Inventário ---");
        Inventario mochila = new Inventario();
        mochila.adicionarItem("Poção de Cura");
        mochila.adicionarItem("Espada Curta");
        mochila.adicionarItem("Escudo de Madeira");
        mochila.mostrarItens();
        System.out.println("========================================\n");

        // --- Exercício 6: Criando um personagem com classe e objeto ---
        System.out.println("--- Exercício 6: Personagem ---");
        Personagem heroiPrincipal = new Personagem();
        heroiPrincipal.nome = "Galahad";
        heroiPrincipal.vida = 150;
        heroiPrincipal.nivel = 10;
        heroiPrincipal.mostrarStatus();
        System.out.println("========================================\n");

        // --- Exercício 7: Criando um sistema de energia ---
        System.out.println("--- Exercício 7: Lâmpada ---");
        Lampada lampadaDaSala = new Lampada();
        lampadaDaSala.ligar();
        lampadaDaSala.desligar();
        System.out.println("========================================\n");

        // --- Exercício 8: Criando um sistema de login ---
        System.out.println("--- Exercício 8: Usuário e Login ---");
        Usuario usuario = new Usuario("admin", "senha123");
        System.out.print("Testando senha 'senhaErrada': ");
        usuario.verificarSenha("senhaErrada");
        System.out.print("Testando senha 'senha123': ");
        usuario.verificarSenha("senha123");
        System.out.println("========================================\n");

        // --- Exercício 9: Criando um sistema de pontuação ---
        System.out.println("--- Exercício 9: Jogo e Pontuação ---");
        Jogo meuJogo = new Jogo();
        meuJogo.aumentarPontuacao(100);
        meuJogo.aumentarPontuacao(50);
        meuJogo.aumentarPontuacao(250);
        System.out.println("========================================\n");

        // --- Exercício 10: Criando um sistema de personagens jogáveis ---
        System.out.println("--- Exercício 10: Heróis ---");
        Heroi heroiA = new Heroi();
        heroiA.nome = "Aragorn";
        heroiA.classe = "Guerreiro";
        Heroi heroiB = new Heroi();
        heroiB.nome = "Gandalf";
        heroiB.classe = "Mago";
        Heroi heroiC = new Heroi();
        heroiC.nome = "Legolas";
        heroiC.classe = "Arqueiro";
        heroiA.lutar();
        heroiB.lutar();
        heroiC.lutar();
        System.out.println("========================================\n");
    }
}