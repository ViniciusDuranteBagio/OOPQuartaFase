package introducao;

public class main {
    public static void main(String[] args) {

        /*
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "maria";
        pessoa1.falar();

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "joao";
        pessoa2.falar();
        */


        /*atividades*/

        monstro monstro = new monstro();
        monstro.nome = "shreck";
        monstro.rugir();

        jogador jogador = new jogador();
        jogador.nome = "zeca";
        jogador.nivel = 1;
        jogador.subirNivel();

        jogador jogador1 = new jogador();
        jogador1.nome = "ola";
        jogador1.subirNivel();

        inimigo inimigo = new inimigo();
        inimigo.forca = 70;
        inimigo.nome = "burro";
        inimigo.atacar();

        arma arma = new arma();
        arma.dano = 15.6;
        arma.nome = "funda";
        arma.usar();

        inventario inventario = new inventario();
        inventario.preencher();
        inventario.monstrarItens();

        personagem personagem = new personagem();
        personagem.vida = 80;
        personagem.nome = "julio";
        personagem.nivel = 4;
        personagem.status();

        lampada lampada = new lampada();
        lampada.lampadaAcessa();
        lampada.lampadaApagada();

        usuario user = new usuario();
        user.verificarSenha();

        pontuacao pontos = new pontuacao();
        pontos.aumentarPontuacao();
        pontos.aumentarPontuacao();
        pontos.aumentarPontuacao();

        heroi heroi = new heroi();
        heroi.nome = "ze";
        heroi.classe = "mago";
        heroi.lutar();

        heroi heroi1 = new heroi();
        heroi1.nome = "hombre";
        heroi1.classe = "guerreiro";
        heroi1.lutar();

        heroi heroi2 = new heroi();
        heroi2.nome = "zequinha";
        heroi2.classe = "cavaleiro";
        heroi2.lutar();

    }
}
