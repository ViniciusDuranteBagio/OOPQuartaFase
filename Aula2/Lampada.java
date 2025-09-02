package Aula2;
/* Criando um sistema de energia
Crie uma classe Lampada com um atributo acesa (booleano).
Crie um metodo ligar() que imprime "A lâmpada foi acesa!".
Crie um metodo desligar() que imprime "A lâmpada foi apagada!".
Instancie uma lâmpada e ligue e desligue ela.  */

public class Lampada {
    boolean acesa;

    public Lampada(boolean acesa){
        this.acesa = acesa;
    }
    public void ligar(){
        acesa = true;
        System.out.println("A lâmpada foi acesa!");
    }
    public void desligar(){
        acesa = false;
        System.out.println("A lâmpada foi apagada!");
    }
}
