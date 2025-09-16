public class Exercicio9 {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro();
        guerreiro.nome = "Conan";
        guerreiro.nivel = 10;
        guerreiro.forca = 85;
        
        Mago mago = new Mago();
        mago.nome = "Merlin";
        mago.nivel = 12;
        mago.mana = 120;
        
        guerreiro.exibirInformacoes();
        System.out.println();
        mago.exibirInformacoes();
    }
}

