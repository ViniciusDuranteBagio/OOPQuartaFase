package Atividades.Aula1;

import javax.swing.*;

public class Jogador {

    public String nome;
    public int pontuacao;
    public int nivel;

    public void subrirNivel (){

        if (nome.equals("Jogador 1")){

            JOptionPane.showMessageDialog(null, "O jogador subiu de nível!" +
                    "\n Nome " + nome
                    + "\nPontuação " + pontuacao
                    + "\nNivel " + nivel + 1);
        } else {
            JOptionPane.showMessageDialog(null, "O jogador subiu de nível!" +
                    "\n Nome " + nome
                    + "\nPontuação " + pontuacao
                    + "\nNivel " + nivel);

        }

    }
}
