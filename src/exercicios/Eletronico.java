package exercicios;

class Eletronico extends Produto2 {
    int garantiaEmMeses;

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Garantia: " + garantiaEmMeses + " meses");
    }
}
