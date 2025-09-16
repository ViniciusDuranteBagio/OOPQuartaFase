package exercicios;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<String> itens = new ArrayList<>();

    public void adicionarItem(String item) {
        if(itens.size() < 5) {
            itens.add(item);
        }
    }

    public void mostrarItens() {
        System.out.println("Itens no inventário:");
        for(String i : itens) {
            System.out.println("- " + i);
        }
    }
}
