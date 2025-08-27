package classe.Exercicio_Aula_1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Inventario {

    String[] Lista = new String[5];
    List<String> lista = new ArrayList<>();

    String adicionarItem() {

        for (int i = 0; i < Lista.length; i++) {
           Lista[i] = JOptionPane.showInputDialog("Adicionar itens");

        }

        return Lista[4];
    }

    void MonstrarItens(){
        for (int i = 0; i < Lista.length; i++){
            System.out.println(Lista[i]);
        }

    }
}