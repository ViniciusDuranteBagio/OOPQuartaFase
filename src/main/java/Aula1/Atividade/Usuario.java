package Aula1.Atividade;

import javax.swing.*;

public class Usuario {
    String nome;
    String senha;

    void verificarSenha(String senhaDigitada) {
        if(senhaDigitada == senha) {
            JOptionPane.showMessageDialog(null, "Senha correta!");
        }else {
            JOptionPane.showMessageDialog(null, "Senha incorreta!");

        }
    }

}
