package introducao;

import javax.swing.*;

public class usuario {

    String nome;
    String senha = JOptionPane.showInputDialog("digite a senha");
    String senhaCorreta = "senha123";

    public void verificarSenha() {
        if (senha.equals(senhaCorreta)){
            System.out.println("senha correta!");
        }else {
            System.out.println("senha incorreta");
        }

    }
}
