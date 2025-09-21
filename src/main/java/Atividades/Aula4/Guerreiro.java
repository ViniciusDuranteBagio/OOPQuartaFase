package Atividades.Aula4;

class Guerreiro extends Personagem {
    int forca;

    Guerreiro(String nome, int nivel, int forca) {
        super(nome, nivel);
        this.forca = forca;
    }

    @Override
   public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Força: " + forca);
    }
}
