package ExerciciosAula1;

import java.util.ArrayList;
import java.util.List;

class Inventario {
    private List<String> itens = new ArrayList<>();
    private static final int CAPACIDADE_MAXIMA = 5;

    public void adicionarItem(String item) {
        if (itens.size() < CAPACIDADE_MAXIMA) {
            itens.add(item);
            System.out.println("'" + item + "' foi adicionado ao inventário.");
        } else {
            System.out.println("Inventário cheio! Não é possível adicionar '" + item + "'.");
        }
    }

    public void mostrarItens() {
        System.out.println("\n--- Itens no Inventário ---");
        if (itens.isEmpty()) {
            System.out.println("O inventário está vazio.");
        } else {
            for (String item : itens) {
                System.out.println("- " + item);
            }
        }
        System.out.println("-------------------------");
    }
}
