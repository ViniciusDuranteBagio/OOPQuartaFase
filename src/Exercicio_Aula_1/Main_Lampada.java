package classe.src.Exercicio_Aula_1;

import javax.swing.*;

public class Main_Lampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();


        lampada.definir(Boolean.parseBoolean(JOptionPane.showInputDialog("A lampada esta ligada ou deslidada")));
        lampada.ligar();
        lampada.desligar();





    }
}
