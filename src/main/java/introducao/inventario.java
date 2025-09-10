package introducao;

import javax.swing.*;
import java.awt.*;

public class inventario {

    String[] lista = new String[5];

    public void preencher(){
        for (int i = 0; i < lista.length; i++){
            lista[i] = JOptionPane.showInputDialog("digite o item " + (i + 1));
        }
    }

    public void monstrarItens() {
       for (int i = 0; i < lista.length; i++){
           System.out.println( "o item " + (i + 1) + " : " + lista[i]);
       }
    }
}



