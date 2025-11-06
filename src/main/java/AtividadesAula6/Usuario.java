package AtividadesAula6;

import javax.swing.*;

public class Usuario {
    private String nome;

    public Usuario (String nome){
        this.nome = nome;
    }

    public static void main(String[] args) throws NomeInvalidoException{
        //String nomeInformado = JOptionPane.showInputDialog(null, "Informe o nome"); // não deu certo

        String nomeInformado = null;
        if (nomeInformado == " ") {
            throw new NomeInvalidoException("Nome não pode ser nulo!");
        }

        Usuario usuario = new Usuario(nomeInformado);
    }
}
