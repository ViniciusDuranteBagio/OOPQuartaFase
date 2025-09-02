package Aula2;

public class MainInventario {
    public static void main(String[] args) {
        Inventario inv = new Inventario();
        inv.adicionarItem("Poção de cura");
        inv.adicionarItem("Ervas Medicinais");
        inv.adicionarItem("Veneno");
        inv.adicionarItem("Adaga");
        inv.adicionarItem("Escudo");

        inv.mostrarItens();

        inv.adicionarItem("Ouro roubado");
    }
}
