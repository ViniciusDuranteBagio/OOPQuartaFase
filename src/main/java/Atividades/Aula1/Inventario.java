package Atividades.Aula1;

import javax.swing.*;
import java.util.ArrayList;

public class Inventario {

    ArrayList <String> itens = new ArrayList<>();

    public void adicionarItem (String item){
        itens.add(item);
    }
    public void mostrarItems() {
        StringBuilder itensListados = new StringBuilder("Lista de Itens:\n");
        for (String um : itens) {
            itensListados.append(um).append("\n");
        }
        JOptionPane.showMessageDialog(null, itensListados.toString());
    }

}
