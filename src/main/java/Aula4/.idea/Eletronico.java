package Aula4;

public class Eletronico extends Produto{

    int garantiaEmMeses;

    @Override
    void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Garantia em meses: " + garantiaEmMeses);
    }

}
