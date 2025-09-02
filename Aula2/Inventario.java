package Aula2;
/* Criando um sistema de inventário
Crie uma classe Inventario que pode armazenar 5 itens (uma lista).
Crie um metodo adicionarItem(String item) que adiciona um item ao inventário.
Crie um metodo mostrarItens() que imprime todos os itens do inventário.
Instancie um inventário e adicione três itens.  */

public class Inventario {
    String[] itens = new String[5];
    int quantia = 0;

    public void adicionarItem(String item){
        if(quantia < itens.length){
            itens[quantia] = item;
            quantia++;
        }else {
            System.out.println("Inventário cheio!");
        }
    }
    public void mostrarItens(){
        System.out.println("Itens no inventário: ");
        for(int i = 0; i < quantia; i++){
            System.out.println("- " + itens[i]);
        }
    }
}
