package Atividades.Aula1;

import javax.swing.*;

public class Personagem {
    public int nivel;
    public double vida;
    public String nome;

    public void mostrarStatus(){
        JOptionPane.showMessageDialog(null,"Nome " + nome +
                "\n Vida " + vida +
                "\n Nivel " + nivel);

    }
}
