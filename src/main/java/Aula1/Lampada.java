package Aula1;

public class Lampada {
    boolean lampada = true;

    public void acender(){
        lampada = true;
        System.out.println("A lampada foi acesa!");
    }
    public void apagar(){
        lampada = false;
        System.out.println("A lampada foi apagada!");
    }
}
