import javax.swing.*;

class Coelho extends Animal {

    public Coelho(String nome, int idade, String raca) {

        super(nome, idade, raca);
    }

    @Override
    public String escolherDoenca(){
        String[] opcoes = {"D1", "D2", "D3"};

        return (String) JOptionPane.showInputDialog(null, "Selecione a Doença do Gato: ", "Doença", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
    }
}