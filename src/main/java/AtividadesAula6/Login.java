package AtividadesAula6;

import javax.swing.*;
import java.util.Objects;

public class Login {
    public static void main(String[] args) throws UsuarioNaoEncontradoException, SenhaIncorretaException {
        String[] usuarios = new String[5];

        usuarios[0] = "Maria";
        usuarios[1] = "Joao";
        usuarios[2] = "Ana";
        usuarios[3] = "Jose";
        usuarios[4] = "Pedro";

        String senha = "1234";

        String nomeInformado  = JOptionPane.showInputDialog(null, "Informe o nome do Usuário");
        String senhaInformada = JOptionPane.showInputDialog(null, "Informe a senha");

        boolean encontrou = false;

        for(int i = 0; i < usuarios.length; i++){
            if (Objects.equals(nomeInformado, usuarios[i])){
                encontrou = true;
            }
        }

        if (encontrou == false){
            throw new UsuarioNaoEncontradoException("Usuário não encontrado!");
        }

        if (!Objects.equals(senhaInformada, senha)){
            throw new SenhaIncorretaException("Senha incorreta!");
        }

        JOptionPane.showMessageDialog(null, "Login realizado!");
    }
}
