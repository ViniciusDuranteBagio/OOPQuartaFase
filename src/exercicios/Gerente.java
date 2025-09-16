package exercicios;

class Gerente extends Funcionario {
    String departamento;

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Departamento: " + departamento);
    }
}
