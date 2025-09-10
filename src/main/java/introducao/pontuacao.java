package introducao;

import javax.swing.*;

public class pontuacao {


    int pontos = 0;

    public void aumentarPontuacao() {
        int pontuacao = Integer.parseInt(JOptionPane.showInputDialog("quantos pontos subir ?"));

        pontos += pontuacao;

        System.out.println("sua pontuação é de : " + pontos);

    }
}
