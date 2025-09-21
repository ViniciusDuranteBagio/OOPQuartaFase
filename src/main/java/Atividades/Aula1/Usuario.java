package Atividades.Aula1;

import javax.swing.*;

public class Usuario {

    public String nome;
    String senha =  "123";
    public void verificarSenha(String senhaDigitada){
        if ((senhaDigitada.equals(senha))){
            JOptionPane.showMessageDialog(null, "Acesso concedido!");
        }else {
            JOptionPane.showMessageDialog(null, "Senha incorreta.");
        }

    }
}
