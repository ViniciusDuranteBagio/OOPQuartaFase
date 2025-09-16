package exercicios;

class ContaCorrente extends ContaBancaria2 {
    double taxaManutencao;

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Taxa de Manutenção: R$" + taxaManutencao);
    }
}
