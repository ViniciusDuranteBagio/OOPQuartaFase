package exercicios;

class ContaPoupanca extends ContaBancaria2 {
    double taxaJuros;

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Taxa de Juros: " + taxaJuros + "%");
    }
}
