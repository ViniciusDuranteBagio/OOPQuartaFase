package ExerciciosAula1;

class Lampada {
    boolean acesa = false;

    public void ligar() {
        this.acesa = true;
        System.out.println("A lâmpada foi acesa!");
    }

    public void desligar() {
        this.acesa = false;
        System.out.println("A lâmpada foi apagada!");
    }
}
