package Aula8;

public class CarrinhoDeCompras {
    private String itens;

    public String adicionarItens(String itens) {
        this.itens = itens;
        return itens;
    }

    public String listaItens() {
        return itens;
    }
}
