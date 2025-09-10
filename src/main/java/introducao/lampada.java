package introducao;

public class lampada {

    boolean acessa;

    public void lampadaAcessa () {
        acessa = true;
        System.out.println("lampada acessa");
    }

    public void lampadaApagada() {
        acessa = false;
        System.out.println("lampada apagada");
    }
}
