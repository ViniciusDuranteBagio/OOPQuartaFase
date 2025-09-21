package Atividades.Aula1;

import javax.swing.*;

public class Monstro {
    public int vida;
    public String nome;

    public void rugir (){
        JOptionPane.showMessageDialog(null,"O mostro "
                + nome+ " rugiu, ele está com "
                + vida +" de vida");
    }
}
