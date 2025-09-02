package AulaHeranca;

public class Personagem {

    String nome;
    int nivel;

    public Personagem (String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

        public void exibirInformacoes() {
            System.out.println("Nome: " + nome);
            System.out.println("Nível: " + nivel);
        }

}
