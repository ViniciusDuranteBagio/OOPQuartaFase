package classe.src.Exercicio_Aula_4;

public class Eletronico extends Produto{
    protected int GarantiaEmMeses;

    @Override
    public void ExibirDetalhes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + preco);
        System.out.println("Garantia: " + GarantiaEmMeses);

    }
}
