package classe.src.Exercicio_Aula_4;

public class Loja extends Empresa{

    protected String tipodeproduto;

    public Loja(String cidade,String nome,String tipodeproduto){
        super(nome,cidade);
        this.tipodeproduto=tipodeproduto;
    }

    public void exibir(){
        System.out.println("Cidade: " + cidade);
        System.out.println("Nome; " + nome);
        System.out.println("Tipo: " + tipodeproduto);
    }

}
