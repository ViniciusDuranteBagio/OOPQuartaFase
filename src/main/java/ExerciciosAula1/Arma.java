package ExerciciosAula1;

class Arma {
    String nome;
    int dano;

    public void usar() {
        System.out.println("A arma " + this.nome + " foi usada para atacar causando " + this.dano + " de dano!");
    }
}