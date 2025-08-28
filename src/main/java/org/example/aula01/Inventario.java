package org.example.aula01;

import java.util.ArrayList;

public class Inventario {

    private ArrayList<String> itens = new ArrayList<>();

    public void adiconarItem(String item) {
        itens.add(item);
        System.out.println("Adicionando Item: " + item);
    }

    public void mostrarLista() {
        System.out.println("Itens do br.com.renan.poo.exemplos.Inventario");
        for (String item : itens) {
            System.out.println("- " + item);

        }
    }
}