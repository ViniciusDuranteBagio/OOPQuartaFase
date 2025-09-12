package Exercs;

import java.util.ArrayList;

public class Inventario {
        ArrayList<String> inventario;

        public Inventario() {
            inventario = new ArrayList<>();
        }

        void addItens (String item) {
            inventario.add(item);
        }

        void mostrarItens () {
            System.out.println("Itens: "+ inventario);
        }

}

