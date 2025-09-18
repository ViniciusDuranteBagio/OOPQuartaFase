package ExerciciosAula1;

class Personagem {
    String nome;
    int vida;
    int nivel;

    public void mostrarStatus() {
        System.out.println("--- Status do Personagem ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Vida: " + this.vida);
        System.out.println("Nível: " + this.nivel);
        System.out.println("--------------------------");
    }
}
