package AtividadesAula6;

import javax.swing.*;

public class Pessoa {
    private int idade;

    public Pessoa(int idade) {
        this.idade = idade;
    }

    public static void main(String[] args) throws IdadeInvalidaException {

        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade"));
        if (idade < 0){
            throw new IdadeInvalidaException("Idade não pode ser negativa!");
        }

        Pessoa pessoa = new Pessoa(idade);
    }
}
