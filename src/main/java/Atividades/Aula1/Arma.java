package Atividades.Aula1;

import javax.swing.*;

public class Arma {
    public String nome;
    public double dano;

    public void usar (){
        JOptionPane.showMessageDialog(null, "A arma foi usada para atacar causando "+ dano + " de dano!");
    }
}
