package Aula1.Atividade;

public class Personagem {
   public String nome;
    public int vida;
    public int nivel;

    public void mostratStatus() {
        System.out.println("Status do personagem " + nome + "\nQuantidade de vida "+
                vida + "\nNível " + nivel);
    }

}
