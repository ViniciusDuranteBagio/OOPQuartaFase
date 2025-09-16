package Exercicios_Aula1;

public class Inventario {

    String[] itens;
    int contador;

    public Inventario() {
        itens = new String[5];
        contador = 0;
    }

    public void adicionarItem(String item) {
        if (contador < itens.length) {
            itens[contador] = item;
            contador++;
            System.out.println("Item " + item + " adicionado ao inventário!");
        } else {
            System.out.println("O inventário está cheio! Não é possível adicionar mais itens");
        }
    }

    public void mostrarItens() {
        if (contador == 0) {
            System.out.println("O inventário está vazio!");
        } else {
            System.out.println("Itens no inventário:");
            for (int i = 0; i < contador; i++) {
                System.out.println(itens[i]);
            }
        }
    }
}
