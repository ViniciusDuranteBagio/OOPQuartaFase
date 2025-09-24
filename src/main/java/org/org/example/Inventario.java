package org.org.example;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

    public List<String> itens = new ArrayList<>();

    public void adicionarItem(String item) {
        itens.add(item);
        System.out.println("Item '" + item + "' adicionado ao inventário!");
    }

    public void mostrarItens() {
        System.out.println("Itens no inventário:");
        for (int i = 0; i < itens.size(); i++) {
            System.out.println((i + 1) + ". " + itens.get(i));
        }
    }
} 