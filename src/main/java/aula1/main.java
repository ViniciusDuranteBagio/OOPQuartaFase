package aula1;

static void main(String[] args) { System.out.println("=== EXERCÍCIOS DE POO ===\n");

    // 1. Criando um monstro e fazendo ele rugir
    System.out.println("1. TESTANDO A CLASSE MONSTRO:");
    mosntro monstro = new mosntro();
    monstro.nome = "Dragão";
    monstro.vida = 100;
    monstro.rugir();
    System.out.println();

    // 2. Criando dois jogadores e fazendo um subir de nível
    System.out.println("2. TESTANDO A CLASSE JOGADOR:");
    jogador jogador1 = new jogador();
    jogador1.nome = "João";
    jogador1.pontuacao = 1500;
    jogador1.nivel = 5;

    jogador jogador2 = new jogador();
    jogador2.nome = "Maria";
    jogador2.pontuacao = 2000;
    jogador2.nivel = 8;

    System.out.println("Jogador 1: " + jogador1.nome + " - Nível " + jogador1.nivel);
    System.out.println("Jogador 2: " + jogador2.nome + " - Nível " + jogador2.nivel);
    jogador1.subirDeNivel();
    System.out.println("Novo nível do " + jogador1.nome + ": " + jogador1.nivel);
    System.out.println();

    // 3. Criando um inimigo e fazendo ele atacar
    System.out.println("3. TESTANDO A CLASSE INIMIGO:");
    imimigo inimigo = new imimigo();
    inimigo.nome = "Goblin";
    inimigo.tipo = "Monstro";
    inimigo.forca = 25;
    inimigo.atacar();
    System.out.println();

    // 4. Criando uma arma e usando ela
    System.out.println("4. TESTANDO A CLASSE ARMA:");
    arma espada = new arma();
    espada.nome = "Espada de Fogo";
    espada.dano = 50;
    espada.usar();
    System.out.println();

    // 5. Testando o sistema de inventário
    System.out.println("5. TESTANDO O SISTEMA DE INVENTÁRIO:");
    Inventario inventario = new Inventario();
    inventario.adicionarItem("Poção de Vida");
    inventario.adicionarItem("Espada");
    inventario.adicionarItem("Escudo");
    inventario.mostrarItens();
    System.out.println();

    // 6. Criando um personagem e mostrando seu status
    System.out.println("6. TESTANDO A CLASSE PERSONAGEM:");
    Personagem personagem = new Personagem();
    personagem.nome = "Aragorn";
    personagem.vida = 200;
    personagem.nivel = 15;
    personagem.mostrarStatus();
    System.out.println();
    // 7. Testando o sistema de energia (lâmpada)
    System.out.println("7. TESTANDO O SISTEMA DE ENERGIA:");
    Lampada lampada = new Lampada();
    lampada.ligar();
    lampada.ligar(); // Tentando ligar novamente
    lampada.desligar();
    lampada.desligar(); // Tentando desligar novamente
    System.out.println();

    // 8. Testando o sistema de login
    System.out.println("8. TESTANDO O SISTEMA DE LOGIN:");
    Usuario usuario = new Usuario();
    usuario.nome = "admin";
    usuario.senha = "123456";
    System.out.println("Verificando senha '123456': " + usuario.verificarSenha("123456"));
    System.out.println("Verificando senha 'senhaerrada': " + usuario.verificarSenha("senhaerrada"));
    System.out.println();

    // 9. Testando o sistema de pontuação
    System.out.println("9. TESTANDO O SISTEMA DE PONTUAÇÃO:");
    jogo jogo = new jogo();
    jogo.aumentarPontuacao(100);
    jogo.aumentarPontuacao(250);
    jogo.aumentarPontuacao(75);
    System.out.println("Pontuação final: " + jogo.pontuacao);
    System.out.println();

    // 10. Testando o sistema de personagens jogáveis
    System.out.println("10. TESTANDO O SISTEMA DE PERSONAGENS JOGÁVEIS:");
    Heroi heroi1 = new Heroi();
    heroi1.nome = "Gandalf";
    heroi1.classe = "Mago";

    Heroi heroi2 = new Heroi();
    heroi2.nome = "Legolas";
    heroi2.classe = "Arqueiro";

    Heroi heroi3 = new Heroi();
    heroi3.nome = "Gimli";
    heroi3.classe = "Guerreiro";
}
